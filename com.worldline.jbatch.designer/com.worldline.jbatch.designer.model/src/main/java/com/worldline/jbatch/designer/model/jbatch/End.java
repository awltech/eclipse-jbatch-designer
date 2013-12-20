/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.End#getExitStatus <em>Exit Status</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.End#getOn <em>On</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getEnd()
 * @model extendedMetaData="name='End' kind='empty'"
 * @generated
 */
public interface End extends EObject {
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getEnd_ExitStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='exit-status'"
	 * @generated
	 */
	String getExitStatus();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.End#getExitStatus <em>Exit Status</em>}' attribute.
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getEnd_On()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='on'"
	 * @generated
	 */
	String getOn();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.End#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(String value);

} // End
