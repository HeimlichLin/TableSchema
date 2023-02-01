package com.doc.common.dao.impl; 
 
public class T5117dBugDAOImpl extends GeneralDAOImpl<T5117dBugPo> implements T5117dBugDAO { 
	public static final T5117dBugDAOImpl INSTANCE = new T5117dBugDAOImpl(); 
	public static final String TABLENAME = "T5117D_BUG"; 

	public T5117dBugDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117dBugPo> CONVERTER = new MapConverter<T5117dBugPo>() { 
 
		@Override 
		public T5117dBugPo convert(final DataObject dataObject) { 
			final T5117dBugPo t5117dBugPo = new T5117dBugPo(); 
			t5117dBugPo.setControlno(dataObject.getString(T5117dBugPo.COLUMNS.CONTROLNO.name())); 
			t5117dBugPo.setDeclno(dataObject.getString(T5117dBugPo.COLUMNS.DECLNO.name())); 
			t5117dBugPo.setPartialreleasenote(dataObject.getString(T5117dBugPo.COLUMNS.PARTIALRELEASENOTE.name())); 
			t5117dBugPo.setGcodate(dataObject.getString(T5117dBugPo.COLUMNS.GCODATE.name())); 
			t5117dBugPo.setDecltype(dataObject.getString(T5117dBugPo.COLUMNS.DECLTYPE.name())); 
			t5117dBugPo.setIe(dataObject.getString(T5117dBugPo.COLUMNS.IE.name())); 
			return t5117dBugPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117dBugPo t5117dBugPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117dBugPo.COLUMNS.CONTROLNO.name(), t5117dBugPo.getControlno()); 
			dataObject.setValue(T5117dBugPo.COLUMNS.DECLNO.name(), t5117dBugPo.getDeclno()); 
			dataObject.setValue(T5117dBugPo.COLUMNS.PARTIALRELEASENOTE.name(), t5117dBugPo.getPartialreleasenote()); 
			dataObject.setValue(T5117dBugPo.COLUMNS.GCODATE.name(), t5117dBugPo.getGcodate()); 
			dataObject.setValue(T5117dBugPo.COLUMNS.DECLTYPE.name(), t5117dBugPo.getDecltype()); 
			dataObject.setValue(T5117dBugPo.COLUMNS.IE.name(), t5117dBugPo.getIe()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117dBugPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117dBugPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
