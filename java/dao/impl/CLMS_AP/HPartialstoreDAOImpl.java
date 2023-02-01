package com.doc.common.dao.impl; 
 
public class HPartialstoreDAOImpl extends GeneralDAOImpl<HPartialstorePo> implements HPartialstoreDAO { 
	public static final HPartialstoreDAOImpl INSTANCE = new HPartialstoreDAOImpl(); 
	public static final String TABLENAME = "H_PARTIALSTORE"; 

	public HPartialstoreDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HPartialstorePo> CONVERTER = new MapConverter<HPartialstorePo>() { 
 
		@Override 
		public HPartialstorePo convert(final DataObject dataObject) { 
			final HPartialstorePo hPartialstorePo = new HPartialstorePo(); 
			hPartialstorePo.setMsgfun(dataObject.getString(HPartialstorePo.COLUMNS.MSGFUN.name())); 
			hPartialstorePo.setBondno(dataObject.getString(HPartialstorePo.COLUMNS.BONDNO.name())); 
			hPartialstorePo.setRefbillno(dataObject.getString(HPartialstorePo.COLUMNS.REFBILLNO.name())); 
			hPartialstorePo.setCtmcode(dataObject.getString(HPartialstorePo.COLUMNS.CTMCODE.name())); 
			hPartialstorePo.setRefercode(dataObject.getString(HPartialstorePo.COLUMNS.REFERCODE.name())); 
			hPartialstorePo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HPartialstorePo.COLUMNS.ITEM.name()))); 
			hPartialstorePo.setPrdtno(dataObject.getString(HPartialstorePo.COLUMNS.PRDTNO.name())); 
			hPartialstorePo.setStrtype(dataObject.getString(HPartialstorePo.COLUMNS.STRTYPE.name())); 
			hPartialstorePo.setGdstype(dataObject.getString(HPartialstorePo.COLUMNS.GDSTYPE.name())); 
			hPartialstorePo.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(HPartialstorePo.COLUMNS.RSTRQTY.name()))); 
			hPartialstorePo.setStrunit(dataObject.getString(HPartialstorePo.COLUMNS.STRUNIT.name())); 
			hPartialstorePo.setStrpost(dataObject.getString(HPartialstorePo.COLUMNS.STRPOST.name())); 
			hPartialstorePo.setStrdate(dataObject.getString(HPartialstorePo.COLUMNS.STRDATE.name())); 
			hPartialstorePo.setBatchno(dataObject.getString(HPartialstorePo.COLUMNS.BATCHNO.name())); 
			hPartialstorePo.setStockno(dataObject.getString(HPartialstorePo.COLUMNS.STOCKNO.name())); 
			hPartialstorePo.setOutstrno(dataObject.getString(HPartialstorePo.COLUMNS.OUTSTRNO.name())); 
			hPartialstorePo.setDecltype(dataObject.getString(HPartialstorePo.COLUMNS.DECLTYPE.name())); 
			hPartialstorePo.setDeclno(dataObject.getString(HPartialstorePo.COLUMNS.DECLNO.name())); 
			hPartialstorePo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HPartialstorePo.COLUMNS.ITEMNO.name()))); 
			hPartialstorePo.setOdeclno(dataObject.getString(HPartialstorePo.COLUMNS.ODECLNO.name())); 
			hPartialstorePo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HPartialstorePo.COLUMNS.OITEMNO.name()))); 
			hPartialstorePo.setRealstatus(dataObject.getString(HPartialstorePo.COLUMNS.REALSTATUS.name())); 
			hPartialstorePo.setMonthno(dataObject.getString(HPartialstorePo.COLUMNS.MONTHNO.name())); 
			hPartialstorePo.setUserid(dataObject.getString(HPartialstorePo.COLUMNS.USERID.name())); 
			hPartialstorePo.setUpdtime(dataObject.getString(HPartialstorePo.COLUMNS.UPDTIME.name())); 
			hPartialstorePo.setConfirmdate(dataObject.getString(HPartialstorePo.COLUMNS.CONFIRMDATE.name())); 
			return hPartialstorePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HPartialstorePo hPartialstorePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HPartialstorePo.COLUMNS.MSGFUN.name(), hPartialstorePo.getMsgfun()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.BONDNO.name(), hPartialstorePo.getBondno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.REFBILLNO.name(), hPartialstorePo.getRefbillno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.CTMCODE.name(), hPartialstorePo.getCtmcode()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.REFERCODE.name(), hPartialstorePo.getRefercode()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.ITEM.name(), hPartialstorePo.getItem()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.PRDTNO.name(), hPartialstorePo.getPrdtno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.STRTYPE.name(), hPartialstorePo.getStrtype()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.GDSTYPE.name(), hPartialstorePo.getGdstype()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.RSTRQTY.name(), hPartialstorePo.getRstrqty()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.STRUNIT.name(), hPartialstorePo.getStrunit()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.STRPOST.name(), hPartialstorePo.getStrpost()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.STRDATE.name(), hPartialstorePo.getStrdate()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.BATCHNO.name(), hPartialstorePo.getBatchno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.STOCKNO.name(), hPartialstorePo.getStockno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.OUTSTRNO.name(), hPartialstorePo.getOutstrno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.DECLTYPE.name(), hPartialstorePo.getDecltype()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.DECLNO.name(), hPartialstorePo.getDeclno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.ITEMNO.name(), hPartialstorePo.getItemno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.ODECLNO.name(), hPartialstorePo.getOdeclno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.OITEMNO.name(), hPartialstorePo.getOitemno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.REALSTATUS.name(), hPartialstorePo.getRealstatus()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.MONTHNO.name(), hPartialstorePo.getMonthno()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.USERID.name(), hPartialstorePo.getUserid()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.UPDTIME.name(), hPartialstorePo.getUpdtime()); 
			dataObject.setValue(HPartialstorePo.COLUMNS.CONFIRMDATE.name(), hPartialstorePo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HPartialstorePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HPartialstorePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HPartialstorePo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HPartialstorePo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HPartialstorePo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HPartialstorePo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(HPartialstorePo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(HPartialstorePo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		return sqlWhere; 
	} 
 
} 
