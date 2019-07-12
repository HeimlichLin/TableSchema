package com.doc.common.bean; 
 
public class TestitembackDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		TESTNO("null"), 
		PRDTNO("null"), 
		SERIALNO("null"), 
		BACKQTY("null"), 
		BACKDATE("null"), 
		ITEM("null"), 
		BACKPOST("null") 
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
	private String prdtno; 
	private String serialno; 
	private BigDecimal backqty; 
	private String backdate; 
	private BigDecimal item; 
	private String backpost; 
	
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
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public String getSerialno() { 
		return serialno; 
	} 
 
	public void setSerialno(String serialno) { 
		this.serialno = serialno; 
	} 
 
	public BigDecimal getBackqty() { 
		return backqty; 
	} 
 
	public void setBackqty(BigDecimal backqty) { 
		this.backqty = backqty; 
	} 
 
	public String getBackdate() { 
		return backdate; 
	} 
 
	public void setBackdate(String backdate) { 
		this.backdate = backdate; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
	} 
 
	public String getBackpost() { 
		return backpost; 
	} 
 
	public void setBackpost(String backpost) { 
		this.backpost = backpost; 
	} 
 
} 
