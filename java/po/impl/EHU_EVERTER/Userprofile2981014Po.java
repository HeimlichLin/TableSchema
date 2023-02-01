package com.doc.common.po.impl; 
 
public class Userprofile2981014Po implements IUserprofile2981014Po {
 
	public enum COLUMNS {
		USERID("null"), //
		PASSWORD("null"), //
		USERNAME("null"), //
		PRIVIDGE("null"), //
		EXPRESSID("null") //
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
 
}
