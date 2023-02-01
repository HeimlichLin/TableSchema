package com.doc.common.po; 
 
public interface ITUserPo {
 
	BigDecimal getId();
 
	void setId(final BigDecimal id);
 
	BigDecimal getEnabled();
 
	void setEnabled(final BigDecimal enabled);
 
	String getPassword();
 
	void setPassword(final String password);
 
	String getUsername();
 
	void setUsername(final String username);
 
	BigDecimal getAccountNonExpired();
 
	void setAccountNonExpired(final BigDecimal accountNonExpired);
 
	BigDecimal getAccountNonLocked();
 
	void setAccountNonLocked(final BigDecimal accountNonLocked);
 
	BigDecimal getCredentialsNonExpired();
 
	void setCredentialsNonExpired(final BigDecimal credentialsNonExpired);
 
	String getUsernameZh();
 
	void setUsernameZh(final String usernameZh);
 
}
