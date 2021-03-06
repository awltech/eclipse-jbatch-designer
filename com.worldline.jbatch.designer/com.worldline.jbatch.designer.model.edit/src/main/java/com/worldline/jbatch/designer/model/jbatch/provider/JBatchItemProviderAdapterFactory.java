/**
 */
package com.worldline.jbatch.designer.model.jbatch.provider;

import com.worldline.jbatch.designer.model.jbatch.util.JBatchAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JBatchItemProviderAdapterFactory extends JBatchAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JBatchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Analyzer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyzerItemProvider analyzerItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Analyzer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalyzerAdapter() {
		if (analyzerItemProvider == null) {
			analyzerItemProvider = new AnalyzerItemProvider(this);
		}

		return analyzerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Batchlet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatchletItemProvider batchletItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Batchlet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBatchletAdapter() {
		if (batchletItemProvider == null) {
			batchletItemProvider = new BatchletItemProvider(this);
		}

		return batchletItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckpointAlgorithmItemProvider checkpointAlgorithmItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckpointAlgorithmAdapter() {
		if (checkpointAlgorithmItemProvider == null) {
			checkpointAlgorithmItemProvider = new CheckpointAlgorithmItemProvider(this);
		}

		return checkpointAlgorithmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Chunk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkItemProvider chunkItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Chunk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChunkAdapter() {
		if (chunkItemProvider == null) {
			chunkItemProvider = new ChunkItemProvider(this);
		}

		return chunkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Collector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectorItemProvider collectorItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Collector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectorAdapter() {
		if (collectorItemProvider == null) {
			collectorItemProvider = new CollectorItemProvider(this);
		}

		return collectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Decision} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionItemProvider decisionItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Decision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionAdapter() {
		if (decisionItemProvider == null) {
			decisionItemProvider = new DecisionItemProvider(this);
		}

		return decisionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.End} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndItemProvider endItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.End}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndAdapter() {
		if (endItemProvider == null) {
			endItemProvider = new EndItemProvider(this);
		}

		return endItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionClassFilterItemProvider exceptionClassFilterItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExceptionClassFilterAdapter() {
		if (exceptionClassFilterItemProvider == null) {
			exceptionClassFilterItemProvider = new ExceptionClassFilterItemProvider(this);
		}

		return exceptionClassFilterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.ExcludeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcludeTypeItemProvider excludeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.ExcludeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExcludeTypeAdapter() {
		if (excludeTypeItemProvider == null) {
			excludeTypeItemProvider = new ExcludeTypeItemProvider(this);
		}

		return excludeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Fail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailItemProvider failItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Fail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailAdapter() {
		if (failItemProvider == null) {
			failItemProvider = new FailItemProvider(this);
		}

		return failItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.IncludeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeTypeItemProvider includeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncludeTypeAdapter() {
		if (includeTypeItemProvider == null) {
			includeTypeItemProvider = new IncludeTypeItemProvider(this);
		}

		return includeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemProcessorItemProvider itemProcessorItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.ItemProcessor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemProcessorAdapter() {
		if (itemProcessorItemProvider == null) {
			itemProcessorItemProvider = new ItemProcessorItemProvider(this);
		}

		return itemProcessorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.ItemReader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemReaderItemProvider itemReaderItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.ItemReader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemReaderAdapter() {
		if (itemReaderItemProvider == null) {
			itemReaderItemProvider = new ItemReaderItemProvider(this);
		}

		return itemReaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.ItemWriter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemWriterItemProvider itemWriterItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.ItemWriter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemWriterAdapter() {
		if (itemWriterItemProvider == null) {
			itemWriterItemProvider = new ItemWriterItemProvider(this);
		}

		return itemWriterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Job} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobItemProvider jobItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobAdapter() {
		if (jobItemProvider == null) {
			jobItemProvider = new JobItemProvider(this);
		}

		return jobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Listener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListenerItemProvider listenerItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Listener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListenerAdapter() {
		if (listenerItemProvider == null) {
			listenerItemProvider = new ListenerItemProvider(this);
		}

		return listenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Listeners} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListenersItemProvider listenersItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Listeners}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListenersAdapter() {
		if (listenersItemProvider == null) {
			listenersItemProvider = new ListenersItemProvider(this);
		}

		return listenersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Next} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextItemProvider nextItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Next}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNextAdapter() {
		if (nextItemProvider == null) {
			nextItemProvider = new NextItemProvider(this);
		}

		return nextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Partition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionItemProvider partitionItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionAdapter() {
		if (partitionItemProvider == null) {
			partitionItemProvider = new PartitionItemProvider(this);
		}

		return partitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionMapperItemProvider partitionMapperItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.PartitionMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionMapperAdapter() {
		if (partitionMapperItemProvider == null) {
			partitionMapperItemProvider = new PartitionMapperItemProvider(this);
		}

		return partitionMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionPlanItemProvider partitionPlanItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionPlanAdapter() {
		if (partitionPlanItemProvider == null) {
			partitionPlanItemProvider = new PartitionPlanItemProvider(this);
		}

		return partitionPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionReducerItemProvider partitionReducerItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.PartitionReducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionReducerAdapter() {
		if (partitionReducerItemProvider == null) {
			partitionReducerItemProvider = new PartitionReducerItemProvider(this);
		}

		return partitionReducerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Properties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if (propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Split} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitItemProvider splitItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Split}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitAdapter() {
		if (splitItemProvider == null) {
			splitItemProvider = new SplitItemProvider(this);
		}

		return splitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.worldline.jbatch.designer.model.jbatch.Stop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopItemProvider stopItemProvider;

	/**
	 * This creates an adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStopAdapter() {
		if (stopItemProvider == null) {
			stopItemProvider = new StopItemProvider(this);
		}

		return stopItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (analyzerItemProvider != null) analyzerItemProvider.dispose();
		if (batchletItemProvider != null) batchletItemProvider.dispose();
		if (checkpointAlgorithmItemProvider != null) checkpointAlgorithmItemProvider.dispose();
		if (chunkItemProvider != null) chunkItemProvider.dispose();
		if (collectorItemProvider != null) collectorItemProvider.dispose();
		if (decisionItemProvider != null) decisionItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (endItemProvider != null) endItemProvider.dispose();
		if (exceptionClassFilterItemProvider != null) exceptionClassFilterItemProvider.dispose();
		if (excludeTypeItemProvider != null) excludeTypeItemProvider.dispose();
		if (failItemProvider != null) failItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (includeTypeItemProvider != null) includeTypeItemProvider.dispose();
		if (itemProcessorItemProvider != null) itemProcessorItemProvider.dispose();
		if (itemReaderItemProvider != null) itemReaderItemProvider.dispose();
		if (itemWriterItemProvider != null) itemWriterItemProvider.dispose();
		if (jobItemProvider != null) jobItemProvider.dispose();
		if (listenerItemProvider != null) listenerItemProvider.dispose();
		if (listenersItemProvider != null) listenersItemProvider.dispose();
		if (nextItemProvider != null) nextItemProvider.dispose();
		if (partitionItemProvider != null) partitionItemProvider.dispose();
		if (partitionMapperItemProvider != null) partitionMapperItemProvider.dispose();
		if (partitionPlanItemProvider != null) partitionPlanItemProvider.dispose();
		if (partitionReducerItemProvider != null) partitionReducerItemProvider.dispose();
		if (propertiesItemProvider != null) propertiesItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (splitItemProvider != null) splitItemProvider.dispose();
		if (stepItemProvider != null) stepItemProvider.dispose();
		if (stopItemProvider != null) stopItemProvider.dispose();
	}

}
