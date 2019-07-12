package com.doc.common.dao.impl; 
 
public class HGrntitemDAO extends GeneralDAOImpl<HGrntitemDo> implements HGrntitemDAO { 
	public static final HGrntitemDAOImpl INSTANCE = new HGrntitemDAOImpl(); 
	public static final String TABLENAME = "H_GRNTITEM"; 

	public HGrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<HGrntitemDo> CONVERTER = new MapConverter<HGrntitemDo>() { 
 
		@Override 
		public HGrntitemDo convert(final DataObject dataObject) { 
			final HGrntitemDo hGrntitemDo = new HGrntitemDo(); 
			hGrntitemDo.setBondno(dataObject.getString(HGrntitemDo.COLUMNS.BONDNO.name())); 
			hGrntitemDo.setRefbillno(dataObject.getString(HGrntitemDo.COLUMNS.REFBILLNO.name())); 
			hGrntitemDo.setDeclno(dataObject.getString(HGrntitemDo.COLUMNS.DECLNO.name())); 
			hGrntitemDo.setItemno(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.ITEMNO.name()))); 
			hGrntitemDo.setStrpost(dataObject.getString(HGrntitemDo.COLUMNS.STRPOST.name())); 
			hGrntitemDo.setDecltype(dataObject.getString(HGrntitemDo.COLUMNS.DECLTYPE.name())); 
			hGrntitemDo.setStrtype(dataObject.getString(HGrntitemDo.COLUMNS.STRTYPE.name())); 
			hGrntitemDo.setStrdate(dataObject.getString(HGrntitemDo.COLUMNS.STRDATE.name())); 
			hGrntitemDo.setStrqty(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.STRQTY.name()))); 
			hGrntitemDo.setValueamt(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.VALUEAMT.name()))); 
			hGrntitemDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.DUTYRATE.name()))); 
			hGrntitemDo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.AVLGRNTAMT.name()))); 
			hGrntitemDo.setOdeclno(dataObject.getString(HGrntitemDo.COLUMNS.ODECLNO.name())); 
			hGrntitemDo.setPrdtno(dataObject.getString(HGrntitemDo.COLUMNS.PRDTNO.name())); 
			hGrntitemDo.setSerialno(dataObject.getString(HGrntitemDo.COLUMNS.SERIALNO.name())); 
			hGrntitemDo.setRmks(dataObject.getString(HGrntitemDo.COLUMNS.RMKS.name())); 
			hGrntitemDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.COMDTAXRATE.name()))); 
			hGrntitemDo.setVataxrate(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.VATAXRATE.name()))); 
			hGrntitemDo.setDeclqty(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.DECLQTY.name()))); 
			hGrntitemDo.setTaxamt(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.TAXAMT.name()))); 
			hGrntitemDo.setIseval(dataObject.getString(HGrntitemDo.COLUMNS.ISEVAL.name())); 
			hGrntitemDo.setOitemno(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.OITEMNO.name()))); 
			hGrntitemDo.setCcccode(dataObject.getString(HGrntitemDo.COLUMNS.CCCCODE.name())); 
			hGrntitemDo.setItem(BigDecimalUtils.formObj(dataObject.getString(HGrntitemDo.COLUMNS.ITEM.name()))); 
			hGrntitemDo.setUpdtime(dataObject.getString(HGrntitemDo.COLUMNS.UPDTIME.name())); 
			return hGrntitemDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HGrntitemDo hGrntitemDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HGrntitemDo.COLUMNS.BONDNO.name(), hGrntitemDo.getBondno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.REFBILLNO.name(), hGrntitemDo.getRefbillno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.DECLNO.name(), hGrntitemDo.getDeclno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.ITEMNO.name(), hGrntitemDo.getItemno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.STRPOST.name(), hGrntitemDo.getStrpost()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.DECLTYPE.name(), hGrntitemDo.getDecltype()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.STRTYPE.name(), hGrntitemDo.getStrtype()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.STRDATE.name(), hGrntitemDo.getStrdate()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.STRQTY.name(), hGrntitemDo.getStrqty()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.VALUEAMT.name(), hGrntitemDo.getValueamt()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.DUTYRATE.name(), hGrntitemDo.getDutyrate()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.AVLGRNTAMT.name(), hGrntitemDo.getAvlgrntamt()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.ODECLNO.name(), hGrntitemDo.getOdeclno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.PRDTNO.name(), hGrntitemDo.getPrdtno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.SERIALNO.name(), hGrntitemDo.getSerialno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.RMKS.name(), hGrntitemDo.getRmks()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.COMDTAXRATE.name(), hGrntitemDo.getComdtaxrate()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.VATAXRATE.name(), hGrntitemDo.getVataxrate()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.DECLQTY.name(), hGrntitemDo.getDeclqty()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.TAXAMT.name(), hGrntitemDo.getTaxamt()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.ISEVAL.name(), hGrntitemDo.getIseval()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.OITEMNO.name(), hGrntitemDo.getOitemno()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.CCCCODE.name(), hGrntitemDo.getCcccode()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.ITEM.name(), hGrntitemDo.getItem()); 
			dataObject.setValue(HGrntitemDo.COLUMNS.UPDTIME.name(), hGrntitemDo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HGrntitemDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HGrntitemDo po) { 
		sqlWhere.add(HGrntitemDo.COLUMNS.DECLTYPE.name(), po.getDecltype()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.STRDATE.name(), po.getStrdate()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.STRQTY.name(), po.getStrqty()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.VALUEAMT.name(), po.getValueamt()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.AVLGRNTAMT.name(), po.getAvlgrntamt()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.ODECLNO.name(), po.getOdeclno()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.SERIALNO.name(), po.getSerialno()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.RMKS.name(), po.getRmks()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.VATAXRATE.name(), po.getVataxrate()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.DECLQTY.name(), po.getDeclqty()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.TAXAMT.name(), po.getTaxamt()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.ISEVAL.name(), po.getIseval()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.OITEMNO.name(), po.getOitemno()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(HGrntitemDo.COLUMNS.UPDTIME.name(), po.getUpdtime()); 
	} 
 
} 
