package com.doc.common.dao.impl; 
 
public class HBackDAOImpl extends GeneralDAOImpl<HBackPo> implements HBackDAO { 
	public static final HBackDAOImpl INSTANCE = new HBackDAOImpl(); 
	public static final String TABLENAME = "H_BACK"; 

	public HBackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HBackPo> CONVERTER = new MapConverter<HBackPo>() { 
 
		@Override 
		public HBackPo convert(final DataObject dataObject) { 
			final HBackPo hBackPo = new HBackPo(); 
			hBackPo.setBondno(dataObject.getString(HBackPo.COLUMNS.BONDNO.name())); 
			hBackPo.setRefbillno(dataObject.getString(HBackPo.COLUMNS.REFBILLNO.name())); 
			hBackPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.ITEM.name()))); 
			hBackPo.setPrdtno(dataObject.getString(HBackPo.COLUMNS.PRDTNO.name())); 
			hBackPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.RINQTY.name()))); 
			hBackPo.setInunit(dataObject.getString(HBackPo.COLUMNS.INUNIT.name())); 
			hBackPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.BALANCE.name()))); 
			hBackPo.setInpost(dataObject.getString(HBackPo.COLUMNS.INPOST.name())); 
			hBackPo.setIndate(dataObject.getString(HBackPo.COLUMNS.INDATE.name())); 
			hBackPo.setBatchno(dataObject.getString(HBackPo.COLUMNS.BATCHNO.name())); 
			hBackPo.setStockno(dataObject.getString(HBackPo.COLUMNS.STOCKNO.name())); 
			hBackPo.setDecltype(dataObject.getString(HBackPo.COLUMNS.DECLTYPE.name())); 
			hBackPo.setDeclno(dataObject.getString(HBackPo.COLUMNS.DECLNO.name())); 
			hBackPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.ITEMNO.name()))); 
			hBackPo.setOtestno(dataObject.getString(HBackPo.COLUMNS.OTESTNO.name())); 
			hBackPo.setInstatus(dataObject.getString(HBackPo.COLUMNS.INSTATUS.name())); 
			hBackPo.setInrmks(dataObject.getString(HBackPo.COLUMNS.INRMKS.name())); 
			hBackPo.setConfirmdate(dataObject.getString(HBackPo.COLUMNS.CONFIRMDATE.name())); 
			hBackPo.setDescrip(dataObject.getString(HBackPo.COLUMNS.DESCRIP.name())); 
			hBackPo.setMonthno(dataObject.getString(HBackPo.COLUMNS.MONTHNO.name())); 
			hBackPo.setCcccode(dataObject.getString(HBackPo.COLUMNS.CCCCODE.name())); 
			hBackPo.setD8date(dataObject.getString(HBackPo.COLUMNS.D8DATE.name())); 
			hBackPo.setUserid(dataObject.getString(HBackPo.COLUMNS.USERID.name())); 
			hBackPo.setTradeprdtno(dataObject.getString(HBackPo.COLUMNS.TRADEPRDTNO.name())); 
			hBackPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.UNITPRICE.name()))); 
			hBackPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.NWGHT.name()))); 
			hBackPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.GROSS.name()))); 
			hBackPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.VALUEAMT.name()))); 
			hBackPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.DUTYRATE.name()))); 
			hBackPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.COMDTAXRATE.name()))); 
			hBackPo.setMdeclno(dataObject.getString(HBackPo.COLUMNS.MDECLNO.name())); 
			hBackPo.setD8declno(dataObject.getString(HBackPo.COLUMNS.D8DECLNO.name())); 
			hBackPo.setOutstrno(dataObject.getString(HBackPo.COLUMNS.OUTSTRNO.name())); 
			hBackPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.DECLQTY.name()))); 
			hBackPo.setRlstime(dataObject.getString(HBackPo.COLUMNS.RLSTIME.name())); 
			hBackPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.COUNTNO.name()))); 
			hBackPo.setUpdtime(dataObject.getString(HBackPo.COLUMNS.UPDTIME.name())); 
			hBackPo.setDecldate(dataObject.getString(HBackPo.COLUMNS.DECLDATE.name())); 
			hBackPo.setDutytype(dataObject.getString(HBackPo.COLUMNS.DUTYTYPE.name())); 
			hBackPo.setStatmode(dataObject.getString(HBackPo.COLUMNS.STATMODE.name())); 
			hBackPo.setOdeclno(dataObject.getString(HBackPo.COLUMNS.ODECLNO.name())); 
			hBackPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.OITEMNO.name()))); 
			hBackPo.setOutstatus(dataObject.getString(HBackPo.COLUMNS.OUTSTATUS.name())); 
			hBackPo.setOptype(dataObject.getString(HBackPo.COLUMNS.OPTYPE.name())); 
			hBackPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.ADJUSTQTY.name()))); 
			hBackPo.setOrefbillno(dataObject.getString(HBackPo.COLUMNS.OREFBILLNO.name())); 
			hBackPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(HBackPo.COLUMNS.OITEM.name()))); 
			hBackPo.setInrmks2(dataObject.getString(HBackPo.COLUMNS.INRMKS2.name())); 
			return hBackPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HBackPo hBackPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HBackPo.COLUMNS.BONDNO.name(), hBackPo.getBondno()); 
			dataObject.setValue(HBackPo.COLUMNS.REFBILLNO.name(), hBackPo.getRefbillno()); 
			dataObject.setValue(HBackPo.COLUMNS.ITEM.name(), hBackPo.getItem()); 
			dataObject.setValue(HBackPo.COLUMNS.PRDTNO.name(), hBackPo.getPrdtno()); 
			dataObject.setValue(HBackPo.COLUMNS.RINQTY.name(), hBackPo.getRinqty()); 
			dataObject.setValue(HBackPo.COLUMNS.INUNIT.name(), hBackPo.getInunit()); 
			dataObject.setValue(HBackPo.COLUMNS.BALANCE.name(), hBackPo.getBalance()); 
			dataObject.setValue(HBackPo.COLUMNS.INPOST.name(), hBackPo.getInpost()); 
			dataObject.setValue(HBackPo.COLUMNS.INDATE.name(), hBackPo.getIndate()); 
			dataObject.setValue(HBackPo.COLUMNS.BATCHNO.name(), hBackPo.getBatchno()); 
			dataObject.setValue(HBackPo.COLUMNS.STOCKNO.name(), hBackPo.getStockno()); 
			dataObject.setValue(HBackPo.COLUMNS.DECLTYPE.name(), hBackPo.getDecltype()); 
			dataObject.setValue(HBackPo.COLUMNS.DECLNO.name(), hBackPo.getDeclno()); 
			dataObject.setValue(HBackPo.COLUMNS.ITEMNO.name(), hBackPo.getItemno()); 
			dataObject.setValue(HBackPo.COLUMNS.OTESTNO.name(), hBackPo.getOtestno()); 
			dataObject.setValue(HBackPo.COLUMNS.INSTATUS.name(), hBackPo.getInstatus()); 
			dataObject.setValue(HBackPo.COLUMNS.INRMKS.name(), hBackPo.getInrmks()); 
			dataObject.setValue(HBackPo.COLUMNS.CONFIRMDATE.name(), hBackPo.getConfirmdate()); 
			dataObject.setValue(HBackPo.COLUMNS.DESCRIP.name(), hBackPo.getDescrip()); 
			dataObject.setValue(HBackPo.COLUMNS.MONTHNO.name(), hBackPo.getMonthno()); 
			dataObject.setValue(HBackPo.COLUMNS.CCCCODE.name(), hBackPo.getCcccode()); 
			dataObject.setValue(HBackPo.COLUMNS.D8DATE.name(), hBackPo.getD8date()); 
			dataObject.setValue(HBackPo.COLUMNS.USERID.name(), hBackPo.getUserid()); 
			dataObject.setValue(HBackPo.COLUMNS.TRADEPRDTNO.name(), hBackPo.getTradeprdtno()); 
			dataObject.setValue(HBackPo.COLUMNS.UNITPRICE.name(), hBackPo.getUnitprice()); 
			dataObject.setValue(HBackPo.COLUMNS.NWGHT.name(), hBackPo.getNwght()); 
			dataObject.setValue(HBackPo.COLUMNS.GROSS.name(), hBackPo.getGross()); 
			dataObject.setValue(HBackPo.COLUMNS.VALUEAMT.name(), hBackPo.getValueamt()); 
			dataObject.setValue(HBackPo.COLUMNS.DUTYRATE.name(), hBackPo.getDutyrate()); 
			dataObject.setValue(HBackPo.COLUMNS.COMDTAXRATE.name(), hBackPo.getComdtaxrate()); 
			dataObject.setValue(HBackPo.COLUMNS.MDECLNO.name(), hBackPo.getMdeclno()); 
			dataObject.setValue(HBackPo.COLUMNS.D8DECLNO.name(), hBackPo.getD8declno()); 
			dataObject.setValue(HBackPo.COLUMNS.OUTSTRNO.name(), hBackPo.getOutstrno()); 
			dataObject.setValue(HBackPo.COLUMNS.DECLQTY.name(), hBackPo.getDeclqty()); 
			dataObject.setValue(HBackPo.COLUMNS.RLSTIME.name(), hBackPo.getRlstime()); 
			dataObject.setValue(HBackPo.COLUMNS.COUNTNO.name(), hBackPo.getCountno()); 
			dataObject.setValue(HBackPo.COLUMNS.UPDTIME.name(), hBackPo.getUpdtime()); 
			dataObject.setValue(HBackPo.COLUMNS.DECLDATE.name(), hBackPo.getDecldate()); 
			dataObject.setValue(HBackPo.COLUMNS.DUTYTYPE.name(), hBackPo.getDutytype()); 
			dataObject.setValue(HBackPo.COLUMNS.STATMODE.name(), hBackPo.getStatmode()); 
			dataObject.setValue(HBackPo.COLUMNS.ODECLNO.name(), hBackPo.getOdeclno()); 
			dataObject.setValue(HBackPo.COLUMNS.OITEMNO.name(), hBackPo.getOitemno()); 
			dataObject.setValue(HBackPo.COLUMNS.OUTSTATUS.name(), hBackPo.getOutstatus()); 
			dataObject.setValue(HBackPo.COLUMNS.OPTYPE.name(), hBackPo.getOptype()); 
			dataObject.setValue(HBackPo.COLUMNS.ADJUSTQTY.name(), hBackPo.getAdjustqty()); 
			dataObject.setValue(HBackPo.COLUMNS.OREFBILLNO.name(), hBackPo.getOrefbillno()); 
			dataObject.setValue(HBackPo.COLUMNS.OITEM.name(), hBackPo.getOitem()); 
			dataObject.setValue(HBackPo.COLUMNS.INRMKS2.name(), hBackPo.getInrmks2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HBackPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HBackPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
