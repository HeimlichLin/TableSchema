package com.doc.common.dao.impl; 
 
public class TmpHBack20070801DAOImpl extends GeneralDAOImpl<TmpHBack20070801Po> implements TmpHBack20070801DAO { 
	public static final TmpHBack20070801DAOImpl INSTANCE = new TmpHBack20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_BACK_20070801"; 

	public TmpHBack20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHBack20070801Po> CONVERTER = new MapConverter<TmpHBack20070801Po>() { 
 
		@Override 
		public TmpHBack20070801Po convert(final DataObject dataObject) { 
			final TmpHBack20070801Po tmpHBack20070801Po = new TmpHBack20070801Po(); 
			tmpHBack20070801Po.setBondno(dataObject.getString(TmpHBack20070801Po.COLUMNS.BONDNO.name())); 
			tmpHBack20070801Po.setRefbillno(dataObject.getString(TmpHBack20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHBack20070801Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.ITEM.name()))); 
			tmpHBack20070801Po.setPrdtno(dataObject.getString(TmpHBack20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHBack20070801Po.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.RINQTY.name()))); 
			tmpHBack20070801Po.setInunit(dataObject.getString(TmpHBack20070801Po.COLUMNS.INUNIT.name())); 
			tmpHBack20070801Po.setBalance(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.BALANCE.name()))); 
			tmpHBack20070801Po.setInpost(dataObject.getString(TmpHBack20070801Po.COLUMNS.INPOST.name())); 
			tmpHBack20070801Po.setIndate(dataObject.getString(TmpHBack20070801Po.COLUMNS.INDATE.name())); 
			tmpHBack20070801Po.setBatchno(dataObject.getString(TmpHBack20070801Po.COLUMNS.BATCHNO.name())); 
			tmpHBack20070801Po.setStockno(dataObject.getString(TmpHBack20070801Po.COLUMNS.STOCKNO.name())); 
			tmpHBack20070801Po.setDecltype(dataObject.getString(TmpHBack20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHBack20070801Po.setDeclno(dataObject.getString(TmpHBack20070801Po.COLUMNS.DECLNO.name())); 
			tmpHBack20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHBack20070801Po.setOtestno(dataObject.getString(TmpHBack20070801Po.COLUMNS.OTESTNO.name())); 
			tmpHBack20070801Po.setInstatus(dataObject.getString(TmpHBack20070801Po.COLUMNS.INSTATUS.name())); 
			tmpHBack20070801Po.setInrmks(dataObject.getString(TmpHBack20070801Po.COLUMNS.INRMKS.name())); 
			tmpHBack20070801Po.setConfirmdate(dataObject.getString(TmpHBack20070801Po.COLUMNS.CONFIRMDATE.name())); 
			tmpHBack20070801Po.setDescrip(dataObject.getString(TmpHBack20070801Po.COLUMNS.DESCRIP.name())); 
			tmpHBack20070801Po.setMonthno(dataObject.getString(TmpHBack20070801Po.COLUMNS.MONTHNO.name())); 
			tmpHBack20070801Po.setCcccode(dataObject.getString(TmpHBack20070801Po.COLUMNS.CCCCODE.name())); 
			tmpHBack20070801Po.setD8date(dataObject.getString(TmpHBack20070801Po.COLUMNS.D8DATE.name())); 
			tmpHBack20070801Po.setUserid(dataObject.getString(TmpHBack20070801Po.COLUMNS.USERID.name())); 
			tmpHBack20070801Po.setTradeprdtno(dataObject.getString(TmpHBack20070801Po.COLUMNS.TRADEPRDTNO.name())); 
			tmpHBack20070801Po.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.UNITPRICE.name()))); 
			tmpHBack20070801Po.setNwght(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.NWGHT.name()))); 
			tmpHBack20070801Po.setGross(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.GROSS.name()))); 
			tmpHBack20070801Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.VALUEAMT.name()))); 
			tmpHBack20070801Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.DUTYRATE.name()))); 
			tmpHBack20070801Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.COMDTAXRATE.name()))); 
			tmpHBack20070801Po.setMdeclno(dataObject.getString(TmpHBack20070801Po.COLUMNS.MDECLNO.name())); 
			tmpHBack20070801Po.setD8declno(dataObject.getString(TmpHBack20070801Po.COLUMNS.D8DECLNO.name())); 
			tmpHBack20070801Po.setOutstrno(dataObject.getString(TmpHBack20070801Po.COLUMNS.OUTSTRNO.name())); 
			tmpHBack20070801Po.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.DECLQTY.name()))); 
			tmpHBack20070801Po.setRlstime(dataObject.getString(TmpHBack20070801Po.COLUMNS.RLSTIME.name())); 
			tmpHBack20070801Po.setCountno(BigDecimalUtils.formObj(dataObject.getValue(TmpHBack20070801Po.COLUMNS.COUNTNO.name()))); 
			tmpHBack20070801Po.setUpdtime(dataObject.getString(TmpHBack20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHBack20070801Po.setDecldate(dataObject.getString(TmpHBack20070801Po.COLUMNS.DECLDATE.name())); 
			return tmpHBack20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHBack20070801Po tmpHBack20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.BONDNO.name(), tmpHBack20070801Po.getBondno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.REFBILLNO.name(), tmpHBack20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.ITEM.name(), tmpHBack20070801Po.getItem()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.PRDTNO.name(), tmpHBack20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.RINQTY.name(), tmpHBack20070801Po.getRinqty()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.INUNIT.name(), tmpHBack20070801Po.getInunit()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.BALANCE.name(), tmpHBack20070801Po.getBalance()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.INPOST.name(), tmpHBack20070801Po.getInpost()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.INDATE.name(), tmpHBack20070801Po.getIndate()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.BATCHNO.name(), tmpHBack20070801Po.getBatchno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.STOCKNO.name(), tmpHBack20070801Po.getStockno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DECLTYPE.name(), tmpHBack20070801Po.getDecltype()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DECLNO.name(), tmpHBack20070801Po.getDeclno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.ITEMNO.name(), tmpHBack20070801Po.getItemno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.OTESTNO.name(), tmpHBack20070801Po.getOtestno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.INSTATUS.name(), tmpHBack20070801Po.getInstatus()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.INRMKS.name(), tmpHBack20070801Po.getInrmks()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.CONFIRMDATE.name(), tmpHBack20070801Po.getConfirmdate()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DESCRIP.name(), tmpHBack20070801Po.getDescrip()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.MONTHNO.name(), tmpHBack20070801Po.getMonthno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.CCCCODE.name(), tmpHBack20070801Po.getCcccode()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.D8DATE.name(), tmpHBack20070801Po.getD8date()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.USERID.name(), tmpHBack20070801Po.getUserid()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.TRADEPRDTNO.name(), tmpHBack20070801Po.getTradeprdtno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.UNITPRICE.name(), tmpHBack20070801Po.getUnitprice()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.NWGHT.name(), tmpHBack20070801Po.getNwght()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.GROSS.name(), tmpHBack20070801Po.getGross()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.VALUEAMT.name(), tmpHBack20070801Po.getValueamt()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DUTYRATE.name(), tmpHBack20070801Po.getDutyrate()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.COMDTAXRATE.name(), tmpHBack20070801Po.getComdtaxrate()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.MDECLNO.name(), tmpHBack20070801Po.getMdeclno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.D8DECLNO.name(), tmpHBack20070801Po.getD8declno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.OUTSTRNO.name(), tmpHBack20070801Po.getOutstrno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DECLQTY.name(), tmpHBack20070801Po.getDeclqty()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.RLSTIME.name(), tmpHBack20070801Po.getRlstime()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.COUNTNO.name(), tmpHBack20070801Po.getCountno()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.UPDTIME.name(), tmpHBack20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHBack20070801Po.COLUMNS.DECLDATE.name(), tmpHBack20070801Po.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHBack20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHBack20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
