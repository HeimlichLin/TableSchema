package com.doc.common.dao.impl; 
 
public class MaterialOriginDAOImpl extends GeneralDAOImpl<MaterialOriginPo> implements MaterialOriginDAO { 
	public static final MaterialOriginDAOImpl INSTANCE = new MaterialOriginDAOImpl(); 
	public static final String TABLENAME = "MATERIAL_ORIGIN"; 

	public MaterialOriginDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MaterialOriginPo> CONVERTER = new MapConverter<MaterialOriginPo>() { 
 
		@Override 
		public MaterialOriginPo convert(final DataObject dataObject) { 
			final MaterialOriginPo materialOriginPo = new MaterialOriginPo(); 
			materialOriginPo.setMaterialOriginIdenCode(dataObject.getString(MaterialOriginPo.COLUMNS.MATERIAL_ORIGIN_IDEN_CODE.name())); 
			materialOriginPo.setMaterialCompanyAssoCode(dataObject.getString(MaterialOriginPo.COLUMNS.MATERIAL_COMPANY_ASSO_CODE.name())); 
			materialOriginPo.setOriginCountryAssoCode(dataObject.getString(MaterialOriginPo.COLUMNS.ORIGIN_COUNTRY_ASSO_CODE.name())); 
			return materialOriginPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MaterialOriginPo materialOriginPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MaterialOriginPo.COLUMNS.MATERIAL_ORIGIN_IDEN_CODE.name(), materialOriginPo.getMaterialOriginIdenCode()); 
			dataObject.setValue(MaterialOriginPo.COLUMNS.MATERIAL_COMPANY_ASSO_CODE.name(), materialOriginPo.getMaterialCompanyAssoCode()); 
			dataObject.setValue(MaterialOriginPo.COLUMNS.ORIGIN_COUNTRY_ASSO_CODE.name(), materialOriginPo.getOriginCountryAssoCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MaterialOriginPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MaterialOriginPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MaterialOriginPo.COLUMNS.MATERIAL_ORIGIN_IDEN_CODE.name(), po.getMaterialOriginIdenCode()); 
		sqlWhere.add(MaterialOriginPo.COLUMNS.MATERIAL_COMPANY_ASSO_CODE.name(), po.getMaterialCompanyAssoCode()); 
		sqlWhere.add(MaterialOriginPo.COLUMNS.ORIGIN_COUNTRY_ASSO_CODE.name(), po.getOriginCountryAssoCode()); 
		return sqlWhere; 
	} 
 
} 
