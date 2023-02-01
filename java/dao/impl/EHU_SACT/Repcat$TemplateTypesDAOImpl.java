package com.doc.common.dao.impl; 
 
public class Repcat$TemplateTypesDAOImpl extends GeneralDAOImpl<Repcat$TemplateTypesPo> implements IRepcat$TemplateTypesDAO { 
	public static final Repcat$TemplateTypesDAOImpl INSTANCE = new Repcat$TemplateTypesDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_TYPES"; 

	public Repcat$TemplateTypesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateTypesPo> CONVERTER = new MapConverter<Repcat$TemplateTypesPo>() { 
 
		@Override 
		public Repcat$TemplateTypesPo convert(final DataObject dataObject) { 
			final Repcat$TemplateTypesPo repcat$TemplateTypesPo = new Repcat$TemplateTypesPo(); 
			repcat$TemplateTypesPo.setTemplateTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateTypesPo.COLUMNS.TEMPLATE_TYPE_ID.name()))); 
			repcat$TemplateTypesPo.setTemplateDescription(dataObject.getString(Repcat$TemplateTypesPo.COLUMNS.TEMPLATE_DESCRIPTION.name())); 
			repcat$TemplateTypesPo.setFlags(); 
			repcat$TemplateTypesPo.setSpare1(dataObject.getString(Repcat$TemplateTypesPo.COLUMNS.SPARE1.name())); 
			return repcat$TemplateTypesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateTypesPo repcat$TemplateTypesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateTypesPo.COLUMNS.TEMPLATE_TYPE_ID.name(), repcat$TemplateTypesPo.getTemplateTypeId()); 
			dataObject.setValue(Repcat$TemplateTypesPo.COLUMNS.TEMPLATE_DESCRIPTION.name(), repcat$TemplateTypesPo.getTemplateDescription()); 
			dataObject.setValue(Repcat$TemplateTypesPo.COLUMNS.FLAGS.name(), repcat$TemplateTypesPo.getFlags()); 
			dataObject.setValue(Repcat$TemplateTypesPo.COLUMNS.SPARE1.name(), repcat$TemplateTypesPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateTypesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateTypesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateTypesPo.COLUMNS.TEMPLATE_TYPE_ID.name(), po.getTemplateTypeId()); 
		return sqlWhere; 
	} 
 
} 
