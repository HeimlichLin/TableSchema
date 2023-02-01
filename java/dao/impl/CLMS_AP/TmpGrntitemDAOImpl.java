package com.doc.common.dao.impl; 
 
public class TmpGrntitemDAOImpl extends GeneralDAOImpl<TmpGrntitemPo> implements TmpGrntitemDAO { 
	public static final TmpGrntitemDAOImpl INSTANCE = new TmpGrntitemDAOImpl(); 
	public static final String TABLENAME = "TMP_GRNTITEM"; 

	public TmpGrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TmpGrntitemPo> CONVERTER = new MapConverter<TmpGrntitemPo>() { 
 
		@Override 
		public TmpGrntitemPo convert(final DataObject dataObject) { 
			final TmpGrntitemPo tmpGrntitemPo = new TmpGrntitemPo(); 
			tmpGrntitemPo.setBondno(dataObject.getString(TmpGrntitemPo.COLUMNS.BONDNO.name())); 
			tmpGrntitemPo.setRefbillno(dataObject.getString(TmpGrntitemPo.COLUMNS.REFBILLNO.name())); 
			tmpGrntitemPo.setDeclno(dataObject.getString(TmpGrntitemPo.COLUMNS.DECLNO.name())); 
			tmpGrntitemPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.ITEMNO.name()))); 
			tmpGrntitemPo.setStrpost(dataObject.getString(TmpGrntitemPo.COLUMNS.STRPOST.name())); 
			tmpGrntitemPo.setDecltype(dataObject.getString(TmpGrntitemPo.COLUMNS.DECLTYPE.name())); 
			tmpGrntitemPo.setStrtype(dataObject.getString(TmpGrntitemPo.COLUMNS.STRTYPE.name())); 
			tmpGrntitemPo.setStrdate(dataObject.getString(TmpGrntitemPo.COLUMNS.STRDATE.name())); 
			tmpGrntitemPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.STRQTY.name()))); 
			tmpGrntitemPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.VALUEAMT.name()))); 
			tmpGrntitemPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.DUTYRATE.name()))); 
			tmpGrntitemPo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.AVLGRNTAMT.name()))); 
			tmpGrntitemPo.setOdeclno(dataObject.getString(TmpGrntitemPo.COLUMNS.ODECLNO.name())); 
			tmpGrntitemPo.setPrdtno(dataObject.getString(TmpGrntitemPo.COLUMNS.PRDTNO.name())); 
			tmpGrntitemPo.setSerialno(dataObject.getString(TmpGrntitemPo.COLUMNS.SERIALNO.name())); 
			tmpGrntitemPo.setRmks(dataObject.getString(TmpGrntitemPo.COLUMNS.RMKS.name())); 
			tmpGrntitemPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.COMDTAXRATE.name()))); 
			tmpGrntitemPo.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.VATAXRATE.name()))); 
			tmpGrntitemPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.DECLQTY.name()))); 
			tmpGrntitemPo.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.TAXAMT.name()))); 
			tmpGrntitemPo.setIseval(dataObject.getString(TmpGrntitemPo.COLUMNS.ISEVAL.name())); 
			tmpGrntitemPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.OITEMNO.name()))); 
			tmpGrntitemPo.setCcccode(dataObject.getString(TmpGrntitemPo.COLUMNS.CCCCODE.name())); 
			tmpGrntitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(TmpGrntitemPo.COLUMNS.ITEM.name()))); 
			return tmpGrntitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TmpGrntitemPo tmpGrntitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.BONDNO.name(), tmpGrntitemPo.getBondno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.REFBILLNO.name(), tmpGrntitemPo.getRefbillno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.DECLNO.name(), tmpGrntitemPo.getDeclno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.ITEMNO.name(), tmpGrntitemPo.getItemno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.STRPOST.name(), tmpGrntitemPo.getStrpost()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.DECLTYPE.name(), tmpGrntitemPo.getDecltype()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.STRTYPE.name(), tmpGrntitemPo.getStrtype()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.STRDATE.name(), tmpGrntitemPo.getStrdate()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.STRQTY.name(), tmpGrntitemPo.getStrqty()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.VALUEAMT.name(), tmpGrntitemPo.getValueamt()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.DUTYRATE.name(), tmpGrntitemPo.getDutyrate()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.AVLGRNTAMT.name(), tmpGrntitemPo.getAvlgrntamt()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.ODECLNO.name(), tmpGrntitemPo.getOdeclno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.PRDTNO.name(), tmpGrntitemPo.getPrdtno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.SERIALNO.name(), tmpGrntitemPo.getSerialno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.RMKS.name(), tmpGrntitemPo.getRmks()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.COMDTAXRATE.name(), tmpGrntitemPo.getComdtaxrate()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.VATAXRATE.name(), tmpGrntitemPo.getVataxrate()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.DECLQTY.name(), tmpGrntitemPo.getDeclqty()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.TAXAMT.name(), tmpGrntitemPo.getTaxamt()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.ISEVAL.name(), tmpGrntitemPo.getIseval()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.OITEMNO.name(), tmpGrntitemPo.getOitemno()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.CCCCODE.name(), tmpGrntitemPo.getCcccode()); 
			dataObject.setValue(TmpGrntitemPo.COLUMNS.ITEM.name(), tmpGrntitemPo.getItem()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TmpGrntitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TmpGrntitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(TmpGrntitemPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
