package com.doc.common.dao.impl; 
 
public class Anne0701IndetailDAOImpl extends GeneralDAOImpl<Anne0701IndetailPo> implements Anne0701IndetailDAO { 
	public static final Anne0701IndetailDAOImpl INSTANCE = new Anne0701IndetailDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_INDETAIL"; 

	public Anne0701IndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Anne0701IndetailPo> CONVERTER = new MapConverter<Anne0701IndetailPo>() { 
 
		@Override 
		public Anne0701IndetailPo convert(final DataObject dataObject) { 
			final Anne0701IndetailPo anne0701IndetailPo = new Anne0701IndetailPo(); 
			anne0701IndetailPo.setBondno(dataObject.getString(Anne0701IndetailPo.COLUMNS.BONDNO.name())); 
			anne0701IndetailPo.setRefbillno(dataObject.getString(Anne0701IndetailPo.COLUMNS.REFBILLNO.name())); 
			anne0701IndetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.ITEM.name()))); 
			anne0701IndetailPo.setPrdtno(dataObject.getString(Anne0701IndetailPo.COLUMNS.PRDTNO.name())); 
			anne0701IndetailPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.RINQTY.name()))); 
			anne0701IndetailPo.setInunit(dataObject.getString(Anne0701IndetailPo.COLUMNS.INUNIT.name())); 
			anne0701IndetailPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.BALANCE.name()))); 
			anne0701IndetailPo.setInpost(dataObject.getString(Anne0701IndetailPo.COLUMNS.INPOST.name())); 
			anne0701IndetailPo.setIndate(dataObject.getString(Anne0701IndetailPo.COLUMNS.INDATE.name())); 
			anne0701IndetailPo.setBatchno(dataObject.getString(Anne0701IndetailPo.COLUMNS.BATCHNO.name())); 
			anne0701IndetailPo.setStockno(dataObject.getString(Anne0701IndetailPo.COLUMNS.STOCKNO.name())); 
			anne0701IndetailPo.setDecltype(dataObject.getString(Anne0701IndetailPo.COLUMNS.DECLTYPE.name())); 
			anne0701IndetailPo.setDeclno(dataObject.getString(Anne0701IndetailPo.COLUMNS.DECLNO.name())); 
			anne0701IndetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.ITEMNO.name()))); 
			anne0701IndetailPo.setOtestno(dataObject.getString(Anne0701IndetailPo.COLUMNS.OTESTNO.name())); 
			anne0701IndetailPo.setInstatus(dataObject.getString(Anne0701IndetailPo.COLUMNS.INSTATUS.name())); 
			anne0701IndetailPo.setInrmks(dataObject.getString(Anne0701IndetailPo.COLUMNS.INRMKS.name())); 
			anne0701IndetailPo.setConfirmdate(dataObject.getString(Anne0701IndetailPo.COLUMNS.CONFIRMDATE.name())); 
			anne0701IndetailPo.setDescrip(dataObject.getString(Anne0701IndetailPo.COLUMNS.DESCRIP.name())); 
			anne0701IndetailPo.setMonthno(dataObject.getString(Anne0701IndetailPo.COLUMNS.MONTHNO.name())); 
			anne0701IndetailPo.setCcccode(dataObject.getString(Anne0701IndetailPo.COLUMNS.CCCCODE.name())); 
			anne0701IndetailPo.setD8date(dataObject.getString(Anne0701IndetailPo.COLUMNS.D8DATE.name())); 
			anne0701IndetailPo.setUserid(dataObject.getString(Anne0701IndetailPo.COLUMNS.USERID.name())); 
			anne0701IndetailPo.setTradeprdtno(dataObject.getString(Anne0701IndetailPo.COLUMNS.TRADEPRDTNO.name())); 
			anne0701IndetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.UNITPRICE.name()))); 
			anne0701IndetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.NWGHT.name()))); 
			anne0701IndetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.GROSS.name()))); 
			anne0701IndetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.VALUEAMT.name()))); 
			anne0701IndetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.DUTYRATE.name()))); 
			anne0701IndetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.COMDTAXRATE.name()))); 
			anne0701IndetailPo.setMdeclno(dataObject.getString(Anne0701IndetailPo.COLUMNS.MDECLNO.name())); 
			anne0701IndetailPo.setD8declno(dataObject.getString(Anne0701IndetailPo.COLUMNS.D8DECLNO.name())); 
			anne0701IndetailPo.setOutstrno(dataObject.getString(Anne0701IndetailPo.COLUMNS.OUTSTRNO.name())); 
			anne0701IndetailPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.DECLQTY.name()))); 
			anne0701IndetailPo.setRlstime(dataObject.getString(Anne0701IndetailPo.COLUMNS.RLSTIME.name())); 
			anne0701IndetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.COUNTNO.name()))); 
			anne0701IndetailPo.setDutytype(dataObject.getString(Anne0701IndetailPo.COLUMNS.DUTYTYPE.name())); 
			anne0701IndetailPo.setStatmode(dataObject.getString(Anne0701IndetailPo.COLUMNS.STATMODE.name())); 
			anne0701IndetailPo.setOdeclno(dataObject.getString(Anne0701IndetailPo.COLUMNS.ODECLNO.name())); 
			anne0701IndetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.OITEMNO.name()))); 
			anne0701IndetailPo.setOutstatus(dataObject.getString(Anne0701IndetailPo.COLUMNS.OUTSTATUS.name())); 
			anne0701IndetailPo.setOptype(dataObject.getString(Anne0701IndetailPo.COLUMNS.OPTYPE.name())); 
			anne0701IndetailPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(Anne0701IndetailPo.COLUMNS.ADJUSTQTY.name()))); 
			return anne0701IndetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701IndetailPo anne0701IndetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.BONDNO.name(), anne0701IndetailPo.getBondno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.REFBILLNO.name(), anne0701IndetailPo.getRefbillno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.ITEM.name(), anne0701IndetailPo.getItem()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.PRDTNO.name(), anne0701IndetailPo.getPrdtno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.RINQTY.name(), anne0701IndetailPo.getRinqty()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.INUNIT.name(), anne0701IndetailPo.getInunit()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.BALANCE.name(), anne0701IndetailPo.getBalance()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.INPOST.name(), anne0701IndetailPo.getInpost()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.INDATE.name(), anne0701IndetailPo.getIndate()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.BATCHNO.name(), anne0701IndetailPo.getBatchno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.STOCKNO.name(), anne0701IndetailPo.getStockno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DECLTYPE.name(), anne0701IndetailPo.getDecltype()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DECLNO.name(), anne0701IndetailPo.getDeclno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.ITEMNO.name(), anne0701IndetailPo.getItemno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.OTESTNO.name(), anne0701IndetailPo.getOtestno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.INSTATUS.name(), anne0701IndetailPo.getInstatus()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.INRMKS.name(), anne0701IndetailPo.getInrmks()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.CONFIRMDATE.name(), anne0701IndetailPo.getConfirmdate()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DESCRIP.name(), anne0701IndetailPo.getDescrip()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.MONTHNO.name(), anne0701IndetailPo.getMonthno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.CCCCODE.name(), anne0701IndetailPo.getCcccode()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.D8DATE.name(), anne0701IndetailPo.getD8date()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.USERID.name(), anne0701IndetailPo.getUserid()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.TRADEPRDTNO.name(), anne0701IndetailPo.getTradeprdtno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.UNITPRICE.name(), anne0701IndetailPo.getUnitprice()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.NWGHT.name(), anne0701IndetailPo.getNwght()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.GROSS.name(), anne0701IndetailPo.getGross()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.VALUEAMT.name(), anne0701IndetailPo.getValueamt()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DUTYRATE.name(), anne0701IndetailPo.getDutyrate()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.COMDTAXRATE.name(), anne0701IndetailPo.getComdtaxrate()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.MDECLNO.name(), anne0701IndetailPo.getMdeclno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.D8DECLNO.name(), anne0701IndetailPo.getD8declno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.OUTSTRNO.name(), anne0701IndetailPo.getOutstrno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DECLQTY.name(), anne0701IndetailPo.getDeclqty()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.RLSTIME.name(), anne0701IndetailPo.getRlstime()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.COUNTNO.name(), anne0701IndetailPo.getCountno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.DUTYTYPE.name(), anne0701IndetailPo.getDutytype()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.STATMODE.name(), anne0701IndetailPo.getStatmode()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.ODECLNO.name(), anne0701IndetailPo.getOdeclno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.OITEMNO.name(), anne0701IndetailPo.getOitemno()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.OUTSTATUS.name(), anne0701IndetailPo.getOutstatus()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.OPTYPE.name(), anne0701IndetailPo.getOptype()); 
			dataObject.setValue(Anne0701IndetailPo.COLUMNS.ADJUSTQTY.name(), anne0701IndetailPo.getAdjustqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701IndetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701IndetailPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
