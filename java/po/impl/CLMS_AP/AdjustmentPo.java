package com.doc.common.po.impl; 
 
public class AdjustmentPo implements IAdjustmentPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		REFBILLNO("null"), //
		ITEM("null"), //
		INPOST("null"), //
		DECLNO("null"), //
		ITEMNO("null"), //
		RINQTY("null"), //
		ADJUSTQTY("null"), //
		APPRVNO("null"), //
		APPRVDATE("null"), //
		RMK("null"), //
		UPDTIME("null") //
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
	private String refbillno;
	private BigDecimal item;
	private String inpost;
	private String declno;
	private BigDecimal itemno;
	private BigDecimal rinqty;
	private BigDecimal adjustqty;
	private String apprvno;
	private String apprvdate;
	private String rmk;
	private String updtime;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
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
	public String getInpost() {
		return this.inpost;
	}
 
	@Override
	public void setInpost(final String inpost) {
		this.inpost = inpost; 
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
	public BigDecimal getAdjustqty() {
		return this.adjustqty;
	}
 
	@Override
	public void setAdjustqty(final BigDecimal adjustqty) {
		this.adjustqty = adjustqty; 
	}
 
	@Override
	public String getApprvno() {
		return this.apprvno;
	}
 
	@Override
	public void setApprvno(final String apprvno) {
		this.apprvno = apprvno; 
	}
 
	@Override
	public String getApprvdate() {
		return this.apprvdate;
	}
 
	@Override
	public void setApprvdate(final String apprvdate) {
		this.apprvdate = apprvdate; 
	}
 
	@Override
	public String getRmk() {
		return this.rmk;
	}
 
	@Override
	public void setRmk(final String rmk) {
		this.rmk = rmk; 
	}
 
	@Override
	public String getUpdtime() {
		return this.updtime;
	}
 
	@Override
	public void setUpdtime(final String updtime) {
		this.updtime = updtime; 
	}
 
}
