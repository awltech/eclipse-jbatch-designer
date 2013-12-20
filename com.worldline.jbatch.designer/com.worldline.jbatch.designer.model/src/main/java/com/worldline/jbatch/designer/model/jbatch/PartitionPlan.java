/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getThreads <em>Threads</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartitionPlan()
 * @model extendedMetaData="name='PartitionPlan' kind='elementOnly'"
 * @generated
 */
public interface PartitionPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartitionPlan_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Properties> getProperties();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' attribute.
	 * @see #setPartitions(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartitionPlan_Partitions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='partitions'"
	 * @generated
	 */
	String getPartitions();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getPartitions <em>Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitions</em>' attribute.
	 * @see #getPartitions()
	 * @generated
	 */
	void setPartitions(String value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' attribute.
	 * @see #setThreads(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartitionPlan_Threads()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threads'"
	 * @generated
	 */
	String getThreads();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.PartitionPlan#getThreads <em>Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threads</em>' attribute.
	 * @see #getThreads()
	 * @generated
	 */
	void setThreads(String value);

} // PartitionPlan
