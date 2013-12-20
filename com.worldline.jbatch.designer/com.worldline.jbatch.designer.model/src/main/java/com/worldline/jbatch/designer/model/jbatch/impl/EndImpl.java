/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.End;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.EndImpl#getExitStatus <em>Exit Status</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.EndImpl#getOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends MinimalEObjectImpl.Container implements End {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.END;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.END__EXIT_STATUS, oldExitStatus, exitStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.END__ON, oldOn, on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JBatchPackage.END__EXIT_STATUS:
				return getExitStatus();
			case JBatchPackage.END__ON:
				return getOn();
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
			case JBatchPackage.END__EXIT_STATUS:
				setExitStatus((String)newValue);
				return;
			case JBatchPackage.END__ON:
				setOn((String)newValue);
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
			case JBatchPackage.END__EXIT_STATUS:
				setExitStatus(EXIT_STATUS_EDEFAULT);
				return;
			case JBatchPackage.END__ON:
				setOn(ON_EDEFAULT);
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
			case JBatchPackage.END__EXIT_STATUS:
				return EXIT_STATUS_EDEFAULT == null ? exitStatus != null : !EXIT_STATUS_EDEFAULT.equals(exitStatus);
			case JBatchPackage.END__ON:
				return ON_EDEFAULT == null ? on != null : !ON_EDEFAULT.equals(on);
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
		result.append(')');
		return result.toString();
	}

} //EndImpl
