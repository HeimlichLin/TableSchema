package com.doc.common.po.impl; 
 
public class UserLogPo implements IUserLogPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		BONDBAN("null"), //
		BONDNAME("null"), //
		SPECIALST("null"), //
		BONDID("null"), //
		AUTHORITY("null"), //
		CUSTOMSOFFICE("null"), //
		LOGINTIME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String bondban;
	private String bondname;
	private String specialst;
	private String bondid;
	private String authority;
	private String customsoffice;
	private String logintime;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getBondban() {
		return this.bondban;
	}
 
	@Override
	public void setBondban(final String bondban) {
		this.bondban = bondban; 
	}
 
	@Override
	public String getBondname() {
		return this.bondname;
	}
 
	@Override
	public void setBondname(final String bondname) {
		this.bondname = bondname; 
	}
 
	@Override
	public String getSpecialst() {
		return this.specialst;
	}
 
	@Override
	public void setSpecialst(final String specialst) {
		this.specialst = specialst; 
	}
 
	@Override
	public String getBondid() {
		return this.bondid;
	}
 
	@Override
	public void setBondid(final String bondid) {
		this.bondid = bondid; 
	}
 
	@Override
	public String getAuthority() {
		return this.authority;
	}
 
	@Override
	public void setAuthority(final String authority) {
		this.authority = authority; 
	}
 
	@Override
	public String getCustomsoffice() {
		return this.customsoffice;
	}
 
	@Override
	public void setCustomsoffice(final String customsoffice) {
		this.customsoffice = customsoffice; 
	}
 
	@Override
	public String getLogintime() {
		return this.logintime;
	}
 
	@Override
	public void setLogintime(final String logintime) {
		this.logintime = logintime; 
	}
 
}
