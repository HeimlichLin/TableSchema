package com.doc.common.dao.impl; 
 
public class TmpIndetail2DAOImpl extends GeneralDAOImpl<TmpIndetail2Do> implements TmpIndetail2DAOImpl { 
	public static final TmpIndetail2DAOImpl INSTANCE = new TmpIndetail2DAOImpl(); 
	public static final String TABLENAME = "TMP_INDETAIL2"; 

	public TmpIndetail2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpIndetail2Do> CONVERTER = new MapConverter<TmpIndetail2Do>() { 
 
		@Override 
		public TmpIndetail2Do convert(final DataObject dataObject) { 
			final TmpIndetail2Do tmpIndetail2Do = new TmpIndetail2Do(); 
			tmpIndetail2Do.setBondno(dataObject.getString(TmpIndetail2Do.COLUMNS.BONDNO.name())); 
			tmpIndetail2Do.setRefbillno(dataObject.getString(TmpIndetail2Do.COLUMNS.REFBILLNO.name())); 
			tmpIndetail2Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.ITEM.name()))); 
			tmpIndetail2Do.setPrdtno(dataObject.getString(TmpIndetail2Do.COLUMNS.PRDTNO.name())); 
			tmpIndetail2Do.setRinqty(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.RINQTY.name()))); 
			tmpIndetail2Do.setInunit(dataObject.getString(TmpIndetail2Do.COLUMNS.INUNIT.name())); 
			tmpIndetail2Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.BALANCE.name()))); 
			tmpIndetail2Do.setInpost(dataObject.getString(TmpIndetail2Do.COLUMNS.INPOST.name())); 
			tmpIndetail2Do.setIndate(dataObject.getString(TmpIndetail2Do.COLUMNS.INDATE.name())); 
			tmpIndetail2Do.setBatchno(dataObject.getString(TmpIndetail2Do.COLUMNS.BATCHNO.name())); 
			tmpIndetail2Do.setStockno(dataObject.getString(TmpIndetail2Do.COLUMNS.STOCKNO.name())); 
			tmpIndetail2Do.setDecltype(dataObject.getString(TmpIndetail2Do.COLUMNS.DECLTYPE.name())); 
			tmpIndetail2Do.setDeclno(dataObject.getString(TmpIndetail2Do.COLUMNS.DECLNO.name())); 
			tmpIndetail2Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.ITEMNO.name()))); 
			tmpIndetail2Do.setOtestno(dataObject.getString(TmpIndetail2Do.COLUMNS.OTESTNO.name())); 
			tmpIndetail2Do.setInstatus(dataObject.getString(TmpIndetail2Do.COLUMNS.INSTATUS.name())); 
			tmpIndetail2Do.setInrmks(dataObject.getString(TmpIndetail2Do.COLUMNS.INRMKS.name())); 
			tmpIndetail2Do.setConfirmdate(dataObject.getString(TmpIndetail2Do.COLUMNS.CONFIRMDATE.name())); 
			tmpIndetail2Do.setDescrip(dataObject.getString(TmpIndetail2Do.COLUMNS.DESCRIP.name())); 
			tmpIndetail2Do.setMonthno(dataObject.getString(TmpIndetail2Do.COLUMNS.MONTHNO.name())); 
			tmpIndetail2Do.setCcccode(dataObject.getString(TmpIndetail2Do.COLUMNS.CCCCODE.name())); 
			tmpIndetail2Do.setD8date(dataObject.getString(TmpIndetail2Do.COLUMNS.D8DATE.name())); 
			tmpIndetail2Do.setUserid(dataObject.getString(TmpIndetail2Do.COLUMNS.USERID.name())); 
			tmpIndetail2Do.setTradeprdtno(dataObject.getString(TmpIndetail2Do.COLUMNS.TRADEPRDTNO.name())); 
			tmpIndetail2Do.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.UNITPRICE.name()))); 
			tmpIndetail2Do.setNwght(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.NWGHT.name()))); 
			tmpIndetail2Do.setGross(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.GROSS.name()))); 
			tmpIndetail2Do.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.VALUEAMT.name()))); 
			tmpIndetail2Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.DUTYRATE.name()))); 
			tmpIndetail2Do.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.COMDTAXRATE.name()))); 
			tmpIndetail2Do.setMdeclno(dataObject.getString(TmpIndetail2Do.COLUMNS.MDECLNO.name())); 
			tmpIndetail2Do.setD8declno(dataObject.getString(TmpIndetail2Do.COLUMNS.D8DECLNO.name())); 
			tmpIndetail2Do.setOutstrno(dataObject.getString(TmpIndetail2Do.COLUMNS.OUTSTRNO.name())); 
			tmpIndetail2Do.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.DECLQTY.name()))); 
			tmpIndetail2Do.setRlstime(dataObject.getString(TmpIndetail2Do.COLUMNS.RLSTIME.name())); 
			tmpIndetail2Do.setCountno(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.COUNTNO.name()))); 
			tmpIndetail2Do.setDutytype(dataObject.getString(TmpIndetail2Do.COLUMNS.DUTYTYPE.name())); 
			tmpIndetail2Do.setStatmode(dataObject.getString(TmpIndetail2Do.COLUMNS.STATMODE.name())); 
			tmpIndetail2Do.setOdeclno(dataObject.getString(TmpIndetail2Do.COLUMNS.ODECLNO.name())); 
			tmpIndetail2Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.OITEMNO.name()))); 
			tmpIndetail2Do.setOutstatus(dataObject.getString(TmpIndetail2Do.COLUMNS.OUTSTATUS.name())); 
			tmpIndetail2Do.setOptype(dataObject.getString(TmpIndetail2Do.COLUMNS.OPTYPE.name())); 
			tmpIndetail2Do.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(TmpIndetail2Do.COLUMNS.ADJUSTQTY.name()))); 
			return tmpIndetail2Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIndetail2Do tmpIndetail2Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.BONDNO.name(), tmpIndetail2Do.getBondno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.REFBILLNO.name(), tmpIndetail2Do.getRefbillno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.ITEM.name(), tmpIndetail2Do.getItem()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.PRDTNO.name(), tmpIndetail2Do.getPrdtno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.RINQTY.name(), tmpIndetail2Do.getRinqty()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.INUNIT.name(), tmpIndetail2Do.getInunit()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.BALANCE.name(), tmpIndetail2Do.getBalance()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.INPOST.name(), tmpIndetail2Do.getInpost()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.INDATE.name(), tmpIndetail2Do.getIndate()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.BATCHNO.name(), tmpIndetail2Do.getBatchno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.STOCKNO.name(), tmpIndetail2Do.getStockno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DECLTYPE.name(), tmpIndetail2Do.getDecltype()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DECLNO.name(), tmpIndetail2Do.getDeclno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.ITEMNO.name(), tmpIndetail2Do.getItemno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.OTESTNO.name(), tmpIndetail2Do.getOtestno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.INSTATUS.name(), tmpIndetail2Do.getInstatus()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.INRMKS.name(), tmpIndetail2Do.getInrmks()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.CONFIRMDATE.name(), tmpIndetail2Do.getConfirmdate()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DESCRIP.name(), tmpIndetail2Do.getDescrip()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.MONTHNO.name(), tmpIndetail2Do.getMonthno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.CCCCODE.name(), tmpIndetail2Do.getCcccode()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.D8DATE.name(), tmpIndetail2Do.getD8date()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.USERID.name(), tmpIndetail2Do.getUserid()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.TRADEPRDTNO.name(), tmpIndetail2Do.getTradeprdtno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.UNITPRICE.name(), tmpIndetail2Do.getUnitprice()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.NWGHT.name(), tmpIndetail2Do.getNwght()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.GROSS.name(), tmpIndetail2Do.getGross()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.VALUEAMT.name(), tmpIndetail2Do.getValueamt()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DUTYRATE.name(), tmpIndetail2Do.getDutyrate()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.COMDTAXRATE.name(), tmpIndetail2Do.getComdtaxrate()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.MDECLNO.name(), tmpIndetail2Do.getMdeclno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.D8DECLNO.name(), tmpIndetail2Do.getD8declno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.OUTSTRNO.name(), tmpIndetail2Do.getOutstrno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DECLQTY.name(), tmpIndetail2Do.getDeclqty()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.RLSTIME.name(), tmpIndetail2Do.getRlstime()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.COUNTNO.name(), tmpIndetail2Do.getCountno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.DUTYTYPE.name(), tmpIndetail2Do.getDutytype()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.STATMODE.name(), tmpIndetail2Do.getStatmode()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.ODECLNO.name(), tmpIndetail2Do.getOdeclno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.OITEMNO.name(), tmpIndetail2Do.getOitemno()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.OUTSTATUS.name(), tmpIndetail2Do.getOutstatus()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.OPTYPE.name(), tmpIndetail2Do.getOptype()); 
			dataObject.setValue(TmpIndetail2Do.COLUMNS.ADJUSTQTY.name(), tmpIndetail2Do.getAdjustqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIndetail2Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIndetail2Do po) { 
	} 
 
} 
