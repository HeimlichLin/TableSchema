package com.doc.common.dao.impl; 
 
public class Anne0701IndetailDAO extends GeneralDAOImpl<Anne0701IndetailDo> implements Anne0701IndetailDAO { 
	public static final Anne0701IndetailDAOImpl INSTANCE = new Anne0701IndetailDAOImpl(); 
	public static final String TABLENAME = "ANNE0701_INDETAIL"; 

	public Anne0701IndetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<Anne0701IndetailDo> CONVERTER = new MapConverter<Anne0701IndetailDo>() { 
 
		@Override 
		public Anne0701IndetailDo convert(final DataObject dataObject) { 
			final Anne0701IndetailDo anne0701IndetailDo = new Anne0701IndetailDo(); 
			anne0701IndetailDo.setBondno(dataObject.getString(Anne0701IndetailDo.COLUMNS.BONDNO.name())); 
			anne0701IndetailDo.setRefbillno(dataObject.getString(Anne0701IndetailDo.COLUMNS.REFBILLNO.name())); 
			anne0701IndetailDo.setItem(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.ITEM.name()))); 
			anne0701IndetailDo.setPrdtno(dataObject.getString(Anne0701IndetailDo.COLUMNS.PRDTNO.name())); 
			anne0701IndetailDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.RINQTY.name()))); 
			anne0701IndetailDo.setInunit(dataObject.getString(Anne0701IndetailDo.COLUMNS.INUNIT.name())); 
			anne0701IndetailDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.BALANCE.name()))); 
			anne0701IndetailDo.setInpost(dataObject.getString(Anne0701IndetailDo.COLUMNS.INPOST.name())); 
			anne0701IndetailDo.setIndate(dataObject.getString(Anne0701IndetailDo.COLUMNS.INDATE.name())); 
			anne0701IndetailDo.setBatchno(dataObject.getString(Anne0701IndetailDo.COLUMNS.BATCHNO.name())); 
			anne0701IndetailDo.setStockno(dataObject.getString(Anne0701IndetailDo.COLUMNS.STOCKNO.name())); 
			anne0701IndetailDo.setDecltype(dataObject.getString(Anne0701IndetailDo.COLUMNS.DECLTYPE.name())); 
			anne0701IndetailDo.setDeclno(dataObject.getString(Anne0701IndetailDo.COLUMNS.DECLNO.name())); 
			anne0701IndetailDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.ITEMNO.name()))); 
			anne0701IndetailDo.setOtestno(dataObject.getString(Anne0701IndetailDo.COLUMNS.OTESTNO.name())); 
			anne0701IndetailDo.setInstatus(dataObject.getString(Anne0701IndetailDo.COLUMNS.INSTATUS.name())); 
			anne0701IndetailDo.setInrmks(dataObject.getString(Anne0701IndetailDo.COLUMNS.INRMKS.name())); 
			anne0701IndetailDo.setConfirmdate(dataObject.getString(Anne0701IndetailDo.COLUMNS.CONFIRMDATE.name())); 
			anne0701IndetailDo.setDescrip(dataObject.getString(Anne0701IndetailDo.COLUMNS.DESCRIP.name())); 
			anne0701IndetailDo.setMonthno(dataObject.getString(Anne0701IndetailDo.COLUMNS.MONTHNO.name())); 
			anne0701IndetailDo.setCcccode(dataObject.getString(Anne0701IndetailDo.COLUMNS.CCCCODE.name())); 
			anne0701IndetailDo.setD8date(dataObject.getString(Anne0701IndetailDo.COLUMNS.D8DATE.name())); 
			anne0701IndetailDo.setUserid(dataObject.getString(Anne0701IndetailDo.COLUMNS.USERID.name())); 
			anne0701IndetailDo.setTradeprdtno(dataObject.getString(Anne0701IndetailDo.COLUMNS.TRADEPRDTNO.name())); 
			anne0701IndetailDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.UNITPRICE.name()))); 
			anne0701IndetailDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.NWGHT.name()))); 
			anne0701IndetailDo.setGross(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.GROSS.name()))); 
			anne0701IndetailDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.VALUEAMT.name()))); 
			anne0701IndetailDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.DUTYRATE.name()))); 
			anne0701IndetailDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.COMDTAXRATE.name()))); 
			anne0701IndetailDo.setMdeclno(dataObject.getString(Anne0701IndetailDo.COLUMNS.MDECLNO.name())); 
			anne0701IndetailDo.setD8declno(dataObject.getString(Anne0701IndetailDo.COLUMNS.D8DECLNO.name())); 
			anne0701IndetailDo.setOutstrno(dataObject.getString(Anne0701IndetailDo.COLUMNS.OUTSTRNO.name())); 
			anne0701IndetailDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.DECLQTY.name()))); 
			anne0701IndetailDo.setRlstime(dataObject.getString(Anne0701IndetailDo.COLUMNS.RLSTIME.name())); 
			anne0701IndetailDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.COUNTNO.name()))); 
			anne0701IndetailDo.setDutytype(dataObject.getString(Anne0701IndetailDo.COLUMNS.DUTYTYPE.name())); 
			anne0701IndetailDo.setStatmode(dataObject.getString(Anne0701IndetailDo.COLUMNS.STATMODE.name())); 
			anne0701IndetailDo.setOdeclno(dataObject.getString(Anne0701IndetailDo.COLUMNS.ODECLNO.name())); 
			anne0701IndetailDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.OITEMNO.name()))); 
			anne0701IndetailDo.setOutstatus(dataObject.getString(Anne0701IndetailDo.COLUMNS.OUTSTATUS.name())); 
			anne0701IndetailDo.setOptype(dataObject.getString(Anne0701IndetailDo.COLUMNS.OPTYPE.name())); 
			anne0701IndetailDo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(Anne0701IndetailDo.COLUMNS.ADJUSTQTY.name()))); 
			return anne0701IndetailDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Anne0701IndetailDo anne0701IndetailDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.BONDNO.name(), anne0701IndetailDo.getBondno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.REFBILLNO.name(), anne0701IndetailDo.getRefbillno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.ITEM.name(), anne0701IndetailDo.getItem()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.PRDTNO.name(), anne0701IndetailDo.getPrdtno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.RINQTY.name(), anne0701IndetailDo.getRinqty()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.INUNIT.name(), anne0701IndetailDo.getInunit()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.BALANCE.name(), anne0701IndetailDo.getBalance()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.INPOST.name(), anne0701IndetailDo.getInpost()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.INDATE.name(), anne0701IndetailDo.getIndate()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.BATCHNO.name(), anne0701IndetailDo.getBatchno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.STOCKNO.name(), anne0701IndetailDo.getStockno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DECLTYPE.name(), anne0701IndetailDo.getDecltype()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DECLNO.name(), anne0701IndetailDo.getDeclno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.ITEMNO.name(), anne0701IndetailDo.getItemno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.OTESTNO.name(), anne0701IndetailDo.getOtestno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.INSTATUS.name(), anne0701IndetailDo.getInstatus()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.INRMKS.name(), anne0701IndetailDo.getInrmks()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.CONFIRMDATE.name(), anne0701IndetailDo.getConfirmdate()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DESCRIP.name(), anne0701IndetailDo.getDescrip()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.MONTHNO.name(), anne0701IndetailDo.getMonthno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.CCCCODE.name(), anne0701IndetailDo.getCcccode()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.D8DATE.name(), anne0701IndetailDo.getD8date()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.USERID.name(), anne0701IndetailDo.getUserid()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.TRADEPRDTNO.name(), anne0701IndetailDo.getTradeprdtno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.UNITPRICE.name(), anne0701IndetailDo.getUnitprice()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.NWGHT.name(), anne0701IndetailDo.getNwght()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.GROSS.name(), anne0701IndetailDo.getGross()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.VALUEAMT.name(), anne0701IndetailDo.getValueamt()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DUTYRATE.name(), anne0701IndetailDo.getDutyrate()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.COMDTAXRATE.name(), anne0701IndetailDo.getComdtaxrate()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.MDECLNO.name(), anne0701IndetailDo.getMdeclno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.D8DECLNO.name(), anne0701IndetailDo.getD8declno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.OUTSTRNO.name(), anne0701IndetailDo.getOutstrno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DECLQTY.name(), anne0701IndetailDo.getDeclqty()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.RLSTIME.name(), anne0701IndetailDo.getRlstime()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.COUNTNO.name(), anne0701IndetailDo.getCountno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.DUTYTYPE.name(), anne0701IndetailDo.getDutytype()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.STATMODE.name(), anne0701IndetailDo.getStatmode()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.ODECLNO.name(), anne0701IndetailDo.getOdeclno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.OITEMNO.name(), anne0701IndetailDo.getOitemno()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.OUTSTATUS.name(), anne0701IndetailDo.getOutstatus()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.OPTYPE.name(), anne0701IndetailDo.getOptype()); 
			dataObject.setValue(Anne0701IndetailDo.COLUMNS.ADJUSTQTY.name(), anne0701IndetailDo.getAdjustqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Anne0701IndetailDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Anne0701IndetailDo po) { 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.INUNIT.name(), po.getInunit()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.OTESTNO.name(), po.getOtestno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.INRMKS.name(), po.getInrmks()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.D8DATE.name(), po.getD8date()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.MDECLNO.name(), po.getMdeclno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.D8DECLNO.name(), po.getD8declno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(Anne0701IndetailDo.COLUMNS.ADJUSTQTY.name(), po.getAdjustqty()); 
	} 
 
} 
