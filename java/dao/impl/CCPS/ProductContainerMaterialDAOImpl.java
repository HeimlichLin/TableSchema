package com.doc.common.dao.impl; 
 
public class ProductContainerMaterialDAOImpl extends GeneralDAOImpl<ProductContainerMaterialPo> implements ProductContainerMaterialDAO { 
	public static final ProductContainerMaterialDAOImpl INSTANCE = new ProductContainerMaterialDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_CONTAINER_MATERIAL"; 

	public ProductContainerMaterialDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductContainerMaterialPo> CONVERTER = new MapConverter<ProductContainerMaterialPo>() { 
 
		@Override 
		public ProductContainerMaterialPo convert(final DataObject dataObject) { 
			final ProductContainerMaterialPo productContainerMaterialPo = new ProductContainerMaterialPo(); 
			productContainerMaterialPo.setProductMaterialIdenCode(dataObject.getString(ProductContainerMaterialPo.COLUMNS.PRODUCT_MATERIAL_IDEN_CODE.name())); 
			productContainerMaterialPo.setProductSpecAssoCode(dataObject.getString(ProductContainerMaterialPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			productContainerMaterialPo.setProductSelfCode(dataObject.getString(ProductContainerMaterialPo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			productContainerMaterialPo.setPackageMateriaAssoCode(dataObject.getString(ProductContainerMaterialPo.COLUMNS.PACKAGE_MATERIA_ASSO_CODE.name())); 
			return productContainerMaterialPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductContainerMaterialPo productContainerMaterialPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductContainerMaterialPo.COLUMNS.PRODUCT_MATERIAL_IDEN_CODE.name(), productContainerMaterialPo.getProductMaterialIdenCode()); 
			dataObject.setValue(ProductContainerMaterialPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), productContainerMaterialPo.getProductSpecAssoCode()); 
			dataObject.setValue(ProductContainerMaterialPo.COLUMNS.PRODUCT_SELF_CODE.name(), productContainerMaterialPo.getProductSelfCode()); 
			dataObject.setValue(ProductContainerMaterialPo.COLUMNS.PACKAGE_MATERIA_ASSO_CODE.name(), productContainerMaterialPo.getPackageMateriaAssoCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductContainerMaterialPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductContainerMaterialPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductContainerMaterialPo.COLUMNS.PRODUCT_MATERIAL_IDEN_CODE.name(), po.getProductMaterialIdenCode()); 
		sqlWhere.add(ProductContainerMaterialPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), po.getProductSpecAssoCode()); 
		return sqlWhere; 
	} 
 
} 
