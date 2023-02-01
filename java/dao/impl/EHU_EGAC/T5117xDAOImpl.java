package com.doc.common.dao.impl; 
 
public class T5117xDAOImpl extends GeneralDAOImpl<T5117xPo> implements T5117xDAO { 
	public static final T5117xDAOImpl INSTANCE = new T5117xDAOImpl(); 
	public static final String TABLENAME = "T5117X"; 

	public T5117xDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117xPo> CONVERTER = new MapConverter<T5117xPo>() { 
 
		@Override 
		public T5117xPo convert(final DataObject dataObject) { 
			final T5117xPo t5117xPo = new T5117xPo(); 
			t5117xPo.setControlno(dataObject.getString(T5117xPo.COLUMNS.CONTROLNO.name())); 
			t5117xPo.setDeclno(dataObject.getString(T5117xPo.COLUMNS.DECLNO.name())); 
			t5117xPo.setMwb(dataObject.getString(T5117xPo.COLUMNS.MWB.name())); 
			t5117xPo.setHwb(dataObject.getString(T5117xPo.COLUMNS.HWB.name())); 
			t5117xPo.setLastupdate(TimestampUtils.of(dataObject.getValue(T5117xPo.COLUMNS.LASTUPDATE.name()))); 
			return t5117xPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117xPo t5117xPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117xPo.COLUMNS.CONTROLNO.name(), t5117xPo.getControlno()); 
			dataObject.setValue(T5117xPo.COLUMNS.DECLNO.name(), t5117xPo.getDeclno()); 
			dataObject.setValue(T5117xPo.COLUMNS.MWB.name(), t5117xPo.getMwb()); 
			dataObject.setValue(T5117xPo.COLUMNS.HWB.name(), t5117xPo.getHwb()); 
			dataObject.setValue(T5117xPo.COLUMNS.LASTUPDATE.name(), t5117xPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117xPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117xPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
