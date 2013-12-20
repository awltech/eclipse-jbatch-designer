/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Partition#getMapper <em>Mapper</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Partition#getPlan <em>Plan</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Partition#getCollector <em>Collector</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Partition#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Partition#getReducer <em>Reducer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition()
 * @model extendedMetaData="name='Partition' kind='elementOnly'"
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' containment reference.
	 * @see #setMapper(PartitionMapper)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition_Mapper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapper' namespace='##targetNamespace'"
	 * @generated
	 */
	PartitionMapper getMapper();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getMapper <em>Mapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' containment reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(PartitionMapper value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(PartitionPlan)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition_Plan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plan' namespace='##targetNamespace'"
	 * @generated
	 */
	PartitionPlan getPlan();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(PartitionPlan value);

	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference.
	 * @see #setCollector(Collector)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition_Collector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collector' namespace='##targetNamespace'"
	 * @generated
	 */
	Collector getCollector();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getCollector <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' containment reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Collector value);

	/**
	 * Returns the value of the '<em><b>Analyzer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzer</em>' containment reference.
	 * @see #setAnalyzer(Analyzer)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition_Analyzer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analyzer' namespace='##targetNamespace'"
	 * @generated
	 */
	Analyzer getAnalyzer();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getAnalyzer <em>Analyzer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzer</em>' containment reference.
	 * @see #getAnalyzer()
	 * @generated
	 */
	void setAnalyzer(Analyzer value);

	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reducer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reducer</em>' containment reference.
	 * @see #setReducer(PartitionReducer)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getPartition_Reducer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reducer' namespace='##targetNamespace'"
	 * @generated
	 */
	PartitionReducer getReducer();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Partition#getReducer <em>Reducer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' containment reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(PartitionReducer value);

} // Partition
