package com.doc.common.dao.impl; 
 
public class MaterialTraceDAOImpl extends GeneralDAOImpl<MaterialTracePo> implements MaterialTraceDAO { 
	public static final MaterialTraceDAOImpl INSTANCE = new MaterialTraceDAOImpl(); 
	public static final String TABLENAME = "MATERIAL_TRACE"; 

	public MaterialTraceDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MaterialTracePo> CONVERTER = new MapConverter<MaterialTracePo>() { 
 
		@Override 
		public MaterialTracePo convert(final DataObject dataObject) { 
			final MaterialTracePo materialTracePo = new MaterialTracePo(); 
			materialTracePo.setMaterialTraceIdenCode(dataObject.getString(MaterialTracePo.COLUMNS.MATERIAL_TRACE_IDEN_CODE.name())); 
			materialTracePo.setMaterialMasterAssoCode(dataObject.getString(MaterialTracePo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name())); 
			materialTracePo.setMaterialCompanyAssoCode(dataObject.getString(MaterialTracePo.COLUMNS.MATERIAL_COMPANY_ASSO_CODE.name())); 
			materialTracePo.setProductTraceCode(dataObject.getString(MaterialTracePo.COLUMNS.PRODUCT_TRACE_CODE.name())); 
			return materialTracePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MaterialTracePo materialTracePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MaterialTracePo.COLUMNS.MATERIAL_TRACE_IDEN_CODE.name(), materialTracePo.getMaterialTraceIdenCode()); 
			dataObject.setValue(MaterialTracePo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), materialTracePo.getMaterialMasterAssoCode()); 
			dataObject.setValue(MaterialTracePo.COLUMNS.MATERIAL_COMPANY_ASSO_CODE.name(), materialTracePo.getMaterialCompanyAssoCode()); 
			dataObject.setValue(MaterialTracePo.COLUMNS.PRODUCT_TRACE_CODE.name(), materialTracePo.getProductTraceCode()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MaterialTracePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MaterialTracePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MaterialTracePo.COLUMNS.MATERIAL_TRACE_IDEN_CODE.name(), po.getMaterialTraceIdenCode()); 
		sqlWhere.add(MaterialTracePo.COLUMNS.MATERIAL_MASTER_ASSO_CODE.name(), po.getMaterialMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
