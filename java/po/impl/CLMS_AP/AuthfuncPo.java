package com.doc.common.po.impl; 
 
public class AuthfuncPo implements IAuthfuncPo {
 
	public enum COLUMNS {
		AUTHID("null"), //
		FUNCID("null"), //
		AUTHNAME("null"), //
		RW("null") //
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
	private String funcid;
	private String authname;
	private String rw;

	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
	}
 
	@Override
	public String getFuncid() {
		return this.funcid;
	}
 
	@Override
	public void setFuncid(final String funcid) {
		this.funcid = funcid; 
	}
 
	@Override
	public String getAuthname() {
		return this.authname;
	}
 
	@Override
	public void setAuthname(final String authname) {
		this.authname = authname; 
	}
 
	@Override
	public String getRw() {
		return this.rw;
	}
 
	@Override
	public void setRw(final String rw) {
		this.rw = rw; 
	}
 
}
