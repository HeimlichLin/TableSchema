package com.doc.common.bean; 
 
public class RejrsnDo { 
 
	public enum COLUMNS { 
		REJNO("null"), 
		REJNAME("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String rejno; 
	private String rejname; 
	
	public String getRejno() { 
		return rejno; 
	} 
 
	public void setRejno(String rejno) { 
		this.rejno = rejno; 
	} 
 
	public String getRejname() { 
		return rejname; 
	} 
 
	public void setRejname(String rejname) { 
		this.rejname = rejname; 
	} 
 
} 
