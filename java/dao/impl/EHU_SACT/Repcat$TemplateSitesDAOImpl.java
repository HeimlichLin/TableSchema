package com.doc.common.dao.impl; 
 
public class Repcat$TemplateSitesDAOImpl extends GeneralDAOImpl<Repcat$TemplateSitesPo> implements IRepcat$TemplateSitesDAO { 
	public static final Repcat$TemplateSitesDAOImpl INSTANCE = new Repcat$TemplateSitesDAOImpl(); 
	public static final String TABLENAME = "REPCAT$_TEMPLATE_SITES"; 

	public Repcat$TemplateSitesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Repcat$TemplateSitesPo> CONVERTER = new MapConverter<Repcat$TemplateSitesPo>() { 
 
		@Override 
		public Repcat$TemplateSitesPo convert(final DataObject dataObject) { 
			final Repcat$TemplateSitesPo repcat$TemplateSitesPo = new Repcat$TemplateSitesPo(); 
			repcat$TemplateSitesPo.setTemplateSiteId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.TEMPLATE_SITE_ID.name()))); 
			repcat$TemplateSitesPo.setRefreshTemplateName(dataObject.getString(Repcat$TemplateSitesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name())); 
			repcat$TemplateSitesPo.setRefreshGroupName(dataObject.getString(Repcat$TemplateSitesPo.COLUMNS.REFRESH_GROUP_NAME.name())); 
			repcat$TemplateSitesPo.setTemplateOwner(dataObject.getString(Repcat$TemplateSitesPo.COLUMNS.TEMPLATE_OWNER.name())); 
			repcat$TemplateSitesPo.setUserName(dataObject.getString(Repcat$TemplateSitesPo.COLUMNS.USER_NAME.name())); 
			repcat$TemplateSitesPo.setSiteName(dataObject.getString(Repcat$TemplateSitesPo.COLUMNS.SITE_NAME.name())); 
			repcat$TemplateSitesPo.setRepapiSiteId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.REPAPI_SITE_ID.name()))); 
			repcat$TemplateSitesPo.setStatus(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.STATUS.name()))); 
			repcat$TemplateSitesPo.setRefreshTemplateId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.REFRESH_TEMPLATE_ID.name()))); 
			repcat$TemplateSitesPo.setUserId(BigDecimalUtils.formObj(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.USER_ID.name()))); 
			repcat$TemplateSitesPo.setInstantiationDate(TimestampUtils.of(dataObject.getValue(Repcat$TemplateSitesPo.COLUMNS.INSTANTIATION_DATE.name()))); 
			return repcat$TemplateSitesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Repcat$TemplateSitesPo repcat$TemplateSitesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.TEMPLATE_SITE_ID.name(), repcat$TemplateSitesPo.getTemplateSiteId()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name(), repcat$TemplateSitesPo.getRefreshTemplateName()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.REFRESH_GROUP_NAME.name(), repcat$TemplateSitesPo.getRefreshGroupName()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.TEMPLATE_OWNER.name(), repcat$TemplateSitesPo.getTemplateOwner()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.USER_NAME.name(), repcat$TemplateSitesPo.getUserName()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.SITE_NAME.name(), repcat$TemplateSitesPo.getSiteName()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.REPAPI_SITE_ID.name(), repcat$TemplateSitesPo.getRepapiSiteId()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.STATUS.name(), repcat$TemplateSitesPo.getStatus()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.REFRESH_TEMPLATE_ID.name(), repcat$TemplateSitesPo.getRefreshTemplateId()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.USER_ID.name(), repcat$TemplateSitesPo.getUserId()); 
			dataObject.setValue(Repcat$TemplateSitesPo.COLUMNS.INSTANTIATION_DATE.name(), repcat$TemplateSitesPo.getInstantiationDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Repcat$TemplateSitesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Repcat$TemplateSitesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Repcat$TemplateSitesPo.COLUMNS.TEMPLATE_SITE_ID.name(), po.getTemplateSiteId()); 
		sqlWhere.add(Repcat$TemplateSitesPo.COLUMNS.REFRESH_TEMPLATE_NAME.name(), po.getRefreshTemplateName()); 
		sqlWhere.add(Repcat$TemplateSitesPo.COLUMNS.USER_NAME.name(), po.getUserName()); 
		sqlWhere.add(Repcat$TemplateSitesPo.COLUMNS.SITE_NAME.name(), po.getSiteName()); 
		sqlWhere.add(Repcat$TemplateSitesPo.COLUMNS.REPAPI_SITE_ID.name(), po.getRepapiSiteId()); 
		return sqlWhere; 
	} 
 
} 
