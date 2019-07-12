package com.doc.common.dao.impl; 
 
public class HBackDAOImpl extends GeneralDAOImpl<HBackDo> implements HBackDAOImpl { 
	public static final HBackDAOImpl INSTANCE = new HBackDAOImpl(); 
	public static final String TABLENAME = "H_BACK"; 

	public HBackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HBackDo> CONVERTER = new MapConverter<HBackDo>() { 
 
		@Override 
		public HBackDo convert(final DataObject dataObject) { 
			final HBackDo hBackDo = new HBackDo(); 
			hBackDo.setBondno(dataObject.getString(HBackDo.COLUMNS.BONDNO.name())); 
			hBackDo.setRefbillno(dataObject.getString(HBackDo.COLUMNS.REFBILLNO.name())); 
			hBackDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.ITEM.name()))); 
			hBackDo.setPrdtno(dataObject.getString(HBackDo.COLUMNS.PRDTNO.name())); 
			hBackDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.RINQTY.name()))); 
			hBackDo.setInunit(dataObject.getString(HBackDo.COLUMNS.INUNIT.name())); 
			hBackDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.BALANCE.name()))); 
			hBackDo.setInpost(dataObject.getString(HBackDo.COLUMNS.INPOST.name())); 
			hBackDo.setIndate(dataObject.getString(HBackDo.COLUMNS.INDATE.name())); 
			hBackDo.setBatchno(dataObject.getString(HBackDo.COLUMNS.BATCHNO.name())); 
			hBackDo.setStockno(dataObject.getString(HBackDo.COLUMNS.STOCKNO.name())); 
			hBackDo.setDecltype(dataObject.getString(HBackDo.COLUMNS.DECLTYPE.name())); 
			hBackDo.setDeclno(dataObject.getString(HBackDo.COLUMNS.DECLNO.name())); 
			hBackDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.ITEMNO.name()))); 
			hBackDo.setOtestno(dataObject.getString(HBackDo.COLUMNS.OTESTNO.name())); 
			hBackDo.setInstatus(dataObject.getString(HBackDo.COLUMNS.INSTATUS.name())); 
			hBackDo.setInrmks(dataObject.getString(HBackDo.COLUMNS.INRMKS.name())); 
			hBackDo.setConfirmdate(dataObject.getString(HBackDo.COLUMNS.CONFIRMDATE.name())); 
			hBackDo.setDescrip(dataObject.getString(HBackDo.COLUMNS.DESCRIP.name())); 
			hBackDo.setMonthno(dataObject.getString(HBackDo.COLUMNS.MONTHNO.name())); 
			hBackDo.setCcccode(dataObject.getString(HBackDo.COLUMNS.CCCCODE.name())); 
			hBackDo.setD8date(dataObject.getString(HBackDo.COLUMNS.D8DATE.name())); 
			hBackDo.setUserid(dataObject.getString(HBackDo.COLUMNS.USERID.name())); 
			hBackDo.setTradeprdtno(dataObject.getString(HBackDo.COLUMNS.TRADEPRDTNO.name())); 
			hBackDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.UNITPRICE.name()))); 
			hBackDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.NWGHT.name()))); 
			hBackDo.setGross(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.GROSS.name()))); 
			hBackDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.VALUEAMT.name()))); 
			hBackDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.DUTYRATE.name()))); 
			hBackDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.COMDTAXRATE.name()))); 
			hBackDo.setMdeclno(dataObject.getString(HBackDo.COLUMNS.MDECLNO.name())); 
			hBackDo.setD8declno(dataObject.getString(HBackDo.COLUMNS.D8DECLNO.name())); 
			hBackDo.setOutstrno(dataObject.getString(HBackDo.COLUMNS.OUTSTRNO.name())); 
			hBackDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.DECLQTY.name()))); 
			hBackDo.setRlstime(dataObject.getString(HBackDo.COLUMNS.RLSTIME.name())); 
			hBackDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(HBackDo.COLUMNS.COUNTNO.name()))); 
			hBackDo.setUpdtime(dataObject.getString(HBackDo.COLUMNS.UPDTIME.name())); 
			hBackDo.setDecldate(dataObject.getString(HBackDo.COLUMNS.DECLDATE.name())); 
			return hBackDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HBackDo hBackDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HBackDo.COLUMNS.BONDNO.name(), hBackDo.getBondno()); 
			dataObject.setValue(HBackDo.COLUMNS.REFBILLNO.name(), hBackDo.getRefbillno()); 
			dataObject.setValue(HBackDo.COLUMNS.ITEM.name(), hBackDo.getItem()); 
			dataObject.setValue(HBackDo.COLUMNS.PRDTNO.name(), hBackDo.getPrdtno()); 
			dataObject.setValue(HBackDo.COLUMNS.RINQTY.name(), hBackDo.getRinqty()); 
			dataObject.setValue(HBackDo.COLUMNS.INUNIT.name(), hBackDo.getInunit()); 
			dataObject.setValue(HBackDo.COLUMNS.BALANCE.name(), hBackDo.getBalance()); 
			dataObject.setValue(HBackDo.COLUMNS.INPOST.name(), hBackDo.getInpost()); 
			dataObject.setValue(HBackDo.COLUMNS.INDATE.name(), hBackDo.getIndate()); 
			dataObject.setValue(HBackDo.COLUMNS.BATCHNO.name(), hBackDo.getBatchno()); 
			dataObject.setValue(HBackDo.COLUMNS.STOCKNO.name(), hBackDo.getStockno()); 
			dataObject.setValue(HBackDo.COLUMNS.DECLTYPE.name(), hBackDo.getDecltype()); 
			dataObject.setValue(HBackDo.COLUMNS.DECLNO.name(), hBackDo.getDeclno()); 
			dataObject.setValue(HBackDo.COLUMNS.ITEMNO.name(), hBackDo.getItemno()); 
			dataObject.setValue(HBackDo.COLUMNS.OTESTNO.name(), hBackDo.getOtestno()); 
			dataObject.setValue(HBackDo.COLUMNS.INSTATUS.name(), hBackDo.getInstatus()); 
			dataObject.setValue(HBackDo.COLUMNS.INRMKS.name(), hBackDo.getInrmks()); 
			dataObject.setValue(HBackDo.COLUMNS.CONFIRMDATE.name(), hBackDo.getConfirmdate()); 
			dataObject.setValue(HBackDo.COLUMNS.DESCRIP.name(), hBackDo.getDescrip()); 
			dataObject.setValue(HBackDo.COLUMNS.MONTHNO.name(), hBackDo.getMonthno()); 
			dataObject.setValue(HBackDo.COLUMNS.CCCCODE.name(), hBackDo.getCcccode()); 
			dataObject.setValue(HBackDo.COLUMNS.D8DATE.name(), hBackDo.getD8date()); 
			dataObject.setValue(HBackDo.COLUMNS.USERID.name(), hBackDo.getUserid()); 
			dataObject.setValue(HBackDo.COLUMNS.TRADEPRDTNO.name(), hBackDo.getTradeprdtno()); 
			dataObject.setValue(HBackDo.COLUMNS.UNITPRICE.name(), hBackDo.getUnitprice()); 
			dataObject.setValue(HBackDo.COLUMNS.NWGHT.name(), hBackDo.getNwght()); 
			dataObject.setValue(HBackDo.COLUMNS.GROSS.name(), hBackDo.getGross()); 
			dataObject.setValue(HBackDo.COLUMNS.VALUEAMT.name(), hBackDo.getValueamt()); 
			dataObject.setValue(HBackDo.COLUMNS.DUTYRATE.name(), hBackDo.getDutyrate()); 
			dataObject.setValue(HBackDo.COLUMNS.COMDTAXRATE.name(), hBackDo.getComdtaxrate()); 
			dataObject.setValue(HBackDo.COLUMNS.MDECLNO.name(), hBackDo.getMdeclno()); 
			dataObject.setValue(HBackDo.COLUMNS.D8DECLNO.name(), hBackDo.getD8declno()); 
			dataObject.setValue(HBackDo.COLUMNS.OUTSTRNO.name(), hBackDo.getOutstrno()); 
			dataObject.setValue(HBackDo.COLUMNS.DECLQTY.name(), hBackDo.getDeclqty()); 
			dataObject.setValue(HBackDo.COLUMNS.RLSTIME.name(), hBackDo.getRlstime()); 
			dataObject.setValue(HBackDo.COLUMNS.COUNTNO.name(), hBackDo.getCountno()); 
			dataObject.setValue(HBackDo.COLUMNS.UPDTIME.name(), hBackDo.getUpdtime()); 
			dataObject.setValue(HBackDo.COLUMNS.DECLDATE.name(), hBackDo.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HBackDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HBackDo po) { 
		sqlWhere.add(HBackDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HBackDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HBackDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HBackDo.COLUMNS.INPOST.name(), po.getInpost()); 
	} 
 
} 
