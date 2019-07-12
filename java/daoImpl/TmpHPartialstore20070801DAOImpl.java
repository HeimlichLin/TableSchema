package com.doc.common.dao.impl; 
 
public class TmpHPartialstore20070801DAOImpl extends GeneralDAOImpl<TmpHPartialstore20070801Do> implements TmpHPartialstore20070801DAOImpl { 
	public static final TmpHPartialstore20070801DAOImpl INSTANCE = new TmpHPartialstore20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_PARTIALSTORE_20070801"; 

	public TmpHPartialstore20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHPartialstore20070801Do> CONVERTER = new MapConverter<TmpHPartialstore20070801Do>() { 
 
		@Override 
		public TmpHPartialstore20070801Do convert(final DataObject dataObject) { 
			final TmpHPartialstore20070801Do tmpHPartialstore20070801Do = new TmpHPartialstore20070801Do(); 
			tmpHPartialstore20070801Do.setMsgfun(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.MSGFUN.name())); 
			tmpHPartialstore20070801Do.setBondno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.BONDNO.name())); 
			tmpHPartialstore20070801Do.setRefbillno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHPartialstore20070801Do.setCtmcode(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.CTMCODE.name())); 
			tmpHPartialstore20070801Do.setRefercode(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.REFERCODE.name())); 
			tmpHPartialstore20070801Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.ITEM.name()))); 
			tmpHPartialstore20070801Do.setPrdtno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHPartialstore20070801Do.setStrtype(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.STRTYPE.name())); 
			tmpHPartialstore20070801Do.setGdstype(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.GDSTYPE.name())); 
			tmpHPartialstore20070801Do.setRstrqty(BigDecimalUtils.formObj(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.RSTRQTY.name()))); 
			tmpHPartialstore20070801Do.setStrunit(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.STRUNIT.name())); 
			tmpHPartialstore20070801Do.setStrpost(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.STRPOST.name())); 
			tmpHPartialstore20070801Do.setStrdate(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.STRDATE.name())); 
			tmpHPartialstore20070801Do.setBatchno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.BATCHNO.name())); 
			tmpHPartialstore20070801Do.setStockno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.STOCKNO.name())); 
			tmpHPartialstore20070801Do.setOutstrno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.OUTSTRNO.name())); 
			tmpHPartialstore20070801Do.setDecltype(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHPartialstore20070801Do.setDeclno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.DECLNO.name())); 
			tmpHPartialstore20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHPartialstore20070801Do.setOdeclno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.ODECLNO.name())); 
			tmpHPartialstore20070801Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.OITEMNO.name()))); 
			tmpHPartialstore20070801Do.setRealstatus(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.REALSTATUS.name())); 
			tmpHPartialstore20070801Do.setMonthno(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.MONTHNO.name())); 
			tmpHPartialstore20070801Do.setUserid(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.USERID.name())); 
			tmpHPartialstore20070801Do.setUpdtime(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.UPDTIME.name())); 
			tmpHPartialstore20070801Do.setConfirmdate(dataObject.getString(TmpHPartialstore20070801Do.COLUMNS.CONFIRMDATE.name())); 
			return tmpHPartialstore20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHPartialstore20070801Do tmpHPartialstore20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.MSGFUN.name(), tmpHPartialstore20070801Do.getMsgfun()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.BONDNO.name(), tmpHPartialstore20070801Do.getBondno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.REFBILLNO.name(), tmpHPartialstore20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.CTMCODE.name(), tmpHPartialstore20070801Do.getCtmcode()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.REFERCODE.name(), tmpHPartialstore20070801Do.getRefercode()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.ITEM.name(), tmpHPartialstore20070801Do.getItem()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.PRDTNO.name(), tmpHPartialstore20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.STRTYPE.name(), tmpHPartialstore20070801Do.getStrtype()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.GDSTYPE.name(), tmpHPartialstore20070801Do.getGdstype()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.RSTRQTY.name(), tmpHPartialstore20070801Do.getRstrqty()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.STRUNIT.name(), tmpHPartialstore20070801Do.getStrunit()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.STRPOST.name(), tmpHPartialstore20070801Do.getStrpost()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.STRDATE.name(), tmpHPartialstore20070801Do.getStrdate()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.BATCHNO.name(), tmpHPartialstore20070801Do.getBatchno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.STOCKNO.name(), tmpHPartialstore20070801Do.getStockno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.OUTSTRNO.name(), tmpHPartialstore20070801Do.getOutstrno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.DECLTYPE.name(), tmpHPartialstore20070801Do.getDecltype()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.DECLNO.name(), tmpHPartialstore20070801Do.getDeclno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.ITEMNO.name(), tmpHPartialstore20070801Do.getItemno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.ODECLNO.name(), tmpHPartialstore20070801Do.getOdeclno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.OITEMNO.name(), tmpHPartialstore20070801Do.getOitemno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.REALSTATUS.name(), tmpHPartialstore20070801Do.getRealstatus()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.MONTHNO.name(), tmpHPartialstore20070801Do.getMonthno()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.USERID.name(), tmpHPartialstore20070801Do.getUserid()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.UPDTIME.name(), tmpHPartialstore20070801Do.getUpdtime()); 
			dataObject.setValue(TmpHPartialstore20070801Do.COLUMNS.CONFIRMDATE.name(), tmpHPartialstore20070801Do.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHPartialstore20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHPartialstore20070801Do po) { 
	} 
 
} 
