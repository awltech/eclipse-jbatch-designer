/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getGroup <em>Group</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getDecision <em>Decision</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getFlow <em>Flow</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getSplit <em>Split</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getStep <em>Step</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getTransitionElements <em>Transition Elements</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getEnd <em>End</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getFail <em>Fail</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getNext <em>Next</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getStop <em>Stop</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getId <em>Id</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Flow#getNext1 <em>Next1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow()
 * @model extendedMetaData="name='Flow' kind='elementOnly'"
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Decision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Decision()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Decision> getDecision();

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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Flow()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flow' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Flow> getFlow();

	/**
	 * Returns the value of the '<em><b>Split</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Split}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Split()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='split' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Split> getSplit();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Step()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Step> getStep();

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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_TransitionElements()
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_End()
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Fail()
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Next()
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Stop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace' group='#TransitionElements:5'"
	 * @generated
	 */
	EList<Stop> getStop();

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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getId <em>Id</em>}' attribute.
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
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getFlow_Next1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='next'"
	 * @generated
	 */
	String getNext1();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Flow#getNext1 <em>Next1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next1</em>' attribute.
	 * @see #getNext1()
	 * @generated
	 */
	void setNext1(String value);

} // Flow
