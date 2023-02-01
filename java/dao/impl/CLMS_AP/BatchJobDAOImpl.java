package com.doc.common.dao.impl; 
 
public class BatchJobDAOImpl extends GeneralDAOImpl<BatchJobPo> implements BatchJobDAO { 
	public static final BatchJobDAOImpl INSTANCE = new BatchJobDAOImpl(); 
	public static final String TABLENAME = "BATCH_JOB"; 

	public BatchJobDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BatchJobPo> CONVERTER = new MapConverter<BatchJobPo>() { 
 
		@Override 
		public BatchJobPo convert(final DataObject dataObject) { 
			final BatchJobPo batchJobPo = new BatchJobPo(); 
			batchJobPo.setTransaction(dataObject.getString(BatchJobPo.COLUMNS.TRANSACTION.name())); 
			batchJobPo.setExCode(dataObject.getString(BatchJobPo.COLUMNS.EX_CODE.name())); 
			batchJobPo.setCreater(dataObject.getString(BatchJobPo.COLUMNS.CREATER.name())); 
			batchJobPo.setExGroup(dataObject.getString(BatchJobPo.COLUMNS.EX_GROUP.name())); 
			batchJobPo.setCreateTime(TimestampUtils.of(dataObject.getValue(BatchJobPo.COLUMNS.CREATE_TIME.name()))); 
			batchJobPo.setStartTime(TimestampUtils.of(dataObject.getValue(BatchJobPo.COLUMNS.START_TIME.name()))); 
			batchJobPo.setEndTime(TimestampUtils.of(dataObject.getValue(BatchJobPo.COLUMNS.END_TIME.name()))); 
			batchJobPo.setStatus(dataObject.getString(BatchJobPo.COLUMNS.STATUS.name())); 
			batchJobPo.setParameter(dataObject.getString(BatchJobPo.COLUMNS.PARAMETER.name())); 
			batchJobPo.setParameterClass(dataObject.getString(BatchJobPo.COLUMNS.PARAMETER_CLASS.name())); 
			batchJobPo.setTargetClass(dataObject.getString(BatchJobPo.COLUMNS.TARGET_CLASS.name())); 
			batchJobPo.setHasFile(dataObject.getString(BatchJobPo.COLUMNS.HAS_FILE.name())); 
			batchJobPo.setIsRead(dataObject.getString(BatchJobPo.COLUMNS.IS_READ.name())); 
			batchJobPo.setMail(dataObject.getString(BatchJobPo.COLUMNS.MAIL.name())); 
			batchJobPo.setMessage(dataObject.getString(BatchJobPo.COLUMNS.MESSAGE.name())); 
			batchJobPo.setFileContent(); 
			batchJobPo.setFileName(dataObject.getString(BatchJobPo.COLUMNS.FILE_NAME.name())); 
			return batchJobPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BatchJobPo batchJobPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BatchJobPo.COLUMNS.TRANSACTION.name(), batchJobPo.getTransaction()); 
			dataObject.setValue(BatchJobPo.COLUMNS.EX_CODE.name(), batchJobPo.getExCode()); 
			dataObject.setValue(BatchJobPo.COLUMNS.CREATER.name(), batchJobPo.getCreater()); 
			dataObject.setValue(BatchJobPo.COLUMNS.EX_GROUP.name(), batchJobPo.getExGroup()); 
			dataObject.setValue(BatchJobPo.COLUMNS.CREATE_TIME.name(), batchJobPo.getCreateTime()); 
			dataObject.setValue(BatchJobPo.COLUMNS.START_TIME.name(), batchJobPo.getStartTime()); 
			dataObject.setValue(BatchJobPo.COLUMNS.END_TIME.name(), batchJobPo.getEndTime()); 
			dataObject.setValue(BatchJobPo.COLUMNS.STATUS.name(), batchJobPo.getStatus()); 
			dataObject.setValue(BatchJobPo.COLUMNS.PARAMETER.name(), batchJobPo.getParameter()); 
			dataObject.setValue(BatchJobPo.COLUMNS.PARAMETER_CLASS.name(), batchJobPo.getParameterClass()); 
			dataObject.setValue(BatchJobPo.COLUMNS.TARGET_CLASS.name(), batchJobPo.getTargetClass()); 
			dataObject.setValue(BatchJobPo.COLUMNS.HAS_FILE.name(), batchJobPo.getHasFile()); 
			dataObject.setValue(BatchJobPo.COLUMNS.IS_READ.name(), batchJobPo.getIsRead()); 
			dataObject.setValue(BatchJobPo.COLUMNS.MAIL.name(), batchJobPo.getMail()); 
			dataObject.setValue(BatchJobPo.COLUMNS.MESSAGE.name(), batchJobPo.getMessage()); 
			dataObject.setValue(BatchJobPo.COLUMNS.FILE_CONTENT.name(), batchJobPo.getFileContent()); 
			dataObject.setValue(BatchJobPo.COLUMNS.FILE_NAME.name(), batchJobPo.getFileName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BatchJobPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BatchJobPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BatchJobPo.COLUMNS.TRANSACTION.name(), po.getTransaction()); 
		sqlWhere.add(BatchJobPo.COLUMNS.CREATER.name(), po.getCreater()); 
		return sqlWhere; 
	} 
 
} 
