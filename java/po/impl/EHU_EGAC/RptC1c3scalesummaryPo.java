package com.doc.common.po.impl; 
 
public class RptC1c3scalesummaryPo implements IRptC1c3scalesummaryPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		TRANID("null"), //
		REPORTDATE("null"), //
		EXPRESSID("null"), //
		EXPRESSCNAME("null"), //
		BOXNO("null"), //
		CNLC1("null"), //
		TTLC1("null"), //
		TTLC2("null"), //
		TTLC3("null"), //
		TOTALQTY("null"), //
		CNLC1_PCT("null"), //
		C2_PCT("null"), //
		C3_PCT("null"), //
		OTH_PCT("null"), //
		CREATEDATE("null"), //
		CNLC1_TPCT("null"), //
		C2_TPCT("null"), //
		C3_TPCT("null"), //
		OTH_TPCT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal uniqueid;
	private BigDecimal tranid;
	private String reportdate;
	private String expressid;
	private String expresscname;
	private String boxno;
	private BigDecimal cnlc1;
	private BigDecimal ttlc1;
	private BigDecimal ttlc2;
	private BigDecimal ttlc3;
	private BigDecimal totalqty;
	private BigDecimal cnlc1Pct;
	private BigDecimal c2Pct;
	private BigDecimal c3Pct;
	private BigDecimal othPct;
	private java.sql.Timestamp createdate;
	private BigDecimal cnlc1Tpct;
	private BigDecimal c2Tpct;
	private BigDecimal c3Tpct;
	private BigDecimal othTpct;

	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
	}
 
	@Override
	public BigDecimal getTranid() {
		return this.tranid;
	}
 
	@Override
	public void setTranid(final BigDecimal tranid) {
		this.tranid = tranid; 
	}
 
	@Override
	public String getReportdate() {
		return this.reportdate;
	}
 
	@Override
	public void setReportdate(final String reportdate) {
		this.reportdate = reportdate; 
	}
 
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
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public BigDecimal getCnlc1() {
		return this.cnlc1;
	}
 
	@Override
	public void setCnlc1(final BigDecimal cnlc1) {
		this.cnlc1 = cnlc1; 
	}
 
	@Override
	public BigDecimal getTtlc1() {
		return this.ttlc1;
	}
 
	@Override
	public void setTtlc1(final BigDecimal ttlc1) {
		this.ttlc1 = ttlc1; 
	}
 
	@Override
	public BigDecimal getTtlc2() {
		return this.ttlc2;
	}
 
	@Override
	public void setTtlc2(final BigDecimal ttlc2) {
		this.ttlc2 = ttlc2; 
	}
 
	@Override
	public BigDecimal getTtlc3() {
		return this.ttlc3;
	}
 
	@Override
	public void setTtlc3(final BigDecimal ttlc3) {
		this.ttlc3 = ttlc3; 
	}
 
	@Override
	public BigDecimal getTotalqty() {
		return this.totalqty;
	}
 
	@Override
	public void setTotalqty(final BigDecimal totalqty) {
		this.totalqty = totalqty; 
	}
 
	@Override
	public BigDecimal getCnlc1Pct() {
		return this.cnlc1Pct;
	}
 
	@Override
	public void setCnlc1Pct(final BigDecimal cnlc1Pct) {
		this.cnlc1Pct = cnlc1Pct; 
	}
 
	@Override
	public BigDecimal getC2Pct() {
		return this.c2Pct;
	}
 
	@Override
	public void setC2Pct(final BigDecimal c2Pct) {
		this.c2Pct = c2Pct; 
	}
 
	@Override
	public BigDecimal getC3Pct() {
		return this.c3Pct;
	}
 
	@Override
	public void setC3Pct(final BigDecimal c3Pct) {
		this.c3Pct = c3Pct; 
	}
 
	@Override
	public BigDecimal getOthPct() {
		return this.othPct;
	}
 
	@Override
	public void setOthPct(final BigDecimal othPct) {
		this.othPct = othPct; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public BigDecimal getCnlc1Tpct() {
		return this.cnlc1Tpct;
	}
 
	@Override
	public void setCnlc1Tpct(final BigDecimal cnlc1Tpct) {
		this.cnlc1Tpct = cnlc1Tpct; 
	}
 
	@Override
	public BigDecimal getC2Tpct() {
		return this.c2Tpct;
	}
 
	@Override
	public void setC2Tpct(final BigDecimal c2Tpct) {
		this.c2Tpct = c2Tpct; 
	}
 
	@Override
	public BigDecimal getC3Tpct() {
		return this.c3Tpct;
	}
 
	@Override
	public void setC3Tpct(final BigDecimal c3Tpct) {
		this.c3Tpct = c3Tpct; 
	}
 
	@Override
	public BigDecimal getOthTpct() {
		return this.othTpct;
	}
 
	@Override
	public void setOthTpct(final BigDecimal othTpct) {
		this.othTpct = othTpct; 
	}
 
}
