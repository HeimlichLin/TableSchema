package com.doc.common.dao.impl; 
 
public class ProductInfoDAOImpl extends GeneralDAOImpl<ProductInfoPo> implements ProductInfoDAO { 
	public static final ProductInfoDAOImpl INSTANCE = new ProductInfoDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_INFO"; 

	public ProductInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductInfoPo> CONVERTER = new MapConverter<ProductInfoPo>() { 
 
		@Override 
		public ProductInfoPo convert(final DataObject dataObject) { 
			final ProductInfoPo productInfoPo = new ProductInfoPo(); 
			productInfoPo.setProductInfoMasterIdenCode(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_INFO_MASTER_IDEN_CODE.name())); 
			productInfoPo.setBusinessInfoAssoCode(dataObject.getString(ProductInfoPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			productInfoPo.setFactoryInfoAssoCode(dataObject.getString(ProductInfoPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name())); 
			productInfoPo.setProductSortBig(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_SORT_BIG.name())); 
			productInfoPo.setProductSortMid(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_SORT_MID.name())); 
			productInfoPo.setProductSortSmall(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_SORT_SMALL.name())); 
			productInfoPo.setProductSortCareful(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_SORT_CAREFUL.name())); 
			productInfoPo.setProductChineseName(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_CHINESE_NAME.name())); 
			productInfoPo.setProductEngName(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_ENG_NAME.name())); 
			productInfoPo.setStorageTransCondition(dataObject.getString(ProductInfoPo.COLUMNS.STORAGE_TRANS_CONDITION.name())); 
			productInfoPo.setStorageTransConditionRemark(dataObject.getString(ProductInfoPo.COLUMNS.STORAGE_TRANS_CONDITION_REMARK.name())); 
			productInfoPo.setOtherStorageTransCondition(dataObject.getString(ProductInfoPo.COLUMNS.OTHER_STORAGE_TRANS_CONDITION.name())); 
			productInfoPo.setResponsibleCompanyCode(dataObject.getString(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_CODE.name())); 
			productInfoPo.setResponsibleCompanyName(dataObject.getString(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_NAME.name())); 
			productInfoPo.setResponsibleCompanyAddress(dataObject.getString(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_ADDRESS.name())); 
			productInfoPo.setTransfatCaveat(dataObject.getString(ProductInfoPo.COLUMNS.TRANSFAT_CAVEAT.name())); 
			productInfoPo.setWarning(); 
			productInfoPo.setFeature(); 
			productInfoPo.setRecommendFoodMethod(); 
			productInfoPo.setProductUrl(dataObject.getString(ProductInfoPo.COLUMNS.PRODUCT_URL.name())); 
			return productInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductInfoPo productInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_INFO_MASTER_IDEN_CODE.name(), productInfoPo.getProductInfoMasterIdenCode()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), productInfoPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.FACTORY_INFO_ASSO_CODE.name(), productInfoPo.getFactoryInfoAssoCode()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_SORT_BIG.name(), productInfoPo.getProductSortBig()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_SORT_MID.name(), productInfoPo.getProductSortMid()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_SORT_SMALL.name(), productInfoPo.getProductSortSmall()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_SORT_CAREFUL.name(), productInfoPo.getProductSortCareful()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_CHINESE_NAME.name(), productInfoPo.getProductChineseName()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_ENG_NAME.name(), productInfoPo.getProductEngName()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.STORAGE_TRANS_CONDITION.name(), productInfoPo.getStorageTransCondition()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.STORAGE_TRANS_CONDITION_REMARK.name(), productInfoPo.getStorageTransConditionRemark()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.OTHER_STORAGE_TRANS_CONDITION.name(), productInfoPo.getOtherStorageTransCondition()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_CODE.name(), productInfoPo.getResponsibleCompanyCode()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_NAME.name(), productInfoPo.getResponsibleCompanyName()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.RESPONSIBLE_COMPANY_ADDRESS.name(), productInfoPo.getResponsibleCompanyAddress()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.TRANSFAT_CAVEAT.name(), productInfoPo.getTransfatCaveat()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.WARNING.name(), productInfoPo.getWarning()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.FEATURE.name(), productInfoPo.getFeature()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.RECOMMEND_FOOD_METHOD.name(), productInfoPo.getRecommendFoodMethod()); 
			dataObject.setValue(ProductInfoPo.COLUMNS.PRODUCT_URL.name(), productInfoPo.getProductUrl()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductInfoPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductInfoPo.COLUMNS.PRODUCT_INFO_MASTER_IDEN_CODE.name(), po.getProductInfoMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
