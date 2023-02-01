package com.doc.common.dao.impl; 
 
public class Anne0701StrbillDAOImpl extends GeneralDAOImpl<Anne0701StrbillPo> implements Anne0701StrbillDAO { 
	public static final Anne0701StrbillDAOImpl INSTANCE = new Anne0701StrbillDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_STRBILL"; 

	public Anne0701StrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Anne0701StrbillPo> CONVERTER = new MapConverter<Anne0701StrbillPo>() { 
 
		@Override 
		public Anne0701StrbillPo convert(final DataObject dataObject) { 
			final Anne0701StrbillPo anne0701StrbillPo = new Anne0701StrbillPo(); 
			anne0701StrbillPo.setMsgfun(dataObject.getString(Anne0701StrbillPo.COLUMNS.MSGFUN.name())); 
			anne0701StrbillPo.setBondno(dataObject.getString(Anne0701StrbillPo.COLUMNS.BONDNO.name())); 
			anne0701StrbillPo.setStrtype(dataObject.getString(Anne0701StrbillPo.COLUMNS.STRTYPE.name())); 
			anne0701StrbillPo.setGdstype(dataObject.getString(Anne0701StrbillPo.COLUMNS.GDSTYPE.name())); 
			anne0701StrbillPo.setRefbillno(dataObject.getString(Anne0701StrbillPo.COLUMNS.REFBILLNO.name())); 
			anne0701StrbillPo.setCtmcode(dataObject.getString(Anne0701StrbillPo.COLUMNS.CTMCODE.name())); 
			anne0701StrbillPo.setSubcon(dataObject.getString(Anne0701StrbillPo.COLUMNS.SUBCON.name())); 
			return anne0701StrbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701StrbillPo anne0701StrbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.MSGFUN.name(), anne0701StrbillPo.getMsgfun()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.BONDNO.name(), anne0701StrbillPo.getBondno()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.STRTYPE.name(), anne0701StrbillPo.getStrtype()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.GDSTYPE.name(), anne0701StrbillPo.getGdstype()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.REFBILLNO.name(), anne0701StrbillPo.getRefbillno()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.CTMCODE.name(), anne0701StrbillPo.getCtmcode()); 
			dataObject.setValue(Anne0701StrbillPo.COLUMNS.SUBCON.name(), anne0701StrbillPo.getSubcon()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701StrbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701StrbillPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
