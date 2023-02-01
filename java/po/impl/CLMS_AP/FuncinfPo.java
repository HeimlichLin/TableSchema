package com.doc.common.po.impl; 
 
public class FuncinfPo implements IFuncinfPo {
 
	public enum COLUMNS {
		FUNCID("null"), //
		FUNCNAME("null"), //
		CODENAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String funcid;
	private String funcname;
	private String codename;

	@Override
	public String getFuncid() {
		return this.funcid;
	}
 
	@Override
	public void setFuncid(final String funcid) {
		this.funcid = funcid; 
	}
 
	@Override
	public String getFuncname() {
		return this.funcname;
	}
 
	@Override
	public void setFuncname(final String funcname) {
		this.funcname = funcname; 
	}
 
	@Override
	public String getCodename() {
		return this.codename;
	}
 
	@Override
	public void setCodename(final String codename) {
		this.codename = codename; 
	}
 
}
