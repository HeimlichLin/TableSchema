package com.doc.common.po.impl; 
 
public class UsermodifylogPo implements IUsermodifylogPo {
 
	public enum COLUMNS {
		LOGUSERID("null"), //
		LOGDATE("null"), //
		ACTION("null"), //
		OLDUSERID("null"), //
		OLDPASSWORD("null"), //
		OLDUSERNAME("null"), //
		OLDPRIVIDGE("null"), //
		NEWUSERID("null"), //
		NEWPASSWORD("null"), //
		NEWUSERNAME("null"), //
		NEWPRIVIDGE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String loguserid;
	private java.sql.Timestamp logdate;
	private String action;
	private String olduserid;
	private String oldpassword;
	private String oldusername;
	private String oldprividge;
	private String newuserid;
	private String newpassword;
	private String newusername;
	private String newprividge;

	@Override
	public String getLoguserid() {
		return this.loguserid;
	}
 
	@Override
	public void setLoguserid(final String loguserid) {
		this.loguserid = loguserid; 
	}
 
	@Override
	public java.sql.Timestamp getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final java.sql.Timestamp logdate) {
		this.logdate = logdate; 
	}
 
	@Override
	public String getAction() {
		return this.action;
	}
 
	@Override
	public void setAction(final String action) {
		this.action = action; 
	}
 
	@Override
	public String getOlduserid() {
		return this.olduserid;
	}
 
	@Override
	public void setOlduserid(final String olduserid) {
		this.olduserid = olduserid; 
	}
 
	@Override
	public String getOldpassword() {
		return this.oldpassword;
	}
 
	@Override
	public void setOldpassword(final String oldpassword) {
		this.oldpassword = oldpassword; 
	}
 
	@Override
	public String getOldusername() {
		return this.oldusername;
	}
 
	@Override
	public void setOldusername(final String oldusername) {
		this.oldusername = oldusername; 
	}
 
	@Override
	public String getOldprividge() {
		return this.oldprividge;
	}
 
	@Override
	public void setOldprividge(final String oldprividge) {
		this.oldprividge = oldprividge; 
	}
 
	@Override
	public String getNewuserid() {
		return this.newuserid;
	}
 
	@Override
	public void setNewuserid(final String newuserid) {
		this.newuserid = newuserid; 
	}
 
	@Override
	public String getNewpassword() {
		return this.newpassword;
	}
 
	@Override
	public void setNewpassword(final String newpassword) {
		this.newpassword = newpassword; 
	}
 
	@Override
	public String getNewusername() {
		return this.newusername;
	}
 
	@Override
	public void setNewusername(final String newusername) {
		this.newusername = newusername; 
	}
 
	@Override
	public String getNewprividge() {
		return this.newprividge;
	}
 
	@Override
	public void setNewprividge(final String newprividge) {
		this.newprividge = newprividge; 
	}
 
}
