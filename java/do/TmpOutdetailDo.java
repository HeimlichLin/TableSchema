package com.doc.common.bean; 
 
public class TmpOutdetailDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		PRDTNO("null"), 
		OUTUNIT("null"), 
		OUTQTY("null"), 
		DECLTYPE("null"), 
		IDECLTYPE("null"), 
		PROCESS("null"), 
		BOMRATE("null"), 
		SESSIONID("null"), 
		PARTNO("null"), 
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
	private String outunit; 
	private BigDecimal outqty; 
	private String decltype; 
	private String idecltype; 
	private String process; 
	private BigDecimal bomrate; 
	private String sessionid; 
	private String partno; 
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
 
	public String getOutunit() { 
		return outunit; 
	} 
 
	public void setOutunit(String outunit) { 
		this.outunit = outunit; 
	} 
 
	public BigDecimal getOutqty() { 
		return outqty; 
	} 
 
	public void setOutqty(BigDecimal outqty) { 
		this.outqty = outqty; 
	} 
 
	public String getDecltype() { 
		return decltype; 
	} 
 
	public void setDecltype(String decltype) { 
		this.decltype = decltype; 
	} 
 
	public String getIdecltype() { 
		return idecltype; 
	} 
 
	public void setIdecltype(String idecltype) { 
		this.idecltype = idecltype; 
	} 
 
	public String getProcess() { 
		return process; 
	} 
 
	public void setProcess(String process) { 
		this.process = process; 
	} 
 
	public BigDecimal getBomrate() { 
		return bomrate; 
	} 
 
	public void setBomrate(BigDecimal bomrate) { 
		this.bomrate = bomrate; 
	} 
 
	public String getSessionid() { 
		return sessionid; 
	} 
 
	public void setSessionid(String sessionid) { 
		this.sessionid = sessionid; 
	} 
 
	public String getPartno() { 
		return partno; 
	} 
 
	public void setPartno(String partno) { 
		this.partno = partno; 
	} 
 
	public String getOptypenme() { 
		return optypenme; 
	} 
 
	public void setOptypenme(String optypenme) { 
		this.optypenme = optypenme; 
	} 
 
} 
