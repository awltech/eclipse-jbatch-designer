/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Decision;
import com.worldline.jbatch.designer.model.jbatch.End;
import com.worldline.jbatch.designer.model.jbatch.Fail;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Next;
import com.worldline.jbatch.designer.model.jbatch.Properties;
import com.worldline.jbatch.designer.model.jbatch.Stop;

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
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.DecisionImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision {
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
	 * The cached value of the '{@link #getTransitionElements() <em>Transition Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionElements()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap transitionElements;

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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.DECISION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.DECISION__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.DECISION__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.DECISION__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.DECISION__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTransitionElements() {
		if (transitionElements == null) {
			transitionElements = new BasicFeatureMap(this, JBatchPackage.DECISION__TRANSITION_ELEMENTS);
		}
		return transitionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<End> getEnd() {
		return getTransitionElements().list(JBatchPackage.Literals.DECISION__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fail> getFail() {
		return getTransitionElements().list(JBatchPackage.Literals.DECISION__FAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Next> getNext() {
		return getTransitionElements().list(JBatchPackage.Literals.DECISION__NEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stop> getStop() {
		return getTransitionElements().list(JBatchPackage.Literals.DECISION__STOP);
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.DECISION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.DECISION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.DECISION__PROPERTIES:
				return basicSetProperties(null, msgs);
			case JBatchPackage.DECISION__TRANSITION_ELEMENTS:
				return ((InternalEList<?>)getTransitionElements()).basicRemove(otherEnd, msgs);
			case JBatchPackage.DECISION__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case JBatchPackage.DECISION__FAIL:
				return ((InternalEList<?>)getFail()).basicRemove(otherEnd, msgs);
			case JBatchPackage.DECISION__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case JBatchPackage.DECISION__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
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
			case JBatchPackage.DECISION__PROPERTIES:
				return getProperties();
			case JBatchPackage.DECISION__TRANSITION_ELEMENTS:
				if (coreType) return getTransitionElements();
				return ((FeatureMap.Internal)getTransitionElements()).getWrapper();
			case JBatchPackage.DECISION__END:
				return getEnd();
			case JBatchPackage.DECISION__FAIL:
				return getFail();
			case JBatchPackage.DECISION__NEXT:
				return getNext();
			case JBatchPackage.DECISION__STOP:
				return getStop();
			case JBatchPackage.DECISION__ID:
				return getId();
			case JBatchPackage.DECISION__REF:
				return getRef();
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
			case JBatchPackage.DECISION__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case JBatchPackage.DECISION__TRANSITION_ELEMENTS:
				((FeatureMap.Internal)getTransitionElements()).set(newValue);
				return;
			case JBatchPackage.DECISION__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends End>)newValue);
				return;
			case JBatchPackage.DECISION__FAIL:
				getFail().clear();
				getFail().addAll((Collection<? extends Fail>)newValue);
				return;
			case JBatchPackage.DECISION__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Next>)newValue);
				return;
			case JBatchPackage.DECISION__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends Stop>)newValue);
				return;
			case JBatchPackage.DECISION__ID:
				setId((String)newValue);
				return;
			case JBatchPackage.DECISION__REF:
				setRef((String)newValue);
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
			case JBatchPackage.DECISION__PROPERTIES:
				setProperties((Properties)null);
				return;
			case JBatchPackage.DECISION__TRANSITION_ELEMENTS:
				getTransitionElements().clear();
				return;
			case JBatchPackage.DECISION__END:
				getEnd().clear();
				return;
			case JBatchPackage.DECISION__FAIL:
				getFail().clear();
				return;
			case JBatchPackage.DECISION__NEXT:
				getNext().clear();
				return;
			case JBatchPackage.DECISION__STOP:
				getStop().clear();
				return;
			case JBatchPackage.DECISION__ID:
				setId(ID_EDEFAULT);
				return;
			case JBatchPackage.DECISION__REF:
				setRef(REF_EDEFAULT);
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
			case JBatchPackage.DECISION__PROPERTIES:
				return properties != null;
			case JBatchPackage.DECISION__TRANSITION_ELEMENTS:
				return transitionElements != null && !transitionElements.isEmpty();
			case JBatchPackage.DECISION__END:
				return !getEnd().isEmpty();
			case JBatchPackage.DECISION__FAIL:
				return !getFail().isEmpty();
			case JBatchPackage.DECISION__NEXT:
				return !getNext().isEmpty();
			case JBatchPackage.DECISION__STOP:
				return !getStop().isEmpty();
			case JBatchPackage.DECISION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JBatchPackage.DECISION__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(" (transitionElements: ");
		result.append(transitionElements);
		result.append(", id: ");
		result.append(id);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
