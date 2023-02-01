package com.doc.common.po.impl; 
 
public class Repcat$RefreshTemplatesPo implements IRepcat$RefreshTemplatesPo {
 
	public enum COLUMNS {
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table."), //
		OWNER("Owner of the refresh group template."), //
		REFRESH_GROUP_NAME("Name of the refresh group to create during instantiation."), //
		REFRESH_TEMPLATE_NAME("Name of the refresh group template."), //
		TEMPLATE_COMMENT("Optional comment field for the refresh group template."), //
		PUBLIC_TEMPLATE("Flag specifying public template or private template."), //
		LAST_MODIFIED("Date the row was last modified."), //
		MODIFIED_BY("User id of the user that modified the row."), //
		CREATION_DATE("Date the row was created."), //
		CREATED_BY("User id of the user that created the row."), //
		REFRESH_GROUP_ID("Internal primary key to default refresh group for the template."), //
		TEMPLATE_TYPE_ID("Internal primary key to the template types."), //
		TEMPLATE_STATUS_ID("Internal primary key to the template status table."), //
		FLAGS("Internal flags for the template."), //
		SPARE1("Reserved for future use.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal refreshTemplateId;
	private String owner;
	private String refreshGroupName;
	private String refreshTemplateName;
	private String templateComment;
	private String publicTemplate;
	private java.sql.Timestamp lastModified;
	private BigDecimal modifiedBy;
	private java.sql.Timestamp creationDate;
	private BigDecimal createdBy;
	private BigDecimal refreshGroupId;
	private BigDecimal templateTypeId;
	private BigDecimal templateStatusId;
	private String flags;
	private String spare1;

	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public String getOwner() {
		return this.owner;
	}
 
	@Override
	public void setOwner(final String owner) {
		this.owner = owner; 
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
	public String getRefreshTemplateName() {
		return this.refreshTemplateName;
	}
 
	@Override
	public void setRefreshTemplateName(final String refreshTemplateName) {
		this.refreshTemplateName = refreshTemplateName; 
	}
 
	@Override
	public String getTemplateComment() {
		return this.templateComment;
	}
 
	@Override
	public void setTemplateComment(final String templateComment) {
		this.templateComment = templateComment; 
	}
 
	@Override
	public String getPublicTemplate() {
		return this.publicTemplate;
	}
 
	@Override
	public void setPublicTemplate(final String publicTemplate) {
		this.publicTemplate = publicTemplate; 
	}
 
	@Override
	public java.sql.Timestamp getLastModified() {
		return this.lastModified;
	}
 
	@Override
	public void setLastModified(final java.sql.Timestamp lastModified) {
		this.lastModified = lastModified; 
	}
 
	@Override
	public BigDecimal getModifiedBy() {
		return this.modifiedBy;
	}
 
	@Override
	public void setModifiedBy(final BigDecimal modifiedBy) {
		this.modifiedBy = modifiedBy; 
	}
 
	@Override
	public java.sql.Timestamp getCreationDate() {
		return this.creationDate;
	}
 
	@Override
	public void setCreationDate(final java.sql.Timestamp creationDate) {
		this.creationDate = creationDate; 
	}
 
	@Override
	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}
 
	@Override
	public void setCreatedBy(final BigDecimal createdBy) {
		this.createdBy = createdBy; 
	}
 
	@Override
	public BigDecimal getRefreshGroupId() {
		return this.refreshGroupId;
	}
 
	@Override
	public void setRefreshGroupId(final BigDecimal refreshGroupId) {
		this.refreshGroupId = refreshGroupId; 
	}
 
	@Override
	public BigDecimal getTemplateTypeId() {
		return this.templateTypeId;
	}
 
	@Override
	public void setTemplateTypeId(final BigDecimal templateTypeId) {
		this.templateTypeId = templateTypeId; 
	}
 
	@Override
	public BigDecimal getTemplateStatusId() {
		return this.templateStatusId;
	}
 
	@Override
	public void setTemplateStatusId(final BigDecimal templateStatusId) {
		this.templateStatusId = templateStatusId; 
	}
 
	@Override
	public String getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final String flags) {
		this.flags = flags; 
	}
 
	@Override
	public String getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final String spare1) {
		this.spare1 = spare1; 
	}
 
}
