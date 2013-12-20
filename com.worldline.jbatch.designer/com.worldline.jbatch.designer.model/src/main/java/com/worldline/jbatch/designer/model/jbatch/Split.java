/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Split#getFlow <em>Flow</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Split#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Split#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getSplit()
 * @model extendedMetaData="name='Split' kind='elementOnly'"
 * @generated
 */
public interface Split extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getSplit_Flow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Flow> getFlow();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getSplit_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Split#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getSplit_Next()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Split#getNext <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' attribute.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(String value);

} // Split
