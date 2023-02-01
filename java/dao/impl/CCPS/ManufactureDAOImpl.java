package com.doc.common.dao.impl; 
 
public class ManufactureDAOImpl extends GeneralDAOImpl<ManufacturePo> implements ManufactureDAO { 
	public static final ManufactureDAOImpl INSTANCE = new ManufactureDAOImpl(); 
	public static final String TABLENAME = "MANUFACTURE"; 

	public ManufactureDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ManufacturePo> CONVERTER = new MapConverter<ManufacturePo>() { 
 
		@Override 
		public ManufacturePo convert(final DataObject dataObject) { 
			final ManufacturePo manufacturePo = new ManufacturePo(); 
			manufacturePo.setManufactureIdenCode(dataObject.getString(ManufacturePo.COLUMNS.MANUFACTURE_IDEN_CODE.name())); 
			manufacturePo.setBusinessInfoAssoCode(dataObject.getString(ManufacturePo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			manufacturePo.setFactoryInfoAssoCode(dataObject.getString(ManufacturePo.COLUMNS.FACTORY_INFO_ASSO_CODE.name())); 
			manufacturePo.setDeclareYear(dataObject.getString(ManufacturePo.COLUMNS.DECLARE_YEAR.name())); 
			manufacturePo.setDeclareMonth(dataObject.getString(ManufacturePo.COLUMNS.DECLARE_MONTH.name())); 
			manufacturePo.setDeclareDay(dataObject.getString(ManufacturePo.COLUMNS.DECLARE_DAY.name())); 
			manufacturePo.setDeclareSerialNumber(dataObject.getString(ManufacturePo.COLUMNS.DECLARE_SERIAL_NUMBER.name())); 
			manufacturePo.setProductInfoAssoCode(dataObject.getString(ManufacturePo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name())); 
			manufacturePo.setProductSpecAssoCode(dataObject.getString(ManufacturePo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			manufacturePo.setProductSelfCode(dataObject.getString(ManufacturePo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			manufacturePo.setProductName(dataObject.getString(ManufacturePo.COLUMNS.PRODUCT_NAME.name())); 
			manufacturePo.setPackageSpec(dataObject.getString(ManufacturePo.COLUMNS.PACKAGE_SPEC.name())); 
			manufacturePo.setWeight(dataObject.getString(ManufacturePo.COLUMNS.WEIGHT.name())); 
			manufacturePo.setManufactureQuantity(dataObject.getString(ManufacturePo.COLUMNS.MANUFACTURE_QUANTITY.name())); 
			return manufacturePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ManufacturePo manufacturePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ManufacturePo.COLUMNS.MANUFACTURE_IDEN_CODE.name(), manufacturePo.getManufactureIdenCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), manufacturePo.getBusinessInfoAssoCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.FACTORY_INFO_ASSO_CODE.name(), manufacturePo.getFactoryInfoAssoCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.DECLARE_YEAR.name(), manufacturePo.getDeclareYear()); 
			dataObject.setValue(ManufacturePo.COLUMNS.DECLARE_MONTH.name(), manufacturePo.getDeclareMonth()); 
			dataObject.setValue(ManufacturePo.COLUMNS.DECLARE_DAY.name(), manufacturePo.getDeclareDay()); 
			dataObject.setValue(ManufacturePo.COLUMNS.DECLARE_SERIAL_NUMBER.name(), manufacturePo.getDeclareSerialNumber()); 
			dataObject.setValue(ManufacturePo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), manufacturePo.getProductInfoAssoCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), manufacturePo.getProductSpecAssoCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.PRODUCT_SELF_CODE.name(), manufacturePo.getProductSelfCode()); 
			dataObject.setValue(ManufacturePo.COLUMNS.PRODUCT_NAME.name(), manufacturePo.getProductName()); 
			dataObject.setValue(ManufacturePo.COLUMNS.PACKAGE_SPEC.name(), manufacturePo.getPackageSpec()); 
			dataObject.setValue(ManufacturePo.COLUMNS.WEIGHT.name(), manufacturePo.getWeight()); 
			dataObject.setValue(ManufacturePo.COLUMNS.MANUFACTURE_QUANTITY.name(), manufacturePo.getManufactureQuantity()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ManufacturePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ManufacturePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ManufacturePo.COLUMNS.MANUFACTURE_IDEN_CODE.name(), po.getManufactureIdenCode()); 
		sqlWhere.add(ManufacturePo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), po.getProductInfoAssoCode()); 
		sqlWhere.add(ManufacturePo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), po.getProductSpecAssoCode()); 
		return sqlWhere; 
	} 
 
} 
