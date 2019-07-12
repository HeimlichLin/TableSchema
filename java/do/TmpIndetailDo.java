package com.doc.common.bean; 
 
public class TmpIndetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		PRDTNO("null"), 
		INUNIT("null"), 
		RINQTY("null"), 
		DECLTYPE("null"), 
		SESSIONID("null"), 
		OPTYPENME("null") 
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
	private String prdtno; 
	private String inunit; 
	private BigDecimal rinqty; 
	private String decltype; 
	private String sessionid; 
	private String optypenme; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getInunit() { 
		return inunit; 
	} 
 
	public void setInunit(String inunit) { 
		this.inunit = inunit; 
	} 
 
	public BigDecimal getRinqty() { 
		return rinqty; 
	} 
 
	public void setRinqty(BigDecimal rinqty) { 
		this.rinqty = rinqty; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getSessionid() { 
		return sessionid; 
	} 
 
	public void setSessionid(String sessionid) { 
		this.sessionid = sessionid; 
	} 
 
	public String getOptypenme() { 
		return optypenme; 
	} 
 
	public void setOptypenme(String optypenme) { 
		this.optypenme = optypenme; 
	} 
 
} 
