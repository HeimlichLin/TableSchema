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
			productPo.setBfNo(dataObject.getString(ProductPo.COLUMNS.BF_NO.name())); 
			productPo.setCtmCode(dataObject.getString(ProductPo.COLUMNS.CTM_CODE.name())); 
			productPo.setPrdtNo(dataObject.getString(ProductPo.COLUMNS.PRDT_NO.name())); 
			productPo.setDescrip(dataObject.getString(ProductPo.COLUMNS.DESCRIP.name())); 
			productPo.setUnit(dataObject.getString(ProductPo.COLUMNS.UNIT.name())); 
			productPo.setRefprdtNo(dataObject.getString(ProductPo.COLUMNS.REFPRDT_NO.name())); 
			productPo.setRevDate(dataObject.getString(ProductPo.COLUMNS.REV_DATE.name())); 
			productPo.setCccCode(dataObject.getString(ProductPo.COLUMNS.CCC_CODE.name())); 
			productPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.DUTY_RATE.name()))); 
			productPo.setComdTaxRate(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.COMD_TAX_RATE.name()))); 
			productPo.setBrand(dataObject.getString(ProductPo.COLUMNS.BRAND.name())); 
			productPo.setModel(dataObject.getString(ProductPo.COLUMNS.MODEL.name())); 
			productPo.setSpec(dataObject.getString(ProductPo.COLUMNS.SPEC.name())); 
			productPo.setUprice(BigDecimalUtils.formObj(dataObject.getValue(ProductPo.COLUMNS.UPRICE.name()))); 
			productPo.setCur(dataObject.getString(ProductPo.COLUMNS.CUR.name())); 
			productPo.setMakePlace(dataObject.getString(ProductPo.COLUMNS.MAKE_PLACE.name())); 
			productPo.setStatus(dataObject.getString(ProductPo.COLUMNS.STATUS.name())); 
			return productPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductPo productPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductPo.COLUMNS.BF_NO.name(), productPo.getBfNo()); 
			dataObject.setValue(ProductPo.COLUMNS.CTM_CODE.name(), productPo.getCtmCode()); 
			dataObject.setValue(ProductPo.COLUMNS.PRDT_NO.name(), productPo.getPrdtNo()); 
			dataObject.setValue(ProductPo.COLUMNS.DESCRIP.name(), productPo.getDescrip()); 
			dataObject.setValue(ProductPo.COLUMNS.UNIT.name(), productPo.getUnit()); 
			dataObject.setValue(ProductPo.COLUMNS.REFPRDT_NO.name(), productPo.getRefprdtNo()); 
			dataObject.setValue(ProductPo.COLUMNS.REV_DATE.name(), productPo.getRevDate()); 
			dataObject.setValue(ProductPo.COLUMNS.CCC_CODE.name(), productPo.getCccCode()); 
			dataObject.setValue(ProductPo.COLUMNS.DUTY_RATE.name(), productPo.getDutyRate()); 
			dataObject.setValue(ProductPo.COLUMNS.COMD_TAX_RATE.name(), productPo.getComdTaxRate()); 
			dataObject.setValue(ProductPo.COLUMNS.BRAND.name(), productPo.getBrand()); 
			dataObject.setValue(ProductPo.COLUMNS.MODEL.name(), productPo.getModel()); 
			dataObject.setValue(ProductPo.COLUMNS.SPEC.name(), productPo.getSpec()); 
			dataObject.setValue(ProductPo.COLUMNS.UPRICE.name(), productPo.getUprice()); 
			dataObject.setValue(ProductPo.COLUMNS.CUR.name(), productPo.getCur()); 
			dataObject.setValue(ProductPo.COLUMNS.MAKE_PLACE.name(), productPo.getMakePlace()); 
			dataObject.setValue(ProductPo.COLUMNS.STATUS.name(), productPo.getStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(ProductPo.COLUMNS.CTM_CODE.name(), po.getCtmCode()); 
		sqlWhere.add(ProductPo.COLUMNS.PRDT_NO.name(), po.getPrdtNo()); 
		return sqlWhere; 
	} 
 
} 
