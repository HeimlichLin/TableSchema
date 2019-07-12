package com.doc.common.dao.impl; 
 
public class TmpHGrntitem20070801DAO extends GeneralDAOImpl<TmpHGrntitem20070801Do> implements TmpHGrntitem20070801DAO { 
	public static final TmpHGrntitem20070801DAOImpl INSTANCE = new TmpHGrntitem20070801DAOImpl(); 
	public static final String TABLENAME = "TMP_H_GRNTITEM_20070801"; 

	public TmpHGrntitem20070801DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpHGrntitem20070801Do> CONVERTER = new MapConverter<TmpHGrntitem20070801Do>() { 
 
		@Override 
		public TmpHGrntitem20070801Do convert(final DataObject dataObject) { 
			final TmpHGrntitem20070801Do tmpHGrntitem20070801Do = new TmpHGrntitem20070801Do(); 
			tmpHGrntitem20070801Do.setBondno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.BONDNO.name())); 
			tmpHGrntitem20070801Do.setRefbillno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.REFBILLNO.name())); 
			tmpHGrntitem20070801Do.setDeclno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.DECLNO.name())); 
			tmpHGrntitem20070801Do.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.ITEMNO.name()))); 
			tmpHGrntitem20070801Do.setStrpost(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.STRPOST.name())); 
			tmpHGrntitem20070801Do.setDecltype(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.DECLTYPE.name())); 
			tmpHGrntitem20070801Do.setStrtype(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.STRTYPE.name())); 
			tmpHGrntitem20070801Do.setStrdate(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.STRDATE.name())); 
			tmpHGrntitem20070801Do.setStrqty(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.STRQTY.name()))); 
			tmpHGrntitem20070801Do.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.VALUEAMT.name()))); 
			tmpHGrntitem20070801Do.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.DUTYRATE.name()))); 
			tmpHGrntitem20070801Do.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.AVLGRNTAMT.name()))); 
			tmpHGrntitem20070801Do.setOdeclno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.ODECLNO.name())); 
			tmpHGrntitem20070801Do.setPrdtno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.PRDTNO.name())); 
			tmpHGrntitem20070801Do.setSerialno(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.SERIALNO.name())); 
			tmpHGrntitem20070801Do.setRmks(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.RMKS.name())); 
			tmpHGrntitem20070801Do.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.COMDTAXRATE.name()))); 
			tmpHGrntitem20070801Do.setVataxrate(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.VATAXRATE.name()))); 
			tmpHGrntitem20070801Do.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.DECLQTY.name()))); 
			tmpHGrntitem20070801Do.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.TAXAMT.name()))); 
			tmpHGrntitem20070801Do.setIseval(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.ISEVAL.name())); 
			tmpHGrntitem20070801Do.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.OITEMNO.name()))); 
			tmpHGrntitem20070801Do.setCcccode(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.CCCCODE.name())); 
			tmpHGrntitem20070801Do.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.ITEM.name()))); 
			tmpHGrntitem20070801Do.setUpdtime(dataObject.getString(TmpHGrntitem20070801Do.COLUMNS.UPDTIME.name())); 
			return tmpHGrntitem20070801Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpHGrntitem20070801Do tmpHGrntitem20070801Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.BONDNO.name(), tmpHGrntitem20070801Do.getBondno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.REFBILLNO.name(), tmpHGrntitem20070801Do.getRefbillno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.DECLNO.name(), tmpHGrntitem20070801Do.getDeclno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.ITEMNO.name(), tmpHGrntitem20070801Do.getItemno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.STRPOST.name(), tmpHGrntitem20070801Do.getStrpost()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.DECLTYPE.name(), tmpHGrntitem20070801Do.getDecltype()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.STRTYPE.name(), tmpHGrntitem20070801Do.getStrtype()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.STRDATE.name(), tmpHGrntitem20070801Do.getStrdate()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.STRQTY.name(), tmpHGrntitem20070801Do.getStrqty()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.VALUEAMT.name(), tmpHGrntitem20070801Do.getValueamt()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.DUTYRATE.name(), tmpHGrntitem20070801Do.getDutyrate()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.AVLGRNTAMT.name(), tmpHGrntitem20070801Do.getAvlgrntamt()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.ODECLNO.name(), tmpHGrntitem20070801Do.getOdeclno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.PRDTNO.name(), tmpHGrntitem20070801Do.getPrdtno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.SERIALNO.name(), tmpHGrntitem20070801Do.getSerialno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.RMKS.name(), tmpHGrntitem20070801Do.getRmks()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.COMDTAXRATE.name(), tmpHGrntitem20070801Do.getComdtaxrate()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.VATAXRATE.name(), tmpHGrntitem20070801Do.getVataxrate()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.DECLQTY.name(), tmpHGrntitem20070801Do.getDeclqty()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.TAXAMT.name(), tmpHGrntitem20070801Do.getTaxamt()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.ISEVAL.name(), tmpHGrntitem20070801Do.getIseval()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.OITEMNO.name(), tmpHGrntitem20070801Do.getOitemno()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.CCCCODE.name(), tmpHGrntitem20070801Do.getCcccode()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.ITEM.name(), tmpHGrntitem20070801Do.getItem()); 
			dataObject.setValue(TmpHGrntitem20070801Do.COLUMNS.UPDTIME.name(), tmpHGrntitem20070801Do.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpHGrntitem20070801Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpHGrntitem20070801Do po) { 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.STRQTY.name(), po.getStrqty()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.AVLGRNTAMT.name(), po.getAvlgrntamt()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.RMKS.name(), po.getRmks()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.VATAXRATE.name(), po.getVataxrate()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.TAXAMT.name(), po.getTaxamt()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.ISEVAL.name(), po.getIseval()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.ITEM.name(), po.getItem()); 
		sqlWhere.add(TmpHGrntitem20070801Do.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
