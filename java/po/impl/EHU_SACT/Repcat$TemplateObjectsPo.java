package com.doc.common.po.impl; 
 
public class Repcat$TemplateObjectsPo implements IRepcat$TemplateObjectsPo {
 
	public enum COLUMNS {
		TEMPLATE_OBJECT_ID("Internal primary key of the REPCAT$_TEMPLATE_OBJECTS table."), //
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table."), //
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table."), //
		OBJECT_NAME("Name of the database object."), //
		OBJECT_TYPE("Type of database object."), //
		OBJECT_TYPE("Type of database object."), //
		OBJECT_VERSION#("Version# of database object of TYPE."), //
		DDL_TEXT("DDL string for creating the object or WHERE clause for snapshot query."), //
		MASTER_ROLLBACK_SEG("Rollback segment for use during snapshot refreshes."), //
		DERIVED_FROM_SNAME("Schema name of schema containing object this was derived from."), //
		DERIVED_FROM_ONAME("Object name of object this object was derived from."), //
		FLAVOR_ID("Foreign key to the REPCAT$_FLAVORS table."), //
		SCHEMA_NAME("Schema containing the object."), //
		DDL_NUM("Order of ddls to execute."), //
		TEMPLATE_REFGROUP_ID("Internal ID of the refresh group to contain the object."), //
		FLAGS("Internal flags for the object."), //
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
 
	private BigDecimal templateObjectId;
	private BigDecimal refreshTemplateId;
	private BigDecimal refreshTemplateId;
	private String objectName;
	private BigDecimal objectType;
	private BigDecimal objectType;
	private BigDecimal objectVersion#;
	private String ddlText;
	private String masterRollbackSeg;
	private String derivedFromSname;
	private String derivedFromOname;
	private BigDecimal flavorId;
	private String schemaName;
	private BigDecimal ddlNum;
	private BigDecimal templateRefgroupId;
	private String flags;
	private String spare1;

	@Override
	public BigDecimal getTemplateObjectId() {
		return this.templateObjectId;
	}
 
	@Override
	public void setTemplateObjectId(final BigDecimal templateObjectId) {
		this.templateObjectId = templateObjectId; 
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
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public String getObjectName() {
		return this.objectName;
	}
 
	@Override
	public void setObjectName(final String objectName) {
		this.objectName = objectName; 
	}
 
	@Override
	public BigDecimal getObjectType() {
		return this.objectType;
	}
 
	@Override
	public void setObjectType(final BigDecimal objectType) {
		this.objectType = objectType; 
	}
 
	@Override
	public BigDecimal getObjectType() {
		return this.objectType;
	}
 
	@Override
	public void setObjectType(final BigDecimal objectType) {
		this.objectType = objectType; 
	}
 
	@Override
	public BigDecimal getObjectVersion#() {
		return this.objectVersion#;
	}
 
	@Override
	public void setObjectVersion#(final BigDecimal objectVersion#) {
		this.objectVersion# = objectVersion#; 
	}
 
	@Override
	public String getDdlText() {
		return this.ddlText;
	}
 
	@Override
	public void setDdlText(final String ddlText) {
		this.ddlText = ddlText; 
	}
 
	@Override
	public String getMasterRollbackSeg() {
		return this.masterRollbackSeg;
	}
 
	@Override
	public void setMasterRollbackSeg(final String masterRollbackSeg) {
		this.masterRollbackSeg = masterRollbackSeg; 
	}
 
	@Override
	public String getDerivedFromSname() {
		return this.derivedFromSname;
	}
 
	@Override
	public void setDerivedFromSname(final String derivedFromSname) {
		this.derivedFromSname = derivedFromSname; 
	}
 
	@Override
	public String getDerivedFromOname() {
		return this.derivedFromOname;
	}
 
	@Override
	public void setDerivedFromOname(final String derivedFromOname) {
		this.derivedFromOname = derivedFromOname; 
	}
 
	@Override
	public BigDecimal getFlavorId() {
		return this.flavorId;
	}
 
	@Override
	public void setFlavorId(final BigDecimal flavorId) {
		this.flavorId = flavorId; 
	}
 
	@Override
	public String getSchemaName() {
		return this.schemaName;
	}
 
	@Override
	public void setSchemaName(final String schemaName) {
		this.schemaName = schemaName; 
	}
 
	@Override
	public BigDecimal getDdlNum() {
		return this.ddlNum;
	}
 
	@Override
	public void setDdlNum(final BigDecimal ddlNum) {
		this.ddlNum = ddlNum; 
	}
 
	@Override
	public BigDecimal getTemplateRefgroupId() {
		return this.templateRefgroupId;
	}
 
	@Override
	public void setTemplateRefgroupId(final BigDecimal templateRefgroupId) {
		this.templateRefgroupId = templateRefgroupId; 
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
