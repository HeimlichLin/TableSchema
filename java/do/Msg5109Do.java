package com.doc.common.bean; 
 
public class Msg5109Do { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		DECLNO("null"), 
		DOCNUM("null"), 
		PROCTIME("null"), 
		CNNAME("null"), 
		PROCESSID("null"), 
		INTCTLNO("null"), 
		SENDTIME("null"), 
		MSGREFNO("null"), 
		CONTRNO("null") 
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
	private String docnum; 
	private java.sql.Timestamp proctime; 
	private String cnname; 
	private String processid; 
	private String intctlno; 
	private java.sql.Timestamp sendtime; 
	private String msgrefno; 
	private String contrno; 
	
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
 
	public String getDocnum() { 
		return docnum; 
	} 
 
	public void setDocnum(String docnum) { 
		this.docnum = docnum; 
	} 
 
	public java.sql.Timestamp getProctime() { 
		return proctime; 
	} 
 
	public void setProctime(java.sql.Timestamp proctime) { 
		this.proctime = proctime; 
	} 
 
	public String getCnname() { 
		return cnname; 
	} 
 
	public void setCnname(String cnname) { 
		this.cnname = cnname; 
	} 
 
	public String getProcessid() { 
		return processid; 
	} 
 
	public void setProcessid(String processid) { 
		this.processid = processid; 
	} 
 
	public String getIntctlno() { 
		return intctlno; 
	} 
 
	public void setIntctlno(String intctlno) { 
		this.intctlno = intctlno; 
	} 
 
	public java.sql.Timestamp getSendtime() { 
		return sendtime; 
	} 
 
	public void setSendtime(java.sql.Timestamp sendtime) { 
		this.sendtime = sendtime; 
	} 
 
	public String getMsgrefno() { 
		return msgrefno; 
	} 
 
	public void setMsgrefno(String msgrefno) { 
		this.msgrefno = msgrefno; 
	} 
 
	public String getContrno() { 
		return contrno; 
	} 
 
	public void setContrno(String contrno) { 
		this.contrno = contrno; 
	} 
 
} 
