package com.doc.common.po.impl; 
 
public class UserinfLogPo implements IUserinfLogPo {
 
	public enum COLUMNS {
		USERID("null"), //
		USERPW("null"), //
		AUTHID("null"), //
		USERNAME("null"), //
		USEROFFICE("null"), //
		STATUS("null"), //
		ACTIVEDATE("null"), //
		ENDDATE("null"), //
		DEPARTMENT("null"), //
		TEL("null"), //
		LASTLOGIN("null"), //
		PROCESSTIME("null"), //
		PROCESSSTATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String userid;
	private String userpw;
	private String authid;
	private String username;
	private String useroffice;
	private String status;
	private String activedate;
	private String enddate;
	private String department;
	private String tel;
	private String lastlogin;
	private java.sql.Timestamp processtime;
	private String processstate;

	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getUserpw() {
		return this.userpw;
	}
 
	@Override
	public void setUserpw(final String userpw) {
		this.userpw = userpw; 
	}
 
	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
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
	public String getUseroffice() {
		return this.useroffice;
	}
 
	@Override
	public void setUseroffice(final String useroffice) {
		this.useroffice = useroffice; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getActivedate() {
		return this.activedate;
	}
 
	@Override
	public void setActivedate(final String activedate) {
		this.activedate = activedate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
	}
 
	@Override
	public String getDepartment() {
		return this.department;
	}
 
	@Override
	public void setDepartment(final String department) {
		this.department = department; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getLastlogin() {
		return this.lastlogin;
	}
 
	@Override
	public void setLastlogin(final String lastlogin) {
		this.lastlogin = lastlogin; 
	}
 
	@Override
	public java.sql.Timestamp getProcesstime() {
		return this.processtime;
	}
 
	@Override
	public void setProcesstime(final java.sql.Timestamp processtime) {
		this.processtime = processtime; 
	}
 
	@Override
	public String getProcessstate() {
		return this.processstate;
	}
 
	@Override
	public void setProcessstate(final String processstate) {
		this.processstate = processstate; 
	}
 
}
