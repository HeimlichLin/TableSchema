package com.doc.common.bean; 
 
public class FuncinfDo { 
 
	public enum COLUMNS { 
		FUNCID("null"), 
		FUNCNAME("null"), 
		CODENAME("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String funcid; 
	private String funcname; 
	private String codename; 
	
	public String getFuncid() { 
		return funcid; 
	} 
 
	public void setFuncid(String funcid) { 
		this.funcid = funcid; 
	} 
 
	public String getFuncname() { 
		return funcname; 
	} 
 
	public void setFuncname(String funcname) { 
		this.funcname = funcname; 
	} 
 
	public String getCodename() { 
		return codename; 
	} 
 
	public void setCodename(String codename) { 
		this.codename = codename; 
	} 
 
} 
