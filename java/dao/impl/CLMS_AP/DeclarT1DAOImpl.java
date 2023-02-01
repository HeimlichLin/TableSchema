package com.doc.common.dao.impl; 
 
public class DeclarT1DAOImpl extends GeneralDAOImpl<DeclarT1Po> implements DeclarT1DAO { 
	public static final DeclarT1DAOImpl INSTANCE = new DeclarT1DAOImpl(); 
	public static final String TABLENAME = "DECLAR_T1"; 

	public DeclarT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclarT1Po> CONVERTER = new MapConverter<DeclarT1Po>() { 
 
		@Override 
		public DeclarT1Po convert(final DataObject dataObject) { 
			final DeclarT1Po declarT1Po = new DeclarT1Po(); 
			declarT1Po.setTransactionId(dataObject.getString(DeclarT1Po.COLUMNS.TRANSACTION_ID.name())); 
			declarT1Po.setMsgType(dataObject.getString(DeclarT1Po.COLUMNS.MSG_TYPE.name())); 
			declarT1Po.setProcStatus(dataObject.getString(DeclarT1Po.COLUMNS.PROC_STATUS.name())); 
			declarT1Po.setDownTime(dataObject.getString(DeclarT1Po.COLUMNS.DOWN_TIME.name())); 
			declarT1Po.setStartTime(dataObject.getString(DeclarT1Po.COLUMNS.START_TIME.name())); 
			declarT1Po.setEndTime(dataObject.getString(DeclarT1Po.COLUMNS.END_TIME.name())); 
			declarT1Po.setConsumer(dataObject.getString(DeclarT1Po.COLUMNS.CONSUMER.name())); 
			declarT1Po.setDeclno(dataObject.getString(DeclarT1Po.COLUMNS.DECLNO.name())); 
			return declarT1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclarT1Po declarT1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclarT1Po.COLUMNS.TRANSACTION_ID.name(), declarT1Po.getTransactionId()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.MSG_TYPE.name(), declarT1Po.getMsgType()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.PROC_STATUS.name(), declarT1Po.getProcStatus()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.DOWN_TIME.name(), declarT1Po.getDownTime()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.START_TIME.name(), declarT1Po.getStartTime()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.END_TIME.name(), declarT1Po.getEndTime()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.CONSUMER.name(), declarT1Po.getConsumer()); 
			dataObject.setValue(DeclarT1Po.COLUMNS.DECLNO.name(), declarT1Po.getDeclno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclarT1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclarT1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeclarT1Po.COLUMNS.TRANSACTION_ID.name(), po.getTransactionId()); 
		return sqlWhere; 
	} 
 
} 
