package com.doc.common.po.impl; 
 
public class RptAdjtaxsummaryPo implements IRptAdjtaxsummaryPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		TRANID("null"), //
		REPORTDATE("null"), //
		EXPRESSID("null"), //
		EXPRESSCNAME("null"), //
		BOXNO("null"), //
		ADJHWBAMTX3("null"), //
		TTLHWBAMTX3("null"), //
		ADJTAXAMTX3("null"), //
		TTLTAX("null"), //
		TTLWGT("null"), //
		TAXQTY_PCT("null"), //
		ADJTAXBEFAMT("null"), //
		AVGWGTTAX("null"), //
		CREATEDATE("null") //
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
	private BigDecimal adjhwbamtx3;
	private BigDecimal ttlhwbamtx3;
	private BigDecimal adjtaxamtx3;
	private BigDecimal ttltax;
	private BigDecimal ttlwgt;
	private BigDecimal taxqtyPct;
	private BigDecimal adjtaxbefamt;
	private BigDecimal avgwgttax;
	private java.sql.Timestamp createdate;

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
	public BigDecimal getAdjhwbamtx3() {
		return this.adjhwbamtx3;
	}
 
	@Override
	public void setAdjhwbamtx3(final BigDecimal adjhwbamtx3) {
		this.adjhwbamtx3 = adjhwbamtx3; 
	}
 
	@Override
	public BigDecimal getTtlhwbamtx3() {
		return this.ttlhwbamtx3;
	}
 
	@Override
	public void setTtlhwbamtx3(final BigDecimal ttlhwbamtx3) {
		this.ttlhwbamtx3 = ttlhwbamtx3; 
	}
 
	@Override
	public BigDecimal getAdjtaxamtx3() {
		return this.adjtaxamtx3;
	}
 
	@Override
	public void setAdjtaxamtx3(final BigDecimal adjtaxamtx3) {
		this.adjtaxamtx3 = adjtaxamtx3; 
	}
 
	@Override
	public BigDecimal getTtltax() {
		return this.ttltax;
	}
 
	@Override
	public void setTtltax(final BigDecimal ttltax) {
		this.ttltax = ttltax; 
	}
 
	@Override
	public BigDecimal getTtlwgt() {
		return this.ttlwgt;
	}
 
	@Override
	public void setTtlwgt(final BigDecimal ttlwgt) {
		this.ttlwgt = ttlwgt; 
	}
 
	@Override
	public BigDecimal getTaxqtyPct() {
		return this.taxqtyPct;
	}
 
	@Override
	public void setTaxqtyPct(final BigDecimal taxqtyPct) {
		this.taxqtyPct = taxqtyPct; 
	}
 
	@Override
	public BigDecimal getAdjtaxbefamt() {
		return this.adjtaxbefamt;
	}
 
	@Override
	public void setAdjtaxbefamt(final BigDecimal adjtaxbefamt) {
		this.adjtaxbefamt = adjtaxbefamt; 
	}
 
	@Override
	public BigDecimal getAvgwgttax() {
		return this.avgwgttax;
	}
 
	@Override
	public void setAvgwgttax(final BigDecimal avgwgttax) {
		this.avgwgttax = avgwgttax; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
}
