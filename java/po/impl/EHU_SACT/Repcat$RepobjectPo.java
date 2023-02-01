package com.doc.common.po.impl; 
 
public class Repcat$RepobjectPo implements IRepcat$RepobjectPo {
 
	public enum COLUMNS {
		SNAME("Name of the object owner"), //
		ONAME("Name of the object"), //
		TYPE("Type of the object"), //
		VERSION#("Version of objects of TYPE"), //
		HASHCODE("Hashcode of objects of TYPE"), //
		ID("Identifier of the local object"), //
		OBJECT_COMMENT("Description of the replicated object"), //
		STATUS("Status of the last create or alter request on the local object"), //
		GENPACKAGE("Status of whether the object needs to generate replication package"), //
		GENPLOGID("Log id of message sent for generating package support"), //
		GENTRIGGER("Status of whether the object needs to generate replication trigger"), //
		GENTLOGID("Log id of message sent for generating trigger support"), //
		GOWNER("Owner of the object's object group"), //
		GNAME("Name of the object's object group"), //
		FLAG("Information about replicated object") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private BigDecimal type;
	private BigDecimal version#;
	private String hashcode;
	private BigDecimal id;
	private String objectComment;
	private BigDecimal status;
	private BigDecimal genpackage;
	private BigDecimal genplogid;
	private BigDecimal gentrigger;
	private BigDecimal gentlogid;
	private String gowner;
	private String gname;
	private String flag;

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
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public BigDecimal getVersion#() {
		return this.version#;
	}
 
	@Override
	public void setVersion#(final BigDecimal version#) {
		this.version# = version#; 
	}
 
	@Override
	public String getHashcode() {
		return this.hashcode;
	}
 
	@Override
	public void setHashcode(final String hashcode) {
		this.hashcode = hashcode; 
	}
 
	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public String getObjectComment() {
		return this.objectComment;
	}
 
	@Override
	public void setObjectComment(final String objectComment) {
		this.objectComment = objectComment; 
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
	public BigDecimal getGenpackage() {
		return this.genpackage;
	}
 
	@Override
	public void setGenpackage(final BigDecimal genpackage) {
		this.genpackage = genpackage; 
	}
 
	@Override
	public BigDecimal getGenplogid() {
		return this.genplogid;
	}
 
	@Override
	public void setGenplogid(final BigDecimal genplogid) {
		this.genplogid = genplogid; 
	}
 
	@Override
	public BigDecimal getGentrigger() {
		return this.gentrigger;
	}
 
	@Override
	public void setGentrigger(final BigDecimal gentrigger) {
		this.gentrigger = gentrigger; 
	}
 
	@Override
	public BigDecimal getGentlogid() {
		return this.gentlogid;
	}
 
	@Override
	public void setGentlogid(final BigDecimal gentlogid) {
		this.gentlogid = gentlogid; 
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
	public String getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final String flag) {
		this.flag = flag; 
	}
 
}
