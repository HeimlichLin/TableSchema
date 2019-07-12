package com.doc.common.bean; 
 
public class InvtrybondDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		YY("null"), 
		STRTDATE("null"), 
		ENDDATE("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private String yy; 
	private String strtdate; 
	private String enddate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getYy() { 
		return yy; 
	} 
 
	public void setYy(String yy) { 
		this.yy = yy; 
	} 
 
	public String getStrtdate() { 
		return strtdate; 
	} 
 
	public void setStrtdate(String strtdate) { 
		this.strtdate = strtdate; 
	} 
 
	public String getEnddate() { 
		return enddate; 
	} 
 
	public void setEnddate(String enddate) { 
		this.enddate = enddate; 
	} 
 
} 
