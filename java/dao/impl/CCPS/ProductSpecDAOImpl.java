package com.doc.common.dao.impl; 
 
public class ProductSpecDAOImpl extends GeneralDAOImpl<ProductSpecPo> implements ProductSpecDAO { 
	public static final ProductSpecDAOImpl INSTANCE = new ProductSpecDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_SPEC"; 

	public ProductSpecDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductSpecPo> CONVERTER = new MapConverter<ProductSpecPo>() { 
 
		@Override 
		public ProductSpecPo convert(final DataObject dataObject) { 
			final ProductSpecPo productSpecPo = new ProductSpecPo(); 
			productSpecPo.setProductSpecIdenCode(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_SPEC_IDEN_CODE.name())); 
			productSpecPo.setProductInfoAssoCode(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name())); 
			productSpecPo.setProductSpec(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_SPEC.name())); 
			productSpecPo.setPackageSpecForm(dataObject.getString(ProductSpecPo.COLUMNS.PACKAGE_SPEC_FORM.name())); 
			productSpecPo.setPackageSpecWeight(); 
			productSpecPo.setPackageSpecWeightType(dataObject.getString(ProductSpecPo.COLUMNS.PACKAGE_SPEC_WEIGHT_TYPE.name())); 
			productSpecPo.setPackageSpecTypeAssoCode(dataObject.getString(ProductSpecPo.COLUMNS.PACKAGE_SPEC_TYPE_ASSO_CODE.name())); 
			productSpecPo.setOuterPackageSpec(dataObject.getString(ProductSpecPo.COLUMNS.OUTER_PACKAGE_SPEC.name())); 
			productSpecPo.setPackageSpecBulkRemark(dataObject.getString(ProductSpecPo.COLUMNS.PACKAGE_SPEC_BULK_REMARK.name())); 
			productSpecPo.setPackageContainerRemark(dataObject.getString(ProductSpecPo.COLUMNS.PACKAGE_CONTAINER_REMARK.name())); 
			productSpecPo.setGeneticModificationLabel(dataObject.getString(ProductSpecPo.COLUMNS.GENETIC_MODIFICATION_LABEL.name())); 
			productSpecPo.setProductSelfCode(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			productSpecPo.setProductPackageGs1Code(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_PACKAGE_GS1_CODE.name())); 
			productSpecPo.setProductTraceCode(dataObject.getString(ProductSpecPo.COLUMNS.PRODUCT_TRACE_CODE.name())); 
			return productSpecPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductSpecPo productSpecPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_SPEC_IDEN_CODE.name(), productSpecPo.getProductSpecIdenCode()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), productSpecPo.getProductInfoAssoCode()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_SPEC.name(), productSpecPo.getProductSpec()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_SPEC_FORM.name(), productSpecPo.getPackageSpecForm()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_SPEC_WEIGHT.name(), productSpecPo.getPackageSpecWeight()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_SPEC_WEIGHT_TYPE.name(), productSpecPo.getPackageSpecWeightType()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_SPEC_TYPE_ASSO_CODE.name(), productSpecPo.getPackageSpecTypeAssoCode()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.OUTER_PACKAGE_SPEC.name(), productSpecPo.getOuterPackageSpec()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_SPEC_BULK_REMARK.name(), productSpecPo.getPackageSpecBulkRemark()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PACKAGE_CONTAINER_REMARK.name(), productSpecPo.getPackageContainerRemark()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.GENETIC_MODIFICATION_LABEL.name(), productSpecPo.getGeneticModificationLabel()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_SELF_CODE.name(), productSpecPo.getProductSelfCode()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_PACKAGE_GS1_CODE.name(), productSpecPo.getProductPackageGs1Code()); 
			dataObject.setValue(ProductSpecPo.COLUMNS.PRODUCT_TRACE_CODE.name(), productSpecPo.getProductTraceCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductSpecPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductSpecPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductSpecPo.COLUMNS.PRODUCT_SPEC_IDEN_CODE.name(), po.getProductSpecIdenCode()); 
		sqlWhere.add(ProductSpecPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), po.getProductInfoAssoCode()); 
		return sqlWhere; 
	} 
 
} 
