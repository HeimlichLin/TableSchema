package com.doc.common.dao.impl; 
 
public class TmpHIndetail20070801DAOImpl extends GeneralDAOImpl<TmpHIndetail20070801Do> implements TmpHIndetail20070801DAOImpl { 
	public static final TmpHIndetail20070801DAOImpl INSTANCE = new TmpHIndetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_INDETAIL_20070801"; 

	public TmpHIndetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHIndetail20070801Do> CONVERTER = new MapConverter<TmpHIndetail20070801Do>() { 
 
		@Override 
		public TmpHIndetail20070801Do convert(final DataObject dataObject) { 
			final TmpHIndetail20070801Do tmpHIndetail20070801Do = new TmpHIndetail20070801Do(); 
			tmpHIndetail20070801Do.setBondno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.BONDNO.name())); 
			tmpHIndetail20070801Do.setRefbillno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHIndetail20070801Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.ITEM.name()))); 
			tmpHIndetail20070801Do.setPrdtno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHIndetail20070801Do.setRinqty(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.RINQTY.name()))); 
			tmpHIndetail20070801Do.setInunit(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INUNIT.name())); 
			tmpHIndetail20070801Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.BALANCE.name()))); 
			tmpHIndetail20070801Do.setInpost(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INPOST.name())); 
			tmpHIndetail20070801Do.setIndate(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INDATE.name())); 
			tmpHIndetail20070801Do.setBatchno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.BATCHNO.name())); 
			tmpHIndetail20070801Do.setStockno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.STOCKNO.name())); 
			tmpHIndetail20070801Do.setDecltype(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHIndetail20070801Do.setDeclno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DECLNO.name())); 
			tmpHIndetail20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHIndetail20070801Do.setOtestno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.OTESTNO.name())); 
			tmpHIndetail20070801Do.setInstatus(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INSTATUS.name())); 
			tmpHIndetail20070801Do.setInrmks(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INRMKS.name())); 
			tmpHIndetail20070801Do.setConfirmdate(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.CONFIRMDATE.name())); 
			tmpHIndetail20070801Do.setDescrip(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DESCRIP.name())); 
			tmpHIndetail20070801Do.setMonthno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.MONTHNO.name())); 
			tmpHIndetail20070801Do.setCcccode(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.CCCCODE.name())); 
			tmpHIndetail20070801Do.setD8date(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.D8DATE.name())); 
			tmpHIndetail20070801Do.setUserid(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.USERID.name())); 
			tmpHIndetail20070801Do.setTradeprdtno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.TRADEPRDTNO.name())); 
			tmpHIndetail20070801Do.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.UNITPRICE.name()))); 
			tmpHIndetail20070801Do.setNwght(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.NWGHT.name()))); 
			tmpHIndetail20070801Do.setGross(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.GROSS.name()))); 
			tmpHIndetail20070801Do.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.VALUEAMT.name()))); 
			tmpHIndetail20070801Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DUTYRATE.name()))); 
			tmpHIndetail20070801Do.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.COMDTAXRATE.name()))); 
			tmpHIndetail20070801Do.setMdeclno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.MDECLNO.name())); 
			tmpHIndetail20070801Do.setD8declno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.D8DECLNO.name())); 
			tmpHIndetail20070801Do.setOutstrno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.OUTSTRNO.name())); 
			tmpHIndetail20070801Do.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DECLQTY.name()))); 
			tmpHIndetail20070801Do.setRlstime(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.RLSTIME.name())); 
			tmpHIndetail20070801Do.setCountno(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.COUNTNO.name()))); 
			tmpHIndetail20070801Do.setUpdtime(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHIndetail20070801Do.setOdeclno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.ODECLNO.name())); 
			tmpHIndetail20070801Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.OITEMNO.name()))); 
			tmpHIndetail20070801Do.setInrmks2(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INRMKS2.name())); 
			tmpHIndetail20070801Do.setInvoice(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INVOICE.name())); 
			tmpHIndetail20070801Do.setInvno(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.INVNO.name())); 
			tmpHIndetail20070801Do.setDecldate(dataObject.getString(TmpHIndetail20070801Do.COLUMNS.DECLDATE.name())); 
			return tmpHIndetail20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHIndetail20070801Do tmpHIndetail20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.BONDNO.name(), tmpHIndetail20070801Do.getBondno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.REFBILLNO.name(), tmpHIndetail20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.ITEM.name(), tmpHIndetail20070801Do.getItem()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.PRDTNO.name(), tmpHIndetail20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.RINQTY.name(), tmpHIndetail20070801Do.getRinqty()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INUNIT.name(), tmpHIndetail20070801Do.getInunit()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.BALANCE.name(), tmpHIndetail20070801Do.getBalance()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INPOST.name(), tmpHIndetail20070801Do.getInpost()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INDATE.name(), tmpHIndetail20070801Do.getIndate()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.BATCHNO.name(), tmpHIndetail20070801Do.getBatchno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.STOCKNO.name(), tmpHIndetail20070801Do.getStockno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DECLTYPE.name(), tmpHIndetail20070801Do.getDecltype()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DECLNO.name(), tmpHIndetail20070801Do.getDeclno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.ITEMNO.name(), tmpHIndetail20070801Do.getItemno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.OTESTNO.name(), tmpHIndetail20070801Do.getOtestno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INSTATUS.name(), tmpHIndetail20070801Do.getInstatus()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INRMKS.name(), tmpHIndetail20070801Do.getInrmks()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.CONFIRMDATE.name(), tmpHIndetail20070801Do.getConfirmdate()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DESCRIP.name(), tmpHIndetail20070801Do.getDescrip()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.MONTHNO.name(), tmpHIndetail20070801Do.getMonthno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.CCCCODE.name(), tmpHIndetail20070801Do.getCcccode()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.D8DATE.name(), tmpHIndetail20070801Do.getD8date()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.USERID.name(), tmpHIndetail20070801Do.getUserid()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.TRADEPRDTNO.name(), tmpHIndetail20070801Do.getTradeprdtno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.UNITPRICE.name(), tmpHIndetail20070801Do.getUnitprice()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.NWGHT.name(), tmpHIndetail20070801Do.getNwght()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.GROSS.name(), tmpHIndetail20070801Do.getGross()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.VALUEAMT.name(), tmpHIndetail20070801Do.getValueamt()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DUTYRATE.name(), tmpHIndetail20070801Do.getDutyrate()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.COMDTAXRATE.name(), tmpHIndetail20070801Do.getComdtaxrate()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.MDECLNO.name(), tmpHIndetail20070801Do.getMdeclno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.D8DECLNO.name(), tmpHIndetail20070801Do.getD8declno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.OUTSTRNO.name(), tmpHIndetail20070801Do.getOutstrno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DECLQTY.name(), tmpHIndetail20070801Do.getDeclqty()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.RLSTIME.name(), tmpHIndetail20070801Do.getRlstime()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.COUNTNO.name(), tmpHIndetail20070801Do.getCountno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.UPDTIME.name(), tmpHIndetail20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.ODECLNO.name(), tmpHIndetail20070801Do.getOdeclno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.OITEMNO.name(), tmpHIndetail20070801Do.getOitemno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INRMKS2.name(), tmpHIndetail20070801Do.getInrmks2()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INVOICE.name(), tmpHIndetail20070801Do.getInvoice()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.INVNO.name(), tmpHIndetail20070801Do.getInvno()); 
			dataObject.setValue(TmpHIndetail20070801Do.COLUMNS.DECLDATE.name(), tmpHIndetail20070801Do.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHIndetail20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHIndetail20070801Do po) { 
	} 
 
} 
