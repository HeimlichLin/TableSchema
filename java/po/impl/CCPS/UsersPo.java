package com.doc.common.po.impl; 
 
public class UsersPo implements IUsersPo {
 
	public enum COLUMNS {
		USERNAME("null"), //
		PASSWORD("null"), //
		ENABLED("null") //
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
	private String password;
	private String enabled;

	@Override
	public String getUsername() {
		return this.username;
	}
 
	@Override
	public void setUsername(final String username) {
		this.username = username; 
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
	public String getEnabled() {
		return this.enabled;
	}
 
	@Override
	public void setEnabled(final String enabled) {
		this.enabled = enabled; 
	}
 
}
