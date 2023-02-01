package com.doc.common.dao.impl; 
 
public class Repcat$TemplateStatusDAOImpl extends GeneralDAOImpl<Repcat$TemplateStatusPo> implements IRepcat$TemplateStatusDAO { 
	public static final Repcat$TemplateStatusDAOImpl INSTANCE = new Repcat$TemplateStatusDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_STATUS"; 

	public Repcat$TemplateStatusDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateStatusPo> CONVERTER = new MapConverter<Repcat$TemplateStatusPo>() { 
 
		@Override 
		public Repcat$TemplateStatusPo convert(final DataObject dataObject) { 
			final Repcat$TemplateStatusPo repcat$TemplateStatusPo = new Repcat$TemplateStatusPo(); 
			repcat$TemplateStatusPo.setTemplateStatusId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateStatusPo.COLUMNS.TEMPLATE_STATUS_ID.name()))); 
			repcat$TemplateStatusPo.setStatusTypeName(dataObject.getString(Repcat$TemplateStatusPo.COLUMNS.STATUS_TYPE_NAME.name())); 
			return repcat$TemplateStatusPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateStatusPo repcat$TemplateStatusPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateStatusPo.COLUMNS.TEMPLATE_STATUS_ID.name(), repcat$TemplateStatusPo.getTemplateStatusId()); 
			dataObject.setValue(Repcat$TemplateStatusPo.COLUMNS.STATUS_TYPE_NAME.name(), repcat$TemplateStatusPo.getStatusTypeName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateStatusPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateStatusPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateStatusPo.COLUMNS.TEMPLATE_STATUS_ID.name(), po.getTemplateStatusId()); 
		return sqlWhere; 
	} 
 
} 
