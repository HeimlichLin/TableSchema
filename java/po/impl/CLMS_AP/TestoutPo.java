package com.doc.common.po.impl; 
 
public class TestoutPo implements ITestoutPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		TESTNO("null"), //
		ITEM("null"), //
		PRDTNO("null"), //
		PRDTQTY("null"), //
		PRDTUNIT("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		OREFBILLNO("null"), //
		OITEM("null"), //
		INPOST("null"), //
		D7DECLNO("null"), //
		D7ITEMNO("null"), //
		D7QTY("null"), //
		D7DECLTYPE("null"), //
		UPDTIME("null"), //
		OUTDATE("null") //
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getTestno() {
		return this.testno;
	}
 
	@Override
	public void setTestno(final String testno) {
		this.testno = testno; 
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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public BigDecimal getPrdtqty() {
		return this.prdtqty;
	}
 
	@Override
	public void setPrdtqty(final BigDecimal prdtqty) {
		this.prdtqty = prdtqty; 
	}
 
	@Override
	public String getPrdtunit() {
		return this.prdtunit;
	}
 
	@Override
	public void setPrdtunit(final String prdtunit) {
		this.prdtunit = prdtunit; 
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
	public String getOrefbillno() {
		return this.orefbillno;
	}
 
	@Override
	public void setOrefbillno(final String orefbillno) {
		this.orefbillno = orefbillno; 
	}
 
	@Override
	public BigDecimal getOitem() {
		return this.oitem;
	}
 
	@Override
	public void setOitem(final BigDecimal oitem) {
		this.oitem = oitem; 
	}
 
	@Override
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
	}
 
	@Override
	public String getD7declno() {
		return this.d7declno;
	}
 
	@Override
	public void setD7declno(final String d7declno) {
		this.d7declno = d7declno; 
	}
 
	@Override
	public BigDecimal getD7itemno() {
		return this.d7itemno;
	}
 
	@Override
	public void setD7itemno(final BigDecimal d7itemno) {
		this.d7itemno = d7itemno; 
	}
 
	@Override
	public BigDecimal getD7qty() {
		return this.d7qty;
	}
 
	@Override
	public void setD7qty(final BigDecimal d7qty) {
		this.d7qty = d7qty; 
	}
 
	@Override
	public String getD7decltype() {
		return this.d7decltype;
	}
 
	@Override
	public void setD7decltype(final String d7decltype) {
		this.d7decltype = d7decltype; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
	@Override
	public String getOutdate() {
		return this.outdate;
	}
 
	@Override
	public void setOutdate(final String outdate) {
		this.outdate = outdate; 
	}
 
}
