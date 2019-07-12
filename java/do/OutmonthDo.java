package com.doc.common.bean; 
 
public class OutmonthDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		MONTHNO("null"), 
		ITEM("null"), 
		PRDTNO("null"), 
		MOUTQTY("null"), 
		OUTUNIT("null") 
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
	private String monthno; 
	private BigDecimal item; 
	private String prdtno; 
	private BigDecimal moutqty; 
	private String outunit; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getMonthno() { 
		return monthno; 
	} 
 
	public void setMonthno(String monthno) { 
		this.monthno = monthno; 
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
 
	public BigDecimal getMoutqty() { 
		return moutqty; 
	} 
 
	public void setMoutqty(BigDecimal moutqty) { 
		this.moutqty = moutqty; 
	} 
 
	public String getOutunit() { 
		return outunit; 
	} 
 
	public void setOutunit(String outunit) { 
		this.outunit = outunit; 
	} 
 
} 
