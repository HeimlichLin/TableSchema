package com.doc.common.dao.impl; 
 
public class MaterialDetailDAOImpl extends GeneralDAOImpl<MaterialDetailPo> implements MaterialDetailDAO { 
	public static final MaterialDetailDAOImpl INSTANCE = new MaterialDetailDAOImpl(); 
	public static final String TABLENAME = "MATERIAL_DETAIL"; 

	public MaterialDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MaterialDetailPo> CONVERTER = new MapConverter<MaterialDetailPo>() { 
 
		@Override 
		public MaterialDetailPo convert(final DataObject dataObject) { 
			final MaterialDetailPo materialDetailPo = new MaterialDetailPo(); 
			materialDetailPo.setMaterialDetailIdenCode(dataObject.getString(MaterialDetailPo.COLUMNS.MATERIAL_DETAIL_IDEN_CODE.name())); 
			materialDetailPo.setMaterialAssoCode(dataObject.getString(MaterialDetailPo.COLUMNS.MATERIAL_ASSO_CODE.name())); 
			materialDetailPo.setProductContainerAssoCode(dataObject.getString(MaterialDetailPo.COLUMNS.PRODUCT_CONTAINER_ASSO_CODE.name())); 
			return materialDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MaterialDetailPo materialDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MaterialDetailPo.COLUMNS.MATERIAL_DETAIL_IDEN_CODE.name(), materialDetailPo.getMaterialDetailIdenCode()); 
			dataObject.setValue(MaterialDetailPo.COLUMNS.MATERIAL_ASSO_CODE.name(), materialDetailPo.getMaterialAssoCode()); 
			dataObject.setValue(MaterialDetailPo.COLUMNS.PRODUCT_CONTAINER_ASSO_CODE.name(), materialDetailPo.getProductContainerAssoCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MaterialDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MaterialDetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MaterialDetailPo.COLUMNS.MATERIAL_DETAIL_IDEN_CODE.name(), po.getMaterialDetailIdenCode()); 
		return sqlWhere; 
	} 
 
} 
