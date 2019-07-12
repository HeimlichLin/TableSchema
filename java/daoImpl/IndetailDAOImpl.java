package com.doc.common.dao.impl; 
 
public class IndetailDAOImpl extends GeneralDAOImpl<IndetailDo> implements IndetailDAOImpl { 
	public static final IndetailDAOImpl INSTANCE = new IndetailDAOImpl(); 
	public static final String TABLENAME = "INDETAIL"; 

	public IndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<IndetailDo> CONVERTER = new MapConverter<IndetailDo>() { 
 
		@Override 
		public IndetailDo convert(final DataObject dataObject) { 
			final IndetailDo indetailDo = new IndetailDo(); 
			indetailDo.setBondno(dataObject.getString(IndetailDo.COLUMNS.BONDNO.name())); 
			indetailDo.setRefbillno(dataObject.getString(IndetailDo.COLUMNS.REFBILLNO.name())); 
			indetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.ITEM.name()))); 
			indetailDo.setPrdtno(dataObject.getString(IndetailDo.COLUMNS.PRDTNO.name())); 
			indetailDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.RINQTY.name()))); 
			indetailDo.setInunit(dataObject.getString(IndetailDo.COLUMNS.INUNIT.name())); 
			indetailDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.BALANCE.name()))); 
			indetailDo.setInpost(dataObject.getString(IndetailDo.COLUMNS.INPOST.name())); 
			indetailDo.setIndate(dataObject.getString(IndetailDo.COLUMNS.INDATE.name())); 
			indetailDo.setBatchno(dataObject.getString(IndetailDo.COLUMNS.BATCHNO.name())); 
			indetailDo.setStockno(dataObject.getString(IndetailDo.COLUMNS.STOCKNO.name())); 
			indetailDo.setDecltype(dataObject.getString(IndetailDo.COLUMNS.DECLTYPE.name())); 
			indetailDo.setDeclno(dataObject.getString(IndetailDo.COLUMNS.DECLNO.name())); 
			indetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.ITEMNO.name()))); 
			indetailDo.setOtestno(dataObject.getString(IndetailDo.COLUMNS.OTESTNO.name())); 
			indetailDo.setInstatus(dataObject.getString(IndetailDo.COLUMNS.INSTATUS.name())); 
			indetailDo.setInrmks(dataObject.getString(IndetailDo.COLUMNS.INRMKS.name())); 
			indetailDo.setConfirmdate(dataObject.getString(IndetailDo.COLUMNS.CONFIRMDATE.name())); 
			indetailDo.setDescrip(dataObject.getString(IndetailDo.COLUMNS.DESCRIP.name())); 
			indetailDo.setMonthno(dataObject.getString(IndetailDo.COLUMNS.MONTHNO.name())); 
			indetailDo.setCcccode(dataObject.getString(IndetailDo.COLUMNS.CCCCODE.name())); 
			indetailDo.setD8date(dataObject.getString(IndetailDo.COLUMNS.D8DATE.name())); 
			indetailDo.setUserid(dataObject.getString(IndetailDo.COLUMNS.USERID.name())); 
			indetailDo.setTradeprdtno(dataObject.getString(IndetailDo.COLUMNS.TRADEPRDTNO.name())); 
			indetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.UNITPRICE.name()))); 
			indetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.NWGHT.name()))); 
			indetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.GROSS.name()))); 
			indetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.VALUEAMT.name()))); 
			indetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.DUTYRATE.name()))); 
			indetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.COMDTAXRATE.name()))); 
			indetailDo.setMdeclno(dataObject.getString(IndetailDo.COLUMNS.MDECLNO.name())); 
			indetailDo.setD8declno(dataObject.getString(IndetailDo.COLUMNS.D8DECLNO.name())); 
			indetailDo.setOutstrno(dataObject.getString(IndetailDo.COLUMNS.OUTSTRNO.name())); 
			indetailDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.DECLQTY.name()))); 
			indetailDo.setRlstime(dataObject.getString(IndetailDo.COLUMNS.RLSTIME.name())); 
			indetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.COUNTNO.name()))); 
			indetailDo.setDutytype(dataObject.getString(IndetailDo.COLUMNS.DUTYTYPE.name())); 
			indetailDo.setStatmode(dataObject.getString(IndetailDo.COLUMNS.STATMODE.name())); 
			indetailDo.setOdeclno(dataObject.getString(IndetailDo.COLUMNS.ODECLNO.name())); 
			indetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.OITEMNO.name()))); 
			indetailDo.setOutstatus(dataObject.getString(IndetailDo.COLUMNS.OUTSTATUS.name())); 
			indetailDo.setOptype(dataObject.getString(IndetailDo.COLUMNS.OPTYPE.name())); 
			indetailDo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(IndetailDo.COLUMNS.ADJUSTQTY.name()))); 
			indetailDo.setInrmks2(dataObject.getString(IndetailDo.COLUMNS.INRMKS2.name())); 
			indetailDo.setInvoice(dataObject.getString(IndetailDo.COLUMNS.INVOICE.name())); 
			indetailDo.setInvno(dataObject.getString(IndetailDo.COLUMNS.INVNO.name())); 
			indetailDo.setDecldate(dataObject.getString(IndetailDo.COLUMNS.DECLDATE.name())); 
			return indetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndetailDo indetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndetailDo.COLUMNS.BONDNO.name(), indetailDo.getBondno()); 
			dataObject.setValue(IndetailDo.COLUMNS.REFBILLNO.name(), indetailDo.getRefbillno()); 
			dataObject.setValue(IndetailDo.COLUMNS.ITEM.name(), indetailDo.getItem()); 
			dataObject.setValue(IndetailDo.COLUMNS.PRDTNO.name(), indetailDo.getPrdtno()); 
			dataObject.setValue(IndetailDo.COLUMNS.RINQTY.name(), indetailDo.getRinqty()); 
			dataObject.setValue(IndetailDo.COLUMNS.INUNIT.name(), indetailDo.getInunit()); 
			dataObject.setValue(IndetailDo.COLUMNS.BALANCE.name(), indetailDo.getBalance()); 
			dataObject.setValue(IndetailDo.COLUMNS.INPOST.name(), indetailDo.getInpost()); 
			dataObject.setValue(IndetailDo.COLUMNS.INDATE.name(), indetailDo.getIndate()); 
			dataObject.setValue(IndetailDo.COLUMNS.BATCHNO.name(), indetailDo.getBatchno()); 
			dataObject.setValue(IndetailDo.COLUMNS.STOCKNO.name(), indetailDo.getStockno()); 
			dataObject.setValue(IndetailDo.COLUMNS.DECLTYPE.name(), indetailDo.getDecltype()); 
			dataObject.setValue(IndetailDo.COLUMNS.DECLNO.name(), indetailDo.getDeclno()); 
			dataObject.setValue(IndetailDo.COLUMNS.ITEMNO.name(), indetailDo.getItemno()); 
			dataObject.setValue(IndetailDo.COLUMNS.OTESTNO.name(), indetailDo.getOtestno()); 
			dataObject.setValue(IndetailDo.COLUMNS.INSTATUS.name(), indetailDo.getInstatus()); 
			dataObject.setValue(IndetailDo.COLUMNS.INRMKS.name(), indetailDo.getInrmks()); 
			dataObject.setValue(IndetailDo.COLUMNS.CONFIRMDATE.name(), indetailDo.getConfirmdate()); 
			dataObject.setValue(IndetailDo.COLUMNS.DESCRIP.name(), indetailDo.getDescrip()); 
			dataObject.setValue(IndetailDo.COLUMNS.MONTHNO.name(), indetailDo.getMonthno()); 
			dataObject.setValue(IndetailDo.COLUMNS.CCCCODE.name(), indetailDo.getCcccode()); 
			dataObject.setValue(IndetailDo.COLUMNS.D8DATE.name(), indetailDo.getD8date()); 
			dataObject.setValue(IndetailDo.COLUMNS.USERID.name(), indetailDo.getUserid()); 
			dataObject.setValue(IndetailDo.COLUMNS.TRADEPRDTNO.name(), indetailDo.getTradeprdtno()); 
			dataObject.setValue(IndetailDo.COLUMNS.UNITPRICE.name(), indetailDo.getUnitprice()); 
			dataObject.setValue(IndetailDo.COLUMNS.NWGHT.name(), indetailDo.getNwght()); 
			dataObject.setValue(IndetailDo.COLUMNS.GROSS.name(), indetailDo.getGross()); 
			dataObject.setValue(IndetailDo.COLUMNS.VALUEAMT.name(), indetailDo.getValueamt()); 
			dataObject.setValue(IndetailDo.COLUMNS.DUTYRATE.name(), indetailDo.getDutyrate()); 
			dataObject.setValue(IndetailDo.COLUMNS.COMDTAXRATE.name(), indetailDo.getComdtaxrate()); 
			dataObject.setValue(IndetailDo.COLUMNS.MDECLNO.name(), indetailDo.getMdeclno()); 
			dataObject.setValue(IndetailDo.COLUMNS.D8DECLNO.name(), indetailDo.getD8declno()); 
			dataObject.setValue(IndetailDo.COLUMNS.OUTSTRNO.name(), indetailDo.getOutstrno()); 
			dataObject.setValue(IndetailDo.COLUMNS.DECLQTY.name(), indetailDo.getDeclqty()); 
			dataObject.setValue(IndetailDo.COLUMNS.RLSTIME.name(), indetailDo.getRlstime()); 
			dataObject.setValue(IndetailDo.COLUMNS.COUNTNO.name(), indetailDo.getCountno()); 
			dataObject.setValue(IndetailDo.COLUMNS.DUTYTYPE.name(), indetailDo.getDutytype()); 
			dataObject.setValue(IndetailDo.COLUMNS.STATMODE.name(), indetailDo.getStatmode()); 
			dataObject.setValue(IndetailDo.COLUMNS.ODECLNO.name(), indetailDo.getOdeclno()); 
			dataObject.setValue(IndetailDo.COLUMNS.OITEMNO.name(), indetailDo.getOitemno()); 
			dataObject.setValue(IndetailDo.COLUMNS.OUTSTATUS.name(), indetailDo.getOutstatus()); 
			dataObject.setValue(IndetailDo.COLUMNS.OPTYPE.name(), indetailDo.getOptype()); 
			dataObject.setValue(IndetailDo.COLUMNS.ADJUSTQTY.name(), indetailDo.getAdjustqty()); 
			dataObject.setValue(IndetailDo.COLUMNS.INRMKS2.name(), indetailDo.getInrmks2()); 
			dataObject.setValue(IndetailDo.COLUMNS.INVOICE.name(), indetailDo.getInvoice()); 
			dataObject.setValue(IndetailDo.COLUMNS.INVNO.name(), indetailDo.getInvno()); 
			dataObject.setValue(IndetailDo.COLUMNS.DECLDATE.name(), indetailDo.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndetailDo po) { 
		sqlWhere.add(IndetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(IndetailDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(IndetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(IndetailDo.COLUMNS.INPOST.name(), po.getInpost()); 
	} 
 
} 
