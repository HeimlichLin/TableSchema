package com.doc.common.dao.impl; 
 
public class IndetailDAOImpl extends GeneralDAOImpl<IndetailPo> implements IndetailDAO { 
	public static final IndetailDAOImpl INSTANCE = new IndetailDAOImpl(); 
	public static final String TABLENAME = "INDETAIL"; 

	public IndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IndetailPo> CONVERTER = new MapConverter<IndetailPo>() { 
 
		@Override 
		public IndetailPo convert(final DataObject dataObject) { 
			final IndetailPo indetailPo = new IndetailPo(); 
			indetailPo.setBondno(dataObject.getString(IndetailPo.COLUMNS.BONDNO.name())); 
			indetailPo.setRefbillno(dataObject.getString(IndetailPo.COLUMNS.REFBILLNO.name())); 
			indetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.ITEM.name()))); 
			indetailPo.setPrdtno(dataObject.getString(IndetailPo.COLUMNS.PRDTNO.name())); 
			indetailPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.RINQTY.name()))); 
			indetailPo.setInunit(dataObject.getString(IndetailPo.COLUMNS.INUNIT.name())); 
			indetailPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.BALANCE.name()))); 
			indetailPo.setInpost(dataObject.getString(IndetailPo.COLUMNS.INPOST.name())); 
			indetailPo.setIndate(dataObject.getString(IndetailPo.COLUMNS.INDATE.name())); 
			indetailPo.setBatchno(dataObject.getString(IndetailPo.COLUMNS.BATCHNO.name())); 
			indetailPo.setStockno(dataObject.getString(IndetailPo.COLUMNS.STOCKNO.name())); 
			indetailPo.setDecltype(dataObject.getString(IndetailPo.COLUMNS.DECLTYPE.name())); 
			indetailPo.setDeclno(dataObject.getString(IndetailPo.COLUMNS.DECLNO.name())); 
			indetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.ITEMNO.name()))); 
			indetailPo.setOtestno(dataObject.getString(IndetailPo.COLUMNS.OTESTNO.name())); 
			indetailPo.setInstatus(dataObject.getString(IndetailPo.COLUMNS.INSTATUS.name())); 
			indetailPo.setInrmks(dataObject.getString(IndetailPo.COLUMNS.INRMKS.name())); 
			indetailPo.setConfirmdate(dataObject.getString(IndetailPo.COLUMNS.CONFIRMDATE.name())); 
			indetailPo.setDescrip(dataObject.getString(IndetailPo.COLUMNS.DESCRIP.name())); 
			indetailPo.setMonthno(dataObject.getString(IndetailPo.COLUMNS.MONTHNO.name())); 
			indetailPo.setCcccode(dataObject.getString(IndetailPo.COLUMNS.CCCCODE.name())); 
			indetailPo.setD8date(dataObject.getString(IndetailPo.COLUMNS.D8DATE.name())); 
			indetailPo.setUserid(dataObject.getString(IndetailPo.COLUMNS.USERID.name())); 
			indetailPo.setTradeprdtno(dataObject.getString(IndetailPo.COLUMNS.TRADEPRDTNO.name())); 
			indetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.UNITPRICE.name()))); 
			indetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.NWGHT.name()))); 
			indetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.GROSS.name()))); 
			indetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.VALUEAMT.name()))); 
			indetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.DUTYRATE.name()))); 
			indetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.COMDTAXRATE.name()))); 
			indetailPo.setMdeclno(dataObject.getString(IndetailPo.COLUMNS.MDECLNO.name())); 
			indetailPo.setD8declno(dataObject.getString(IndetailPo.COLUMNS.D8DECLNO.name())); 
			indetailPo.setOutstrno(dataObject.getString(IndetailPo.COLUMNS.OUTSTRNO.name())); 
			indetailPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.DECLQTY.name()))); 
			indetailPo.setRlstime(dataObject.getString(IndetailPo.COLUMNS.RLSTIME.name())); 
			indetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.COUNTNO.name()))); 
			indetailPo.setDutytype(dataObject.getString(IndetailPo.COLUMNS.DUTYTYPE.name())); 
			indetailPo.setStatmode(dataObject.getString(IndetailPo.COLUMNS.STATMODE.name())); 
			indetailPo.setOdeclno(dataObject.getString(IndetailPo.COLUMNS.ODECLNO.name())); 
			indetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.OITEMNO.name()))); 
			indetailPo.setOutstatus(dataObject.getString(IndetailPo.COLUMNS.OUTSTATUS.name())); 
			indetailPo.setOptype(dataObject.getString(IndetailPo.COLUMNS.OPTYPE.name())); 
			indetailPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(IndetailPo.COLUMNS.ADJUSTQTY.name()))); 
			indetailPo.setInrmks2(dataObject.getString(IndetailPo.COLUMNS.INRMKS2.name())); 
			indetailPo.setInvoice(dataObject.getString(IndetailPo.COLUMNS.INVOICE.name())); 
			indetailPo.setInvno(dataObject.getString(IndetailPo.COLUMNS.INVNO.name())); 
			indetailPo.setDecldate(dataObject.getString(IndetailPo.COLUMNS.DECLDATE.name())); 
			return indetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IndetailPo indetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IndetailPo.COLUMNS.BONDNO.name(), indetailPo.getBondno()); 
			dataObject.setValue(IndetailPo.COLUMNS.REFBILLNO.name(), indetailPo.getRefbillno()); 
			dataObject.setValue(IndetailPo.COLUMNS.ITEM.name(), indetailPo.getItem()); 
			dataObject.setValue(IndetailPo.COLUMNS.PRDTNO.name(), indetailPo.getPrdtno()); 
			dataObject.setValue(IndetailPo.COLUMNS.RINQTY.name(), indetailPo.getRinqty()); 
			dataObject.setValue(IndetailPo.COLUMNS.INUNIT.name(), indetailPo.getInunit()); 
			dataObject.setValue(IndetailPo.COLUMNS.BALANCE.name(), indetailPo.getBalance()); 
			dataObject.setValue(IndetailPo.COLUMNS.INPOST.name(), indetailPo.getInpost()); 
			dataObject.setValue(IndetailPo.COLUMNS.INDATE.name(), indetailPo.getIndate()); 
			dataObject.setValue(IndetailPo.COLUMNS.BATCHNO.name(), indetailPo.getBatchno()); 
			dataObject.setValue(IndetailPo.COLUMNS.STOCKNO.name(), indetailPo.getStockno()); 
			dataObject.setValue(IndetailPo.COLUMNS.DECLTYPE.name(), indetailPo.getDecltype()); 
			dataObject.setValue(IndetailPo.COLUMNS.DECLNO.name(), indetailPo.getDeclno()); 
			dataObject.setValue(IndetailPo.COLUMNS.ITEMNO.name(), indetailPo.getItemno()); 
			dataObject.setValue(IndetailPo.COLUMNS.OTESTNO.name(), indetailPo.getOtestno()); 
			dataObject.setValue(IndetailPo.COLUMNS.INSTATUS.name(), indetailPo.getInstatus()); 
			dataObject.setValue(IndetailPo.COLUMNS.INRMKS.name(), indetailPo.getInrmks()); 
			dataObject.setValue(IndetailPo.COLUMNS.CONFIRMDATE.name(), indetailPo.getConfirmdate()); 
			dataObject.setValue(IndetailPo.COLUMNS.DESCRIP.name(), indetailPo.getDescrip()); 
			dataObject.setValue(IndetailPo.COLUMNS.MONTHNO.name(), indetailPo.getMonthno()); 
			dataObject.setValue(IndetailPo.COLUMNS.CCCCODE.name(), indetailPo.getCcccode()); 
			dataObject.setValue(IndetailPo.COLUMNS.D8DATE.name(), indetailPo.getD8date()); 
			dataObject.setValue(IndetailPo.COLUMNS.USERID.name(), indetailPo.getUserid()); 
			dataObject.setValue(IndetailPo.COLUMNS.TRADEPRDTNO.name(), indetailPo.getTradeprdtno()); 
			dataObject.setValue(IndetailPo.COLUMNS.UNITPRICE.name(), indetailPo.getUnitprice()); 
			dataObject.setValue(IndetailPo.COLUMNS.NWGHT.name(), indetailPo.getNwght()); 
			dataObject.setValue(IndetailPo.COLUMNS.GROSS.name(), indetailPo.getGross()); 
			dataObject.setValue(IndetailPo.COLUMNS.VALUEAMT.name(), indetailPo.getValueamt()); 
			dataObject.setValue(IndetailPo.COLUMNS.DUTYRATE.name(), indetailPo.getDutyrate()); 
			dataObject.setValue(IndetailPo.COLUMNS.COMDTAXRATE.name(), indetailPo.getComdtaxrate()); 
			dataObject.setValue(IndetailPo.COLUMNS.MDECLNO.name(), indetailPo.getMdeclno()); 
			dataObject.setValue(IndetailPo.COLUMNS.D8DECLNO.name(), indetailPo.getD8declno()); 
			dataObject.setValue(IndetailPo.COLUMNS.OUTSTRNO.name(), indetailPo.getOutstrno()); 
			dataObject.setValue(IndetailPo.COLUMNS.DECLQTY.name(), indetailPo.getDeclqty()); 
			dataObject.setValue(IndetailPo.COLUMNS.RLSTIME.name(), indetailPo.getRlstime()); 
			dataObject.setValue(IndetailPo.COLUMNS.COUNTNO.name(), indetailPo.getCountno()); 
			dataObject.setValue(IndetailPo.COLUMNS.DUTYTYPE.name(), indetailPo.getDutytype()); 
			dataObject.setValue(IndetailPo.COLUMNS.STATMODE.name(), indetailPo.getStatmode()); 
			dataObject.setValue(IndetailPo.COLUMNS.ODECLNO.name(), indetailPo.getOdeclno()); 
			dataObject.setValue(IndetailPo.COLUMNS.OITEMNO.name(), indetailPo.getOitemno()); 
			dataObject.setValue(IndetailPo.COLUMNS.OUTSTATUS.name(), indetailPo.getOutstatus()); 
			dataObject.setValue(IndetailPo.COLUMNS.OPTYPE.name(), indetailPo.getOptype()); 
			dataObject.setValue(IndetailPo.COLUMNS.ADJUSTQTY.name(), indetailPo.getAdjustqty()); 
			dataObject.setValue(IndetailPo.COLUMNS.INRMKS2.name(), indetailPo.getInrmks2()); 
			dataObject.setValue(IndetailPo.COLUMNS.INVOICE.name(), indetailPo.getInvoice()); 
			dataObject.setValue(IndetailPo.COLUMNS.INVNO.name(), indetailPo.getInvno()); 
			dataObject.setValue(IndetailPo.COLUMNS.DECLDATE.name(), indetailPo.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IndetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IndetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(IndetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(IndetailPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(IndetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(IndetailPo.COLUMNS.INPOST.name(), po.getInpost()); 
		return sqlWhere; 
	} 
 
} 
