package org.palladiosimulator.simulizar.access;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.launcher.jobs.LoadPMSModelIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSDMModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.partitions.PMSResourceSetPartition;
import org.palladiosimulator.simulizar.launcher.partitions.SDMResourceSetPartition;
import org.palladiosimulator.simulizar.pms.PMSModel;
import org.palladiosimulator.simulizar.prm.PRMModel;
import org.palladiosimulator.simulizar.prm.PrmFactory;
import org.storydriven.storydiagrams.activities.Activity;

import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;

/**
 * 
 * Helper to access the pcm model (global and local), the prm model, the pms model and all SD
 * models.
 * 
 * @author Joachim Meyer, Steffen Becker
 */
public class ModelAccess implements IModelAccess {

    protected static final Logger LOG = Logger.getLogger(ModelAccess.class.getName());

    /**
     * TODO FIXME This cache is a severe memory leak
     */
    private final Map<SimuComSimProcess, PCMResourceSetPartition> modelCopies;

    private final PCMResourceSetPartition pcmPartition;
    private final PMSResourceSetPartition pmsPartition;
    private final SDMResourceSetPartition sdmPartition;
    private final PRMModel prmModel;

    /**
     * Constructor
     * 
     * @param blackboard
     *            the workflow engine's blackboard holding all models.
     */
    public ModelAccess(final MDSDBlackboard blackboard) {
        super();
        this.modelCopies = new HashMap<SimuComSimProcess, PCMResourceSetPartition>();
        this.prmModel = PrmFactory.eINSTANCE.createPRMModel();
        this.pcmPartition = getResourceSetPartition(blackboard, LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        this.sdmPartition = getResourceSetPartition(blackboard, LoadSDMModelsIntoBlackboardJob.SDM_MODEL_PARTITION_ID);
        this.pmsPartition = getResourceSetPartition(blackboard, LoadPMSModelIntoBlackboardJob.PMS_MODEL_PARTITION_ID);
    }

    @Override
    public PCMResourceSetPartition getLocalPCMModel(final InterpreterDefaultContext context) {
        // TODO FIXME: Create and return a read-only PCMResourceSetPartition

        // if (this.context.getThread() != null) {
        // models = this.getModelHelper().getLocalPCMModels(this.context.getThread());
        // } else {
        // models = this.getModelHelper().getGlobalPCMModels();
        // }
        // return this.getSpecificModel(models);

        return this.pcmPartition;
    }

    @Override
    public PCMResourceSetPartition getGlobalPCMModel() {
        return this.pcmPartition;
    }

    /**
     * 
     * @return the global pms model.
     */
    @Override
    public PMSModel getPMSModel() {
        return pmsPartition.getPMSModel();
    }

    /**
     * 
     * @return the global prm model.
     */
    @Override
    public PRMModel getPRMModel() {
        return this.prmModel;
    }

    /**
     * 
     * @return a list of the sdm models.
     */
    @Override
    public List<Activity> getStoryDiagrams() {
        return sdmPartition.getActivities();
    }

    /**
     * Checks whether sdm models exists, without using any classes from sd interpreter.
     * 
     * @return true if yes, otherwise false;
     */
    public boolean sdmModelsExists() {
        return sdmPartition.getResourceSet().getResources().size() > 0;
    }

    /**
     * Checks whether pms model exists.
     * 
     * @return true if yes, otherwise false;
     */
    public boolean pmsModelExists() {
        return pmsPartition.getResourceSet().getResources().size() > 0;
    }

    public PCMResourceSetPartition getPCMResourceSetPartition() {
        return this.pcmPartition;
    }

    @SuppressWarnings("unchecked")
    private <T extends ResourceSetPartition> T getResourceSetPartition(
            final MDSDBlackboard blackboard,
            final String id) {
        return (T) blackboard.getPartition(id);
    }

}