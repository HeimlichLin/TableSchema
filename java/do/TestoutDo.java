package com.doc.common.bean; 
 
public class TestoutDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		TESTNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		PRDTQTY("null"), 
		PRDTUNIT("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		OREFBILLNO("null"), 
		OITEM("null"), 
		INPOST("null"), 
		D7DECLNO("null"), 
		D7ITEMNO("null"), 
		D7QTY("null"), 
		D7DECLTYPE("null"), 
		UPDTIME("null"), 
		OUTDATE("null") 
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
	private String testno; 
	private BigDecimal item; 
	private String prdtno; 
	private BigDecimal prdtqty; 
	private String prdtunit; 
	private String declno; 
	private BigDecimal itemno; 
	private String orefbillno; 
	private BigDecimal oitem; 
	private String inpost; 
	private String d7declno; 
	private BigDecimal d7itemno; 
	private BigDecimal d7qty; 
	private String d7decltype; 
	private String updtime; 
	private String outdate; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getTestno() { 
		return testno; 
	} 
 
	public void setTestno(String testno) { 
		this.testno = testno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public BigDecimal getPrdtqty() { 
		return prdtqty; 
	} 
 
	public void setPrdtqty(BigDecimal prdtqty) { 
		this.prdtqty = prdtqty; 
	} 
 
	public String getPrdtunit() { 
		return prdtunit; 
	} 
 
	public void setPrdtunit(String prdtunit) { 
		this.prdtunit = prdtunit; 
	} 
 
	public String getDeclno() { 
		return declno; 
	} 
 
	public void setDeclno(String declno) { 
		this.declno = declno; 
	} 
 
	public BigDecimal getItemno() { 
		return itemno; 
	} 
 
	public void setItemno(BigDecimal itemno) { 
		this.itemno = itemno; 
	} 
 
	public String getOrefbillno() { 
		return orefbillno; 
	} 
 
	public void setOrefbillno(String orefbillno) { 
		this.orefbillno = orefbillno; 
	} 
 
	public BigDecimal getOitem() { 
		return oitem; 
	} 
 
	public void setOitem(BigDecimal oitem) { 
		this.oitem = oitem; 
	} 
 
	public String getInpost() { 
		return inpost; 
	} 
 
	public void setInpost(String inpost) { 
		this.inpost = inpost; 
	} 
 
	public String getD7declno() { 
		return d7declno; 
	} 
 
	public void setD7declno(String d7declno) { 
		this.d7declno = d7declno; 
	} 
 
	public BigDecimal getD7itemno() { 
		return d7itemno; 
	} 
 
	public void setD7itemno(BigDecimal d7itemno) { 
		this.d7itemno = d7itemno; 
	} 
 
	public BigDecimal getD7qty() { 
		return d7qty; 
	} 
 
	public void setD7qty(BigDecimal d7qty) { 
		this.d7qty = d7qty; 
	} 
 
	public String getD7decltype() { 
		return d7decltype; 
	} 
 
	public void setD7decltype(String d7decltype) { 
		this.d7decltype = d7decltype; 
	} 
 
	public String getUpdtime() { 
		return updtime; 
	} 
 
	public void setUpdtime(String updtime) { 
		this.updtime = updtime; 
	} 
 
	public String getOutdate() { 
		return outdate; 
	} 
 
	public void setOutdate(String outdate) { 
		this.outdate = outdate; 
	} 
 
} 
