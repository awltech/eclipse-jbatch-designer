/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getBatchlet <em>Batchlet</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getChunk <em>Chunk</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getPartition <em>Partition</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getEnd <em>End</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getFail <em>Fail</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getNext <em>Next</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getStop <em>Stop</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getAllowStartIfComplete <em>Allow Start If Complete</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getNext1 <em>Next1</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Step#getStartLimit <em>Start Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep()
 * @model extendedMetaData="name='Step' kind='elementOnly'"
 * @generated
 */
public interface Step extends EObject {
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Note that "listeners" sequence order in XML does
	 * 						not imply order of execution by
	 * 						the batch runtime, per the
	 * 						specification.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference.
	 * @see #setListeners(Listeners)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Listeners()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listeners' namespace='##targetNamespace'"
	 * @generated
	 */
	Listeners getListeners();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getListeners <em>Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listeners</em>' containment reference.
	 * @see #getListeners()
	 * @generated
	 */
	void setListeners(Listeners value);

	/**
	 * Returns the value of the '<em><b>Batchlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batchlet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batchlet</em>' containment reference.
	 * @see #setBatchlet(Batchlet)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Batchlet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='batchlet' namespace='##targetNamespace'"
	 * @generated
	 */
	Batchlet getBatchlet();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getBatchlet <em>Batchlet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batchlet</em>' containment reference.
	 * @see #getBatchlet()
	 * @generated
	 */
	void setBatchlet(Batchlet value);

	/**
	 * Returns the value of the '<em><b>Chunk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk</em>' containment reference.
	 * @see #setChunk(Chunk)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Chunk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chunk' namespace='##targetNamespace'"
	 * @generated
	 */
	Chunk getChunk();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getChunk <em>Chunk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk</em>' containment reference.
	 * @see #getChunk()
	 * @generated
	 */
	void setChunk(Chunk value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' containment reference.
	 * @see #setPartition(Partition)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Partition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partition' namespace='##targetNamespace'"
	 * @generated
	 */
	Partition getPartition();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getPartition <em>Partition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition</em>' containment reference.
	 * @see #getPartition()
	 * @generated
	 */
	void setPartition(Partition value);

	/**
	 * Returns the value of the '<em><b>Transition Elements</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Elements</em>' attribute list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_TransitionElements()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TransitionElements:5'"
	 * @generated
	 */
	FeatureMap getTransitionElements();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.End}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_End()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace' group='#TransitionElements:5'"
	 * @generated
	 */
	EList<End> getEnd();

	/**
	 * Returns the value of the '<em><b>Fail</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Fail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Fail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fail' namespace='##targetNamespace' group='#TransitionElements:5'"
	 * @generated
	 */
	EList<Fail> getFail();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Next}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Next()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='next' namespace='##targetNamespace' group='#TransitionElements:5'"
	 * @generated
	 */
	EList<Next> getNext();

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Stop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#TransitionElements:5'"
	 * @generated
	 */
	EList<Stop> getStop();

	/**
	 * Returns the value of the '<em><b>Allow Start If Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Start If Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Start If Complete</em>' attribute.
	 * @see #setAllowStartIfComplete(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_AllowStartIfComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='allow-start-if-complete'"
	 * @generated
	 */
	String getAllowStartIfComplete();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getAllowStartIfComplete <em>Allow Start If Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Start If Complete</em>' attribute.
	 * @see #getAllowStartIfComplete()
	 * @generated
	 */
	void setAllowStartIfComplete(String value);

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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Next1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next1</em>' attribute.
	 * @see #setNext1(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_Next1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext1();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getNext1 <em>Next1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next1</em>' attribute.
	 * @see #getNext1()
	 * @generated
	 */
	void setNext1(String value);

	/**
	 * Returns the value of the '<em><b>Start Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Limit</em>' attribute.
	 * @see #setStartLimit(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getStep_StartLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='start-limit'"
	 * @generated
	 */
	String getStartLimit();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Step#getStartLimit <em>Start Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Limit</em>' attribute.
	 * @see #getStartLimit()
	 * @generated
	 */
	void setStartLimit(String value);

} // Step
