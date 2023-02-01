package com.doc.common.po.impl; 
 
public class LoginuserPo implements ILoginuserPo {
 
	public enum COLUMNS {
		USERID("null"), //
		PWD("null"), //
		STATUS("null"), //
		FNAME("null"), //
		LNAME("null") //
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
	private String pwd;
	private String status;
	private String fname;
	private String lname;

	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getPwd() {
		return this.pwd;
	}
 
	@Override
	public void setPwd(final String pwd) {
		this.pwd = pwd; 
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
	public String getFname() {
		return this.fname;
	}
 
	@Override
	public void setFname(final String fname) {
		this.fname = fname; 
	}
 
	@Override
	public String getLname() {
		return this.lname;
	}
 
	@Override
	public void setLname(final String lname) {
		this.lname = lname; 
	}
 
}
