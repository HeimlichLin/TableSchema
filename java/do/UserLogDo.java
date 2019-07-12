package com.doc.common.bean; 
 
public class UserLogDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		BONDBAN("null"), 
		BONDNAME("null"), 
		SPECIALST("null"), 
		BONDID("null"), 
		AUTHORITY("null"), 
		CUSTOMSOFFICE("null"), 
		LOGINTIME("null") 
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
	private String bondban; 
	private String bondname; 
	private String specialst; 
	private String bondid; 
	private String authority; 
	private String customsoffice; 
	private String logintime; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getBondban() { 
		return bondban; 
	} 
 
	public void setBondban(String bondban) { 
		this.bondban = bondban; 
	} 
 
	public String getBondname() { 
		return bondname; 
	} 
 
	public void setBondname(String bondname) { 
		this.bondname = bondname; 
	} 
 
	public String getSpecialst() { 
		return specialst; 
	} 
 
	public void setSpecialst(String specialst) { 
		this.specialst = specialst; 
	} 
 
	public String getBondid() { 
		return bondid; 
	} 
 
	public void setBondid(String bondid) { 
		this.bondid = bondid; 
	} 
 
	public String getAuthority() { 
		return authority; 
	} 
 
	public void setAuthority(String authority) { 
		this.authority = authority; 
	} 
 
	public String getCustomsoffice() { 
		return customsoffice; 
	} 
 
	public void setCustomsoffice(String customsoffice) { 
		this.customsoffice = customsoffice; 
	} 
 
	public String getLogintime() { 
		return logintime; 
	} 
 
	public void setLogintime(String logintime) { 
		this.logintime = logintime; 
	} 
 
} 
