package com.doc.common.po.impl; 
 
public class BalanceGrntPo implements IBalanceGrntPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		STRDATE("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		REFBILLNO("null"), //
		ITEM("null"), //
		STRQTY("null"), //
		BALANCE("null"), //
		TAXAMT("null"), //
		PRDTNO("null"), //
		BALANCE_TAX("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getStrdate() {
		return this.strdate;
	}
 
	@Override
	public void setStrdate(final String strdate) {
		this.strdate = strdate; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public BigDecimal getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final BigDecimal itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public String getRefbillno() {
		return this.refbillno;
	}
 
	@Override
	public void setRefbillno(final String refbillno) {
		this.refbillno = refbillno; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
	@Override
	public BigDecimal getStrqty() {
		return this.strqty;
	}
 
	@Override
	public void setStrqty(final BigDecimal strqty) {
		this.strqty = strqty; 
	}
 
	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}
 
	@Override
	public void setBalance(final BigDecimal balance) {
		this.balance = balance; 
	}
 
	@Override
	public BigDecimal getTaxamt() {
		return this.taxamt;
	}
 
	@Override
	public void setTaxamt(final BigDecimal taxamt) {
		this.taxamt = taxamt; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getBalanceTax() {
		return this.balanceTax;
	}
 
	@Override
	public void setBalanceTax(final BigDecimal balanceTax) {
		this.balanceTax = balanceTax; 
	}
 
}
