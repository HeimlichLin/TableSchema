package com.doc.common.po.impl; 
 
public class InmonthPo implements IInmonthPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		MONTHNO("彙報單號"), //
		ITEM("項次"), //
		PRDTNO("料號"), //
		MINQTY("彙報進倉數量"), //
		INUNIT("進倉單位") //
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
	private String monthno;
	private BigDecimal item;
	private String prdtno;
	private BigDecimal minqty;
	private String inunit;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getMonthno() {
		return this.monthno;
	}
 
	@Override
	public void setMonthno(final String monthno) {
		this.monthno = monthno; 
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
	public BigDecimal getMinqty() {
		return this.minqty;
	}
 
	@Override
	public void setMinqty(final BigDecimal minqty) {
		this.minqty = minqty; 
	}
 
	@Override
	public String getInunit() {
		return this.inunit;
	}
 
	@Override
	public void setInunit(final String inunit) {
		this.inunit = inunit; 
	}
 
}
