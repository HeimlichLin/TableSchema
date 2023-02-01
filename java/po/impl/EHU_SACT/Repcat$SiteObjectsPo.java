package com.doc.common.po.impl; 
 
public class Repcat$SiteObjectsPo implements IRepcat$SiteObjectsPo {
 
	public enum COLUMNS {
		TEMPLATE_SITE_ID("Internal primary key of the template sites table."), //
		SNAME("Schema containing the deployed database object."), //
		ONAME("Name of the deployed database object."), //
		OBJECT_TYPE_ID("Internal ID of the object type of the deployed database object."), //
		OBJECT_TYPE_ID("Internal ID of the object type of the deployed database object.") //
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
	private String sname;
	private String oname;
	private BigDecimal objectTypeId;
	private BigDecimal objectTypeId;

	@Override
	public BigDecimal getTemplateSiteId() {
		return this.templateSiteId;
	}
 
	@Override
	public void setTemplateSiteId(final BigDecimal templateSiteId) {
		this.templateSiteId = templateSiteId; 
	}
 
	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getObjectTypeId() {
		return this.objectTypeId;
	}
 
	@Override
	public void setObjectTypeId(final BigDecimal objectTypeId) {
		this.objectTypeId = objectTypeId; 
	}
 
	@Override
	public BigDecimal getObjectTypeId() {
		return this.objectTypeId;
	}
 
	@Override
	public void setObjectTypeId(final BigDecimal objectTypeId) {
		this.objectTypeId = objectTypeId; 
	}
 
}
