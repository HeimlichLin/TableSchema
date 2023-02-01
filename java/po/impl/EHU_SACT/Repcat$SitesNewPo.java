package com.doc.common.po.impl; 
 
public class Repcat$SitesNewPo implements IRepcat$SitesNewPo {
 
	public enum COLUMNS {
		EXTENSION_ID("Globally unique identifier for replication extension"), //
		GOWNER("Owner of the object group"), //
		GNAME("Name of the replicated object group"), //
		GNAME("Name of the replicated object group"), //
		DBLINK("A database site that will replicate the object group"), //
		FULL_INSTANTIATION("Y if the database uses full-database export or change-based recovery"), //
		MASTER_STATUS("Instantiation status of the new master") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String extensionId;
	private String gowner;
	private String gname;
	private String gname;
	private String dblink;
	private String fullInstantiation;
	private BigDecimal masterStatus;

	@Override
	public String getExtensionId() {
		return this.extensionId;
	}
 
	@Override
	public void setExtensionId(final String extensionId) {
		this.extensionId = extensionId; 
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
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public String getFullInstantiation() {
		return this.fullInstantiation;
	}
 
	@Override
	public void setFullInstantiation(final String fullInstantiation) {
		this.fullInstantiation = fullInstantiation; 
	}
 
	@Override
	public BigDecimal getMasterStatus() {
		return this.masterStatus;
	}
 
	@Override
	public void setMasterStatus(final BigDecimal masterStatus) {
		this.masterStatus = masterStatus; 
	}
 
}
