/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getItemWriter()
 * @model extendedMetaData="name='ItemWriter' kind='elementOnly'"
 * @generated
 */
public interface ItemWriter extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getItemWriter_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getItemWriter_Ref()
	 * @model dataType="com.worldline.jbatch.designer.model.jbatch.ArtifactRef" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.ItemWriter#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ItemWriter
