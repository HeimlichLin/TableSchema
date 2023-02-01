package com.doc.common.po.impl; 
 
public class AuthinfPo implements IAuthinfPo {
 
	public enum COLUMNS {
		AUTHID("null"), //
		AUTHNAME("null") //
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
	private String authname;

	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
	}
 
	@Override
	public String getAuthname() {
		return this.authname;
	}
 
	@Override
	public void setAuthname(final String authname) {
		this.authname = authname; 
	}
 
}
