/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Stop#getExitStatus <em>Exit Status</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Stop#getOn <em>On</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Stop#getRestart <em>Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStop()
 * @model extendedMetaData="name='Stop' kind='empty'"
 * @generated
 */
public interface Stop extends EObject {
	/**
	 * Returns the value of the '<em><b>Exit Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Status</em>' attribute.
	 * @see #setExitStatus(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStop_ExitStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exit-status'"
	 * @generated
	 */
	String getExitStatus();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getExitStatus <em>Exit Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Status</em>' attribute.
	 * @see #getExitStatus()
	 * @generated
	 */
	void setExitStatus(String value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStop_On()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='on'"
	 * @generated
	 */
	String getOn();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(String value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStop_Restart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='restart'"
	 * @generated
	 */
	String getRestart();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Stop#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #getRestart()
	 * @generated
	 */
	void setRestart(String value);

} // Stop
