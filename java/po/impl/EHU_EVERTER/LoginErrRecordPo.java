package com.doc.common.po.impl; 
 
public class LoginErrRecordPo implements ILoginErrRecordPo {
 
	public enum COLUMNS {
		LOGIN_DATE("null"), //
		LOGIN_USER("null"), //
		LOGIN_ERR_NOTE("null"), //
		LOGIN_IP("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String loginDate;
	private String loginUser;
	private String loginErrNote;
	private String loginIp;

	@Override
	public String getLoginDate() {
		return this.loginDate;
	}
 
	@Override
	public void setLoginDate(final String loginDate) {
		this.loginDate = loginDate; 
	}
 
	@Override
	public String getLoginUser() {
		return this.loginUser;
	}
 
	@Override
	public void setLoginUser(final String loginUser) {
		this.loginUser = loginUser; 
	}
 
	@Override
	public String getLoginErrNote() {
		return this.loginErrNote;
	}
 
	@Override
	public void setLoginErrNote(final String loginErrNote) {
		this.loginErrNote = loginErrNote; 
	}
 
	@Override
	public String getLoginIp() {
		return this.loginIp;
	}
 
	@Override
	public void setLoginIp(final String loginIp) {
		this.loginIp = loginIp; 
	}
 
}
