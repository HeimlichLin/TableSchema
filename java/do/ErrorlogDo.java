package com.doc.common.bean; 
 
public class ErrorlogDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		REFBILLNO("null"), 
		STRTYPE("null"), 
		SENDFLAG("null"), 
		CONTROLNO("null"), 
		SENDTIME("null"), 
		NOTE("null"), 
		LOGTIME("null") 
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
	private String refbillno; 
	private String strtype; 
	private String sendflag; 
	private String controlno; 
	private java.sql.Timestamp sendtime; 
	private String note; 
	private java.sql.Timestamp logtime; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public String getStrtype() { 
		return strtype; 
	} 
 
	public void setStrtype(String strtype) { 
		this.strtype = strtype; 
	} 
 
	public String getSendflag() { 
		return sendflag; 
	} 
 
	public void setSendflag(String sendflag) { 
		this.sendflag = sendflag; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
	public java.sql.Timestamp getSendtime() { 
		return sendtime; 
	} 
 
	public void setSendtime(java.sql.Timestamp sendtime) { 
		this.sendtime = sendtime; 
	} 
 
	public String getNote() { 
		return note; 
	} 
 
	public void setNote(String note) { 
		this.note = note; 
	} 
 
	public java.sql.Timestamp getLogtime() { 
		return logtime; 
	} 
 
	public void setLogtime(java.sql.Timestamp logtime) { 
		this.logtime = logtime; 
	} 
 
} 
