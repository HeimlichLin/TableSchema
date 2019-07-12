package com.doc.common.bean; 
 
public class TsT3Do { 
 
	public enum COLUMNS { 
		T3ITEM("null"), 
		T3PRDTNO("null"), 
		T3RSTRQTY("null"), 
		T3BACKDATE("null"), 
		T3BATCHNO("null"), 
		CONTROLNO("null"), 
		SERIALNO("null"), 
		SEQNO("null"), 
		ICONFIRMED("null"), 
		T1BONDNO("null"), 
		T1TESTNO("null"), 
		T1_SEQNO("null"), 
		T3INPOST("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private BigDecimal t3item; 
	private String t3prdtno; 
	private BigDecimal t3rstrqty; 
	private String t3backdate; 
	private BigDecimal t3batchno; 
	private String controlno; 
	private BigDecimal serialno; 
	private BigDecimal seqno; 
	private String iconfirmed; 
	private String t1bondno; 
	private String t1testno; 
	private BigDecimal t1Seqno; 
	private String t3inpost; 
	
	public BigDecimal getT3item() { 
		return t3item; 
	} 
 
	public void setT3item(BigDecimal t3item) { 
		this.t3item = t3item; 
	} 
 
	public String getT3prdtno() { 
		return t3prdtno; 
	} 
 
	public void setT3prdtno(String t3prdtno) { 
		this.t3prdtno = t3prdtno; 
	} 
 
	public BigDecimal getT3rstrqty() { 
		return t3rstrqty; 
	} 
 
	public void setT3rstrqty(BigDecimal t3rstrqty) { 
		this.t3rstrqty = t3rstrqty; 
	} 
 
	public String getT3backdate() { 
		return t3backdate; 
	} 
 
	public void setT3backdate(String t3backdate) { 
		this.t3backdate = t3backdate; 
	} 
 
	public BigDecimal getT3batchno() { 
		return t3batchno; 
	} 
 
	public void setT3batchno(BigDecimal t3batchno) { 
		this.t3batchno = t3batchno; 
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
 
	public BigDecimal getT1Seqno() { 
		return t1Seqno; 
	} 
 
	public void setT1Seqno(BigDecimal t1Seqno) { 
		this.t1Seqno = t1Seqno; 
	} 
 
	public String getT3inpost() { 
		return t3inpost; 
	} 
 
	public void setT3inpost(String t3inpost) { 
		this.t3inpost = t3inpost; 
	} 
 
} 
