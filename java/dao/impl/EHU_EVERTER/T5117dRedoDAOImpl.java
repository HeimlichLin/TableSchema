package com.doc.common.dao.impl; 
 
public class T5117dRedoDAOImpl extends GeneralDAOImpl<T5117dRedoPo> implements T5117dRedoDAO { 
	public static final T5117dRedoDAOImpl INSTANCE = new T5117dRedoDAOImpl(); 
	public static final String TABLENAME = "T5117D_REDO"; 

	public T5117dRedoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<T5117dRedoPo> CONVERTER = new MapConverter<T5117dRedoPo>() { 
 
		@Override 
		public T5117dRedoPo convert(final DataObject dataObject) { 
			final T5117dRedoPo t5117dRedoPo = new T5117dRedoPo(); 
			t5117dRedoPo.setControlno(dataObject.getString(T5117dRedoPo.COLUMNS.CONTROLNO.name())); 
			t5117dRedoPo.setDeclno(dataObject.getString(T5117dRedoPo.COLUMNS.DECLNO.name())); 
			t5117dRedoPo.setPartialreleasenote(dataObject.getString(T5117dRedoPo.COLUMNS.PARTIALRELEASENOTE.name())); 
			t5117dRedoPo.setGcodate(dataObject.getString(T5117dRedoPo.COLUMNS.GCODATE.name())); 
			t5117dRedoPo.setDecltype(dataObject.getString(T5117dRedoPo.COLUMNS.DECLTYPE.name())); 
			t5117dRedoPo.setIe(dataObject.getString(T5117dRedoPo.COLUMNS.IE.name())); 
			return t5117dRedoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final T5117dRedoPo t5117dRedoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.CONTROLNO.name(), t5117dRedoPo.getControlno()); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.DECLNO.name(), t5117dRedoPo.getDeclno()); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.PARTIALRELEASENOTE.name(), t5117dRedoPo.getPartialreleasenote()); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.GCODATE.name(), t5117dRedoPo.getGcodate()); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.DECLTYPE.name(), t5117dRedoPo.getDecltype()); 
			dataObject.setValue(T5117dRedoPo.COLUMNS.IE.name(), t5117dRedoPo.getIe()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<T5117dRedoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(T5117dRedoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
