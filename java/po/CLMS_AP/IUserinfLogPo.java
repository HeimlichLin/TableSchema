package com.doc.common.po; 
 
public interface IUserinfLogPo {
 
	String getUserid();
 
	void setUserid(final String userid);
 
	String getUserpw();
 
	void setUserpw(final String userpw);
 
	String getAuthid();
 
	void setAuthid(final String authid);
 
	String getUsername();
 
	void setUsername(final String username);
 
	String getUseroffice();
 
	void setUseroffice(final String useroffice);
 
	String getStatus();
 
	void setStatus(final String status);
 
	String getActivedate();
 
	void setActivedate(final String activedate);
 
	String getEnddate();
 
	void setEnddate(final String enddate);
 
	String getDepartment();
 
	void setDepartment(final String department);
 
	String getTel();
 
	void setTel(final String tel);
 
	String getLastlogin();
 
	void setLastlogin(final String lastlogin);
 
	java.sql.Timestamp getProcesstime();
 
	void setProcesstime(final java.sql.Timestamp processtime);
 
	String getProcessstate();
 
	void setProcessstate(final String processstate);
 
}
