package com.doc.common.bean; 
 
public class MailaccountDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		RECTYPE("R:收件人,C:副本收件人"), 
		RECEIVER("收件人名稱"), 
		MAILADDR("Mail Address") 
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
	private String rectype; 
	private String receiver; 
	private String mailaddr; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getRectype() { 
		return rectype; 
	} 
 
	public void setRectype(String rectype) { 
		this.rectype = rectype; 
	} 
 
	public String getReceiver() { 
		return receiver; 
	} 
 
	public void setReceiver(String receiver) { 
		this.receiver = receiver; 
	} 
 
	public String getMailaddr() { 
		return mailaddr; 
	} 
 
	public void setMailaddr(String mailaddr) { 
		this.mailaddr = mailaddr; 
	} 
 
} 
