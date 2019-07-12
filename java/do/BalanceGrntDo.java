package com.doc.common.bean; 
 
public class BalanceGrntDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		STRDATE("null"), 
		DECLNO("null"), 
		ITEMNO("null"), 
		REFBILLNO("null"), 
		ITEM("null"), 
		STRQTY("null"), 
		BALANCE("null"), 
		TAXAMT("null"), 
		PRDTNO("null"), 
		BALANCE_TAX("null") 
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
	private String strdate; 
	private String declno; 
	private BigDecimal itemno; 
	private String refbillno; 
	private BigDecimal item; 
	private BigDecimal strqty; 
	private BigDecimal balance; 
	private BigDecimal taxamt; 
	private String prdtno; 
	private BigDecimal balanceTax; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getStrdate() { 
		return strdate; 
	} 
 
	public void setStrdate(String strdate) { 
		this.strdate = strdate; 
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
 
	public BigDecimal getStrqty() { 
		return strqty; 
	} 
 
	public void setStrqty(BigDecimal strqty) { 
		this.strqty = strqty; 
	} 
 
	public BigDecimal getBalance() { 
		return balance; 
	} 
 
	public void setBalance(BigDecimal balance) { 
		this.balance = balance; 
	} 
 
	public BigDecimal getTaxamt() { 
		return taxamt; 
	} 
 
	public void setTaxamt(BigDecimal taxamt) { 
		this.taxamt = taxamt; 
	} 
 
	public String getPrdtno() { 
		return prdtno; 
	} 
 
	public void setPrdtno(String prdtno) { 
		this.prdtno = prdtno; 
	} 
 
	public BigDecimal getBalanceTax() { 
		return balanceTax; 
	} 
 
	public void setBalanceTax(BigDecimal balanceTax) { 
		this.balanceTax = balanceTax; 
	} 
 
} 
