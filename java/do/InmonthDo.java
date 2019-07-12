package com.doc.common.bean; 
 
public class InmonthDo { 
 
	public enum COLUMNS { 
		BONDNO("監管編號"), 
		MONTHNO("彙報單號"), 
		ITEM("項次"), 
		PRDTNO("料號"), 
		MINQTY("彙報進倉數量"), 
		INUNIT("進倉單位") 
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
	private BigDecimal minqty; 
	private String inunit; 
	
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
 
	public BigDecimal getMinqty() { 
		return minqty; 
	} 
 
	public void setMinqty(BigDecimal minqty) { 
		this.minqty = minqty; 
	} 
 
	public String getInunit() { 
		return inunit; 
	} 
 
	public void setInunit(String inunit) { 
		this.inunit = inunit; 
	} 
 
} 
