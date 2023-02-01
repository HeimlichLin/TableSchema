package com.doc.common.po.impl; 
 
public class AuthmenuPo implements IAuthmenuPo {
 
	public enum COLUMNS {
		AUTHID("授權ID"), //
		MENUID("選單") //
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
	private String menuid;

	@Override
	public String getAuthid() {
		return this.authid;
	}
 
	@Override
	public void setAuthid(final String authid) {
		this.authid = authid; 
	}
 
	@Override
	public String getMenuid() {
		return this.menuid;
	}
 
	@Override
	public void setMenuid(final String menuid) {
		this.menuid = menuid; 
	}
 
}
