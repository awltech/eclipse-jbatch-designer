/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listeners</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Listeners#getListener <em>Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getListeners()
 * @model extendedMetaData="name='Listeners' kind='elementOnly'"
 * @generated
 */
public interface Listeners extends EObject {
	/**
	 * Returns the value of the '<em><b>Listener</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.Listener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getListeners_Listener()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Listener> getListener();

} // Listeners
