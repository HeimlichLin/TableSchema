package com.doc.common.dao.impl; 
 
public class Repcat$RefreshTemplatesDAOImpl extends GeneralDAOImpl<Repcat$RefreshTemplatesPo> implements IRepcat$RefreshTemplatesDAO { 
	public static final Repcat$RefreshTemplatesDAOImpl INSTANCE = new Repcat$RefreshTemplatesDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_REFRESH_TEMPLATES"; 

	public Repcat$RefreshTemplatesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$RefreshTemplatesPo> CONVERTER = new MapConverter<Repcat$RefreshTemplatesPo>() { 
 
		@Override 
		public Repcat$RefreshTemplatesPo convert(final DataObject dataObject) { 
			final Repcat$RefreshTemplatesPo repcat$RefreshTemplatesPo = new Repcat$RefreshTemplatesPo(); 
			repcat$RefreshTemplatesPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$RefreshTemplatesPo.setOwner(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.OWNER.name())); 
			repcat$RefreshTemplatesPo.setRefreshGroupName(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_GROUP_NAME.name())); 
			repcat$RefreshTemplatesPo.setRefreshTemplateName(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name())); 
			repcat$RefreshTemplatesPo.setTemplateComment(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_COMMENT.name())); 
			repcat$RefreshTemplatesPo.setPublicTemplate(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.PUBLIC_TEMPLATE.name())); 
			repcat$RefreshTemplatesPo.setLastModified(TimestampUtils.of(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.LAST_MODIFIED.name()))); 
			repcat$RefreshTemplatesPo.setModifiedBy(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.MODIFIED_BY.name()))); 
			repcat$RefreshTemplatesPo.setCreationDate(TimestampUtils.of(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.CREATION_DATE.name()))); 
			repcat$RefreshTemplatesPo.setCreatedBy(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.CREATED_BY.name()))); 
			repcat$RefreshTemplatesPo.setRefreshGroupId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_GROUP_ID.name()))); 
			repcat$RefreshTemplatesPo.setTemplateTypeId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_TYPE_ID.name()))); 
			repcat$RefreshTemplatesPo.setTemplateStatusId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_STATUS_ID.name()))); 
			repcat$RefreshTemplatesPo.setFlags(); 
			repcat$RefreshTemplatesPo.setSpare1(dataObject.getString(Repcat$RefreshTemplatesPo.COLUMNS.SPARE1.name())); 
			return repcat$RefreshTemplatesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$RefreshTemplatesPo repcat$RefreshTemplatesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$RefreshTemplatesPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.OWNER.name(), repcat$RefreshTemplatesPo.getOwner()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_GROUP_NAME.name(), repcat$RefreshTemplatesPo.getRefreshGroupName()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name(), repcat$RefreshTemplatesPo.getRefreshTemplateName()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_COMMENT.name(), repcat$RefreshTemplatesPo.getTemplateComment()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.PUBLIC_TEMPLATE.name(), repcat$RefreshTemplatesPo.getPublicTemplate()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.LAST_MODIFIED.name(), repcat$RefreshTemplatesPo.getLastModified()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.MODIFIED_BY.name(), repcat$RefreshTemplatesPo.getModifiedBy()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.CREATION_DATE.name(), repcat$RefreshTemplatesPo.getCreationDate()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.CREATED_BY.name(), repcat$RefreshTemplatesPo.getCreatedBy()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_GROUP_ID.name(), repcat$RefreshTemplatesPo.getRefreshGroupId()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_TYPE_ID.name(), repcat$RefreshTemplatesPo.getTemplateTypeId()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_STATUS_ID.name(), repcat$RefreshTemplatesPo.getTemplateStatusId()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.FLAGS.name(), repcat$RefreshTemplatesPo.getFlags()); 
			dataObject.setValue(Repcat$RefreshTemplatesPo.COLUMNS.SPARE1.name(), repcat$RefreshTemplatesPo.getSpare1()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$RefreshTemplatesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$RefreshTemplatesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), po.getRefreshTemplateId()); 
		sqlWhere.add(Repcat$RefreshTemplatesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name(), po.getRefreshTemplateName()); 
		sqlWhere.add(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_TYPE_ID.name(), po.getTemplateTypeId()); 
		sqlWhere.add(Repcat$RefreshTemplatesPo.COLUMNS.TEMPLATE_STATUS_ID.name(), po.getTemplateStatusId()); 
		return sqlWhere; 
	} 
 
} 
