package com.doc.common.dao.impl; 
 
public class ProductDAOImpl extends GeneralDAOImpl<ProductPo> implements ProductDAO { 
	public static final ProductDAOImpl INSTANCE = new ProductDAOImpl(); 
	public static final String TABLENAME = "PRODUCT"; 

	public ProductDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductPo> CONVERTER = new MapConverter<ProductPo>() { 
 
		@Override 
		public ProductPo convert(final DataObject dataObject) { 
			final ProductPo productPo = new ProductPo(); 
			productPo.setBondno(dataObject.getString(ProductPo.COLUMNS.BONDNO.name())); 
			productPo.setCtmcode(dataObject.getString(ProductPo.COLUMNS.CTMCODE.name())); 
			productPo.setPrdtno(dataObject.getString(ProductPo.COLUMNS.PRDTNO.name())); 
			productPo.setDescrip(dataObject.getString(ProductPo.COLUMNS.DESCRIP.name())); 
			productPo.setUnit(dataObject.getString(ProductPo.COLUMNS.UNIT.name())); 
			productPo.setRefprdtno(dataObject.getString(ProductPo.COLUMNS.REFPRDTNO.name())); 
			productPo.setRevdate(dataObject.getString(ProductPo.COLUMNS.REVDATE.name())); 
			productPo.setCcccode(dataObject.getString(ProductPo.COLUMNS.CCCCODE.name())); 
			productPo.setDutyrate(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.DUTYRATE.name()))); 
			productPo.setComdtaxrate(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.COMDTAXRATE.name()))); 
			productPo.setBrand(dataObject.getString(ProductPo.COLUMNS.BRAND.name())); 
			productPo.setModel(dataObject.getString(ProductPo.COLUMNS.MODEL.name())); 
			productPo.setSpec(dataObject.getString(ProductPo.COLUMNS.SPEC.name())); 
			productPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.UPRICE.name()))); 
			productPo.setCur(dataObject.getString(ProductPo.COLUMNS.CUR.name())); 
			productPo.setCarryfreeqty(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.CARRYFREEQTY.name()))); 
			productPo.setCarrydutyqty(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.CARRYDUTYQTY.name()))); 
			return productPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductPo productPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductPo.COLUMNS.BONDNO.name(), productPo.getBondno()); 
			dataObject.setValue(ProductPo.COLUMNS.CTMCODE.name(), productPo.getCtmcode()); 
			dataObject.setValue(ProductPo.COLUMNS.PRDTNO.name(), productPo.getPrdtno()); 
			dataObject.setValue(ProductPo.COLUMNS.DESCRIP.name(), productPo.getDescrip()); 
			dataObject.setValue(ProductPo.COLUMNS.UNIT.name(), productPo.getUnit()); 
			dataObject.setValue(ProductPo.COLUMNS.REFPRDTNO.name(), productPo.getRefprdtno()); 
			dataObject.setValue(ProductPo.COLUMNS.REVDATE.name(), productPo.getRevdate()); 
			dataObject.setValue(ProductPo.COLUMNS.CCCCODE.name(), productPo.getCcccode()); 
			dataObject.setValue(ProductPo.COLUMNS.DUTYRATE.name(), productPo.getDutyrate()); 
			dataObject.setValue(ProductPo.COLUMNS.COMDTAXRATE.name(), productPo.getComdtaxrate()); 
			dataObject.setValue(ProductPo.COLUMNS.BRAND.name(), productPo.getBrand()); 
			dataObject.setValue(ProductPo.COLUMNS.MODEL.name(), productPo.getModel()); 
			dataObject.setValue(ProductPo.COLUMNS.SPEC.name(), productPo.getSpec()); 
			dataObject.setValue(ProductPo.COLUMNS.UPRICE.name(), productPo.getUprice()); 
			dataObject.setValue(ProductPo.COLUMNS.CUR.name(), productPo.getCur()); 
			dataObject.setValue(ProductPo.COLUMNS.CARRYFREEQTY.name(), productPo.getCarryfreeqty()); 
			dataObject.setValue(ProductPo.COLUMNS.CARRYDUTYQTY.name(), productPo.getCarrydutyqty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductPo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(ProductPo.COLUMNS.CTMCODE.name(), po.getCtmcode()); 
		sqlWhere.add(ProductPo.COLUMNS.PRDTNO.name(), po.getPrdtno()); 
		return sqlWhere; 
	} 
 
} 
