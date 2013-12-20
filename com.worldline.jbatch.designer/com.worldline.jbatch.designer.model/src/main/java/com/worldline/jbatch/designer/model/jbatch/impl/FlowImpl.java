/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Decision;
import com.worldline.jbatch.designer.model.jbatch.End;
import com.worldline.jbatch.designer.model.jbatch.Fail;
import com.worldline.jbatch.designer.model.jbatch.Flow;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Next;
import com.worldline.jbatch.designer.model.jbatch.Split;
import com.worldline.jbatch.designer.model.jbatch.Step;
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
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getStep <em>Step</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.FlowImpl#getNext1 <em>Next1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends MinimalEObjectImpl.Container implements Flow {
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
	 * The default value of the '{@link #getNext1() <em>Next1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext1()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext1() <em>Next1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext1()
	 * @generated
	 * @ordered
	 */
	protected String next1 = NEXT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, JBatchPackage.FLOW__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decision> getDecision() {
		return getGroup().list(JBatchPackage.Literals.FLOW__DECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlow() {
		return getGroup().list(JBatchPackage.Literals.FLOW__FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Split> getSplit() {
		return getGroup().list(JBatchPackage.Literals.FLOW__SPLIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		return getGroup().list(JBatchPackage.Literals.FLOW__STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTransitionElements() {
		if (transitionElements == null) {
			transitionElements = new BasicFeatureMap(this, JBatchPackage.FLOW__TRANSITION_ELEMENTS);
		}
		return transitionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<End> getEnd() {
		return getTransitionElements().list(JBatchPackage.Literals.FLOW__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fail> getFail() {
		return getTransitionElements().list(JBatchPackage.Literals.FLOW__FAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Next> getNext() {
		return getTransitionElements().list(JBatchPackage.Literals.FLOW__NEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stop> getStop() {
		return getTransitionElements().list(JBatchPackage.Literals.FLOW__STOP);
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNext1() {
		return next1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext1(String newNext1) {
		String oldNext1 = next1;
		next1 = newNext1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.FLOW__NEXT1, oldNext1, next1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.FLOW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__DECISION:
				return ((InternalEList<?>)getDecision()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__SPLIT:
				return ((InternalEList<?>)getSplit()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__TRANSITION_ELEMENTS:
				return ((InternalEList<?>)getTransitionElements()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__FAIL:
				return ((InternalEList<?>)getFail()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case JBatchPackage.FLOW__STOP:
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
			case JBatchPackage.FLOW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case JBatchPackage.FLOW__DECISION:
				return getDecision();
			case JBatchPackage.FLOW__FLOW:
				return getFlow();
			case JBatchPackage.FLOW__SPLIT:
				return getSplit();
			case JBatchPackage.FLOW__STEP:
				return getStep();
			case JBatchPackage.FLOW__TRANSITION_ELEMENTS:
				if (coreType) return getTransitionElements();
				return ((FeatureMap.Internal)getTransitionElements()).getWrapper();
			case JBatchPackage.FLOW__END:
				return getEnd();
			case JBatchPackage.FLOW__FAIL:
				return getFail();
			case JBatchPackage.FLOW__NEXT:
				return getNext();
			case JBatchPackage.FLOW__STOP:
				return getStop();
			case JBatchPackage.FLOW__ID:
				return getId();
			case JBatchPackage.FLOW__NEXT1:
				return getNext1();
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
			case JBatchPackage.FLOW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case JBatchPackage.FLOW__DECISION:
				getDecision().clear();
				getDecision().addAll((Collection<? extends Decision>)newValue);
				return;
			case JBatchPackage.FLOW__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case JBatchPackage.FLOW__SPLIT:
				getSplit().clear();
				getSplit().addAll((Collection<? extends Split>)newValue);
				return;
			case JBatchPackage.FLOW__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case JBatchPackage.FLOW__TRANSITION_ELEMENTS:
				((FeatureMap.Internal)getTransitionElements()).set(newValue);
				return;
			case JBatchPackage.FLOW__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends End>)newValue);
				return;
			case JBatchPackage.FLOW__FAIL:
				getFail().clear();
				getFail().addAll((Collection<? extends Fail>)newValue);
				return;
			case JBatchPackage.FLOW__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Next>)newValue);
				return;
			case JBatchPackage.FLOW__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends Stop>)newValue);
				return;
			case JBatchPackage.FLOW__ID:
				setId((String)newValue);
				return;
			case JBatchPackage.FLOW__NEXT1:
				setNext1((String)newValue);
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
			case JBatchPackage.FLOW__GROUP:
				getGroup().clear();
				return;
			case JBatchPackage.FLOW__DECISION:
				getDecision().clear();
				return;
			case JBatchPackage.FLOW__FLOW:
				getFlow().clear();
				return;
			case JBatchPackage.FLOW__SPLIT:
				getSplit().clear();
				return;
			case JBatchPackage.FLOW__STEP:
				getStep().clear();
				return;
			case JBatchPackage.FLOW__TRANSITION_ELEMENTS:
				getTransitionElements().clear();
				return;
			case JBatchPackage.FLOW__END:
				getEnd().clear();
				return;
			case JBatchPackage.FLOW__FAIL:
				getFail().clear();
				return;
			case JBatchPackage.FLOW__NEXT:
				getNext().clear();
				return;
			case JBatchPackage.FLOW__STOP:
				getStop().clear();
				return;
			case JBatchPackage.FLOW__ID:
				setId(ID_EDEFAULT);
				return;
			case JBatchPackage.FLOW__NEXT1:
				setNext1(NEXT1_EDEFAULT);
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
			case JBatchPackage.FLOW__GROUP:
				return group != null && !group.isEmpty();
			case JBatchPackage.FLOW__DECISION:
				return !getDecision().isEmpty();
			case JBatchPackage.FLOW__FLOW:
				return !getFlow().isEmpty();
			case JBatchPackage.FLOW__SPLIT:
				return !getSplit().isEmpty();
			case JBatchPackage.FLOW__STEP:
				return !getStep().isEmpty();
			case JBatchPackage.FLOW__TRANSITION_ELEMENTS:
				return transitionElements != null && !transitionElements.isEmpty();
			case JBatchPackage.FLOW__END:
				return !getEnd().isEmpty();
			case JBatchPackage.FLOW__FAIL:
				return !getFail().isEmpty();
			case JBatchPackage.FLOW__NEXT:
				return !getNext().isEmpty();
			case JBatchPackage.FLOW__STOP:
				return !getStop().isEmpty();
			case JBatchPackage.FLOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JBatchPackage.FLOW__NEXT1:
				return NEXT1_EDEFAULT == null ? next1 != null : !NEXT1_EDEFAULT.equals(next1);
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
		result.append(", transitionElements: ");
		result.append(transitionElements);
		result.append(", id: ");
		result.append(id);
		result.append(", next1: ");
		result.append(next1);
		result.append(')');
		return result.toString();
	}

} //FlowImpl
