package com.doc.common.bean; 
 
public class UserinfLogDo { 
 
	public enum COLUMNS { 
		USERID("null"), 
		USERPW("null"), 
		AUTHID("null"), 
		USERNAME("null"), 
		USEROFFICE("null"), 
		STATUS("null"), 
		ACTIVEDATE("null"), 
		ENDDATE("null"), 
		DEPARTMENT("null"), 
		TEL("null"), 
		LASTLOGIN("null"), 
		PROCESSTIME("null"), 
		PROCESSSTATE("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String userid; 
	private String userpw; 
	private String authid; 
	private String username; 
	private String useroffice; 
	private String status; 
	private String activedate; 
	private String enddate; 
	private String department; 
	private String tel; 
	private String lastlogin; 
	private java.sql.Timestamp processtime; 
	private String processstate; 
	
	public String getUserid() { 
		return userid; 
	} 
 
	public void setUserid(String userid) { 
		this.userid = userid; 
	} 
 
	public String getUserpw() { 
		return userpw; 
	} 
 
	public void setUserpw(String userpw) { 
		this.userpw = userpw; 
	} 
 
	public String getAuthid() { 
		return authid; 
	} 
 
	public void setAuthid(String authid) { 
		this.authid = authid; 
	} 
 
	public String getUsername() { 
		return username; 
	} 
 
	public void setUsername(String username) { 
		this.username = username; 
	} 
 
	public String getUseroffice() { 
		return useroffice; 
	} 
 
	public void setUseroffice(String useroffice) { 
		this.useroffice = useroffice; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
	public String getActivedate() { 
		return activedate; 
	} 
 
	public void setActivedate(String activedate) { 
		this.activedate = activedate; 
	} 
 
	public String getEnddate() { 
		return enddate; 
	} 
 
	public void setEnddate(String enddate) { 
		this.enddate = enddate; 
	} 
 
	public String getDepartment() { 
		return department; 
	} 
 
	public void setDepartment(String department) { 
		this.department = department; 
	} 
 
	public String getTel() { 
		return tel; 
	} 
 
	public void setTel(String tel) { 
		this.tel = tel; 
	} 
 
	public String getLastlogin() { 
		return lastlogin; 
	} 
 
	public void setLastlogin(String lastlogin) { 
		this.lastlogin = lastlogin; 
	} 
 
	public java.sql.Timestamp getProcesstime() { 
		return processtime; 
	} 
 
	public void setProcesstime(java.sql.Timestamp processtime) { 
		this.processtime = processtime; 
	} 
 
	public String getProcessstate() { 
		return processstate; 
	} 
 
	public void setProcessstate(String processstate) { 
		this.processstate = processstate; 
	} 
 
} 
