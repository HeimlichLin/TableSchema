package com.doc.common.dao.impl; 
 
public class TmpHGrntitem20070801DAOImpl extends GeneralDAOImpl<TmpHGrntitem20070801Po> implements TmpHGrntitem20070801DAO { 
	public static final TmpHGrntitem20070801DAOImpl INSTANCE = new TmpHGrntitem20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_GRNTITEM_20070801"; 

	public TmpHGrntitem20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpHGrntitem20070801Po> CONVERTER = new MapConverter<TmpHGrntitem20070801Po>() { 
 
		@Override 
		public TmpHGrntitem20070801Po convert(final DataObject dataObject) { 
			final TmpHGrntitem20070801Po tmpHGrntitem20070801Po = new TmpHGrntitem20070801Po(); 
			tmpHGrntitem20070801Po.setBondno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.BONDNO.name())); 
			tmpHGrntitem20070801Po.setRefbillno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.REFBILLNO.name())); 
			tmpHGrntitem20070801Po.setDeclno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.DECLNO.name())); 
			tmpHGrntitem20070801Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.ITEMNO.name()))); 
			tmpHGrntitem20070801Po.setStrpost(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.STRPOST.name())); 
			tmpHGrntitem20070801Po.setDecltype(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.DECLTYPE.name())); 
			tmpHGrntitem20070801Po.setStrtype(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.STRTYPE.name())); 
			tmpHGrntitem20070801Po.setStrdate(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.STRDATE.name())); 
			tmpHGrntitem20070801Po.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.STRQTY.name()))); 
			tmpHGrntitem20070801Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.VALUEAMT.name()))); 
			tmpHGrntitem20070801Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.DUTYRATE.name()))); 
			tmpHGrntitem20070801Po.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.AVLGRNTAMT.name()))); 
			tmpHGrntitem20070801Po.setOdeclno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.ODECLNO.name())); 
			tmpHGrntitem20070801Po.setPrdtno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.PRDTNO.name())); 
			tmpHGrntitem20070801Po.setSerialno(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.SERIALNO.name())); 
			tmpHGrntitem20070801Po.setRmks(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.RMKS.name())); 
			tmpHGrntitem20070801Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.COMDTAXRATE.name()))); 
			tmpHGrntitem20070801Po.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.VATAXRATE.name()))); 
			tmpHGrntitem20070801Po.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.DECLQTY.name()))); 
			tmpHGrntitem20070801Po.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.TAXAMT.name()))); 
			tmpHGrntitem20070801Po.setIseval(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.ISEVAL.name())); 
			tmpHGrntitem20070801Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.OITEMNO.name()))); 
			tmpHGrntitem20070801Po.setCcccode(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.CCCCODE.name())); 
			tmpHGrntitem20070801Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpHGrntitem20070801Po.COLUMNS.ITEM.name()))); 
			tmpHGrntitem20070801Po.setUpdtime(dataObject.getString(TmpHGrntitem20070801Po.COLUMNS.UPDTIME.name())); 
			return tmpHGrntitem20070801Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHGrntitem20070801Po tmpHGrntitem20070801Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.BONDNO.name(), tmpHGrntitem20070801Po.getBondno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.REFBILLNO.name(), tmpHGrntitem20070801Po.getRefbillno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.DECLNO.name(), tmpHGrntitem20070801Po.getDeclno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.ITEMNO.name(), tmpHGrntitem20070801Po.getItemno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.STRPOST.name(), tmpHGrntitem20070801Po.getStrpost()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.DECLTYPE.name(), tmpHGrntitem20070801Po.getDecltype()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.STRTYPE.name(), tmpHGrntitem20070801Po.getStrtype()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.STRDATE.name(), tmpHGrntitem20070801Po.getStrdate()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.STRQTY.name(), tmpHGrntitem20070801Po.getStrqty()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.VALUEAMT.name(), tmpHGrntitem20070801Po.getValueamt()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.DUTYRATE.name(), tmpHGrntitem20070801Po.getDutyrate()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.AVLGRNTAMT.name(), tmpHGrntitem20070801Po.getAvlgrntamt()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.ODECLNO.name(), tmpHGrntitem20070801Po.getOdeclno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.PRDTNO.name(), tmpHGrntitem20070801Po.getPrdtno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.SERIALNO.name(), tmpHGrntitem20070801Po.getSerialno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.RMKS.name(), tmpHGrntitem20070801Po.getRmks()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.COMDTAXRATE.name(), tmpHGrntitem20070801Po.getComdtaxrate()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.VATAXRATE.name(), tmpHGrntitem20070801Po.getVataxrate()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.DECLQTY.name(), tmpHGrntitem20070801Po.getDeclqty()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.TAXAMT.name(), tmpHGrntitem20070801Po.getTaxamt()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.ISEVAL.name(), tmpHGrntitem20070801Po.getIseval()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.OITEMNO.name(), tmpHGrntitem20070801Po.getOitemno()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.CCCCODE.name(), tmpHGrntitem20070801Po.getCcccode()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.ITEM.name(), tmpHGrntitem20070801Po.getItem()); 
			dataObject.setValue(TmpHGrntitem20070801Po.COLUMNS.UPDTIME.name(), tmpHGrntitem20070801Po.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHGrntitem20070801Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHGrntitem20070801Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
