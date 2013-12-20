/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.Analyzer;
import com.worldline.jbatch.designer.model.jbatch.Collector;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Partition;
import com.worldline.jbatch.designer.model.jbatch.PartitionMapper;
import com.worldline.jbatch.designer.model.jbatch.PartitionPlan;
import com.worldline.jbatch.designer.model.jbatch.PartitionReducer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.PartitionImpl#getReducer <em>Reducer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartitionImpl extends MinimalEObjectImpl.Container implements Partition {
	/**
	 * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapper()
	 * @generated
	 * @ordered
	 */
	protected PartitionMapper mapper;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected PartitionPlan plan;

	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Collector collector;

	/**
	 * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzer()
	 * @generated
	 * @ordered
	 */
	protected Analyzer analyzer;

	/**
	 * The cached value of the '{@link #getReducer() <em>Reducer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducer()
	 * @generated
	 * @ordered
	 */
	protected PartitionReducer reducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionMapper getMapper() {
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapper(PartitionMapper newMapper, NotificationChain msgs) {
		PartitionMapper oldMapper = mapper;
		mapper = newMapper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__MAPPER, oldMapper, newMapper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapper(PartitionMapper newMapper) {
		if (newMapper != mapper) {
			NotificationChain msgs = null;
			if (mapper != null)
				msgs = ((InternalEObject)mapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__MAPPER, null, msgs);
			if (newMapper != null)
				msgs = ((InternalEObject)newMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__MAPPER, null, msgs);
			msgs = basicSetMapper(newMapper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__MAPPER, newMapper, newMapper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPlan getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(PartitionPlan newPlan, NotificationChain msgs) {
		PartitionPlan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(PartitionPlan newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collector getCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollector(Collector newCollector, NotificationChain msgs) {
		Collector oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__COLLECTOR, oldCollector, newCollector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollector(Collector newCollector) {
		if (newCollector != collector) {
			NotificationChain msgs = null;
			if (collector != null)
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__COLLECTOR, newCollector, newCollector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyzer getAnalyzer() {
		return analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyzer(Analyzer newAnalyzer, NotificationChain msgs) {
		Analyzer oldAnalyzer = analyzer;
		analyzer = newAnalyzer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__ANALYZER, oldAnalyzer, newAnalyzer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyzer(Analyzer newAnalyzer) {
		if (newAnalyzer != analyzer) {
			NotificationChain msgs = null;
			if (analyzer != null)
				msgs = ((InternalEObject)analyzer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__ANALYZER, null, msgs);
			if (newAnalyzer != null)
				msgs = ((InternalEObject)newAnalyzer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__ANALYZER, null, msgs);
			msgs = basicSetAnalyzer(newAnalyzer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__ANALYZER, newAnalyzer, newAnalyzer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionReducer getReducer() {
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReducer(PartitionReducer newReducer, NotificationChain msgs) {
		PartitionReducer oldReducer = reducer;
		reducer = newReducer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__REDUCER, oldReducer, newReducer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReducer(PartitionReducer newReducer) {
		if (newReducer != reducer) {
			NotificationChain msgs = null;
			if (reducer != null)
				msgs = ((InternalEObject)reducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__REDUCER, null, msgs);
			if (newReducer != null)
				msgs = ((InternalEObject)newReducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.PARTITION__REDUCER, null, msgs);
			msgs = basicSetReducer(newReducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.PARTITION__REDUCER, newReducer, newReducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.PARTITION__MAPPER:
				return basicSetMapper(null, msgs);
			case JBatchPackage.PARTITION__PLAN:
				return basicSetPlan(null, msgs);
			case JBatchPackage.PARTITION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case JBatchPackage.PARTITION__ANALYZER:
				return basicSetAnalyzer(null, msgs);
			case JBatchPackage.PARTITION__REDUCER:
				return basicSetReducer(null, msgs);
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
			case JBatchPackage.PARTITION__MAPPER:
				return getMapper();
			case JBatchPackage.PARTITION__PLAN:
				return getPlan();
			case JBatchPackage.PARTITION__COLLECTOR:
				return getCollector();
			case JBatchPackage.PARTITION__ANALYZER:
				return getAnalyzer();
			case JBatchPackage.PARTITION__REDUCER:
				return getReducer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JBatchPackage.PARTITION__MAPPER:
				setMapper((PartitionMapper)newValue);
				return;
			case JBatchPackage.PARTITION__PLAN:
				setPlan((PartitionPlan)newValue);
				return;
			case JBatchPackage.PARTITION__COLLECTOR:
				setCollector((Collector)newValue);
				return;
			case JBatchPackage.PARTITION__ANALYZER:
				setAnalyzer((Analyzer)newValue);
				return;
			case JBatchPackage.PARTITION__REDUCER:
				setReducer((PartitionReducer)newValue);
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
			case JBatchPackage.PARTITION__MAPPER:
				setMapper((PartitionMapper)null);
				return;
			case JBatchPackage.PARTITION__PLAN:
				setPlan((PartitionPlan)null);
				return;
			case JBatchPackage.PARTITION__COLLECTOR:
				setCollector((Collector)null);
				return;
			case JBatchPackage.PARTITION__ANALYZER:
				setAnalyzer((Analyzer)null);
				return;
			case JBatchPackage.PARTITION__REDUCER:
				setReducer((PartitionReducer)null);
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
			case JBatchPackage.PARTITION__MAPPER:
				return mapper != null;
			case JBatchPackage.PARTITION__PLAN:
				return plan != null;
			case JBatchPackage.PARTITION__COLLECTOR:
				return collector != null;
			case JBatchPackage.PARTITION__ANALYZER:
				return analyzer != null;
			case JBatchPackage.PARTITION__REDUCER:
				return reducer != null;
		}
		return super.eIsSet(featureID);
	}

} //PartitionImpl
