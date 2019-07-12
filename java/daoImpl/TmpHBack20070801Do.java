package com.doc.common.dao.impl; 
 
public class TmpHBack20070801DAO extends GeneralDAOImpl<TmpHBack20070801Do> implements TmpHBack20070801DAO { 
	public static final TmpHBack20070801DAOImpl INSTANCE = new TmpHBack20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_BACK_20070801"; 

	public TmpHBack20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHBack20070801Do> CONVERTER = new MapConverter<TmpHBack20070801Do>() { 
 
		@Override 
		public TmpHBack20070801Do convert(final DataObject dataObject) { 
			final TmpHBack20070801Do tmpHBack20070801Do = new TmpHBack20070801Do(); 
			tmpHBack20070801Do.setBondno(dataObject.getString(TmpHBack20070801Do.COLUMNS.BONDNO.name())); 
			tmpHBack20070801Do.setRefbillno(dataObject.getString(TmpHBack20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHBack20070801Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.ITEM.name()))); 
			tmpHBack20070801Do.setPrdtno(dataObject.getString(TmpHBack20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHBack20070801Do.setRinqty(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.RINQTY.name()))); 
			tmpHBack20070801Do.setInunit(dataObject.getString(TmpHBack20070801Do.COLUMNS.INUNIT.name())); 
			tmpHBack20070801Do.setBalance(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.BALANCE.name()))); 
			tmpHBack20070801Do.setInpost(dataObject.getString(TmpHBack20070801Do.COLUMNS.INPOST.name())); 
			tmpHBack20070801Do.setIndate(dataObject.getString(TmpHBack20070801Do.COLUMNS.INDATE.name())); 
			tmpHBack20070801Do.setBatchno(dataObject.getString(TmpHBack20070801Do.COLUMNS.BATCHNO.name())); 
			tmpHBack20070801Do.setStockno(dataObject.getString(TmpHBack20070801Do.COLUMNS.STOCKNO.name())); 
			tmpHBack20070801Do.setDecltype(dataObject.getString(TmpHBack20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHBack20070801Do.setDeclno(dataObject.getString(TmpHBack20070801Do.COLUMNS.DECLNO.name())); 
			tmpHBack20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHBack20070801Do.setOtestno(dataObject.getString(TmpHBack20070801Do.COLUMNS.OTESTNO.name())); 
			tmpHBack20070801Do.setInstatus(dataObject.getString(TmpHBack20070801Do.COLUMNS.INSTATUS.name())); 
			tmpHBack20070801Do.setInrmks(dataObject.getString(TmpHBack20070801Do.COLUMNS.INRMKS.name())); 
			tmpHBack20070801Do.setConfirmdate(dataObject.getString(TmpHBack20070801Do.COLUMNS.CONFIRMDATE.name())); 
			tmpHBack20070801Do.setDescrip(dataObject.getString(TmpHBack20070801Do.COLUMNS.DESCRIP.name())); 
			tmpHBack20070801Do.setMonthno(dataObject.getString(TmpHBack20070801Do.COLUMNS.MONTHNO.name())); 
			tmpHBack20070801Do.setCcccode(dataObject.getString(TmpHBack20070801Do.COLUMNS.CCCCODE.name())); 
			tmpHBack20070801Do.setD8date(dataObject.getString(TmpHBack20070801Do.COLUMNS.D8DATE.name())); 
			tmpHBack20070801Do.setUserid(dataObject.getString(TmpHBack20070801Do.COLUMNS.USERID.name())); 
			tmpHBack20070801Do.setTradeprdtno(dataObject.getString(TmpHBack20070801Do.COLUMNS.TRADEPRDTNO.name())); 
			tmpHBack20070801Do.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.UNITPRICE.name()))); 
			tmpHBack20070801Do.setNwght(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.NWGHT.name()))); 
			tmpHBack20070801Do.setGross(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.GROSS.name()))); 
			tmpHBack20070801Do.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.VALUEAMT.name()))); 
			tmpHBack20070801Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.DUTYRATE.name()))); 
			tmpHBack20070801Do.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.COMDTAXRATE.name()))); 
			tmpHBack20070801Do.setMdeclno(dataObject.getString(TmpHBack20070801Do.COLUMNS.MDECLNO.name())); 
			tmpHBack20070801Do.setD8declno(dataObject.getString(TmpHBack20070801Do.COLUMNS.D8DECLNO.name())); 
			tmpHBack20070801Do.setOutstrno(dataObject.getString(TmpHBack20070801Do.COLUMNS.OUTSTRNO.name())); 
			tmpHBack20070801Do.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.DECLQTY.name()))); 
			tmpHBack20070801Do.setRlstime(dataObject.getString(TmpHBack20070801Do.COLUMNS.RLSTIME.name())); 
			tmpHBack20070801Do.setCountno(BigDecimalUtils.formObj(dataObject.getString(TmpHBack20070801Do.COLUMNS.COUNTNO.name()))); 
			tmpHBack20070801Do.setUpdtime(dataObject.getString(TmpHBack20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHBack20070801Do.setDecldate(dataObject.getString(TmpHBack20070801Do.COLUMNS.DECLDATE.name())); 
			return tmpHBack20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHBack20070801Do tmpHBack20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.BONDNO.name(), tmpHBack20070801Do.getBondno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.REFBILLNO.name(), tmpHBack20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.ITEM.name(), tmpHBack20070801Do.getItem()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.PRDTNO.name(), tmpHBack20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.RINQTY.name(), tmpHBack20070801Do.getRinqty()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.INUNIT.name(), tmpHBack20070801Do.getInunit()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.BALANCE.name(), tmpHBack20070801Do.getBalance()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.INPOST.name(), tmpHBack20070801Do.getInpost()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.INDATE.name(), tmpHBack20070801Do.getIndate()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.BATCHNO.name(), tmpHBack20070801Do.getBatchno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.STOCKNO.name(), tmpHBack20070801Do.getStockno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DECLTYPE.name(), tmpHBack20070801Do.getDecltype()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DECLNO.name(), tmpHBack20070801Do.getDeclno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.ITEMNO.name(), tmpHBack20070801Do.getItemno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.OTESTNO.name(), tmpHBack20070801Do.getOtestno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.INSTATUS.name(), tmpHBack20070801Do.getInstatus()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.INRMKS.name(), tmpHBack20070801Do.getInrmks()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.CONFIRMDATE.name(), tmpHBack20070801Do.getConfirmdate()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DESCRIP.name(), tmpHBack20070801Do.getDescrip()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.MONTHNO.name(), tmpHBack20070801Do.getMonthno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.CCCCODE.name(), tmpHBack20070801Do.getCcccode()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.D8DATE.name(), tmpHBack20070801Do.getD8date()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.USERID.name(), tmpHBack20070801Do.getUserid()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.TRADEPRDTNO.name(), tmpHBack20070801Do.getTradeprdtno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.UNITPRICE.name(), tmpHBack20070801Do.getUnitprice()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.NWGHT.name(), tmpHBack20070801Do.getNwght()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.GROSS.name(), tmpHBack20070801Do.getGross()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.VALUEAMT.name(), tmpHBack20070801Do.getValueamt()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DUTYRATE.name(), tmpHBack20070801Do.getDutyrate()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.COMDTAXRATE.name(), tmpHBack20070801Do.getComdtaxrate()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.MDECLNO.name(), tmpHBack20070801Do.getMdeclno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.D8DECLNO.name(), tmpHBack20070801Do.getD8declno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.OUTSTRNO.name(), tmpHBack20070801Do.getOutstrno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DECLQTY.name(), tmpHBack20070801Do.getDeclqty()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.RLSTIME.name(), tmpHBack20070801Do.getRlstime()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.COUNTNO.name(), tmpHBack20070801Do.getCountno()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.UPDTIME.name(), tmpHBack20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHBack20070801Do.COLUMNS.DECLDATE.name(), tmpHBack20070801Do.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHBack20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHBack20070801Do po) { 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.INUNIT.name(), po.getInunit()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.OTESTNO.name(), po.getOtestno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.INRMKS.name(), po.getInrmks()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.D8DATE.name(), po.getD8date()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.MDECLNO.name(), po.getMdeclno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.D8DECLNO.name(), po.getD8declno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
		sqlWhere.add(TmpHBack20070801Do.COLUMNS.DECLDATE.name(), po.getDecldate()); 
	} 
 
} 
