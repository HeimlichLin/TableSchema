package com.doc.common.dao.impl; 
 
public class ProductListDetailDAOImpl extends GeneralDAOImpl<ProductListDetailPo> implements ProductListDetailDAO { 
	public static final ProductListDetailDAOImpl INSTANCE = new ProductListDetailDAOImpl(); 
	public static final String TABLENAME = "PRODUCT_LIST_DETAIL"; 

	public ProductListDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProductListDetailPo> CONVERTER = new MapConverter<ProductListDetailPo>() { 
 
		@Override 
		public ProductListDetailPo convert(final DataObject dataObject) { 
			final ProductListDetailPo productListDetailPo = new ProductListDetailPo(); 
			productListDetailPo.setProductMlistDetailIdenCode(dataObject.getString(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_DETAIL_IDEN_CODE.name())); 
			productListDetailPo.setProductMlistMasterAssoCode(dataObject.getString(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_MASTER_ASSO_CODE.name())); 
			productListDetailPo.setMaterialMasterAssoCode(dataObject.getString(ProductListDetailPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name())); 
			productListDetailPo.setMaterialSelfCode(dataObject.getString(ProductListDetailPo.COLUMNS.MATERIAL_SELF_CODE.name())); 
			productListDetailPo.setMaterialName(dataObject.getString(ProductListDetailPo.COLUMNS.MATERIAL_NAME.name())); 
			return productListDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProductListDetailPo productListDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_DETAIL_IDEN_CODE.name(), productListDetailPo.getProductMlistDetailIdenCode()); 
			dataObject.setValue(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_MASTER_ASSO_CODE.name(), productListDetailPo.getProductMlistMasterAssoCode()); 
			dataObject.setValue(ProductListDetailPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), productListDetailPo.getMaterialMasterAssoCode()); 
			dataObject.setValue(ProductListDetailPo.COLUMNS.MATERIAL_SELF_CODE.name(), productListDetailPo.getMaterialSelfCode()); 
			dataObject.setValue(ProductListDetailPo.COLUMNS.MATERIAL_NAME.name(), productListDetailPo.getMaterialName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProductListDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProductListDetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_DETAIL_IDEN_CODE.name(), po.getProductMlistDetailIdenCode()); 
		sqlWhere.add(ProductListDetailPo.COLUMNS.PRODUCT_MLIST_MASTER_ASSO_CODE.name(), po.getProductMlistMasterAssoCode()); 
		sqlWhere.add(ProductListDetailPo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), po.getMaterialMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
