/**
 */
package com.worldline.jbatch.designer.model.jbatch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getReader <em>Reader</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getProcessor <em>Processor</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getWriter <em>Writer</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointAlgorithm <em>Checkpoint Algorithm</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkippableExceptionClasses <em>Skippable Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryableExceptionClasses <em>Retryable Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getNoRollbackExceptionClasses <em>No Rollback Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointPolicy <em>Checkpoint Policy</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getItemCount <em>Item Count</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryLimit <em>Retry Limit</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkipLimit <em>Skip Limit</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getTimeLimit <em>Time Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk()
 * @model extendedMetaData="name='Chunk' kind='elementOnly'"
 * @generated
 */
public interface Chunk extends EObject {
	/**
	 * Returns the value of the '<em><b>Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' containment reference.
	 * @see #setReader(ItemReader)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_Reader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reader' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemReader getReader();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getReader <em>Reader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' containment reference.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(ItemReader value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference.
	 * @see #setProcessor(ItemProcessor)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_Processor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='processor' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemProcessor getProcessor();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(ItemProcessor value);

	/**
	 * Returns the value of the '<em><b>Writer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' containment reference.
	 * @see #setWriter(ItemWriter)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_Writer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='writer' namespace='##targetNamespace'"
	 * @generated
	 */
	ItemWriter getWriter();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getWriter <em>Writer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' containment reference.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(ItemWriter value);

