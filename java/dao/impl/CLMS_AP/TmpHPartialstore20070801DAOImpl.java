package com.doc.common.dao.impl; 
 
public class TmpHPartialstore20070801DAOImpl extends GeneralDAOImpl<TmpHPartialstore20070801Po> implements TmpHPartialstore20070801DAO { 
	public static final TmpHPartialstore20070801DAOImpl INSTANCE = new TmpHPartialstore20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_PARTIALSTORE_20070801"; 

	public TmpHPartialstore20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHPartialstore20070801Po> CONVERTER = new MapConverter<TmpHPartialstore20070801Po>() { 
 
		@Override 
		public TmpHPartialstore20070801Po convert(final DataObject dataObject) { 
			final TmpHPartialstore20070801Po tmpHPartialstore20070801Po = new TmpHPartialstore20070801Po(); 
			tmpHPartialstore20070801Po.setMsgfun(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.MSGFUN.name())); 
			tmpHPartialstore20070801Po.setBondno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.BONDNO.name())); 
			tmpHPartialstore20070801Po.setRefbillno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHPartialstore20070801Po.setCtmcode(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.CTMCODE.name())); 
			tmpHPartialstore20070801Po.setRefercode(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.REFERCODE.name())); 
			tmpHPartialstore20070801Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpHPartialstore20070801Po.COLUMNS.ITEM.name()))); 
			tmpHPartialstore20070801Po.setPrdtno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHPartialstore20070801Po.setStrtype(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.STRTYPE.name())); 
			tmpHPartialstore20070801Po.setGdstype(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.GDSTYPE.name())); 
			tmpHPartialstore20070801Po.setRstrqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHPartialstore20070801Po.COLUMNS.RSTRQTY.name()))); 
			tmpHPartialstore20070801Po.setStrunit(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.STRUNIT.name())); 
			tmpHPartialstore20070801Po.setStrpost(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.STRPOST.name())); 
			tmpHPartialstore20070801Po.setStrdate(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.STRDATE.name())); 
			tmpHPartialstore20070801Po.setBatchno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.BATCHNO.name())); 
			tmpHPartialstore20070801Po.setStockno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.STOCKNO.name())); 
			tmpHPartialstore20070801Po.setOutstrno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.OUTSTRNO.name())); 
			tmpHPartialstore20070801Po.setDecltype(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHPartialstore20070801Po.setDeclno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.DECLNO.name())); 
			tmpHPartialstore20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHPartialstore20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHPartialstore20070801Po.setOdeclno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.ODECLNO.name())); 
			tmpHPartialstore20070801Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHPartialstore20070801Po.COLUMNS.OITEMNO.name()))); 
			tmpHPartialstore20070801Po.setRealstatus(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.REALSTATUS.name())); 
			tmpHPartialstore20070801Po.setMonthno(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.MONTHNO.name())); 
			tmpHPartialstore20070801Po.setUserid(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.USERID.name())); 
			tmpHPartialstore20070801Po.setUpdtime(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.UPDTIME.name())); 
			tmpHPartialstore20070801Po.setConfirmdate(dataObject.getString(TmpHPartialstore20070801Po.COLUMNS.CONFIRMDATE.name())); 
			return tmpHPartialstore20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHPartialstore20070801Po tmpHPartialstore20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.MSGFUN.name(), tmpHPartialstore20070801Po.getMsgfun()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.BONDNO.name(), tmpHPartialstore20070801Po.getBondno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.REFBILLNO.name(), tmpHPartialstore20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.CTMCODE.name(), tmpHPartialstore20070801Po.getCtmcode()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.REFERCODE.name(), tmpHPartialstore20070801Po.getRefercode()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.ITEM.name(), tmpHPartialstore20070801Po.getItem()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.PRDTNO.name(), tmpHPartialstore20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.STRTYPE.name(), tmpHPartialstore20070801Po.getStrtype()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.GDSTYPE.name(), tmpHPartialstore20070801Po.getGdstype()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.RSTRQTY.name(), tmpHPartialstore20070801Po.getRstrqty()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.STRUNIT.name(), tmpHPartialstore20070801Po.getStrunit()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.STRPOST.name(), tmpHPartialstore20070801Po.getStrpost()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.STRDATE.name(), tmpHPartialstore20070801Po.getStrdate()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.BATCHNO.name(), tmpHPartialstore20070801Po.getBatchno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.STOCKNO.name(), tmpHPartialstore20070801Po.getStockno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.OUTSTRNO.name(), tmpHPartialstore20070801Po.getOutstrno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.DECLTYPE.name(), tmpHPartialstore20070801Po.getDecltype()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.DECLNO.name(), tmpHPartialstore20070801Po.getDeclno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.ITEMNO.name(), tmpHPartialstore20070801Po.getItemno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.ODECLNO.name(), tmpHPartialstore20070801Po.getOdeclno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.OITEMNO.name(), tmpHPartialstore20070801Po.getOitemno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.REALSTATUS.name(), tmpHPartialstore20070801Po.getRealstatus()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.MONTHNO.name(), tmpHPartialstore20070801Po.getMonthno()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.USERID.name(), tmpHPartialstore20070801Po.getUserid()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.UPDTIME.name(), tmpHPartialstore20070801Po.getUpdtime()); 
			dataObject.setValue(TmpHPartialstore20070801Po.COLUMNS.CONFIRMDATE.name(), tmpHPartialstore20070801Po.getConfirmdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHPartialstore20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHPartialstore20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
