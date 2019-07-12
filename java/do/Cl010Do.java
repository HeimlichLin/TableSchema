package com.doc.common.bean; 
 
public class Cl010Do { 
 
	public enum COLUMNS { 
		REFBILLNO("null"), 
		ITEM("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		RINQTY("null"), 
		BALANCE("null"), 
		INRMKS("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String refbillno; 
	private BigDecimal item; 
	private String declno; 
	private BigDecimal itemno; 
	private BigDecimal rinqty; 
	private BigDecimal balance; 
	private String inrmks; 
	
	public String getRefbillno() { 
		return refbillno; 
	} 
 
	public void setRefbillno(String refbillno) { 
		this.refbillno = refbillno; 
	} 
 
	public BigDecimal getItem() { 
		return item; 
	} 
 
	public void setItem(BigDecimal item) { 
		this.item = item; 
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
 
	public BigDecimal getRinqty() { 
		return rinqty; 
	} 
 
	public void setRinqty(BigDecimal rinqty) { 
		this.rinqty = rinqty; 
	} 
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public String getInrmks() { 
		return inrmks; 
	} 
 
	public void setInrmks(String inrmks) { 
		this.inrmks = inrmks; 
	} 
 
} 
