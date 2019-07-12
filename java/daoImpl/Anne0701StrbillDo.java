package com.doc.common.dao.impl; 
 
public class Anne0701StrbillDAO extends GeneralDAOImpl<Anne0701StrbillDo> implements Anne0701StrbillDAO { 
	public static final Anne0701StrbillDAOImpl INSTANCE = new Anne0701StrbillDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_STRBILL"; 

	public Anne0701StrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Anne0701StrbillDo> CONVERTER = new MapConverter<Anne0701StrbillDo>() { 
 
		@Override 
		public Anne0701StrbillDo convert(final DataObject dataObject) { 
			final Anne0701StrbillDo anne0701StrbillDo = new Anne0701StrbillDo(); 
			anne0701StrbillDo.setMsgfun(dataObject.getString(Anne0701StrbillDo.COLUMNS.MSGFUN.name())); 
			anne0701StrbillDo.setBondno(dataObject.getString(Anne0701StrbillDo.COLUMNS.BONDNO.name())); 
			anne0701StrbillDo.setStrtype(dataObject.getString(Anne0701StrbillDo.COLUMNS.STRTYPE.name())); 
			anne0701StrbillDo.setGdstype(dataObject.getString(Anne0701StrbillDo.COLUMNS.GDSTYPE.name())); 
			anne0701StrbillDo.setRefbillno(dataObject.getString(Anne0701StrbillDo.COLUMNS.REFBILLNO.name())); 
			anne0701StrbillDo.setCtmcode(dataObject.getString(Anne0701StrbillDo.COLUMNS.CTMCODE.name())); 
			anne0701StrbillDo.setSubcon(dataObject.getString(Anne0701StrbillDo.COLUMNS.SUBCON.name())); 
			return anne0701StrbillDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701StrbillDo anne0701StrbillDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.MSGFUN.name(), anne0701StrbillDo.getMsgfun()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.BONDNO.name(), anne0701StrbillDo.getBondno()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.STRTYPE.name(), anne0701StrbillDo.getStrtype()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.GDSTYPE.name(), anne0701StrbillDo.getGdstype()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.REFBILLNO.name(), anne0701StrbillDo.getRefbillno()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.CTMCODE.name(), anne0701StrbillDo.getCtmcode()); 
			dataObject.setValue(Anne0701StrbillDo.COLUMNS.SUBCON.name(), anne0701StrbillDo.getSubcon()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701StrbillDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701StrbillDo po) { 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(Anne0701StrbillDo.COLUMNS.SUBCON.name(), po.getSubcon()); 
	} 
 
} 
