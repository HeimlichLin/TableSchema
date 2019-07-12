package com.doc.common.bean; 
 
public class AuthinfDo { 
 
	public enum COLUMNS { 
		AUTHID("null"), 
		AUTHNAME("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String authid; 
	private String authname; 
	
	public String getAuthid() { 
		return authid; 
	} 
 
	public void setAuthid(String authid) { 
		this.authid = authid; 
	} 
 
	public String getAuthname() { 
		return authname; 
	} 
 
	public void setAuthname(String authname) { 
		this.authname = authname; 
	} 
 
} 
