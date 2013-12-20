/**
 */
package com.worldline.jbatch.designer.model.jbatch.impl;

import com.worldline.jbatch.designer.model.jbatch.CheckpointAlgorithm;
import com.worldline.jbatch.designer.model.jbatch.Chunk;
import com.worldline.jbatch.designer.model.jbatch.ExceptionClassFilter;
import com.worldline.jbatch.designer.model.jbatch.ItemProcessor;
import com.worldline.jbatch.designer.model.jbatch.ItemReader;
import com.worldline.jbatch.designer.model.jbatch.ItemWriter;
import com.worldline.jbatch.designer.model.jbatch.JBatchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getWriter <em>Writer</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getCheckpointAlgorithm <em>Checkpoint Algorithm</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getSkippableExceptionClasses <em>Skippable Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getRetryableExceptionClasses <em>Retryable Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getNoRollbackExceptionClasses <em>No Rollback Exception Classes</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getCheckpointPolicy <em>Checkpoint Policy</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getItemCount <em>Item Count</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getRetryLimit <em>Retry Limit</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getSkipLimit <em>Skip Limit</em>}</li>
 *   <li>{@link com.worldline.jbatch.designer.model.jbatch.impl.ChunkImpl#getTimeLimit <em>Time Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkImpl extends MinimalEObjectImpl.Container implements Chunk {
	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected ItemReader reader;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected ItemProcessor processor;

	/**
	 * The cached value of the '{@link #getWriter() <em>Writer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriter()
	 * @generated
	 * @ordered
	 */
	protected ItemWriter writer;

	/**
	 * The cached value of the '{@link #getCheckpointAlgorithm() <em>Checkpoint Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckpointAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CheckpointAlgorithm checkpointAlgorithm;

	/**
	 * The cached value of the '{@link #getSkippableExceptionClasses() <em>Skippable Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkippableExceptionClasses()
	 * @generated
	 * @ordered
	 */
	protected ExceptionClassFilter skippableExceptionClasses;

	/**
	 * The cached value of the '{@link #getRetryableExceptionClasses() <em>Retryable Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryableExceptionClasses()
	 * @generated
	 * @ordered
	 */
	protected ExceptionClassFilter retryableExceptionClasses;

	/**
	 * The cached value of the '{@link #getNoRollbackExceptionClasses() <em>No Rollback Exception Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoRollbackExceptionClasses()
	 * @generated
	 * @ordered
	 */
	protected ExceptionClassFilter noRollbackExceptionClasses;

	/**
	 * The default value of the '{@link #getCheckpointPolicy() <em>Checkpoint Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckpointPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKPOINT_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckpointPolicy() <em>Checkpoint Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckpointPolicy()
	 * @generated
	 * @ordered
	 */
	protected String checkpointPolicy = CHECKPOINT_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemCount() <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCount()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemCount() <em>Item Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCount()
	 * @generated
	 * @ordered
	 */
	protected String itemCount = ITEM_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryLimit() <em>Retry Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String RETRY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetryLimit() <em>Retry Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryLimit()
	 * @generated
	 * @ordered
	 */
	protected String retryLimit = RETRY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipLimit() <em>Skip Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipLimit() <em>Skip Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipLimit()
	 * @generated
	 * @ordered
	 */
	protected String skipLimit = SKIP_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected String timeLimit = TIME_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JBatchPackage.Literals.CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReader getReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReader(ItemReader newReader, NotificationChain msgs) {
		ItemReader oldReader = reader;
		reader = newReader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__READER, oldReader, newReader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(ItemReader newReader) {
		if (newReader != reader) {
			NotificationChain msgs = null;
			if (reader != null)
				msgs = ((InternalEObject)reader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__READER, null, msgs);
			if (newReader != null)
				msgs = ((InternalEObject)newReader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__READER, null, msgs);
			msgs = basicSetReader(newReader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__READER, newReader, newReader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcessor getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(ItemProcessor newProcessor, NotificationChain msgs) {
		ItemProcessor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(ItemProcessor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__PROCESSOR, null, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__PROCESSOR, null, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemWriter getWriter() {
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriter(ItemWriter newWriter, NotificationChain msgs) {
		ItemWriter oldWriter = writer;
		writer = newWriter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__WRITER, oldWriter, newWriter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriter(ItemWriter newWriter) {
		if (newWriter != writer) {
			NotificationChain msgs = null;
			if (writer != null)
				msgs = ((InternalEObject)writer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__WRITER, null, msgs);
			if (newWriter != null)
				msgs = ((InternalEObject)newWriter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__WRITER, null, msgs);
			msgs = basicSetWriter(newWriter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__WRITER, newWriter, newWriter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckpointAlgorithm getCheckpointAlgorithm() {
		return checkpointAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckpointAlgorithm(CheckpointAlgorithm newCheckpointAlgorithm, NotificationChain msgs) {
		CheckpointAlgorithm oldCheckpointAlgorithm = checkpointAlgorithm;
		checkpointAlgorithm = newCheckpointAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM, oldCheckpointAlgorithm, newCheckpointAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckpointAlgorithm(CheckpointAlgorithm newCheckpointAlgorithm) {
		if (newCheckpointAlgorithm != checkpointAlgorithm) {
			NotificationChain msgs = null;
			if (checkpointAlgorithm != null)
				msgs = ((InternalEObject)checkpointAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM, null, msgs);
			if (newCheckpointAlgorithm != null)
				msgs = ((InternalEObject)newCheckpointAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM, null, msgs);
			msgs = basicSetCheckpointAlgorithm(newCheckpointAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM, newCheckpointAlgorithm, newCheckpointAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionClassFilter getSkippableExceptionClasses() {
		return skippableExceptionClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkippableExceptionClasses(ExceptionClassFilter newSkippableExceptionClasses, NotificationChain msgs) {
		ExceptionClassFilter oldSkippableExceptionClasses = skippableExceptionClasses;
		skippableExceptionClasses = newSkippableExceptionClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES, oldSkippableExceptionClasses, newSkippableExceptionClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkippableExceptionClasses(ExceptionClassFilter newSkippableExceptionClasses) {
		if (newSkippableExceptionClasses != skippableExceptionClasses) {
			NotificationChain msgs = null;
			if (skippableExceptionClasses != null)
				msgs = ((InternalEObject)skippableExceptionClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES, null, msgs);
			if (newSkippableExceptionClasses != null)
				msgs = ((InternalEObject)newSkippableExceptionClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES, null, msgs);
			msgs = basicSetSkippableExceptionClasses(newSkippableExceptionClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES, newSkippableExceptionClasses, newSkippableExceptionClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionClassFilter getRetryableExceptionClasses() {
		return retryableExceptionClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryableExceptionClasses(ExceptionClassFilter newRetryableExceptionClasses, NotificationChain msgs) {
		ExceptionClassFilter oldRetryableExceptionClasses = retryableExceptionClasses;
		retryableExceptionClasses = newRetryableExceptionClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES, oldRetryableExceptionClasses, newRetryableExceptionClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryableExceptionClasses(ExceptionClassFilter newRetryableExceptionClasses) {
		if (newRetryableExceptionClasses != retryableExceptionClasses) {
			NotificationChain msgs = null;
			if (retryableExceptionClasses != null)
				msgs = ((InternalEObject)retryableExceptionClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES, null, msgs);
			if (newRetryableExceptionClasses != null)
				msgs = ((InternalEObject)newRetryableExceptionClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES, null, msgs);
			msgs = basicSetRetryableExceptionClasses(newRetryableExceptionClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES, newRetryableExceptionClasses, newRetryableExceptionClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionClassFilter getNoRollbackExceptionClasses() {
		return noRollbackExceptionClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoRollbackExceptionClasses(ExceptionClassFilter newNoRollbackExceptionClasses, NotificationChain msgs) {
		ExceptionClassFilter oldNoRollbackExceptionClasses = noRollbackExceptionClasses;
		noRollbackExceptionClasses = newNoRollbackExceptionClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES, oldNoRollbackExceptionClasses, newNoRollbackExceptionClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoRollbackExceptionClasses(ExceptionClassFilter newNoRollbackExceptionClasses) {
		if (newNoRollbackExceptionClasses != noRollbackExceptionClasses) {
			NotificationChain msgs = null;
			if (noRollbackExceptionClasses != null)
				msgs = ((InternalEObject)noRollbackExceptionClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES, null, msgs);
			if (newNoRollbackExceptionClasses != null)
				msgs = ((InternalEObject)newNoRollbackExceptionClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES, null, msgs);
			msgs = basicSetNoRollbackExceptionClasses(newNoRollbackExceptionClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES, newNoRollbackExceptionClasses, newNoRollbackExceptionClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckpointPolicy() {
		return checkpointPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckpointPolicy(String newCheckpointPolicy) {
		String oldCheckpointPolicy = checkpointPolicy;
		checkpointPolicy = newCheckpointPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__CHECKPOINT_POLICY, oldCheckpointPolicy, checkpointPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemCount() {
		return itemCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCount(String newItemCount) {
		String oldItemCount = itemCount;
		itemCount = newItemCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__ITEM_COUNT, oldItemCount, itemCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetryLimit() {
		return retryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryLimit(String newRetryLimit) {
		String oldRetryLimit = retryLimit;
		retryLimit = newRetryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__RETRY_LIMIT, oldRetryLimit, retryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkipLimit() {
		return skipLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipLimit(String newSkipLimit) {
		String oldSkipLimit = skipLimit;
		skipLimit = newSkipLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__SKIP_LIMIT, oldSkipLimit, skipLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeLimit() {
		return timeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLimit(String newTimeLimit) {
		String oldTimeLimit = timeLimit;
		timeLimit = newTimeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JBatchPackage.CHUNK__TIME_LIMIT, oldTimeLimit, timeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JBatchPackage.CHUNK__READER:
				return basicSetReader(null, msgs);
			case JBatchPackage.CHUNK__PROCESSOR:
				return basicSetProcessor(null, msgs);
			case JBatchPackage.CHUNK__WRITER:
				return basicSetWriter(null, msgs);
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
				return basicSetCheckpointAlgorithm(null, msgs);
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
				return basicSetSkippableExceptionClasses(null, msgs);
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
				return basicSetRetryableExceptionClasses(null, msgs);
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				return basicSetNoRollbackExceptionClasses(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JBatchPackage.CHUNK__READER:
				return getReader();
			case JBatchPackage.CHUNK__PROCESSOR:
				return getProcessor();
			case JBatchPackage.CHUNK__WRITER:
				return getWriter();
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
				return getCheckpointAlgorithm();
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
				return getSkippableExceptionClasses();
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
				return getRetryableExceptionClasses();
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				return getNoRollbackExceptionClasses();
			case JBatchPackage.CHUNK__CHECKPOINT_POLICY:
				return getCheckpointPolicy();
			case JBatchPackage.CHUNK__ITEM_COUNT:
				return getItemCount();
			case JBatchPackage.CHUNK__RETRY_LIMIT:
				return getRetryLimit();
			case JBatchPackage.CHUNK__SKIP_LIMIT:
				return getSkipLimit();
			case JBatchPackage.CHUNK__TIME_LIMIT:
				return getTimeLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JBatchPackage.CHUNK__READER:
				setReader((ItemReader)newValue);
				return;
			case JBatchPackage.CHUNK__PROCESSOR:
				setProcessor((ItemProcessor)newValue);
				return;
			case JBatchPackage.CHUNK__WRITER:
				setWriter((ItemWriter)newValue);
				return;
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
				setCheckpointAlgorithm((CheckpointAlgorithm)newValue);
				return;
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
				setSkippableExceptionClasses((ExceptionClassFilter)newValue);
				return;
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
				setRetryableExceptionClasses((ExceptionClassFilter)newValue);
				return;
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				setNoRollbackExceptionClasses((ExceptionClassFilter)newValue);
				return;
			case JBatchPackage.CHUNK__CHECKPOINT_POLICY:
				setCheckpointPolicy((String)newValue);
				return;
			case JBatchPackage.CHUNK__ITEM_COUNT:
				setItemCount((String)newValue);
				return;
			case JBatchPackage.CHUNK__RETRY_LIMIT:
				setRetryLimit((String)newValue);
				return;
			case JBatchPackage.CHUNK__SKIP_LIMIT:
				setSkipLimit((String)newValue);
				return;
			case JBatchPackage.CHUNK__TIME_LIMIT:
				setTimeLimit((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JBatchPackage.CHUNK__READER:
				setReader((ItemReader)null);
				return;
			case JBatchPackage.CHUNK__PROCESSOR:
				setProcessor((ItemProcessor)null);
				return;
			case JBatchPackage.CHUNK__WRITER:
				setWriter((ItemWriter)null);
				return;
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
				setCheckpointAlgorithm((CheckpointAlgorithm)null);
				return;
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
				setSkippableExceptionClasses((ExceptionClassFilter)null);
				return;
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
				setRetryableExceptionClasses((ExceptionClassFilter)null);
				return;
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				setNoRollbackExceptionClasses((ExceptionClassFilter)null);
				return;
			case JBatchPackage.CHUNK__CHECKPOINT_POLICY:
				setCheckpointPolicy(CHECKPOINT_POLICY_EDEFAULT);
				return;
			case JBatchPackage.CHUNK__ITEM_COUNT:
				setItemCount(ITEM_COUNT_EDEFAULT);
				return;
			case JBatchPackage.CHUNK__RETRY_LIMIT:
				setRetryLimit(RETRY_LIMIT_EDEFAULT);
				return;
			case JBatchPackage.CHUNK__SKIP_LIMIT:
				setSkipLimit(SKIP_LIMIT_EDEFAULT);
				return;
			case JBatchPackage.CHUNK__TIME_LIMIT:
				setTimeLimit(TIME_LIMIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JBatchPackage.CHUNK__READER:
				return reader != null;
			case JBatchPackage.CHUNK__PROCESSOR:
				return processor != null;
			case JBatchPackage.CHUNK__WRITER:
				return writer != null;
			case JBatchPackage.CHUNK__CHECKPOINT_ALGORITHM:
				return checkpointAlgorithm != null;
			case JBatchPackage.CHUNK__SKIPPABLE_EXCEPTION_CLASSES:
				return skippableExceptionClasses != null;
			case JBatchPackage.CHUNK__RETRYABLE_EXCEPTION_CLASSES:
				return retryableExceptionClasses != null;
			case JBatchPackage.CHUNK__NO_ROLLBACK_EXCEPTION_CLASSES:
				return noRollbackExceptionClasses != null;
			case JBatchPackage.CHUNK__CHECKPOINT_POLICY:
				return CHECKPOINT_POLICY_EDEFAULT == null ? checkpointPolicy != null : !CHECKPOINT_POLICY_EDEFAULT.equals(checkpointPolicy);
			case JBatchPackage.CHUNK__ITEM_COUNT:
				return ITEM_COUNT_EDEFAULT == null ? itemCount != null : !ITEM_COUNT_EDEFAULT.equals(itemCount);
			case JBatchPackage.CHUNK__RETRY_LIMIT:
				return RETRY_LIMIT_EDEFAULT == null ? retryLimit != null : !RETRY_LIMIT_EDEFAULT.equals(retryLimit);
			case JBatchPackage.CHUNK__SKIP_LIMIT:
				return SKIP_LIMIT_EDEFAULT == null ? skipLimit != null : !SKIP_LIMIT_EDEFAULT.equals(skipLimit);
			case JBatchPackage.CHUNK__TIME_LIMIT:
				return TIME_LIMIT_EDEFAULT == null ? timeLimit != null : !TIME_LIMIT_EDEFAULT.equals(timeLimit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checkpointPolicy: ");
		result.append(checkpointPolicy);
		result.append(", itemCount: ");
		result.append(itemCount);
		result.append(", retryLimit: ");
		result.append(retryLimit);
		result.append(", skipLimit: ");
		result.append(skipLimit);
		result.append(", timeLimit: ");
		result.append(timeLimit);
		result.append(')');
		return result.toString();
	}

} //ChunkImpl
