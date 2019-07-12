package com.doc.common.dao.impl; 
 
public class HOutdetailDAO extends GeneralDAOImpl<HOutdetailDo> implements HOutdetailDAO { 
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
		sqlWhere.add(HOutdetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.ROUTQTY.name(), po.getRoutqty()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTUNIT.name(), po.getOutunit()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTDATE.name(), po.getOutdate()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTRMKS.name(), po.getOutrmks()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.PONO.name(), po.getPono()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.INVNO.name(), po.getInvno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OUTRMKS2.name(), po.getOutrmks2()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.INVOICE.name(), po.getInvoice()); 
		sqlWhere.add(HOutdetailDo.COLUMNS.MOITEMNO.name(), po.getMoitemno()); 
	} 
 
} 
