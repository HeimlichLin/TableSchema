package com.doc.common.dao.impl; 
 
public class SystemLogDAOImpl extends GeneralDAOImpl<SystemLogPo> implements SystemLogDAO { 
	public static final SystemLogDAOImpl INSTANCE = new SystemLogDAOImpl(); 
	public static final String TABLENAME = "SYSTEM_LOG"; 

	public SystemLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SystemLogPo> CONVERTER = new MapConverter<SystemLogPo>() { 
 
		@Override 
		public SystemLogPo convert(final DataObject dataObject) { 
			final SystemLogPo systemLogPo = new SystemLogPo(); 
			systemLogPo.setTransactionId(dataObject.getString(SystemLogPo.COLUMNS.TRANSACTION_ID.name())); 
			systemLogPo.setTransactionMode(dataObject.getString(SystemLogPo.COLUMNS.TRANSACTION_MODE.name())); 
			systemLogPo.setDataFormat(dataObject.getString(SystemLogPo.COLUMNS.DATA_FORMAT.name())); 
			systemLogPo.setReturnCode(dataObject.getString(SystemLogPo.COLUMNS.RETURN_CODE.name())); 
			systemLogPo.setReturnMsg(dataObject.getString(SystemLogPo.COLUMNS.RETURN_MSG.name())); 
			systemLogPo.setUpdateUser(dataObject.getString(SystemLogPo.COLUMNS.UPDATE_USER.name())); 
			systemLogPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(SystemLogPo.COLUMNS.UPDATE_DATE.name()))); 
			return systemLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SystemLogPo systemLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SystemLogPo.COLUMNS.TRANSACTION_ID.name(), systemLogPo.getTransactionId()); 
			dataObject.setValue(SystemLogPo.COLUMNS.TRANSACTION_MODE.name(), systemLogPo.getTransactionMode()); 
			dataObject.setValue(SystemLogPo.COLUMNS.DATA_FORMAT.name(), systemLogPo.getDataFormat()); 
			dataObject.setValue(SystemLogPo.COLUMNS.RETURN_CODE.name(), systemLogPo.getReturnCode()); 
			dataObject.setValue(SystemLogPo.COLUMNS.RETURN_MSG.name(), systemLogPo.getReturnMsg()); 
			dataObject.setValue(SystemLogPo.COLUMNS.UPDATE_USER.name(), systemLogPo.getUpdateUser()); 
			dataObject.setValue(SystemLogPo.COLUMNS.UPDATE_DATE.name(), systemLogPo.getUpdateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SystemLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SystemLogPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(SystemLogPo.COLUMNS.TRANSACTION_ID.name(), po.getTransactionId()); 
		return sqlWhere; 
	} 
 
} 
