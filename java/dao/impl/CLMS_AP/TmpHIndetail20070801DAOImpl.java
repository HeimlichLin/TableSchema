package com.doc.common.dao.impl; 
 
public class TmpHIndetail20070801DAOImpl extends GeneralDAOImpl<TmpHIndetail20070801Po> implements TmpHIndetail20070801DAO { 
	public static final TmpHIndetail20070801DAOImpl INSTANCE = new TmpHIndetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_INDETAIL_20070801"; 

	public TmpHIndetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHIndetail20070801Po> CONVERTER = new MapConverter<TmpHIndetail20070801Po>() { 
 
		@Override 
		public TmpHIndetail20070801Po convert(final DataObject dataObject) { 
			final TmpHIndetail20070801Po tmpHIndetail20070801Po = new TmpHIndetail20070801Po(); 
			tmpHIndetail20070801Po.setBondno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.BONDNO.name())); 
			tmpHIndetail20070801Po.setRefbillno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHIndetail20070801Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.ITEM.name()))); 
			tmpHIndetail20070801Po.setPrdtno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHIndetail20070801Po.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.RINQTY.name()))); 
			tmpHIndetail20070801Po.setInunit(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INUNIT.name())); 
			tmpHIndetail20070801Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.BALANCE.name()))); 
			tmpHIndetail20070801Po.setInpost(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INPOST.name())); 
			tmpHIndetail20070801Po.setIndate(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INDATE.name())); 
			tmpHIndetail20070801Po.setBatchno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.BATCHNO.name())); 
			tmpHIndetail20070801Po.setStockno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.STOCKNO.name())); 
			tmpHIndetail20070801Po.setDecltype(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHIndetail20070801Po.setDeclno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.DECLNO.name())); 
			tmpHIndetail20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHIndetail20070801Po.setOtestno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.OTESTNO.name())); 
			tmpHIndetail20070801Po.setInstatus(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INSTATUS.name())); 
			tmpHIndetail20070801Po.setInrmks(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INRMKS.name())); 
			tmpHIndetail20070801Po.setConfirmdate(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.CONFIRMDATE.name())); 
			tmpHIndetail20070801Po.setDescrip(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.DESCRIP.name())); 
			tmpHIndetail20070801Po.setMonthno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.MONTHNO.name())); 
			tmpHIndetail20070801Po.setCcccode(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.CCCCODE.name())); 
			tmpHIndetail20070801Po.setD8date(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.D8DATE.name())); 
			tmpHIndetail20070801Po.setUserid(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.USERID.name())); 
			tmpHIndetail20070801Po.setTradeprdtno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.TRADEPRDTNO.name())); 
			tmpHIndetail20070801Po.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.UNITPRICE.name()))); 
			tmpHIndetail20070801Po.setNwght(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.NWGHT.name()))); 
			tmpHIndetail20070801Po.setGross(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.GROSS.name()))); 
			tmpHIndetail20070801Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.VALUEAMT.name()))); 
			tmpHIndetail20070801Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.DUTYRATE.name()))); 
			tmpHIndetail20070801Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.COMDTAXRATE.name()))); 
			tmpHIndetail20070801Po.setMdeclno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.MDECLNO.name())); 
			tmpHIndetail20070801Po.setD8declno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.D8DECLNO.name())); 
			tmpHIndetail20070801Po.setOutstrno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.OUTSTRNO.name())); 
			tmpHIndetail20070801Po.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.DECLQTY.name()))); 
			tmpHIndetail20070801Po.setRlstime(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.RLSTIME.name())); 
			tmpHIndetail20070801Po.setCountno(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.COUNTNO.name()))); 
			tmpHIndetail20070801Po.setUpdtime(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHIndetail20070801Po.setOdeclno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.ODECLNO.name())); 
			tmpHIndetail20070801Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHIndetail20070801Po.COLUMNS.OITEMNO.name()))); 
			tmpHIndetail20070801Po.setInrmks2(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INRMKS2.name())); 
			tmpHIndetail20070801Po.setInvoice(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INVOICE.name())); 
			tmpHIndetail20070801Po.setInvno(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.INVNO.name())); 
			tmpHIndetail20070801Po.setDecldate(dataObject.getString(TmpHIndetail20070801Po.COLUMNS.DECLDATE.name())); 
			return tmpHIndetail20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHIndetail20070801Po tmpHIndetail20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.BONDNO.name(), tmpHIndetail20070801Po.getBondno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.REFBILLNO.name(), tmpHIndetail20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.ITEM.name(), tmpHIndetail20070801Po.getItem()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.PRDTNO.name(), tmpHIndetail20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.RINQTY.name(), tmpHIndetail20070801Po.getRinqty()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INUNIT.name(), tmpHIndetail20070801Po.getInunit()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.BALANCE.name(), tmpHIndetail20070801Po.getBalance()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INPOST.name(), tmpHIndetail20070801Po.getInpost()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INDATE.name(), tmpHIndetail20070801Po.getIndate()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.BATCHNO.name(), tmpHIndetail20070801Po.getBatchno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.STOCKNO.name(), tmpHIndetail20070801Po.getStockno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DECLTYPE.name(), tmpHIndetail20070801Po.getDecltype()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DECLNO.name(), tmpHIndetail20070801Po.getDeclno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.ITEMNO.name(), tmpHIndetail20070801Po.getItemno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.OTESTNO.name(), tmpHIndetail20070801Po.getOtestno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INSTATUS.name(), tmpHIndetail20070801Po.getInstatus()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INRMKS.name(), tmpHIndetail20070801Po.getInrmks()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.CONFIRMDATE.name(), tmpHIndetail20070801Po.getConfirmdate()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DESCRIP.name(), tmpHIndetail20070801Po.getDescrip()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.MONTHNO.name(), tmpHIndetail20070801Po.getMonthno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.CCCCODE.name(), tmpHIndetail20070801Po.getCcccode()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.D8DATE.name(), tmpHIndetail20070801Po.getD8date()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.USERID.name(), tmpHIndetail20070801Po.getUserid()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.TRADEPRDTNO.name(), tmpHIndetail20070801Po.getTradeprdtno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.UNITPRICE.name(), tmpHIndetail20070801Po.getUnitprice()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.NWGHT.name(), tmpHIndetail20070801Po.getNwght()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.GROSS.name(), tmpHIndetail20070801Po.getGross()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.VALUEAMT.name(), tmpHIndetail20070801Po.getValueamt()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DUTYRATE.name(), tmpHIndetail20070801Po.getDutyrate()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.COMDTAXRATE.name(), tmpHIndetail20070801Po.getComdtaxrate()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.MDECLNO.name(), tmpHIndetail20070801Po.getMdeclno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.D8DECLNO.name(), tmpHIndetail20070801Po.getD8declno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.OUTSTRNO.name(), tmpHIndetail20070801Po.getOutstrno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DECLQTY.name(), tmpHIndetail20070801Po.getDeclqty()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.RLSTIME.name(), tmpHIndetail20070801Po.getRlstime()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.COUNTNO.name(), tmpHIndetail20070801Po.getCountno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.UPDTIME.name(), tmpHIndetail20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.ODECLNO.name(), tmpHIndetail20070801Po.getOdeclno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.OITEMNO.name(), tmpHIndetail20070801Po.getOitemno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INRMKS2.name(), tmpHIndetail20070801Po.getInrmks2()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INVOICE.name(), tmpHIndetail20070801Po.getInvoice()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.INVNO.name(), tmpHIndetail20070801Po.getInvno()); 
			dataObject.setValue(TmpHIndetail20070801Po.COLUMNS.DECLDATE.name(), tmpHIndetail20070801Po.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHIndetail20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHIndetail20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
