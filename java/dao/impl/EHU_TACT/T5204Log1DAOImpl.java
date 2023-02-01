package com.doc.common.dao.impl; 
 
public class T5204Log1DAOImpl extends GeneralDAOImpl<T5204Log1Po> implements T5204Log1DAO { 
	public static final T5204Log1DAOImpl INSTANCE = new T5204Log1DAOImpl(); 
	public static final String TABLENAME = "T5204_LOG1"; 

	public T5204Log1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5204Log1Po> CONVERTER = new MapConverter<T5204Log1Po>() { 
 
		@Override 
		public T5204Log1Po convert(final DataObject dataObject) { 
			final T5204Log1Po t5204Log1Po = new T5204Log1Po(); 
			t5204Log1Po.setSn(BigDecimalUtils.formObj(dataObject.getValue(T5204Log1Po.COLUMNS.SN.name()))); 
			t5204Log1Po.setLogInfo(dataObject.getString(T5204Log1Po.COLUMNS.LOG_INFO.name())); 
			t5204Log1Po.setCrtDate1(TimestampUtils.of(dataObject.getValue(T5204Log1Po.COLUMNS.CRT_DATE1.name()))); 
			return t5204Log1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5204Log1Po t5204Log1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5204Log1Po.COLUMNS.SN.name(), t5204Log1Po.getSn()); 
			dataObject.setValue(T5204Log1Po.COLUMNS.LOG_INFO.name(), t5204Log1Po.getLogInfo()); 
			dataObject.setValue(T5204Log1Po.COLUMNS.CRT_DATE1.name(), t5204Log1Po.getCrtDate1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5204Log1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5204Log1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
