package com.doc.common.po.impl; 
 
public class Userprofile3Po implements IUserprofile3Po {
 
	public enum COLUMNS {
		USERID("null"), //
		PASSWORD("null"), //
		USERNAME("null"), //
		PRIVIDGE("null"), //
		EXPRESSID("null"), //
		USERAREA("null"), //
		PASSWORD1("null"), //
		PASSWORD2("null"), //
		PASSWORD3("null"), //
		PASSWORDDATE1("null"), //
		PASSWORDDATE2("null"), //
		PASSWORDDATE3("null"), //
		FORCEPWDDATE("null") //
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
	private String password;
	private String username;
	private String prividge;
	private String expressid;
	private String userarea;
	private String password1;
	private String password2;
	private String password3;
	private java.sql.Timestamp passworddate1;
	private java.sql.Timestamp passworddate2;
	private java.sql.Timestamp passworddate3;
	private java.sql.Timestamp forcepwddate;

	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public String getPassword() {
		return this.password;
	}
 
	@Override
	public void setPassword(final String password) {
		this.password = password; 
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
	public String getPrividge() {
		return this.prividge;
	}
 
	@Override
	public void setPrividge(final String prividge) {
		this.prividge = prividge; 
	}
 
	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getUserarea() {
		return this.userarea;
	}
 
	@Override
	public void setUserarea(final String userarea) {
		this.userarea = userarea; 
	}
 
	@Override
	public String getPassword1() {
		return this.password1;
	}
 
	@Override
	public void setPassword1(final String password1) {
		this.password1 = password1; 
	}
 
	@Override
	public String getPassword2() {
		return this.password2;
	}
 
	@Override
	public void setPassword2(final String password2) {
		this.password2 = password2; 
	}
 
	@Override
	public String getPassword3() {
		return this.password3;
	}
 
	@Override
	public void setPassword3(final String password3) {
		this.password3 = password3; 
	}
 
	@Override
	public java.sql.Timestamp getPassworddate1() {
		return this.passworddate1;
	}
 
	@Override
	public void setPassworddate1(final java.sql.Timestamp passworddate1) {
		this.passworddate1 = passworddate1; 
	}
 
	@Override
	public java.sql.Timestamp getPassworddate2() {
		return this.passworddate2;
	}
 
	@Override
	public void setPassworddate2(final java.sql.Timestamp passworddate2) {
		this.passworddate2 = passworddate2; 
	}
 
	@Override
	public java.sql.Timestamp getPassworddate3() {
		return this.passworddate3;
	}
 
	@Override
	public void setPassworddate3(final java.sql.Timestamp passworddate3) {
		this.passworddate3 = passworddate3; 
	}
 
	@Override
	public java.sql.Timestamp getForcepwddate() {
		return this.forcepwddate;
	}
 
	@Override
	public void setForcepwddate(final java.sql.Timestamp forcepwddate) {
		this.forcepwddate = forcepwddate; 
	}
 
}
