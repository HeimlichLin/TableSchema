package com.doc.common.po.impl; 
 
public class Repcat$RepcatPo implements IRepcat$RepcatPo {
 
	public enum COLUMNS {
		GOWNER("Owner of the object group"), //
		SNAME("Name of the replicated object group"), //
		MASTER("Is the site a master site for the replicated object group"), //
		STATUS("If the site is a master, the master's status"), //
		SCHEMA_COMMENT("Description of the replicated object group"), //
		FLAVOR_ID("Flavor identifier"), //
		FLAG("Miscellaneous repgroup info") //
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
	private String sname;
	private String master;
	private BigDecimal status;
	private String schemaComment;
	private BigDecimal flavorId;
	private String flag;

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
	public String getMaster() {
		return this.master;
	}
 
	@Override
	public void setMaster(final String master) {
		this.master = master; 
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
	public String getSchemaComment() {
		return this.schemaComment;
	}
 
	@Override
	public void setSchemaComment(final String schemaComment) {
		this.schemaComment = schemaComment; 
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
	public String getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final String flag) {
		this.flag = flag; 
	}
 
}
