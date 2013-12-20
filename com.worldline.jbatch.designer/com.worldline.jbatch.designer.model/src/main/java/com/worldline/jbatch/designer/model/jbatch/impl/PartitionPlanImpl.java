/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.PartitionPlan;
import com.worldline.jbatch.designer.model.jbatch.Properties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionPlanImpl#getThreads <em>Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionPlanImpl extends MinimalEObjectImpl.Container implements PartitionPlan {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> properties;

	/**
	 * The default value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected String partitions = PARTITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected static final String THREADS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected String threads = THREADS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.PARTITION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Properties>(Properties.class, this, JBatchPackage.PARTITION_PLAN__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitions() {
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitions(String newPartitions) {
		String oldPartitions = partitions;
		partitions = newPartitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION_PLAN__PARTITIONS, oldPartitions, partitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThreads() {
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreads(String newThreads) {
		String oldThreads = threads;
		threads = newThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION_PLAN__THREADS, oldThreads, threads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.PARTITION_PLAN__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JBatchPackage.PARTITION_PLAN__PROPERTIES:
				return getProperties();
			case JBatchPackage.PARTITION_PLAN__PARTITIONS:
				return getPartitions();
			case JBatchPackage.PARTITION_PLAN__THREADS:
				return getThreads();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JBatchPackage.PARTITION_PLAN__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Properties>)newValue);
				return;
			case JBatchPackage.PARTITION_PLAN__PARTITIONS:
				setPartitions((String)newValue);
				return;
			case JBatchPackage.PARTITION_PLAN__THREADS:
				setThreads((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JBatchPackage.PARTITION_PLAN__PROPERTIES:
				getProperties().clear();
				return;
			case JBatchPackage.PARTITION_PLAN__PARTITIONS:
				setPartitions(PARTITIONS_EDEFAULT);
				return;
			case JBatchPackage.PARTITION_PLAN__THREADS:
				setThreads(THREADS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JBatchPackage.PARTITION_PLAN__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case JBatchPackage.PARTITION_PLAN__PARTITIONS:
				return PARTITIONS_EDEFAULT == null ? partitions != null : !PARTITIONS_EDEFAULT.equals(partitions);
			case JBatchPackage.PARTITION_PLAN__THREADS:
				return THREADS_EDEFAULT == null ? threads != null : !THREADS_EDEFAULT.equals(threads);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (partitions: ");
		result.append(partitions);
		result.append(", threads: ");
		result.append(threads);
		result.append(')');
		return result.toString();
	}

} //PartitionPlanImpl
