package com.doc.common.dao.impl; 
 
public class BackDAOImpl extends GeneralDAOImpl<BackPo> implements BackDAO { 
	public static final BackDAOImpl INSTANCE = new BackDAOImpl(); 
	public static final String TABLENAME = "BACK"; 

	public BackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BackPo> CONVERTER = new MapConverter<BackPo>() { 
 
		@Override 
		public BackPo convert(final DataObject dataObject) { 
			final BackPo backPo = new BackPo(); 
			backPo.setBondno(dataObject.getString(BackPo.COLUMNS.BONDNO.name())); 
			backPo.setRefbillno(dataObject.getString(BackPo.COLUMNS.REFBILLNO.name())); 
			backPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.ITEM.name()))); 
			backPo.setPrdtno(dataObject.getString(BackPo.COLUMNS.PRDTNO.name())); 
			backPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.RINQTY.name()))); 
			backPo.setInunit(dataObject.getString(BackPo.COLUMNS.INUNIT.name())); 
			backPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.BALANCE.name()))); 
			backPo.setInpost(dataObject.getString(BackPo.COLUMNS.INPOST.name())); 
			backPo.setIndate(dataObject.getString(BackPo.COLUMNS.INDATE.name())); 
			backPo.setBatchno(dataObject.getString(BackPo.COLUMNS.BATCHNO.name())); 
			backPo.setStockno(dataObject.getString(BackPo.COLUMNS.STOCKNO.name())); 
			backPo.setDecltype(dataObject.getString(BackPo.COLUMNS.DECLTYPE.name())); 
			backPo.setDeclno(dataObject.getString(BackPo.COLUMNS.DECLNO.name())); 
			backPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.ITEMNO.name()))); 
			backPo.setOtestno(dataObject.getString(BackPo.COLUMNS.OTESTNO.name())); 
			backPo.setInstatus(dataObject.getString(BackPo.COLUMNS.INSTATUS.name())); 
			backPo.setInrmks(dataObject.getString(BackPo.COLUMNS.INRMKS.name())); 
			backPo.setConfirmdate(dataObject.getString(BackPo.COLUMNS.CONFIRMDATE.name())); 
			backPo.setDescrip(dataObject.getString(BackPo.COLUMNS.DESCRIP.name())); 
			backPo.setMonthno(dataObject.getString(BackPo.COLUMNS.MONTHNO.name())); 
			backPo.setCcccode(dataObject.getString(BackPo.COLUMNS.CCCCODE.name())); 
			backPo.setD8date(dataObject.getString(BackPo.COLUMNS.D8DATE.name())); 
			backPo.setUserid(dataObject.getString(BackPo.COLUMNS.USERID.name())); 
			backPo.setTradeprdtno(dataObject.getString(BackPo.COLUMNS.TRADEPRDTNO.name())); 
			backPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.UNITPRICE.name()))); 
			backPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.NWGHT.name()))); 
			backPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.GROSS.name()))); 
			backPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.VALUEAMT.name()))); 
			backPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.DUTYRATE.name()))); 
			backPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.COMDTAXRATE.name()))); 
			backPo.setMdeclno(dataObject.getString(BackPo.COLUMNS.MDECLNO.name())); 
			backPo.setD8declno(dataObject.getString(BackPo.COLUMNS.D8DECLNO.name())); 
			backPo.setOutstrno(dataObject.getString(BackPo.COLUMNS.OUTSTRNO.name())); 
			backPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.DECLQTY.name()))); 
			backPo.setRlstime(dataObject.getString(BackPo.COLUMNS.RLSTIME.name())); 
			backPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.COUNTNO.name()))); 
			backPo.setDutytype(dataObject.getString(BackPo.COLUMNS.DUTYTYPE.name())); 
			backPo.setStatmode(dataObject.getString(BackPo.COLUMNS.STATMODE.name())); 
			backPo.setOdeclno(dataObject.getString(BackPo.COLUMNS.ODECLNO.name())); 
			backPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.OITEMNO.name()))); 
			backPo.setOutstatus(dataObject.getString(BackPo.COLUMNS.OUTSTATUS.name())); 
			backPo.setOptype(dataObject.getString(BackPo.COLUMNS.OPTYPE.name())); 
			backPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.ADJUSTQTY.name()))); 
			backPo.setDecldate(dataObject.getString(BackPo.COLUMNS.DECLDATE.name())); 
			backPo.setOrefbillno(dataObject.getString(BackPo.COLUMNS.OREFBILLNO.name())); 
			backPo.setOitem(BigDecimalUtils.formObj(dataObject.getValue(BackPo.COLUMNS.OITEM.name()))); 
			backPo.setInrmks2(dataObject.getString(BackPo.COLUMNS.INRMKS2.name())); 
			return backPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BackPo backPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BackPo.COLUMNS.BONDNO.name(), backPo.getBondno()); 
			dataObject.setValue(BackPo.COLUMNS.REFBILLNO.name(), backPo.getRefbillno()); 
			dataObject.setValue(BackPo.COLUMNS.ITEM.name(), backPo.getItem()); 
			dataObject.setValue(BackPo.COLUMNS.PRDTNO.name(), backPo.getPrdtno()); 
			dataObject.setValue(BackPo.COLUMNS.RINQTY.name(), backPo.getRinqty()); 
			dataObject.setValue(BackPo.COLUMNS.INUNIT.name(), backPo.getInunit()); 
			dataObject.setValue(BackPo.COLUMNS.BALANCE.name(), backPo.getBalance()); 
			dataObject.setValue(BackPo.COLUMNS.INPOST.name(), backPo.getInpost()); 
			dataObject.setValue(BackPo.COLUMNS.INDATE.name(), backPo.getIndate()); 
			dataObject.setValue(BackPo.COLUMNS.BATCHNO.name(), backPo.getBatchno()); 
			dataObject.setValue(BackPo.COLUMNS.STOCKNO.name(), backPo.getStockno()); 
			dataObject.setValue(BackPo.COLUMNS.DECLTYPE.name(), backPo.getDecltype()); 
			dataObject.setValue(BackPo.COLUMNS.DECLNO.name(), backPo.getDeclno()); 
			dataObject.setValue(BackPo.COLUMNS.ITEMNO.name(), backPo.getItemno()); 
			dataObject.setValue(BackPo.COLUMNS.OTESTNO.name(), backPo.getOtestno()); 
			dataObject.setValue(BackPo.COLUMNS.INSTATUS.name(), backPo.getInstatus()); 
			dataObject.setValue(BackPo.COLUMNS.INRMKS.name(), backPo.getInrmks()); 
			dataObject.setValue(BackPo.COLUMNS.CONFIRMDATE.name(), backPo.getConfirmdate()); 
			dataObject.setValue(BackPo.COLUMNS.DESCRIP.name(), backPo.getDescrip()); 
			dataObject.setValue(BackPo.COLUMNS.MONTHNO.name(), backPo.getMonthno()); 
			dataObject.setValue(BackPo.COLUMNS.CCCCODE.name(), backPo.getCcccode()); 
			dataObject.setValue(BackPo.COLUMNS.D8DATE.name(), backPo.getD8date()); 
			dataObject.setValue(BackPo.COLUMNS.USERID.name(), backPo.getUserid()); 
			dataObject.setValue(BackPo.COLUMNS.TRADEPRDTNO.name(), backPo.getTradeprdtno()); 
			dataObject.setValue(BackPo.COLUMNS.UNITPRICE.name(), backPo.getUnitprice()); 
			dataObject.setValue(BackPo.COLUMNS.NWGHT.name(), backPo.getNwght()); 
			dataObject.setValue(BackPo.COLUMNS.GROSS.name(), backPo.getGross()); 
			dataObject.setValue(BackPo.COLUMNS.VALUEAMT.name(), backPo.getValueamt()); 
			dataObject.setValue(BackPo.COLUMNS.DUTYRATE.name(), backPo.getDutyrate()); 
			dataObject.setValue(BackPo.COLUMNS.COMDTAXRATE.name(), backPo.getComdtaxrate()); 
			dataObject.setValue(BackPo.COLUMNS.MDECLNO.name(), backPo.getMdeclno()); 
			dataObject.setValue(BackPo.COLUMNS.D8DECLNO.name(), backPo.getD8declno()); 
			dataObject.setValue(BackPo.COLUMNS.OUTSTRNO.name(), backPo.getOutstrno()); 
			dataObject.setValue(BackPo.COLUMNS.DECLQTY.name(), backPo.getDeclqty()); 
			dataObject.setValue(BackPo.COLUMNS.RLSTIME.name(), backPo.getRlstime()); 
			dataObject.setValue(BackPo.COLUMNS.COUNTNO.name(), backPo.getCountno()); 
			dataObject.setValue(BackPo.COLUMNS.DUTYTYPE.name(), backPo.getDutytype()); 
			dataObject.setValue(BackPo.COLUMNS.STATMODE.name(), backPo.getStatmode()); 
			dataObject.setValue(BackPo.COLUMNS.ODECLNO.name(), backPo.getOdeclno()); 
			dataObject.setValue(BackPo.COLUMNS.OITEMNO.name(), backPo.getOitemno()); 
			dataObject.setValue(BackPo.COLUMNS.OUTSTATUS.name(), backPo.getOutstatus()); 
			dataObject.setValue(BackPo.COLUMNS.OPTYPE.name(), backPo.getOptype()); 
			dataObject.setValue(BackPo.COLUMNS.ADJUSTQTY.name(), backPo.getAdjustqty()); 
			dataObject.setValue(BackPo.COLUMNS.DECLDATE.name(), backPo.getDecldate()); 
			dataObject.setValue(BackPo.COLUMNS.OREFBILLNO.name(), backPo.getOrefbillno()); 
			dataObject.setValue(BackPo.COLUMNS.OITEM.name(), backPo.getOitem()); 
			dataObject.setValue(BackPo.COLUMNS.INRMKS2.name(), backPo.getInrmks2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BackPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BackPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
