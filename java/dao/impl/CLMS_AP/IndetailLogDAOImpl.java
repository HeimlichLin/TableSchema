package com.doc.common.dao.impl; 
 
public class IndetailLogDAOImpl extends GeneralDAOImpl<IndetailLogPo> implements IndetailLogDAO { 
	public static final IndetailLogDAOImpl INSTANCE = new IndetailLogDAOImpl(); 
	public static final String TABLENAME = "INDETAIL_LOG"; 

	public IndetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndetailLogPo> CONVERTER = new MapConverter<IndetailLogPo>() { 
 
		@Override 
		public IndetailLogPo convert(final DataObject dataObject) { 
			final IndetailLogPo indetailLogPo = new IndetailLogPo(); 
			indetailLogPo.setBondno(dataObject.getString(IndetailLogPo.COLUMNS.BONDNO.name())); 
			indetailLogPo.setRefbillno(dataObject.getString(IndetailLogPo.COLUMNS.REFBILLNO.name())); 
			indetailLogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.ITEM.name()))); 
			indetailLogPo.setPrdtno(dataObject.getString(IndetailLogPo.COLUMNS.PRDTNO.name())); 
			indetailLogPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.RINQTY.name()))); 
			indetailLogPo.setInunit(dataObject.getString(IndetailLogPo.COLUMNS.INUNIT.name())); 
			indetailLogPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.BALANCE.name()))); 
			indetailLogPo.setInpost(dataObject.getString(IndetailLogPo.COLUMNS.INPOST.name())); 
			indetailLogPo.setIndate(dataObject.getString(IndetailLogPo.COLUMNS.INDATE.name())); 
			indetailLogPo.setBatchno(dataObject.getString(IndetailLogPo.COLUMNS.BATCHNO.name())); 
			indetailLogPo.setStockno(dataObject.getString(IndetailLogPo.COLUMNS.STOCKNO.name())); 
			indetailLogPo.setDecltype(dataObject.getString(IndetailLogPo.COLUMNS.DECLTYPE.name())); 
			indetailLogPo.setDeclno(dataObject.getString(IndetailLogPo.COLUMNS.DECLNO.name())); 
			indetailLogPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.ITEMNO.name()))); 
			indetailLogPo.setOtestno(dataObject.getString(IndetailLogPo.COLUMNS.OTESTNO.name())); 
			indetailLogPo.setInstatus(dataObject.getString(IndetailLogPo.COLUMNS.INSTATUS.name())); 
			indetailLogPo.setInrmks(dataObject.getString(IndetailLogPo.COLUMNS.INRMKS.name())); 
			indetailLogPo.setConfirmdate(dataObject.getString(IndetailLogPo.COLUMNS.CONFIRMDATE.name())); 
			indetailLogPo.setDescrip(dataObject.getString(IndetailLogPo.COLUMNS.DESCRIP.name())); 
			indetailLogPo.setMonthno(dataObject.getString(IndetailLogPo.COLUMNS.MONTHNO.name())); 
			indetailLogPo.setCcccode(dataObject.getString(IndetailLogPo.COLUMNS.CCCCODE.name())); 
			indetailLogPo.setD8date(dataObject.getString(IndetailLogPo.COLUMNS.D8DATE.name())); 
			indetailLogPo.setUserid(dataObject.getString(IndetailLogPo.COLUMNS.USERID.name())); 
			indetailLogPo.setTradeprdtno(dataObject.getString(IndetailLogPo.COLUMNS.TRADEPRDTNO.name())); 
			indetailLogPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.UNITPRICE.name()))); 
			indetailLogPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.NWGHT.name()))); 
			indetailLogPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.GROSS.name()))); 
			indetailLogPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.VALUEAMT.name()))); 
			indetailLogPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.DUTYRATE.name()))); 
			indetailLogPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.COMDTAXRATE.name()))); 
			indetailLogPo.setMdeclno(dataObject.getString(IndetailLogPo.COLUMNS.MDECLNO.name())); 
			indetailLogPo.setD8declno(dataObject.getString(IndetailLogPo.COLUMNS.D8DECLNO.name())); 
			indetailLogPo.setOutstrno(dataObject.getString(IndetailLogPo.COLUMNS.OUTSTRNO.name())); 
			indetailLogPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.DECLQTY.name()))); 
			indetailLogPo.setRlstime(dataObject.getString(IndetailLogPo.COLUMNS.RLSTIME.name())); 
			indetailLogPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.COUNTNO.name()))); 
			indetailLogPo.setDutytype(dataObject.getString(IndetailLogPo.COLUMNS.DUTYTYPE.name())); 
			indetailLogPo.setStatmode(dataObject.getString(IndetailLogPo.COLUMNS.STATMODE.name())); 
			indetailLogPo.setOdeclno(dataObject.getString(IndetailLogPo.COLUMNS.ODECLNO.name())); 
			indetailLogPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.OITEMNO.name()))); 
			indetailLogPo.setOutstatus(dataObject.getString(IndetailLogPo.COLUMNS.OUTSTATUS.name())); 
			indetailLogPo.setOptype(dataObject.getString(IndetailLogPo.COLUMNS.OPTYPE.name())); 
			indetailLogPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailLogPo.COLUMNS.ADJUSTQTY.name()))); 
			indetailLogPo.setInrmks2(dataObject.getString(IndetailLogPo.COLUMNS.INRMKS2.name())); 
			indetailLogPo.setInvoice(dataObject.getString(IndetailLogPo.COLUMNS.INVOICE.name())); 
			indetailLogPo.setInvno(dataObject.getString(IndetailLogPo.COLUMNS.INVNO.name())); 
			indetailLogPo.setDecldate(dataObject.getString(IndetailLogPo.COLUMNS.DECLDATE.name())); 
			indetailLogPo.setProcesstime(dataObject.getString(IndetailLogPo.COLUMNS.PROCESSTIME.name())); 
			indetailLogPo.setProcessstate(dataObject.getString(IndetailLogPo.COLUMNS.PROCESSSTATE.name())); 
			return indetailLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndetailLogPo indetailLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndetailLogPo.COLUMNS.BONDNO.name(), indetailLogPo.getBondno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.REFBILLNO.name(), indetailLogPo.getRefbillno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.ITEM.name(), indetailLogPo.getItem()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.PRDTNO.name(), indetailLogPo.getPrdtno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.RINQTY.name(), indetailLogPo.getRinqty()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INUNIT.name(), indetailLogPo.getInunit()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.BALANCE.name(), indetailLogPo.getBalance()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INPOST.name(), indetailLogPo.getInpost()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INDATE.name(), indetailLogPo.getIndate()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.BATCHNO.name(), indetailLogPo.getBatchno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.STOCKNO.name(), indetailLogPo.getStockno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DECLTYPE.name(), indetailLogPo.getDecltype()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DECLNO.name(), indetailLogPo.getDeclno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.ITEMNO.name(), indetailLogPo.getItemno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.OTESTNO.name(), indetailLogPo.getOtestno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INSTATUS.name(), indetailLogPo.getInstatus()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INRMKS.name(), indetailLogPo.getInrmks()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.CONFIRMDATE.name(), indetailLogPo.getConfirmdate()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DESCRIP.name(), indetailLogPo.getDescrip()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.MONTHNO.name(), indetailLogPo.getMonthno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.CCCCODE.name(), indetailLogPo.getCcccode()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.D8DATE.name(), indetailLogPo.getD8date()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.USERID.name(), indetailLogPo.getUserid()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.TRADEPRDTNO.name(), indetailLogPo.getTradeprdtno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.UNITPRICE.name(), indetailLogPo.getUnitprice()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.NWGHT.name(), indetailLogPo.getNwght()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.GROSS.name(), indetailLogPo.getGross()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.VALUEAMT.name(), indetailLogPo.getValueamt()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DUTYRATE.name(), indetailLogPo.getDutyrate()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.COMDTAXRATE.name(), indetailLogPo.getComdtaxrate()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.MDECLNO.name(), indetailLogPo.getMdeclno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.D8DECLNO.name(), indetailLogPo.getD8declno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.OUTSTRNO.name(), indetailLogPo.getOutstrno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DECLQTY.name(), indetailLogPo.getDeclqty()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.RLSTIME.name(), indetailLogPo.getRlstime()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.COUNTNO.name(), indetailLogPo.getCountno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DUTYTYPE.name(), indetailLogPo.getDutytype()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.STATMODE.name(), indetailLogPo.getStatmode()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.ODECLNO.name(), indetailLogPo.getOdeclno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.OITEMNO.name(), indetailLogPo.getOitemno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.OUTSTATUS.name(), indetailLogPo.getOutstatus()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.OPTYPE.name(), indetailLogPo.getOptype()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.ADJUSTQTY.name(), indetailLogPo.getAdjustqty()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INRMKS2.name(), indetailLogPo.getInrmks2()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INVOICE.name(), indetailLogPo.getInvoice()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.INVNO.name(), indetailLogPo.getInvno()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.DECLDATE.name(), indetailLogPo.getDecldate()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.PROCESSTIME.name(), indetailLogPo.getProcesstime()); 
			dataObject.setValue(IndetailLogPo.COLUMNS.PROCESSSTATE.name(), indetailLogPo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndetailLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndetailLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
