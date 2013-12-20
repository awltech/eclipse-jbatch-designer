/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * <!-- begin-model-doc -->
 * 
 * 			Job Specification Language (JSL) specifies a job,
 * 			its steps, and directs their execution.
 * 			JSL also can be referred to as "Job XML".
 * 		
 * <!-- end-model-doc -->
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchFactory
 * @model kind="package"
 * @generated
 */
public interface JBatchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jbatch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://worldline.com/jbatch/designer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jbatch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JBatchPackage eINSTANCE = com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.AnalyzerImpl <em>Analyzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.AnalyzerImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getAnalyzer()
	 * @generated
	 */
	int ANALYZER = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER__REF = 1;

	/**
	 * The number of structural features of the '<em>Analyzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Analyzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.BatchletImpl <em>Batchlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.BatchletImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getBatchlet()
	 * @generated
	 */
	int BATCHLET = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHLET__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHLET__REF = 1;

	/**
	 * The number of structural features of the '<em>Batchlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHLET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Batchlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCHLET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.CheckpointAlgorithmImpl <em>Checkpoint Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.CheckpointAlgorithmImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getCheckpointAlgorithm()
	 * @generated
	 */
	int CHECKPOINT_ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKPOINT_ALGORITHM__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKPOINT_ALGORITHM__REF = 1;

	/**
	 * The number of structural features of the '<em>Checkpoint Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKPOINT_ALGORITHM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Checkpoint Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKPOINT_ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 3;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__READER = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Writer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__WRITER = 2;

	/**
	 * The feature id for the '<em><b>Checkpoint Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__CHECKPOINT_ALGORITHM = 3;

	/**
	 * The feature id for the '<em><b>Skippable Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__SKIPPABLE_EXCEPTION_CLASSES = 4;

	/**
	 * The feature id for the '<em><b>Retryable Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__RETRYABLE_EXCEPTION_CLASSES = 5;

	/**
	 * The feature id for the '<em><b>No Rollback Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES = 6;

	/**
	 * The feature id for the '<em><b>Checkpoint Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__CHECKPOINT_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__ITEM_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Retry Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__RETRY_LIMIT = 9;

	/**
	 * The feature id for the '<em><b>Skip Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__SKIP_LIMIT = 10;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__TIME_LIMIT = 11;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.CollectorImpl <em>Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.CollectorImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getCollector()
	 * @generated
	 */
	int COLLECTOR = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR__REF = 1;

	/**
	 * The number of structural features of the '<em>Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Transition Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TRANSITION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__END = 2;

	/**
	 * The feature id for the '<em><b>Fail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__FAIL = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NEXT = 4;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STOP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__REF = 7;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.DocumentRootImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__JOB = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.EndImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getEnd()
	 * @generated
	 */
	int END = 7;

	/**
	 * The feature id for the '<em><b>Exit Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__EXIT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ON = 1;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ExceptionClassFilterImpl <em>Exception Class Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ExceptionClassFilterImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getExceptionClassFilter()
	 * @generated
	 */
	int EXCEPTION_CLASS_FILTER = 8;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CLASS_FILTER__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CLASS_FILTER__EXCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Exception Class Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CLASS_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exception Class Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CLASS_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ExcludeTypeImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getExcludeType()
	 * @generated
	 */
	int EXCLUDE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.FailImpl <em>Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.FailImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getFail()
	 * @generated
	 */
	int FAIL = 10;

	/**
	 * The feature id for the '<em><b>Exit Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL__EXIT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL__ON = 1;

	/**
	 * The number of structural features of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DECISION = 1;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW = 2;

	/**
	 * The feature id for the '<em><b>Split</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SPLIT = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STEP = 4;

	/**
	 * The feature id for the '<em><b>Transition Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TRANSITION_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__END = 6;

	/**
	 * The feature id for the '<em><b>Fail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FAIL = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NEXT = 8;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STOP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ID = 10;

	/**
	 * The feature id for the '<em><b>Next1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NEXT1 = 11;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.IncludeTypeImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemProcessorImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemProcessor()
	 * @generated
	 */
	int ITEM_PROCESSOR = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR__REF = 1;

	/**
	 * The number of structural features of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemReaderImpl <em>Item Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemReaderImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemReader()
	 * @generated
	 */
	int ITEM_READER = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_READER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_READER__REF = 1;

	/**
	 * The number of structural features of the '<em>Item Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_READER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_READER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemWriterImpl <em>Item Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemWriterImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemWriter()
	 * @generated
	 */
	int ITEM_WRITER = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WRITER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WRITER__REF = 1;

	/**
	 * The number of structural features of the '<em>Item Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WRITER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_WRITER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JobImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 16;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__LISTENERS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__GROUP = 2;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DECISION = 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FLOW = 4;

	/**
	 * The feature id for the '<em><b>Split</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SPLIT = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = 7;

	/**
	 * The feature id for the '<em><b>Restartable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RESTARTABLE = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ListenerImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getListener()
	 * @generated
	 */
	int LISTENER = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__REF = 1;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ListenersImpl <em>Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.ListenersImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getListeners()
	 * @generated
	 */
	int LISTENERS = 18;

	/**
	 * The feature id for the '<em><b>Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENERS__LISTENER = 0;

	/**
	 * The number of structural features of the '<em>Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.NextImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 19;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__ON = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__TO = 1;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 20;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MAPPER = 0;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PLAN = 1;

	/**
	 * The feature id for the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__COLLECTOR = 2;

	/**
	 * The feature id for the '<em><b>Analyzer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ANALYZER = 3;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__REDUCER = 4;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionMapperImpl <em>Partition Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionMapperImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionMapper()
	 * @generated
	 */
	int PARTITION_MAPPER = 21;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_MAPPER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_MAPPER__REF = 1;

	/**
	 * The number of structural features of the '<em>Partition Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_MAPPER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl <em>Partition Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionPlan()
	 * @generated
	 */
	int PARTITION_PLAN = 22;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PLAN__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PLAN__PARTITIONS = 1;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PLAN__THREADS = 2;

	/**
	 * The number of structural features of the '<em>Partition Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PLAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Partition Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionReducerImpl <em>Partition Reducer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionReducerImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionReducer()
	 * @generated
	 */
	int PARTITION_REDUCER = 23;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_REDUCER__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_REDUCER__REF = 1;

	/**
	 * The number of structural features of the '<em>Partition Reducer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_REDUCER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition Reducer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_REDUCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PropertiesImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 24;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PARTITION = 1;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.PropertyImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.SplitImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 26;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__ID = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.StepImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 27;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LISTENERS = 1;

	/**
	 * The feature id for the '<em><b>Batchlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BATCHLET = 2;

	/**
	 * The feature id for the '<em><b>Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CHUNK = 3;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARTITION = 4;

	/**
	 * The feature id for the '<em><b>Transition Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TRANSITION_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__END = 6;

	/**
	 * The feature id for the '<em><b>Fail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__FAIL = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT = 8;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STOP = 9;

	/**
	 * The feature id for the '<em><b>Allow Start If Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ALLOW_START_IF_COMPLETE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 11;

	/**
	 * The feature id for the '<em><b>Next1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT1 = 12;

	/**
	 * The feature id for the '<em><b>Start Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__START_LIMIT = 13;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.StopImpl
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 28;

	/**
	 * The feature id for the '<em><b>Exit Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__EXIT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ON = 1;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__RESTART = 2;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Artifact Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getArtifactRef()
	 * @generated
	 */
	int ARTIFACT_REF = 29;


	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Analyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Analyzer
	 * @generated
	 */
	EClass getAnalyzer();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Analyzer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Analyzer#getProperties()
	 * @see #getAnalyzer()
	 * @generated
	 */
	EReference getAnalyzer_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Analyzer#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Analyzer#getRef()
	 * @see #getAnalyzer()
	 * @generated
	 */
	EAttribute getAnalyzer_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Batchlet <em>Batchlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batchlet</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Batchlet
	 * @generated
	 */
	EClass getBatchlet();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Batchlet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Batchlet#getProperties()
	 * @see #getBatchlet()
	 * @generated
	 */
	EReference getBatchlet_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Batchlet#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Batchlet#getRef()
	 * @see #getBatchlet()
	 * @generated
	 */
	EAttribute getBatchlet_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm <em>Checkpoint Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkpoint Algorithm</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm
	 * @generated
	 */
	EClass getCheckpointAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm#getProperties()
	 * @see #getCheckpointAlgorithm()
	 * @generated
	 */
	EReference getCheckpointAlgorithm_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm#getRef()
	 * @see #getCheckpointAlgorithm()
	 * @generated
	 */
	EAttribute getCheckpointAlgorithm_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reader</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getReader()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_Reader();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getProcessor()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_Processor();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Writer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getWriter()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_Writer();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointAlgorithm <em>Checkpoint Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkpoint Algorithm</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointAlgorithm()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_CheckpointAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkippableExceptionClasses <em>Skippable Exception Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skippable Exception Classes</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getSkippableExceptionClasses()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_SkippableExceptionClasses();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryableExceptionClasses <em>Retryable Exception Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retryable Exception Classes</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryableExceptionClasses()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_RetryableExceptionClasses();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getNoRollbackExceptionClasses <em>No Rollback Exception Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Rollback Exception Classes</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getNoRollbackExceptionClasses()
	 * @see #getChunk()
	 * @generated
	 */
	EReference getChunk_NoRollbackExceptionClasses();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointPolicy <em>Checkpoint Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkpoint Policy</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointPolicy()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_CheckpointPolicy();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getItemCount <em>Item Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Count</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getItemCount()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_ItemCount();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryLimit <em>Retry Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Limit</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryLimit()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_RetryLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkipLimit <em>Skip Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Limit</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getSkipLimit()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_SkipLimit();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk#getTimeLimit()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_TimeLimit();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Collector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collector</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Collector
	 * @generated
	 */
	EClass getCollector();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Collector#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Collector#getProperties()
	 * @see #getCollector()
	 * @generated
	 */
	EReference getCollector_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Collector#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Collector#getRef()
	 * @see #getCollector()
	 * @generated
	 */
	EAttribute getCollector_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getProperties()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Properties();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getTransitionElements <em>Transition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition Elements</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getTransitionElements()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_TransitionElements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getEnd()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_End();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getFail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fail</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getFail()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Fail();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getNext()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getStop()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_Stop();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getId()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Decision#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision#getRef()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot#getJob()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Job();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.End#getExitStatus <em>Exit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Status</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.End#getExitStatus()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_ExitStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.End#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.End#getOn()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_On();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter <em>Exception Class Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Class Filter</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter
	 * @generated
	 */
	EClass getExceptionClassFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getInclude()
	 * @see #getExceptionClassFilter()
	 * @generated
	 */
	EReference getExceptionClassFilter_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getExclude()
	 * @see #getExceptionClassFilter()
	 * @generated
	 */
	EReference getExceptionClassFilter_Exclude();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Type</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExcludeType
	 * @generated
	 */
	EClass getExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.ExcludeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExcludeType#getClass_()
	 * @see #getExcludeType()
	 * @generated
	 */
	EAttribute getExcludeType_Class();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Fail
	 * @generated
	 */
	EClass getFail();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Fail#getExitStatus <em>Exit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Status</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Fail#getExitStatus()
	 * @see #getFail()
	 * @generated
	 */
	EAttribute getFail_ExitStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Fail#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Fail#getOn()
	 * @see #getFail()
	 * @generated
	 */
	EAttribute getFail_On();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getGroup()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getDecision()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Decision();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getFlow()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getSplit()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Split();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getStep()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Step();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getTransitionElements <em>Transition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition Elements</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getTransitionElements()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_TransitionElements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getEnd()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_End();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getFail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fail</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getFail()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Fail();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getNext()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getStop()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Stop();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getId()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getNext1 <em>Next1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next1</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow#getNext1()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Next1();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.IncludeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.IncludeType#getClass_()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Class();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Processor</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemProcessor
	 * @generated
	 */
	EClass getItemProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemProcessor#getProperties()
	 * @see #getItemProcessor()
	 * @generated
	 */
	EReference getItemProcessor_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemProcessor#getRef()
	 * @see #getItemProcessor()
	 * @generated
	 */
	EAttribute getItemProcessor_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.ItemReader <em>Item Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Reader</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemReader
	 * @generated
	 */
	EClass getItemReader();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.ItemReader#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemReader#getProperties()
	 * @see #getItemReader()
	 * @generated
	 */
	EReference getItemReader_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.ItemReader#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemReader#getRef()
	 * @see #getItemReader()
	 * @generated
	 */
	EAttribute getItemReader_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter <em>Item Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Writer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemWriter
	 * @generated
	 */
	EClass getItemWriter();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemWriter#getProperties()
	 * @see #getItemWriter()
	 * @generated
	 */
	EReference getItemWriter_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemWriter#getRef()
	 * @see #getItemWriter()
	 * @generated
	 */
	EAttribute getItemWriter_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Job#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getProperties()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Job#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listeners</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getListeners()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Listeners();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.Job#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getGroup()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Job#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getDecision()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Decision();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Job#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getFlow()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Job#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Split</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getSplit()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Split();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Job#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getStep()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Step();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Job#getRestartable <em>Restartable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restartable</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getRestartable()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Restartable();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Job#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job#getVersion()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Version();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listener
	 * @generated
	 */
	EClass getListener();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Listener#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listener#getProperties()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Listener#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listener#getRef()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Listeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listeners</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listeners
	 * @generated
	 */
	EClass getListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Listeners#getListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listener</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listeners#getListener()
	 * @see #getListeners()
	 * @generated
	 */
	EReference getListeners_Listener();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Next#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Next#getOn()
	 * @see #getNext()
	 * @generated
	 */
	EAttribute getNext_On();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Next#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Next#getTo()
	 * @see #getNext()
	 * @generated
	 */
	EAttribute getNext_To();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapper</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition#getMapper()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Mapper();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition#getPlan()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getCollector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collector</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition#getCollector()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Collector();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getAnalyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analyzer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition#getAnalyzer()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Analyzer();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reducer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition#getReducer()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Reducer();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper <em>Partition Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Mapper</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionMapper
	 * @generated
	 */
	EClass getPartitionMapper();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionMapper#getProperties()
	 * @see #getPartitionMapper()
	 * @generated
	 */
	EReference getPartitionMapper_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionMapper#getRef()
	 * @see #getPartitionMapper()
	 * @generated
	 */
	EAttribute getPartitionMapper_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan <em>Partition Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Plan</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionPlan
	 * @generated
	 */
	EClass getPartitionPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getProperties()
	 * @see #getPartitionPlan()
	 * @generated
	 */
	EReference getPartitionPlan_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partitions</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getPartitions()
	 * @see #getPartitionPlan()
	 * @generated
	 */
	EAttribute getPartitionPlan_Partitions();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threads</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getThreads()
	 * @see #getPartitionPlan()
	 * @generated
	 */
	EAttribute getPartitionPlan_Threads();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer <em>Partition Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Reducer</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionReducer
	 * @generated
	 */
	EClass getPartitionReducer();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionReducer#getProperties()
	 * @see #getPartitionReducer()
	 * @generated
	 */
	EReference getPartitionReducer_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionReducer#getRef()
	 * @see #getPartitionReducer()
	 * @generated
	 */
	EAttribute getPartitionReducer_Ref();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Properties#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Properties#getProperty()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Properties#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Properties#getPartition()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Partition();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Split#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Split#getFlow()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Flow();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Split#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Split#getId()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Split#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Split#getNext()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_Next();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Step#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getProperties()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Step#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listeners</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getListeners()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Listeners();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Step#getBatchlet <em>Batchlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Batchlet</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getBatchlet()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Batchlet();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Step#getChunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chunk</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getChunk()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Chunk();

	/**
	 * Returns the meta object for the containment reference '{@link com.worldline.jbatch.designer.model.jbatch.Step#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getPartition()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Partition();

	/**
	 * Returns the meta object for the attribute list '{@link com.worldline.jbatch.designer.model.jbatch.Step#getTransitionElements <em>Transition Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition Elements</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getTransitionElements()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_TransitionElements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Step#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getEnd()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_End();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Step#getFail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fail</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getFail()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Fail();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Step#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getNext()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link com.worldline.jbatch.designer.model.jbatch.Step#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stop</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getStop()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Stop();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Step#getAllowStartIfComplete <em>Allow Start If Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Start If Complete</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getAllowStartIfComplete()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_AllowStartIfComplete();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Step#getNext1 <em>Next1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next1</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getNext1()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Next1();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Step#getStartLimit <em>Start Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Limit</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step#getStartLimit()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StartLimit();

	/**
	 * Returns the meta object for class '{@link com.worldline.jbatch.designer.model.jbatch.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getExitStatus <em>Exit Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Status</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Stop#getExitStatus()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_ExitStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Stop#getOn()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_On();

	/**
	 * Returns the meta object for the attribute '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see com.worldline.jbatch.designer.model.jbatch.Stop#getRestart()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Restart();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact Ref</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='artifactRef' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getArtifactRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JBatchFactory getJBatchFactory();

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
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.AnalyzerImpl <em>Analyzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.AnalyzerImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getAnalyzer()
		 * @generated
		 */
		EClass ANALYZER = eINSTANCE.getAnalyzer();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZER__PROPERTIES = eINSTANCE.getAnalyzer_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZER__REF = eINSTANCE.getAnalyzer_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.BatchletImpl <em>Batchlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.BatchletImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getBatchlet()
		 * @generated
		 */
		EClass BATCHLET = eINSTANCE.getBatchlet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCHLET__PROPERTIES = eINSTANCE.getBatchlet_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCHLET__REF = eINSTANCE.getBatchlet_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.CheckpointAlgorithmImpl <em>Checkpoint Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.CheckpointAlgorithmImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getCheckpointAlgorithm()
		 * @generated
		 */
		EClass CHECKPOINT_ALGORITHM = eINSTANCE.getCheckpointAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKPOINT_ALGORITHM__PROPERTIES = eINSTANCE.getCheckpointAlgorithm_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKPOINT_ALGORITHM__REF = eINSTANCE.getCheckpointAlgorithm_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getChunk()
		 * @generated
		 */
		EClass CHUNK = eINSTANCE.getChunk();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__READER = eINSTANCE.getChunk_Reader();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__PROCESSOR = eINSTANCE.getChunk_Processor();

		/**
		 * The meta object literal for the '<em><b>Writer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__WRITER = eINSTANCE.getChunk_Writer();

		/**
		 * The meta object literal for the '<em><b>Checkpoint Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__CHECKPOINT_ALGORITHM = eINSTANCE.getChunk_CheckpointAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Skippable Exception Classes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__SKIPPABLE_EXCEPTION_CLASSES = eINSTANCE.getChunk_SkippableExceptionClasses();

		/**
		 * The meta object literal for the '<em><b>Retryable Exception Classes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__RETRYABLE_EXCEPTION_CLASSES = eINSTANCE.getChunk_RetryableExceptionClasses();

		/**
		 * The meta object literal for the '<em><b>No Rollback Exception Classes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES = eINSTANCE.getChunk_NoRollbackExceptionClasses();

		/**
		 * The meta object literal for the '<em><b>Checkpoint Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__CHECKPOINT_POLICY = eINSTANCE.getChunk_CheckpointPolicy();

		/**
		 * The meta object literal for the '<em><b>Item Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__ITEM_COUNT = eINSTANCE.getChunk_ItemCount();

		/**
		 * The meta object literal for the '<em><b>Retry Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__RETRY_LIMIT = eINSTANCE.getChunk_RetryLimit();

		/**
		 * The meta object literal for the '<em><b>Skip Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__SKIP_LIMIT = eINSTANCE.getChunk_SkipLimit();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__TIME_LIMIT = eINSTANCE.getChunk_TimeLimit();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.CollectorImpl <em>Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.CollectorImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getCollector()
		 * @generated
		 */
		EClass COLLECTOR = eINSTANCE.getCollector();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTOR__PROPERTIES = eINSTANCE.getCollector_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTOR__REF = eINSTANCE.getCollector_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__PROPERTIES = eINSTANCE.getDecision_Properties();

		/**
		 * The meta object literal for the '<em><b>Transition Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__TRANSITION_ELEMENTS = eINSTANCE.getDecision_TransitionElements();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__END = eINSTANCE.getDecision_End();

		/**
		 * The meta object literal for the '<em><b>Fail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__FAIL = eINSTANCE.getDecision_Fail();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__NEXT = eINSTANCE.getDecision_Next();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__STOP = eINSTANCE.getDecision_Stop();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__ID = eINSTANCE.getDecision_Id();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__REF = eINSTANCE.getDecision_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.DocumentRootImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__JOB = eINSTANCE.getDocumentRoot_Job();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.EndImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Exit Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__EXIT_STATUS = eINSTANCE.getEnd_ExitStatus();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__ON = eINSTANCE.getEnd_On();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ExceptionClassFilterImpl <em>Exception Class Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ExceptionClassFilterImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getExceptionClassFilter()
		 * @generated
		 */
		EClass EXCEPTION_CLASS_FILTER = eINSTANCE.getExceptionClassFilter();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_CLASS_FILTER__INCLUDE = eINSTANCE.getExceptionClassFilter_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_CLASS_FILTER__EXCLUDE = eINSTANCE.getExceptionClassFilter_Exclude();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ExcludeTypeImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getExcludeType()
		 * @generated
		 */
		EClass EXCLUDE_TYPE = eINSTANCE.getExcludeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_TYPE__CLASS = eINSTANCE.getExcludeType_Class();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.FailImpl <em>Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.FailImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getFail()
		 * @generated
		 */
		EClass FAIL = eINSTANCE.getFail();

		/**
		 * The meta object literal for the '<em><b>Exit Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIL__EXIT_STATUS = eINSTANCE.getFail_ExitStatus();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIL__ON = eINSTANCE.getFail_On();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__GROUP = eINSTANCE.getFlow_Group();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DECISION = eINSTANCE.getFlow_Decision();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW = eINSTANCE.getFlow_Flow();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SPLIT = eINSTANCE.getFlow_Split();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STEP = eINSTANCE.getFlow_Step();

		/**
		 * The meta object literal for the '<em><b>Transition Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__TRANSITION_ELEMENTS = eINSTANCE.getFlow_TransitionElements();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__END = eINSTANCE.getFlow_End();

		/**
		 * The meta object literal for the '<em><b>Fail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FAIL = eINSTANCE.getFlow_Fail();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__NEXT = eINSTANCE.getFlow_Next();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STOP = eINSTANCE.getFlow_Stop();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__ID = eINSTANCE.getFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Next1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__NEXT1 = eINSTANCE.getFlow_Next1();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.IncludeTypeImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__CLASS = eINSTANCE.getIncludeType_Class();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemProcessorImpl <em>Item Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemProcessorImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemProcessor()
		 * @generated
		 */
		EClass ITEM_PROCESSOR = eINSTANCE.getItemProcessor();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESSOR__PROPERTIES = eINSTANCE.getItemProcessor_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PROCESSOR__REF = eINSTANCE.getItemProcessor_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemReaderImpl <em>Item Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemReaderImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemReader()
		 * @generated
		 */
		EClass ITEM_READER = eINSTANCE.getItemReader();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_READER__PROPERTIES = eINSTANCE.getItemReader_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_READER__REF = eINSTANCE.getItemReader_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ItemWriterImpl <em>Item Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ItemWriterImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getItemWriter()
		 * @generated
		 */
		EClass ITEM_WRITER = eINSTANCE.getItemWriter();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_WRITER__PROPERTIES = eINSTANCE.getItemWriter_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_WRITER__REF = eINSTANCE.getItemWriter_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JobImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PROPERTIES = eINSTANCE.getJob_Properties();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__LISTENERS = eINSTANCE.getJob_Listeners();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__GROUP = eINSTANCE.getJob_Group();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DECISION = eINSTANCE.getJob_Decision();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__FLOW = eINSTANCE.getJob_Flow();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SPLIT = eINSTANCE.getJob_Split();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEP = eINSTANCE.getJob_Step();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>Restartable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__RESTARTABLE = eINSTANCE.getJob_Restartable();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__VERSION = eINSTANCE.getJob_Version();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ListenerImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getListener()
		 * @generated
		 */
		EClass LISTENER = eINSTANCE.getListener();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__PROPERTIES = eINSTANCE.getListener_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__REF = eINSTANCE.getListener_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.ListenersImpl <em>Listeners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.ListenersImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getListeners()
		 * @generated
		 */
		EClass LISTENERS = eINSTANCE.getListeners();

		/**
		 * The meta object literal for the '<em><b>Listener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENERS__LISTENER = eINSTANCE.getListeners_Listener();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.NextImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT__ON = eINSTANCE.getNext_On();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT__TO = eINSTANCE.getNext_To();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__MAPPER = eINSTANCE.getPartition_Mapper();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PLAN = eINSTANCE.getPartition_Plan();

		/**
		 * The meta object literal for the '<em><b>Collector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__COLLECTOR = eINSTANCE.getPartition_Collector();

		/**
		 * The meta object literal for the '<em><b>Analyzer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__ANALYZER = eINSTANCE.getPartition_Analyzer();

		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__REDUCER = eINSTANCE.getPartition_Reducer();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionMapperImpl <em>Partition Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionMapperImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionMapper()
		 * @generated
		 */
		EClass PARTITION_MAPPER = eINSTANCE.getPartitionMapper();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_MAPPER__PROPERTIES = eINSTANCE.getPartitionMapper_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_MAPPER__REF = eINSTANCE.getPartitionMapper_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl <em>Partition Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionPlan()
		 * @generated
		 */
		EClass PARTITION_PLAN = eINSTANCE.getPartitionPlan();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_PLAN__PROPERTIES = eINSTANCE.getPartitionPlan_Properties();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_PLAN__PARTITIONS = eINSTANCE.getPartitionPlan_Partitions();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_PLAN__THREADS = eINSTANCE.getPartitionPlan_Threads();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionReducerImpl <em>Partition Reducer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PartitionReducerImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getPartitionReducer()
		 * @generated
		 */
		EClass PARTITION_REDUCER = eINSTANCE.getPartitionReducer();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION_REDUCER__PROPERTIES = eINSTANCE.getPartitionReducer_Properties();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_REDUCER__REF = eINSTANCE.getPartitionReducer_Ref();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PropertiesImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTY = eINSTANCE.getProperties_Property();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PARTITION = eINSTANCE.getProperties_Partition();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.PropertyImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.SplitImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__FLOW = eINSTANCE.getSplit_Flow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__ID = eINSTANCE.getSplit_Id();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__NEXT = eINSTANCE.getSplit_Next();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.StepImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PROPERTIES = eINSTANCE.getStep_Properties();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LISTENERS = eINSTANCE.getStep_Listeners();

		/**
		 * The meta object literal for the '<em><b>Batchlet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__BATCHLET = eINSTANCE.getStep_Batchlet();

		/**
		 * The meta object literal for the '<em><b>Chunk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CHUNK = eINSTANCE.getStep_Chunk();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARTITION = eINSTANCE.getStep_Partition();

		/**
		 * The meta object literal for the '<em><b>Transition Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TRANSITION_ELEMENTS = eINSTANCE.getStep_TransitionElements();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__END = eINSTANCE.getStep_End();

		/**
		 * The meta object literal for the '<em><b>Fail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__FAIL = eINSTANCE.getStep_Fail();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT = eINSTANCE.getStep_Next();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STOP = eINSTANCE.getStep_Stop();

		/**
		 * The meta object literal for the '<em><b>Allow Start If Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ALLOW_START_IF_COMPLETE = eINSTANCE.getStep_AllowStartIfComplete();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>Next1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NEXT1 = eINSTANCE.getStep_Next1();

		/**
		 * The meta object literal for the '<em><b>Start Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__START_LIMIT = eINSTANCE.getStep_StartLimit();

		/**
		 * The meta object literal for the '{@link com.worldline.jbatch.designer.model.jbatch.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.StopImpl
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Exit Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__EXIT_STATUS = eINSTANCE.getStop_ExitStatus();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__ON = eINSTANCE.getStop_On();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__RESTART = eINSTANCE.getStop_Restart();

		/**
		 * The meta object literal for the '<em>Artifact Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.worldline.jbatch.designer.model.jbatch.impl.JBatchPackageImpl#getArtifactRef()
		 * @generated
		 */
		EDataType ARTIFACT_REF = eINSTANCE.getArtifactRef();

	}

} //JBatchPackage
