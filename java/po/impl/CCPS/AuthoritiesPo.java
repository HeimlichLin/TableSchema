package com.doc.common.po.impl; 
 
public class AuthoritiesPo implements IAuthoritiesPo {
 
	public enum COLUMNS {
		USERNAME("null"), //
		AUTHORITY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String username;
	private String authority;

	@Override
	public String getUsername() {
		return this.username;
	}
 
	@Override
	public void setUsername(final String username) {
		this.username = username; 
	}
 
	@Override
	public String getAuthority() {
		return this.authority;
	}
 
	@Override
	public void setAuthority(final String authority) {
		this.authority = authority; 
	}
 
}
