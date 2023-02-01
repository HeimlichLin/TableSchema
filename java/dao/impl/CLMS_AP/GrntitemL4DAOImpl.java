package com.doc.common.dao.impl; 
 
public class GrntitemL4DAOImpl extends GeneralDAOImpl<GrntitemL4Po> implements GrntitemL4DAO { 
	public static final GrntitemL4DAOImpl INSTANCE = new GrntitemL4DAOImpl(); 
	public static final String TABLENAME = "GRNTITEM_L4"; 

	public GrntitemL4DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GrntitemL4Po> CONVERTER = new MapConverter<GrntitemL4Po>() { 
 
		@Override 
		public GrntitemL4Po convert(final DataObject dataObject) { 
			final GrntitemL4Po grntitemL4Po = new GrntitemL4Po(); 
			grntitemL4Po.setBondno(dataObject.getString(GrntitemL4Po.COLUMNS.BONDNO.name())); 
			grntitemL4Po.setRefbillno(dataObject.getString(GrntitemL4Po.COLUMNS.REFBILLNO.name())); 
			grntitemL4Po.setDeclno(dataObject.getString(GrntitemL4Po.COLUMNS.DECLNO.name())); 
			grntitemL4Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.ITEMNO.name()))); 
			grntitemL4Po.setStrpost(dataObject.getString(GrntitemL4Po.COLUMNS.STRPOST.name())); 
			grntitemL4Po.setDecltype(dataObject.getString(GrntitemL4Po.COLUMNS.DECLTYPE.name())); 
			grntitemL4Po.setStrtype(dataObject.getString(GrntitemL4Po.COLUMNS.STRTYPE.name())); 
			grntitemL4Po.setStrdate(dataObject.getString(GrntitemL4Po.COLUMNS.STRDATE.name())); 
			grntitemL4Po.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.STRQTY.name()))); 
			grntitemL4Po.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.VALUEAMT.name()))); 
			grntitemL4Po.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.DUTYRATE.name()))); 
			grntitemL4Po.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.AVLGRNTAMT.name()))); 
			grntitemL4Po.setOdeclno(dataObject.getString(GrntitemL4Po.COLUMNS.ODECLNO.name())); 
			grntitemL4Po.setPrdtno(dataObject.getString(GrntitemL4Po.COLUMNS.PRDTNO.name())); 
			grntitemL4Po.setSerialno(dataObject.getString(GrntitemL4Po.COLUMNS.SERIALNO.name())); 
			grntitemL4Po.setRmks(dataObject.getString(GrntitemL4Po.COLUMNS.RMKS.name())); 
			grntitemL4Po.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.COMDTAXRATE.name()))); 
			grntitemL4Po.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.VATAXRATE.name()))); 
			grntitemL4Po.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.DECLQTY.name()))); 
			grntitemL4Po.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.TAXAMT.name()))); 
			grntitemL4Po.setIseval(dataObject.getString(GrntitemL4Po.COLUMNS.ISEVAL.name())); 
			grntitemL4Po.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.OITEMNO.name()))); 
			grntitemL4Po.setCcccode(dataObject.getString(GrntitemL4Po.COLUMNS.CCCCODE.name())); 
			grntitemL4Po.setItem(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.ITEM.name()))); 
			grntitemL4Po.setMoitemno(BigDecimalUtils.formObj(dataObject.getValue(GrntitemL4Po.COLUMNS.MOITEMNO.name()))); 
			grntitemL4Po.setD8date(dataObject.getString(GrntitemL4Po.COLUMNS.D8DATE.name())); 
			return grntitemL4Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final GrntitemL4Po grntitemL4Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.BONDNO.name(), grntitemL4Po.getBondno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.REFBILLNO.name(), grntitemL4Po.getRefbillno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.DECLNO.name(), grntitemL4Po.getDeclno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.ITEMNO.name(), grntitemL4Po.getItemno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.STRPOST.name(), grntitemL4Po.getStrpost()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.DECLTYPE.name(), grntitemL4Po.getDecltype()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.STRTYPE.name(), grntitemL4Po.getStrtype()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.STRDATE.name(), grntitemL4Po.getStrdate()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.STRQTY.name(), grntitemL4Po.getStrqty()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.VALUEAMT.name(), grntitemL4Po.getValueamt()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.DUTYRATE.name(), grntitemL4Po.getDutyrate()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.AVLGRNTAMT.name(), grntitemL4Po.getAvlgrntamt()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.ODECLNO.name(), grntitemL4Po.getOdeclno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.PRDTNO.name(), grntitemL4Po.getPrdtno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.SERIALNO.name(), grntitemL4Po.getSerialno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.RMKS.name(), grntitemL4Po.getRmks()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.COMDTAXRATE.name(), grntitemL4Po.getComdtaxrate()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.VATAXRATE.name(), grntitemL4Po.getVataxrate()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.DECLQTY.name(), grntitemL4Po.getDeclqty()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.TAXAMT.name(), grntitemL4Po.getTaxamt()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.ISEVAL.name(), grntitemL4Po.getIseval()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.OITEMNO.name(), grntitemL4Po.getOitemno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.CCCCODE.name(), grntitemL4Po.getCcccode()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.ITEM.name(), grntitemL4Po.getItem()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.MOITEMNO.name(), grntitemL4Po.getMoitemno()); 
			dataObject.setValue(GrntitemL4Po.COLUMNS.D8DATE.name(), grntitemL4Po.getD8date()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GrntitemL4Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GrntitemL4Po po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(GrntitemL4Po.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
