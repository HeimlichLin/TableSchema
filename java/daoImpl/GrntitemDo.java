package com.doc.common.dao.impl; 
 
public class GrntitemDAO extends GeneralDAOImpl<GrntitemDo> implements GrntitemDAO { 
	public static final GrntitemDAOImpl INSTANCE = new GrntitemDAOImpl(); 
	public static final String TABLENAME = "GRNTITEM"; 

	public GrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<GrntitemDo> CONVERTER = new MapConverter<GrntitemDo>() { 
 
		@Override 
		public GrntitemDo convert(final DataObject dataObject) { 
			final GrntitemDo grntitemDo = new GrntitemDo(); 
			grntitemDo.setBondno(dataObject.getString(GrntitemDo.COLUMNS.BONDNO.name())); 
			grntitemDo.setRefbillno(dataObject.getString(GrntitemDo.COLUMNS.REFBILLNO.name())); 
			grntitemDo.setDeclno(dataObject.getString(GrntitemDo.COLUMNS.DECLNO.name())); 
			grntitemDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.ITEMNO.name()))); 
			grntitemDo.setStrpost(dataObject.getString(GrntitemDo.COLUMNS.STRPOST.name())); 
			grntitemDo.setDecltype(dataObject.getString(GrntitemDo.COLUMNS.DECLTYPE.name())); 
			grntitemDo.setStrtype(dataObject.getString(GrntitemDo.COLUMNS.STRTYPE.name())); 
			grntitemDo.setStrdate(dataObject.getString(GrntitemDo.COLUMNS.STRDATE.name())); 
			grntitemDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.STRQTY.name()))); 
			grntitemDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.VALUEAMT.name()))); 
			grntitemDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.DUTYRATE.name()))); 
			grntitemDo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.AVLGRNTAMT.name()))); 
			grntitemDo.setOdeclno(dataObject.getString(GrntitemDo.COLUMNS.ODECLNO.name())); 
			grntitemDo.setPrdtno(dataObject.getString(GrntitemDo.COLUMNS.PRDTNO.name())); 
			grntitemDo.setSerialno(dataObject.getString(GrntitemDo.COLUMNS.SERIALNO.name())); 
			grntitemDo.setRmks(dataObject.getString(GrntitemDo.COLUMNS.RMKS.name())); 
			grntitemDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.COMDTAXRATE.name()))); 
			grntitemDo.setVataxrate(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.VATAXRATE.name()))); 
			grntitemDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.DECLQTY.name()))); 
			grntitemDo.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.TAXAMT.name()))); 
			grntitemDo.setIseval(dataObject.getString(GrntitemDo.COLUMNS.ISEVAL.name())); 
			grntitemDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.OITEMNO.name()))); 
			grntitemDo.setCcccode(dataObject.getString(GrntitemDo.COLUMNS.CCCCODE.name())); 
			grntitemDo.setItem(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.ITEM.name()))); 
			grntitemDo.setMoitemno(BigDecimalUtils.formObj(dataObject.getString(GrntitemDo.COLUMNS.MOITEMNO.name()))); 
			return grntitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemDo grntitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemDo.COLUMNS.BONDNO.name(), grntitemDo.getBondno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.REFBILLNO.name(), grntitemDo.getRefbillno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.DECLNO.name(), grntitemDo.getDeclno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.ITEMNO.name(), grntitemDo.getItemno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.STRPOST.name(), grntitemDo.getStrpost()); 
			dataObject.setValue(GrntitemDo.COLUMNS.DECLTYPE.name(), grntitemDo.getDecltype()); 
			dataObject.setValue(GrntitemDo.COLUMNS.STRTYPE.name(), grntitemDo.getStrtype()); 
			dataObject.setValue(GrntitemDo.COLUMNS.STRDATE.name(), grntitemDo.getStrdate()); 
			dataObject.setValue(GrntitemDo.COLUMNS.STRQTY.name(), grntitemDo.getStrqty()); 
			dataObject.setValue(GrntitemDo.COLUMNS.VALUEAMT.name(), grntitemDo.getValueamt()); 
			dataObject.setValue(GrntitemDo.COLUMNS.DUTYRATE.name(), grntitemDo.getDutyrate()); 
			dataObject.setValue(GrntitemDo.COLUMNS.AVLGRNTAMT.name(), grntitemDo.getAvlgrntamt()); 
			dataObject.setValue(GrntitemDo.COLUMNS.ODECLNO.name(), grntitemDo.getOdeclno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.PRDTNO.name(), grntitemDo.getPrdtno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.SERIALNO.name(), grntitemDo.getSerialno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.RMKS.name(), grntitemDo.getRmks()); 
			dataObject.setValue(GrntitemDo.COLUMNS.COMDTAXRATE.name(), grntitemDo.getComdtaxrate()); 
			dataObject.setValue(GrntitemDo.COLUMNS.VATAXRATE.name(), grntitemDo.getVataxrate()); 
			dataObject.setValue(GrntitemDo.COLUMNS.DECLQTY.name(), grntitemDo.getDeclqty()); 
			dataObject.setValue(GrntitemDo.COLUMNS.TAXAMT.name(), grntitemDo.getTaxamt()); 
			dataObject.setValue(GrntitemDo.COLUMNS.ISEVAL.name(), grntitemDo.getIseval()); 
			dataObject.setValue(GrntitemDo.COLUMNS.OITEMNO.name(), grntitemDo.getOitemno()); 
			dataObject.setValue(GrntitemDo.COLUMNS.CCCCODE.name(), grntitemDo.getCcccode()); 
			dataObject.setValue(GrntitemDo.COLUMNS.ITEM.name(), grntitemDo.getItem()); 
			dataObject.setValue(GrntitemDo.COLUMNS.MOITEMNO.name(), grntitemDo.getMoitemno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemDo po) { 
		sqlWhere.add(GrntitemDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(GrntitemDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(GrntitemDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(GrntitemDo.COLUMNS.STRQTY.name(), po.getStrqty()); 
		sqlWhere.add(GrntitemDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(GrntitemDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(GrntitemDo.COLUMNS.AVLGRNTAMT.name(), po.getAvlgrntamt()); 
		sqlWhere.add(GrntitemDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(GrntitemDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(GrntitemDo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		sqlWhere.add(GrntitemDo.COLUMNS.RMKS.name(), po.getRmks()); 
		sqlWhere.add(GrntitemDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(GrntitemDo.COLUMNS.VATAXRATE.name(), po.getVataxrate()); 
		sqlWhere.add(GrntitemDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(GrntitemDo.COLUMNS.TAXAMT.name(), po.getTaxamt()); 
		sqlWhere.add(GrntitemDo.COLUMNS.ISEVAL.name(), po.getIseval()); 
		sqlWhere.add(GrntitemDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(GrntitemDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(GrntitemDo.COLUMNS.MOITEMNO.name(), po.getMoitemno()); 
	} 
 
} 