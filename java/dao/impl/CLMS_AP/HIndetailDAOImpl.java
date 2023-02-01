package com.doc.common.dao.impl; 
 
public class HIndetailDAOImpl extends GeneralDAOImpl<HIndetailPo> implements HIndetailDAO { 
	public static final HIndetailDAOImpl INSTANCE = new HIndetailDAOImpl(); 
	public static final String TABLENAME = "H_INDETAIL"; 

	public HIndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HIndetailPo> CONVERTER = new MapConverter<HIndetailPo>() { 
 
		@Override 
		public HIndetailPo convert(final DataObject dataObject) { 
			final HIndetailPo hIndetailPo = new HIndetailPo(); 
			hIndetailPo.setBondno(dataObject.getString(HIndetailPo.COLUMNS.BONDNO.name())); 
			hIndetailPo.setRefbillno(dataObject.getString(HIndetailPo.COLUMNS.REFBILLNO.name())); 
			hIndetailPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.ITEM.name()))); 
			hIndetailPo.setPrdtno(dataObject.getString(HIndetailPo.COLUMNS.PRDTNO.name())); 
			hIndetailPo.setRinqty(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.RINQTY.name()))); 
			hIndetailPo.setInunit(dataObject.getString(HIndetailPo.COLUMNS.INUNIT.name())); 
			hIndetailPo.setBalance(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.BALANCE.name()))); 
			hIndetailPo.setInpost(dataObject.getString(HIndetailPo.COLUMNS.INPOST.name())); 
			hIndetailPo.setIndate(dataObject.getString(HIndetailPo.COLUMNS.INDATE.name())); 
			hIndetailPo.setBatchno(dataObject.getString(HIndetailPo.COLUMNS.BATCHNO.name())); 
			hIndetailPo.setStockno(dataObject.getString(HIndetailPo.COLUMNS.STOCKNO.name())); 
			hIndetailPo.setDecltype(dataObject.getString(HIndetailPo.COLUMNS.DECLTYPE.name())); 
			hIndetailPo.setDeclno(dataObject.getString(HIndetailPo.COLUMNS.DECLNO.name())); 
			hIndetailPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.ITEMNO.name()))); 
			hIndetailPo.setOtestno(dataObject.getString(HIndetailPo.COLUMNS.OTESTNO.name())); 
			hIndetailPo.setInstatus(dataObject.getString(HIndetailPo.COLUMNS.INSTATUS.name())); 
			hIndetailPo.setInrmks(dataObject.getString(HIndetailPo.COLUMNS.INRMKS.name())); 
			hIndetailPo.setConfirmdate(dataObject.getString(HIndetailPo.COLUMNS.CONFIRMDATE.name())); 
			hIndetailPo.setDescrip(dataObject.getString(HIndetailPo.COLUMNS.DESCRIP.name())); 
			hIndetailPo.setMonthno(dataObject.getString(HIndetailPo.COLUMNS.MONTHNO.name())); 
			hIndetailPo.setCcccode(dataObject.getString(HIndetailPo.COLUMNS.CCCCODE.name())); 
			hIndetailPo.setD8date(dataObject.getString(HIndetailPo.COLUMNS.D8DATE.name())); 
			hIndetailPo.setUserid(dataObject.getString(HIndetailPo.COLUMNS.USERID.name())); 
			hIndetailPo.setTradeprdtno(dataObject.getString(HIndetailPo.COLUMNS.TRADEPRDTNO.name())); 
			hIndetailPo.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.UNITPRICE.name()))); 
			hIndetailPo.setNwght(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.NWGHT.name()))); 
			hIndetailPo.setGross(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.GROSS.name()))); 
			hIndetailPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.VALUEAMT.name()))); 
			hIndetailPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.DUTYRATE.name()))); 
			hIndetailPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.COMDTAXRATE.name()))); 
			hIndetailPo.setMdeclno(dataObject.getString(HIndetailPo.COLUMNS.MDECLNO.name())); 
			hIndetailPo.setD8declno(dataObject.getString(HIndetailPo.COLUMNS.D8DECLNO.name())); 
			hIndetailPo.setOutstrno(dataObject.getString(HIndetailPo.COLUMNS.OUTSTRNO.name())); 
			hIndetailPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.DECLQTY.name()))); 
			hIndetailPo.setRlstime(dataObject.getString(HIndetailPo.COLUMNS.RLSTIME.name())); 
			hIndetailPo.setCountno(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.COUNTNO.name()))); 
			hIndetailPo.setUpdtime(dataObject.getString(HIndetailPo.COLUMNS.UPDTIME.name())); 
			hIndetailPo.setOdeclno(dataObject.getString(HIndetailPo.COLUMNS.ODECLNO.name())); 
			hIndetailPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.OITEMNO.name()))); 
			hIndetailPo.setInrmks2(dataObject.getString(HIndetailPo.COLUMNS.INRMKS2.name())); 
			hIndetailPo.setInvoice(dataObject.getString(HIndetailPo.COLUMNS.INVOICE.name())); 
			hIndetailPo.setInvno(dataObject.getString(HIndetailPo.COLUMNS.INVNO.name())); 
			hIndetailPo.setDecldate(dataObject.getString(HIndetailPo.COLUMNS.DECLDATE.name())); 
			hIndetailPo.setDutytype(dataObject.getString(HIndetailPo.COLUMNS.DUTYTYPE.name())); 
			hIndetailPo.setStatmode(dataObject.getString(HIndetailPo.COLUMNS.STATMODE.name())); 
			hIndetailPo.setOutstatus(dataObject.getString(HIndetailPo.COLUMNS.OUTSTATUS.name())); 
			hIndetailPo.setOptype(dataObject.getString(HIndetailPo.COLUMNS.OPTYPE.name())); 
			hIndetailPo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getValue(HIndetailPo.COLUMNS.ADJUSTQTY.name()))); 
			return hIndetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HIndetailPo hIndetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HIndetailPo.COLUMNS.BONDNO.name(), hIndetailPo.getBondno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.REFBILLNO.name(), hIndetailPo.getRefbillno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.ITEM.name(), hIndetailPo.getItem()); 
			dataObject.setValue(HIndetailPo.COLUMNS.PRDTNO.name(), hIndetailPo.getPrdtno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.RINQTY.name(), hIndetailPo.getRinqty()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INUNIT.name(), hIndetailPo.getInunit()); 
			dataObject.setValue(HIndetailPo.COLUMNS.BALANCE.name(), hIndetailPo.getBalance()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INPOST.name(), hIndetailPo.getInpost()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INDATE.name(), hIndetailPo.getIndate()); 
			dataObject.setValue(HIndetailPo.COLUMNS.BATCHNO.name(), hIndetailPo.getBatchno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.STOCKNO.name(), hIndetailPo.getStockno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DECLTYPE.name(), hIndetailPo.getDecltype()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DECLNO.name(), hIndetailPo.getDeclno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.ITEMNO.name(), hIndetailPo.getItemno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.OTESTNO.name(), hIndetailPo.getOtestno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INSTATUS.name(), hIndetailPo.getInstatus()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INRMKS.name(), hIndetailPo.getInrmks()); 
			dataObject.setValue(HIndetailPo.COLUMNS.CONFIRMDATE.name(), hIndetailPo.getConfirmdate()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DESCRIP.name(), hIndetailPo.getDescrip()); 
			dataObject.setValue(HIndetailPo.COLUMNS.MONTHNO.name(), hIndetailPo.getMonthno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.CCCCODE.name(), hIndetailPo.getCcccode()); 
			dataObject.setValue(HIndetailPo.COLUMNS.D8DATE.name(), hIndetailPo.getD8date()); 
			dataObject.setValue(HIndetailPo.COLUMNS.USERID.name(), hIndetailPo.getUserid()); 
			dataObject.setValue(HIndetailPo.COLUMNS.TRADEPRDTNO.name(), hIndetailPo.getTradeprdtno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.UNITPRICE.name(), hIndetailPo.getUnitprice()); 
			dataObject.setValue(HIndetailPo.COLUMNS.NWGHT.name(), hIndetailPo.getNwght()); 
			dataObject.setValue(HIndetailPo.COLUMNS.GROSS.name(), hIndetailPo.getGross()); 
			dataObject.setValue(HIndetailPo.COLUMNS.VALUEAMT.name(), hIndetailPo.getValueamt()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DUTYRATE.name(), hIndetailPo.getDutyrate()); 
			dataObject.setValue(HIndetailPo.COLUMNS.COMDTAXRATE.name(), hIndetailPo.getComdtaxrate()); 
			dataObject.setValue(HIndetailPo.COLUMNS.MDECLNO.name(), hIndetailPo.getMdeclno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.D8DECLNO.name(), hIndetailPo.getD8declno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.OUTSTRNO.name(), hIndetailPo.getOutstrno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DECLQTY.name(), hIndetailPo.getDeclqty()); 
			dataObject.setValue(HIndetailPo.COLUMNS.RLSTIME.name(), hIndetailPo.getRlstime()); 
			dataObject.setValue(HIndetailPo.COLUMNS.COUNTNO.name(), hIndetailPo.getCountno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.UPDTIME.name(), hIndetailPo.getUpdtime()); 
			dataObject.setValue(HIndetailPo.COLUMNS.ODECLNO.name(), hIndetailPo.getOdeclno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.OITEMNO.name(), hIndetailPo.getOitemno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INRMKS2.name(), hIndetailPo.getInrmks2()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INVOICE.name(), hIndetailPo.getInvoice()); 
			dataObject.setValue(HIndetailPo.COLUMNS.INVNO.name(), hIndetailPo.getInvno()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DECLDATE.name(), hIndetailPo.getDecldate()); 
			dataObject.setValue(HIndetailPo.COLUMNS.DUTYTYPE.name(), hIndetailPo.getDutytype()); 
			dataObject.setValue(HIndetailPo.COLUMNS.STATMODE.name(), hIndetailPo.getStatmode()); 
			dataObject.setValue(HIndetailPo.COLUMNS.OUTSTATUS.name(), hIndetailPo.getOutstatus()); 
			dataObject.setValue(HIndetailPo.COLUMNS.OPTYPE.name(), hIndetailPo.getOptype()); 
			dataObject.setValue(HIndetailPo.COLUMNS.ADJUSTQTY.name(), hIndetailPo.getAdjustqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HIndetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HIndetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HIndetailPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HIndetailPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HIndetailPo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HIndetailPo.COLUMNS.INPOST.name(), po.getInpost()); 
		return sqlWhere; 
	} 
 
} 
