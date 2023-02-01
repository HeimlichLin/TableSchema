package com.doc.common.po.impl; 
 
public class TestPo implements ITestPo {
 
	public enum COLUMNS {
		ID("null"), //
		QTY("null"), //
		OLD("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String id;
	private BigDecimal qty;
	private BigDecimal old;

	@Override
	public String getId() {
		return this.id;
	}
 
	@Override
	public void setId(final String id) {
		this.id = id; 
	}
 
	@Override
	public BigDecimal getQty() {
		return this.qty;
	}
 
	@Override
	public void setQty(final BigDecimal qty) {
		this.qty = qty; 
	}
 
	@Override
	public BigDecimal getOld() {
		return this.old;
	}
 
	@Override
	public void setOld(final BigDecimal old) {
		this.old = old; 
	}
 
}
