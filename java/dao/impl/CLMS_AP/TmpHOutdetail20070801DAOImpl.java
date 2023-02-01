package com.doc.common.dao.impl; 
 
public class TmpHOutdetail20070801DAOImpl extends GeneralDAOImpl<TmpHOutdetail20070801Po> implements TmpHOutdetail20070801DAO { 
	public static final TmpHOutdetail20070801DAOImpl INSTANCE = new TmpHOutdetail20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_OUTDETAIL_20070801"; 

	public TmpHOutdetail20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHOutdetail20070801Po> CONVERTER = new MapConverter<TmpHOutdetail20070801Po>() { 
 
		@Override 
		public TmpHOutdetail20070801Po convert(final DataObject dataObject) { 
			final TmpHOutdetail20070801Po tmpHOutdetail20070801Po = new TmpHOutdetail20070801Po(); 
			tmpHOutdetail20070801Po.setBondno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.BONDNO.name())); 
			tmpHOutdetail20070801Po.setRefbillno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHOutdetail20070801Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.ITEM.name()))); 
			tmpHOutdetail20070801Po.setPrdtno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHOutdetail20070801Po.setRoutqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.ROUTQTY.name()))); 
			tmpHOutdetail20070801Po.setOutunit(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTUNIT.name())); 
			tmpHOutdetail20070801Po.setOutpost(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTPOST.name())); 
			tmpHOutdetail20070801Po.setOutdate(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTDATE.name())); 
			tmpHOutdetail20070801Po.setBatchno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.BATCHNO.name())); 
			tmpHOutdetail20070801Po.setStockno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.STOCKNO.name())); 
			tmpHOutdetail20070801Po.setDecltype(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHOutdetail20070801Po.setDeclno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.DECLNO.name())); 
			tmpHOutdetail20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHOutdetail20070801Po.setOdeclno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.ODECLNO.name())); 
			tmpHOutdetail20070801Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.OITEMNO.name()))); 
			tmpHOutdetail20070801Po.setOutstatus(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTSTATUS.name())); 
			tmpHOutdetail20070801Po.setOutrmks(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTRMKS.name())); 
			tmpHOutdetail20070801Po.setConfirmdate(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.CONFIRMDATE.name())); 
			tmpHOutdetail20070801Po.setDescrip(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.DESCRIP.name())); 
			tmpHOutdetail20070801Po.setMonthno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.MONTHNO.name())); 
			tmpHOutdetail20070801Po.setUserid(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.USERID.name())); 
			tmpHOutdetail20070801Po.setTradeprdtno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.TRADEPRDTNO.name())); 
			tmpHOutdetail20070801Po.setNwght(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.NWGHT.name()))); 
			tmpHOutdetail20070801Po.setGross(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.GROSS.name()))); 
			tmpHOutdetail20070801Po.setOutstrno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTSTRNO.name())); 
			tmpHOutdetail20070801Po.setUnitprice(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.UNITPRICE.name()))); 
			tmpHOutdetail20070801Po.setCcccode(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.CCCCODE.name())); 
			tmpHOutdetail20070801Po.setRlstime(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.RLSTIME.name())); 
			tmpHOutdetail20070801Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.DUTYRATE.name()))); 
			tmpHOutdetail20070801Po.setPono(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.PONO.name())); 
			tmpHOutdetail20070801Po.setInvno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.INVNO.name())); 
			tmpHOutdetail20070801Po.setCountno(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.COUNTNO.name()))); 
			tmpHOutdetail20070801Po.setUpdtime(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHOutdetail20070801Po.setOutrmks2(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OUTRMKS2.name())); 
			tmpHOutdetail20070801Po.setOrefbillno(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.OREFBILLNO.name())); 
			tmpHOutdetail20070801Po.setOitem(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.OITEM.name()))); 
			tmpHOutdetail20070801Po.setDecldate(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.DECLDATE.name())); 
			tmpHOutdetail20070801Po.setInvoice(dataObject.getString(TmpHOutdetail20070801Po.COLUMNS.INVOICE.name())); 
			tmpHOutdetail20070801Po.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHOutdetail20070801Po.COLUMNS.MOITEMNO.name()))); 
			return tmpHOutdetail20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHOutdetail20070801Po tmpHOutdetail20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.BONDNO.name(), tmpHOutdetail20070801Po.getBondno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.REFBILLNO.name(), tmpHOutdetail20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.ITEM.name(), tmpHOutdetail20070801Po.getItem()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.PRDTNO.name(), tmpHOutdetail20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.ROUTQTY.name(), tmpHOutdetail20070801Po.getRoutqty()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTUNIT.name(), tmpHOutdetail20070801Po.getOutunit()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTPOST.name(), tmpHOutdetail20070801Po.getOutpost()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTDATE.name(), tmpHOutdetail20070801Po.getOutdate()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.BATCHNO.name(), tmpHOutdetail20070801Po.getBatchno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.STOCKNO.name(), tmpHOutdetail20070801Po.getStockno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.DECLTYPE.name(), tmpHOutdetail20070801Po.getDecltype()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.DECLNO.name(), tmpHOutdetail20070801Po.getDeclno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.ITEMNO.name(), tmpHOutdetail20070801Po.getItemno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.ODECLNO.name(), tmpHOutdetail20070801Po.getOdeclno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OITEMNO.name(), tmpHOutdetail20070801Po.getOitemno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTSTATUS.name(), tmpHOutdetail20070801Po.getOutstatus()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTRMKS.name(), tmpHOutdetail20070801Po.getOutrmks()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.CONFIRMDATE.name(), tmpHOutdetail20070801Po.getConfirmdate()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.DESCRIP.name(), tmpHOutdetail20070801Po.getDescrip()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.MONTHNO.name(), tmpHOutdetail20070801Po.getMonthno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.USERID.name(), tmpHOutdetail20070801Po.getUserid()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.TRADEPRDTNO.name(), tmpHOutdetail20070801Po.getTradeprdtno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.NWGHT.name(), tmpHOutdetail20070801Po.getNwght()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.GROSS.name(), tmpHOutdetail20070801Po.getGross()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTSTRNO.name(), tmpHOutdetail20070801Po.getOutstrno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.UNITPRICE.name(), tmpHOutdetail20070801Po.getUnitprice()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.CCCCODE.name(), tmpHOutdetail20070801Po.getCcccode()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.RLSTIME.name(), tmpHOutdetail20070801Po.getRlstime()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.DUTYRATE.name(), tmpHOutdetail20070801Po.getDutyrate()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.PONO.name(), tmpHOutdetail20070801Po.getPono()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.INVNO.name(), tmpHOutdetail20070801Po.getInvno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.COUNTNO.name(), tmpHOutdetail20070801Po.getCountno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.UPDTIME.name(), tmpHOutdetail20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OUTRMKS2.name(), tmpHOutdetail20070801Po.getOutrmks2()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OREFBILLNO.name(), tmpHOutdetail20070801Po.getOrefbillno()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.OITEM.name(), tmpHOutdetail20070801Po.getOitem()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.DECLDATE.name(), tmpHOutdetail20070801Po.getDecldate()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.INVOICE.name(), tmpHOutdetail20070801Po.getInvoice()); 
			dataObject.setValue(TmpHOutdetail20070801Po.COLUMNS.MOITEMNO.name(), tmpHOutdetail20070801Po.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHOutdetail20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHOutdetail20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
