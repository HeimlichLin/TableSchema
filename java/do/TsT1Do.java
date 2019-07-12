package com.doc.common.bean; 
 
public class TsT1Do { 
 
	public enum COLUMNS { 
		T1BONDNO("null"), 
		T1TESTNO("null"), 
		T1CTMCODE("null"), 
		T1REQRDATE("null"), 
		T1APPLYDATE("null"), 
		T1APPROVEDDATE("null"), 
		T1APPROVEDNO("null"), 
		T1DESTPLACE("null"), 
		T1TESTTYPE("null"), 
		T1STRTYPE("null"), 
		CONTROLNO("null"), 
		SERIALNO("null"), 
		SEQNO("null"), 
		ICONFIRMED("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String t1bondno; 
	private String t1testno; 
	private String t1ctmcode; 
	private String t1reqrdate; 
	private String t1applydate; 
	private String t1approveddate; 
	private String t1approvedno; 
	private String t1destplace; 
	private String t1testtype; 
	private String t1strtype; 
	private String controlno; 
	private BigDecimal serialno; 
	private BigDecimal seqno; 
	private String iconfirmed; 
	
	public String getT1bondno() { 
		return t1bondno; 
	} 
 
	public void setT1bondno(String t1bondno) { 
		this.t1bondno = t1bondno; 
	} 
 
	public String getT1testno() { 
		return t1testno; 
	} 
 
	public void setT1testno(String t1testno) { 
		this.t1testno = t1testno; 
	} 
 
	public String getT1ctmcode() { 
		return t1ctmcode; 
	} 
 
	public void setT1ctmcode(String t1ctmcode) { 
		this.t1ctmcode = t1ctmcode; 
	} 
 
	public String getT1reqrdate() { 
		return t1reqrdate; 
	} 
 
	public void setT1reqrdate(String t1reqrdate) { 
		this.t1reqrdate = t1reqrdate; 
	} 
 
	public String getT1applydate() { 
		return t1applydate; 
	} 
 
	public void setT1applydate(String t1applydate) { 
		this.t1applydate = t1applydate; 
	} 
 
	public String getT1approveddate() { 
		return t1approveddate; 
	} 
 
	public void setT1approveddate(String t1approveddate) { 
		this.t1approveddate = t1approveddate; 
	} 
 
	public String getT1approvedno() { 
		return t1approvedno; 
	} 
 
	public void setT1approvedno(String t1approvedno) { 
		this.t1approvedno = t1approvedno; 
	} 
 
	public String getT1destplace() { 
		return t1destplace; 
	} 
 
	public void setT1destplace(String t1destplace) { 
		this.t1destplace = t1destplace; 
	} 
 
	public String getT1testtype() { 
		return t1testtype; 
	} 
 
	public void setT1testtype(String t1testtype) { 
		this.t1testtype = t1testtype; 
	} 
 
	public String getT1strtype() { 
		return t1strtype; 
	} 
 
	public void setT1strtype(String t1strtype) { 
		this.t1strtype = t1strtype; 
	} 
 
	public String getControlno() { 
		return controlno; 
	} 
 
	public void setControlno(String controlno) { 
		this.controlno = controlno; 
	} 
 
	public BigDecimal getSerialno() { 
		return serialno; 
	} 
 
	public void setSerialno(BigDecimal serialno) { 
		this.serialno = serialno; 
	} 
 
	public BigDecimal getSeqno() { 
		return seqno; 
	} 
 
	public void setSeqno(BigDecimal seqno) { 
		this.seqno = seqno; 
	} 
 
	public String getIconfirmed() { 
		return iconfirmed; 
	} 
 
	public void setIconfirmed(String iconfirmed) { 
		this.iconfirmed = iconfirmed; 
	} 
 
} 
