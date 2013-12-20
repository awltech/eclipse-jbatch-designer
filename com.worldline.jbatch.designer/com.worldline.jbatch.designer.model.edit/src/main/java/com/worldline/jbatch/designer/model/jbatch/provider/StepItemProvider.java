/**
 */
package com.worldline.jbatch.designer.model.jbatch.provider;


import com.worldline.jbatch.designer.model.jbatch.JBatchFactory;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Step;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link com.worldline.jbatch.designer.model.jbatch.Step} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StepItemProvider
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
	public StepItemProvider(AdapterFactory adapterFactory) {
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

			addAllowStartIfCompletePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNext1PropertyDescriptor(object);
			addStartLimitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allow Start If Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowStartIfCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_allowStartIfComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_allowStartIfComplete_feature", "_UI_Step_type"),
				 JBatchPackage.Literals.STEP__ALLOW_START_IF_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_id_feature", "_UI_Step_type"),
				 JBatchPackage.Literals.STEP__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNext1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_next1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_next1_feature", "_UI_Step_type"),
				 JBatchPackage.Literals.STEP__NEXT1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Step_startLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Step_startLimit_feature", "_UI_Step_type"),
				 JBatchPackage.Literals.STEP__START_LIMIT,
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
			childrenFeatures.add(JBatchPackage.Literals.STEP__PROPERTIES);
			childrenFeatures.add(JBatchPackage.Literals.STEP__LISTENERS);
			childrenFeatures.add(JBatchPackage.Literals.STEP__BATCHLET);
			childrenFeatures.add(JBatchPackage.Literals.STEP__CHUNK);
			childrenFeatures.add(JBatchPackage.Literals.STEP__PARTITION);
			childrenFeatures.add(JBatchPackage.Literals.STEP__TRANSITION_ELEMENTS);
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
	 * This returns Step.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Step"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Step)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Step_type") :
			getString("_UI_Step_type") + " " + label;
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

		switch (notification.getFeatureID(Step.class)) {
			case JBatchPackage.STEP__ALLOW_START_IF_COMPLETE:
			case JBatchPackage.STEP__ID:
			case JBatchPackage.STEP__NEXT1:
			case JBatchPackage.STEP__START_LIMIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JBatchPackage.STEP__PROPERTIES:
			case JBatchPackage.STEP__LISTENERS:
			case JBatchPackage.STEP__BATCHLET:
			case JBatchPackage.STEP__CHUNK:
			case JBatchPackage.STEP__PARTITION:
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
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
				(JBatchPackage.Literals.STEP__PROPERTIES,
				 JBatchFactory.eINSTANCE.createProperties()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__LISTENERS,
				 JBatchFactory.eINSTANCE.createListeners()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__BATCHLET,
				 JBatchFactory.eINSTANCE.createBatchlet()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__CHUNK,
				 JBatchFactory.eINSTANCE.createChunk()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__PARTITION,
				 JBatchFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__TRANSITION_ELEMENTS,
				 FeatureMapUtil.createEntry
					(JBatchPackage.Literals.STEP__END,
					 JBatchFactory.eINSTANCE.createEnd())));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__TRANSITION_ELEMENTS,
				 FeatureMapUtil.createEntry
					(JBatchPackage.Literals.STEP__FAIL,
					 JBatchFactory.eINSTANCE.createFail())));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__TRANSITION_ELEMENTS,
				 FeatureMapUtil.createEntry
					(JBatchPackage.Literals.STEP__NEXT,
					 JBatchFactory.eINSTANCE.createNext())));

		newChildDescriptors.add
			(createChildParameter
				(JBatchPackage.Literals.STEP__TRANSITION_ELEMENTS,
				 FeatureMapUtil.createEntry
					(JBatchPackage.Literals.STEP__STOP,
					 JBatchFactory.eINSTANCE.createStop())));
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
