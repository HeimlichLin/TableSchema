package com.doc.common.dao.impl; 
 
public class HGrntitemDAOImpl extends GeneralDAOImpl<HGrntitemPo> implements HGrntitemDAO { 
	public static final HGrntitemDAOImpl INSTANCE = new HGrntitemDAOImpl(); 
	public static final String TABLENAME = "H_GRNTITEM"; 

	public HGrntitemDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HGrntitemPo> CONVERTER = new MapConverter<HGrntitemPo>() { 
 
		@Override 
		public HGrntitemPo convert(final DataObject dataObject) { 
			final HGrntitemPo hGrntitemPo = new HGrntitemPo(); 
			hGrntitemPo.setBondno(dataObject.getString(HGrntitemPo.COLUMNS.BONDNO.name())); 
			hGrntitemPo.setRefbillno(dataObject.getString(HGrntitemPo.COLUMNS.REFBILLNO.name())); 
			hGrntitemPo.setDeclno(dataObject.getString(HGrntitemPo.COLUMNS.DECLNO.name())); 
			hGrntitemPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.ITEMNO.name()))); 
			hGrntitemPo.setStrpost(dataObject.getString(HGrntitemPo.COLUMNS.STRPOST.name())); 
			hGrntitemPo.setDecltype(dataObject.getString(HGrntitemPo.COLUMNS.DECLTYPE.name())); 
			hGrntitemPo.setStrtype(dataObject.getString(HGrntitemPo.COLUMNS.STRTYPE.name())); 
			hGrntitemPo.setStrdate(dataObject.getString(HGrntitemPo.COLUMNS.STRDATE.name())); 
			hGrntitemPo.setStrqty(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.STRQTY.name()))); 
			hGrntitemPo.setValueamt(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.VALUEAMT.name()))); 
			hGrntitemPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.DUTYRATE.name()))); 
			hGrntitemPo.setAvlgrntamt(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.AVLGRNTAMT.name()))); 
			hGrntitemPo.setOdeclno(dataObject.getString(HGrntitemPo.COLUMNS.ODECLNO.name())); 
			hGrntitemPo.setPrdtno(dataObject.getString(HGrntitemPo.COLUMNS.PRDTNO.name())); 
			hGrntitemPo.setSerialno(dataObject.getString(HGrntitemPo.COLUMNS.SERIALNO.name())); 
			hGrntitemPo.setRmks(dataObject.getString(HGrntitemPo.COLUMNS.RMKS.name())); 
			hGrntitemPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.COMDTAXRATE.name()))); 
			hGrntitemPo.setVataxrate(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.VATAXRATE.name()))); 
			hGrntitemPo.setDeclqty(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.DECLQTY.name()))); 
			hGrntitemPo.setTaxamt(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.TAXAMT.name()))); 
			hGrntitemPo.setIseval(dataObject.getString(HGrntitemPo.COLUMNS.ISEVAL.name())); 
			hGrntitemPo.setOitemno(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.OITEMNO.name()))); 
			hGrntitemPo.setCcccode(dataObject.getString(HGrntitemPo.COLUMNS.CCCCODE.name())); 
			hGrntitemPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(HGrntitemPo.COLUMNS.ITEM.name()))); 
			hGrntitemPo.setUpdtime(dataObject.getString(HGrntitemPo.COLUMNS.UPDTIME.name())); 
			return hGrntitemPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HGrntitemPo hGrntitemPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HGrntitemPo.COLUMNS.BONDNO.name(), hGrntitemPo.getBondno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.REFBILLNO.name(), hGrntitemPo.getRefbillno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.DECLNO.name(), hGrntitemPo.getDeclno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.ITEMNO.name(), hGrntitemPo.getItemno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.STRPOST.name(), hGrntitemPo.getStrpost()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.DECLTYPE.name(), hGrntitemPo.getDecltype()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.STRTYPE.name(), hGrntitemPo.getStrtype()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.STRDATE.name(), hGrntitemPo.getStrdate()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.STRQTY.name(), hGrntitemPo.getStrqty()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.VALUEAMT.name(), hGrntitemPo.getValueamt()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.DUTYRATE.name(), hGrntitemPo.getDutyrate()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.AVLGRNTAMT.name(), hGrntitemPo.getAvlgrntamt()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.ODECLNO.name(), hGrntitemPo.getOdeclno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.PRDTNO.name(), hGrntitemPo.getPrdtno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.SERIALNO.name(), hGrntitemPo.getSerialno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.RMKS.name(), hGrntitemPo.getRmks()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.COMDTAXRATE.name(), hGrntitemPo.getComdtaxrate()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.VATAXRATE.name(), hGrntitemPo.getVataxrate()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.DECLQTY.name(), hGrntitemPo.getDeclqty()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.TAXAMT.name(), hGrntitemPo.getTaxamt()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.ISEVAL.name(), hGrntitemPo.getIseval()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.OITEMNO.name(), hGrntitemPo.getOitemno()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.CCCCODE.name(), hGrntitemPo.getCcccode()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.ITEM.name(), hGrntitemPo.getItem()); 
			dataObject.setValue(HGrntitemPo.COLUMNS.UPDTIME.name(), hGrntitemPo.getUpdtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HGrntitemPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HGrntitemPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(HGrntitemPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(HGrntitemPo.COLUMNS.REFBILLNO.name(), po.getRefbillno()); 
		sqlWhere.add(HGrntitemPo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(HGrntitemPo.COLUMNS.ITEMNO.name(), po.getItemno()); 
		sqlWhere.add(HGrntitemPo.COLUMNS.STRPOST.name(), po.getStrpost()); 
		sqlWhere.add(HGrntitemPo.COLUMNS.ITEM.name(), po.getItem()); 
		return sqlWhere; 
	} 
 
} 
