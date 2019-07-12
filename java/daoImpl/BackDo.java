package com.doc.common.dao.impl; 
 
public class BackDAO extends GeneralDAOImpl<BackDo> implements BackDAO { 
	public static final BackDAOImpl INSTANCE = new BackDAOImpl(); 
	public static final String TABLENAME = "BACK"; 

	public BackDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<BackDo> CONVERTER = new MapConverter<BackDo>() { 
 
		@Override 
		public BackDo convert(final DataObject dataObject) { 
			final BackDo backDo = new BackDo(); 
			backDo.setBondno(dataObject.getString(BackDo.COLUMNS.BONDNO.name())); 
			backDo.setRefbillno(dataObject.getString(BackDo.COLUMNS.REFBILLNO.name())); 
			backDo.setItem(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.ITEM.name()))); 
			backDo.setPrdtno(dataObject.getString(BackDo.COLUMNS.PRDTNO.name())); 
			backDo.setRinqty(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.RINQTY.name()))); 
			backDo.setInunit(dataObject.getString(BackDo.COLUMNS.INUNIT.name())); 
			backDo.setBalance(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.BALANCE.name()))); 
			backDo.setInpost(dataObject.getString(BackDo.COLUMNS.INPOST.name())); 
			backDo.setIndate(dataObject.getString(BackDo.COLUMNS.INDATE.name())); 
			backDo.setBatchno(dataObject.getString(BackDo.COLUMNS.BATCHNO.name())); 
			backDo.setStockno(dataObject.getString(BackDo.COLUMNS.STOCKNO.name())); 
			backDo.setDecltype(dataObject.getString(BackDo.COLUMNS.DECLTYPE.name())); 
			backDo.setDeclno(dataObject.getString(BackDo.COLUMNS.DECLNO.name())); 
			backDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.ITEMNO.name()))); 
			backDo.setOtestno(dataObject.getString(BackDo.COLUMNS.OTESTNO.name())); 
			backDo.setInstatus(dataObject.getString(BackDo.COLUMNS.INSTATUS.name())); 
			backDo.setInrmks(dataObject.getString(BackDo.COLUMNS.INRMKS.name())); 
			backDo.setConfirmdate(dataObject.getString(BackDo.COLUMNS.CONFIRMDATE.name())); 
			backDo.setDescrip(dataObject.getString(BackDo.COLUMNS.DESCRIP.name())); 
			backDo.setMonthno(dataObject.getString(BackDo.COLUMNS.MONTHNO.name())); 
			backDo.setCcccode(dataObject.getString(BackDo.COLUMNS.CCCCODE.name())); 
			backDo.setD8date(dataObject.getString(BackDo.COLUMNS.D8DATE.name())); 
			backDo.setUserid(dataObject.getString(BackDo.COLUMNS.USERID.name())); 
			backDo.setTradeprdtno(dataObject.getString(BackDo.COLUMNS.TRADEPRDTNO.name())); 
			backDo.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.UNITPRICE.name()))); 
			backDo.setNwght(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.NWGHT.name()))); 
			backDo.setGross(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.GROSS.name()))); 
			backDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.VALUEAMT.name()))); 
			backDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.DUTYRATE.name()))); 
			backDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.COMDTAXRATE.name()))); 
			backDo.setMdeclno(dataObject.getString(BackDo.COLUMNS.MDECLNO.name())); 
			backDo.setD8declno(dataObject.getString(BackDo.COLUMNS.D8DECLNO.name())); 
			backDo.setOutstrno(dataObject.getString(BackDo.COLUMNS.OUTSTRNO.name())); 
			backDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.DECLQTY.name()))); 
			backDo.setRlstime(dataObject.getString(BackDo.COLUMNS.RLSTIME.name())); 
			backDo.setCountno(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.COUNTNO.name()))); 
			backDo.setDutytype(dataObject.getString(BackDo.COLUMNS.DUTYTYPE.name())); 
			backDo.setStatmode(dataObject.getString(BackDo.COLUMNS.STATMODE.name())); 
			backDo.setOdeclno(dataObject.getString(BackDo.COLUMNS.ODECLNO.name())); 
			backDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.OITEMNO.name()))); 
			backDo.setOutstatus(dataObject.getString(BackDo.COLUMNS.OUTSTATUS.name())); 
			backDo.setOptype(dataObject.getString(BackDo.COLUMNS.OPTYPE.name())); 
			backDo.setAdjustqty(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.ADJUSTQTY.name()))); 
			backDo.setDecldate(dataObject.getString(BackDo.COLUMNS.DECLDATE.name())); 
			backDo.setOrefbillno(dataObject.getString(BackDo.COLUMNS.OREFBILLNO.name())); 
			backDo.setOitem(BigDecimalUtils.formObj(dataObject.getString(BackDo.COLUMNS.OITEM.name()))); 
			backDo.setInrmks2(dataObject.getString(BackDo.COLUMNS.INRMKS2.name())); 
			return backDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BackDo backDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BackDo.COLUMNS.BONDNO.name(), backDo.getBondno()); 
			dataObject.setValue(BackDo.COLUMNS.REFBILLNO.name(), backDo.getRefbillno()); 
			dataObject.setValue(BackDo.COLUMNS.ITEM.name(), backDo.getItem()); 
			dataObject.setValue(BackDo.COLUMNS.PRDTNO.name(), backDo.getPrdtno()); 
			dataObject.setValue(BackDo.COLUMNS.RINQTY.name(), backDo.getRinqty()); 
			dataObject.setValue(BackDo.COLUMNS.INUNIT.name(), backDo.getInunit()); 
			dataObject.setValue(BackDo.COLUMNS.BALANCE.name(), backDo.getBalance()); 
			dataObject.setValue(BackDo.COLUMNS.INPOST.name(), backDo.getInpost()); 
			dataObject.setValue(BackDo.COLUMNS.INDATE.name(), backDo.getIndate()); 
			dataObject.setValue(BackDo.COLUMNS.BATCHNO.name(), backDo.getBatchno()); 
			dataObject.setValue(BackDo.COLUMNS.STOCKNO.name(), backDo.getStockno()); 
			dataObject.setValue(BackDo.COLUMNS.DECLTYPE.name(), backDo.getDecltype()); 
			dataObject.setValue(BackDo.COLUMNS.DECLNO.name(), backDo.getDeclno()); 
			dataObject.setValue(BackDo.COLUMNS.ITEMNO.name(), backDo.getItemno()); 
			dataObject.setValue(BackDo.COLUMNS.OTESTNO.name(), backDo.getOtestno()); 
			dataObject.setValue(BackDo.COLUMNS.INSTATUS.name(), backDo.getInstatus()); 
			dataObject.setValue(BackDo.COLUMNS.INRMKS.name(), backDo.getInrmks()); 
			dataObject.setValue(BackDo.COLUMNS.CONFIRMDATE.name(), backDo.getConfirmdate()); 
			dataObject.setValue(BackDo.COLUMNS.DESCRIP.name(), backDo.getDescrip()); 
			dataObject.setValue(BackDo.COLUMNS.MONTHNO.name(), backDo.getMonthno()); 
			dataObject.setValue(BackDo.COLUMNS.CCCCODE.name(), backDo.getCcccode()); 
			dataObject.setValue(BackDo.COLUMNS.D8DATE.name(), backDo.getD8date()); 
			dataObject.setValue(BackDo.COLUMNS.USERID.name(), backDo.getUserid()); 
			dataObject.setValue(BackDo.COLUMNS.TRADEPRDTNO.name(), backDo.getTradeprdtno()); 
			dataObject.setValue(BackDo.COLUMNS.UNITPRICE.name(), backDo.getUnitprice()); 
			dataObject.setValue(BackDo.COLUMNS.NWGHT.name(), backDo.getNwght()); 
			dataObject.setValue(BackDo.COLUMNS.GROSS.name(), backDo.getGross()); 
			dataObject.setValue(BackDo.COLUMNS.VALUEAMT.name(), backDo.getValueamt()); 
			dataObject.setValue(BackDo.COLUMNS.DUTYRATE.name(), backDo.getDutyrate()); 
			dataObject.setValue(BackDo.COLUMNS.COMDTAXRATE.name(), backDo.getComdtaxrate()); 
			dataObject.setValue(BackDo.COLUMNS.MDECLNO.name(), backDo.getMdeclno()); 
			dataObject.setValue(BackDo.COLUMNS.D8DECLNO.name(), backDo.getD8declno()); 
			dataObject.setValue(BackDo.COLUMNS.OUTSTRNO.name(), backDo.getOutstrno()); 
			dataObject.setValue(BackDo.COLUMNS.DECLQTY.name(), backDo.getDeclqty()); 
			dataObject.setValue(BackDo.COLUMNS.RLSTIME.name(), backDo.getRlstime()); 
			dataObject.setValue(BackDo.COLUMNS.COUNTNO.name(), backDo.getCountno()); 
			dataObject.setValue(BackDo.COLUMNS.DUTYTYPE.name(), backDo.getDutytype()); 
			dataObject.setValue(BackDo.COLUMNS.STATMODE.name(), backDo.getStatmode()); 
			dataObject.setValue(BackDo.COLUMNS.ODECLNO.name(), backDo.getOdeclno()); 
			dataObject.setValue(BackDo.COLUMNS.OITEMNO.name(), backDo.getOitemno()); 
			dataObject.setValue(BackDo.COLUMNS.OUTSTATUS.name(), backDo.getOutstatus()); 
			dataObject.setValue(BackDo.COLUMNS.OPTYPE.name(), backDo.getOptype()); 
			dataObject.setValue(BackDo.COLUMNS.ADJUSTQTY.name(), backDo.getAdjustqty()); 
			dataObject.setValue(BackDo.COLUMNS.DECLDATE.name(), backDo.getDecldate()); 
			dataObject.setValue(BackDo.COLUMNS.OREFBILLNO.name(), backDo.getOrefbillno()); 
			dataObject.setValue(BackDo.COLUMNS.OITEM.name(), backDo.getOitem()); 
			dataObject.setValue(BackDo.COLUMNS.INRMKS2.name(), backDo.getInrmks2()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BackDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BackDo po) { 
		sqlWhere.add(BackDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(BackDo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(BackDo.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(BackDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(BackDo.COLUMNS.RINQTY.name(), po.getRinqty()); 
		sqlWhere.add(BackDo.COLUMNS.INUNIT.name(), po.getInunit()); 
		sqlWhere.add(BackDo.COLUMNS.BALANCE.name(), po.getBalance()); 
		sqlWhere.add(BackDo.COLUMNS.INPOST.name(), po.getInpost()); 
		sqlWhere.add(BackDo.COLUMNS.INDATE.name(), po.getIndate()); 
		sqlWhere.add(BackDo.COLUMNS.BATCHNO.name(), po.getBatchno()); 
		sqlWhere.add(BackDo.COLUMNS.STOCKNO.name(), po.getStockno()); 
		sqlWhere.add(BackDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(BackDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(BackDo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(BackDo.COLUMNS.OTESTNO.name(), po.getOtestno()); 
		sqlWhere.add(BackDo.COLUMNS.INSTATUS.name(), po.getInstatus()); 
		sqlWhere.add(BackDo.COLUMNS.INRMKS.name(), po.getInrmks()); 
		sqlWhere.add(BackDo.COLUMNS.CONFIRMDATE.name(), po.getConfirmdate()); 
		sqlWhere.add(BackDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(BackDo.COLUMNS.MONTHNO.name(), po.getMonthno()); 
		sqlWhere.add(BackDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(BackDo.COLUMNS.D8DATE.name(), po.getD8date()); 
		sqlWhere.add(BackDo.COLUMNS.USERID.name(), po.getUserid()); 
		sqlWhere.add(BackDo.COLUMNS.TRADEPRDTNO.name(), po.getTradeprdtno()); 
		sqlWhere.add(BackDo.COLUMNS.UNITPRICE.name(), po.getUnitprice()); 
		sqlWhere.add(BackDo.COLUMNS.NWGHT.name(), po.getNwght()); 
		sqlWhere.add(BackDo.COLUMNS.GROSS.name(), po.getGross()); 
		sqlWhere.add(BackDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(BackDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(BackDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(BackDo.COLUMNS.MDECLNO.name(), po.getMdeclno()); 
		sqlWhere.add(BackDo.COLUMNS.D8DECLNO.name(), po.getD8declno()); 
		sqlWhere.add(BackDo.COLUMNS.OUTSTRNO.name(), po.getOutstrno()); 
		sqlWhere.add(BackDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(BackDo.COLUMNS.RLSTIME.name(), po.getRlstime()); 
		sqlWhere.add(BackDo.COLUMNS.COUNTNO.name(), po.getCountno()); 
		sqlWhere.add(BackDo.COLUMNS.DUTYTYPE.name(), po.getDutytype()); 
		sqlWhere.add(BackDo.COLUMNS.STATMODE.name(), po.getStatmode()); 
		sqlWhere.add(BackDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(BackDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(BackDo.COLUMNS.OUTSTATUS.name(), po.getOutstatus()); 
		sqlWhere.add(BackDo.COLUMNS.OPTYPE.name(), po.getOptype()); 
		sqlWhere.add(BackDo.COLUMNS.ADJUSTQTY.name(), po.getAdjustqty()); 
		sqlWhere.add(BackDo.COLUMNS.DECLDATE.name(), po.getDecldate()); 
		sqlWhere.add(BackDo.COLUMNS.OREFBILLNO.name(), po.getOrefbillno()); 
		sqlWhere.add(BackDo.COLUMNS.OITEM.name(), po.getOitem()); 
		sqlWhere.add(BackDo.COLUMNS.INRMKS2.name(), po.getInrmks2()); 
	} 
 
} 
