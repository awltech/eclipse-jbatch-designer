/**
 */
package com.worldline.jbatch.designer.model.jbatch.provider;


import com.worldline.jbatch.designer.model.jbatch.Chunk;
import com.worldline.jbatch.designer.model.jbatch.JBatchFactory;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Chunk} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChunkItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCheckpointPolicyPropertyDescriptor(object);
			addItemCountPropertyDescriptor(object);
			addRetryLimitPropertyDescriptor(object);
			addSkipLimitPropertyDescriptor(object);
			addTimeLimitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Checkpoint Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckpointPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chunk_checkpointPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chunk_checkpointPolicy_feature", "_UI_Chunk_type"),
				 JBatchPackage.Literals.CHUNK__CHECKPOINT_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chunk_itemCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chunk_itemCount_feature", "_UI_Chunk_type"),
				 JBatchPackage.Literals.CHUNK__ITEM_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retry Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetryLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chunk_retryLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chunk_retryLimit_feature", "_UI_Chunk_type"),
				 JBatchPackage.Literals.CHUNK__RETRY_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skip Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkipLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chunk_skipLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chunk_skipLimit_feature", "_UI_Chunk_type"),
				 JBatchPackage.Literals.CHUNK__SKIP_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chunk_timeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chunk_timeLimit_feature", "_UI_Chunk_type"),
				 JBatchPackage.Literals.CHUNK__TIME_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__READER);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__PROCESSOR);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__WRITER);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__CHECKPOINT_ALGORITHM);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__SKIPPABLE_EXCEPTION_CLASSES);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__RETRYABLE_EXCEPTION_CLASSES);
			childrenFeatures.add(JBatchPackage.Literals.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Chunk.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Chunk"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Chunk)object).getCheckpointPolicy();
		return label == null || label.length() == 0 ?
			getString("_UI_Chunk_type") :
			getString("_UI_Chunk_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Chunk.class)) {
			case JBatchPackage.CHUNK__CHECKPOINT_POLICY:
			case JBatchPackage.CHUNK__ITEM_COUNT:
			case JBatchPackage.CHUNK__RETRY_LIMIT:
			case JBatchPackage.CHUNK__SKIP_LIMIT:
			case JBatchPackage.CHUNK__TIME_LIMIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JBatchPackage.CHUNK__READER:
			case JBatchPackage.CHUNK__PROCESSOR:
			case JBatchPackage.CHUNK__WRITER:
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__READER,
				 JBatchFactory.eINSTANCE.createItemReader()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__PROCESSOR,
				 JBatchFactory.eINSTANCE.createItemProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__WRITER,
				 JBatchFactory.eINSTANCE.createItemWriter()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__CHECKPOINT_ALGORITHM,
				 JBatchFactory.eINSTANCE.createCheckpointAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__SKIPPABLE_EXCEPTION_CLASSES,
				 JBatchFactory.eINSTANCE.createExceptionClassFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__RETRYABLE_EXCEPTION_CLASSES,
				 JBatchFactory.eINSTANCE.createExceptionClassFilter()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES,
				 JBatchFactory.eINSTANCE.createExceptionClassFilter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == JBatchPackage.Literals.CHUNK__SKIPPABLE_EXCEPTION_CLASSES ||
			childFeature == JBatchPackage.Literals.CHUNK__RETRYABLE_EXCEPTION_CLASSES ||
			childFeature == JBatchPackage.Literals.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JBatchEditPlugin.INSTANCE;
	}

}
