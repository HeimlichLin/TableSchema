package com.doc.common.dao.impl; 
 
public class OutdetailDAO extends GeneralDAOImpl<OutdetailDo> implements OutdetailDAO { 
	public static final OutdetailDAOImpl INSTANCE = new OutdetailDAOImpl(); 
	public static final String TABLENAME = "OUTDETAIL"; 

	public OutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<OutdetailDo> CONVERTER = new MapConverter<OutdetailDo>() { 
 
		@Override 
		public OutdetailDo convert(final DataObject dataObject) { 
			final OutdetailDo outdetailDo = new OutdetailDo(); 
			outdetailDo.setBondno(dataObject.getString(OutdetailDo.COLUMNS.BONDNO.name())); 
			outdetailDo.setRefbillno(dataObject.getString(OutdetailDo.COLUMNS.REFBILLNO.name())); 
			outdetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.ITEM.name()))); 
			outdetailDo.setPrdtno(dataObject.getString(OutdetailDo.COLUMNS.PRDTNO.name())); 
			outdetailDo.setRoutqty(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.ROUTQTY.name()))); 
			outdetailDo.setOutunit(dataObject.getString(OutdetailDo.COLUMNS.OUTUNIT.name())); 
			outdetailDo.setOutpost(dataObject.getString(OutdetailDo.COLUMNS.OUTPOST.name())); 
			outdetailDo.setOutdate(dataObject.getString(OutdetailDo.COLUMNS.OUTDATE.name())); 
			outdetailDo.setBatchno(dataObject.getString(OutdetailDo.COLUMNS.BATCHNO.name())); 
			outdetailDo.setStockno(dataObject.getString(OutdetailDo.COLUMNS.STOCKNO.name())); 
			outdetailDo.setDecltype(dataObject.getString(OutdetailDo.COLUMNS.DECLTYPE.name())); 
			outdetailDo.setDeclno(dataObject.getString(OutdetailDo.COLUMNS.DECLNO.name())); 
			outdetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.ITEMNO.name()))); 
			outdetailDo.setOdeclno(dataObject.getString(OutdetailDo.COLUMNS.ODECLNO.name())); 
			outdetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.OITEMNO.name()))); 
			outdetailDo.setOutstatus(dataObject.getString(OutdetailDo.COLUMNS.OUTSTATUS.name())); 
			outdetailDo.setOutrmks(dataObject.getString(OutdetailDo.COLUMNS.OUTRMKS.name())); 
			outdetailDo.setConfirmdate(dataObject.getString(OutdetailDo.COLUMNS.CONFIRMDATE.name())); 
			outdetailDo.setDescrip(dataObject.getString(OutdetailDo.COLUMNS.DESCRIP.name())); 
			outdetailDo.setMonthno(dataObject.getString(OutdetailDo.COLUMNS.MONTHNO.name())); 
			outdetailDo.setUserid(dataObject.getString(OutdetailDo.COLUMNS.USERID.name())); 
			outdetailDo.setTradeprdtno(dataObject.getString(OutdetailDo.COLUMNS.TRADEPRDTNO.name())); 
			outdetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.NWGHT.name()))); 
			outdetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.GROSS.name()))); 
			outdetailDo.setOutstrno(dataObject.getString(OutdetailDo.COLUMNS.OUTSTRNO.name())); 
			outdetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.UNITPRICE.name()))); 
			outdetailDo.setCcccode(dataObject.getString(OutdetailDo.COLUMNS.CCCCODE.name())); 
			outdetailDo.setRlstime(dataObject.getString(OutdetailDo.COLUMNS.RLSTIME.name())); 
			outdetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.DUTYRATE.name()))); 
			outdetailDo.setPono(dataObject.getString(OutdetailDo.COLUMNS.PONO.name())); 
			outdetailDo.setInvno(dataObject.getString(OutdetailDo.COLUMNS.INVNO.name())); 
			outdetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.COUNTNO.name()))); 
			outdetailDo.setMawb(dataObject.getString(OutdetailDo.COLUMNS.MAWB.name())); 
			outdetailDo.setVesselno(dataObject.getString(OutdetailDo.COLUMNS.VESSELNO.name())); 
			outdetailDo.setDutytype(dataObject.getString(OutdetailDo.COLUMNS.DUTYTYPE.name())); 
			outdetailDo.setOptype(dataObject.getString(OutdetailDo.COLUMNS.OPTYPE.name())); 
			outdetailDo.setStatmode(dataObject.getString(OutdetailDo.COLUMNS.STATMODE.name())); 
			outdetailDo.setOutrmks2(dataObject.getString(OutdetailDo.COLUMNS.OUTRMKS2.name())); 
			outdetailDo.setOrefbillno(dataObject.getString(OutdetailDo.COLUMNS.OREFBILLNO.name())); 
			outdetailDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.OITEM.name()))); 
			outdetailDo.setDecldate(dataObject.getString(OutdetailDo.COLUMNS.DECLDATE.name())); 
			outdetailDo.setInvoice(dataObject.getString(OutdetailDo.COLUMNS.INVOICE.name())); 
			outdetailDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(OutdetailDo.COLUMNS.MOITEMNO.name()))); 
			return outdetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdetailDo outdetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdetailDo.COLUMNS.BONDNO.name(), outdetailDo.getBondno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.REFBILLNO.name(), outdetailDo.getRefbillno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.ITEM.name(), outdetailDo.getItem()); 
			dataObject.setValue(OutdetailDo.COLUMNS.PRDTNO.name(), outdetailDo.getPrdtno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.ROUTQTY.name(), outdetailDo.getRoutqty()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTUNIT.name(), outdetailDo.getOutunit()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTPOST.name(), outdetailDo.getOutpost()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTDATE.name(), outdetailDo.getOutdate()); 
			dataObject.setValue(OutdetailDo.COLUMNS.BATCHNO.name(), outdetailDo.getBatchno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.STOCKNO.name(), outdetailDo.getStockno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DECLTYPE.name(), outdetailDo.getDecltype()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DECLNO.name(), outdetailDo.getDeclno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.ITEMNO.name(), outdetailDo.getItemno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.ODECLNO.name(), outdetailDo.getOdeclno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OITEMNO.name(), outdetailDo.getOitemno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTSTATUS.name(), outdetailDo.getOutstatus()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTRMKS.name(), outdetailDo.getOutrmks()); 
			dataObject.setValue(OutdetailDo.COLUMNS.CONFIRMDATE.name(), outdetailDo.getConfirmdate()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DESCRIP.name(), outdetailDo.getDescrip()); 
			dataObject.setValue(OutdetailDo.COLUMNS.MONTHNO.name(), outdetailDo.getMonthno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.USERID.name(), outdetailDo.getUserid()); 
			dataObject.setValue(OutdetailDo.COLUMNS.TRADEPRDTNO.name(), outdetailDo.getTradeprdtno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.NWGHT.name(), outdetailDo.getNwght()); 
			dataObject.setValue(OutdetailDo.COLUMNS.GROSS.name(), outdetailDo.getGross()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTSTRNO.name(), outdetailDo.getOutstrno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.UNITPRICE.name(), outdetailDo.getUnitprice()); 
			dataObject.setValue(OutdetailDo.COLUMNS.CCCCODE.name(), outdetailDo.getCcccode()); 
			dataObject.setValue(OutdetailDo.COLUMNS.RLSTIME.name(), outdetailDo.getRlstime()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DUTYRATE.name(), outdetailDo.getDutyrate()); 
			dataObject.setValue(OutdetailDo.COLUMNS.PONO.name(), outdetailDo.getPono()); 
			dataObject.setValue(OutdetailDo.COLUMNS.INVNO.name(), outdetailDo.getInvno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.COUNTNO.name(), outdetailDo.getCountno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.MAWB.name(), outdetailDo.getMawb()); 
			dataObject.setValue(OutdetailDo.COLUMNS.VESSELNO.name(), outdetailDo.getVesselno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DUTYTYPE.name(), outdetailDo.getDutytype()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OPTYPE.name(), outdetailDo.getOptype()); 
			dataObject.setValue(OutdetailDo.COLUMNS.STATMODE.name(), outdetailDo.getStatmode()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OUTRMKS2.name(), outdetailDo.getOutrmks2()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OREFBILLNO.name(), outdetailDo.getOrefbillno()); 
			dataObject.setValue(OutdetailDo.COLUMNS.OITEM.name(), outdetailDo.getOitem()); 
			dataObject.setValue(OutdetailDo.COLUMNS.DECLDATE.name(), outdetailDo.getDecldate()); 
			dataObject.setValue(OutdetailDo.COLUMNS.INVOICE.name(), outdetailDo.getInvoice()); 
			dataObject.setValue(OutdetailDo.COLUMNS.MOITEMNO.name(), outdetailDo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdetailDo po) { 
		sqlWhere.add(OutdetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.ROUTQTY.name(), po.getRoutqty()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTUNIT.name(), po.getOutunit()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTDATE.name(), po.getOutdate()); 
		sqlWhere.add(OutdetailDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTRMKS.name(), po.getOutrmks()); 
		sqlWhere.add(OutdetailDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(OutdetailDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(OutdetailDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(OutdetailDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(OutdetailDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(OutdetailDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(OutdetailDo.COLUMNS.PONO.name(), po.getPono()); 
		sqlWhere.add(OutdetailDo.COLUMNS.INVNO.name(), po.getInvno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.MAWB.name(), po.getMawb()); 
		sqlWhere.add(OutdetailDo.COLUMNS.VESSELNO.name(), po.getVesselno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(OutdetailDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OUTRMKS2.name(), po.getOutrmks2()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(OutdetailDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(OutdetailDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(OutdetailDo.COLUMNS.INVOICE.name(), po.getInvoice()); 
		sqlWhere.add(OutdetailDo.COLUMNS.MOITEMNO.name(), po.getMoitemno()); 
	} 
 
} 
