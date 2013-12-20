/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Fail#getExitStatus <em>Exit Status</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Fail#getOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFail()
 * @model extendedMetaData="name='Fail' kind='empty'"
 * @generated
 */
public interface Fail extends EObject {
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFail_ExitStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exit-status'"
	 * @generated
	 */
	String getExitStatus();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Fail#getExitStatus <em>Exit Status</em>}' attribute.
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFail_On()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='on'"
	 * @generated
	 */
	String getOn();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Fail#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(String value);

} // Fail
