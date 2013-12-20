/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Batchlet;
import com.worldline.jbatch.designer.model.jbatch.Chunk;
import com.worldline.jbatch.designer.model.jbatch.End;
import com.worldline.jbatch.designer.model.jbatch.Fail;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Listeners;
import com.worldline.jbatch.designer.model.jbatch.Next;
import com.worldline.jbatch.designer.model.jbatch.Partition;
import com.worldline.jbatch.designer.model.jbatch.Properties;
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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getBatchlet <em>Batchlet</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getChunk <em>Chunk</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getAllowStartIfComplete <em>Allow Start If Complete</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getNext1 <em>Next1</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StepImpl#getStartLimit <em>Start Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The cached value of the '{@link #getBatchlet() <em>Batchlet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchlet()
	 * @generated
	 * @ordered
	 */
	protected Batchlet batchlet;

	/**
	 * The cached value of the '{@link #getChunk() <em>Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunk()
	 * @generated
	 * @ordered
	 */
	protected Chunk chunk;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected Partition partition;

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
	 * The default value of the '{@link #getAllowStartIfComplete() <em>Allow Start If Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowStartIfComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_START_IF_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowStartIfComplete() <em>Allow Start If Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowStartIfComplete()
	 * @generated
	 * @ordered
	 */
	protected String allowStartIfComplete = ALLOW_START_IF_COMPLETE_EDEFAULT;

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
	 * The default value of the '{@link #getStartLimit() <em>Start Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String START_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLimit() <em>Start Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLimit()
	 * @generated
	 * @ordered
	 */
	protected String startLimit = START_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.STEP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__PROPERTIES, newProperties, newProperties));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__LISTENERS, oldListeners, newListeners);
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
				msgs = ((InternalEObject)listeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__LISTENERS, null, msgs);
			if (newListeners != null)
				msgs = ((InternalEObject)newListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__LISTENERS, null, msgs);
			msgs = basicSetListeners(newListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__LISTENERS, newListeners, newListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batchlet getBatchlet() {
		return batchlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBatchlet(Batchlet newBatchlet, NotificationChain msgs) {
		Batchlet oldBatchlet = batchlet;
		batchlet = newBatchlet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__BATCHLET, oldBatchlet, newBatchlet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchlet(Batchlet newBatchlet) {
		if (newBatchlet != batchlet) {
			NotificationChain msgs = null;
			if (batchlet != null)
				msgs = ((InternalEObject)batchlet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__BATCHLET, null, msgs);
			if (newBatchlet != null)
				msgs = ((InternalEObject)newBatchlet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__BATCHLET, null, msgs);
			msgs = basicSetBatchlet(newBatchlet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__BATCHLET, newBatchlet, newBatchlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chunk getChunk() {
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChunk(Chunk newChunk, NotificationChain msgs) {
		Chunk oldChunk = chunk;
		chunk = newChunk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__CHUNK, oldChunk, newChunk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunk(Chunk newChunk) {
		if (newChunk != chunk) {
			NotificationChain msgs = null;
			if (chunk != null)
				msgs = ((InternalEObject)chunk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__CHUNK, null, msgs);
			if (newChunk != null)
				msgs = ((InternalEObject)newChunk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__CHUNK, null, msgs);
			msgs = basicSetChunk(newChunk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__CHUNK, newChunk, newChunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition getPartition() {
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartition(Partition newPartition, NotificationChain msgs) {
		Partition oldPartition = partition;
		partition = newPartition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__PARTITION, oldPartition, newPartition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartition(Partition newPartition) {
		if (newPartition != partition) {
			NotificationChain msgs = null;
			if (partition != null)
				msgs = ((InternalEObject)partition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__PARTITION, null, msgs);
			if (newPartition != null)
				msgs = ((InternalEObject)newPartition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.STEP__PARTITION, null, msgs);
			msgs = basicSetPartition(newPartition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__PARTITION, newPartition, newPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTransitionElements() {
		if (transitionElements == null) {
			transitionElements = new BasicFeatureMap(this, JBatchPackage.STEP__TRANSITION_ELEMENTS);
		}
		return transitionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<End> getEnd() {
		return getTransitionElements().list(JBatchPackage.Literals.STEP__END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fail> getFail() {
		return getTransitionElements().list(JBatchPackage.Literals.STEP__FAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Next> getNext() {
		return getTransitionElements().list(JBatchPackage.Literals.STEP__NEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stop> getStop() {
		return getTransitionElements().list(JBatchPackage.Literals.STEP__STOP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowStartIfComplete() {
		return allowStartIfComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowStartIfComplete(String newAllowStartIfComplete) {
		String oldAllowStartIfComplete = allowStartIfComplete;
		allowStartIfComplete = newAllowStartIfComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__ALLOW_START_IF_COMPLETE, oldAllowStartIfComplete, allowStartIfComplete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__NEXT1, oldNext1, next1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartLimit() {
		return startLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLimit(String newStartLimit) {
		String oldStartLimit = startLimit;
		startLimit = newStartLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STEP__START_LIMIT, oldStartLimit, startLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.STEP__PROPERTIES:
				return basicSetProperties(null, msgs);
			case JBatchPackage.STEP__LISTENERS:
				return basicSetListeners(null, msgs);
			case JBatchPackage.STEP__BATCHLET:
				return basicSetBatchlet(null, msgs);
			case JBatchPackage.STEP__CHUNK:
				return basicSetChunk(null, msgs);
			case JBatchPackage.STEP__PARTITION:
				return basicSetPartition(null, msgs);
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
				return ((InternalEList<?>)getTransitionElements()).basicRemove(otherEnd, msgs);
			case JBatchPackage.STEP__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case JBatchPackage.STEP__FAIL:
				return ((InternalEList<?>)getFail()).basicRemove(otherEnd, msgs);
			case JBatchPackage.STEP__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case JBatchPackage.STEP__STOP:
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
			case JBatchPackage.STEP__PROPERTIES:
				return getProperties();
			case JBatchPackage.STEP__LISTENERS:
				return getListeners();
			case JBatchPackage.STEP__BATCHLET:
				return getBatchlet();
			case JBatchPackage.STEP__CHUNK:
				return getChunk();
			case JBatchPackage.STEP__PARTITION:
				return getPartition();
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
				if (coreType) return getTransitionElements();
				return ((FeatureMap.Internal)getTransitionElements()).getWrapper();
			case JBatchPackage.STEP__END:
				return getEnd();
			case JBatchPackage.STEP__FAIL:
				return getFail();
			case JBatchPackage.STEP__NEXT:
				return getNext();
			case JBatchPackage.STEP__STOP:
				return getStop();
			case JBatchPackage.STEP__ALLOW_START_IF_COMPLETE:
				return getAllowStartIfComplete();
			case JBatchPackage.STEP__ID:
				return getId();
			case JBatchPackage.STEP__NEXT1:
				return getNext1();
			case JBatchPackage.STEP__START_LIMIT:
				return getStartLimit();
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
			case JBatchPackage.STEP__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case JBatchPackage.STEP__LISTENERS:
				setListeners((Listeners)newValue);
				return;
			case JBatchPackage.STEP__BATCHLET:
				setBatchlet((Batchlet)newValue);
				return;
			case JBatchPackage.STEP__CHUNK:
				setChunk((Chunk)newValue);
				return;
			case JBatchPackage.STEP__PARTITION:
				setPartition((Partition)newValue);
				return;
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
				((FeatureMap.Internal)getTransitionElements()).set(newValue);
				return;
			case JBatchPackage.STEP__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends End>)newValue);
				return;
			case JBatchPackage.STEP__FAIL:
				getFail().clear();
				getFail().addAll((Collection<? extends Fail>)newValue);
				return;
			case JBatchPackage.STEP__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Next>)newValue);
				return;
			case JBatchPackage.STEP__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends Stop>)newValue);
				return;
			case JBatchPackage.STEP__ALLOW_START_IF_COMPLETE:
				setAllowStartIfComplete((String)newValue);
				return;
			case JBatchPackage.STEP__ID:
				setId((String)newValue);
				return;
			case JBatchPackage.STEP__NEXT1:
				setNext1((String)newValue);
				return;
			case JBatchPackage.STEP__START_LIMIT:
				setStartLimit((String)newValue);
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
			case JBatchPackage.STEP__PROPERTIES:
				setProperties((Properties)null);
				return;
			case JBatchPackage.STEP__LISTENERS:
				setListeners((Listeners)null);
				return;
			case JBatchPackage.STEP__BATCHLET:
				setBatchlet((Batchlet)null);
				return;
			case JBatchPackage.STEP__CHUNK:
				setChunk((Chunk)null);
				return;
			case JBatchPackage.STEP__PARTITION:
				setPartition((Partition)null);
				return;
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
				getTransitionElements().clear();
				return;
			case JBatchPackage.STEP__END:
				getEnd().clear();
				return;
			case JBatchPackage.STEP__FAIL:
				getFail().clear();
				return;
			case JBatchPackage.STEP__NEXT:
				getNext().clear();
				return;
			case JBatchPackage.STEP__STOP:
				getStop().clear();
				return;
			case JBatchPackage.STEP__ALLOW_START_IF_COMPLETE:
				setAllowStartIfComplete(ALLOW_START_IF_COMPLETE_EDEFAULT);
				return;
			case JBatchPackage.STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case JBatchPackage.STEP__NEXT1:
				setNext1(NEXT1_EDEFAULT);
				return;
			case JBatchPackage.STEP__START_LIMIT:
				setStartLimit(START_LIMIT_EDEFAULT);
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
			case JBatchPackage.STEP__PROPERTIES:
				return properties != null;
			case JBatchPackage.STEP__LISTENERS:
				return listeners != null;
			case JBatchPackage.STEP__BATCHLET:
				return batchlet != null;
			case JBatchPackage.STEP__CHUNK:
				return chunk != null;
			case JBatchPackage.STEP__PARTITION:
				return partition != null;
			case JBatchPackage.STEP__TRANSITION_ELEMENTS:
				return transitionElements != null && !transitionElements.isEmpty();
			case JBatchPackage.STEP__END:
				return !getEnd().isEmpty();
			case JBatchPackage.STEP__FAIL:
				return !getFail().isEmpty();
			case JBatchPackage.STEP__NEXT:
				return !getNext().isEmpty();
			case JBatchPackage.STEP__STOP:
				return !getStop().isEmpty();
			case JBatchPackage.STEP__ALLOW_START_IF_COMPLETE:
				return ALLOW_START_IF_COMPLETE_EDEFAULT == null ? allowStartIfComplete != null : !ALLOW_START_IF_COMPLETE_EDEFAULT.equals(allowStartIfComplete);
			case JBatchPackage.STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JBatchPackage.STEP__NEXT1:
				return NEXT1_EDEFAULT == null ? next1 != null : !NEXT1_EDEFAULT.equals(next1);
			case JBatchPackage.STEP__START_LIMIT:
				return START_LIMIT_EDEFAULT == null ? startLimit != null : !START_LIMIT_EDEFAULT.equals(startLimit);
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
		result.append(", allowStartIfComplete: ");
		result.append(allowStartIfComplete);
		result.append(", id: ");
		result.append(id);
		result.append(", next1: ");
		result.append(next1);
		result.append(", startLimit: ");
		result.append(startLimit);
		result.append(')');
		return result.toString();
	}

} //StepImpl
