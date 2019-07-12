package com.doc.common.dao.impl; 
 
public class TmpHOutdetail20070801DAOImpl extends GeneralDAOImpl<TmpHOutdetail20070801Do> implements TmpHOutdetail20070801DAOImpl { 
	public static final TmpHOutdetail20070801DAOImpl INSTANCE = new TmpHOutdetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_OUTDETAIL_20070801"; 

	public TmpHOutdetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHOutdetail20070801Do> CONVERTER = new MapConverter<TmpHOutdetail20070801Do>() { 
 
		@Override 
		public TmpHOutdetail20070801Do convert(final DataObject dataObject) { 
			final TmpHOutdetail20070801Do tmpHOutdetail20070801Do = new TmpHOutdetail20070801Do(); 
			tmpHOutdetail20070801Do.setBondno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.BONDNO.name())); 
			tmpHOutdetail20070801Do.setRefbillno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHOutdetail20070801Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.ITEM.name()))); 
			tmpHOutdetail20070801Do.setPrdtno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHOutdetail20070801Do.setRoutqty(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.ROUTQTY.name()))); 
			tmpHOutdetail20070801Do.setOutunit(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTUNIT.name())); 
			tmpHOutdetail20070801Do.setOutpost(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTPOST.name())); 
			tmpHOutdetail20070801Do.setOutdate(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTDATE.name())); 
			tmpHOutdetail20070801Do.setBatchno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.BATCHNO.name())); 
			tmpHOutdetail20070801Do.setStockno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.STOCKNO.name())); 
			tmpHOutdetail20070801Do.setDecltype(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHOutdetail20070801Do.setDeclno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.DECLNO.name())); 
			tmpHOutdetail20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHOutdetail20070801Do.setOdeclno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.ODECLNO.name())); 
			tmpHOutdetail20070801Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OITEMNO.name()))); 
			tmpHOutdetail20070801Do.setOutstatus(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTSTATUS.name())); 
			tmpHOutdetail20070801Do.setOutrmks(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTRMKS.name())); 
			tmpHOutdetail20070801Do.setConfirmdate(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.CONFIRMDATE.name())); 
			tmpHOutdetail20070801Do.setDescrip(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.DESCRIP.name())); 
			tmpHOutdetail20070801Do.setMonthno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.MONTHNO.name())); 
			tmpHOutdetail20070801Do.setUserid(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.USERID.name())); 
			tmpHOutdetail20070801Do.setTradeprdtno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.TRADEPRDTNO.name())); 
			tmpHOutdetail20070801Do.setNwght(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.NWGHT.name()))); 
			tmpHOutdetail20070801Do.setGross(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.GROSS.name()))); 
			tmpHOutdetail20070801Do.setOutstrno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTSTRNO.name())); 
			tmpHOutdetail20070801Do.setUnitprice(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.UNITPRICE.name()))); 
			tmpHOutdetail20070801Do.setCcccode(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.CCCCODE.name())); 
			tmpHOutdetail20070801Do.setRlstime(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.RLSTIME.name())); 
			tmpHOutdetail20070801Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.DUTYRATE.name()))); 
			tmpHOutdetail20070801Do.setPono(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.PONO.name())); 
			tmpHOutdetail20070801Do.setInvno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.INVNO.name())); 
			tmpHOutdetail20070801Do.setCountno(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.COUNTNO.name()))); 
			tmpHOutdetail20070801Do.setUpdtime(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHOutdetail20070801Do.setOutrmks2(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OUTRMKS2.name())); 
			tmpHOutdetail20070801Do.setOrefbillno(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OREFBILLNO.name())); 
			tmpHOutdetail20070801Do.setOitem(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.OITEM.name()))); 
			tmpHOutdetail20070801Do.setDecldate(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.DECLDATE.name())); 
			tmpHOutdetail20070801Do.setInvoice(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.INVOICE.name())); 
			tmpHOutdetail20070801Do.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHOutdetail20070801Do.COLUMNS.MOITEMNO.name()))); 
			return tmpHOutdetail20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHOutdetail20070801Do tmpHOutdetail20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.BONDNO.name(), tmpHOutdetail20070801Do.getBondno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.REFBILLNO.name(), tmpHOutdetail20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.ITEM.name(), tmpHOutdetail20070801Do.getItem()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.PRDTNO.name(), tmpHOutdetail20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.ROUTQTY.name(), tmpHOutdetail20070801Do.getRoutqty()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTUNIT.name(), tmpHOutdetail20070801Do.getOutunit()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTPOST.name(), tmpHOutdetail20070801Do.getOutpost()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTDATE.name(), tmpHOutdetail20070801Do.getOutdate()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.BATCHNO.name(), tmpHOutdetail20070801Do.getBatchno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.STOCKNO.name(), tmpHOutdetail20070801Do.getStockno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.DECLTYPE.name(), tmpHOutdetail20070801Do.getDecltype()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.DECLNO.name(), tmpHOutdetail20070801Do.getDeclno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.ITEMNO.name(), tmpHOutdetail20070801Do.getItemno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.ODECLNO.name(), tmpHOutdetail20070801Do.getOdeclno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OITEMNO.name(), tmpHOutdetail20070801Do.getOitemno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTSTATUS.name(), tmpHOutdetail20070801Do.getOutstatus()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTRMKS.name(), tmpHOutdetail20070801Do.getOutrmks()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.CONFIRMDATE.name(), tmpHOutdetail20070801Do.getConfirmdate()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.DESCRIP.name(), tmpHOutdetail20070801Do.getDescrip()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.MONTHNO.name(), tmpHOutdetail20070801Do.getMonthno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.USERID.name(), tmpHOutdetail20070801Do.getUserid()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.TRADEPRDTNO.name(), tmpHOutdetail20070801Do.getTradeprdtno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.NWGHT.name(), tmpHOutdetail20070801Do.getNwght()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.GROSS.name(), tmpHOutdetail20070801Do.getGross()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTSTRNO.name(), tmpHOutdetail20070801Do.getOutstrno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.UNITPRICE.name(), tmpHOutdetail20070801Do.getUnitprice()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.CCCCODE.name(), tmpHOutdetail20070801Do.getCcccode()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.RLSTIME.name(), tmpHOutdetail20070801Do.getRlstime()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.DUTYRATE.name(), tmpHOutdetail20070801Do.getDutyrate()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.PONO.name(), tmpHOutdetail20070801Do.getPono()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.INVNO.name(), tmpHOutdetail20070801Do.getInvno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.COUNTNO.name(), tmpHOutdetail20070801Do.getCountno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.UPDTIME.name(), tmpHOutdetail20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OUTRMKS2.name(), tmpHOutdetail20070801Do.getOutrmks2()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OREFBILLNO.name(), tmpHOutdetail20070801Do.getOrefbillno()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.OITEM.name(), tmpHOutdetail20070801Do.getOitem()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.DECLDATE.name(), tmpHOutdetail20070801Do.getDecldate()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.INVOICE.name(), tmpHOutdetail20070801Do.getInvoice()); 
			dataObject.setValue(TmpHOutdetail20070801Do.COLUMNS.MOITEMNO.name(), tmpHOutdetail20070801Do.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHOutdetail20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHOutdetail20070801Do po) { 
	} 
 
} 
