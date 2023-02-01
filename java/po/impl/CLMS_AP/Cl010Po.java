package com.doc.common.po.impl; 
 
public class Cl010Po implements ICl010Po {
 
	public enum COLUMNS {
		REFBILLNO("null"), //
		ITEM("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		RINQTY("null"), //
		BALANCE("null"), //
		INRMKS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String refbillno;
	private BigDecimal item;
	private String declno;
	private BigDecimal itemno;
	private BigDecimal rinqty;
	private BigDecimal balance;
	private String inrmks;

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
	public BigDecimal getRinqty() {
		return this.rinqty;
	}
 
	@Override
	public void setRinqty(final BigDecimal rinqty) {
		this.rinqty = rinqty; 
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
	public String getInrmks() {
		return this.inrmks;
	}
 
	@Override
	public void setInrmks(final String inrmks) {
		this.inrmks = inrmks; 
	}
 
}
