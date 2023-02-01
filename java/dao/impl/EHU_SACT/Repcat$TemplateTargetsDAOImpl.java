package com.doc.common.dao.impl; 
 
public class Repcat$TemplateTargetsDAOImpl extends GeneralDAOImpl<Repcat$TemplateTargetsPo> implements IRepcat$TemplateTargetsDAO { 
	public static final Repcat$TemplateTargetsDAOImpl INSTANCE = new Repcat$TemplateTargetsDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_TARGETS"; 

	public Repcat$TemplateTargetsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateTargetsPo> CONVERTER = new MapConverter<Repcat$TemplateTargetsPo>() { 
 
		@Override 
		public Repcat$TemplateTargetsPo convert(final DataObject dataObject) { 
			final Repcat$TemplateTargetsPo repcat$TemplateTargetsPo = new Repcat$TemplateTargetsPo(); 
			repcat$TemplateTargetsPo.setTemplateTargetId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateTargetsPo.COLUMNS.TEMPLATE_TARGET_ID.name()))); 
			repcat$TemplateTargetsPo.setTargetDatabase(dataObject.getString(Repcat$TemplateTargetsPo.COLUMNS.TARGET_DATABASE.name())); 
			repcat$TemplateTargetsPo.setTargetComment(dataObject.getString(Repcat$TemplateTargetsPo.COLUMNS.TARGET_COMMENT.name())); 
			repcat$TemplateTargetsPo.setConnectString(dataObject.getString(Repcat$TemplateTargetsPo.COLUMNS.CONNECT_STRING.name())); 
			repcat$TemplateTargetsPo.setSpare1(dataObject.getString(Repcat$TemplateTargetsPo.COLUMNS.SPARE1.name())); 
			return repcat$TemplateTargetsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateTargetsPo repcat$TemplateTargetsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateTargetsPo.COLUMNS.TEMPLATE_TARGET_ID.name(), repcat$TemplateTargetsPo.getTemplateTargetId()); 
			dataObject.setValue(Repcat$TemplateTargetsPo.COLUMNS.TARGET_DATABASE.name(), repcat$TemplateTargetsPo.getTargetDatabase()); 
			dataObject.setValue(Repcat$TemplateTargetsPo.COLUMNS.TARGET_COMMENT.name(), repcat$TemplateTargetsPo.getTargetComment()); 
			dataObject.setValue(Repcat$TemplateTargetsPo.COLUMNS.CONNECT_STRING.name(), repcat$TemplateTargetsPo.getConnectString()); 
			dataObject.setValue(Repcat$TemplateTargetsPo.COLUMNS.SPARE1.name(), repcat$TemplateTargetsPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateTargetsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateTargetsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateTargetsPo.COLUMNS.TEMPLATE_TARGET_ID.name(), po.getTemplateTargetId()); 
		return sqlWhere; 
	} 
 
} 
