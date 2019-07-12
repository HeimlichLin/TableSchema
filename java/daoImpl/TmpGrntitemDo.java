package com.doc.common.dao.impl; 
 
public class TmpGrntitemDAO extends GeneralDAOImpl<TmpGrntitemDo> implements TmpGrntitemDAO { 
	public static final TmpGrntitemDAOImpl INSTANCE = new TmpGrntitemDAOImpl(); 
	public static final String TABLENAME = "TMP_GRNTITEM"; 

	public TmpGrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TmpGrntitemDo> CONVERTER = new MapConverter<TmpGrntitemDo>() { 
 
		@Override 
		public TmpGrntitemDo convert(final DataObject dataObject) { 
			final TmpGrntitemDo tmpGrntitemDo = new TmpGrntitemDo(); 
			tmpGrntitemDo.setBondno(dataObject.getString(TmpGrntitemDo.COLUMNS.BONDNO.name())); 
			tmpGrntitemDo.setRefbillno(dataObject.getString(TmpGrntitemDo.COLUMNS.REFBILLNO.name())); 
			tmpGrntitemDo.setDeclno(dataObject.getString(TmpGrntitemDo.COLUMNS.DECLNO.name())); 
			tmpGrntitemDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.ITEMNO.name()))); 
			tmpGrntitemDo.setStrpost(dataObject.getString(TmpGrntitemDo.COLUMNS.STRPOST.name())); 
			tmpGrntitemDo.setDecltype(dataObject.getString(TmpGrntitemDo.COLUMNS.DECLTYPE.name())); 
			tmpGrntitemDo.setStrtype(dataObject.getString(TmpGrntitemDo.COLUMNS.STRTYPE.name())); 
			tmpGrntitemDo.setStrdate(dataObject.getString(TmpGrntitemDo.COLUMNS.STRDATE.name())); 
			tmpGrntitemDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.STRQTY.name()))); 
			tmpGrntitemDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.VALUEAMT.name()))); 
			tmpGrntitemDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.DUTYRATE.name()))); 
			tmpGrntitemDo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.AVLGRNTAMT.name()))); 
			tmpGrntitemDo.setOdeclno(dataObject.getString(TmpGrntitemDo.COLUMNS.ODECLNO.name())); 
			tmpGrntitemDo.setPrdtno(dataObject.getString(TmpGrntitemDo.COLUMNS.PRDTNO.name())); 
			tmpGrntitemDo.setSerialno(dataObject.getString(TmpGrntitemDo.COLUMNS.SERIALNO.name())); 
			tmpGrntitemDo.setRmks(dataObject.getString(TmpGrntitemDo.COLUMNS.RMKS.name())); 
			tmpGrntitemDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.COMDTAXRATE.name()))); 
			tmpGrntitemDo.setVataxrate(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.VATAXRATE.name()))); 
			tmpGrntitemDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.DECLQTY.name()))); 
			tmpGrntitemDo.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.TAXAMT.name()))); 
			tmpGrntitemDo.setIseval(dataObject.getString(TmpGrntitemDo.COLUMNS.ISEVAL.name())); 
			tmpGrntitemDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.OITEMNO.name()))); 
			tmpGrntitemDo.setCcccode(dataObject.getString(TmpGrntitemDo.COLUMNS.CCCCODE.name())); 
			tmpGrntitemDo.setItem(BigDecimalUtils.formObj(dataObject.getString(TmpGrntitemDo.COLUMNS.ITEM.name()))); 
			return tmpGrntitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpGrntitemDo tmpGrntitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.BONDNO.name(), tmpGrntitemDo.getBondno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.REFBILLNO.name(), tmpGrntitemDo.getRefbillno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.DECLNO.name(), tmpGrntitemDo.getDeclno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.ITEMNO.name(), tmpGrntitemDo.getItemno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.STRPOST.name(), tmpGrntitemDo.getStrpost()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.DECLTYPE.name(), tmpGrntitemDo.getDecltype()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.STRTYPE.name(), tmpGrntitemDo.getStrtype()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.STRDATE.name(), tmpGrntitemDo.getStrdate()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.STRQTY.name(), tmpGrntitemDo.getStrqty()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.VALUEAMT.name(), tmpGrntitemDo.getValueamt()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.DUTYRATE.name(), tmpGrntitemDo.getDutyrate()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.AVLGRNTAMT.name(), tmpGrntitemDo.getAvlgrntamt()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.ODECLNO.name(), tmpGrntitemDo.getOdeclno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.PRDTNO.name(), tmpGrntitemDo.getPrdtno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.SERIALNO.name(), tmpGrntitemDo.getSerialno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.RMKS.name(), tmpGrntitemDo.getRmks()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.COMDTAXRATE.name(), tmpGrntitemDo.getComdtaxrate()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.VATAXRATE.name(), tmpGrntitemDo.getVataxrate()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.DECLQTY.name(), tmpGrntitemDo.getDeclqty()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.TAXAMT.name(), tmpGrntitemDo.getTaxamt()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.ISEVAL.name(), tmpGrntitemDo.getIseval()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.OITEMNO.name(), tmpGrntitemDo.getOitemno()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.CCCCODE.name(), tmpGrntitemDo.getCcccode()); 
			dataObject.setValue(TmpGrntitemDo.COLUMNS.ITEM.name(), tmpGrntitemDo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpGrntitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpGrntitemDo po) { 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.STRQTY.name(), po.getStrqty()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.AVLGRNTAMT.name(), po.getAvlgrntamt()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.RMKS.name(), po.getRmks()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.VATAXRATE.name(), po.getVataxrate()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.TAXAMT.name(), po.getTaxamt()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.ISEVAL.name(), po.getIseval()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(TmpGrntitemDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
	} 
 
} 
