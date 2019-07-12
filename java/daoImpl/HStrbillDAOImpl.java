package com.doc.common.dao.impl; 
 
public class HStrbillDAOImpl extends GeneralDAOImpl<HStrbillDo> implements HStrbillDAOImpl { 
	public static final HStrbillDAOImpl INSTANCE = new HStrbillDAOImpl(); 
	public static final String TABLENAME = "H_STRBILL"; 

	public HStrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HStrbillDo> CONVERTER = new MapConverter<HStrbillDo>() { 
 
		@Override 
		public HStrbillDo convert(final DataObject dataObject) { 
			final HStrbillDo hStrbillDo = new HStrbillDo(); 
			hStrbillDo.setMsgfun(dataObject.getString(HStrbillDo.COLUMNS.MSGFUN.name())); 
			hStrbillDo.setBondno(dataObject.getString(HStrbillDo.COLUMNS.BONDNO.name())); 
			hStrbillDo.setStrtype(dataObject.getString(HStrbillDo.COLUMNS.STRTYPE.name())); 
			hStrbillDo.setGdstype(dataObject.getString(HStrbillDo.COLUMNS.GDSTYPE.name())); 
			hStrbillDo.setRefbillno(dataObject.getString(HStrbillDo.COLUMNS.REFBILLNO.name())); 
			hStrbillDo.setCtmcode(dataObject.getString(HStrbillDo.COLUMNS.CTMCODE.name())); 
			hStrbillDo.setSubcon(dataObject.getString(HStrbillDo.COLUMNS.SUBCON.name())); 
			hStrbillDo.setUpdtime(dataObject.getString(HStrbillDo.COLUMNS.UPDTIME.name())); 
			return hStrbillDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HStrbillDo hStrbillDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HStrbillDo.COLUMNS.MSGFUN.name(), hStrbillDo.getMsgfun()); 
			dataObject.setValue(HStrbillDo.COLUMNS.BONDNO.name(), hStrbillDo.getBondno()); 
			dataObject.setValue(HStrbillDo.COLUMNS.STRTYPE.name(), hStrbillDo.getStrtype()); 
			dataObject.setValue(HStrbillDo.COLUMNS.GDSTYPE.name(), hStrbillDo.getGdstype()); 
			dataObject.setValue(HStrbillDo.COLUMNS.REFBILLNO.name(), hStrbillDo.getRefbillno()); 
			dataObject.setValue(HStrbillDo.COLUMNS.CTMCODE.name(), hStrbillDo.getCtmcode()); 
			dataObject.setValue(HStrbillDo.COLUMNS.SUBCON.name(), hStrbillDo.getSubcon()); 
			dataObject.setValue(HStrbillDo.COLUMNS.UPDTIME.name(), hStrbillDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HStrbillDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HStrbillDo po) { 
		sqlWhere.add(HStrbillDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HStrbillDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(HStrbillDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
	} 
 
} 
