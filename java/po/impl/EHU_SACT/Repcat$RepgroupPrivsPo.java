package com.doc.common.po.impl; 
 
public class Repcat$RepgroupPrivsPo implements IRepcat$RepgroupPrivsPo {
 
	public enum COLUMNS {
		USERID("OBSOLETE COLUMN: Identifying number of the user"), //
		USERNAME("Identifying name of the registered user"), //
		GOWNER("Owner of the replicated object group"), //
		GOWNER("Owner of the replicated object group"), //
		GNAME("Name of the replicated object group"), //
		GNAME("Name of the replicated object group"), //
		GLOBAL_FLAG("1 if gname is NULL, 0 otherwise"), //
		CREATED("Registration date"), //
		PRIVILEGE("Registered privileges") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal userid;
	private String username;
	private String gowner;
	private String gowner;
	private String gname;
	private String gname;
	private BigDecimal globalFlag;
	private java.sql.Timestamp created;
	private BigDecimal privilege;

	@Override
	public BigDecimal getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final BigDecimal userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getUsername() {
		return this.username;
	}
 
	@Override
	public void setUsername(final String username) {
		this.username = username; 
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
	public String getGname() {
		return this.gname;
	}
 
	@Override
	public void setGname(final String gname) {
		this.gname = gname; 
	}
 
	@Override
	public BigDecimal getGlobalFlag() {
		return this.globalFlag;
	}
 
	@Override
	public void setGlobalFlag(final BigDecimal globalFlag) {
		this.globalFlag = globalFlag; 
	}
 
	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}
 
	@Override
	public void setCreated(final java.sql.Timestamp created) {
		this.created = created; 
	}
 
	@Override
	public BigDecimal getPrivilege() {
		return this.privilege;
	}
 
	@Override
	public void setPrivilege(final BigDecimal privilege) {
		this.privilege = privilege; 
	}
 
}
