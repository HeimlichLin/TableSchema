package com.doc.common.dao.impl; 
 
public class ProductSellPackageDAOImpl extends GeneralDAOImpl<ProductSellPackagePo> implements ProductSellPackageDAO { 
	public static final ProductSellPackageDAOImpl INSTANCE = new ProductSellPackageDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_SELL_PACKAGE"; 

	public ProductSellPackageDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductSellPackagePo> CONVERTER = new MapConverter<ProductSellPackagePo>() { 
 
		@Override 
		public ProductSellPackagePo convert(final DataObject dataObject) { 
			final ProductSellPackagePo productSellPackagePo = new ProductSellPackagePo(); 
			productSellPackagePo.setProductSellPackageIdenCode(dataObject.getString(ProductSellPackagePo.COLUMNS.PRODUCT_SELL_PACKAGE_IDEN_CODE.name())); 
			productSellPackagePo.setProductInfoAssoCode(dataObject.getString(ProductSellPackagePo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name())); 
			productSellPackagePo.setProductSpecAssoCode(dataObject.getString(ProductSellPackagePo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			productSellPackagePo.setProductSelfCode(dataObject.getString(ProductSellPackagePo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			productSellPackagePo.setSellPackageType(dataObject.getString(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_TYPE.name())); 
			productSellPackagePo.setSellPackageWeight(); 
			productSellPackagePo.setSellPackageWeightType(dataObject.getString(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_WEIGHT_TYPE.name())); 
			productSellPackagePo.setSellPackageRemark(dataObject.getString(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_REMARK.name())); 
			return productSellPackagePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductSellPackagePo productSellPackagePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.PRODUCT_SELL_PACKAGE_IDEN_CODE.name(), productSellPackagePo.getProductSellPackageIdenCode()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), productSellPackagePo.getProductInfoAssoCode()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), productSellPackagePo.getProductSpecAssoCode()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.PRODUCT_SELF_CODE.name(), productSellPackagePo.getProductSelfCode()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_TYPE.name(), productSellPackagePo.getSellPackageType()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_WEIGHT.name(), productSellPackagePo.getSellPackageWeight()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_WEIGHT_TYPE.name(), productSellPackagePo.getSellPackageWeightType()); 
			dataObject.setValue(ProductSellPackagePo.COLUMNS.SELL_PACKAGE_REMARK.name(), productSellPackagePo.getSellPackageRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductSellPackagePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductSellPackagePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductSellPackagePo.COLUMNS.PRODUCT_SELL_PACKAGE_IDEN_CODE.name(), po.getProductSellPackageIdenCode()); 
		return sqlWhere; 
	} 
 
} 
