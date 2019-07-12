package com.doc.common.dao.impl; 
 
public class StrbillLogDAOImpl extends GeneralDAOImpl<StrbillLogDo> implements StrbillLogDAOImpl { 
	public static final StrbillLogDAOImpl INSTANCE = new StrbillLogDAOImpl(); 
	public static final String TABLENAME = "STRBILL_LOG"; 

	public StrbillLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<StrbillLogDo> CONVERTER = new MapConverter<StrbillLogDo>() { 
 
		@Override 
		public StrbillLogDo convert(final DataObject dataObject) { 
			final StrbillLogDo strbillLogDo = new StrbillLogDo(); 
			strbillLogDo.setMsgfun(dataObject.getString(StrbillLogDo.COLUMNS.MSGFUN.name())); 
			strbillLogDo.setBondno(dataObject.getString(StrbillLogDo.COLUMNS.BONDNO.name())); 
			strbillLogDo.setStrtype(dataObject.getString(StrbillLogDo.COLUMNS.STRTYPE.name())); 
			strbillLogDo.setGdstype(dataObject.getString(StrbillLogDo.COLUMNS.GDSTYPE.name())); 
			strbillLogDo.setRefbillno(dataObject.getString(StrbillLogDo.COLUMNS.REFBILLNO.name())); 
			strbillLogDo.setCtmcode(dataObject.getString(StrbillLogDo.COLUMNS.CTMCODE.name())); 
			strbillLogDo.setSubcon(dataObject.getString(StrbillLogDo.COLUMNS.SUBCON.name())); 
			strbillLogDo.setOthers(dataObject.getString(StrbillLogDo.COLUMNS.OTHERS.name())); 
			strbillLogDo.setProcesstime(dataObject.getString(StrbillLogDo.COLUMNS.PROCESSTIME.name())); 
			strbillLogDo.setProcessstate(dataObject.getString(StrbillLogDo.COLUMNS.PROCESSSTATE.name())); 
			return strbillLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrbillLogDo strbillLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrbillLogDo.COLUMNS.MSGFUN.name(), strbillLogDo.getMsgfun()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.BONDNO.name(), strbillLogDo.getBondno()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.STRTYPE.name(), strbillLogDo.getStrtype()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.GDSTYPE.name(), strbillLogDo.getGdstype()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.REFBILLNO.name(), strbillLogDo.getRefbillno()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.CTMCODE.name(), strbillLogDo.getCtmcode()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.SUBCON.name(), strbillLogDo.getSubcon()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.OTHERS.name(), strbillLogDo.getOthers()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.PROCESSTIME.name(), strbillLogDo.getProcesstime()); 
			dataObject.setValue(StrbillLogDo.COLUMNS.PROCESSSTATE.name(), strbillLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrbillLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrbillLogDo po) { 
	} 
 
} 
