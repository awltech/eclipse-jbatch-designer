/**
 */
package com.worldline.jbatch.designer.model.jbatch.util;

import com.worldline.jbatch.designer.model.jbatch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage
 * @generated
 */
public class JBatchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JBatchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JBatchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JBatchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JBatchSwitch<Adapter> modelSwitch =
		new JBatchSwitch<Adapter>() {
			@Override
			public Adapter caseAnalyzer(Analyzer object) {
				return createAnalyzerAdapter();
			}
			@Override
			public Adapter caseBatchlet(Batchlet object) {
				return createBatchletAdapter();
			}
			@Override
			public Adapter caseCheckpointAlgorithm(CheckpointAlgorithm object) {
				return createCheckpointAlgorithmAdapter();
			}
			@Override
			public Adapter caseChunk(Chunk object) {
				return createChunkAdapter();
			}
			@Override
			public Adapter caseCollector(Collector object) {
				return createCollectorAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseExceptionClassFilter(ExceptionClassFilter object) {
				return createExceptionClassFilterAdapter();
			}
			@Override
			public Adapter caseExcludeType(ExcludeType object) {
				return createExcludeTypeAdapter();
			}
			@Override
			public Adapter caseFail(Fail object) {
				return createFailAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseItemProcessor(ItemProcessor object) {
				return createItemProcessorAdapter();
			}
			@Override
			public Adapter caseItemReader(ItemReader object) {
				return createItemReaderAdapter();
			}
			@Override
			public Adapter caseItemWriter(ItemWriter object) {
				return createItemWriterAdapter();
			}
			@Override
			public Adapter caseJob(Job object) {
				return createJobAdapter();
			}
			@Override
			public Adapter caseListener(Listener object) {
				return createListenerAdapter();
			}
			@Override
			public Adapter caseListeners(Listeners object) {
				return createListenersAdapter();
			}
			@Override
			public Adapter caseNext(Next object) {
				return createNextAdapter();
			}
			@Override
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter casePartitionMapper(PartitionMapper object) {
				return createPartitionMapperAdapter();
			}
			@Override
			public Adapter casePartitionPlan(PartitionPlan object) {
				return createPartitionPlanAdapter();
			}
			@Override
			public Adapter casePartitionReducer(PartitionReducer object) {
				return createPartitionReducerAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Analyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Analyzer
	 * @generated
	 */
	public Adapter createAnalyzerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Batchlet <em>Batchlet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Batchlet
	 * @generated
	 */
	public Adapter createBatchletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm <em>Checkpoint Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm
	 * @generated
	 */
	public Adapter createCheckpointAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Chunk
	 * @generated
	 */
	public Adapter createChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Collector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Collector
	 * @generated
	 */
	public Adapter createCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter <em>Exception Class Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter
	 * @generated
	 */
	public Adapter createExceptionClassFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.ExcludeType
	 * @generated
	 */
	public Adapter createExcludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Fail
	 * @generated
	 */
	public Adapter createFailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor <em>Item Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemProcessor
	 * @generated
	 */
	public Adapter createItemProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.ItemReader <em>Item Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemReader
	 * @generated
	 */
	public Adapter createItemReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter <em>Item Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.ItemWriter
	 * @generated
	 */
	public Adapter createItemWriterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listener
	 * @generated
	 */
	public Adapter createListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Listeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Listeners
	 * @generated
	 */
	public Adapter createListenersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Next
	 * @generated
	 */
	public Adapter createNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper <em>Partition Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionMapper
	 * @generated
	 */
	public Adapter createPartitionMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan <em>Partition Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionPlan
	 * @generated
	 */
	public Adapter createPartitionPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer <em>Partition Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.PartitionReducer
	 * @generated
	 */
	public Adapter createPartitionReducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.worldline.jbatch.designer.model.jbatch.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.worldline.jbatch.designer.model.jbatch.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JBatchAdapterFactory
