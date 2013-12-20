/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;
import com.worldline.jbatch.designer.model.jbatch.Stop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StopImpl#getExitStatus <em>Exit Status</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StopImpl#getOn <em>On</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.StopImpl#getRestart <em>Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StopImpl extends MinimalEObjectImpl.Container implements Stop {
	/**
	 * The default value of the '{@link #getExitStatus() <em>Exit Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String EXIT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExitStatus() <em>Exit Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitStatus()
	 * @generated
	 * @ordered
	 */
	protected String exitStatus = EXIT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected String on = ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected String restart = RESTART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.STOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExitStatus() {
		return exitStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitStatus(String newExitStatus) {
		String oldExitStatus = exitStatus;
		exitStatus = newExitStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STOP__EXIT_STATUS, oldExitStatus, exitStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(String newOn) {
		String oldOn = on;
		on = newOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STOP__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestart(String newRestart) {
		String oldRestart = restart;
		restart = newRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.STOP__RESTART, oldRestart, restart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JBatchPackage.STOP__EXIT_STATUS:
				return getExitStatus();
			case JBatchPackage.STOP__ON:
				return getOn();
			case JBatchPackage.STOP__RESTART:
				return getRestart();
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
			case JBatchPackage.STOP__EXIT_STATUS:
				setExitStatus((String)newValue);
				return;
			case JBatchPackage.STOP__ON:
				setOn((String)newValue);
				return;
			case JBatchPackage.STOP__RESTART:
				setRestart((String)newValue);
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
			case JBatchPackage.STOP__EXIT_STATUS:
				setExitStatus(EXIT_STATUS_EDEFAULT);
				return;
			case JBatchPackage.STOP__ON:
				setOn(ON_EDEFAULT);
				return;
			case JBatchPackage.STOP__RESTART:
				setRestart(RESTART_EDEFAULT);
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
			case JBatchPackage.STOP__EXIT_STATUS:
				return EXIT_STATUS_EDEFAULT == null ? exitStatus != null : !EXIT_STATUS_EDEFAULT.equals(exitStatus);
			case JBatchPackage.STOP__ON:
				return ON_EDEFAULT == null ? on != null : !ON_EDEFAULT.equals(on);
			case JBatchPackage.STOP__RESTART:
				return RESTART_EDEFAULT == null ? restart != null : !RESTART_EDEFAULT.equals(restart);
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
		result.append(" (exitStatus: ");
		result.append(exitStatus);
		result.append(", on: ");
		result.append(on);
		result.append(", restart: ");
		result.append(restart);
		result.append(')');
		return result.toString();
	}

} //StopImpl
