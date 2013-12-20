/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Properties#getProperty <em>Property</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Properties#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getProperties()
 * @model extendedMetaData="name='Properties' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getProperties_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' attribute.
	 * @see #setPartition(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getProperties_Partition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partition'"
	 * @generated
	 */
	String getPartition();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Properties#getPartition <em>Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' attribute.
	 * @see #getPartition()
	 * @generated
	 */
	void setPartition(String value);

} // Properties
