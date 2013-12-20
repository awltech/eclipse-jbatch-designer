/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Decision;
import com.worldline.jbatch.designer.model.jbatch.Flow;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Job;
import com.worldline.jbatch.designer.model.jbatch.Listeners;
import com.worldline.jbatch.designer.model.jbatch.Properties;
import com.worldline.jbatch.designer.model.jbatch.Split;
import com.worldline.jbatch.designer.model.jbatch.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getStep <em>Step</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getRestartable <em>Restartable</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.JobImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected Listeners listeners;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartable() <em>Restartable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartable()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTARTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartable() <em>Restartable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartable()
	 * @generated
	 * @ordered
	 */
	protected String restartable = RESTARTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.JOB__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.JOB__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listeners getListeners() {
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListeners(Listeners newListeners, NotificationChain msgs) {
		Listeners oldListeners = listeners;
		listeners = newListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__LISTENERS, oldListeners, newListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListeners(Listeners newListeners) {
		if (newListeners != listeners) {
			NotificationChain msgs = null;
			if (listeners != null)
				msgs = ((InternalEObject)listeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.JOB__LISTENERS, null, msgs);
			if (newListeners != null)
				msgs = ((InternalEObject)newListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.JOB__LISTENERS, null, msgs);
			msgs = basicSetListeners(newListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__LISTENERS, newListeners, newListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, JBatchPackage.JOB__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecision() {
		return getGroup().list(JBatchPackage.Literals.JOB__DECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlow() {
		return getGroup().list(JBatchPackage.Literals.JOB__FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Split> getSplit() {
		return getGroup().list(JBatchPackage.Literals.JOB__SPLIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		return getGroup().list(JBatchPackage.Literals.JOB__STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestartable() {
		return restartable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartable(String newRestartable) {
		String oldRestartable = restartable;
		restartable = newRestartable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__RESTARTABLE, oldRestartable, restartable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.JOB__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JBatchPackage.JOB__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.JOB__PROPERTIES:
				return basicSetProperties(null, msgs);
			case JBatchPackage.JOB__LISTENERS:
				return basicSetListeners(null, msgs);
			case JBatchPackage.JOB__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case JBatchPackage.JOB__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case JBatchPackage.JOB__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case JBatchPackage.JOB__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case JBatchPackage.JOB__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case JBatchPackage.JOB__PROPERTIES:
				return getProperties();
			case JBatchPackage.JOB__LISTENERS:
				return getListeners();
			case JBatchPackage.JOB__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case JBatchPackage.JOB__DECISION:
				return getDecision();
			case JBatchPackage.JOB__FLOW:
				return getFlow();
			case JBatchPackage.JOB__SPLIT:
				return getSplit();
			case JBatchPackage.JOB__STEP:
				return getStep();
			case JBatchPackage.JOB__ID:
				return getId();
			case JBatchPackage.JOB__RESTARTABLE:
				return getRestartable();
			case JBatchPackage.JOB__VERSION:
				return getVersion();
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
			case JBatchPackage.JOB__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case JBatchPackage.JOB__LISTENERS:
				setListeners((Listeners)newValue);
				return;
			case JBatchPackage.JOB__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case JBatchPackage.JOB__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends Decision>)newValue);
				return;
			case JBatchPackage.JOB__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case JBatchPackage.JOB__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends Split>)newValue);
				return;
			case JBatchPackage.JOB__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case JBatchPackage.JOB__ID:
				setId((String)newValue);
				return;
			case JBatchPackage.JOB__RESTARTABLE:
				setRestartable((String)newValue);
				return;
			case JBatchPackage.JOB__VERSION:
				setVersion((String)newValue);
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
			case JBatchPackage.JOB__PROPERTIES:
				setProperties((Properties)null);
				return;
			case JBatchPackage.JOB__LISTENERS:
				setListeners((Listeners)null);
				return;
			case JBatchPackage.JOB__GROUP:
				getGroup().clear();
				return;
			case JBatchPackage.JOB__DECISION:
				getDecision().clear();
				return;
			case JBatchPackage.JOB__FLOW:
				getFlow().clear();
				return;
			case JBatchPackage.JOB__SPLIT:
				getSplit().clear();
				return;
			case JBatchPackage.JOB__STEP:
				getStep().clear();
				return;
			case JBatchPackage.JOB__ID:
				setId(ID_EDEFAULT);
				return;
			case JBatchPackage.JOB__RESTARTABLE:
				setRestartable(RESTARTABLE_EDEFAULT);
				return;
			case JBatchPackage.JOB__VERSION:
				unsetVersion();
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
			case JBatchPackage.JOB__PROPERTIES:
				return properties != null;
			case JBatchPackage.JOB__LISTENERS:
				return listeners != null;
			case JBatchPackage.JOB__GROUP:
				return group != null && !group.isEmpty();
			case JBatchPackage.JOB__DECISION:
				return !getDecision().isEmpty();
			case JBatchPackage.JOB__FLOW:
				return !getFlow().isEmpty();
			case JBatchPackage.JOB__SPLIT:
				return !getSplit().isEmpty();
			case JBatchPackage.JOB__STEP:
				return !getStep().isEmpty();
			case JBatchPackage.JOB__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JBatchPackage.JOB__RESTARTABLE:
				return RESTARTABLE_EDEFAULT == null ? restartable != null : !RESTARTABLE_EDEFAULT.equals(restartable);
			case JBatchPackage.JOB__VERSION:
				return isSetVersion();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", restartable: ");
		result.append(restartable);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //JobImpl
