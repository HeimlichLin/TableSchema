package com.doc.common.bean; 
 
public class ShutdeclarDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		STRTYPE("null"), 
		DECLTYPE("null"), 
		SHIPTYPE("null"), 
		DECLNO("null"), 
		DOCNO("null"), 
		SHUTDATE("null"), 
		MSGFUN("null"), 
		RMK("null"), 
		UPDTIME("null") 
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
	private String decltype; 
	private String shiptype; 
	private String declno; 
	private String docno; 
	private String shutdate; 
	private String msgfun; 
	private String rmk; 
	private String updtime; 
	
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
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getShiptype() { 
		return shiptype; 
	} 
 
	public void setShiptype(String shiptype) { 
		this.shiptype = shiptype; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public String getDocno() { 
		return docno; 
	} 
 
	public void setDocno(String docno) { 
		this.docno = docno; 
	} 
 
	public String getShutdate() { 
		return shutdate; 
	} 
 
	public void setShutdate(String shutdate) { 
		this.shutdate = shutdate; 
	} 
 
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
	public String getRmk() { 
		return rmk; 
	} 
 
	public void setRmk(String rmk) { 
		this.rmk = rmk; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
} 
