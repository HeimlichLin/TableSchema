package com.doc.common.po.impl; 
 
public class MisExpressPo implements IMisExpressPo {
 
	public enum COLUMNS {
		EXPRESSID("null"), //
		EXPRESSCNAME("null"), //
		EXPRESSENAME("null"), //
		EXPRESSSNAME("null"), //
		BAN("null"), //
		BOXNO("null"), //
		CHARGEBOX("null"), //
		BASEREF("null"), //
		CURRENTTOTAL("null"), //
		BASELINE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expressid;
	private String expresscname;
	private String expressename;
	private String expresssname;
	private String ban;
	private String boxno;
	private String chargebox;
	private BigDecimal baseref;
	private BigDecimal currenttotal;
	private BigDecimal baseline;

	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getExpresscname() {
		return this.expresscname;
	}
 
	@Override
	public void setExpresscname(final String expresscname) {
		this.expresscname = expresscname; 
	}
 
	@Override
	public String getExpressename() {
		return this.expressename;
	}
 
	@Override
	public void setExpressename(final String expressename) {
		this.expressename = expressename; 
	}
 
	@Override
	public String getExpresssname() {
		return this.expresssname;
	}
 
	@Override
	public void setExpresssname(final String expresssname) {
		this.expresssname = expresssname; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
	@Override
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getChargebox() {
		return this.chargebox;
	}
 
	@Override
	public void setChargebox(final String chargebox) {
		this.chargebox = chargebox; 
	}
 
	@Override
	public BigDecimal getBaseref() {
		return this.baseref;
	}
 
	@Override
	public void setBaseref(final BigDecimal baseref) {
		this.baseref = baseref; 
	}
 
	@Override
	public BigDecimal getCurrenttotal() {
		return this.currenttotal;
	}
 
	@Override
	public void setCurrenttotal(final BigDecimal currenttotal) {
		this.currenttotal = currenttotal; 
	}
 
	@Override
	public BigDecimal getBaseline() {
		return this.baseline;
	}
 
	@Override
	public void setBaseline(final BigDecimal baseline) {
		this.baseline = baseline; 
	}
 
}
