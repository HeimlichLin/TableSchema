package com.doc.common.po.impl; 
 
public class Repcat$RepschemaPo implements IRepcat$RepschemaPo {
 
	public enum COLUMNS {
		GOWNER("Owner of the replicated object group"), //
		GOWNER("Owner of the replicated object group"), //
		SNAME("Name of the replicated object group"), //
		DBLINK("A database site replicating the object group"), //
		DBLINK("A database site replicating the object group"), //
		MASTERDEF("Is the database the master definition site for the replicated object group"), //
		SNAPMASTER("For a snapshot site, is this the current refresh_master"), //
		MASTER_COMMENT("Description of the database site"), //
		MASTER("Redundant information from repcat$_repcat.master"), //
		PROP_UPDATES("Number of requested updates for master in repcat$_repprop"), //
		MY_DBLINK("A sanity check after import: is this master the current site"), //
		EXTENSION_ID("Dummy column for foreign key") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String gowner;
	private String gowner;
	private String sname;
	private String dblink;
	private String dblink;
	private String masterdef;
	private String snapmaster;
	private String masterComment;
	private String master;
	private BigDecimal propUpdates;
	private String myDblink;
	private String extensionId;

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
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
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
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public String getMasterdef() {
		return this.masterdef;
	}
 
	@Override
	public void setMasterdef(final String masterdef) {
		this.masterdef = masterdef; 
	}
 
	@Override
	public String getSnapmaster() {
		return this.snapmaster;
	}
 
	@Override
	public void setSnapmaster(final String snapmaster) {
		this.snapmaster = snapmaster; 
	}
 
	@Override
	public String getMasterComment() {
		return this.masterComment;
	}
 
	@Override
	public void setMasterComment(final String masterComment) {
		this.masterComment = masterComment; 
	}
 
	@Override
	public String getMaster() {
		return this.master;
	}
 
	@Override
	public void setMaster(final String master) {
		this.master = master; 
	}
 
	@Override
	public BigDecimal getPropUpdates() {
		return this.propUpdates;
	}
 
	@Override
	public void setPropUpdates(final BigDecimal propUpdates) {
		this.propUpdates = propUpdates; 
	}
 
	@Override
	public String getMyDblink() {
		return this.myDblink;
	}
 
	@Override
	public void setMyDblink(final String myDblink) {
		this.myDblink = myDblink; 
	}
 
	@Override
	public String getExtensionId() {
		return this.extensionId;
	}
 
	@Override
	public void setExtensionId(final String extensionId) {
		this.extensionId = extensionId; 
	}
 
}
