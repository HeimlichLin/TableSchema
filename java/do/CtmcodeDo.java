package com.doc.common.bean; 
 
public class CtmcodeDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		CTMCODE("客戶代碼"), 
		CTMNAME("客戶名稱"), 
		CTMID("客戶使用代碼"), 
		CTMBAN("客戶統一編號"), 
		CTMENGNAME("客戶英文名稱"), 
		CTMADD("客戶地址") 
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
	private String ctmcode; 
	private String ctmname; 
	private String ctmid; 
	private String ctmban; 
	private String ctmengname; 
	private String ctmadd; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getCtmcode() { 
		return ctmcode; 
	} 
 
	public void setCtmcode(String ctmcode) { 
		this.ctmcode = ctmcode; 
	} 
 
	public String getCtmname() { 
		return ctmname; 
	} 
 
	public void setCtmname(String ctmname) { 
		this.ctmname = ctmname; 
	} 
 
	public String getCtmid() { 
		return ctmid; 
	} 
 
	public void setCtmid(String ctmid) { 
		this.ctmid = ctmid; 
	} 
 
	public String getCtmban() { 
		return ctmban; 
	} 
 
	public void setCtmban(String ctmban) { 
		this.ctmban = ctmban; 
	} 
 
	public String getCtmengname() { 
		return ctmengname; 
	} 
 
	public void setCtmengname(String ctmengname) { 
		this.ctmengname = ctmengname; 
	} 
 
	public String getCtmadd() { 
		return ctmadd; 
	} 
 
	public void setCtmadd(String ctmadd) { 
		this.ctmadd = ctmadd; 
	} 
 
} 
