package com.doc.common.dao.impl; 
 
public class ProductDAO extends GeneralDAOImpl<ProductDo> implements ProductDAO { 
	public static final ProductDAOImpl INSTANCE = new ProductDAOImpl(); 
	public static final String TABLENAME = "PRODUCT"; 

	public ProductDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ProductDo> CONVERTER = new MapConverter<ProductDo>() { 
 
		@Override 
		public ProductDo convert(final DataObject dataObject) { 
			final ProductDo productDo = new ProductDo(); 
			productDo.setBondno(dataObject.getString(ProductDo.COLUMNS.BONDNO.name())); 
			productDo.setCtmcode(dataObject.getString(ProductDo.COLUMNS.CTMCODE.name())); 
			productDo.setPrdtno(dataObject.getString(ProductDo.COLUMNS.PRDTNO.name())); 
			productDo.setDescrip(dataObject.getString(ProductDo.COLUMNS.DESCRIP.name())); 
			productDo.setUnit(dataObject.getString(ProductDo.COLUMNS.UNIT.name())); 
			productDo.setRefprdtno(dataObject.getString(ProductDo.COLUMNS.REFPRDTNO.name())); 
			productDo.setRevdate(dataObject.getString(ProductDo.COLUMNS.REVDATE.name())); 
			productDo.setCcccode(dataObject.getString(ProductDo.COLUMNS.CCCCODE.name())); 
			productDo.setDutyrate(BigDecimalUtils.formObj(dataObject.getString(ProductDo.COLUMNS.DUTYRATE.name()))); 
			productDo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getString(ProductDo.COLUMNS.COMDTAXRATE.name()))); 
			productDo.setBrand(dataObject.getString(ProductDo.COLUMNS.BRAND.name())); 
			productDo.setModel(dataObject.getString(ProductDo.COLUMNS.MODEL.name())); 
			productDo.setSpec(dataObject.getString(ProductDo.COLUMNS.SPEC.name())); 
			productDo.setUprice(BigDecimalUtils.formObj(dataObject.getString(ProductDo.COLUMNS.UPRICE.name()))); 
			productDo.setCur(dataObject.getString(ProductDo.COLUMNS.CUR.name())); 
			productDo.setCarryfreeqty(BigDecimalUtils.formObj(dataObject.getString(ProductDo.COLUMNS.CARRYFREEQTY.name()))); 
			productDo.setCarrydutyqty(BigDecimalUtils.formObj(dataObject.getString(ProductDo.COLUMNS.CARRYDUTYQTY.name()))); 
			return productDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductDo productDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductDo.COLUMNS.BONDNO.name(), productDo.getBondno()); 
			dataObject.setValue(ProductDo.COLUMNS.CTMCODE.name(), productDo.getCtmcode()); 
			dataObject.setValue(ProductDo.COLUMNS.PRDTNO.name(), productDo.getPrdtno()); 
			dataObject.setValue(ProductDo.COLUMNS.DESCRIP.name(), productDo.getDescrip()); 
			dataObject.setValue(ProductDo.COLUMNS.UNIT.name(), productDo.getUnit()); 
			dataObject.setValue(ProductDo.COLUMNS.REFPRDTNO.name(), productDo.getRefprdtno()); 
			dataObject.setValue(ProductDo.COLUMNS.REVDATE.name(), productDo.getRevdate()); 
			dataObject.setValue(ProductDo.COLUMNS.CCCCODE.name(), productDo.getCcccode()); 
			dataObject.setValue(ProductDo.COLUMNS.DUTYRATE.name(), productDo.getDutyrate()); 
			dataObject.setValue(ProductDo.COLUMNS.COMDTAXRATE.name(), productDo.getComdtaxrate()); 
			dataObject.setValue(ProductDo.COLUMNS.BRAND.name(), productDo.getBrand()); 
			dataObject.setValue(ProductDo.COLUMNS.MODEL.name(), productDo.getModel()); 
			dataObject.setValue(ProductDo.COLUMNS.SPEC.name(), productDo.getSpec()); 
			dataObject.setValue(ProductDo.COLUMNS.UPRICE.name(), productDo.getUprice()); 
			dataObject.setValue(ProductDo.COLUMNS.CUR.name(), productDo.getCur()); 
			dataObject.setValue(ProductDo.COLUMNS.CARRYFREEQTY.name(), productDo.getCarryfreeqty()); 
			dataObject.setValue(ProductDo.COLUMNS.CARRYDUTYQTY.name(), productDo.getCarrydutyqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductDo po) { 
		sqlWhere.add(ProductDo.COLUMNS.DESCRIP.name(), po.getDescrip()); 
		sqlWhere.add(ProductDo.COLUMNS.UNIT.name(), po.getUnit()); 
		sqlWhere.add(ProductDo.COLUMNS.REFPRDTNO.name(), po.getRefprdtno()); 
		sqlWhere.add(ProductDo.COLUMNS.REVDATE.name(), po.getRevdate()); 
		sqlWhere.add(ProductDo.COLUMNS.CCCCODE.name(), po.getCcccode()); 
		sqlWhere.add(ProductDo.COLUMNS.DUTYRATE.name(), po.getDutyrate()); 
		sqlWhere.add(ProductDo.COLUMNS.COMDTAXRATE.name(), po.getComdtaxrate()); 
		sqlWhere.add(ProductDo.COLUMNS.BRAND.name(), po.getBrand()); 
		sqlWhere.add(ProductDo.COLUMNS.MODEL.name(), po.getModel()); 
		sqlWhere.add(ProductDo.COLUMNS.SPEC.name(), po.getSpec()); 
		sqlWhere.add(ProductDo.COLUMNS.UPRICE.name(), po.getUprice()); 
		sqlWhere.add(ProductDo.COLUMNS.CUR.name(), po.getCur()); 
		sqlWhere.add(ProductDo.COLUMNS.CARRYFREEQTY.name(), po.getCarryfreeqty()); 
		sqlWhere.add(ProductDo.COLUMNS.CARRYDUTYQTY.name(), po.getCarrydutyqty()); 
	} 
 
} 
