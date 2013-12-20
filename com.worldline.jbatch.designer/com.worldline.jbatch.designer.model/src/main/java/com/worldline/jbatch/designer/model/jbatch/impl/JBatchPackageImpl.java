/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Analyzer;
import com.worldline.jbatch.designer.model.jbatch.Batchlet;
import com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm;
import com.worldline.jbatch.designer.model.jbatch.Chunk;
import com.worldline.jbatch.designer.model.jbatch.Collector;
import com.worldline.jbatch.designer.model.jbatch.Decision;
import com.worldline.jbatch.designer.model.jbatch.DocumentRoot;
import com.worldline.jbatch.designer.model.jbatch.End;
import com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter;
import com.worldline.jbatch.designer.model.jbatch.ExcludeType;
import com.worldline.jbatch.designer.model.jbatch.Fail;
import com.worldline.jbatch.designer.model.jbatch.Flow;
import com.worldline.jbatch.designer.model.jbatch.IncludeType;
import com.worldline.jbatch.designer.model.jbatch.ItemProcessor;
import com.worldline.jbatch.designer.model.jbatch.ItemReader;
import com.worldline.jbatch.designer.model.jbatch.ItemWriter;
import com.worldline.jbatch.designer.model.jbatch.JBatchFactory;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Job;
import com.worldline.jbatch.designer.model.jbatch.Listener;
import com.worldline.jbatch.designer.model.jbatch.Listeners;
import com.worldline.jbatch.designer.model.jbatch.Next;
import com.worldline.jbatch.designer.model.jbatch.Partition;
import com.worldline.jbatch.designer.model.jbatch.PartitionMapper;
import com.worldline.jbatch.designer.model.jbatch.PartitionPlan;
import com.worldline.jbatch.designer.model.jbatch.PartitionReducer;
import com.worldline.jbatch.designer.model.jbatch.Properties;
import com.worldline.jbatch.designer.model.jbatch.Property;
import com.worldline.jbatch.designer.model.jbatch.Split;
import com.worldline.jbatch.designer.model.jbatch.Step;
import com.worldline.jbatch.designer.model.jbatch.Stop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JBatchPackageImpl extends EPackageImpl implements JBatchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkpointAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionClassFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listenersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionReducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactRefEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JBatchPackageImpl() {
		super(eNS_URI, JBatchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JBatchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JBatchPackage init() {
		if (isInited) return (JBatchPackage)EPackage.Registry.INSTANCE.getEPackage(JBatchPackage.eNS_URI);

		// Obtain or create and register package
		JBatchPackageImpl theJBatchPackage = (JBatchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JBatchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JBatchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJBatchPackage.createPackageContents();

		// Initialize created meta-data
		theJBatchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJBatchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JBatchPackage.eNS_URI, theJBatchPackage);
		return theJBatchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzer() {
		return analyzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalyzer_Properties() {
		return (EReference)analyzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzer_Ref() {
		return (EAttribute)analyzerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchlet() {
		return batchletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchlet_Properties() {
		return (EReference)batchletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchlet_Ref() {
		return (EAttribute)batchletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckpointAlgorithm() {
		return checkpointAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckpointAlgorithm_Properties() {
		return (EReference)checkpointAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckpointAlgorithm_Ref() {
		return (EAttribute)checkpointAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_Reader() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_Processor() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_Writer() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_CheckpointAlgorithm() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_SkippableExceptionClasses() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_RetryableExceptionClasses() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChunk_NoRollbackExceptionClasses() {
		return (EReference)chunkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_CheckpointPolicy() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_ItemCount() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_RetryLimit() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_SkipLimit() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_TimeLimit() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollector() {
		return collectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollector_Properties() {
		return (EReference)collectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollector_Ref() {
		return (EAttribute)collectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Properties() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_TransitionElements() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_End() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Fail() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Next() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecision_Stop() {
		return (EReference)decisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Id() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecision_Ref() {
		return (EAttribute)decisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Job() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_ExitStatus() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_On() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionClassFilter() {
		return exceptionClassFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionClassFilter_Include() {
		return (EReference)exceptionClassFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionClassFilter_Exclude() {
		return (EReference)exceptionClassFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeType() {
		return excludeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeType_Class() {
		return (EAttribute)excludeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFail() {
		return failEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFail_ExitStatus() {
		return (EAttribute)failEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFail_On() {
		return (EAttribute)failEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Group() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Decision() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Flow() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Split() {
		return (EReference)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Step() {
		return (EReference)flowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_TransitionElements() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_End() {
		return (EReference)flowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Fail() {
		return (EReference)flowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Next() {
		return (EReference)flowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Stop() {
		return (EReference)flowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Id() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Next1() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Class() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemProcessor() {
		return itemProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemProcessor_Properties() {
		return (EReference)itemProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemProcessor_Ref() {
		return (EAttribute)itemProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemReader() {
		return itemReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemReader_Properties() {
		return (EReference)itemReaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemReader_Ref() {
		return (EAttribute)itemReaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemWriter() {
		return itemWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemWriter_Properties() {
		return (EReference)itemWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemWriter_Ref() {
		return (EAttribute)itemWriterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Properties() {
		return (EReference)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Listeners() {
		return (EReference)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Group() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Decision() {
		return (EReference)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Flow() {
		return (EReference)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Split() {
		return (EReference)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJob_Step() {
		return (EReference)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Id() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Restartable() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJob_Version() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListener() {
		return listenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListener_Properties() {
		return (EReference)listenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListener_Ref() {
		return (EAttribute)listenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListeners() {
		return listenersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListeners_Listener() {
		return (EReference)listenersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNext() {
		return nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNext_On() {
		return (EAttribute)nextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNext_To() {
		return (EAttribute)nextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Mapper() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Plan() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Collector() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Analyzer() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartition_Reducer() {
		return (EReference)partitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionMapper() {
		return partitionMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionMapper_Properties() {
		return (EReference)partitionMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionMapper_Ref() {
		return (EAttribute)partitionMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionPlan() {
		return partitionPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionPlan_Properties() {
		return (EReference)partitionPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionPlan_Partitions() {
		return (EAttribute)partitionPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionPlan_Threads() {
		return (EAttribute)partitionPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionReducer() {
		return partitionReducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionReducer_Properties() {
		return (EReference)partitionReducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionReducer_Ref() {
		return (EAttribute)partitionReducerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Property() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperties_Partition() {
		return (EAttribute)propertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Flow() {
		return (EReference)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplit_Id() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplit_Next() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Properties() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Listeners() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Batchlet() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Chunk() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Partition() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_TransitionElements() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_End() {
		return (EReference)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Fail() {
		return (EReference)stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Next() {
		return (EReference)stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Stop() {
		return (EReference)stepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_AllowStartIfComplete() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Id() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Next1() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StartLimit() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_ExitStatus() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_On() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_Restart() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactRef() {
		return artifactRefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JBatchFactory getJBatchFactory() {
		return (JBatchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		analyzerEClass = createEClass(ANALYZER);
		createEReference(analyzerEClass, ANALYZER__PROPERTIES);
		createEAttribute(analyzerEClass, ANALYZER__REF);

		batchletEClass = createEClass(BATCHLET);
		createEReference(batchletEClass, BATCHLET__PROPERTIES);
		createEAttribute(batchletEClass, BATCHLET__REF);

		checkpointAlgorithmEClass = createEClass(CHECKPOINT_ALGORITHM);
		createEReference(checkpointAlgorithmEClass, CHECKPOINT_ALGORITHM__PROPERTIES);
		createEAttribute(checkpointAlgorithmEClass, CHECKPOINT_ALGORITHM__REF);

		chunkEClass = createEClass(CHUNK);
		createEReference(chunkEClass, CHUNK__READER);
		createEReference(chunkEClass, CHUNK__PROCESSOR);
		createEReference(chunkEClass, CHUNK__WRITER);
		createEReference(chunkEClass, CHUNK__CHECKPOINT_ALGORITHM);
		createEReference(chunkEClass, CHUNK__SKIPPABLE_EXCEPTION_CLASSES);
		createEReference(chunkEClass, CHUNK__RETRYABLE_EXCEPTION_CLASSES);
		createEReference(chunkEClass, CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES);
		createEAttribute(chunkEClass, CHUNK__CHECKPOINT_POLICY);
		createEAttribute(chunkEClass, CHUNK__ITEM_COUNT);
		createEAttribute(chunkEClass, CHUNK__RETRY_LIMIT);
		createEAttribute(chunkEClass, CHUNK__SKIP_LIMIT);
		createEAttribute(chunkEClass, CHUNK__TIME_LIMIT);

		collectorEClass = createEClass(COLLECTOR);
		createEReference(collectorEClass, COLLECTOR__PROPERTIES);
		createEAttribute(collectorEClass, COLLECTOR__REF);

		decisionEClass = createEClass(DECISION);
		createEReference(decisionEClass, DECISION__PROPERTIES);
		createEAttribute(decisionEClass, DECISION__TRANSITION_ELEMENTS);
		createEReference(decisionEClass, DECISION__END);
		createEReference(decisionEClass, DECISION__FAIL);
		createEReference(decisionEClass, DECISION__NEXT);
		createEReference(decisionEClass, DECISION__STOP);
		createEAttribute(decisionEClass, DECISION__ID);
		createEAttribute(decisionEClass, DECISION__REF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__JOB);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__EXIT_STATUS);
		createEAttribute(endEClass, END__ON);

		exceptionClassFilterEClass = createEClass(EXCEPTION_CLASS_FILTER);
		createEReference(exceptionClassFilterEClass, EXCEPTION_CLASS_FILTER__INCLUDE);
		createEReference(exceptionClassFilterEClass, EXCEPTION_CLASS_FILTER__EXCLUDE);

		excludeTypeEClass = createEClass(EXCLUDE_TYPE);
		createEAttribute(excludeTypeEClass, EXCLUDE_TYPE__CLASS);

		failEClass = createEClass(FAIL);
		createEAttribute(failEClass, FAIL__EXIT_STATUS);
		createEAttribute(failEClass, FAIL__ON);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__GROUP);
		createEReference(flowEClass, FLOW__DECISION);
		createEReference(flowEClass, FLOW__FLOW);
		createEReference(flowEClass, FLOW__SPLIT);
		createEReference(flowEClass, FLOW__STEP);
		createEAttribute(flowEClass, FLOW__TRANSITION_ELEMENTS);
		createEReference(flowEClass, FLOW__END);
		createEReference(flowEClass, FLOW__FAIL);
		createEReference(flowEClass, FLOW__NEXT);
		createEReference(flowEClass, FLOW__STOP);
		createEAttribute(flowEClass, FLOW__ID);
		createEAttribute(flowEClass, FLOW__NEXT1);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__CLASS);

		itemProcessorEClass = createEClass(ITEM_PROCESSOR);
		createEReference(itemProcessorEClass, ITEM_PROCESSOR__PROPERTIES);
		createEAttribute(itemProcessorEClass, ITEM_PROCESSOR__REF);

		itemReaderEClass = createEClass(ITEM_READER);
		createEReference(itemReaderEClass, ITEM_READER__PROPERTIES);
		createEAttribute(itemReaderEClass, ITEM_READER__REF);

		itemWriterEClass = createEClass(ITEM_WRITER);
		createEReference(itemWriterEClass, ITEM_WRITER__PROPERTIES);
		createEAttribute(itemWriterEClass, ITEM_WRITER__REF);

		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__PROPERTIES);
		createEReference(jobEClass, JOB__LISTENERS);
		createEAttribute(jobEClass, JOB__GROUP);
		createEReference(jobEClass, JOB__DECISION);
		createEReference(jobEClass, JOB__FLOW);
		createEReference(jobEClass, JOB__SPLIT);
		createEReference(jobEClass, JOB__STEP);
		createEAttribute(jobEClass, JOB__ID);
		createEAttribute(jobEClass, JOB__RESTARTABLE);
		createEAttribute(jobEClass, JOB__VERSION);

		listenerEClass = createEClass(LISTENER);
		createEReference(listenerEClass, LISTENER__PROPERTIES);
		createEAttribute(listenerEClass, LISTENER__REF);

		listenersEClass = createEClass(LISTENERS);
		createEReference(listenersEClass, LISTENERS__LISTENER);

		nextEClass = createEClass(NEXT);
		createEAttribute(nextEClass, NEXT__ON);
		createEAttribute(nextEClass, NEXT__TO);

		partitionEClass = createEClass(PARTITION);
		createEReference(partitionEClass, PARTITION__MAPPER);
		createEReference(partitionEClass, PARTITION__PLAN);
		createEReference(partitionEClass, PARTITION__COLLECTOR);
		createEReference(partitionEClass, PARTITION__ANALYZER);
		createEReference(partitionEClass, PARTITION__REDUCER);

		partitionMapperEClass = createEClass(PARTITION_MAPPER);
		createEReference(partitionMapperEClass, PARTITION_MAPPER__PROPERTIES);
		createEAttribute(partitionMapperEClass, PARTITION_MAPPER__REF);

		partitionPlanEClass = createEClass(PARTITION_PLAN);
		createEReference(partitionPlanEClass, PARTITION_PLAN__PROPERTIES);
		createEAttribute(partitionPlanEClass, PARTITION_PLAN__PARTITIONS);
		createEAttribute(partitionPlanEClass, PARTITION_PLAN__THREADS);

		partitionReducerEClass = createEClass(PARTITION_REDUCER);
		createEReference(partitionReducerEClass, PARTITION_REDUCER__PROPERTIES);
		createEAttribute(partitionReducerEClass, PARTITION_REDUCER__REF);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTY);
		createEAttribute(propertiesEClass, PROPERTIES__PARTITION);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		splitEClass = createEClass(SPLIT);
		createEReference(splitEClass, SPLIT__FLOW);
		createEAttribute(splitEClass, SPLIT__ID);
		createEAttribute(splitEClass, SPLIT__NEXT);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__PROPERTIES);
		createEReference(stepEClass, STEP__LISTENERS);
		createEReference(stepEClass, STEP__BATCHLET);
		createEReference(stepEClass, STEP__CHUNK);
		createEReference(stepEClass, STEP__PARTITION);
		createEAttribute(stepEClass, STEP__TRANSITION_ELEMENTS);
		createEReference(stepEClass, STEP__END);
		createEReference(stepEClass, STEP__FAIL);
		createEReference(stepEClass, STEP__NEXT);
		createEReference(stepEClass, STEP__STOP);
		createEAttribute(stepEClass, STEP__ALLOW_START_IF_COMPLETE);
		createEAttribute(stepEClass, STEP__ID);
		createEAttribute(stepEClass, STEP__NEXT1);
		createEAttribute(stepEClass, STEP__START_LIMIT);

		stopEClass = createEClass(STOP);
		createEAttribute(stopEClass, STOP__EXIT_STATUS);
		createEAttribute(stopEClass, STOP__ON);
		createEAttribute(stopEClass, STOP__RESTART);

		// Create data types
		artifactRefEDataType = createEDataType(ARTIFACT_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(analyzerEClass, Analyzer.class, "Analyzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalyzer_Properties(), this.getProperties(), null, "properties", null, 0, 1, Analyzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzer_Ref(), this.getArtifactRef(), "ref", null, 1, 1, Analyzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchletEClass, Batchlet.class, "Batchlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBatchlet_Properties(), this.getProperties(), null, "properties", null, 0, 1, Batchlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatchlet_Ref(), this.getArtifactRef(), "ref", null, 1, 1, Batchlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkpointAlgorithmEClass, CheckpointAlgorithm.class, "CheckpointAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckpointAlgorithm_Properties(), this.getProperties(), null, "properties", null, 0, 1, CheckpointAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckpointAlgorithm_Ref(), this.getArtifactRef(), "ref", null, 1, 1, CheckpointAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkEClass, Chunk.class, "Chunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChunk_Reader(), this.getItemReader(), null, "reader", null, 1, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_Processor(), this.getItemProcessor(), null, "processor", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_Writer(), this.getItemWriter(), null, "writer", null, 1, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_CheckpointAlgorithm(), this.getCheckpointAlgorithm(), null, "checkpointAlgorithm", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_SkippableExceptionClasses(), this.getExceptionClassFilter(), null, "skippableExceptionClasses", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_RetryableExceptionClasses(), this.getExceptionClassFilter(), null, "retryableExceptionClasses", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChunk_NoRollbackExceptionClasses(), this.getExceptionClassFilter(), null, "noRollbackExceptionClasses", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_CheckpointPolicy(), theXMLTypePackage.getString(), "checkpointPolicy", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_ItemCount(), theXMLTypePackage.getString(), "itemCount", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_RetryLimit(), theXMLTypePackage.getString(), "retryLimit", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_SkipLimit(), theXMLTypePackage.getString(), "skipLimit", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_TimeLimit(), theXMLTypePackage.getString(), "timeLimit", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectorEClass, Collector.class, "Collector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollector_Properties(), this.getProperties(), null, "properties", null, 0, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollector_Ref(), this.getArtifactRef(), "ref", null, 1, 1, Collector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecision_Properties(), this.getProperties(), null, "properties", null, 0, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_TransitionElements(), ecorePackage.getEFeatureMapEntry(), "transitionElements", null, 0, -1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_End(), this.getEnd(), null, "end", null, 0, -1, Decision.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Fail(), this.getFail(), null, "fail", null, 0, -1, Decision.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Next(), this.getNext(), null, "next", null, 0, -1, Decision.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDecision_Stop(), this.getStop(), null, "stop", null, 0, -1, Decision.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecision_Ref(), this.getArtifactRef(), "ref", null, 1, 1, Decision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Job(), this.getJob(), null, "job", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_ExitStatus(), theXMLTypePackage.getString(), "exitStatus", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_On(), theXMLTypePackage.getString(), "on", null, 1, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionClassFilterEClass, ExceptionClassFilter.class, "ExceptionClassFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionClassFilter_Include(), this.getIncludeType(), null, "include", null, 0, -1, ExceptionClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionClassFilter_Exclude(), this.getExcludeType(), null, "exclude", null, 0, -1, ExceptionClassFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeTypeEClass, ExcludeType.class, "ExcludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcludeType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, ExcludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failEClass, Fail.class, "Fail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFail_ExitStatus(), theXMLTypePackage.getString(), "exitStatus", null, 0, 1, Fail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFail_On(), theXMLTypePackage.getString(), "on", null, 1, 1, Fail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Decision(), this.getDecision(), null, "decision", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Flow(), this.getFlow(), null, "flow", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Split(), this.getSplit(), null, "split", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Step(), this.getStep(), null, "step", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_TransitionElements(), ecorePackage.getEFeatureMapEntry(), "transitionElements", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_End(), this.getEnd(), null, "end", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Fail(), this.getFail(), null, "fail", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Next(), this.getNext(), null, "next", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Stop(), this.getStop(), null, "stop", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Next1(), theXMLTypePackage.getString(), "next1", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemProcessorEClass, ItemProcessor.class, "ItemProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemProcessor_Properties(), this.getProperties(), null, "properties", null, 0, 1, ItemProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemProcessor_Ref(), this.getArtifactRef(), "ref", null, 1, 1, ItemProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemReaderEClass, ItemReader.class, "ItemReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemReader_Properties(), this.getProperties(), null, "properties", null, 0, 1, ItemReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemReader_Ref(), this.getArtifactRef(), "ref", null, 1, 1, ItemReader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemWriterEClass, ItemWriter.class, "ItemWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemWriter_Properties(), this.getProperties(), null, "properties", null, 0, 1, ItemWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemWriter_Ref(), this.getArtifactRef(), "ref", null, 1, 1, ItemWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Properties(), this.getProperties(), null, "properties", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Listeners(), this.getListeners(), null, "listeners", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Decision(), this.getDecision(), null, "decision", null, 0, -1, Job.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Flow(), this.getFlow(), null, "flow", null, 0, -1, Job.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Split(), this.getSplit(), null, "split", null, 0, -1, Job.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Step(), this.getStep(), null, "step", null, 0, -1, Job.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Restartable(), theXMLTypePackage.getString(), "restartable", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Version(), theXMLTypePackage.getString(), "version", "1.0", 1, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listenerEClass, Listener.class, "Listener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListener_Properties(), this.getProperties(), null, "properties", null, 0, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListener_Ref(), this.getArtifactRef(), "ref", null, 1, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listenersEClass, Listeners.class, "Listeners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListeners_Listener(), this.getListener(), null, "listener", null, 0, -1, Listeners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNext_On(), theXMLTypePackage.getString(), "on", null, 1, 1, Next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNext_To(), theXMLTypePackage.getString(), "to", null, 1, 1, Next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartition_Mapper(), this.getPartitionMapper(), null, "mapper", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Plan(), this.getPartitionPlan(), null, "plan", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Collector(), this.getCollector(), null, "collector", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Analyzer(), this.getAnalyzer(), null, "analyzer", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartition_Reducer(), this.getPartitionReducer(), null, "reducer", null, 0, 1, Partition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionMapperEClass, PartitionMapper.class, "PartitionMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionMapper_Properties(), this.getProperties(), null, "properties", null, 0, 1, PartitionMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionMapper_Ref(), this.getArtifactRef(), "ref", null, 1, 1, PartitionMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionPlanEClass, PartitionPlan.class, "PartitionPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionPlan_Properties(), this.getProperties(), null, "properties", null, 0, -1, PartitionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionPlan_Partitions(), theXMLTypePackage.getString(), "partitions", null, 0, 1, PartitionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionPlan_Threads(), theXMLTypePackage.getString(), "threads", null, 0, 1, PartitionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionReducerEClass, PartitionReducer.class, "PartitionReducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionReducer_Properties(), this.getProperties(), null, "properties", null, 0, 1, PartitionReducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartitionReducer_Ref(), this.getArtifactRef(), "ref", null, 1, 1, PartitionReducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Property(), this.getProperty(), null, "property", null, 0, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperties_Partition(), theXMLTypePackage.getString(), "partition", null, 0, 1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplit_Flow(), this.getFlow(), null, "flow", null, 0, -1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplit_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplit_Next(), theXMLTypePackage.getString(), "next", null, 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Properties(), this.getProperties(), null, "properties", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Listeners(), this.getListeners(), null, "listeners", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Batchlet(), this.getBatchlet(), null, "batchlet", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Chunk(), this.getChunk(), null, "chunk", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Partition(), this.getPartition(), null, "partition", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_TransitionElements(), ecorePackage.getEFeatureMapEntry(), "transitionElements", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_End(), this.getEnd(), null, "end", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Fail(), this.getFail(), null, "fail", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Next(), this.getNext(), null, "next", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Stop(), this.getStop(), null, "stop", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_AllowStartIfComplete(), theXMLTypePackage.getString(), "allowStartIfComplete", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Next1(), theXMLTypePackage.getString(), "next1", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StartLimit(), theXMLTypePackage.getString(), "startLimit", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStop_ExitStatus(), theXMLTypePackage.getString(), "exitStatus", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_On(), theXMLTypePackage.getString(), "on", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_Restart(), theXMLTypePackage.getString(), "restart", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(artifactRefEDataType, String.class, "ArtifactRef", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (analyzerEClass, 
		   source, 
		   new String[] {
			 "name", "Analyzer",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnalyzer_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnalyzer_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (artifactRefEDataType, 
		   source, 
		   new String[] {
			 "name", "artifactRef",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (batchletEClass, 
		   source, 
		   new String[] {
			 "name", "Batchlet",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBatchlet_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBatchlet_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (checkpointAlgorithmEClass, 
		   source, 
		   new String[] {
			 "name", "CheckpointAlgorithm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCheckpointAlgorithm_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCheckpointAlgorithm_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (chunkEClass, 
		   source, 
		   new String[] {
			 "name", "Chunk",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChunk_Reader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reader",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_Processor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "processor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_Writer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "writer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_CheckpointAlgorithm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "checkpoint-algorithm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_SkippableExceptionClasses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "skippable-exception-classes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_RetryableExceptionClasses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "retryable-exception-classes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChunk_NoRollbackExceptionClasses(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "no-rollback-exception-classes",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getChunk_CheckpointPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "checkpoint-policy"
		   });			
		addAnnotation
		  (getChunk_ItemCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "item-count"
		   });			
		addAnnotation
		  (getChunk_RetryLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "retry-limit"
		   });			
		addAnnotation
		  (getChunk_SkipLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "skip-limit"
		   });			
		addAnnotation
		  (getChunk_TimeLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time-limit"
		   });		
		addAnnotation
		  (collectorEClass, 
		   source, 
		   new String[] {
			 "name", "Collector",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollector_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCollector_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (decisionEClass, 
		   source, 
		   new String[] {
			 "name", "Decision",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDecision_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDecision_TransitionElements(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "TransitionElements:1"
		   });		
		addAnnotation
		  (getDecision_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:1"
		   });		
		addAnnotation
		  (getDecision_Fail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fail",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:1"
		   });		
		addAnnotation
		  (getDecision_Next(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "next",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:1"
		   });		
		addAnnotation
		  (getDecision_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:1"
		   });		
		addAnnotation
		  (getDecision_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDecision_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Job(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "job",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (endEClass, 
		   source, 
		   new String[] {
			 "name", "End",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEnd_ExitStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exit-status"
		   });		
		addAnnotation
		  (getEnd_On(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "on"
		   });		
		addAnnotation
		  (exceptionClassFilterEClass, 
		   source, 
		   new String[] {
			 "name", "ExceptionClassFilter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExceptionClassFilter_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExceptionClassFilter_Exclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (excludeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "exclude_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExcludeType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (failEClass, 
		   source, 
		   new String[] {
			 "name", "Fail",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFail_ExitStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exit-status"
		   });		
		addAnnotation
		  (getFail_On(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "on"
		   });		
		addAnnotation
		  (flowEClass, 
		   source, 
		   new String[] {
			 "name", "Flow",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFlow_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getFlow_Decision(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "decision",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFlow_Flow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flow",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFlow_Split(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "split",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFlow_Step(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFlow_TransitionElements(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "TransitionElements:5"
		   });		
		addAnnotation
		  (getFlow_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getFlow_Fail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fail",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getFlow_Next(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "next",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getFlow_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getFlow_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getFlow_Next1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "next"
		   });		
		addAnnotation
		  (includeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "include_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIncludeType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (itemProcessorEClass, 
		   source, 
		   new String[] {
			 "name", "ItemProcessor",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemProcessor_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemProcessor_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (itemReaderEClass, 
		   source, 
		   new String[] {
			 "name", "ItemReader",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemReader_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemReader_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (itemWriterEClass, 
		   source, 
		   new String[] {
			 "name", "ItemWriter",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemWriter_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemWriter_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });			
		addAnnotation
		  (jobEClass, 
		   source, 
		   new String[] {
			 "name", "Job",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getJob_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getJob_Listeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getJob_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getJob_Decision(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "decision",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getJob_Flow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flow",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getJob_Split(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "split",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getJob_Step(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getJob_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getJob_Restartable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartable"
		   });		
		addAnnotation
		  (getJob_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (listenerEClass, 
		   source, 
		   new String[] {
			 "name", "Listener",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListener_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListener_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (listenersEClass, 
		   source, 
		   new String[] {
			 "name", "Listeners",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListeners_Listener(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listener",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nextEClass, 
		   source, 
		   new String[] {
			 "name", "Next",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNext_On(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "on"
		   });		
		addAnnotation
		  (getNext_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to"
		   });		
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "name", "Partition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartition_Mapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartition_Plan(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plan",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartition_Collector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "collector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartition_Analyzer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "analyzer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartition_Reducer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reducer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (partitionMapperEClass, 
		   source, 
		   new String[] {
			 "name", "PartitionMapper",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartitionMapper_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartitionMapper_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (partitionPlanEClass, 
		   source, 
		   new String[] {
			 "name", "PartitionPlan",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartitionPlan_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartitionPlan_Partitions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partitions"
		   });		
		addAnnotation
		  (getPartitionPlan_Threads(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "threads"
		   });		
		addAnnotation
		  (partitionReducerEClass, 
		   source, 
		   new String[] {
			 "name", "PartitionReducer",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPartitionReducer_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPartitionReducer_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (propertiesEClass, 
		   source, 
		   new String[] {
			 "name", "Properties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProperties_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProperties_Partition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "partition"
		   });		
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getProperty_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (splitEClass, 
		   source, 
		   new String[] {
			 "name", "Split",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSplit_Flow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSplit_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSplit_Next(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "next"
		   });		
		addAnnotation
		  (stepEClass, 
		   source, 
		   new String[] {
			 "name", "Step",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStep_Properties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "properties",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getStep_Listeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStep_Batchlet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "batchlet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStep_Chunk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chunk",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStep_Partition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "partition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStep_TransitionElements(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "TransitionElements:5"
		   });		
		addAnnotation
		  (getStep_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getStep_Fail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fail",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getStep_Next(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "next",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getStep_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace",
			 "group", "#TransitionElements:5"
		   });		
		addAnnotation
		  (getStep_AllowStartIfComplete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "allow-start-if-complete"
		   });		
		addAnnotation
		  (getStep_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStep_Next1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "next"
		   });		
		addAnnotation
		  (getStep_StartLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-limit"
		   });		
		addAnnotation
		  (stopEClass, 
		   source, 
		   new String[] {
			 "name", "Stop",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStop_ExitStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exit-status"
		   });		
		addAnnotation
		  (getStop_On(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "on"
		   });		
		addAnnotation
		  (getStop_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart"
		   });
	}

} //JBatchPackageImpl
