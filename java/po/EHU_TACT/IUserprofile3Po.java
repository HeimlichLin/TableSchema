package com.doc.common.po; 
 
public interface IUserprofile3Po {
 
	String getUserid();
 
	void setUserid(final String userid);
 
	String getPassword();
 
	void setPassword(final String password);
 
	String getUsername();
 
	void setUsername(final String username);
 
	String getPrividge();
 
	void setPrividge(final String prividge);
 
	String getExpressid();
 
	void setExpressid(final String expressid);
 
	String getUserarea();
 
	void setUserarea(final String userarea);
 
	String getPassword1();
 
	void setPassword1(final String password1);
 
	String getPassword2();
 
	void setPassword2(final String password2);
 
	String getPassword3();
 
	void setPassword3(final String password3);
 
	java.sql.Timestamp getPassworddate1();
 
	void setPassworddate1(final java.sql.Timestamp passworddate1);
 
	java.sql.Timestamp getPassworddate2();
 
	void setPassworddate2(final java.sql.Timestamp passworddate2);
 
	java.sql.Timestamp getPassworddate3();
 
	void setPassworddate3(final java.sql.Timestamp passworddate3);
 
	java.sql.Timestamp getForcepwddate();
 
	void setForcepwddate(final java.sql.Timestamp forcepwddate);
 
}
