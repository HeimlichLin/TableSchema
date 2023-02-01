package com.doc.common.dao.impl; 
 
public class StrbillLogDAOImpl extends GeneralDAOImpl<StrbillLogPo> implements StrbillLogDAO { 
	public static final StrbillLogDAOImpl INSTANCE = new StrbillLogDAOImpl(); 
	public static final String TABLENAME = "STRBILL_LOG"; 

	public StrbillLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<StrbillLogPo> CONVERTER = new MapConverter<StrbillLogPo>() { 
 
		@Override 
		public StrbillLogPo convert(final DataObject dataObject) { 
			final StrbillLogPo strbillLogPo = new StrbillLogPo(); 
			strbillLogPo.setMsgfun(dataObject.getString(StrbillLogPo.COLUMNS.MSGFUN.name())); 
			strbillLogPo.setBondno(dataObject.getString(StrbillLogPo.COLUMNS.BONDNO.name())); 
			strbillLogPo.setStrtype(dataObject.getString(StrbillLogPo.COLUMNS.STRTYPE.name())); 
			strbillLogPo.setGdstype(dataObject.getString(StrbillLogPo.COLUMNS.GDSTYPE.name())); 
			strbillLogPo.setRefbillno(dataObject.getString(StrbillLogPo.COLUMNS.REFBILLNO.name())); 
			strbillLogPo.setCtmcode(dataObject.getString(StrbillLogPo.COLUMNS.CTMCODE.name())); 
			strbillLogPo.setSubcon(dataObject.getString(StrbillLogPo.COLUMNS.SUBCON.name())); 
			strbillLogPo.setOthers(dataObject.getString(StrbillLogPo.COLUMNS.OTHERS.name())); 
			strbillLogPo.setProcesstime(dataObject.getString(StrbillLogPo.COLUMNS.PROCESSTIME.name())); 
			strbillLogPo.setProcessstate(dataObject.getString(StrbillLogPo.COLUMNS.PROCESSSTATE.name())); 
			return strbillLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrbillLogPo strbillLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrbillLogPo.COLUMNS.MSGFUN.name(), strbillLogPo.getMsgfun()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.BONDNO.name(), strbillLogPo.getBondno()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.STRTYPE.name(), strbillLogPo.getStrtype()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.GDSTYPE.name(), strbillLogPo.getGdstype()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.REFBILLNO.name(), strbillLogPo.getRefbillno()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.CTMCODE.name(), strbillLogPo.getCtmcode()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.SUBCON.name(), strbillLogPo.getSubcon()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.OTHERS.name(), strbillLogPo.getOthers()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.PROCESSTIME.name(), strbillLogPo.getProcesstime()); 
			dataObject.setValue(StrbillLogPo.COLUMNS.PROCESSSTATE.name(), strbillLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrbillLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrbillLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
