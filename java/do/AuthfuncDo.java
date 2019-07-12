package com.doc.common.bean; 
 
public class AuthfuncDo { 
 
	public enum COLUMNS { 
		AUTHID("null"), 
		FUNCID("null"), 
		AUTHNAME("null"), 
		RW("null") 
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
	private String funcid; 
	private String authname; 
	private String rw; 
	
	public String getAuthid() { 
		return authid; 
	} 
 
	public void setAuthid(String authid) { 
		this.authid = authid; 
	} 
 
	public String getFuncid() { 
		return funcid; 
	} 
 
	public void setFuncid(String funcid) { 
		this.funcid = funcid; 
	} 
 
	public String getAuthname() { 
		return authname; 
	} 
 
	public void setAuthname(String authname) { 
		this.authname = authname; 
	} 
 
	public String getRw() { 
		return rw; 
	} 
 
	public void setRw(String rw) { 
		this.rw = rw; 
	} 
 
} 
