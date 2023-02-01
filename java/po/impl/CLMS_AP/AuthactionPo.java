package com.doc.common.po.impl; 
 
public class AuthactionPo implements IAuthactionPo {
 
	public enum COLUMNS {
		AUTHID("授權ID
"), //
		BONDNO("*"), //
		ACTIONID("授權功能") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String authid;
	private String bondno;
	private String actionid;

	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
	}
 
	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getActionid() {
		return this.actionid;
	}
 
	@Override
	public void setActionid(final String actionid) {
		this.actionid = actionid; 
	}
 
}
