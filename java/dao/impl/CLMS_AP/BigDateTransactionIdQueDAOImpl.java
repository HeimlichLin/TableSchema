package com.doc.common.dao.impl; 
 
public class BigDateTransactionIdQueDAOImpl extends GeneralDAOImpl<BigDateTransactionIdQuePo> implements BigDateTransactionIdQueDAO { 
	public static final BigDateTransactionIdQueDAOImpl INSTANCE = new BigDateTransactionIdQueDAOImpl(); 
	public static final String TABLENAME = "BIG_DATE_TRANSACTION_ID_QUE"; 

	public BigDateTransactionIdQueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BigDateTransactionIdQuePo> CONVERTER = new MapConverter<BigDateTransactionIdQuePo>() { 
 
		@Override 
		public BigDateTransactionIdQuePo convert(final DataObject dataObject) { 
			final BigDateTransactionIdQuePo bigDateTransactionIdQuePo = new BigDateTransactionIdQuePo(); 
			bigDateTransactionIdQuePo.setTransactionId(dataObject.getString(BigDateTransactionIdQuePo.COLUMNS.TRANSACTION_ID.name())); 
			bigDateTransactionIdQuePo.setDeclNo(dataObject.getString(BigDateTransactionIdQuePo.COLUMNS.DECL_NO.name())); 
			bigDateTransactionIdQuePo.setStatus(dataObject.getString(BigDateTransactionIdQuePo.COLUMNS.STATUS.name())); 
			bigDateTransactionIdQuePo.setMsgType(dataObject.getString(BigDateTransactionIdQuePo.COLUMNS.MSG_TYPE.name())); 
			return bigDateTransactionIdQuePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BigDateTransactionIdQuePo bigDateTransactionIdQuePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BigDateTransactionIdQuePo.COLUMNS.TRANSACTION_ID.name(), bigDateTransactionIdQuePo.getTransactionId()); 
			dataObject.setValue(BigDateTransactionIdQuePo.COLUMNS.DECL_NO.name(), bigDateTransactionIdQuePo.getDeclNo()); 
			dataObject.setValue(BigDateTransactionIdQuePo.COLUMNS.STATUS.name(), bigDateTransactionIdQuePo.getStatus()); 
			dataObject.setValue(BigDateTransactionIdQuePo.COLUMNS.MSG_TYPE.name(), bigDateTransactionIdQuePo.getMsgType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BigDateTransactionIdQuePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BigDateTransactionIdQuePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BigDateTransactionIdQuePo.COLUMNS.TRANSACTION_ID.name(), po.getTransactionId()); 
		sqlWhere.add(BigDateTransactionIdQuePo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(BigDateTransactionIdQuePo.COLUMNS.MSG_TYPE.name(), po.getMsgType()); 
		return sqlWhere; 
	} 
 
} 
