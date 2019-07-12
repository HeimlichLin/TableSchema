package com.doc.common.bean; 
 
public class LoginuserDo { 
 
	public enum COLUMNS { 
		USERID("null"), 
		PWD("null"), 
		STATUS("null"), 
		FNAME("null"), 
		LNAME("null") 
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
	private String pwd; 
	private String status; 
	private String fname; 
	private String lname; 
	
	public String getUserid() { 
		return userid; 
	} 
 
	public void setUserid(String userid) { 
		this.userid = userid; 
	} 
 
	public String getPwd() { 
		return pwd; 
	} 
 
	public void setPwd(String pwd) { 
		this.pwd = pwd; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
	public String getFname() { 
		return fname; 
	} 
 
	public void setFname(String fname) { 
		this.fname = fname; 
	} 
 
	public String getLname() { 
		return lname; 
	} 
 
	public void setLname(String lname) { 
		this.lname = lname; 
	} 
 
} 
