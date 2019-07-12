package com.doc.common.dao.impl; 
 
public class StrbillDAOImpl extends GeneralDAOImpl<StrbillDo> implements StrbillDAOImpl { 
	public static final StrbillDAOImpl INSTANCE = new StrbillDAOImpl(); 
	public static final String TABLENAME = "STRBILL"; 

	public StrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<StrbillDo> CONVERTER = new MapConverter<StrbillDo>() { 
 
		@Override 
		public StrbillDo convert(final DataObject dataObject) { 
			final StrbillDo strbillDo = new StrbillDo(); 
			strbillDo.setMsgfun(dataObject.getString(StrbillDo.COLUMNS.MSGFUN.name())); 
			strbillDo.setBondno(dataObject.getString(StrbillDo.COLUMNS.BONDNO.name())); 
			strbillDo.setStrtype(dataObject.getString(StrbillDo.COLUMNS.STRTYPE.name())); 
			strbillDo.setGdstype(dataObject.getString(StrbillDo.COLUMNS.GDSTYPE.name())); 
			strbillDo.setRefbillno(dataObject.getString(StrbillDo.COLUMNS.REFBILLNO.name())); 
			strbillDo.setCtmcode(dataObject.getString(StrbillDo.COLUMNS.CTMCODE.name())); 
			strbillDo.setSubcon(dataObject.getString(StrbillDo.COLUMNS.SUBCON.name())); 
			strbillDo.setOthers(dataObject.getString(StrbillDo.COLUMNS.OTHERS.name())); 
			return strbillDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrbillDo strbillDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrbillDo.COLUMNS.MSGFUN.name(), strbillDo.getMsgfun()); 
			dataObject.setValue(StrbillDo.COLUMNS.BONDNO.name(), strbillDo.getBondno()); 
			dataObject.setValue(StrbillDo.COLUMNS.STRTYPE.name(), strbillDo.getStrtype()); 
			dataObject.setValue(StrbillDo.COLUMNS.GDSTYPE.name(), strbillDo.getGdstype()); 
			dataObject.setValue(StrbillDo.COLUMNS.REFBILLNO.name(), strbillDo.getRefbillno()); 
			dataObject.setValue(StrbillDo.COLUMNS.CTMCODE.name(), strbillDo.getCtmcode()); 
			dataObject.setValue(StrbillDo.COLUMNS.SUBCON.name(), strbillDo.getSubcon()); 
			dataObject.setValue(StrbillDo.COLUMNS.OTHERS.name(), strbillDo.getOthers()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrbillDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrbillDo po) { 
		sqlWhere.add(StrbillDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(StrbillDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(StrbillDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
	} 
 
} 
