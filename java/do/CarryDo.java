package com.doc.common.bean; 
 
public class CarryDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		UPDTIME("null"), 
		CARRYNO("null"), 
		STRTYPE("null") 
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
	private String declno; 
	private String updtime; 
	private String carryno; 
	private String strtype; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getCarryno() { 
		return carryno; 
	} 
 
	public void setCarryno(String carryno) { 
		this.carryno = carryno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
} 
