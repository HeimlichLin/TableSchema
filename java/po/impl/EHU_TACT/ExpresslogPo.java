package com.doc.common.po.impl; 
 
public class ExpresslogPo implements IExpresslogPo {
 
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
		DISCOUNTTYPE("null"), //
		LEVEL1("null"), //
		DISCOUNT1("null"), //
		LEVEL2("null"), //
		DISCOUNT2("null"), //
		LEVEL3("null"), //
		DISCOUNT3("null"), //
		LEVEL4("null"), //
		DISCOUNT4("null"), //
		LEVEL5("null"), //
		DISCOUNT5("null"), //
		OBCACCOUNT("null"), //
		EHUACCOUNT("null"), //
		WARNINGLINE("null"), //
		STARTDATE("null"), //
		ENDDATE("null"), //
		IMPACCOUNT("null"), //
		EXPRESSAREA("null"), //
		PRTTAL("null"), //
		MAILNAME1("null"), //
		MAILNAME2("null"), //
		MAILADD1("null"), //
		MAILADD2("null"), //
		STATUS("null"), //
		LASTDATE("null"), //
		EDITUSER("null"), //
		DIFFDUTY("null"), //
		VRACCOUNT("null") //
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
	private String discounttype;
	private BigDecimal level1;
	private BigDecimal discount1;
	private BigDecimal level2;
	private BigDecimal discount2;
	private BigDecimal level3;
	private BigDecimal discount3;
	private BigDecimal level4;
	private BigDecimal discount4;
	private BigDecimal level5;
	private BigDecimal discount5;
	private String obcaccount;
	private String ehuaccount;
	private BigDecimal warningline;
	private java.sql.Timestamp startdate;
	private java.sql.Timestamp enddate;
	private String impaccount;
	private String expressarea;
	private String prttal;
	private String mailname1;
	private String mailname2;
	private String mailadd1;
	private String mailadd2;
	private String status;
	private String lastdate;
	private String edituser;
	private String diffduty;
	private String vraccount;

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
	public String getDiscounttype() {
		return this.discounttype;
	}
 
	@Override
	public void setDiscounttype(final String discounttype) {
		this.discounttype = discounttype; 
	}
 
	@Override
	public BigDecimal getLevel1() {
		return this.level1;
	}
 
	@Override
	public void setLevel1(final BigDecimal level1) {
		this.level1 = level1; 
	}
 
	@Override
	public BigDecimal getDiscount1() {
		return this.discount1;
	}
 
	@Override
	public void setDiscount1(final BigDecimal discount1) {
		this.discount1 = discount1; 
	}
 
	@Override
	public BigDecimal getLevel2() {
		return this.level2;
	}
 
	@Override
	public void setLevel2(final BigDecimal level2) {
		this.level2 = level2; 
	}
 
	@Override
	public BigDecimal getDiscount2() {
		return this.discount2;
	}
 
	@Override
	public void setDiscount2(final BigDecimal discount2) {
		this.discount2 = discount2; 
	}
 
	@Override
	public BigDecimal getLevel3() {
		return this.level3;
	}
 
	@Override
	public void setLevel3(final BigDecimal level3) {
		this.level3 = level3; 
	}
 
	@Override
	public BigDecimal getDiscount3() {
		return this.discount3;
	}
 
	@Override
	public void setDiscount3(final BigDecimal discount3) {
		this.discount3 = discount3; 
	}
 
	@Override
	public BigDecimal getLevel4() {
		return this.level4;
	}
 
	@Override
	public void setLevel4(final BigDecimal level4) {
		this.level4 = level4; 
	}
 
	@Override
	public BigDecimal getDiscount4() {
		return this.discount4;
	}
 
	@Override
	public void setDiscount4(final BigDecimal discount4) {
		this.discount4 = discount4; 
	}
 
	@Override
	public BigDecimal getLevel5() {
		return this.level5;
	}
 
	@Override
	public void setLevel5(final BigDecimal level5) {
		this.level5 = level5; 
	}
 
	@Override
	public BigDecimal getDiscount5() {
		return this.discount5;
	}
 
	@Override
	public void setDiscount5(final BigDecimal discount5) {
		this.discount5 = discount5; 
	}
 
	@Override
	public String getObcaccount() {
		return this.obcaccount;
	}
 
	@Override
	public void setObcaccount(final String obcaccount) {
		this.obcaccount = obcaccount; 
	}
 
	@Override
	public String getEhuaccount() {
		return this.ehuaccount;
	}
 
	@Override
	public void setEhuaccount(final String ehuaccount) {
		this.ehuaccount = ehuaccount; 
	}
 
	@Override
	public BigDecimal getWarningline() {
		return this.warningline;
	}
 
	@Override
	public void setWarningline(final BigDecimal warningline) {
		this.warningline = warningline; 
	}
 
	@Override
	public java.sql.Timestamp getStartdate() {
		return this.startdate;
	}
 
	@Override
	public void setStartdate(final java.sql.Timestamp startdate) {
		this.startdate = startdate; 
	}
 
	@Override
	public java.sql.Timestamp getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final java.sql.Timestamp enddate) {
		this.enddate = enddate; 
	}
 
	@Override
	public String getImpaccount() {
		return this.impaccount;
	}
 
	@Override
	public void setImpaccount(final String impaccount) {
		this.impaccount = impaccount; 
	}
 
	@Override
	public String getExpressarea() {
		return this.expressarea;
	}
 
	@Override
	public void setExpressarea(final String expressarea) {
		this.expressarea = expressarea; 
	}
 
	@Override
	public String getPrttal() {
		return this.prttal;
	}
 
	@Override
	public void setPrttal(final String prttal) {
		this.prttal = prttal; 
	}
 
	@Override
	public String getMailname1() {
		return this.mailname1;
	}
 
	@Override
	public void setMailname1(final String mailname1) {
		this.mailname1 = mailname1; 
	}
 
	@Override
	public String getMailname2() {
		return this.mailname2;
	}
 
	@Override
	public void setMailname2(final String mailname2) {
		this.mailname2 = mailname2; 
	}
 
	@Override
	public String getMailadd1() {
		return this.mailadd1;
	}
 
	@Override
	public void setMailadd1(final String mailadd1) {
		this.mailadd1 = mailadd1; 
	}
 
	@Override
	public String getMailadd2() {
		return this.mailadd2;
	}
 
	@Override
	public void setMailadd2(final String mailadd2) {
		this.mailadd2 = mailadd2; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getLastdate() {
		return this.lastdate;
	}
 
	@Override
	public void setLastdate(final String lastdate) {
		this.lastdate = lastdate; 
	}
 
	@Override
	public String getEdituser() {
		return this.edituser;
	}
 
	@Override
	public void setEdituser(final String edituser) {
		this.edituser = edituser; 
	}
 
	@Override
	public String getDiffduty() {
		return this.diffduty;
	}
 
	@Override
	public void setDiffduty(final String diffduty) {
		this.diffduty = diffduty; 
	}
 
	@Override
	public String getVraccount() {
		return this.vraccount;
	}
 
	@Override
	public void setVraccount(final String vraccount) {
		this.vraccount = vraccount; 
	}
 
}
