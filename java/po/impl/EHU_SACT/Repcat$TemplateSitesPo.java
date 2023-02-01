package com.doc.common.po.impl; 
 
public class Repcat$TemplateSitesPo implements IRepcat$TemplateSitesPo {
 
	public enum COLUMNS {
		TEMPLATE_SITE_ID("Internal primary key of the REPCAT$_TEMPLATE_SITES table."), //
		REFRESH_TEMPLATE_NAME("Name of the refresh group template."), //
		REFRESH_GROUP_NAME("Name of the refresh group to create during instantiation."), //
		TEMPLATE_OWNER("Owner of the refresh group template."), //
		USER_NAME("Database user name."), //
		SITE_NAME("Name of the site that has instantiated the template."), //
		REPAPI_SITE_ID("Name of the site that has instantiated the template."), //
		STATUS("Obsolete - do not use."), //
		REFRESH_TEMPLATE_ID("Obsolete - do not use."), //
		USER_ID("Obsolete - do not use."), //
		INSTANTIATION_DATE("Date template was instantiated.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateSiteId;
	private String refreshTemplateName;
	private String refreshGroupName;
	private String templateOwner;
	private String userName;
	private String siteName;
	private BigDecimal repapiSiteId;
	private BigDecimal status;
	private BigDecimal refreshTemplateId;
	private BigDecimal userId;
	private java.sql.Timestamp instantiationDate;

	@Override
	public BigDecimal getTemplateSiteId() {
		return this.templateSiteId;
	}
 
	@Override
	public void setTemplateSiteId(final BigDecimal templateSiteId) {
		this.templateSiteId = templateSiteId; 
	}
 
	@Override
	public String getRefreshTemplateName() {
		return this.refreshTemplateName;
	}
 
	@Override
	public void setRefreshTemplateName(final String refreshTemplateName) {
		this.refreshTemplateName = refreshTemplateName; 
	}
 
	@Override
	public String getRefreshGroupName() {
		return this.refreshGroupName;
	}
 
	@Override
	public void setRefreshGroupName(final String refreshGroupName) {
		this.refreshGroupName = refreshGroupName; 
	}
 
	@Override
	public String getTemplateOwner() {
		return this.templateOwner;
	}
 
	@Override
	public void setTemplateOwner(final String templateOwner) {
		this.templateOwner = templateOwner; 
	}
 
	@Override
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
	@Override
	public String getSiteName() {
		return this.siteName;
	}
 
	@Override
	public void setSiteName(final String siteName) {
		this.siteName = siteName; 
	}
 
	@Override
	public BigDecimal getRepapiSiteId() {
		return this.repapiSiteId;
	}
 
	@Override
	public void setRepapiSiteId(final BigDecimal repapiSiteId) {
		this.repapiSiteId = repapiSiteId; 
	}
 
	@Override
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
	}
 
	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public BigDecimal getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final BigDecimal userId) {
		this.userId = userId; 
	}
 
	@Override
	public java.sql.Timestamp getInstantiationDate() {
		return this.instantiationDate;
	}
 
	@Override
	public void setInstantiationDate(final java.sql.Timestamp instantiationDate) {
		this.instantiationDate = instantiationDate; 
	}
 
}
