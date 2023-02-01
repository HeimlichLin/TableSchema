package com.doc.common.dao.impl; 
 
public class HOutdetailDAOImpl extends GeneralDAOImpl<HOutdetailPo> implements HOutdetailDAO { 
	public static final HOutdetailDAOImpl INSTANCE = new HOutdetailDAOImpl(); 
	public static final String TABLENAME = "H_OUTDETAIL"; 

	public HOutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HOutdetailPo> CONVERTER = new MapConverter<HOutdetailPo>() { 
 
		@Override 
		public HOutdetailPo convert(final DataObject dataObject) { 
			final HOutdetailPo hOutdetailPo = new HOutdetailPo(); 
			hOutdetailPo.setBondno(dataObject.getString(HOutdetailPo.COLUMNS.BONDNO.name())); 
			hOutdetailPo.setRefbillno(dataObject.getString(HOutdetailPo.COLUMNS.REFBILLNO.name())); 
			hOutdetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.ITEM.name()))); 
			hOutdetailPo.setPrdtno(dataObject.getString(HOutdetailPo.COLUMNS.PRDTNO.name())); 
			hOutdetailPo.setRoutqty(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.ROUTQTY.name()))); 
			hOutdetailPo.setOutunit(dataObject.getString(HOutdetailPo.COLUMNS.OUTUNIT.name())); 
			hOutdetailPo.setOutpost(dataObject.getString(HOutdetailPo.COLUMNS.OUTPOST.name())); 
			hOutdetailPo.setOutdate(dataObject.getString(HOutdetailPo.COLUMNS.OUTDATE.name())); 
			hOutdetailPo.setBatchno(dataObject.getString(HOutdetailPo.COLUMNS.BATCHNO.name())); 
			hOutdetailPo.setStockno(dataObject.getString(HOutdetailPo.COLUMNS.STOCKNO.name())); 
			hOutdetailPo.setDecltype(dataObject.getString(HOutdetailPo.COLUMNS.DECLTYPE.name())); 
			hOutdetailPo.setDeclno(dataObject.getString(HOutdetailPo.COLUMNS.DECLNO.name())); 
			hOutdetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.ITEMNO.name()))); 
			hOutdetailPo.setOdeclno(dataObject.getString(HOutdetailPo.COLUMNS.ODECLNO.name())); 
			hOutdetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.OITEMNO.name()))); 
			hOutdetailPo.setOutstatus(dataObject.getString(HOutdetailPo.COLUMNS.OUTSTATUS.name())); 
			hOutdetailPo.setOutrmks(dataObject.getString(HOutdetailPo.COLUMNS.OUTRMKS.name())); 
			hOutdetailPo.setConfirmdate(dataObject.getString(HOutdetailPo.COLUMNS.CONFIRMDATE.name())); 
			hOutdetailPo.setDescrip(dataObject.getString(HOutdetailPo.COLUMNS.DESCRIP.name())); 
			hOutdetailPo.setMonthno(dataObject.getString(HOutdetailPo.COLUMNS.MONTHNO.name())); 
			hOutdetailPo.setUserid(dataObject.getString(HOutdetailPo.COLUMNS.USERID.name())); 
			hOutdetailPo.setTradeprdtno(dataObject.getString(HOutdetailPo.COLUMNS.TRADEPRDTNO.name())); 
			hOutdetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.NWGHT.name()))); 
			hOutdetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.GROSS.name()))); 
			hOutdetailPo.setOutstrno(dataObject.getString(HOutdetailPo.COLUMNS.OUTSTRNO.name())); 
			hOutdetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.UNITPRICE.name()))); 
			hOutdetailPo.setCcccode(dataObject.getString(HOutdetailPo.COLUMNS.CCCCODE.name())); 
			hOutdetailPo.setRlstime(dataObject.getString(HOutdetailPo.COLUMNS.RLSTIME.name())); 
			hOutdetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.DUTYRATE.name()))); 
			hOutdetailPo.setPono(dataObject.getString(HOutdetailPo.COLUMNS.PONO.name())); 
			hOutdetailPo.setInvno(dataObject.getString(HOutdetailPo.COLUMNS.INVNO.name())); 
			hOutdetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.COUNTNO.name()))); 
			hOutdetailPo.setUpdtime(dataObject.getString(HOutdetailPo.COLUMNS.UPDTIME.name())); 
			hOutdetailPo.setOutrmks2(dataObject.getString(HOutdetailPo.COLUMNS.OUTRMKS2.name())); 
			hOutdetailPo.setOrefbillno(dataObject.getString(HOutdetailPo.COLUMNS.OREFBILLNO.name())); 
			hOutdetailPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.OITEM.name()))); 
			hOutdetailPo.setDecldate(dataObject.getString(HOutdetailPo.COLUMNS.DECLDATE.name())); 
			hOutdetailPo.setInvoice(dataObject.getString(HOutdetailPo.COLUMNS.INVOICE.name())); 
			hOutdetailPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(HOutdetailPo.COLUMNS.MOITEMNO.name()))); 
			hOutdetailPo.setMawb(dataObject.getString(HOutdetailPo.COLUMNS.MAWB.name())); 
			hOutdetailPo.setVesselno(dataObject.getString(HOutdetailPo.COLUMNS.VESSELNO.name())); 
			hOutdetailPo.setDutytype(dataObject.getString(HOutdetailPo.COLUMNS.DUTYTYPE.name())); 
			hOutdetailPo.setOptype(dataObject.getString(HOutdetailPo.COLUMNS.OPTYPE.name())); 
			hOutdetailPo.setStatmode(dataObject.getString(HOutdetailPo.COLUMNS.STATMODE.name())); 
			return hOutdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HOutdetailPo hOutdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HOutdetailPo.COLUMNS.BONDNO.name(), hOutdetailPo.getBondno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.REFBILLNO.name(), hOutdetailPo.getRefbillno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.ITEM.name(), hOutdetailPo.getItem()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.PRDTNO.name(), hOutdetailPo.getPrdtno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.ROUTQTY.name(), hOutdetailPo.getRoutqty()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTUNIT.name(), hOutdetailPo.getOutunit()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTPOST.name(), hOutdetailPo.getOutpost()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTDATE.name(), hOutdetailPo.getOutdate()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.BATCHNO.name(), hOutdetailPo.getBatchno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.STOCKNO.name(), hOutdetailPo.getStockno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DECLTYPE.name(), hOutdetailPo.getDecltype()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DECLNO.name(), hOutdetailPo.getDeclno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.ITEMNO.name(), hOutdetailPo.getItemno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.ODECLNO.name(), hOutdetailPo.getOdeclno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OITEMNO.name(), hOutdetailPo.getOitemno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTSTATUS.name(), hOutdetailPo.getOutstatus()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTRMKS.name(), hOutdetailPo.getOutrmks()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.CONFIRMDATE.name(), hOutdetailPo.getConfirmdate()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DESCRIP.name(), hOutdetailPo.getDescrip()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.MONTHNO.name(), hOutdetailPo.getMonthno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.USERID.name(), hOutdetailPo.getUserid()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.TRADEPRDTNO.name(), hOutdetailPo.getTradeprdtno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.NWGHT.name(), hOutdetailPo.getNwght()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.GROSS.name(), hOutdetailPo.getGross()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTSTRNO.name(), hOutdetailPo.getOutstrno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.UNITPRICE.name(), hOutdetailPo.getUnitprice()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.CCCCODE.name(), hOutdetailPo.getCcccode()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.RLSTIME.name(), hOutdetailPo.getRlstime()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DUTYRATE.name(), hOutdetailPo.getDutyrate()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.PONO.name(), hOutdetailPo.getPono()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.INVNO.name(), hOutdetailPo.getInvno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.COUNTNO.name(), hOutdetailPo.getCountno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.UPDTIME.name(), hOutdetailPo.getUpdtime()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OUTRMKS2.name(), hOutdetailPo.getOutrmks2()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OREFBILLNO.name(), hOutdetailPo.getOrefbillno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OITEM.name(), hOutdetailPo.getOitem()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DECLDATE.name(), hOutdetailPo.getDecldate()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.INVOICE.name(), hOutdetailPo.getInvoice()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.MOITEMNO.name(), hOutdetailPo.getMoitemno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.MAWB.name(), hOutdetailPo.getMawb()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.VESSELNO.name(), hOutdetailPo.getVesselno()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.DUTYTYPE.name(), hOutdetailPo.getDutytype()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.OPTYPE.name(), hOutdetailPo.getOptype()); 
			dataObject.setValue(HOutdetailPo.COLUMNS.STATMODE.name(), hOutdetailPo.getStatmode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HOutdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HOutdetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HOutdetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HOutdetailPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HOutdetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HOutdetailPo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
		return sqlWhere; 
	} 
 
} 
