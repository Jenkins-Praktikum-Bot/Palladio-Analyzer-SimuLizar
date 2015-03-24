/**
 */
package dlim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dlim.DlimFactory
 * @model kind="package"
 * @generated
 */
public interface DlimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dlim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/dlimm/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dlim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DlimPackage eINSTANCE = dlim.impl.DlimPackageImpl.init();

	/**
	 * The meta object id for the '{@link dlim.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.FunctionImpl
	 * @see dlim.impl.DlimPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMBINE = 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.SequenceImpl
	 * @see dlim.impl.DlimPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminate After Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TERMINATE_AFTER_TIME = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Clock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REFERENCE_CLOCK = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Function Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE_FUNCTION_CONTAINERS = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Terminate After Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TERMINATE_AFTER_LOOPS = FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>First Iteration Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FIRST_ITERATION_START = FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First Iteration End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FIRST_ITERATION_END = FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loop Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LOOP_DURATION = FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Final Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FINAL_DURATION = FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Duration Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___DURATION_DEFINED__DIAGNOSTICCHAIN_MAP = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dlim.impl.CombinatorImpl <em>Combinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.CombinatorImpl
	 * @see dlim.impl.DlimPackageImpl#getCombinator()
	 * @generated
	 */
	int COMBINATOR = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Combinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.TimeDependentFunctionContainerImpl <em>Time Dependent Function Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.TimeDependentFunctionContainerImpl
	 * @see dlim.impl.DlimPackageImpl#getTimeDependentFunctionContainer()
	 * @generated
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__DURATION = 1;

	/**
	 * The feature id for the '<em><b>First Iteration Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__FIRST_ITERATION_START = 2;

	/**
	 * The feature id for the '<em><b>First Iteration End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__FIRST_ITERATION_END = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Point Of Reference Clock Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__POINT_OF_REFERENCE_CLOCK_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Point Of Reference Clock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER__POINT_OF_REFERENCE_CLOCK_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Time Dependent Function Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Duration Greater Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER___DURATION_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Reference Clock In Tree Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER___REFERENCE_CLOCK_IN_TREE_NODE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Time Dependent Function Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_FUNCTION_CONTAINER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dlim.impl.SeasonalImpl <em>Seasonal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.SeasonalImpl
	 * @see dlim.impl.DlimPackageImpl#getSeasonal()
	 * @generated
	 */
	int SEASONAL = 4;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL__COMBINE = FUNCTION__COMBINE;

	/**
	 * The number of structural features of the '<em>Seasonal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Seasonal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASONAL_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.NoiseImpl <em>Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.NoiseImpl
	 * @see dlim.impl.DlimPackageImpl#getNoise()
	 * @generated
	 */
	int NOISE = 5;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE__COMBINE = FUNCTION__COMBINE;

	/**
	 * The number of structural features of the '<em>Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.UniformNoiseImpl <em>Uniform Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.UniformNoiseImpl
	 * @see dlim.impl.DlimPackageImpl#getUniformNoise()
	 * @generated
	 */
	int UNIFORM_NOISE = 6;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_NOISE__COMBINE = NOISE__COMBINE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_NOISE__MIN = NOISE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_NOISE__MAX = NOISE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniform Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_NOISE_FEATURE_COUNT = NOISE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uniform Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_NOISE_OPERATION_COUNT = NOISE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.NormalNoiseImpl <em>Normal Noise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.NormalNoiseImpl
	 * @see dlim.impl.DlimPackageImpl#getNormalNoise()
	 * @generated
	 */
	int NORMAL_NOISE = 7;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NOISE__COMBINE = NOISE__COMBINE;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NOISE__MEAN = NOISE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NOISE__STANDARD_DEVIATION = NOISE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NOISE_FEATURE_COUNT = NOISE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal Noise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_NOISE_OPERATION_COUNT = NOISE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.BurstImpl <em>Burst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.BurstImpl
	 * @see dlim.impl.DlimPackageImpl#getBurst()
	 * @generated
	 */
	int BURST = 8;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__PEAK = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__BASE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Peak Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__PEAK_TIME = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Burst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Peak Time Greater Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Burst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dlim.impl.TrendImpl <em>Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.TrendImpl
	 * @see dlim.impl.DlimPackageImpl#getTrend()
	 * @generated
	 */
	int TREND = 9;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Function Output At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND__FUNCTION_OUTPUT_AT_START = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Output At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND__FUNCTION_OUTPUT_AT_END = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ConstantImpl
	 * @see dlim.impl.DlimPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 10;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__COMBINE = SEASONAL__COMBINE;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__CONSTANT = SEASONAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = SEASONAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = SEASONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.SinImpl <em>Sin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.SinImpl
	 * @see dlim.impl.DlimPackageImpl#getSin()
	 * @generated
	 */
	int SIN = 11;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__COMBINE = SEASONAL__COMBINE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__MIN = SEASONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__MAX = SEASONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__PERIOD = SEASONAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN__PHASE = SEASONAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_FEATURE_COUNT = SEASONAL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_OPERATION_COUNT = SEASONAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ExponentialIncreaseAndDeclineImpl <em>Exponential Increase And Decline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ExponentialIncreaseAndDeclineImpl
	 * @see dlim.impl.DlimPackageImpl#getExponentialIncreaseAndDecline()
	 * @generated
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE = 12;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE__COMBINE = BURST__COMBINE;

	/**
	 * The feature id for the '<em><b>Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE__PEAK = BURST__PEAK;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE__BASE = BURST__BASE;

	/**
	 * The feature id for the '<em><b>Peak Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE__PEAK_TIME = BURST__PEAK_TIME;

	/**
	 * The number of structural features of the '<em>Exponential Increase And Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE_FEATURE_COUNT = BURST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Peak Time Greater Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = BURST___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Exponential Increase And Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_AND_DECLINE_OPERATION_COUNT = BURST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ExponentialIncreaseLogarithmicDeclineImpl <em>Exponential Increase Logarithmic Decline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ExponentialIncreaseLogarithmicDeclineImpl
	 * @see dlim.impl.DlimPackageImpl#getExponentialIncreaseLogarithmicDecline()
	 * @generated
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE = 13;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__COMBINE = BURST__COMBINE;

	/**
	 * The feature id for the '<em><b>Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__PEAK = BURST__PEAK;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__BASE = BURST__BASE;

	/**
	 * The feature id for the '<em><b>Peak Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__PEAK_TIME = BURST__PEAK_TIME;

	/**
	 * The feature id for the '<em><b>Logarithmic Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__LOGARITHMIC_ORDER = BURST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Increase Logarithmic Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE_FEATURE_COUNT = BURST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Peak Time Greater Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = BURST___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Exponential Increase Logarithmic Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE_OPERATION_COUNT = BURST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.LinearIncreaseAndDeclineImpl <em>Linear Increase And Decline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.LinearIncreaseAndDeclineImpl
	 * @see dlim.impl.DlimPackageImpl#getLinearIncreaseAndDecline()
	 * @generated
	 */
	int LINEAR_INCREASE_AND_DECLINE = 14;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE__COMBINE = BURST__COMBINE;

	/**
	 * The feature id for the '<em><b>Peak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE__PEAK = BURST__PEAK;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE__BASE = BURST__BASE;

	/**
	 * The feature id for the '<em><b>Peak Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE__PEAK_TIME = BURST__PEAK_TIME;

	/**
	 * The number of structural features of the '<em>Linear Increase And Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE_FEATURE_COUNT = BURST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Peak Time Greater Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = BURST___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Linear Increase And Decline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_INCREASE_AND_DECLINE_OPERATION_COUNT = BURST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.AbsoluteSinImpl <em>Absolute Sin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.AbsoluteSinImpl
	 * @see dlim.impl.DlimPackageImpl#getAbsoluteSin()
	 * @generated
	 */
	int ABSOLUTE_SIN = 15;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN__COMBINE = SIN__COMBINE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN__MIN = SIN__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN__MAX = SIN__MAX;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN__PERIOD = SIN__PERIOD;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN__PHASE = SIN__PHASE;

	/**
	 * The number of structural features of the '<em>Absolute Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN_FEATURE_COUNT = SIN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absolute Sin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_SIN_OPERATION_COUNT = SIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.LinearTrendImpl <em>Linear Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.LinearTrendImpl
	 * @see dlim.impl.DlimPackageImpl#getLinearTrend()
	 * @generated
	 */
	int LINEAR_TREND = 16;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_TREND__COMBINE = TREND__COMBINE;

	/**
	 * The feature id for the '<em><b>Function Output At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_TREND__FUNCTION_OUTPUT_AT_START = TREND__FUNCTION_OUTPUT_AT_START;

	/**
	 * The feature id for the '<em><b>Function Output At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_TREND__FUNCTION_OUTPUT_AT_END = TREND__FUNCTION_OUTPUT_AT_END;

	/**
	 * The number of structural features of the '<em>Linear Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_TREND_FEATURE_COUNT = TREND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_TREND_OPERATION_COUNT = TREND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ExponentialTrendImpl <em>Exponential Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ExponentialTrendImpl
	 * @see dlim.impl.DlimPackageImpl#getExponentialTrend()
	 * @generated
	 */
	int EXPONENTIAL_TREND = 17;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TREND__COMBINE = TREND__COMBINE;

	/**
	 * The feature id for the '<em><b>Function Output At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TREND__FUNCTION_OUTPUT_AT_START = TREND__FUNCTION_OUTPUT_AT_START;

	/**
	 * The feature id for the '<em><b>Function Output At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TREND__FUNCTION_OUTPUT_AT_END = TREND__FUNCTION_OUTPUT_AT_END;

	/**
	 * The number of structural features of the '<em>Exponential Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TREND_FEATURE_COUNT = TREND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exponential Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_TREND_OPERATION_COUNT = TREND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.LogarithmicTrendImpl <em>Logarithmic Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.LogarithmicTrendImpl
	 * @see dlim.impl.DlimPackageImpl#getLogarithmicTrend()
	 * @generated
	 */
	int LOGARITHMIC_TREND = 18;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND__COMBINE = TREND__COMBINE;

	/**
	 * The feature id for the '<em><b>Function Output At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND__FUNCTION_OUTPUT_AT_START = TREND__FUNCTION_OUTPUT_AT_START;

	/**
	 * The feature id for the '<em><b>Function Output At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND__FUNCTION_OUTPUT_AT_END = TREND__FUNCTION_OUTPUT_AT_END;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND__ORDER = TREND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logarithmic Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND_FEATURE_COUNT = TREND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logarithmic Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGARITHMIC_TREND_OPERATION_COUNT = TREND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.SinTrendImpl <em>Sin Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.SinTrendImpl
	 * @see dlim.impl.DlimPackageImpl#getSinTrend()
	 * @generated
	 */
	int SIN_TREND = 19;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_TREND__COMBINE = TREND__COMBINE;

	/**
	 * The feature id for the '<em><b>Function Output At Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_TREND__FUNCTION_OUTPUT_AT_START = TREND__FUNCTION_OUTPUT_AT_START;

	/**
	 * The feature id for the '<em><b>Function Output At End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_TREND__FUNCTION_OUTPUT_AT_END = TREND__FUNCTION_OUTPUT_AT_END;

	/**
	 * The number of structural features of the '<em>Sin Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_TREND_FEATURE_COUNT = TREND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sin Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIN_TREND_OPERATION_COUNT = TREND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ReferenceClockObjectImpl <em>Reference Clock Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ReferenceClockObjectImpl
	 * @see dlim.impl.DlimPackageImpl#getReferenceClockObject()
	 * @generated
	 */
	int REFERENCE_CLOCK_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CLOCK_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Loop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CLOCK_OBJECT__LOOP_TIME = 1;

	/**
	 * The feature id for the '<em><b>Seq Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CLOCK_OBJECT__SEQ_TIME = 2;

	/**
	 * The number of structural features of the '<em>Reference Clock Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CLOCK_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference Clock Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CLOCK_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.ArrivalRatesFromFileImpl <em>Arrival Rates From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.ArrivalRatesFromFileImpl
	 * @see dlim.impl.DlimPackageImpl#getArrivalRatesFromFile()
	 * @generated
	 */
	int ARRIVAL_RATES_FROM_FILE = 21;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE__FILE_PATH = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arrival Rates From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Arrival Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE___GET_ARRIVAL_RATE__DOUBLE = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE___READ_FILE = FUNCTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arrival Rates From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_RATES_FROM_FILE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link dlim.impl.UnivariateFunctionImpl <em>Univariate Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.UnivariateFunctionImpl
	 * @see dlim.impl.DlimPackageImpl#getUnivariateFunction()
	 * @generated
	 */
	int UNIVARIATE_FUNCTION = 23;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_FUNCTION__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_FUNCTION__FUNCTION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Univariate Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Univariate Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVARIATE_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.AbsoluteValueFunctionImpl <em>Absolute Value Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.AbsoluteValueFunctionImpl
	 * @see dlim.impl.DlimPackageImpl#getAbsoluteValueFunction()
	 * @generated
	 */
	int ABSOLUTE_VALUE_FUNCTION = 22;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VALUE_FUNCTION__COMBINE = UNIVARIATE_FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VALUE_FUNCTION__FUNCTION = UNIVARIATE_FUNCTION__FUNCTION;

	/**
	 * The number of structural features of the '<em>Absolute Value Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VALUE_FUNCTION_FEATURE_COUNT = UNIVARIATE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absolute Value Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_VALUE_FUNCTION_OPERATION_COUNT = UNIVARIATE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.PolynomialImpl <em>Polynomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.PolynomialImpl
	 * @see dlim.impl.DlimPackageImpl#getPolynomial()
	 * @generated
	 */
	int POLYNOMIAL = 24;

	/**
	 * The feature id for the '<em><b>Combine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__COMBINE = FUNCTION__COMBINE;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__FACTORS = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polynomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polynomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dlim.impl.PolynomialFactorImpl <em>Polynomial Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.PolynomialFactorImpl
	 * @see dlim.impl.DlimPackageImpl#getPolynomialFactor()
	 * @generated
	 */
	int POLYNOMIAL_FACTOR = 25;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FACTOR__FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FACTOR__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Polynomial Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Polynomial Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.TimeDependentWorkFunctionContainerImpl <em>Time Dependent Work Function Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.TimeDependentWorkFunctionContainerImpl
	 * @see dlim.impl.DlimPackageImpl#getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER = 26;

	/**
	 * The feature id for the '<em><b>Work</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK = 0;

	/**
	 * The feature id for the '<em><b>Work Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_START_TIME = 1;

	/**
	 * The feature id for the '<em><b>Work Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Time Synchronization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__TIME_SYNCHRONIZATION = 3;

	/**
	 * The feature id for the '<em><b>Mutual Load Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__MUTUAL_LOAD_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Load Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__LOAD_SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__NAME = 6;

	/**
	 * The feature id for the '<em><b>Parameter Charaterization Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__PARAMETER_CHARATERIZATION_CONTAINERS = 7;

	/**
	 * The feature id for the '<em><b>Work Load Sequence Work Function Containers</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_LOAD_SEQUENCE_WORK_FUNCTION_CONTAINERS = 8;

	/**
	 * The number of structural features of the '<em>Time Dependent Work Function Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Time Dependent Work Function Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DEPENDENT_WORK_FUNCTION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.WorkLoadSequenceImpl <em>Work Load Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.WorkLoadSequenceImpl
	 * @see dlim.impl.DlimPackageImpl#getWorkLoadSequence()
	 * @generated
	 */
	int WORK_LOAD_SEQUENCE = 27;

	/**
	 * The feature id for the '<em><b>Work Function Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOAD_SEQUENCE__WORK_FUNCTION_CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOAD_SEQUENCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Work Load Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOAD_SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Work Load Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_LOAD_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.impl.InputParameterCharacterizationContainerImpl <em>Input Parameter Characterization Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.impl.InputParameterCharacterizationContainerImpl
	 * @see dlim.impl.DlimPackageImpl#getInputParameterCharacterizationContainer()
	 * @generated
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER = 28;

	/**
	 * The feature id for the '<em><b>Variable Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__VARIABLE_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>TDWFC Parameter Characterization Containers</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__TDWFC_PARAMETER_CHARACTERIZATION_CONTAINERS = 2;

	/**
	 * The number of structural features of the '<em>Input Parameter Characterization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input Parameter Characterization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_CHARACTERIZATION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dlim.ClockType <em>Clock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.ClockType
	 * @see dlim.impl.DlimPackageImpl#getClockType()
	 * @generated
	 */
	int CLOCK_TYPE = 29;

	/**
	 * The meta object id for the '{@link dlim.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dlim.Operator
	 * @see dlim.impl.DlimPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 30;


	/**
	 * Returns the meta object for class '{@link dlim.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see dlim.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dlim.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getTerminateAfterTime <em>Terminate After Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminate After Time</em>'.
	 * @see dlim.Sequence#getTerminateAfterTime()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_TerminateAfterTime();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.Sequence#getReferenceClock <em>Reference Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Clock</em>'.
	 * @see dlim.Sequence#getReferenceClock()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_ReferenceClock();

	/**
	 * Returns the meta object for the containment reference list '{@link dlim.Sequence#getSequenceFunctionContainers <em>Sequence Function Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Function Containers</em>'.
	 * @see dlim.Sequence#getSequenceFunctionContainers()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_SequenceFunctionContainers();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getTerminateAfterLoops <em>Terminate After Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminate After Loops</em>'.
	 * @see dlim.Sequence#getTerminateAfterLoops()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_TerminateAfterLoops();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getFirstIterationStart <em>First Iteration Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Iteration Start</em>'.
	 * @see dlim.Sequence#getFirstIterationStart()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_FirstIterationStart();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getFirstIterationEnd <em>First Iteration End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Iteration End</em>'.
	 * @see dlim.Sequence#getFirstIterationEnd()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_FirstIterationEnd();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getLoopDuration <em>Loop Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Duration</em>'.
	 * @see dlim.Sequence#getLoopDuration()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_LoopDuration();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sequence#getFinalDuration <em>Final Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Duration</em>'.
	 * @see dlim.Sequence#getFinalDuration()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_FinalDuration();

	/**
	 * Returns the meta object for the '{@link dlim.Sequence#durationDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duration Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duration Defined</em>' operation.
	 * @see dlim.Sequence#durationDefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSequence__DurationDefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dlim.Combinator <em>Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combinator</em>'.
	 * @see dlim.Combinator
	 * @generated
	 */
	EClass getCombinator();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Combinator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see dlim.Combinator#getOperator()
	 * @see #getCombinator()
	 * @generated
	 */
	EAttribute getCombinator_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.Combinator#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see dlim.Combinator#getFunction()
	 * @see #getCombinator()
	 * @generated
	 */
	EReference getCombinator_Function();

	/**
	 * Returns the meta object for class '{@link dlim.TimeDependentFunctionContainer <em>Time Dependent Function Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Dependent Function Container</em>'.
	 * @see dlim.TimeDependentFunctionContainer
	 * @generated
	 */
	EClass getTimeDependentFunctionContainer();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentFunctionContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getName()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentFunctionContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentFunctionContainer#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getDuration()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentFunctionContainer_Duration();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentFunctionContainer#getFirstIterationStart <em>First Iteration Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Iteration Start</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getFirstIterationStart()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentFunctionContainer_FirstIterationStart();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentFunctionContainer#getFirstIterationEnd <em>First Iteration End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Iteration End</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getFirstIterationEnd()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentFunctionContainer_FirstIterationEnd();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.TimeDependentFunctionContainer#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getFunction()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentFunctionContainer_Function();

	/**
	 * Returns the meta object for the reference '{@link dlim.TimeDependentFunctionContainer#getPointOfReferenceClockObject <em>Point Of Reference Clock Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Of Reference Clock Object</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getPointOfReferenceClockObject()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentFunctionContainer_PointOfReferenceClockObject();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentFunctionContainer#getPointOfReferenceClockType <em>Point Of Reference Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Of Reference Clock Type</em>'.
	 * @see dlim.TimeDependentFunctionContainer#getPointOfReferenceClockType()
	 * @see #getTimeDependentFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentFunctionContainer_PointOfReferenceClockType();

	/**
	 * Returns the meta object for the '{@link dlim.TimeDependentFunctionContainer#durationGreaterZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Duration Greater Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Duration Greater Zero</em>' operation.
	 * @see dlim.TimeDependentFunctionContainer#durationGreaterZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeDependentFunctionContainer__DurationGreaterZero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dlim.TimeDependentFunctionContainer#referenceClockInTreeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reference Clock In Tree Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reference Clock In Tree Node</em>' operation.
	 * @see dlim.TimeDependentFunctionContainer#referenceClockInTreeNode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeDependentFunctionContainer__ReferenceClockInTreeNode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dlim.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see dlim.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link dlim.Function#getCombine <em>Combine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combine</em>'.
	 * @see dlim.Function#getCombine()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Combine();

	/**
	 * Returns the meta object for class '{@link dlim.Seasonal <em>Seasonal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seasonal</em>'.
	 * @see dlim.Seasonal
	 * @generated
	 */
	EClass getSeasonal();

	/**
	 * Returns the meta object for class '{@link dlim.Noise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noise</em>'.
	 * @see dlim.Noise
	 * @generated
	 */
	EClass getNoise();

	/**
	 * Returns the meta object for class '{@link dlim.UniformNoise <em>Uniform Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Noise</em>'.
	 * @see dlim.UniformNoise
	 * @generated
	 */
	EClass getUniformNoise();

	/**
	 * Returns the meta object for the attribute '{@link dlim.UniformNoise#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see dlim.UniformNoise#getMin()
	 * @see #getUniformNoise()
	 * @generated
	 */
	EAttribute getUniformNoise_Min();

	/**
	 * Returns the meta object for the attribute '{@link dlim.UniformNoise#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see dlim.UniformNoise#getMax()
	 * @see #getUniformNoise()
	 * @generated
	 */
	EAttribute getUniformNoise_Max();

	/**
	 * Returns the meta object for class '{@link dlim.NormalNoise <em>Normal Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Noise</em>'.
	 * @see dlim.NormalNoise
	 * @generated
	 */
	EClass getNormalNoise();

	/**
	 * Returns the meta object for the attribute '{@link dlim.NormalNoise#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see dlim.NormalNoise#getMean()
	 * @see #getNormalNoise()
	 * @generated
	 */
	EAttribute getNormalNoise_Mean();

	/**
	 * Returns the meta object for the attribute '{@link dlim.NormalNoise#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see dlim.NormalNoise#getStandardDeviation()
	 * @see #getNormalNoise()
	 * @generated
	 */
	EAttribute getNormalNoise_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link dlim.Burst <em>Burst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Burst</em>'.
	 * @see dlim.Burst
	 * @generated
	 */
	EClass getBurst();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Burst#getPeak <em>Peak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak</em>'.
	 * @see dlim.Burst#getPeak()
	 * @see #getBurst()
	 * @generated
	 */
	EAttribute getBurst_Peak();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Burst#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see dlim.Burst#getBase()
	 * @see #getBurst()
	 * @generated
	 */
	EAttribute getBurst_Base();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Burst#getPeakTime <em>Peak Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Time</em>'.
	 * @see dlim.Burst#getPeakTime()
	 * @see #getBurst()
	 * @generated
	 */
	EAttribute getBurst_PeakTime();

	/**
	 * Returns the meta object for the '{@link dlim.Burst#peakTimeGreaterZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Peak Time Greater Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Peak Time Greater Zero</em>' operation.
	 * @see dlim.Burst#peakTimeGreaterZero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBurst__PeakTimeGreaterZero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dlim.Trend <em>Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trend</em>'.
	 * @see dlim.Trend
	 * @generated
	 */
	EClass getTrend();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Trend#getFunctionOutputAtStart <em>Function Output At Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Output At Start</em>'.
	 * @see dlim.Trend#getFunctionOutputAtStart()
	 * @see #getTrend()
	 * @generated
	 */
	EAttribute getTrend_FunctionOutputAtStart();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Trend#getFunctionOutputAtEnd <em>Function Output At End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Output At End</em>'.
	 * @see dlim.Trend#getFunctionOutputAtEnd()
	 * @see #getTrend()
	 * @generated
	 */
	EAttribute getTrend_FunctionOutputAtEnd();

	/**
	 * Returns the meta object for class '{@link dlim.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see dlim.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Constant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see dlim.Constant#getConstant()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Constant();

	/**
	 * Returns the meta object for class '{@link dlim.Sin <em>Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sin</em>'.
	 * @see dlim.Sin
	 * @generated
	 */
	EClass getSin();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sin#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see dlim.Sin#getMin()
	 * @see #getSin()
	 * @generated
	 */
	EAttribute getSin_Min();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sin#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see dlim.Sin#getMax()
	 * @see #getSin()
	 * @generated
	 */
	EAttribute getSin_Max();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sin#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see dlim.Sin#getPeriod()
	 * @see #getSin()
	 * @generated
	 */
	EAttribute getSin_Period();

	/**
	 * Returns the meta object for the attribute '{@link dlim.Sin#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see dlim.Sin#getPhase()
	 * @see #getSin()
	 * @generated
	 */
	EAttribute getSin_Phase();

	/**
	 * Returns the meta object for class '{@link dlim.ExponentialIncreaseAndDecline <em>Exponential Increase And Decline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Increase And Decline</em>'.
	 * @see dlim.ExponentialIncreaseAndDecline
	 * @generated
	 */
	EClass getExponentialIncreaseAndDecline();

	/**
	 * Returns the meta object for class '{@link dlim.ExponentialIncreaseLogarithmicDecline <em>Exponential Increase Logarithmic Decline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Increase Logarithmic Decline</em>'.
	 * @see dlim.ExponentialIncreaseLogarithmicDecline
	 * @generated
	 */
	EClass getExponentialIncreaseLogarithmicDecline();

	/**
	 * Returns the meta object for the attribute '{@link dlim.ExponentialIncreaseLogarithmicDecline#getLogarithmicOrder <em>Logarithmic Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logarithmic Order</em>'.
	 * @see dlim.ExponentialIncreaseLogarithmicDecline#getLogarithmicOrder()
	 * @see #getExponentialIncreaseLogarithmicDecline()
	 * @generated
	 */
	EAttribute getExponentialIncreaseLogarithmicDecline_LogarithmicOrder();

	/**
	 * Returns the meta object for class '{@link dlim.LinearIncreaseAndDecline <em>Linear Increase And Decline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Increase And Decline</em>'.
	 * @see dlim.LinearIncreaseAndDecline
	 * @generated
	 */
	EClass getLinearIncreaseAndDecline();

	/**
	 * Returns the meta object for class '{@link dlim.AbsoluteSin <em>Absolute Sin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Sin</em>'.
	 * @see dlim.AbsoluteSin
	 * @generated
	 */
	EClass getAbsoluteSin();

	/**
	 * Returns the meta object for class '{@link dlim.LinearTrend <em>Linear Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Trend</em>'.
	 * @see dlim.LinearTrend
	 * @generated
	 */
	EClass getLinearTrend();

	/**
	 * Returns the meta object for class '{@link dlim.ExponentialTrend <em>Exponential Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Trend</em>'.
	 * @see dlim.ExponentialTrend
	 * @generated
	 */
	EClass getExponentialTrend();

	/**
	 * Returns the meta object for class '{@link dlim.LogarithmicTrend <em>Logarithmic Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logarithmic Trend</em>'.
	 * @see dlim.LogarithmicTrend
	 * @generated
	 */
	EClass getLogarithmicTrend();

	/**
	 * Returns the meta object for the attribute '{@link dlim.LogarithmicTrend#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see dlim.LogarithmicTrend#getOrder()
	 * @see #getLogarithmicTrend()
	 * @generated
	 */
	EAttribute getLogarithmicTrend_Order();

	/**
	 * Returns the meta object for class '{@link dlim.SinTrend <em>Sin Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sin Trend</em>'.
	 * @see dlim.SinTrend
	 * @generated
	 */
	EClass getSinTrend();

	/**
	 * Returns the meta object for class '{@link dlim.ReferenceClockObject <em>Reference Clock Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Clock Object</em>'.
	 * @see dlim.ReferenceClockObject
	 * @generated
	 */
	EClass getReferenceClockObject();

	/**
	 * Returns the meta object for the attribute '{@link dlim.ReferenceClockObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dlim.ReferenceClockObject#getName()
	 * @see #getReferenceClockObject()
	 * @generated
	 */
	EAttribute getReferenceClockObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link dlim.ReferenceClockObject#getLoopTime <em>Loop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Time</em>'.
	 * @see dlim.ReferenceClockObject#getLoopTime()
	 * @see #getReferenceClockObject()
	 * @generated
	 */
	EAttribute getReferenceClockObject_LoopTime();

	/**
	 * Returns the meta object for the attribute '{@link dlim.ReferenceClockObject#getSeqTime <em>Seq Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Time</em>'.
	 * @see dlim.ReferenceClockObject#getSeqTime()
	 * @see #getReferenceClockObject()
	 * @generated
	 */
	EAttribute getReferenceClockObject_SeqTime();

	/**
	 * Returns the meta object for class '{@link dlim.ArrivalRatesFromFile <em>Arrival Rates From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Rates From File</em>'.
	 * @see dlim.ArrivalRatesFromFile
	 * @generated
	 */
	EClass getArrivalRatesFromFile();

	/**
	 * Returns the meta object for the attribute '{@link dlim.ArrivalRatesFromFile#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see dlim.ArrivalRatesFromFile#getFilePath()
	 * @see #getArrivalRatesFromFile()
	 * @generated
	 */
	EAttribute getArrivalRatesFromFile_FilePath();

	/**
	 * Returns the meta object for the '{@link dlim.ArrivalRatesFromFile#getArrivalRate(double) <em>Get Arrival Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Arrival Rate</em>' operation.
	 * @see dlim.ArrivalRatesFromFile#getArrivalRate(double)
	 * @generated
	 */
	EOperation getArrivalRatesFromFile__GetArrivalRate__double();

	/**
	 * Returns the meta object for the '{@link dlim.ArrivalRatesFromFile#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see dlim.ArrivalRatesFromFile#readFile()
	 * @generated
	 */
	EOperation getArrivalRatesFromFile__ReadFile();

	/**
	 * Returns the meta object for class '{@link dlim.AbsoluteValueFunction <em>Absolute Value Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Value Function</em>'.
	 * @see dlim.AbsoluteValueFunction
	 * @generated
	 */
	EClass getAbsoluteValueFunction();

	/**
	 * Returns the meta object for class '{@link dlim.UnivariateFunction <em>Univariate Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Univariate Function</em>'.
	 * @see dlim.UnivariateFunction
	 * @generated
	 */
	EClass getUnivariateFunction();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.UnivariateFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see dlim.UnivariateFunction#getFunction()
	 * @see #getUnivariateFunction()
	 * @generated
	 */
	EReference getUnivariateFunction_Function();

	/**
	 * Returns the meta object for class '{@link dlim.Polynomial <em>Polynomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial</em>'.
	 * @see dlim.Polynomial
	 * @generated
	 */
	EClass getPolynomial();

	/**
	 * Returns the meta object for the containment reference list '{@link dlim.Polynomial#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see dlim.Polynomial#getFactors()
	 * @see #getPolynomial()
	 * @generated
	 */
	EReference getPolynomial_Factors();

	/**
	 * Returns the meta object for class '{@link dlim.PolynomialFactor <em>Polynomial Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial Factor</em>'.
	 * @see dlim.PolynomialFactor
	 * @generated
	 */
	EClass getPolynomialFactor();

	/**
	 * Returns the meta object for the attribute '{@link dlim.PolynomialFactor#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see dlim.PolynomialFactor#getFactor()
	 * @see #getPolynomialFactor()
	 * @generated
	 */
	EAttribute getPolynomialFactor_Factor();

	/**
	 * Returns the meta object for the attribute '{@link dlim.PolynomialFactor#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see dlim.PolynomialFactor#getOffset()
	 * @see #getPolynomialFactor()
	 * @generated
	 */
	EAttribute getPolynomialFactor_Offset();

	/**
	 * Returns the meta object for class '{@link dlim.TimeDependentWorkFunctionContainer <em>Time Dependent Work Function Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Dependent Work Function Container</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer
	 * @generated
	 */
	EClass getTimeDependentWorkFunctionContainer();

	/**
	 * Returns the meta object for the reference '{@link dlim.TimeDependentWorkFunctionContainer#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getWork()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_Work();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentWorkFunctionContainer#getWorkStartTime <em>Work Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Start Time</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getWorkStartTime()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentWorkFunctionContainer_WorkStartTime();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentWorkFunctionContainer#getWorkDuration <em>Work Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Duration</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getWorkDuration()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentWorkFunctionContainer_WorkDuration();

	/**
	 * Returns the meta object for the reference '{@link dlim.TimeDependentWorkFunctionContainer#getTimeSynchronization <em>Time Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Synchronization</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getTimeSynchronization()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_TimeSynchronization();

	/**
	 * Returns the meta object for the reference '{@link dlim.TimeDependentWorkFunctionContainer#getMutualLoadFunction <em>Mutual Load Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mutual Load Function</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getMutualLoadFunction()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_MutualLoadFunction();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.TimeDependentWorkFunctionContainer#getLoadSequence <em>Load Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Sequence</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getLoadSequence()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_LoadSequence();

	/**
	 * Returns the meta object for the attribute '{@link dlim.TimeDependentWorkFunctionContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getName()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EAttribute getTimeDependentWorkFunctionContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dlim.TimeDependentWorkFunctionContainer#getParameterCharaterizationContainers <em>Parameter Charaterization Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Charaterization Containers</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getParameterCharaterizationContainers()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_ParameterCharaterizationContainers();

	/**
	 * Returns the meta object for the container reference '{@link dlim.TimeDependentWorkFunctionContainer#getWorkLoadSequence_WorkFunctionContainers <em>Work Load Sequence Work Function Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Work Load Sequence Work Function Containers</em>'.
	 * @see dlim.TimeDependentWorkFunctionContainer#getWorkLoadSequence_WorkFunctionContainers()
	 * @see #getTimeDependentWorkFunctionContainer()
	 * @generated
	 */
	EReference getTimeDependentWorkFunctionContainer_WorkLoadSequence_WorkFunctionContainers();

	/**
	 * Returns the meta object for class '{@link dlim.WorkLoadSequence <em>Work Load Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Load Sequence</em>'.
	 * @see dlim.WorkLoadSequence
	 * @generated
	 */
	EClass getWorkLoadSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link dlim.WorkLoadSequence#getWorkFunctionContainers <em>Work Function Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Function Containers</em>'.
	 * @see dlim.WorkLoadSequence#getWorkFunctionContainers()
	 * @see #getWorkLoadSequence()
	 * @generated
	 */
	EReference getWorkLoadSequence_WorkFunctionContainers();

	/**
	 * Returns the meta object for the attribute '{@link dlim.WorkLoadSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dlim.WorkLoadSequence#getName()
	 * @see #getWorkLoadSequence()
	 * @generated
	 */
	EAttribute getWorkLoadSequence_Name();

	/**
	 * Returns the meta object for class '{@link dlim.InputParameterCharacterizationContainer <em>Input Parameter Characterization Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter Characterization Container</em>'.
	 * @see dlim.InputParameterCharacterizationContainer
	 * @generated
	 */
	EClass getInputParameterCharacterizationContainer();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.InputParameterCharacterizationContainer#getVariableUsage <em>Variable Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Usage</em>'.
	 * @see dlim.InputParameterCharacterizationContainer#getVariableUsage()
	 * @see #getInputParameterCharacterizationContainer()
	 * @generated
	 */
	EReference getInputParameterCharacterizationContainer_VariableUsage();

	/**
	 * Returns the meta object for the containment reference '{@link dlim.InputParameterCharacterizationContainer#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Value</em>'.
	 * @see dlim.InputParameterCharacterizationContainer#getParameterValue()
	 * @see #getInputParameterCharacterizationContainer()
	 * @generated
	 */
	EReference getInputParameterCharacterizationContainer_ParameterValue();

	/**
	 * Returns the meta object for the container reference '{@link dlim.InputParameterCharacterizationContainer#getTDWFC_ParameterCharacterizationContainers <em>TDWFC Parameter Characterization Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TDWFC Parameter Characterization Containers</em>'.
	 * @see dlim.InputParameterCharacterizationContainer#getTDWFC_ParameterCharacterizationContainers()
	 * @see #getInputParameterCharacterizationContainer()
	 * @generated
	 */
	EReference getInputParameterCharacterizationContainer_TDWFC_ParameterCharacterizationContainers();

	/**
	 * Returns the meta object for enum '{@link dlim.ClockType <em>Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clock Type</em>'.
	 * @see dlim.ClockType
	 * @generated
	 */
	EEnum getClockType();

	/**
	 * Returns the meta object for enum '{@link dlim.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see dlim.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DlimFactory getDlimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dlim.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.SequenceImpl
		 * @see dlim.impl.DlimPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Terminate After Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TERMINATE_AFTER_TIME = eINSTANCE.getSequence_TerminateAfterTime();

		/**
		 * The meta object literal for the '<em><b>Reference Clock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__REFERENCE_CLOCK = eINSTANCE.getSequence_ReferenceClock();

		/**
		 * The meta object literal for the '<em><b>Sequence Function Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE_FUNCTION_CONTAINERS = eINSTANCE.getSequence_SequenceFunctionContainers();

		/**
		 * The meta object literal for the '<em><b>Terminate After Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TERMINATE_AFTER_LOOPS = eINSTANCE.getSequence_TerminateAfterLoops();

		/**
		 * The meta object literal for the '<em><b>First Iteration Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__FIRST_ITERATION_START = eINSTANCE.getSequence_FirstIterationStart();

		/**
		 * The meta object literal for the '<em><b>First Iteration End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__FIRST_ITERATION_END = eINSTANCE.getSequence_FirstIterationEnd();

		/**
		 * The meta object literal for the '<em><b>Loop Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__LOOP_DURATION = eINSTANCE.getSequence_LoopDuration();

		/**
		 * The meta object literal for the '<em><b>Final Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__FINAL_DURATION = eINSTANCE.getSequence_FinalDuration();

		/**
		 * The meta object literal for the '<em><b>Duration Defined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE___DURATION_DEFINED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSequence__DurationDefined__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dlim.impl.CombinatorImpl <em>Combinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.CombinatorImpl
		 * @see dlim.impl.DlimPackageImpl#getCombinator()
		 * @generated
		 */
		EClass COMBINATOR = eINSTANCE.getCombinator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINATOR__OPERATOR = eINSTANCE.getCombinator_Operator();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATOR__FUNCTION = eINSTANCE.getCombinator_Function();

		/**
		 * The meta object literal for the '{@link dlim.impl.TimeDependentFunctionContainerImpl <em>Time Dependent Function Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.TimeDependentFunctionContainerImpl
		 * @see dlim.impl.DlimPackageImpl#getTimeDependentFunctionContainer()
		 * @generated
		 */
		EClass TIME_DEPENDENT_FUNCTION_CONTAINER = eINSTANCE.getTimeDependentFunctionContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_FUNCTION_CONTAINER__NAME = eINSTANCE.getTimeDependentFunctionContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_FUNCTION_CONTAINER__DURATION = eINSTANCE.getTimeDependentFunctionContainer_Duration();

		/**
		 * The meta object literal for the '<em><b>First Iteration Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_FUNCTION_CONTAINER__FIRST_ITERATION_START = eINSTANCE.getTimeDependentFunctionContainer_FirstIterationStart();

		/**
		 * The meta object literal for the '<em><b>First Iteration End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_FUNCTION_CONTAINER__FIRST_ITERATION_END = eINSTANCE.getTimeDependentFunctionContainer_FirstIterationEnd();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_FUNCTION_CONTAINER__FUNCTION = eINSTANCE.getTimeDependentFunctionContainer_Function();

		/**
		 * The meta object literal for the '<em><b>Point Of Reference Clock Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_FUNCTION_CONTAINER__POINT_OF_REFERENCE_CLOCK_OBJECT = eINSTANCE.getTimeDependentFunctionContainer_PointOfReferenceClockObject();

		/**
		 * The meta object literal for the '<em><b>Point Of Reference Clock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_FUNCTION_CONTAINER__POINT_OF_REFERENCE_CLOCK_TYPE = eINSTANCE.getTimeDependentFunctionContainer_PointOfReferenceClockType();

		/**
		 * The meta object literal for the '<em><b>Duration Greater Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_DEPENDENT_FUNCTION_CONTAINER___DURATION_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimeDependentFunctionContainer__DurationGreaterZero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Reference Clock In Tree Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_DEPENDENT_FUNCTION_CONTAINER___REFERENCE_CLOCK_IN_TREE_NODE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTimeDependentFunctionContainer__ReferenceClockInTreeNode__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dlim.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.FunctionImpl
		 * @see dlim.impl.DlimPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Combine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__COMBINE = eINSTANCE.getFunction_Combine();

		/**
		 * The meta object literal for the '{@link dlim.impl.SeasonalImpl <em>Seasonal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.SeasonalImpl
		 * @see dlim.impl.DlimPackageImpl#getSeasonal()
		 * @generated
		 */
		EClass SEASONAL = eINSTANCE.getSeasonal();

		/**
		 * The meta object literal for the '{@link dlim.impl.NoiseImpl <em>Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.NoiseImpl
		 * @see dlim.impl.DlimPackageImpl#getNoise()
		 * @generated
		 */
		EClass NOISE = eINSTANCE.getNoise();

		/**
		 * The meta object literal for the '{@link dlim.impl.UniformNoiseImpl <em>Uniform Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.UniformNoiseImpl
		 * @see dlim.impl.DlimPackageImpl#getUniformNoise()
		 * @generated
		 */
		EClass UNIFORM_NOISE = eINSTANCE.getUniformNoise();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_NOISE__MIN = eINSTANCE.getUniformNoise_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM_NOISE__MAX = eINSTANCE.getUniformNoise_Max();

		/**
		 * The meta object literal for the '{@link dlim.impl.NormalNoiseImpl <em>Normal Noise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.NormalNoiseImpl
		 * @see dlim.impl.DlimPackageImpl#getNormalNoise()
		 * @generated
		 */
		EClass NORMAL_NOISE = eINSTANCE.getNormalNoise();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_NOISE__MEAN = eINSTANCE.getNormalNoise_Mean();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_NOISE__STANDARD_DEVIATION = eINSTANCE.getNormalNoise_StandardDeviation();

		/**
		 * The meta object literal for the '{@link dlim.impl.BurstImpl <em>Burst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.BurstImpl
		 * @see dlim.impl.DlimPackageImpl#getBurst()
		 * @generated
		 */
		EClass BURST = eINSTANCE.getBurst();

		/**
		 * The meta object literal for the '<em><b>Peak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST__PEAK = eINSTANCE.getBurst_Peak();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST__BASE = eINSTANCE.getBurst_Base();

		/**
		 * The meta object literal for the '<em><b>Peak Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST__PEAK_TIME = eINSTANCE.getBurst_PeakTime();

		/**
		 * The meta object literal for the '<em><b>Peak Time Greater Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BURST___PEAK_TIME_GREATER_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBurst__PeakTimeGreaterZero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dlim.impl.TrendImpl <em>Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.TrendImpl
		 * @see dlim.impl.DlimPackageImpl#getTrend()
		 * @generated
		 */
		EClass TREND = eINSTANCE.getTrend();

		/**
		 * The meta object literal for the '<em><b>Function Output At Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREND__FUNCTION_OUTPUT_AT_START = eINSTANCE.getTrend_FunctionOutputAtStart();

		/**
		 * The meta object literal for the '<em><b>Function Output At End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREND__FUNCTION_OUTPUT_AT_END = eINSTANCE.getTrend_FunctionOutputAtEnd();

		/**
		 * The meta object literal for the '{@link dlim.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ConstantImpl
		 * @see dlim.impl.DlimPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__CONSTANT = eINSTANCE.getConstant_Constant();

		/**
		 * The meta object literal for the '{@link dlim.impl.SinImpl <em>Sin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.SinImpl
		 * @see dlim.impl.DlimPackageImpl#getSin()
		 * @generated
		 */
		EClass SIN = eINSTANCE.getSin();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIN__MIN = eINSTANCE.getSin_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIN__MAX = eINSTANCE.getSin_Max();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIN__PERIOD = eINSTANCE.getSin_Period();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIN__PHASE = eINSTANCE.getSin_Phase();

		/**
		 * The meta object literal for the '{@link dlim.impl.ExponentialIncreaseAndDeclineImpl <em>Exponential Increase And Decline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ExponentialIncreaseAndDeclineImpl
		 * @see dlim.impl.DlimPackageImpl#getExponentialIncreaseAndDecline()
		 * @generated
		 */
		EClass EXPONENTIAL_INCREASE_AND_DECLINE = eINSTANCE.getExponentialIncreaseAndDecline();

		/**
		 * The meta object literal for the '{@link dlim.impl.ExponentialIncreaseLogarithmicDeclineImpl <em>Exponential Increase Logarithmic Decline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ExponentialIncreaseLogarithmicDeclineImpl
		 * @see dlim.impl.DlimPackageImpl#getExponentialIncreaseLogarithmicDecline()
		 * @generated
		 */
		EClass EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE = eINSTANCE.getExponentialIncreaseLogarithmicDecline();

		/**
		 * The meta object literal for the '<em><b>Logarithmic Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_INCREASE_LOGARITHMIC_DECLINE__LOGARITHMIC_ORDER = eINSTANCE.getExponentialIncreaseLogarithmicDecline_LogarithmicOrder();

		/**
		 * The meta object literal for the '{@link dlim.impl.LinearIncreaseAndDeclineImpl <em>Linear Increase And Decline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.LinearIncreaseAndDeclineImpl
		 * @see dlim.impl.DlimPackageImpl#getLinearIncreaseAndDecline()
		 * @generated
		 */
		EClass LINEAR_INCREASE_AND_DECLINE = eINSTANCE.getLinearIncreaseAndDecline();

		/**
		 * The meta object literal for the '{@link dlim.impl.AbsoluteSinImpl <em>Absolute Sin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.AbsoluteSinImpl
		 * @see dlim.impl.DlimPackageImpl#getAbsoluteSin()
		 * @generated
		 */
		EClass ABSOLUTE_SIN = eINSTANCE.getAbsoluteSin();

		/**
		 * The meta object literal for the '{@link dlim.impl.LinearTrendImpl <em>Linear Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.LinearTrendImpl
		 * @see dlim.impl.DlimPackageImpl#getLinearTrend()
		 * @generated
		 */
		EClass LINEAR_TREND = eINSTANCE.getLinearTrend();

		/**
		 * The meta object literal for the '{@link dlim.impl.ExponentialTrendImpl <em>Exponential Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ExponentialTrendImpl
		 * @see dlim.impl.DlimPackageImpl#getExponentialTrend()
		 * @generated
		 */
		EClass EXPONENTIAL_TREND = eINSTANCE.getExponentialTrend();

		/**
		 * The meta object literal for the '{@link dlim.impl.LogarithmicTrendImpl <em>Logarithmic Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.LogarithmicTrendImpl
		 * @see dlim.impl.DlimPackageImpl#getLogarithmicTrend()
		 * @generated
		 */
		EClass LOGARITHMIC_TREND = eINSTANCE.getLogarithmicTrend();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGARITHMIC_TREND__ORDER = eINSTANCE.getLogarithmicTrend_Order();

		/**
		 * The meta object literal for the '{@link dlim.impl.SinTrendImpl <em>Sin Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.SinTrendImpl
		 * @see dlim.impl.DlimPackageImpl#getSinTrend()
		 * @generated
		 */
		EClass SIN_TREND = eINSTANCE.getSinTrend();

		/**
		 * The meta object literal for the '{@link dlim.impl.ReferenceClockObjectImpl <em>Reference Clock Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ReferenceClockObjectImpl
		 * @see dlim.impl.DlimPackageImpl#getReferenceClockObject()
		 * @generated
		 */
		EClass REFERENCE_CLOCK_OBJECT = eINSTANCE.getReferenceClockObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CLOCK_OBJECT__NAME = eINSTANCE.getReferenceClockObject_Name();

		/**
		 * The meta object literal for the '<em><b>Loop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CLOCK_OBJECT__LOOP_TIME = eINSTANCE.getReferenceClockObject_LoopTime();

		/**
		 * The meta object literal for the '<em><b>Seq Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CLOCK_OBJECT__SEQ_TIME = eINSTANCE.getReferenceClockObject_SeqTime();

		/**
		 * The meta object literal for the '{@link dlim.impl.ArrivalRatesFromFileImpl <em>Arrival Rates From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.ArrivalRatesFromFileImpl
		 * @see dlim.impl.DlimPackageImpl#getArrivalRatesFromFile()
		 * @generated
		 */
		EClass ARRIVAL_RATES_FROM_FILE = eINSTANCE.getArrivalRatesFromFile();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRIVAL_RATES_FROM_FILE__FILE_PATH = eINSTANCE.getArrivalRatesFromFile_FilePath();

		/**
		 * The meta object literal for the '<em><b>Get Arrival Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRIVAL_RATES_FROM_FILE___GET_ARRIVAL_RATE__DOUBLE = eINSTANCE.getArrivalRatesFromFile__GetArrivalRate__double();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRIVAL_RATES_FROM_FILE___READ_FILE = eINSTANCE.getArrivalRatesFromFile__ReadFile();

		/**
		 * The meta object literal for the '{@link dlim.impl.AbsoluteValueFunctionImpl <em>Absolute Value Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.AbsoluteValueFunctionImpl
		 * @see dlim.impl.DlimPackageImpl#getAbsoluteValueFunction()
		 * @generated
		 */
		EClass ABSOLUTE_VALUE_FUNCTION = eINSTANCE.getAbsoluteValueFunction();

		/**
		 * The meta object literal for the '{@link dlim.impl.UnivariateFunctionImpl <em>Univariate Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.UnivariateFunctionImpl
		 * @see dlim.impl.DlimPackageImpl#getUnivariateFunction()
		 * @generated
		 */
		EClass UNIVARIATE_FUNCTION = eINSTANCE.getUnivariateFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVARIATE_FUNCTION__FUNCTION = eINSTANCE.getUnivariateFunction_Function();

		/**
		 * The meta object literal for the '{@link dlim.impl.PolynomialImpl <em>Polynomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.PolynomialImpl
		 * @see dlim.impl.DlimPackageImpl#getPolynomial()
		 * @generated
		 */
		EClass POLYNOMIAL = eINSTANCE.getPolynomial();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYNOMIAL__FACTORS = eINSTANCE.getPolynomial_Factors();

		/**
		 * The meta object literal for the '{@link dlim.impl.PolynomialFactorImpl <em>Polynomial Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.PolynomialFactorImpl
		 * @see dlim.impl.DlimPackageImpl#getPolynomialFactor()
		 * @generated
		 */
		EClass POLYNOMIAL_FACTOR = eINSTANCE.getPolynomialFactor();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL_FACTOR__FACTOR = eINSTANCE.getPolynomialFactor_Factor();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL_FACTOR__OFFSET = eINSTANCE.getPolynomialFactor_Offset();

		/**
		 * The meta object literal for the '{@link dlim.impl.TimeDependentWorkFunctionContainerImpl <em>Time Dependent Work Function Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.TimeDependentWorkFunctionContainerImpl
		 * @see dlim.impl.DlimPackageImpl#getTimeDependentWorkFunctionContainer()
		 * @generated
		 */
		EClass TIME_DEPENDENT_WORK_FUNCTION_CONTAINER = eINSTANCE.getTimeDependentWorkFunctionContainer();

		/**
		 * The meta object literal for the '<em><b>Work</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK = eINSTANCE.getTimeDependentWorkFunctionContainer_Work();

		/**
		 * The meta object literal for the '<em><b>Work Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_START_TIME = eINSTANCE.getTimeDependentWorkFunctionContainer_WorkStartTime();

		/**
		 * The meta object literal for the '<em><b>Work Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_DURATION = eINSTANCE.getTimeDependentWorkFunctionContainer_WorkDuration();

		/**
		 * The meta object literal for the '<em><b>Time Synchronization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__TIME_SYNCHRONIZATION = eINSTANCE.getTimeDependentWorkFunctionContainer_TimeSynchronization();

		/**
		 * The meta object literal for the '<em><b>Mutual Load Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__MUTUAL_LOAD_FUNCTION = eINSTANCE.getTimeDependentWorkFunctionContainer_MutualLoadFunction();

		/**
		 * The meta object literal for the '<em><b>Load Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__LOAD_SEQUENCE = eINSTANCE.getTimeDependentWorkFunctionContainer_LoadSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__NAME = eINSTANCE.getTimeDependentWorkFunctionContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Charaterization Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__PARAMETER_CHARATERIZATION_CONTAINERS = eINSTANCE.getTimeDependentWorkFunctionContainer_ParameterCharaterizationContainers();

		/**
		 * The meta object literal for the '<em><b>Work Load Sequence Work Function Containers</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_DEPENDENT_WORK_FUNCTION_CONTAINER__WORK_LOAD_SEQUENCE_WORK_FUNCTION_CONTAINERS = eINSTANCE.getTimeDependentWorkFunctionContainer_WorkLoadSequence_WorkFunctionContainers();

		/**
		 * The meta object literal for the '{@link dlim.impl.WorkLoadSequenceImpl <em>Work Load Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.WorkLoadSequenceImpl
		 * @see dlim.impl.DlimPackageImpl#getWorkLoadSequence()
		 * @generated
		 */
		EClass WORK_LOAD_SEQUENCE = eINSTANCE.getWorkLoadSequence();

		/**
		 * The meta object literal for the '<em><b>Work Function Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_LOAD_SEQUENCE__WORK_FUNCTION_CONTAINERS = eINSTANCE.getWorkLoadSequence_WorkFunctionContainers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_LOAD_SEQUENCE__NAME = eINSTANCE.getWorkLoadSequence_Name();

		/**
		 * The meta object literal for the '{@link dlim.impl.InputParameterCharacterizationContainerImpl <em>Input Parameter Characterization Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.impl.InputParameterCharacterizationContainerImpl
		 * @see dlim.impl.DlimPackageImpl#getInputParameterCharacterizationContainer()
		 * @generated
		 */
		EClass INPUT_PARAMETER_CHARACTERIZATION_CONTAINER = eINSTANCE.getInputParameterCharacterizationContainer();

		/**
		 * The meta object literal for the '<em><b>Variable Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__VARIABLE_USAGE = eINSTANCE.getInputParameterCharacterizationContainer_VariableUsage();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__PARAMETER_VALUE = eINSTANCE.getInputParameterCharacterizationContainer_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>TDWFC Parameter Characterization Containers</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETER_CHARACTERIZATION_CONTAINER__TDWFC_PARAMETER_CHARACTERIZATION_CONTAINERS = eINSTANCE.getInputParameterCharacterizationContainer_TDWFC_ParameterCharacterizationContainers();

		/**
		 * The meta object literal for the '{@link dlim.ClockType <em>Clock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.ClockType
		 * @see dlim.impl.DlimPackageImpl#getClockType()
		 * @generated
		 */
		EEnum CLOCK_TYPE = eINSTANCE.getClockType();

		/**
		 * The meta object literal for the '{@link dlim.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dlim.Operator
		 * @see dlim.impl.DlimPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //DlimPackage