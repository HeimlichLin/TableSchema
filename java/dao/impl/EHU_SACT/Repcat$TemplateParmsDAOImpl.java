package com.doc.common.dao.impl; 
 
public class Repcat$TemplateParmsDAOImpl extends GeneralDAOImpl<Repcat$TemplateParmsPo> implements IRepcat$TemplateParmsDAO { 
	public static final Repcat$TemplateParmsDAOImpl INSTANCE = new Repcat$TemplateParmsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_PARMS"; 

	public Repcat$TemplateParmsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateParmsPo> CONVERTER = new MapConverter<Repcat$TemplateParmsPo>() { 
 
		@Override 
		public Repcat$TemplateParmsPo convert(final DataObject dataObject) { 
			final Repcat$TemplateParmsPo repcat$TemplateParmsPo = new Repcat$TemplateParmsPo(); 
			repcat$TemplateParmsPo.setTemplateParameterId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name()))); 
			repcat$TemplateParmsPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateParmsPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$TemplateParmsPo.setParameterName(dataObject.getString(Repcat$TemplateParmsPo.COLUMNS.PARAMETER_NAME.name())); 
			repcat$TemplateParmsPo.setDefaultParmValue(); 
			repcat$TemplateParmsPo.setPromptString(dataObject.getString(Repcat$TemplateParmsPo.COLUMNS.PROMPT_STRING.name())); 
			repcat$TemplateParmsPo.setUserOverride(dataObject.getString(Repcat$TemplateParmsPo.COLUMNS.USER_OVERRIDE.name())); 
			return repcat$TemplateParmsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateParmsPo repcat$TemplateParmsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), repcat$TemplateParmsPo.getTemplateParameterId()); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$TemplateParmsPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.PARAMETER_NAME.name(), repcat$TemplateParmsPo.getParameterName()); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.DEFAULT_PARM_VALUE.name(), repcat$TemplateParmsPo.getDefaultParmValue()); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.PROMPT_STRING.name(), repcat$TemplateParmsPo.getPromptString()); 
			dataObject.setValue(Repcat$TemplateParmsPo.COLUMNS.USER_OVERRIDE.name(), repcat$TemplateParmsPo.getUserOverride()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateParmsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateParmsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateParmsPo.COLUMNS.TEMPLATE_PARAMETER_ID.name(), po.getTemplateParameterId()); 
		sqlWhere.add(Repcat$TemplateParmsPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$TemplateParmsPo.COLUMNS.PARAMETER_NAME.name(), po.getParameterName()); 
		return sqlWhere; 
	} 
 
} 
