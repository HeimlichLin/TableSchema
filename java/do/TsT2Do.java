package com.doc.common.bean; 
 
public class TsT2Do { 
 
	public enum COLUMNS { 
		T2ITEM("null"), 
		T2PRDTNO("null"), 
		T2RSTRQTY("null"), 
		T2PRDTUNIT("null"), 
		T2UNITPRICE("null"), 
		T2ODECLNO("null"), 
		T2OITEM("null"), 
		T2INPOST("null"), 
		T2OREFBILLNO("null"), 
		T2OREFBILLITEM("null"), 
		T2DESCRIP("null"), 
		CONTROLNO("null"), 
		SERIALNO("null"), 
		SEQNO("null"), 
		ICONFIRMED("null"), 
		T1BONDNO("null"), 
		T1TESTNO("null"), 
		T1_SEQNO("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private BigDecimal t2item; 
	private String t2prdtno; 
	private BigDecimal t2rstrqty; 
	private String t2prdtunit; 
	private BigDecimal t2unitprice; 
	private String t2odeclno; 
	private BigDecimal t2oitem; 
	private String t2inpost; 
	private String t2orefbillno; 
	private BigDecimal t2orefbillitem; 
	private String t2descrip; 
	private String controlno; 
	private BigDecimal serialno; 
	private BigDecimal seqno; 
	private String iconfirmed; 
	private String t1bondno; 
	private String t1testno; 
	private BigDecimal t1Seqno; 
	
	public BigDecimal getT2item() { 
		return t2item; 
	} 
 
	public void setT2item(BigDecimal t2item) { 
		this.t2item = t2item; 
	} 
 
	public String getT2prdtno() { 
		return t2prdtno; 
	} 
 
	public void setT2prdtno(String t2prdtno) { 
		this.t2prdtno = t2prdtno; 
	} 
 
	public BigDecimal getT2rstrqty() { 
		return t2rstrqty; 
	} 
 
	public void setT2rstrqty(BigDecimal t2rstrqty) { 
		this.t2rstrqty = t2rstrqty; 
	} 
 
	public String getT2prdtunit() { 
		return t2prdtunit; 
	} 
 
	public void setT2prdtunit(String t2prdtunit) { 
		this.t2prdtunit = t2prdtunit; 
	} 
 
	public BigDecimal getT2unitprice() { 
		return t2unitprice; 
	} 
 
	public void setT2unitprice(BigDecimal t2unitprice) { 
		this.t2unitprice = t2unitprice; 
	} 
 
	public String getT2odeclno() { 
		return t2odeclno; 
	} 
 
	public void setT2odeclno(String t2odeclno) { 
		this.t2odeclno = t2odeclno; 
	} 
 
	public BigDecimal getT2oitem() { 
		return t2oitem; 
	} 
 
	public void setT2oitem(BigDecimal t2oitem) { 
		this.t2oitem = t2oitem; 
	} 
 
	public String getT2inpost() { 
		return t2inpost; 
	} 
 
	public void setT2inpost(String t2inpost) { 
		this.t2inpost = t2inpost; 
	} 
 
	public String getT2orefbillno() { 
		return t2orefbillno; 
	} 
 
	public void setT2orefbillno(String t2orefbillno) { 
		this.t2orefbillno = t2orefbillno; 
	} 
 
	public BigDecimal getT2orefbillitem() { 
		return t2orefbillitem; 
	} 
 
	public void setT2orefbillitem(BigDecimal t2orefbillitem) { 
		this.t2orefbillitem = t2orefbillitem; 
	} 
 
	public String getT2descrip() { 
		return t2descrip; 
	} 
 
	public void setT2descrip(String t2descrip) { 
		this.t2descrip = t2descrip; 
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
 
} 
