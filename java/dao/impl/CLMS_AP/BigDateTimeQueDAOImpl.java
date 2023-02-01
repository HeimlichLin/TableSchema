package com.doc.common.dao.impl; 
 
public class BigDateTimeQueDAOImpl extends GeneralDAOImpl<BigDateTimeQuePo> implements BigDateTimeQueDAO { 
	public static final BigDateTimeQueDAOImpl INSTANCE = new BigDateTimeQueDAOImpl(); 
	public static final String TABLENAME = "BIG_DATE_TIME_QUE"; 

	public BigDateTimeQueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BigDateTimeQuePo> CONVERTER = new MapConverter<BigDateTimeQuePo>() { 
 
		@Override 
		public BigDateTimeQuePo convert(final DataObject dataObject) { 
			final BigDateTimeQuePo bigDateTimeQuePo = new BigDateTimeQuePo(); 
			bigDateTimeQuePo.setMsgType(dataObject.getString(BigDateTimeQuePo.COLUMNS.MSG_TYPE.name())); 
			bigDateTimeQuePo.setTime(dataObject.getString(BigDateTimeQuePo.COLUMNS.TIME.name())); 
			bigDateTimeQuePo.setStatus(dataObject.getString(BigDateTimeQuePo.COLUMNS.STATUS.name())); 
			return bigDateTimeQuePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BigDateTimeQuePo bigDateTimeQuePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BigDateTimeQuePo.COLUMNS.MSG_TYPE.name(), bigDateTimeQuePo.getMsgType()); 
			dataObject.setValue(BigDateTimeQuePo.COLUMNS.TIME.name(), bigDateTimeQuePo.getTime()); 
			dataObject.setValue(BigDateTimeQuePo.COLUMNS.STATUS.name(), bigDateTimeQuePo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BigDateTimeQuePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BigDateTimeQuePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BigDateTimeQuePo.COLUMNS.MSG_TYPE.name(), po.getMsgType()); 
		sqlWhere.add(BigDateTimeQuePo.COLUMNS.TIME.name(), po.getTime()); 
		return sqlWhere; 
	} 
 
} 
