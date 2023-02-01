package com.doc.common.dao.impl; 
 
public class TmpIndetail2DAOImpl extends GeneralDAOImpl<TmpIndetail2Po> implements TmpIndetail2DAO { 
	public static final TmpIndetail2DAOImpl INSTANCE = new TmpIndetail2DAOImpl(); 
	public static final String TABLENAME = "TMP_INDETAIL2"; 

	public TmpIndetail2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpIndetail2Po> CONVERTER = new MapConverter<TmpIndetail2Po>() { 
 
		@Override 
		public TmpIndetail2Po convert(final DataObject dataObject) { 
			final TmpIndetail2Po tmpIndetail2Po = new TmpIndetail2Po(); 
			tmpIndetail2Po.setBondno(dataObject.getString(TmpIndetail2Po.COLUMNS.BONDNO.name())); 
			tmpIndetail2Po.setRefbillno(dataObject.getString(TmpIndetail2Po.COLUMNS.REFBILLNO.name())); 
			tmpIndetail2Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.ITEM.name()))); 
			tmpIndetail2Po.setPrdtno(dataObject.getString(TmpIndetail2Po.COLUMNS.PRDTNO.name())); 
			tmpIndetail2Po.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.RINQTY.name()))); 
			tmpIndetail2Po.setInunit(dataObject.getString(TmpIndetail2Po.COLUMNS.INUNIT.name())); 
			tmpIndetail2Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.BALANCE.name()))); 
			tmpIndetail2Po.setInpost(dataObject.getString(TmpIndetail2Po.COLUMNS.INPOST.name())); 
			tmpIndetail2Po.setIndate(dataObject.getString(TmpIndetail2Po.COLUMNS.INDATE.name())); 
			tmpIndetail2Po.setBatchno(dataObject.getString(TmpIndetail2Po.COLUMNS.BATCHNO.name())); 
			tmpIndetail2Po.setStockno(dataObject.getString(TmpIndetail2Po.COLUMNS.STOCKNO.name())); 
			tmpIndetail2Po.setDecltype(dataObject.getString(TmpIndetail2Po.COLUMNS.DECLTYPE.name())); 
			tmpIndetail2Po.setDeclno(dataObject.getString(TmpIndetail2Po.COLUMNS.DECLNO.name())); 
			tmpIndetail2Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.ITEMNO.name()))); 
			tmpIndetail2Po.setOtestno(dataObject.getString(TmpIndetail2Po.COLUMNS.OTESTNO.name())); 
			tmpIndetail2Po.setInstatus(dataObject.getString(TmpIndetail2Po.COLUMNS.INSTATUS.name())); 
			tmpIndetail2Po.setInrmks(dataObject.getString(TmpIndetail2Po.COLUMNS.INRMKS.name())); 
			tmpIndetail2Po.setConfirmdate(dataObject.getString(TmpIndetail2Po.COLUMNS.CONFIRMDATE.name())); 
			tmpIndetail2Po.setDescrip(dataObject.getString(TmpIndetail2Po.COLUMNS.DESCRIP.name())); 
			tmpIndetail2Po.setMonthno(dataObject.getString(TmpIndetail2Po.COLUMNS.MONTHNO.name())); 
			tmpIndetail2Po.setCcccode(dataObject.getString(TmpIndetail2Po.COLUMNS.CCCCODE.name())); 
			tmpIndetail2Po.setD8date(dataObject.getString(TmpIndetail2Po.COLUMNS.D8DATE.name())); 
			tmpIndetail2Po.setUserid(dataObject.getString(TmpIndetail2Po.COLUMNS.USERID.name())); 
			tmpIndetail2Po.setTradeprdtno(dataObject.getString(TmpIndetail2Po.COLUMNS.TRADEPRDTNO.name())); 
			tmpIndetail2Po.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.UNITPRICE.name()))); 
			tmpIndetail2Po.setNwght(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.NWGHT.name()))); 
			tmpIndetail2Po.setGross(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.GROSS.name()))); 
			tmpIndetail2Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.VALUEAMT.name()))); 
			tmpIndetail2Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.DUTYRATE.name()))); 
			tmpIndetail2Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.COMDTAXRATE.name()))); 
			tmpIndetail2Po.setMdeclno(dataObject.getString(TmpIndetail2Po.COLUMNS.MDECLNO.name())); 
			tmpIndetail2Po.setD8declno(dataObject.getString(TmpIndetail2Po.COLUMNS.D8DECLNO.name())); 
			tmpIndetail2Po.setOutstrno(dataObject.getString(TmpIndetail2Po.COLUMNS.OUTSTRNO.name())); 
			tmpIndetail2Po.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.DECLQTY.name()))); 
			tmpIndetail2Po.setRlstime(dataObject.getString(TmpIndetail2Po.COLUMNS.RLSTIME.name())); 
			tmpIndetail2Po.setCountno(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.COUNTNO.name()))); 
			tmpIndetail2Po.setDutytype(dataObject.getString(TmpIndetail2Po.COLUMNS.DUTYTYPE.name())); 
			tmpIndetail2Po.setStatmode(dataObject.getString(TmpIndetail2Po.COLUMNS.STATMODE.name())); 
			tmpIndetail2Po.setOdeclno(dataObject.getString(TmpIndetail2Po.COLUMNS.ODECLNO.name())); 
			tmpIndetail2Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.OITEMNO.name()))); 
			tmpIndetail2Po.setOutstatus(dataObject.getString(TmpIndetail2Po.COLUMNS.OUTSTATUS.name())); 
			tmpIndetail2Po.setOptype(dataObject.getString(TmpIndetail2Po.COLUMNS.OPTYPE.name())); 
			tmpIndetail2Po.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(TmpIndetail2Po.COLUMNS.ADJUSTQTY.name()))); 
			return tmpIndetail2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpIndetail2Po tmpIndetail2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.BONDNO.name(), tmpIndetail2Po.getBondno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.REFBILLNO.name(), tmpIndetail2Po.getRefbillno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.ITEM.name(), tmpIndetail2Po.getItem()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.PRDTNO.name(), tmpIndetail2Po.getPrdtno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.RINQTY.name(), tmpIndetail2Po.getRinqty()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.INUNIT.name(), tmpIndetail2Po.getInunit()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.BALANCE.name(), tmpIndetail2Po.getBalance()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.INPOST.name(), tmpIndetail2Po.getInpost()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.INDATE.name(), tmpIndetail2Po.getIndate()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.BATCHNO.name(), tmpIndetail2Po.getBatchno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.STOCKNO.name(), tmpIndetail2Po.getStockno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DECLTYPE.name(), tmpIndetail2Po.getDecltype()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DECLNO.name(), tmpIndetail2Po.getDeclno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.ITEMNO.name(), tmpIndetail2Po.getItemno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.OTESTNO.name(), tmpIndetail2Po.getOtestno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.INSTATUS.name(), tmpIndetail2Po.getInstatus()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.INRMKS.name(), tmpIndetail2Po.getInrmks()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.CONFIRMDATE.name(), tmpIndetail2Po.getConfirmdate()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DESCRIP.name(), tmpIndetail2Po.getDescrip()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.MONTHNO.name(), tmpIndetail2Po.getMonthno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.CCCCODE.name(), tmpIndetail2Po.getCcccode()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.D8DATE.name(), tmpIndetail2Po.getD8date()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.USERID.name(), tmpIndetail2Po.getUserid()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.TRADEPRDTNO.name(), tmpIndetail2Po.getTradeprdtno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.UNITPRICE.name(), tmpIndetail2Po.getUnitprice()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.NWGHT.name(), tmpIndetail2Po.getNwght()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.GROSS.name(), tmpIndetail2Po.getGross()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.VALUEAMT.name(), tmpIndetail2Po.getValueamt()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DUTYRATE.name(), tmpIndetail2Po.getDutyrate()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.COMDTAXRATE.name(), tmpIndetail2Po.getComdtaxrate()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.MDECLNO.name(), tmpIndetail2Po.getMdeclno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.D8DECLNO.name(), tmpIndetail2Po.getD8declno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.OUTSTRNO.name(), tmpIndetail2Po.getOutstrno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DECLQTY.name(), tmpIndetail2Po.getDeclqty()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.RLSTIME.name(), tmpIndetail2Po.getRlstime()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.COUNTNO.name(), tmpIndetail2Po.getCountno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.DUTYTYPE.name(), tmpIndetail2Po.getDutytype()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.STATMODE.name(), tmpIndetail2Po.getStatmode()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.ODECLNO.name(), tmpIndetail2Po.getOdeclno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.OITEMNO.name(), tmpIndetail2Po.getOitemno()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.OUTSTATUS.name(), tmpIndetail2Po.getOutstatus()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.OPTYPE.name(), tmpIndetail2Po.getOptype()); 
			dataObject.setValue(TmpIndetail2Po.COLUMNS.ADJUSTQTY.name(), tmpIndetail2Po.getAdjustqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpIndetail2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpIndetail2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
