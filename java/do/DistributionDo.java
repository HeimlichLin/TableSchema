package com.doc.common.bean; 
 
public class DistributionDo { 
 
	public enum COLUMNS { 
		VALSYSTEM("null"), 
		MSGCODE("null"), 
		CONDTYPE("null"), 
		BOXNO("null"), 
		OWNERBAN("null"), 
		STGPLACE("null"), 
		DECLTYPE("null"), 
		SENDTYPE("null"), 
		DESTIN01("null"), 
		DESTIN02("null"), 
		DESTIN03("null"), 
		DESTIN04("null"), 
		DESTIN05("null"), 
		ACTIVEDATE("null"), 
		ENDDATE("null"), 
		STATUS("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String valsystem; 
	private String msgcode; 
	private String condtype; 
	private String boxno; 
	private String ownerban; 
	private String stgplace; 
	private String decltype; 
	private String sendtype; 
	private String destin01; 
	private String destin02; 
	private String destin03; 
	private String destin04; 
	private String destin05; 
	private String activedate; 
	private String enddate; 
	private String status; 
	
	public String getValsystem() { 
		return valsystem; 
	} 
 
	public void setValsystem(String valsystem) { 
		this.valsystem = valsystem; 
	} 
 
	public String getMsgcode() { 
		return msgcode; 
	} 
 
	public void setMsgcode(String msgcode) { 
		this.msgcode = msgcode; 
	} 
 
	public String getCondtype() { 
		return condtype; 
	} 
 
	public void setCondtype(String condtype) { 
		this.condtype = condtype; 
	} 
 
	public String getBoxno() { 
		return boxno; 
	} 
 
	public void setBoxno(String boxno) { 
		this.boxno = boxno; 
	} 
 
	public String getOwnerban() { 
		return ownerban; 
	} 
 
	public void setOwnerban(String ownerban) { 
		this.ownerban = ownerban; 
	} 
 
	public String getStgplace() { 
		return stgplace; 
	} 
 
	public void setStgplace(String stgplace) { 
		this.stgplace = stgplace; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getSendtype() { 
		return sendtype; 
	} 
 
	public void setSendtype(String sendtype) { 
		this.sendtype = sendtype; 
	} 
 
	public String getDestin01() { 
		return destin01; 
	} 
 
	public void setDestin01(String destin01) { 
		this.destin01 = destin01; 
	} 
 
	public String getDestin02() { 
		return destin02; 
	} 
 
	public void setDestin02(String destin02) { 
		this.destin02 = destin02; 
	} 
 
	public String getDestin03() { 
		return destin03; 
	} 
 
	public void setDestin03(String destin03) { 
		this.destin03 = destin03; 
	} 
 
	public String getDestin04() { 
		return destin04; 
	} 
 
	public void setDestin04(String destin04) { 
		this.destin04 = destin04; 
	} 
 
	public String getDestin05() { 
		return destin05; 
	} 
 
	public void setDestin05(String destin05) { 
		this.destin05 = destin05; 
	} 
 
	public String getActivedate() { 
		return activedate; 
	} 
 
	public void setActivedate(String activedate) { 
		this.activedate = activedate; 
	} 
 
	public String getEnddate() { 
		return enddate; 
	} 
 
	public void setEnddate(String enddate) { 
		this.enddate = enddate; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
} 
