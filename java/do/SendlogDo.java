package com.doc.common.bean; 
 
public class SendlogDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		STRTYPE("null"), 
		SENDFLAG("null"), 
		CONTROLNO("null"), 
		SENDTIME("null"), 
		MSGFUN("null"), 
		MSGTYPE("null"), 
		ASTYPE("海空運別.S:海運.A:空運") 
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
	private String strtype; 
	private String sendflag; 
	private String controlno; 
	private java.sql.Timestamp sendtime; 
	private String msgfun; 
	private String msgtype; 
	private String astype; 
	
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
 
	public String getMsgfun() { 
		return msgfun; 
	} 
 
	public void setMsgfun(String msgfun) { 
		this.msgfun = msgfun; 
	} 
 
	public String getMsgtype() { 
		return msgtype; 
	} 
 
	public void setMsgtype(String msgtype) { 
		this.msgtype = msgtype; 
	} 
 
	public String getAstype() { 
		return astype; 
	} 
 
	public void setAstype(String astype) { 
		this.astype = astype; 
	} 
 
} 
