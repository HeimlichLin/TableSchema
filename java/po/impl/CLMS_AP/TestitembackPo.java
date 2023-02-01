package com.doc.common.po.impl; 
 
public class TestitembackPo implements ITestitembackPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		TESTNO("委外單號"), //
		PRDTNO("產品號碼(料號)"), //
		SERIALNO("序號"), //
		BACKQTY("入庫數量"), //
		BACKDATE("入庫日期"), //
		ITEM("項次"), //
		BACKPOST("入庫儲位") //
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
	private String prdtno;
	private String serialno;
	private BigDecimal backqty;
	private String backdate;
	private BigDecimal item;
	private String backpost;

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
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getSerialno() {
		return this.serialno;
	}
 
	@Override
	public void setSerialno(final String serialno) {
		this.serialno = serialno; 
	}
 
	@Override
	public BigDecimal getBackqty() {
		return this.backqty;
	}
 
	@Override
	public void setBackqty(final BigDecimal backqty) {
		this.backqty = backqty; 
	}
 
	@Override
	public String getBackdate() {
		return this.backdate;
	}
 
	@Override
	public void setBackdate(final String backdate) {
		this.backdate = backdate; 
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
	public String getBackpost() {
		return this.backpost;
	}
 
	@Override
	public void setBackpost(final String backpost) {
		this.backpost = backpost; 
	}
 
}
