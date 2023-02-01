package com.doc.common.dao.impl; 
 
public class OutdetailDAOImpl extends GeneralDAOImpl<OutdetailPo> implements OutdetailDAO { 
	public static final OutdetailDAOImpl INSTANCE = new OutdetailDAOImpl(); 
	public static final String TABLENAME = "OUTDETAIL"; 

	public OutdetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<OutdetailPo> CONVERTER = new MapConverter<OutdetailPo>() { 
 
		@Override 
		public OutdetailPo convert(final DataObject dataObject) { 
			final OutdetailPo outdetailPo = new OutdetailPo(); 
			outdetailPo.setBondno(dataObject.getString(OutdetailPo.COLUMNS.BONDNO.name())); 
			outdetailPo.setRefbillno(dataObject.getString(OutdetailPo.COLUMNS.REFBILLNO.name())); 
			outdetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.ITEM.name()))); 
			outdetailPo.setPrdtno(dataObject.getString(OutdetailPo.COLUMNS.PRDTNO.name())); 
			outdetailPo.setRoutqty(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.ROUTQTY.name()))); 
			outdetailPo.setOutunit(dataObject.getString(OutdetailPo.COLUMNS.OUTUNIT.name())); 
			outdetailPo.setOutpost(dataObject.getString(OutdetailPo.COLUMNS.OUTPOST.name())); 
			outdetailPo.setOutdate(dataObject.getString(OutdetailPo.COLUMNS.OUTDATE.name())); 
			outdetailPo.setBatchno(dataObject.getString(OutdetailPo.COLUMNS.BATCHNO.name())); 
			outdetailPo.setStockno(dataObject.getString(OutdetailPo.COLUMNS.STOCKNO.name())); 
			outdetailPo.setDecltype(dataObject.getString(OutdetailPo.COLUMNS.DECLTYPE.name())); 
			outdetailPo.setDeclno(dataObject.getString(OutdetailPo.COLUMNS.DECLNO.name())); 
			outdetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.ITEMNO.name()))); 
			outdetailPo.setOdeclno(dataObject.getString(OutdetailPo.COLUMNS.ODECLNO.name())); 
			outdetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.OITEMNO.name()))); 
			outdetailPo.setOutstatus(dataObject.getString(OutdetailPo.COLUMNS.OUTSTATUS.name())); 
			outdetailPo.setOutrmks(dataObject.getString(OutdetailPo.COLUMNS.OUTRMKS.name())); 
			outdetailPo.setConfirmdate(dataObject.getString(OutdetailPo.COLUMNS.CONFIRMDATE.name())); 
			outdetailPo.setDescrip(dataObject.getString(OutdetailPo.COLUMNS.DESCRIP.name())); 
			outdetailPo.setMonthno(dataObject.getString(OutdetailPo.COLUMNS.MONTHNO.name())); 
			outdetailPo.setUserid(dataObject.getString(OutdetailPo.COLUMNS.USERID.name())); 
			outdetailPo.setTradeprdtno(dataObject.getString(OutdetailPo.COLUMNS.TRADEPRDTNO.name())); 
			outdetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.NWGHT.name()))); 
			outdetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.GROSS.name()))); 
			outdetailPo.setOutstrno(dataObject.getString(OutdetailPo.COLUMNS.OUTSTRNO.name())); 
			outdetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.UNITPRICE.name()))); 
			outdetailPo.setCcccode(dataObject.getString(OutdetailPo.COLUMNS.CCCCODE.name())); 
			outdetailPo.setRlstime(dataObject.getString(OutdetailPo.COLUMNS.RLSTIME.name())); 
			outdetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.DUTYRATE.name()))); 
			outdetailPo.setPono(dataObject.getString(OutdetailPo.COLUMNS.PONO.name())); 
			outdetailPo.setInvno(dataObject.getString(OutdetailPo.COLUMNS.INVNO.name())); 
			outdetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.COUNTNO.name()))); 
			outdetailPo.setMawb(dataObject.getString(OutdetailPo.COLUMNS.MAWB.name())); 
			outdetailPo.setVesselno(dataObject.getString(OutdetailPo.COLUMNS.VESSELNO.name())); 
			outdetailPo.setDutytype(dataObject.getString(OutdetailPo.COLUMNS.DUTYTYPE.name())); 
			outdetailPo.setOptype(dataObject.getString(OutdetailPo.COLUMNS.OPTYPE.name())); 
			outdetailPo.setStatmode(dataObject.getString(OutdetailPo.COLUMNS.STATMODE.name())); 
			outdetailPo.setOutrmks2(dataObject.getString(OutdetailPo.COLUMNS.OUTRMKS2.name())); 
			outdetailPo.setOrefbillno(dataObject.getString(OutdetailPo.COLUMNS.OREFBILLNO.name())); 
			outdetailPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.OITEM.name()))); 
			outdetailPo.setDecldate(dataObject.getString(OutdetailPo.COLUMNS.DECLDATE.name())); 
			outdetailPo.setInvoice(dataObject.getString(OutdetailPo.COLUMNS.INVOICE.name())); 
			outdetailPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(OutdetailPo.COLUMNS.MOITEMNO.name()))); 
			return outdetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final OutdetailPo outdetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(OutdetailPo.COLUMNS.BONDNO.name(), outdetailPo.getBondno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.REFBILLNO.name(), outdetailPo.getRefbillno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.ITEM.name(), outdetailPo.getItem()); 
			dataObject.setValue(OutdetailPo.COLUMNS.PRDTNO.name(), outdetailPo.getPrdtno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.ROUTQTY.name(), outdetailPo.getRoutqty()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTUNIT.name(), outdetailPo.getOutunit()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTPOST.name(), outdetailPo.getOutpost()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTDATE.name(), outdetailPo.getOutdate()); 
			dataObject.setValue(OutdetailPo.COLUMNS.BATCHNO.name(), outdetailPo.getBatchno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.STOCKNO.name(), outdetailPo.getStockno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DECLTYPE.name(), outdetailPo.getDecltype()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DECLNO.name(), outdetailPo.getDeclno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.ITEMNO.name(), outdetailPo.getItemno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.ODECLNO.name(), outdetailPo.getOdeclno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OITEMNO.name(), outdetailPo.getOitemno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTSTATUS.name(), outdetailPo.getOutstatus()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTRMKS.name(), outdetailPo.getOutrmks()); 
			dataObject.setValue(OutdetailPo.COLUMNS.CONFIRMDATE.name(), outdetailPo.getConfirmdate()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DESCRIP.name(), outdetailPo.getDescrip()); 
			dataObject.setValue(OutdetailPo.COLUMNS.MONTHNO.name(), outdetailPo.getMonthno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.USERID.name(), outdetailPo.getUserid()); 
			dataObject.setValue(OutdetailPo.COLUMNS.TRADEPRDTNO.name(), outdetailPo.getTradeprdtno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.NWGHT.name(), outdetailPo.getNwght()); 
			dataObject.setValue(OutdetailPo.COLUMNS.GROSS.name(), outdetailPo.getGross()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTSTRNO.name(), outdetailPo.getOutstrno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.UNITPRICE.name(), outdetailPo.getUnitprice()); 
			dataObject.setValue(OutdetailPo.COLUMNS.CCCCODE.name(), outdetailPo.getCcccode()); 
			dataObject.setValue(OutdetailPo.COLUMNS.RLSTIME.name(), outdetailPo.getRlstime()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DUTYRATE.name(), outdetailPo.getDutyrate()); 
			dataObject.setValue(OutdetailPo.COLUMNS.PONO.name(), outdetailPo.getPono()); 
			dataObject.setValue(OutdetailPo.COLUMNS.INVNO.name(), outdetailPo.getInvno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.COUNTNO.name(), outdetailPo.getCountno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.MAWB.name(), outdetailPo.getMawb()); 
			dataObject.setValue(OutdetailPo.COLUMNS.VESSELNO.name(), outdetailPo.getVesselno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DUTYTYPE.name(), outdetailPo.getDutytype()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OPTYPE.name(), outdetailPo.getOptype()); 
			dataObject.setValue(OutdetailPo.COLUMNS.STATMODE.name(), outdetailPo.getStatmode()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OUTRMKS2.name(), outdetailPo.getOutrmks2()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OREFBILLNO.name(), outdetailPo.getOrefbillno()); 
			dataObject.setValue(OutdetailPo.COLUMNS.OITEM.name(), outdetailPo.getOitem()); 
			dataObject.setValue(OutdetailPo.COLUMNS.DECLDATE.name(), outdetailPo.getDecldate()); 
			dataObject.setValue(OutdetailPo.COLUMNS.INVOICE.name(), outdetailPo.getInvoice()); 
			dataObject.setValue(OutdetailPo.COLUMNS.MOITEMNO.name(), outdetailPo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<OutdetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(OutdetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(OutdetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(OutdetailPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(OutdetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(OutdetailPo.COLUMNS.OUTPOST.name(), po.getOutpost()); 
		sqlWhere.add(OutdetailPo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(OutdetailPo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		return sqlWhere; 
	} 
 
} 
