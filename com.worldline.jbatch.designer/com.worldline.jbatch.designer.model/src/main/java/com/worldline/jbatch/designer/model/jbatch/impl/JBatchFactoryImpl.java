/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JBatchFactoryImpl extends EFactoryImpl implements JBatchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JBatchFactory init() {
		try {
			JBatchFactory theJBatchFactory = (JBatchFactory)EPackage.Registry.INSTANCE.getEFactory(JBatchPackage.eNS_URI);
			if (theJBatchFactory != null) {
				return theJBatchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JBatchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JBatchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JBatchPackage.ANALYZER: return createAnalyzer();
			case JBatchPackage.BATCHLET: return createBatchlet();
			case JBatchPackage.CHECKPOINT_ALGORITHM: return createCheckpointAlgorithm();
			case JBatchPackage.CHUNK: return createChunk();
			case JBatchPackage.COLLECTOR: return createCollector();
			case JBatchPackage.DECISION: return createDecision();
			case JBatchPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case JBatchPackage.END: return createEnd();
			case JBatchPackage.EXCEPTION_CLASS_FILTER: return createExceptionClassFilter();
			case JBatchPackage.EXCLUDE_TYPE: return createExcludeType();
			case JBatchPackage.FAIL: return createFail();
			case JBatchPackage.FLOW: return createFlow();
			case JBatchPackage.INCLUDE_TYPE: return createIncludeType();
			case JBatchPackage.ITEM_PROCESSOR: return createItemProcessor();
			case JBatchPackage.ITEM_READER: return createItemReader();
			case JBatchPackage.ITEM_WRITER: return createItemWriter();
			case JBatchPackage.JOB: return createJob();
			case JBatchPackage.LISTENER: return createListener();
			case JBatchPackage.LISTENERS: return createListeners();
			case JBatchPackage.NEXT: return createNext();
			case JBatchPackage.PARTITION: return createPartition();
			case JBatchPackage.PARTITION_MAPPER: return createPartitionMapper();
			case JBatchPackage.PARTITION_PLAN: return createPartitionPlan();
			case JBatchPackage.PARTITION_REDUCER: return createPartitionReducer();
			case JBatchPackage.PROPERTIES: return createProperties();
			case JBatchPackage.PROPERTY: return createProperty();
			case JBatchPackage.SPLIT: return createSplit();
			case JBatchPackage.STEP: return createStep();
			case JBatchPackage.STOP: return createStop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JBatchPackage.ARTIFACT_REF:
				return createArtifactRefFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JBatchPackage.ARTIFACT_REF:
				return convertArtifactRefToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyzer createAnalyzer() {
		AnalyzerImpl analyzer = new AnalyzerImpl();
		return analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batchlet createBatchlet() {
		BatchletImpl batchlet = new BatchletImpl();
		return batchlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckpointAlgorithm createCheckpointAlgorithm() {
		CheckpointAlgorithmImpl checkpointAlgorithm = new CheckpointAlgorithmImpl();
		return checkpointAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chunk createChunk() {
		ChunkImpl chunk = new ChunkImpl();
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collector createCollector() {
		CollectorImpl collector = new CollectorImpl();
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionClassFilter createExceptionClassFilter() {
		ExceptionClassFilterImpl exceptionClassFilter = new ExceptionClassFilterImpl();
		return exceptionClassFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeType createExcludeType() {
		ExcludeTypeImpl excludeType = new ExcludeTypeImpl();
		return excludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fail createFail() {
		FailImpl fail = new FailImpl();
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcessor createItemProcessor() {
		ItemProcessorImpl itemProcessor = new ItemProcessorImpl();
		return itemProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReader createItemReader() {
		ItemReaderImpl itemReader = new ItemReaderImpl();
		return itemReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemWriter createItemWriter() {
		ItemWriterImpl itemWriter = new ItemWriterImpl();
		return itemWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listener createListener() {
		ListenerImpl listener = new ListenerImpl();
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listeners createListeners() {
		ListenersImpl listeners = new ListenersImpl();
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Next createNext() {
		NextImpl next = new NextImpl();
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionMapper createPartitionMapper() {
		PartitionMapperImpl partitionMapper = new PartitionMapperImpl();
		return partitionMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPlan createPartitionPlan() {
		PartitionPlanImpl partitionPlan = new PartitionPlanImpl();
		return partitionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionReducer createPartitionReducer() {
		PartitionReducerImpl partitionReducer = new PartitionReducerImpl();
		return partitionReducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArtifactRefFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactRefToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JBatchPackage getJBatchPackage() {
		return (JBatchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JBatchPackage getPackage() {
		return JBatchPackage.eINSTANCE;
	}

} //JBatchFactoryImpl
