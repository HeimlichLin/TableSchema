package com.doc.common.dao.impl; 
 
public class HIndetailDAOImpl extends GeneralDAOImpl<HIndetailDo> implements HIndetailDAOImpl { 
	public static final HIndetailDAOImpl INSTANCE = new HIndetailDAOImpl(); 
	public static final String TABLENAME = "H_INDETAIL"; 

	public HIndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HIndetailDo> CONVERTER = new MapConverter<HIndetailDo>() { 
 
		@Override 
		public HIndetailDo convert(final DataObject dataObject) { 
			final HIndetailDo hIndetailDo = new HIndetailDo(); 
			hIndetailDo.setBondno(dataObject.getString(HIndetailDo.COLUMNS.BONDNO.name())); 
			hIndetailDo.setRefbillno(dataObject.getString(HIndetailDo.COLUMNS.REFBILLNO.name())); 
			hIndetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.ITEM.name()))); 
			hIndetailDo.setPrdtno(dataObject.getString(HIndetailDo.COLUMNS.PRDTNO.name())); 
			hIndetailDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.RINQTY.name()))); 
			hIndetailDo.setInunit(dataObject.getString(HIndetailDo.COLUMNS.INUNIT.name())); 
			hIndetailDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.BALANCE.name()))); 
			hIndetailDo.setInpost(dataObject.getString(HIndetailDo.COLUMNS.INPOST.name())); 
			hIndetailDo.setIndate(dataObject.getString(HIndetailDo.COLUMNS.INDATE.name())); 
			hIndetailDo.setBatchno(dataObject.getString(HIndetailDo.COLUMNS.BATCHNO.name())); 
			hIndetailDo.setStockno(dataObject.getString(HIndetailDo.COLUMNS.STOCKNO.name())); 
			hIndetailDo.setDecltype(dataObject.getString(HIndetailDo.COLUMNS.DECLTYPE.name())); 
			hIndetailDo.setDeclno(dataObject.getString(HIndetailDo.COLUMNS.DECLNO.name())); 
			hIndetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.ITEMNO.name()))); 
			hIndetailDo.setOtestno(dataObject.getString(HIndetailDo.COLUMNS.OTESTNO.name())); 
			hIndetailDo.setInstatus(dataObject.getString(HIndetailDo.COLUMNS.INSTATUS.name())); 
			hIndetailDo.setInrmks(dataObject.getString(HIndetailDo.COLUMNS.INRMKS.name())); 
			hIndetailDo.setConfirmdate(dataObject.getString(HIndetailDo.COLUMNS.CONFIRMDATE.name())); 
			hIndetailDo.setDescrip(dataObject.getString(HIndetailDo.COLUMNS.DESCRIP.name())); 
			hIndetailDo.setMonthno(dataObject.getString(HIndetailDo.COLUMNS.MONTHNO.name())); 
			hIndetailDo.setCcccode(dataObject.getString(HIndetailDo.COLUMNS.CCCCODE.name())); 
			hIndetailDo.setD8date(dataObject.getString(HIndetailDo.COLUMNS.D8DATE.name())); 
			hIndetailDo.setUserid(dataObject.getString(HIndetailDo.COLUMNS.USERID.name())); 
			hIndetailDo.setTradeprdtno(dataObject.getString(HIndetailDo.COLUMNS.TRADEPRDTNO.name())); 
			hIndetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.UNITPRICE.name()))); 
			hIndetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.NWGHT.name()))); 
			hIndetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.GROSS.name()))); 
			hIndetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.VALUEAMT.name()))); 
			hIndetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.DUTYRATE.name()))); 
			hIndetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.COMDTAXRATE.name()))); 
			hIndetailDo.setMdeclno(dataObject.getString(HIndetailDo.COLUMNS.MDECLNO.name())); 
			hIndetailDo.setD8declno(dataObject.getString(HIndetailDo.COLUMNS.D8DECLNO.name())); 
			hIndetailDo.setOutstrno(dataObject.getString(HIndetailDo.COLUMNS.OUTSTRNO.name())); 
			hIndetailDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.DECLQTY.name()))); 
			hIndetailDo.setRlstime(dataObject.getString(HIndetailDo.COLUMNS.RLSTIME.name())); 
			hIndetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.COUNTNO.name()))); 
			hIndetailDo.setUpdtime(dataObject.getString(HIndetailDo.COLUMNS.UPDTIME.name())); 
			hIndetailDo.setOdeclno(dataObject.getString(HIndetailDo.COLUMNS.ODECLNO.name())); 
			hIndetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(HIndetailDo.COLUMNS.OITEMNO.name()))); 
			hIndetailDo.setInrmks2(dataObject.getString(HIndetailDo.COLUMNS.INRMKS2.name())); 
			hIndetailDo.setInvoice(dataObject.getString(HIndetailDo.COLUMNS.INVOICE.name())); 
			hIndetailDo.setInvno(dataObject.getString(HIndetailDo.COLUMNS.INVNO.name())); 
			hIndetailDo.setDecldate(dataObject.getString(HIndetailDo.COLUMNS.DECLDATE.name())); 
			return hIndetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HIndetailDo hIndetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HIndetailDo.COLUMNS.BONDNO.name(), hIndetailDo.getBondno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.REFBILLNO.name(), hIndetailDo.getRefbillno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.ITEM.name(), hIndetailDo.getItem()); 
			dataObject.setValue(HIndetailDo.COLUMNS.PRDTNO.name(), hIndetailDo.getPrdtno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.RINQTY.name(), hIndetailDo.getRinqty()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INUNIT.name(), hIndetailDo.getInunit()); 
			dataObject.setValue(HIndetailDo.COLUMNS.BALANCE.name(), hIndetailDo.getBalance()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INPOST.name(), hIndetailDo.getInpost()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INDATE.name(), hIndetailDo.getIndate()); 
			dataObject.setValue(HIndetailDo.COLUMNS.BATCHNO.name(), hIndetailDo.getBatchno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.STOCKNO.name(), hIndetailDo.getStockno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DECLTYPE.name(), hIndetailDo.getDecltype()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DECLNO.name(), hIndetailDo.getDeclno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.ITEMNO.name(), hIndetailDo.getItemno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.OTESTNO.name(), hIndetailDo.getOtestno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INSTATUS.name(), hIndetailDo.getInstatus()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INRMKS.name(), hIndetailDo.getInrmks()); 
			dataObject.setValue(HIndetailDo.COLUMNS.CONFIRMDATE.name(), hIndetailDo.getConfirmdate()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DESCRIP.name(), hIndetailDo.getDescrip()); 
			dataObject.setValue(HIndetailDo.COLUMNS.MONTHNO.name(), hIndetailDo.getMonthno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.CCCCODE.name(), hIndetailDo.getCcccode()); 
			dataObject.setValue(HIndetailDo.COLUMNS.D8DATE.name(), hIndetailDo.getD8date()); 
			dataObject.setValue(HIndetailDo.COLUMNS.USERID.name(), hIndetailDo.getUserid()); 
			dataObject.setValue(HIndetailDo.COLUMNS.TRADEPRDTNO.name(), hIndetailDo.getTradeprdtno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.UNITPRICE.name(), hIndetailDo.getUnitprice()); 
			dataObject.setValue(HIndetailDo.COLUMNS.NWGHT.name(), hIndetailDo.getNwght()); 
			dataObject.setValue(HIndetailDo.COLUMNS.GROSS.name(), hIndetailDo.getGross()); 
			dataObject.setValue(HIndetailDo.COLUMNS.VALUEAMT.name(), hIndetailDo.getValueamt()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DUTYRATE.name(), hIndetailDo.getDutyrate()); 
			dataObject.setValue(HIndetailDo.COLUMNS.COMDTAXRATE.name(), hIndetailDo.getComdtaxrate()); 
			dataObject.setValue(HIndetailDo.COLUMNS.MDECLNO.name(), hIndetailDo.getMdeclno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.D8DECLNO.name(), hIndetailDo.getD8declno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.OUTSTRNO.name(), hIndetailDo.getOutstrno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DECLQTY.name(), hIndetailDo.getDeclqty()); 
			dataObject.setValue(HIndetailDo.COLUMNS.RLSTIME.name(), hIndetailDo.getRlstime()); 
			dataObject.setValue(HIndetailDo.COLUMNS.COUNTNO.name(), hIndetailDo.getCountno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.UPDTIME.name(), hIndetailDo.getUpdtime()); 
			dataObject.setValue(HIndetailDo.COLUMNS.ODECLNO.name(), hIndetailDo.getOdeclno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.OITEMNO.name(), hIndetailDo.getOitemno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INRMKS2.name(), hIndetailDo.getInrmks2()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INVOICE.name(), hIndetailDo.getInvoice()); 
			dataObject.setValue(HIndetailDo.COLUMNS.INVNO.name(), hIndetailDo.getInvno()); 
			dataObject.setValue(HIndetailDo.COLUMNS.DECLDATE.name(), hIndetailDo.getDecldate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HIndetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HIndetailDo po) { 
		sqlWhere.add(HIndetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HIndetailDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HIndetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(HIndetailDo.COLUMNS.INPOST.name(), po.getInpost()); 
	} 
 
} 
