package com.doc.common.dao.impl; 
 
public class ProductListDAOImpl extends GeneralDAOImpl<ProductListPo> implements ProductListDAO { 
	public static final ProductListDAOImpl INSTANCE = new ProductListDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_LIST"; 

	public ProductListDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductListPo> CONVERTER = new MapConverter<ProductListPo>() { 
 
		@Override 
		public ProductListPo convert(final DataObject dataObject) { 
			final ProductListPo productListPo = new ProductListPo(); 
			productListPo.setProductMlistMasterIdenCode(dataObject.getString(ProductListPo.COLUMNS.PRODUCT_MLIST_MASTER_IDEN_CODE.name())); 
			productListPo.setBusinessInfoAssoCode(dataObject.getString(ProductListPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			productListPo.setFactoryInfoAssoCode(dataObject.getString(ProductListPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name())); 
			productListPo.setProductSpecAssoCode(dataObject.getString(ProductListPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			productListPo.setProductSelfCode(dataObject.getString(ProductListPo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			productListPo.setExpiryStartDay(dataObject.getString(ProductListPo.COLUMNS.EXPIRY_START_DAY.name())); 
			return productListPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductListPo productListPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductListPo.COLUMNS.PRODUCT_MLIST_MASTER_IDEN_CODE.name(), productListPo.getProductMlistMasterIdenCode()); 
			dataObject.setValue(ProductListPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), productListPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(ProductListPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name(), productListPo.getFactoryInfoAssoCode()); 
			dataObject.setValue(ProductListPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), productListPo.getProductSpecAssoCode()); 
			dataObject.setValue(ProductListPo.COLUMNS.PRODUCT_SELF_CODE.name(), productListPo.getProductSelfCode()); 
			dataObject.setValue(ProductListPo.COLUMNS.EXPIRY_START_DAY.name(), productListPo.getExpiryStartDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductListPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductListPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductListPo.COLUMNS.PRODUCT_MLIST_MASTER_IDEN_CODE.name(), po.getProductMlistMasterIdenCode()); 
		sqlWhere.add(ProductListPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), po.getProductSpecAssoCode()); 
		return sqlWhere; 
	} 
 
} 
