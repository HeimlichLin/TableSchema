package com.doc.common.bean; 
 
public class MonthDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		STRTYPE("進出倉別"), 
		CTMCODE("客戶代螞"), 
		MONTHNO("彙報單號"), 
		DECLTYPE("報單類別"), 
		DECLNO("報單號碼"), 
		MDATE("彙報日期"), 
		ORDERBY("null"), 
		CONFIRMDATE("null") 
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
	private String strtype; 
	private String ctmcode; 
	private String monthno; 
	private String decltype; 
	private String declno; 
	private String mdate; 
	private String orderby; 
	private String confirmdate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getMonthno() { 
		return monthno; 
	} 
 
	public void setMonthno(String monthno) { 
		this.monthno = monthno; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getMdate() { 
		return mdate; 
	} 
 
	public void setMdate(String mdate) { 
		this.mdate = mdate; 
	} 
 
	public String getOrderby() { 
		return orderby; 
	} 
 
	public void setOrderby(String orderby) { 
		this.orderby = orderby; 
	} 
 
	public String getConfirmdate() { 
		return confirmdate; 
	} 
 
	public void setConfirmdate(String confirmdate) { 
		this.confirmdate = confirmdate; 
	} 
 
} 
