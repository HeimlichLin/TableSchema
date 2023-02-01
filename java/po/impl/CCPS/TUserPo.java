package com.doc.common.po.impl; 
 
public class TUserPo implements ITUserPo {
 
	public enum COLUMNS {
		ID("null"), //
		ENABLED("null"), //
		PASSWORD("null"), //
		USERNAME("null"), //
		ACCOUNT_NON_EXPIRED("null"), //
		ACCOUNT_NON_LOCKED("null"), //
		CREDENTIALS_NON_EXPIRED("null"), //
		USERNAME_ZH("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal id;
	private BigDecimal enabled;
	private String password;
	private String username;
	private BigDecimal accountNonExpired;
	private BigDecimal accountNonLocked;
	private BigDecimal credentialsNonExpired;
	private String usernameZh;

	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public BigDecimal getEnabled() {
		return this.enabled;
	}
 
	@Override
	public void setEnabled(final BigDecimal enabled) {
		this.enabled = enabled; 
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
	public BigDecimal getAccountNonExpired() {
		return this.accountNonExpired;
	}
 
	@Override
	public void setAccountNonExpired(final BigDecimal accountNonExpired) {
		this.accountNonExpired = accountNonExpired; 
	}
 
	@Override
	public BigDecimal getAccountNonLocked() {
		return this.accountNonLocked;
	}
 
	@Override
	public void setAccountNonLocked(final BigDecimal accountNonLocked) {
		this.accountNonLocked = accountNonLocked; 
	}
 
	@Override
	public BigDecimal getCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
 
	@Override
	public void setCredentialsNonExpired(final BigDecimal credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired; 
	}
 
	@Override
	public String getUsernameZh() {
		return this.usernameZh;
	}
 
	@Override
	public void setUsernameZh(final String usernameZh) {
		this.usernameZh = usernameZh; 
	}
 
}
