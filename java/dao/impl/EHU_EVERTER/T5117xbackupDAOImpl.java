package com.doc.common.dao.impl; 
 
public class T5117xbackupDAOImpl extends GeneralDAOImpl<T5117xbackupPo> implements T5117xbackupDAO { 
	public static final T5117xbackupDAOImpl INSTANCE = new T5117xbackupDAOImpl(); 
	public static final String TABLENAME = "T5117XBACKUP"; 

	public T5117xbackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117xbackupPo> CONVERTER = new MapConverter<T5117xbackupPo>() { 
 
		@Override 
		public T5117xbackupPo convert(final DataObject dataObject) { 
			final T5117xbackupPo t5117xbackupPo = new T5117xbackupPo(); 
			t5117xbackupPo.setControlno(dataObject.getString(T5117xbackupPo.COLUMNS.CONTROLNO.name())); 
			t5117xbackupPo.setDeclno(dataObject.getString(T5117xbackupPo.COLUMNS.DECLNO.name())); 
			t5117xbackupPo.setMwb(dataObject.getString(T5117xbackupPo.COLUMNS.MWB.name())); 
			t5117xbackupPo.setHwb(dataObject.getString(T5117xbackupPo.COLUMNS.HWB.name())); 
			t5117xbackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(T5117xbackupPo.COLUMNS.LASTUPDATE.name()))); 
			return t5117xbackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117xbackupPo t5117xbackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117xbackupPo.COLUMNS.CONTROLNO.name(), t5117xbackupPo.getControlno()); 
			dataObject.setValue(T5117xbackupPo.COLUMNS.DECLNO.name(), t5117xbackupPo.getDeclno()); 
			dataObject.setValue(T5117xbackupPo.COLUMNS.MWB.name(), t5117xbackupPo.getMwb()); 
			dataObject.setValue(T5117xbackupPo.COLUMNS.HWB.name(), t5117xbackupPo.getHwb()); 
			dataObject.setValue(T5117xbackupPo.COLUMNS.LASTUPDATE.name(), t5117xbackupPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117xbackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117xbackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
