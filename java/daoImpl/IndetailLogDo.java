package com.doc.common.dao.impl; 
 
public class IndetailLogDAO extends GeneralDAOImpl<IndetailLogDo> implements IndetailLogDAO { 
	public static final IndetailLogDAOImpl INSTANCE = new IndetailLogDAOImpl(); 
	public static final String TABLENAME = "INDETAIL_LOG"; 

	public IndetailLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<IndetailLogDo> CONVERTER = new MapConverter<IndetailLogDo>() { 
 
		@Override 
		public IndetailLogDo convert(final DataObject dataObject) { 
			final IndetailLogDo indetailLogDo = new IndetailLogDo(); 
			indetailLogDo.setBondno(dataObject.getString(IndetailLogDo.COLUMNS.BONDNO.name())); 
			indetailLogDo.setRefbillno(dataObject.getString(IndetailLogDo.COLUMNS.REFBILLNO.name())); 
			indetailLogDo.setItem(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.ITEM.name()))); 
			indetailLogDo.setPrdtno(dataObject.getString(IndetailLogDo.COLUMNS.PRDTNO.name())); 
			indetailLogDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.RINQTY.name()))); 
			indetailLogDo.setInunit(dataObject.getString(IndetailLogDo.COLUMNS.INUNIT.name())); 
			indetailLogDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.BALANCE.name()))); 
			indetailLogDo.setInpost(dataObject.getString(IndetailLogDo.COLUMNS.INPOST.name())); 
			indetailLogDo.setIndate(dataObject.getString(IndetailLogDo.COLUMNS.INDATE.name())); 
			indetailLogDo.setBatchno(dataObject.getString(IndetailLogDo.COLUMNS.BATCHNO.name())); 
			indetailLogDo.setStockno(dataObject.getString(IndetailLogDo.COLUMNS.STOCKNO.name())); 
			indetailLogDo.setDecltype(dataObject.getString(IndetailLogDo.COLUMNS.DECLTYPE.name())); 
			indetailLogDo.setDeclno(dataObject.getString(IndetailLogDo.COLUMNS.DECLNO.name())); 
			indetailLogDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.ITEMNO.name()))); 
			indetailLogDo.setOtestno(dataObject.getString(IndetailLogDo.COLUMNS.OTESTNO.name())); 
			indetailLogDo.setInstatus(dataObject.getString(IndetailLogDo.COLUMNS.INSTATUS.name())); 
			indetailLogDo.setInrmks(dataObject.getString(IndetailLogDo.COLUMNS.INRMKS.name())); 
			indetailLogDo.setConfirmdate(dataObject.getString(IndetailLogDo.COLUMNS.CONFIRMDATE.name())); 
			indetailLogDo.setDescrip(dataObject.getString(IndetailLogDo.COLUMNS.DESCRIP.name())); 
			indetailLogDo.setMonthno(dataObject.getString(IndetailLogDo.COLUMNS.MONTHNO.name())); 
			indetailLogDo.setCcccode(dataObject.getString(IndetailLogDo.COLUMNS.CCCCODE.name())); 
			indetailLogDo.setD8date(dataObject.getString(IndetailLogDo.COLUMNS.D8DATE.name())); 
			indetailLogDo.setUserid(dataObject.getString(IndetailLogDo.COLUMNS.USERID.name())); 
			indetailLogDo.setTradeprdtno(dataObject.getString(IndetailLogDo.COLUMNS.TRADEPRDTNO.name())); 
			indetailLogDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.UNITPRICE.name()))); 
			indetailLogDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.NWGHT.name()))); 
			indetailLogDo.setGross(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.GROSS.name()))); 
			indetailLogDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.VALUEAMT.name()))); 
			indetailLogDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.DUTYRATE.name()))); 
			indetailLogDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.COMDTAXRATE.name()))); 
			indetailLogDo.setMdeclno(dataObject.getString(IndetailLogDo.COLUMNS.MDECLNO.name())); 
			indetailLogDo.setD8declno(dataObject.getString(IndetailLogDo.COLUMNS.D8DECLNO.name())); 
			indetailLogDo.setOutstrno(dataObject.getString(IndetailLogDo.COLUMNS.OUTSTRNO.name())); 
			indetailLogDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.DECLQTY.name()))); 
			indetailLogDo.setRlstime(dataObject.getString(IndetailLogDo.COLUMNS.RLSTIME.name())); 
			indetailLogDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.COUNTNO.name()))); 
			indetailLogDo.setDutytype(dataObject.getString(IndetailLogDo.COLUMNS.DUTYTYPE.name())); 
			indetailLogDo.setStatmode(dataObject.getString(IndetailLogDo.COLUMNS.STATMODE.name())); 
			indetailLogDo.setOdeclno(dataObject.getString(IndetailLogDo.COLUMNS.ODECLNO.name())); 
			indetailLogDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.OITEMNO.name()))); 
			indetailLogDo.setOutstatus(dataObject.getString(IndetailLogDo.COLUMNS.OUTSTATUS.name())); 
			indetailLogDo.setOptype(dataObject.getString(IndetailLogDo.COLUMNS.OPTYPE.name())); 
			indetailLogDo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(IndetailLogDo.COLUMNS.ADJUSTQTY.name()))); 
			indetailLogDo.setInrmks2(dataObject.getString(IndetailLogDo.COLUMNS.INRMKS2.name())); 
			indetailLogDo.setInvoice(dataObject.getString(IndetailLogDo.COLUMNS.INVOICE.name())); 
			indetailLogDo.setInvno(dataObject.getString(IndetailLogDo.COLUMNS.INVNO.name())); 
			indetailLogDo.setDecldate(dataObject.getString(IndetailLogDo.COLUMNS.DECLDATE.name())); 
			indetailLogDo.setProcesstime(dataObject.getString(IndetailLogDo.COLUMNS.PROCESSTIME.name())); 
			indetailLogDo.setProcessstate(dataObject.getString(IndetailLogDo.COLUMNS.PROCESSSTATE.name())); 
			return indetailLogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndetailLogDo indetailLogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndetailLogDo.COLUMNS.BONDNO.name(), indetailLogDo.getBondno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.REFBILLNO.name(), indetailLogDo.getRefbillno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.ITEM.name(), indetailLogDo.getItem()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.PRDTNO.name(), indetailLogDo.getPrdtno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.RINQTY.name(), indetailLogDo.getRinqty()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INUNIT.name(), indetailLogDo.getInunit()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.BALANCE.name(), indetailLogDo.getBalance()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INPOST.name(), indetailLogDo.getInpost()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INDATE.name(), indetailLogDo.getIndate()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.BATCHNO.name(), indetailLogDo.getBatchno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.STOCKNO.name(), indetailLogDo.getStockno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DECLTYPE.name(), indetailLogDo.getDecltype()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DECLNO.name(), indetailLogDo.getDeclno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.ITEMNO.name(), indetailLogDo.getItemno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.OTESTNO.name(), indetailLogDo.getOtestno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INSTATUS.name(), indetailLogDo.getInstatus()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INRMKS.name(), indetailLogDo.getInrmks()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.CONFIRMDATE.name(), indetailLogDo.getConfirmdate()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DESCRIP.name(), indetailLogDo.getDescrip()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.MONTHNO.name(), indetailLogDo.getMonthno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.CCCCODE.name(), indetailLogDo.getCcccode()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.D8DATE.name(), indetailLogDo.getD8date()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.USERID.name(), indetailLogDo.getUserid()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.TRADEPRDTNO.name(), indetailLogDo.getTradeprdtno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.UNITPRICE.name(), indetailLogDo.getUnitprice()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.NWGHT.name(), indetailLogDo.getNwght()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.GROSS.name(), indetailLogDo.getGross()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.VALUEAMT.name(), indetailLogDo.getValueamt()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DUTYRATE.name(), indetailLogDo.getDutyrate()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.COMDTAXRATE.name(), indetailLogDo.getComdtaxrate()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.MDECLNO.name(), indetailLogDo.getMdeclno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.D8DECLNO.name(), indetailLogDo.getD8declno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.OUTSTRNO.name(), indetailLogDo.getOutstrno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DECLQTY.name(), indetailLogDo.getDeclqty()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.RLSTIME.name(), indetailLogDo.getRlstime()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.COUNTNO.name(), indetailLogDo.getCountno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DUTYTYPE.name(), indetailLogDo.getDutytype()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.STATMODE.name(), indetailLogDo.getStatmode()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.ODECLNO.name(), indetailLogDo.getOdeclno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.OITEMNO.name(), indetailLogDo.getOitemno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.OUTSTATUS.name(), indetailLogDo.getOutstatus()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.OPTYPE.name(), indetailLogDo.getOptype()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.ADJUSTQTY.name(), indetailLogDo.getAdjustqty()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INRMKS2.name(), indetailLogDo.getInrmks2()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INVOICE.name(), indetailLogDo.getInvoice()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.INVNO.name(), indetailLogDo.getInvno()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.DECLDATE.name(), indetailLogDo.getDecldate()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.PROCESSTIME.name(), indetailLogDo.getProcesstime()); 
			dataObject.setValue(IndetailLogDo.COLUMNS.PROCESSSTATE.name(), indetailLogDo.getProcessstate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndetailLogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndetailLogDo po) { 
		sqlWhere.add(IndetailLogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INUNIT.name(), po.getInunit()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.OTESTNO.name(), po.getOtestno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INRMKS.name(), po.getInrmks()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.D8DATE.name(), po.getD8date()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.MDECLNO.name(), po.getMdeclno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.D8DECLNO.name(), po.getD8declno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.ADJUSTQTY.name(), po.getAdjustqty()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INRMKS2.name(), po.getInrmks2()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INVOICE.name(), po.getInvoice()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.INVNO.name(), po.getInvno()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.PROCESSTIME.name(), po.getProcesstime()); 
		sqlWhere.add(IndetailLogDo.COLUMNS.PROCESSSTATE.name(), po.getProcessstate()); 
	} 
 
} 