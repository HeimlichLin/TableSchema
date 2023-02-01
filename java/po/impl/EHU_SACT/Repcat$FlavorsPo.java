package com.doc.common.po.impl; 
 
public class Repcat$FlavorsPo implements IRepcat$FlavorsPo {
 
	public enum COLUMNS {
		FLAVOR_ID("Flavor identifier, unique within object group"), //
		GOWNER("Owner of the object group"), //
		GOWNER("Owner of the object group"), //
		GNAME("Name of the object group"), //
		FNAME("Name of the flavor"), //
		CREATION_DATE("Date on which the flavor was created"), //
		CREATED_BY("Identifier of user that created the flavor"), //
		PUBLISHED("Indicates whether flavor is published (Y/N) or obsolete (O)") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal flavorId;
	private String gowner;
	private String gowner;
	private String gname;
	private String fname;
	private java.sql.Timestamp creationDate;
	private BigDecimal createdBy;
	private String published;

	@Override
	public BigDecimal getFlavorId() {
		return this.flavorId;
	}
 
	@Override
	public void setFlavorId(final BigDecimal flavorId) {
		this.flavorId = flavorId; 
	}
 
	@Override
	public String getGowner() {
		return this.gowner;
	}
 
	@Override
	public void setGowner(final String gowner) {
		this.gowner = gowner; 
	}
 
	@Override
	public String getGowner() {
		return this.gowner;
	}
 
	@Override
	public void setGowner(final String gowner) {
		this.gowner = gowner; 
	}
 
	@Override
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
	@Override
	public String getFname() {
		return this.fname;
	}
 
	@Override
	public void setFname(final String fname) {
		this.fname = fname; 
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
	public String getPublished() {
		return this.published;
	}
 
	@Override
	public void setPublished(final String published) {
		this.published = published; 
	}
 
}
