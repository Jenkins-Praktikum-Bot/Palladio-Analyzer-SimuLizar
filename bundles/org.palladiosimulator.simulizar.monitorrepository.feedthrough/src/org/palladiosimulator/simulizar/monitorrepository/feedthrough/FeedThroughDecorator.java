package org.palladiosimulator.simulizar.monitorrepository.feedthrough;

import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.util.MetricSpecSwitch;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.calculator.RegisterCalculatorFactoryDecorator;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractProbeFrameworkListener;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;

/**
 * Registers PRM recorders that directly update measurements in the RuntimeMeasurement model with
 * the measurements from a fitting calculator.
 * @author stier
 *
 */
public class FeedThroughDecorator extends AbstractRecordingProbeFrameworkListenerDecorator {

	private static final EClass FEED_THROUGH_ECLASS = MonitorRepositoryPackage.Literals.FEED_THROUGH;
	
    private RegisterCalculatorFactoryDecorator calculatorFactory;
    private RuntimeMeasurementModel runtimeMeasurementModel;
	 
	@Override
	public void registerMeasurements() {
		super.registerMeasurements();
		
        this.getProbeFrameworkListener().getMeasurementSpecificationsForProcessingType(FEED_THROUGH_ECLASS).stream()
		.filter(MeasurementSpecification::isTriggersSelfAdaptations)
        .forEach(this::initFeedThroughMeasurements);
	}
	
    @Override
    public void setProbeFrameworkListener(final AbstractProbeFrameworkListener listener) {
        super.setProbeFrameworkListener(listener);
        this.calculatorFactory = RegisterCalculatorFactoryDecorator.class
                .cast(getProbeFrameworkListener().getCalculatorFactory());
        this.runtimeMeasurementModel = getProbeFrameworkListener().getRuntimeMeasurementModel();
    }
	
	private void initFeedThroughMeasurements(final MeasurementSpecification measurementSpecification) {
        MeasuringPoint measuringPoint = measurementSpecification.getMonitor().getMeasuringPoint();
        Optional<NumericalBaseMetricDescription> expectedMetric = GET_NUMERICAL_BASE_METRIC_SWITCH
                .doSwitch(measurementSpecification.getMetricDescription());	
        
        checkValidity(expectedMetric, measurementSpecification);
        
		Calculator correspondingBaseCalculator = getBaseCalculator(expectedMetric.get(),
                measuringPoint).<IllegalStateException> orElseThrow(() -> new IllegalStateException(
                		"Feed-through measurements cannot be initialized.\n" + "No '"
                                + expectedMetric.get().getName() + "' calculator available for: " + "MeasuringPoint '"
                                + measuringPoint.getStringRepresentation() + "'.\n" + "Affected Monitor: '"
                                + measurementSpecification.getMonitor().getEntityName() + "'\n"
                                + "Ensure that measurement calculator has been created and registered within "
                                + "the ProbeFrameworkListener class!"));
        
		correspondingBaseCalculator.addObserver(new FeedThroughRecorder(expectedMetric.get(), runtimeMeasurementModel, 
				measurementSpecification, measuringPoint));
	}
	
    private static final MetricSpecSwitch<Optional<NumericalBaseMetricDescription>> GET_NUMERICAL_BASE_METRIC_SWITCH = new MetricSpecSwitch<Optional<NumericalBaseMetricDescription>>() {

        @Override
        public Optional<NumericalBaseMetricDescription> caseNumericalBaseMetricDescription(
                final NumericalBaseMetricDescription numericalBaseMetricDescription) {
            return Optional.of(numericalBaseMetricDescription);
        }

        @Override
        public Optional<NumericalBaseMetricDescription> defaultCase(final EObject eObject) {
            return Optional.empty();
        }
    };
    
    private static void checkValidity(final Optional<NumericalBaseMetricDescription> expectedMetric,
            final MeasurementSpecification spec) {
        if (!expectedMetric.isPresent()) {
            throw new IllegalStateException("Cannot initialize measurements aggregation defined by "
                    + spec.eClass().getName() + " with id '" + spec.getId() + "':\nSo far, only "
                    + MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION.getName()
                    + "s are supported for fixed and variable size aggregation!");
        }
    }
    
    private Optional<Calculator> getBaseCalculator(final NumericalBaseMetricDescription metric,
            final MeasuringPoint measuringPoint) {
        Calculator baseCalculator = this.calculatorFactory
                .getCalculatorByMeasuringPointAndMetricDescription(measuringPoint, metric);
        if (baseCalculator == null) {
            return this.calculatorFactory.getCalculatorsForMeasuringPoint(measuringPoint)
                    .stream().filter(calc -> MetricDescriptionUtility
                            .isBaseMetricDescriptionSubsumedByMetricDescription(metric, calc.getMetricDesciption()))
                    .findAny();

        }
        return Optional.of(baseCalculator);
    }
}