	/**
	 * Returns the value of the '<em><b>Checkpoint Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkpoint Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkpoint Algorithm</em>' containment reference.
	 * @see #setCheckpointAlgorithm(CheckpointAlgorithm)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_CheckpointAlgorithm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='checkpoint-algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	CheckpointAlgorithm getCheckpointAlgorithm();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointAlgorithm <em>Checkpoint Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkpoint Algorithm</em>' containment reference.
	 * @see #getCheckpointAlgorithm()
	 * @generated
	 */
	void setCheckpointAlgorithm(CheckpointAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Skippable Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skippable Exception Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skippable Exception Classes</em>' containment reference.
	 * @see #setSkippableExceptionClasses(ExceptionClassFilter)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_SkippableExceptionClasses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='skippable-exception-classes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionClassFilter getSkippableExceptionClasses();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkippableExceptionClasses <em>Skippable Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skippable Exception Classes</em>' containment reference.
	 * @see #getSkippableExceptionClasses()
	 * @generated
	 */
	void setSkippableExceptionClasses(ExceptionClassFilter value);

	/**
	 * Returns the value of the '<em><b>Retryable Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retryable Exception Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retryable Exception Classes</em>' containment reference.
	 * @see #setRetryableExceptionClasses(ExceptionClassFilter)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_RetryableExceptionClasses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retryable-exception-classes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionClassFilter getRetryableExceptionClasses();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryableExceptionClasses <em>Retryable Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retryable Exception Classes</em>' containment reference.
	 * @see #getRetryableExceptionClasses()
	 * @generated
	 */
	void setRetryableExceptionClasses(ExceptionClassFilter value);

	/**
	 * Returns the value of the '<em><b>No Rollback Exception Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Rollback Exception Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Rollback Exception Classes</em>' containment reference.
	 * @see #setNoRollbackExceptionClasses(ExceptionClassFilter)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_NoRollbackExceptionClasses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='no-rollback-exception-classes' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionClassFilter getNoRollbackExceptionClasses();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getNoRollbackExceptionClasses <em>No Rollback Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Rollback Exception Classes</em>' containment reference.
	 * @see #getNoRollbackExceptionClasses()
	 * @generated
	 */
	void setNoRollbackExceptionClasses(ExceptionClassFilter value);

	/**
	 * Returns the value of the '<em><b>Checkpoint Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Specifies the checkpoint policy that governs
	 * 					commit behavior for this chunk.
	 * 					Valid values are: "item" or
	 * 					"custom". The "item" policy means the
	 * 					chunk is checkpointed after a
	 * 					specified number of items are
	 * 					processed. The "custom" policy means
	 * 					the chunk is checkpointed
	 * 					according to a checkpoint algorithm
	 * 					implementation. Specifying
	 * 					"custom" requires that the
	 * 					checkpoint-algorithm element is also
	 * 					specified. It is an optional
	 * 					attribute. The default policy is
	 * 					"item". However, we chose not to define
	 * 					a schema-specified default for this attribute.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Checkpoint Policy</em>' attribute.
	 * @see #setCheckpointPolicy(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_CheckpointPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='checkpoint-policy'"
	 * @generated
	 */
	String getCheckpointPolicy();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getCheckpointPolicy <em>Checkpoint Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkpoint Policy</em>' attribute.
	 * @see #getCheckpointPolicy()
	 * @generated
	 */
	void setCheckpointPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Item Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Specifies the number of items to process per chunk
	 * 					when using the item
	 * 					checkpoint policy. It must be valid XML integer.
	 * 					It is an optional
	 * 					attribute. The default is 10. The item-count
	 * 					attribute is ignored
	 * 					for "custom" checkpoint policy. However, to
	 * 					make it easier for implementations to support JSL inheritance
	 * 					we
	 * 					abstain from defining a schema-specified default for this
	 * 					attribute.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Count</em>' attribute.
	 * @see #setItemCount(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_ItemCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='item-count'"
	 * @generated
	 */
	String getItemCount();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getItemCount <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Count</em>' attribute.
	 * @see #getItemCount()
	 * @generated
	 */
	void setItemCount(String value);

	/**
	 * Returns the value of the '<em><b>Retry Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Specifies the number of times a step will retry if
	 * 					any configured retryable
	 * 					exceptions are thrown by chunk processing.
	 * 					It must be a valid XML
	 * 					integer value. It is an optional attribute.
	 * 					The default is no
	 * 					limit.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Limit</em>' attribute.
	 * @see #setRetryLimit(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_RetryLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='retry-limit'"
	 * @generated
	 */
	String getRetryLimit();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getRetryLimit <em>Retry Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Limit</em>' attribute.
	 * @see #getRetryLimit()
	 * @generated
	 */
	void setRetryLimit(String value);

	/**
	 * Returns the value of the '<em><b>Skip Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Specifies the number of exceptions a step will
	 * 					skip if any configured
	 * 					skippable exceptions are thrown by chunk
	 * 					processing. It must be a
	 * 					valid XML integer value. It is an optional
	 * 					attribute. The default
	 * 					is no limit.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skip Limit</em>' attribute.
	 * @see #setSkipLimit(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_SkipLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='skip-limit'"
	 * @generated
	 */
	String getSkipLimit();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getSkipLimit <em>Skip Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Limit</em>' attribute.
	 * @see #getSkipLimit()
	 * @generated
	 */
	void setSkipLimit(String value);

	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					Specifies the amount of time in seconds before
	 * 					taking a checkpoint for the
	 * 					item checkpoint policy. It must be valid
	 * 					XML integer. It is an
	 * 					optional attribute. The default is 0, which
	 * 					means no limit. However, to
	 * 					make it easier for implementations to
	 * 					support JSL inheritance
	 * 					we abstain from defining a schema-specified
	 * 					default for this attribute.
	 * 					When a value greater than zero is
	 * 					specified, a checkpoint is taken when
	 * 					time-limit is reached or
	 * 					item-count items have been processed,
	 * 					whichever comes first. The
	 * 					time-limit attribute is ignored for
	 * 					"custom" checkpoint policy.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(String)
	 * @see com.worldline.jbatch.designer.model.jbatch.JBatchPackage#getChunk_TimeLimit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='time-limit'"
	 * @generated
	 */
	String getTimeLimit();

	/**
	 * Sets the value of the '{@link com.worldline.jbatch.designer.model.jbatch.Chunk#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(String value);

} // Chunk
