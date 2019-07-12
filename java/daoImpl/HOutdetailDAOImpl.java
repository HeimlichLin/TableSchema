package com.doc.common.dao.impl; 
 
public class HOutdetailDAOImpl extends GeneralDAOImpl<HOutdetailDo> implements HOutdetailDAOImpl { 
	public static final HOutdetailDAOImpl INSTANCE = new HOutdetailDAOImpl(); 
	public static final String TABLENAME = "H_OUTDETAIL"; 

	public HOutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HOutdetailDo> CONVERTER = new MapConverter<HOutdetailDo>() { 
 
		@Override 
		public HOutdetailDo convert(final DataObject dataObject) { 
			final HOutdetailDo hOutdetailDo = new HOutdetailDo(); 
			hOutdetailDo.setBondno(dataObject.getString(HOutdetailDo.COLUMNS.BONDNO.name())); 
			hOutdetailDo.setRefbillno(dataObject.getString(HOutdetailDo.COLUMNS.REFBILLNO.name())); 
			hOutdetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.ITEM.name()))); 
			hOutdetailDo.setPrdtno(dataObject.getString(HOutdetailDo.COLUMNS.PRDTNO.name())); 
			hOutdetailDo.setRoutqty(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.ROUTQTY.name()))); 
			hOutdetailDo.setOutunit(dataObject.getString(HOutdetailDo.COLUMNS.OUTUNIT.name())); 
			hOutdetailDo.setOutpost(dataObject.getString(HOutdetailDo.COLUMNS.OUTPOST.name())); 
			hOutdetailDo.setOutdate(dataObject.getString(HOutdetailDo.COLUMNS.OUTDATE.name())); 
			hOutdetailDo.setBatchno(dataObject.getString(HOutdetailDo.COLUMNS.BATCHNO.name())); 
			hOutdetailDo.setStockno(dataObject.getString(HOutdetailDo.COLUMNS.STOCKNO.name())); 
			hOutdetailDo.setDecltype(dataObject.getString(HOutdetailDo.COLUMNS.DECLTYPE.name())); 
			hOutdetailDo.setDeclno(dataObject.getString(HOutdetailDo.COLUMNS.DECLNO.name())); 
			hOutdetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.ITEMNO.name()))); 
			hOutdetailDo.setOdeclno(dataObject.getString(HOutdetailDo.COLUMNS.ODECLNO.name())); 
			hOutdetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.OITEMNO.name()))); 
			hOutdetailDo.setOutstatus(dataObject.getString(HOutdetailDo.COLUMNS.OUTSTATUS.name())); 
			hOutdetailDo.setOutrmks(dataObject.getString(HOutdetailDo.COLUMNS.OUTRMKS.name())); 
			hOutdetailDo.setConfirmdate(dataObject.getString(HOutdetailDo.COLUMNS.CONFIRMDATE.name())); 
			hOutdetailDo.setDescrip(dataObject.getString(HOutdetailDo.COLUMNS.DESCRIP.name())); 
			hOutdetailDo.setMonthno(dataObject.getString(HOutdetailDo.COLUMNS.MONTHNO.name())); 
			hOutdetailDo.setUserid(dataObject.getString(HOutdetailDo.COLUMNS.USERID.name())); 
			hOutdetailDo.setTradeprdtno(dataObject.getString(HOutdetailDo.COLUMNS.TRADEPRDTNO.name())); 
			hOutdetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.NWGHT.name()))); 
			hOutdetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.GROSS.name()))); 
			hOutdetailDo.setOutstrno(dataObject.getString(HOutdetailDo.COLUMNS.OUTSTRNO.name())); 
			hOutdetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.UNITPRICE.name()))); 
			hOutdetailDo.setCcccode(dataObject.getString(HOutdetailDo.COLUMNS.CCCCODE.name())); 
			hOutdetailDo.setRlstime(dataObject.getString(HOutdetailDo.COLUMNS.RLSTIME.name())); 
			hOutdetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.DUTYRATE.name()))); 
			hOutdetailDo.setPono(dataObject.getString(HOutdetailDo.COLUMNS.PONO.name())); 
			hOutdetailDo.setInvno(dataObject.getString(HOutdetailDo.COLUMNS.INVNO.name())); 
			hOutdetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.COUNTNO.name()))); 
			hOutdetailDo.setUpdtime(dataObject.getString(HOutdetailDo.COLUMNS.UPDTIME.name())); 
			hOutdetailDo.setOutrmks2(dataObject.getString(HOutdetailDo.COLUMNS.OUTRMKS2.name())); 
			hOutdetailDo.setOrefbillno(dataObject.getString(HOutdetailDo.COLUMNS.OREFBILLNO.name())); 
			hOutdetailDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.OITEM.name()))); 
			hOutdetailDo.setDecldate(dataObject.getString(HOutdetailDo.COLUMNS.DECLDATE.name())); 
			hOutdetailDo.setInvoice(dataObject.getString(HOutdetailDo.COLUMNS.INVOICE.name())); 
			hOutdetailDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(HOutdetailDo.COLUMNS.MOITEMNO.name()))); 
			return hOutdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HOutdetailDo hOutdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HOutdetailDo.COLUMNS.BONDNO.name(), hOutdetailDo.getBondno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.REFBILLNO.name(), hOutdetailDo.getRefbillno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.ITEM.name(), hOutdetailDo.getItem()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.PRDTNO.name(), hOutdetailDo.getPrdtno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.ROUTQTY.name(), hOutdetailDo.getRoutqty()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTUNIT.name(), hOutdetailDo.getOutunit()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTPOST.name(), hOutdetailDo.getOutpost()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTDATE.name(), hOutdetailDo.getOutdate()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.BATCHNO.name(), hOutdetailDo.getBatchno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.STOCKNO.name(), hOutdetailDo.getStockno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.DECLTYPE.name(), hOutdetailDo.getDecltype()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.DECLNO.name(), hOutdetailDo.getDeclno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.ITEMNO.name(), hOutdetailDo.getItemno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.ODECLNO.name(), hOutdetailDo.getOdeclno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OITEMNO.name(), hOutdetailDo.getOitemno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTSTATUS.name(), hOutdetailDo.getOutstatus()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTRMKS.name(), hOutdetailDo.getOutrmks()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.CONFIRMDATE.name(), hOutdetailDo.getConfirmdate()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.DESCRIP.name(), hOutdetailDo.getDescrip()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.MONTHNO.name(), hOutdetailDo.getMonthno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.USERID.name(), hOutdetailDo.getUserid()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.TRADEPRDTNO.name(), hOutdetailDo.getTradeprdtno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.NWGHT.name(), hOutdetailDo.getNwght()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.GROSS.name(), hOutdetailDo.getGross()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTSTRNO.name(), hOutdetailDo.getOutstrno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.UNITPRICE.name(), hOutdetailDo.getUnitprice()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.CCCCODE.name(), hOutdetailDo.getCcccode()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.RLSTIME.name(), hOutdetailDo.getRlstime()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.DUTYRATE.name(), hOutdetailDo.getDutyrate()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.PONO.name(), hOutdetailDo.getPono()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.INVNO.name(), hOutdetailDo.getInvno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.COUNTNO.name(), hOutdetailDo.getCountno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.UPDTIME.name(), hOutdetailDo.getUpdtime()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OUTRMKS2.name(), hOutdetailDo.getOutrmks2()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OREFBILLNO.name(), hOutdetailDo.getOrefbillno()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.OITEM.name(), hOutdetailDo.getOitem()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.DECLDATE.name(), hOutdetailDo.getDecldate()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.INVOICE.name(), hOutdetailDo.getInvoice()); 
			dataObject.setValue(HOutdetailDo.COLUMNS.MOITEMNO.name(), hOutdetailDo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HOutdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HOutdetailDo po) { 
		sqlWhere.add(HOutdetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
	} 
 
} 
