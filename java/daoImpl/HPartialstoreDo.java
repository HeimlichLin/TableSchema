package com.doc.common.dao.impl; 
 
public class HPartialstoreDAO extends GeneralDAOImpl<HPartialstoreDo> implements HPartialstoreDAO { 
	public static final HPartialstoreDAOImpl INSTANCE = new HPartialstoreDAOImpl(); 
	public static final String TABLENAME = "H_PARTIALSTORE"; 

	public HPartialstoreDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HPartialstoreDo> CONVERTER = new MapConverter<HPartialstoreDo>() { 
 
		@Override 
		public HPartialstoreDo convert(final DataObject dataObject) { 
			final HPartialstoreDo hPartialstoreDo = new HPartialstoreDo(); 
			hPartialstoreDo.setMsgfun(dataObject.getString(HPartialstoreDo.COLUMNS.MSGFUN.name())); 
			hPartialstoreDo.setBondno(dataObject.getString(HPartialstoreDo.COLUMNS.BONDNO.name())); 
			hPartialstoreDo.setRefbillno(dataObject.getString(HPartialstoreDo.COLUMNS.REFBILLNO.name())); 
			hPartialstoreDo.setCtmcode(dataObject.getString(HPartialstoreDo.COLUMNS.CTMCODE.name())); 
			hPartialstoreDo.setRefercode(dataObject.getString(HPartialstoreDo.COLUMNS.REFERCODE.name())); 
			hPartialstoreDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HPartialstoreDo.COLUMNS.ITEM.name()))); 
			hPartialstoreDo.setPrdtno(dataObject.getString(HPartialstoreDo.COLUMNS.PRDTNO.name())); 
			hPartialstoreDo.setStrtype(dataObject.getString(HPartialstoreDo.COLUMNS.STRTYPE.name())); 
			hPartialstoreDo.setGdstype(dataObject.getString(HPartialstoreDo.COLUMNS.GDSTYPE.name())); 
			hPartialstoreDo.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(HPartialstoreDo.COLUMNS.RSTRQTY.name()))); 
			hPartialstoreDo.setStrunit(dataObject.getString(HPartialstoreDo.COLUMNS.STRUNIT.name())); 
			hPartialstoreDo.setStrpost(dataObject.getString(HPartialstoreDo.COLUMNS.STRPOST.name())); 
			hPartialstoreDo.setStrdate(dataObject.getString(HPartialstoreDo.COLUMNS.STRDATE.name())); 
			hPartialstoreDo.setBatchno(dataObject.getString(HPartialstoreDo.COLUMNS.BATCHNO.name())); 
			hPartialstoreDo.setStockno(dataObject.getString(HPartialstoreDo.COLUMNS.STOCKNO.name())); 
			hPartialstoreDo.setOutstrno(dataObject.getString(HPartialstoreDo.COLUMNS.OUTSTRNO.name())); 
			hPartialstoreDo.setDecltype(dataObject.getString(HPartialstoreDo.COLUMNS.DECLTYPE.name())); 
			hPartialstoreDo.setDeclno(dataObject.getString(HPartialstoreDo.COLUMNS.DECLNO.name())); 
			hPartialstoreDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HPartialstoreDo.COLUMNS.ITEMNO.name()))); 
			hPartialstoreDo.setOdeclno(dataObject.getString(HPartialstoreDo.COLUMNS.ODECLNO.name())); 
			hPartialstoreDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(HPartialstoreDo.COLUMNS.OITEMNO.name()))); 
			hPartialstoreDo.setRealstatus(dataObject.getString(HPartialstoreDo.COLUMNS.REALSTATUS.name())); 
			hPartialstoreDo.setMonthno(dataObject.getString(HPartialstoreDo.COLUMNS.MONTHNO.name())); 
			hPartialstoreDo.setUserid(dataObject.getString(HPartialstoreDo.COLUMNS.USERID.name())); 
			hPartialstoreDo.setUpdtime(dataObject.getString(HPartialstoreDo.COLUMNS.UPDTIME.name())); 
			hPartialstoreDo.setConfirmdate(dataObject.getString(HPartialstoreDo.COLUMNS.CONFIRMDATE.name())); 
			return hPartialstoreDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HPartialstoreDo hPartialstoreDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.MSGFUN.name(), hPartialstoreDo.getMsgfun()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.BONDNO.name(), hPartialstoreDo.getBondno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.REFBILLNO.name(), hPartialstoreDo.getRefbillno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.CTMCODE.name(), hPartialstoreDo.getCtmcode()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.REFERCODE.name(), hPartialstoreDo.getRefercode()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.ITEM.name(), hPartialstoreDo.getItem()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.PRDTNO.name(), hPartialstoreDo.getPrdtno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.STRTYPE.name(), hPartialstoreDo.getStrtype()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.GDSTYPE.name(), hPartialstoreDo.getGdstype()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.RSTRQTY.name(), hPartialstoreDo.getRstrqty()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.STRUNIT.name(), hPartialstoreDo.getStrunit()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.STRPOST.name(), hPartialstoreDo.getStrpost()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.STRDATE.name(), hPartialstoreDo.getStrdate()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.BATCHNO.name(), hPartialstoreDo.getBatchno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.STOCKNO.name(), hPartialstoreDo.getStockno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.OUTSTRNO.name(), hPartialstoreDo.getOutstrno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.DECLTYPE.name(), hPartialstoreDo.getDecltype()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.DECLNO.name(), hPartialstoreDo.getDeclno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.ITEMNO.name(), hPartialstoreDo.getItemno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.ODECLNO.name(), hPartialstoreDo.getOdeclno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.OITEMNO.name(), hPartialstoreDo.getOitemno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.REALSTATUS.name(), hPartialstoreDo.getRealstatus()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.MONTHNO.name(), hPartialstoreDo.getMonthno()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.USERID.name(), hPartialstoreDo.getUserid()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.UPDTIME.name(), hPartialstoreDo.getUpdtime()); 
			dataObject.setValue(HPartialstoreDo.COLUMNS.CONFIRMDATE.name(), hPartialstoreDo.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HPartialstoreDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HPartialstoreDo po) { 
		sqlWhere.add(HPartialstoreDo.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.REFERCODE.name(), po.getRefercode()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.GDSTYPE.name(), po.getGdstype()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.RSTRQTY.name(), po.getRstrqty()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.STRUNIT.name(), po.getStrunit()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.REALSTATUS.name(), po.getRealstatus()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(HPartialstoreDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
	} 
 
} 
