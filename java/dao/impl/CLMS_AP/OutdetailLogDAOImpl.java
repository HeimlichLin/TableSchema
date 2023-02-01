package com.doc.common.dao.impl; 
 
public class OutdetailLogDAOImpl extends GeneralDAOImpl<OutdetailLogPo> implements OutdetailLogDAO { 
	public static final OutdetailLogDAOImpl INSTANCE = new OutdetailLogDAOImpl(); 
	public static final String TABLENAME = "OUTDETAIL_LOG"; 

	public OutdetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutdetailLogPo> CONVERTER = new MapConverter<OutdetailLogPo>() { 
 
		@Override 
		public OutdetailLogPo convert(final DataObject dataObject) { 
			final OutdetailLogPo outdetailLogPo = new OutdetailLogPo(); 
			outdetailLogPo.setBondno(dataObject.getString(OutdetailLogPo.COLUMNS.BONDNO.name())); 
			outdetailLogPo.setRefbillno(dataObject.getString(OutdetailLogPo.COLUMNS.REFBILLNO.name())); 
			outdetailLogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.ITEM.name()))); 
			outdetailLogPo.setPrdtno(dataObject.getString(OutdetailLogPo.COLUMNS.PRDTNO.name())); 
			outdetailLogPo.setRoutqty(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.ROUTQTY.name()))); 
			outdetailLogPo.setOutunit(dataObject.getString(OutdetailLogPo.COLUMNS.OUTUNIT.name())); 
			outdetailLogPo.setOutpost(dataObject.getString(OutdetailLogPo.COLUMNS.OUTPOST.name())); 
			outdetailLogPo.setOutdate(dataObject.getString(OutdetailLogPo.COLUMNS.OUTDATE.name())); 
			outdetailLogPo.setBatchno(dataObject.getString(OutdetailLogPo.COLUMNS.BATCHNO.name())); 
			outdetailLogPo.setStockno(dataObject.getString(OutdetailLogPo.COLUMNS.STOCKNO.name())); 
			outdetailLogPo.setDecltype(dataObject.getString(OutdetailLogPo.COLUMNS.DECLTYPE.name())); 
			outdetailLogPo.setDeclno(dataObject.getString(OutdetailLogPo.COLUMNS.DECLNO.name())); 
			outdetailLogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.ITEMNO.name()))); 
			outdetailLogPo.setOdeclno(dataObject.getString(OutdetailLogPo.COLUMNS.ODECLNO.name())); 
			outdetailLogPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.OITEMNO.name()))); 
			outdetailLogPo.setOutstatus(dataObject.getString(OutdetailLogPo.COLUMNS.OUTSTATUS.name())); 
			outdetailLogPo.setOutrmks(dataObject.getString(OutdetailLogPo.COLUMNS.OUTRMKS.name())); 
			outdetailLogPo.setConfirmdate(dataObject.getString(OutdetailLogPo.COLUMNS.CONFIRMDATE.name())); 
			outdetailLogPo.setDescrip(dataObject.getString(OutdetailLogPo.COLUMNS.DESCRIP.name())); 
			outdetailLogPo.setMonthno(dataObject.getString(OutdetailLogPo.COLUMNS.MONTHNO.name())); 
			outdetailLogPo.setUserid(dataObject.getString(OutdetailLogPo.COLUMNS.USERID.name())); 
			outdetailLogPo.setTradeprdtno(dataObject.getString(OutdetailLogPo.COLUMNS.TRADEPRDTNO.name())); 
			outdetailLogPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.NWGHT.name()))); 
			outdetailLogPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.GROSS.name()))); 
			outdetailLogPo.setOutstrno(dataObject.getString(OutdetailLogPo.COLUMNS.OUTSTRNO.name())); 
			outdetailLogPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.UNITPRICE.name()))); 
			outdetailLogPo.setCcccode(dataObject.getString(OutdetailLogPo.COLUMNS.CCCCODE.name())); 
			outdetailLogPo.setRlstime(dataObject.getString(OutdetailLogPo.COLUMNS.RLSTIME.name())); 
			outdetailLogPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.DUTYRATE.name()))); 
			outdetailLogPo.setPono(dataObject.getString(OutdetailLogPo.COLUMNS.PONO.name())); 
			outdetailLogPo.setInvno(dataObject.getString(OutdetailLogPo.COLUMNS.INVNO.name())); 
			outdetailLogPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.COUNTNO.name()))); 
			outdetailLogPo.setMawb(dataObject.getString(OutdetailLogPo.COLUMNS.MAWB.name())); 
			outdetailLogPo.setVesselno(dataObject.getString(OutdetailLogPo.COLUMNS.VESSELNO.name())); 
			outdetailLogPo.setDutytype(dataObject.getString(OutdetailLogPo.COLUMNS.DUTYTYPE.name())); 
			outdetailLogPo.setOptype(dataObject.getString(OutdetailLogPo.COLUMNS.OPTYPE.name())); 
			outdetailLogPo.setStatmode(dataObject.getString(OutdetailLogPo.COLUMNS.STATMODE.name())); 
			outdetailLogPo.setOutrmks2(dataObject.getString(OutdetailLogPo.COLUMNS.OUTRMKS2.name())); 
			outdetailLogPo.setOrefbillno(dataObject.getString(OutdetailLogPo.COLUMNS.OREFBILLNO.name())); 
			outdetailLogPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.OITEM.name()))); 
			outdetailLogPo.setDecldate(dataObject.getString(OutdetailLogPo.COLUMNS.DECLDATE.name())); 
			outdetailLogPo.setInvoice(dataObject.getString(OutdetailLogPo.COLUMNS.INVOICE.name())); 
			outdetailLogPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailLogPo.COLUMNS.MOITEMNO.name()))); 
			outdetailLogPo.setProcesstime(dataObject.getString(OutdetailLogPo.COLUMNS.PROCESSTIME.name())); 
			outdetailLogPo.setProcessstate(dataObject.getString(OutdetailLogPo.COLUMNS.PROCESSSTATE.name())); 
			return outdetailLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdetailLogPo outdetailLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.BONDNO.name(), outdetailLogPo.getBondno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.REFBILLNO.name(), outdetailLogPo.getRefbillno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.ITEM.name(), outdetailLogPo.getItem()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.PRDTNO.name(), outdetailLogPo.getPrdtno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.ROUTQTY.name(), outdetailLogPo.getRoutqty()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTUNIT.name(), outdetailLogPo.getOutunit()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTPOST.name(), outdetailLogPo.getOutpost()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTDATE.name(), outdetailLogPo.getOutdate()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.BATCHNO.name(), outdetailLogPo.getBatchno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.STOCKNO.name(), outdetailLogPo.getStockno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DECLTYPE.name(), outdetailLogPo.getDecltype()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DECLNO.name(), outdetailLogPo.getDeclno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.ITEMNO.name(), outdetailLogPo.getItemno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.ODECLNO.name(), outdetailLogPo.getOdeclno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OITEMNO.name(), outdetailLogPo.getOitemno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTSTATUS.name(), outdetailLogPo.getOutstatus()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTRMKS.name(), outdetailLogPo.getOutrmks()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.CONFIRMDATE.name(), outdetailLogPo.getConfirmdate()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DESCRIP.name(), outdetailLogPo.getDescrip()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.MONTHNO.name(), outdetailLogPo.getMonthno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.USERID.name(), outdetailLogPo.getUserid()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.TRADEPRDTNO.name(), outdetailLogPo.getTradeprdtno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.NWGHT.name(), outdetailLogPo.getNwght()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.GROSS.name(), outdetailLogPo.getGross()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTSTRNO.name(), outdetailLogPo.getOutstrno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.UNITPRICE.name(), outdetailLogPo.getUnitprice()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.CCCCODE.name(), outdetailLogPo.getCcccode()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.RLSTIME.name(), outdetailLogPo.getRlstime()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DUTYRATE.name(), outdetailLogPo.getDutyrate()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.PONO.name(), outdetailLogPo.getPono()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.INVNO.name(), outdetailLogPo.getInvno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.COUNTNO.name(), outdetailLogPo.getCountno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.MAWB.name(), outdetailLogPo.getMawb()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.VESSELNO.name(), outdetailLogPo.getVesselno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DUTYTYPE.name(), outdetailLogPo.getDutytype()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OPTYPE.name(), outdetailLogPo.getOptype()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.STATMODE.name(), outdetailLogPo.getStatmode()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OUTRMKS2.name(), outdetailLogPo.getOutrmks2()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OREFBILLNO.name(), outdetailLogPo.getOrefbillno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.OITEM.name(), outdetailLogPo.getOitem()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.DECLDATE.name(), outdetailLogPo.getDecldate()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.INVOICE.name(), outdetailLogPo.getInvoice()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.MOITEMNO.name(), outdetailLogPo.getMoitemno()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.PROCESSTIME.name(), outdetailLogPo.getProcesstime()); 
			dataObject.setValue(OutdetailLogPo.COLUMNS.PROCESSSTATE.name(), outdetailLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdetailLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdetailLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
