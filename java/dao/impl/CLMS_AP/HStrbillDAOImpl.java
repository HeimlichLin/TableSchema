package com.doc.common.dao.impl; 
 
public class HStrbillDAOImpl extends GeneralDAOImpl<HStrbillPo> implements HStrbillDAO { 
	public static final HStrbillDAOImpl INSTANCE = new HStrbillDAOImpl(); 
	public static final String TABLENAME = "H_STRBILL"; 

	public HStrbillDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HStrbillPo> CONVERTER = new MapConverter<HStrbillPo>() { 
 
		@Override 
		public HStrbillPo convert(final DataObject dataObject) { 
			final HStrbillPo hStrbillPo = new HStrbillPo(); 
			hStrbillPo.setMsgfun(dataObject.getString(HStrbillPo.COLUMNS.MSGFUN.name())); 
			hStrbillPo.setBondno(dataObject.getString(HStrbillPo.COLUMNS.BONDNO.name())); 
			hStrbillPo.setStrtype(dataObject.getString(HStrbillPo.COLUMNS.STRTYPE.name())); 
			hStrbillPo.setGdstype(dataObject.getString(HStrbillPo.COLUMNS.GDSTYPE.name())); 
			hStrbillPo.setRefbillno(dataObject.getString(HStrbillPo.COLUMNS.REFBILLNO.name())); 
			hStrbillPo.setCtmcode(dataObject.getString(HStrbillPo.COLUMNS.CTMCODE.name())); 
			hStrbillPo.setSubcon(dataObject.getString(HStrbillPo.COLUMNS.SUBCON.name())); 
			hStrbillPo.setUpdtime(dataObject.getString(HStrbillPo.COLUMNS.UPDTIME.name())); 
			return hStrbillPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HStrbillPo hStrbillPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HStrbillPo.COLUMNS.MSGFUN.name(), hStrbillPo.getMsgfun()); 
			dataObject.setValue(HStrbillPo.COLUMNS.BONDNO.name(), hStrbillPo.getBondno()); 
			dataObject.setValue(HStrbillPo.COLUMNS.STRTYPE.name(), hStrbillPo.getStrtype()); 
			dataObject.setValue(HStrbillPo.COLUMNS.GDSTYPE.name(), hStrbillPo.getGdstype()); 
			dataObject.setValue(HStrbillPo.COLUMNS.REFBILLNO.name(), hStrbillPo.getRefbillno()); 
			dataObject.setValue(HStrbillPo.COLUMNS.CTMCODE.name(), hStrbillPo.getCtmcode()); 
			dataObject.setValue(HStrbillPo.COLUMNS.SUBCON.name(), hStrbillPo.getSubcon()); 
			dataObject.setValue(HStrbillPo.COLUMNS.UPDTIME.name(), hStrbillPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HStrbillPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HStrbillPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HStrbillPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HStrbillPo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(HStrbillPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		return sqlWhere; 
	} 
 
} 
