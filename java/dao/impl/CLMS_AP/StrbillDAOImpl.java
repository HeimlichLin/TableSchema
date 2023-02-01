package com.doc.common.dao.impl; 
 
public class StrbillDAOImpl extends GeneralDAOImpl<StrbillPo> implements StrbillDAO { 
	public static final StrbillDAOImpl INSTANCE = new StrbillDAOImpl(); 
	public static final String TABLENAME = "STRBILL"; 

	public StrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<StrbillPo> CONVERTER = new MapConverter<StrbillPo>() { 
 
		@Override 
		public StrbillPo convert(final DataObject dataObject) { 
			final StrbillPo strbillPo = new StrbillPo(); 
			strbillPo.setMsgfun(dataObject.getString(StrbillPo.COLUMNS.MSGFUN.name())); 
			strbillPo.setBondno(dataObject.getString(StrbillPo.COLUMNS.BONDNO.name())); 
			strbillPo.setStrtype(dataObject.getString(StrbillPo.COLUMNS.STRTYPE.name())); 
			strbillPo.setGdstype(dataObject.getString(StrbillPo.COLUMNS.GDSTYPE.name())); 
			strbillPo.setRefbillno(dataObject.getString(StrbillPo.COLUMNS.REFBILLNO.name())); 
			strbillPo.setCtmcode(dataObject.getString(StrbillPo.COLUMNS.CTMCODE.name())); 
			strbillPo.setSubcon(dataObject.getString(StrbillPo.COLUMNS.SUBCON.name())); 
			strbillPo.setOthers(dataObject.getString(StrbillPo.COLUMNS.OTHERS.name())); 
			return strbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final StrbillPo strbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(StrbillPo.COLUMNS.MSGFUN.name(), strbillPo.getMsgfun()); 
			dataObject.setValue(StrbillPo.COLUMNS.BONDNO.name(), strbillPo.getBondno()); 
			dataObject.setValue(StrbillPo.COLUMNS.STRTYPE.name(), strbillPo.getStrtype()); 
			dataObject.setValue(StrbillPo.COLUMNS.GDSTYPE.name(), strbillPo.getGdstype()); 
			dataObject.setValue(StrbillPo.COLUMNS.REFBILLNO.name(), strbillPo.getRefbillno()); 
			dataObject.setValue(StrbillPo.COLUMNS.CTMCODE.name(), strbillPo.getCtmcode()); 
			dataObject.setValue(StrbillPo.COLUMNS.SUBCON.name(), strbillPo.getSubcon()); 
			dataObject.setValue(StrbillPo.COLUMNS.OTHERS.name(), strbillPo.getOthers()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<StrbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(StrbillPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(StrbillPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(StrbillPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(StrbillPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		return sqlWhere; 
	} 
 
} 
