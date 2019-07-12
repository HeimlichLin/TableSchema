package com.doc.common.bean; 
 
public class UserinfDo { 
 
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
		AP_ID("null"), 
		PAGE_TYPE("null"), 
		VERSION("null"), 
		USER_IP("null") 
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
	private String apId; 
	private String pageType; 
	private String version; 
	private String userIp; 
	
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
 
	public String getApId() { 
		return apId; 
	} 
 
	public void setApId(String apId) { 
		this.apId = apId; 
	} 
 
	public String getPageType() { 
		return pageType; 
	} 
 
	public void setPageType(String pageType) { 
		this.pageType = pageType; 
	} 
 
	public String getVersion() { 
		return version; 
	} 
 
	public void setVersion(String version) { 
		this.version = version; 
	} 
 
	public String getUserIp() { 
		return userIp; 
	} 
 
	public void setUserIp(String userIp) { 
		this.userIp = userIp; 
	} 
 
} 
