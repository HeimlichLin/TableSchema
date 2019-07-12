package com.doc.common.bean; 
 
public class BrokerDo { 
 
	public enum COLUMNS { 
		BOXNO("null"), 
		USERID("null"), 
		BROKERBAN("null"), 
		BROKERNAME("null"), 
		BROKERADD("null"), 
		MD("null"), 
		TEL("null"), 
		FAX("null"), 
		STATUS("null"), 
		ACTIVEDATE("null"), 
		CHARGEDATE("null"), 
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
 
	private String boxno; 
	private String userid; 
	private String brokerban; 
	private String brokername; 
	private String brokeradd; 
	private String md; 
	private String tel; 
	private String fax; 
	private String status; 
	private String activedate; 
	private String chargedate; 
	private String enddate; 
	
	public String getBoxno() { 
		return boxno; 
	} 
 
	public void setBoxno(String boxno) { 
		this.boxno = boxno; 
	} 
 
	public String getUserid() { 
		return userid; 
	} 
 
	public void setUserid(String userid) { 
		this.userid = userid; 
	} 
 
	public String getBrokerban() { 
		return brokerban; 
	} 
 
	public void setBrokerban(String brokerban) { 
		this.brokerban = brokerban; 
	} 
 
	public String getBrokername() { 
		return brokername; 
	} 
 
	public void setBrokername(String brokername) { 
		this.brokername = brokername; 
	} 
 
	public String getBrokeradd() { 
		return brokeradd; 
	} 
 
	public void setBrokeradd(String brokeradd) { 
		this.brokeradd = brokeradd; 
	} 
 
	public String getMd() { 
		return md; 
	} 
 
	public void setMd(String md) { 
		this.md = md; 
	} 
 
	public String getTel() { 
		return tel; 
	} 
 
	public void setTel(String tel) { 
		this.tel = tel; 
	} 
 
	public String getFax() { 
		return fax; 
	} 
 
	public void setFax(String fax) { 
		this.fax = fax; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
	public String getActivedate() { 
		return activedate; 
	} 
 
	public void setActivedate(String activedate) { 
		this.activedate = activedate; 
	} 
 
	public String getChargedate() { 
		return chargedate; 
	} 
 
	public void setChargedate(String chargedate) { 
		this.chargedate = chargedate; 
	} 
 
	public String getEnddate() { 
		return enddate; 
	} 
 
	public void setEnddate(String enddate) { 
		this.enddate = enddate; 
	} 
 
} 
