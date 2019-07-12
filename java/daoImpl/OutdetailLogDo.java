package com.doc.common.dao.impl; 
 
public class OutdetailLogDAO extends GeneralDAOImpl<OutdetailLogDo> implements OutdetailLogDAO { 
	public static final OutdetailLogDAOImpl INSTANCE = new OutdetailLogDAOImpl(); 
	public static final String TABLENAME = "OUTDETAIL_LOG"; 

	public OutdetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutdetailLogDo> CONVERTER = new MapConverter<OutdetailLogDo>() { 
 
		@Override 
		public OutdetailLogDo convert(final DataObject dataObject) { 
			final OutdetailLogDo outdetailLogDo = new OutdetailLogDo(); 
			outdetailLogDo.setBondno(dataObject.getString(OutdetailLogDo.COLUMNS.BONDNO.name())); 
			outdetailLogDo.setRefbillno(dataObject.getString(OutdetailLogDo.COLUMNS.REFBILLNO.name())); 
			outdetailLogDo.setItem(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.ITEM.name()))); 
			outdetailLogDo.setPrdtno(dataObject.getString(OutdetailLogDo.COLUMNS.PRDTNO.name())); 
			outdetailLogDo.setRoutqty(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.ROUTQTY.name()))); 
			outdetailLogDo.setOutunit(dataObject.getString(OutdetailLogDo.COLUMNS.OUTUNIT.name())); 
			outdetailLogDo.setOutpost(dataObject.getString(OutdetailLogDo.COLUMNS.OUTPOST.name())); 
			outdetailLogDo.setOutdate(dataObject.getString(OutdetailLogDo.COLUMNS.OUTDATE.name())); 
			outdetailLogDo.setBatchno(dataObject.getString(OutdetailLogDo.COLUMNS.BATCHNO.name())); 
			outdetailLogDo.setStockno(dataObject.getString(OutdetailLogDo.COLUMNS.STOCKNO.name())); 
			outdetailLogDo.setDecltype(dataObject.getString(OutdetailLogDo.COLUMNS.DECLTYPE.name())); 
			outdetailLogDo.setDeclno(dataObject.getString(OutdetailLogDo.COLUMNS.DECLNO.name())); 
			outdetailLogDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.ITEMNO.name()))); 
			outdetailLogDo.setOdeclno(dataObject.getString(OutdetailLogDo.COLUMNS.ODECLNO.name())); 
			outdetailLogDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.OITEMNO.name()))); 
			outdetailLogDo.setOutstatus(dataObject.getString(OutdetailLogDo.COLUMNS.OUTSTATUS.name())); 
			outdetailLogDo.setOutrmks(dataObject.getString(OutdetailLogDo.COLUMNS.OUTRMKS.name())); 
			outdetailLogDo.setConfirmdate(dataObject.getString(OutdetailLogDo.COLUMNS.CONFIRMDATE.name())); 
			outdetailLogDo.setDescrip(dataObject.getString(OutdetailLogDo.COLUMNS.DESCRIP.name())); 
			outdetailLogDo.setMonthno(dataObject.getString(OutdetailLogDo.COLUMNS.MONTHNO.name())); 
			outdetailLogDo.setUserid(dataObject.getString(OutdetailLogDo.COLUMNS.USERID.name())); 
			outdetailLogDo.setTradeprdtno(dataObject.getString(OutdetailLogDo.COLUMNS.TRADEPRDTNO.name())); 
			outdetailLogDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.NWGHT.name()))); 
			outdetailLogDo.setGross(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.GROSS.name()))); 
			outdetailLogDo.setOutstrno(dataObject.getString(OutdetailLogDo.COLUMNS.OUTSTRNO.name())); 
			outdetailLogDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.UNITPRICE.name()))); 
			outdetailLogDo.setCcccode(dataObject.getString(OutdetailLogDo.COLUMNS.CCCCODE.name())); 
			outdetailLogDo.setRlstime(dataObject.getString(OutdetailLogDo.COLUMNS.RLSTIME.name())); 
			outdetailLogDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.DUTYRATE.name()))); 
			outdetailLogDo.setPono(dataObject.getString(OutdetailLogDo.COLUMNS.PONO.name())); 
			outdetailLogDo.setInvno(dataObject.getString(OutdetailLogDo.COLUMNS.INVNO.name())); 
			outdetailLogDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.COUNTNO.name()))); 
			outdetailLogDo.setMawb(dataObject.getString(OutdetailLogDo.COLUMNS.MAWB.name())); 
			outdetailLogDo.setVesselno(dataObject.getString(OutdetailLogDo.COLUMNS.VESSELNO.name())); 
			outdetailLogDo.setDutytype(dataObject.getString(OutdetailLogDo.COLUMNS.DUTYTYPE.name())); 
			outdetailLogDo.setOptype(dataObject.getString(OutdetailLogDo.COLUMNS.OPTYPE.name())); 
			outdetailLogDo.setStatmode(dataObject.getString(OutdetailLogDo.COLUMNS.STATMODE.name())); 
			outdetailLogDo.setOutrmks2(dataObject.getString(OutdetailLogDo.COLUMNS.OUTRMKS2.name())); 
			outdetailLogDo.setOrefbillno(dataObject.getString(OutdetailLogDo.COLUMNS.OREFBILLNO.name())); 
			outdetailLogDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.OITEM.name()))); 
			outdetailLogDo.setDecldate(dataObject.getString(OutdetailLogDo.COLUMNS.DECLDATE.name())); 
			outdetailLogDo.setInvoice(dataObject.getString(OutdetailLogDo.COLUMNS.INVOICE.name())); 
			outdetailLogDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailLogDo.COLUMNS.MOITEMNO.name()))); 
			outdetailLogDo.setProcesstime(dataObject.getString(OutdetailLogDo.COLUMNS.PROCESSTIME.name())); 
			outdetailLogDo.setProcessstate(dataObject.getString(OutdetailLogDo.COLUMNS.PROCESSSTATE.name())); 
			return outdetailLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdetailLogDo outdetailLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.BONDNO.name(), outdetailLogDo.getBondno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.REFBILLNO.name(), outdetailLogDo.getRefbillno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.ITEM.name(), outdetailLogDo.getItem()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.PRDTNO.name(), outdetailLogDo.getPrdtno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.ROUTQTY.name(), outdetailLogDo.getRoutqty()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTUNIT.name(), outdetailLogDo.getOutunit()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTPOST.name(), outdetailLogDo.getOutpost()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTDATE.name(), outdetailLogDo.getOutdate()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.BATCHNO.name(), outdetailLogDo.getBatchno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.STOCKNO.name(), outdetailLogDo.getStockno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DECLTYPE.name(), outdetailLogDo.getDecltype()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DECLNO.name(), outdetailLogDo.getDeclno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.ITEMNO.name(), outdetailLogDo.getItemno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.ODECLNO.name(), outdetailLogDo.getOdeclno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OITEMNO.name(), outdetailLogDo.getOitemno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTSTATUS.name(), outdetailLogDo.getOutstatus()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTRMKS.name(), outdetailLogDo.getOutrmks()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.CONFIRMDATE.name(), outdetailLogDo.getConfirmdate()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DESCRIP.name(), outdetailLogDo.getDescrip()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.MONTHNO.name(), outdetailLogDo.getMonthno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.USERID.name(), outdetailLogDo.getUserid()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.TRADEPRDTNO.name(), outdetailLogDo.getTradeprdtno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.NWGHT.name(), outdetailLogDo.getNwght()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.GROSS.name(), outdetailLogDo.getGross()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTSTRNO.name(), outdetailLogDo.getOutstrno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.UNITPRICE.name(), outdetailLogDo.getUnitprice()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.CCCCODE.name(), outdetailLogDo.getCcccode()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.RLSTIME.name(), outdetailLogDo.getRlstime()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DUTYRATE.name(), outdetailLogDo.getDutyrate()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.PONO.name(), outdetailLogDo.getPono()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.INVNO.name(), outdetailLogDo.getInvno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.COUNTNO.name(), outdetailLogDo.getCountno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.MAWB.name(), outdetailLogDo.getMawb()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.VESSELNO.name(), outdetailLogDo.getVesselno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DUTYTYPE.name(), outdetailLogDo.getDutytype()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OPTYPE.name(), outdetailLogDo.getOptype()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.STATMODE.name(), outdetailLogDo.getStatmode()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OUTRMKS2.name(), outdetailLogDo.getOutrmks2()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OREFBILLNO.name(), outdetailLogDo.getOrefbillno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.OITEM.name(), outdetailLogDo.getOitem()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.DECLDATE.name(), outdetailLogDo.getDecldate()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.INVOICE.name(), outdetailLogDo.getInvoice()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.MOITEMNO.name(), outdetailLogDo.getMoitemno()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.PROCESSTIME.name(), outdetailLogDo.getProcesstime()); 
			dataObject.setValue(OutdetailLogDo.COLUMNS.PROCESSSTATE.name(), outdetailLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdetailLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdetailLogDo po) { 
		sqlWhere.add(OutdetailLogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.ROUTQTY.name(), po.getRoutqty()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTUNIT.name(), po.getOutunit()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTDATE.name(), po.getOutdate()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTRMKS.name(), po.getOutrmks()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.PONO.name(), po.getPono()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.INVNO.name(), po.getInvno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.MAWB.name(), po.getMawb()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.VESSELNO.name(), po.getVesselno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OUTRMKS2.name(), po.getOutrmks2()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.INVOICE.name(), po.getInvoice()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.MOITEMNO.name(), po.getMoitemno()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.PROCESSTIME.name(), po.getProcesstime()); 
		sqlWhere.add(OutdetailLogDo.COLUMNS.PROCESSSTATE.name(), po.getProcessstate()); 
	} 
 
} 
