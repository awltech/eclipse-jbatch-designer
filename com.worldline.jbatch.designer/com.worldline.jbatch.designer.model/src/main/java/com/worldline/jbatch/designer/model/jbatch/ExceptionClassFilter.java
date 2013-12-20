/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Class Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getInclude <em>Include</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter#getExclude <em>Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getExceptionClassFilter()
 * @model extendedMetaData="name='ExceptionClassFilter' kind='elementOnly'"
 * @generated
 */
public interface ExceptionClassFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getExceptionClassFilter_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link com.worldline.jbatch.designer.model.jbatch.ExcludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getExceptionClassFilter_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExcludeType> getExclude();

} // ExceptionClassFilter
