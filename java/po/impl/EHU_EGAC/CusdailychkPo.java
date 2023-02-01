package com.doc.common.po.impl; 
 
public class CusdailychkPo implements ICusdailychkPo {
 
	public enum COLUMNS {
		CHKDATE("null"), //
		EXPRESSID("null"), //
		AMG1C1("null"), //
		AMG1C2("null"), //
		AMG1C3("null"), //
		AMG1TOTBAG("null"), //
		AMXC1BAG("null"), //
		AMXC3BAG("null"), //
		AMXC1CBAG("null"), //
		AMTOTALHWB("null"), //
		AMC3HWB("null"), //
		PMG1C1("null"), //
		PMG1C2("null"), //
		PMG1C3("null"), //
		PMG1TOTBAG("null"), //
		PMXC1BAG("null"), //
		PMXC3BAG("null"), //
		PMXC1CBAG("null"), //
		PMTOTALHWB("null"), //
		PMC3HWB("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp chkdate;
	private String expressid;
	private BigDecimal amg1c1;
	private BigDecimal amg1c2;
	private BigDecimal amg1c3;
	private BigDecimal amg1totbag;
	private BigDecimal amxc1bag;
	private BigDecimal amxc3bag;
	private BigDecimal amxc1cbag;
	private BigDecimal amtotalhwb;
	private BigDecimal amc3hwb;
	private BigDecimal pmg1c1;
	private BigDecimal pmg1c2;
	private BigDecimal pmg1c3;
	private BigDecimal pmg1totbag;
	private BigDecimal pmxc1bag;
	private BigDecimal pmxc3bag;
	private BigDecimal pmxc1cbag;
	private BigDecimal pmtotalhwb;
	private BigDecimal pmc3hwb;

	@Override
	public java.sql.Timestamp getChkdate() {
		return this.chkdate;
	}
 
	@Override
	public void setChkdate(final java.sql.Timestamp chkdate) {
		this.chkdate = chkdate; 
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
	public BigDecimal getAmg1c1() {
		return this.amg1c1;
	}
 
	@Override
	public void setAmg1c1(final BigDecimal amg1c1) {
		this.amg1c1 = amg1c1; 
	}
 
	@Override
	public BigDecimal getAmg1c2() {
		return this.amg1c2;
	}
 
	@Override
	public void setAmg1c2(final BigDecimal amg1c2) {
		this.amg1c2 = amg1c2; 
	}
 
	@Override
	public BigDecimal getAmg1c3() {
		return this.amg1c3;
	}
 
	@Override
	public void setAmg1c3(final BigDecimal amg1c3) {
		this.amg1c3 = amg1c3; 
	}
 
	@Override
	public BigDecimal getAmg1totbag() {
		return this.amg1totbag;
	}
 
	@Override
	public void setAmg1totbag(final BigDecimal amg1totbag) {
		this.amg1totbag = amg1totbag; 
	}
 
	@Override
	public BigDecimal getAmxc1bag() {
		return this.amxc1bag;
	}
 
	@Override
	public void setAmxc1bag(final BigDecimal amxc1bag) {
		this.amxc1bag = amxc1bag; 
	}
 
	@Override
	public BigDecimal getAmxc3bag() {
		return this.amxc3bag;
	}
 
	@Override
	public void setAmxc3bag(final BigDecimal amxc3bag) {
		this.amxc3bag = amxc3bag; 
	}
 
	@Override
	public BigDecimal getAmxc1cbag() {
		return this.amxc1cbag;
	}
 
	@Override
	public void setAmxc1cbag(final BigDecimal amxc1cbag) {
		this.amxc1cbag = amxc1cbag; 
	}
 
	@Override
	public BigDecimal getAmtotalhwb() {
		return this.amtotalhwb;
	}
 
	@Override
	public void setAmtotalhwb(final BigDecimal amtotalhwb) {
		this.amtotalhwb = amtotalhwb; 
	}
 
	@Override
	public BigDecimal getAmc3hwb() {
		return this.amc3hwb;
	}
 
	@Override
	public void setAmc3hwb(final BigDecimal amc3hwb) {
		this.amc3hwb = amc3hwb; 
	}
 
	@Override
	public BigDecimal getPmg1c1() {
		return this.pmg1c1;
	}
 
	@Override
	public void setPmg1c1(final BigDecimal pmg1c1) {
		this.pmg1c1 = pmg1c1; 
	}
 
	@Override
	public BigDecimal getPmg1c2() {
		return this.pmg1c2;
	}
 
	@Override
	public void setPmg1c2(final BigDecimal pmg1c2) {
		this.pmg1c2 = pmg1c2; 
	}
 
	@Override
	public BigDecimal getPmg1c3() {
		return this.pmg1c3;
	}
 
	@Override
	public void setPmg1c3(final BigDecimal pmg1c3) {
		this.pmg1c3 = pmg1c3; 
	}
 
	@Override
	public BigDecimal getPmg1totbag() {
		return this.pmg1totbag;
	}
 
	@Override
	public void setPmg1totbag(final BigDecimal pmg1totbag) {
		this.pmg1totbag = pmg1totbag; 
	}
 
	@Override
	public BigDecimal getPmxc1bag() {
		return this.pmxc1bag;
	}
 
	@Override
	public void setPmxc1bag(final BigDecimal pmxc1bag) {
		this.pmxc1bag = pmxc1bag; 
	}
 
	@Override
	public BigDecimal getPmxc3bag() {
		return this.pmxc3bag;
	}
 
	@Override
	public void setPmxc3bag(final BigDecimal pmxc3bag) {
		this.pmxc3bag = pmxc3bag; 
	}
 
	@Override
	public BigDecimal getPmxc1cbag() {
		return this.pmxc1cbag;
	}
 
	@Override
	public void setPmxc1cbag(final BigDecimal pmxc1cbag) {
		this.pmxc1cbag = pmxc1cbag; 
	}
 
	@Override
	public BigDecimal getPmtotalhwb() {
		return this.pmtotalhwb;
	}
 
	@Override
	public void setPmtotalhwb(final BigDecimal pmtotalhwb) {
		this.pmtotalhwb = pmtotalhwb; 
	}
 
	@Override
	public BigDecimal getPmc3hwb() {
		return this.pmc3hwb;
	}
 
	@Override
	public void setPmc3hwb(final BigDecimal pmc3hwb) {
		this.pmc3hwb = pmc3hwb; 
	}
 
}
