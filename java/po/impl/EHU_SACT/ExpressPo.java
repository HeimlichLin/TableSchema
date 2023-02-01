package com.doc.common.po.impl; 
 
public class ExpressPo implements IExpressPo {
 
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
		BASELINE("null"), //
		ONLINEBILL("null"), //
		ONLINERECP("null"), //
		FEE_ALERTDATE("null"), //
		FEE_RECOVERDATE("null"), //
		FEE_LOGDATE("null"), //
		CHARGETYPE("null"), //
		EXPIREDATE("null"), //
		STARTDATE("null"), //
		CHK_IO("???????") //
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
	private String onlinebill;
	private String onlinerecp;
	private java.sql.Timestamp feeAlertdate;
	private java.sql.Timestamp feeRecoverdate;
	private java.sql.Timestamp feeLogdate;
	private String chargetype;
	private String expiredate;
	private String startdate;
	private String chkIo;

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
 
	@Override
	public String getOnlinebill() {
		return this.onlinebill;
	}
 
	@Override
	public void setOnlinebill(final String onlinebill) {
		this.onlinebill = onlinebill; 
	}
 
	@Override
	public String getOnlinerecp() {
		return this.onlinerecp;
	}
 
	@Override
	public void setOnlinerecp(final String onlinerecp) {
		this.onlinerecp = onlinerecp; 
	}
 
	@Override
	public java.sql.Timestamp getFeeAlertdate() {
		return this.feeAlertdate;
	}
 
	@Override
	public void setFeeAlertdate(final java.sql.Timestamp feeAlertdate) {
		this.feeAlertdate = feeAlertdate; 
	}
 
	@Override
	public java.sql.Timestamp getFeeRecoverdate() {
		return this.feeRecoverdate;
	}
 
	@Override
	public void setFeeRecoverdate(final java.sql.Timestamp feeRecoverdate) {
		this.feeRecoverdate = feeRecoverdate; 
	}
 
	@Override
	public java.sql.Timestamp getFeeLogdate() {
		return this.feeLogdate;
	}
 
	@Override
	public void setFeeLogdate(final java.sql.Timestamp feeLogdate) {
		this.feeLogdate = feeLogdate; 
	}
 
	@Override
	public String getChargetype() {
		return this.chargetype;
	}
 
	@Override
	public void setChargetype(final String chargetype) {
		this.chargetype = chargetype; 
	}
 
	@Override
	public String getExpiredate() {
		return this.expiredate;
	}
 
	@Override
	public void setExpiredate(final String expiredate) {
		this.expiredate = expiredate; 
	}
 
	@Override
	public String getStartdate() {
		return this.startdate;
	}
 
	@Override
	public void setStartdate(final String startdate) {
		this.startdate = startdate; 
	}
 
	@Override
	public String getChkIo() {
		return this.chkIo;
	}
 
	@Override
	public void setChkIo(final String chkIo) {
		this.chkIo = chkIo; 
	}
 
}
