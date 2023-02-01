package com.doc.common.dao.impl; 
 
public class GrntitemDAOImpl extends GeneralDAOImpl<GrntitemPo> implements GrntitemDAO { 
	public static final GrntitemDAOImpl INSTANCE = new GrntitemDAOImpl(); 
	public static final String TABLENAME = "GRNTITEM"; 

	public GrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntitemPo> CONVERTER = new MapConverter<GrntitemPo>() { 
 
		@Override 
		public GrntitemPo convert(final DataObject dataObject) { 
			final GrntitemPo grntitemPo = new GrntitemPo(); 
			grntitemPo.setBondno(dataObject.getString(GrntitemPo.COLUMNS.BONDNO.name())); 
			grntitemPo.setRefbillno(dataObject.getString(GrntitemPo.COLUMNS.REFBILLNO.name())); 
			grntitemPo.setDeclno(dataObject.getString(GrntitemPo.COLUMNS.DECLNO.name())); 
			grntitemPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.ITEMNO.name()))); 
			grntitemPo.setStrpost(dataObject.getString(GrntitemPo.COLUMNS.STRPOST.name())); 
			grntitemPo.setDecltype(dataObject.getString(GrntitemPo.COLUMNS.DECLTYPE.name())); 
			grntitemPo.setStrtype(dataObject.getString(GrntitemPo.COLUMNS.STRTYPE.name())); 
			grntitemPo.setStrdate(dataObject.getString(GrntitemPo.COLUMNS.STRDATE.name())); 
			grntitemPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.STRQTY.name()))); 
			grntitemPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.VALUEAMT.name()))); 
			grntitemPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.DUTYRATE.name()))); 
			grntitemPo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.AVLGRNTAMT.name()))); 
			grntitemPo.setOdeclno(dataObject.getString(GrntitemPo.COLUMNS.ODECLNO.name())); 
			grntitemPo.setPrdtno(dataObject.getString(GrntitemPo.COLUMNS.PRDTNO.name())); 
			grntitemPo.setSerialno(dataObject.getString(GrntitemPo.COLUMNS.SERIALNO.name())); 
			grntitemPo.setRmks(dataObject.getString(GrntitemPo.COLUMNS.RMKS.name())); 
			grntitemPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.COMDTAXRATE.name()))); 
			grntitemPo.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.VATAXRATE.name()))); 
			grntitemPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.DECLQTY.name()))); 
			grntitemPo.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.TAXAMT.name()))); 
			grntitemPo.setIseval(dataObject.getString(GrntitemPo.COLUMNS.ISEVAL.name())); 
			grntitemPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.OITEMNO.name()))); 
			grntitemPo.setCcccode(dataObject.getString(GrntitemPo.COLUMNS.CCCCODE.name())); 
			grntitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.ITEM.name()))); 
			grntitemPo.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemPo.COLUMNS.MOITEMNO.name()))); 
			grntitemPo.setD8date(dataObject.getString(GrntitemPo.COLUMNS.D8DATE.name())); 
			return grntitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemPo grntitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemPo.COLUMNS.BONDNO.name(), grntitemPo.getBondno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.REFBILLNO.name(), grntitemPo.getRefbillno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECLNO.name(), grntitemPo.getDeclno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ITEMNO.name(), grntitemPo.getItemno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STRPOST.name(), grntitemPo.getStrpost()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECLTYPE.name(), grntitemPo.getDecltype()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STRTYPE.name(), grntitemPo.getStrtype()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STRDATE.name(), grntitemPo.getStrdate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.STRQTY.name(), grntitemPo.getStrqty()); 
			dataObject.setValue(GrntitemPo.COLUMNS.VALUEAMT.name(), grntitemPo.getValueamt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DUTYRATE.name(), grntitemPo.getDutyrate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.AVLGRNTAMT.name(), grntitemPo.getAvlgrntamt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ODECLNO.name(), grntitemPo.getOdeclno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.PRDTNO.name(), grntitemPo.getPrdtno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.SERIALNO.name(), grntitemPo.getSerialno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.RMKS.name(), grntitemPo.getRmks()); 
			dataObject.setValue(GrntitemPo.COLUMNS.COMDTAXRATE.name(), grntitemPo.getComdtaxrate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.VATAXRATE.name(), grntitemPo.getVataxrate()); 
			dataObject.setValue(GrntitemPo.COLUMNS.DECLQTY.name(), grntitemPo.getDeclqty()); 
			dataObject.setValue(GrntitemPo.COLUMNS.TAXAMT.name(), grntitemPo.getTaxamt()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ISEVAL.name(), grntitemPo.getIseval()); 
			dataObject.setValue(GrntitemPo.COLUMNS.OITEMNO.name(), grntitemPo.getOitemno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.CCCCODE.name(), grntitemPo.getCcccode()); 
			dataObject.setValue(GrntitemPo.COLUMNS.ITEM.name(), grntitemPo.getItem()); 
			dataObject.setValue(GrntitemPo.COLUMNS.MOITEMNO.name(), grntitemPo.getMoitemno()); 
			dataObject.setValue(GrntitemPo.COLUMNS.D8DATE.name(), grntitemPo.getD8date()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(GrntitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(GrntitemPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(GrntitemPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(GrntitemPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(GrntitemPo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(GrntitemPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
