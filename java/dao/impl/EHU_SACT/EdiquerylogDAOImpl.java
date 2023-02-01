package com.doc.common.dao.impl; 
 
public class EdiquerylogDAOImpl extends GeneralDAOImpl<EdiquerylogPo> implements EdiquerylogDAO { 
	public static final EdiquerylogDAOImpl INSTANCE = new EdiquerylogDAOImpl(); 
	public static final String TABLENAME = "EDIQUERYLOG"; 

	public EdiquerylogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EdiquerylogPo> CONVERTER = new MapConverter<EdiquerylogPo>() { 
 
		@Override 
		public EdiquerylogPo convert(final DataObject dataObject) { 
			final EdiquerylogPo ediquerylogPo = new EdiquerylogPo(); 
			ediquerylogPo.setUserid(dataObject.getString(EdiquerylogPo.COLUMNS.USERID.name())); 
			ediquerylogPo.setQuerytable(dataObject.getString(EdiquerylogPo.COLUMNS.QUERYTABLE.name())); 
			ediquerylogPo.setQuerydate(TimestampUtils.of(dataObject.getValue(EdiquerylogPo.COLUMNS.QUERYDATE.name()))); 
			ediquerylogPo.setControlno(dataObject.getString(EdiquerylogPo.COLUMNS.CONTROLNO.name())); 
			ediquerylogPo.setDeclno(dataObject.getString(EdiquerylogPo.COLUMNS.DECLNO.name())); 
			ediquerylogPo.setMwb(dataObject.getString(EdiquerylogPo.COLUMNS.MWB.name())); 
			ediquerylogPo.setHwb(dataObject.getString(EdiquerylogPo.COLUMNS.HWB.name())); 
			ediquerylogPo.setWs(dataObject.getString(EdiquerylogPo.COLUMNS.WS.name())); 
			return ediquerylogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EdiquerylogPo ediquerylogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.USERID.name(), ediquerylogPo.getUserid()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.QUERYTABLE.name(), ediquerylogPo.getQuerytable()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.QUERYDATE.name(), ediquerylogPo.getQuerydate()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.CONTROLNO.name(), ediquerylogPo.getControlno()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.DECLNO.name(), ediquerylogPo.getDeclno()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.MWB.name(), ediquerylogPo.getMwb()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.HWB.name(), ediquerylogPo.getHwb()); 
			dataObject.setValue(EdiquerylogPo.COLUMNS.WS.name(), ediquerylogPo.getWs()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EdiquerylogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EdiquerylogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
