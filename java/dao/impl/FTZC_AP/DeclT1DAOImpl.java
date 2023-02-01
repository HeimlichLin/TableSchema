package com.doc.common.dao.impl; 
 
public class DeclT1DAOImpl extends GeneralDAOImpl<DeclT1Po> implements DeclT1DAO { 
	public static final DeclT1DAOImpl INSTANCE = new DeclT1DAOImpl(); 
	public static final String TABLENAME = "DECL_T1"; 

	public DeclT1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeclT1Po> CONVERTER = new MapConverter<DeclT1Po>() { 
 
		@Override 
		public DeclT1Po convert(final DataObject dataObject) { 
			final DeclT1Po declT1Po = new DeclT1Po(); 
			declT1Po.setTransactionId(dataObject.getString(DeclT1Po.COLUMNS.TRANSACTION_ID.name())); 
			declT1Po.setMsgType(dataObject.getString(DeclT1Po.COLUMNS.MSG_TYPE.name())); 
			declT1Po.setProcStatus(dataObject.getString(DeclT1Po.COLUMNS.PROC_STATUS.name())); 
			declT1Po.setDownTime(dataObject.getString(DeclT1Po.COLUMNS.DOWN_TIME.name())); 
			declT1Po.setStartTime(dataObject.getString(DeclT1Po.COLUMNS.START_TIME.name())); 
			declT1Po.setEndTime(dataObject.getString(DeclT1Po.COLUMNS.END_TIME.name())); 
			declT1Po.setConsumer(dataObject.getString(DeclT1Po.COLUMNS.CONSUMER.name())); 
			declT1Po.setDeclno(dataObject.getString(DeclT1Po.COLUMNS.DECLNO.name())); 
			return declT1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeclT1Po declT1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeclT1Po.COLUMNS.TRANSACTION_ID.name(), declT1Po.getTransactionId()); 
			dataObject.setValue(DeclT1Po.COLUMNS.MSG_TYPE.name(), declT1Po.getMsgType()); 
			dataObject.setValue(DeclT1Po.COLUMNS.PROC_STATUS.name(), declT1Po.getProcStatus()); 
			dataObject.setValue(DeclT1Po.COLUMNS.DOWN_TIME.name(), declT1Po.getDownTime()); 
			dataObject.setValue(DeclT1Po.COLUMNS.START_TIME.name(), declT1Po.getStartTime()); 
			dataObject.setValue(DeclT1Po.COLUMNS.END_TIME.name(), declT1Po.getEndTime()); 
			dataObject.setValue(DeclT1Po.COLUMNS.CONSUMER.name(), declT1Po.getConsumer()); 
			dataObject.setValue(DeclT1Po.COLUMNS.DECLNO.name(), declT1Po.getDeclno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeclT1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeclT1Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeclT1Po.COLUMNS.TRANSACTION_ID.name(), po.getTransactionId()); 
		return sqlWhere; 
	} 
 
} 
