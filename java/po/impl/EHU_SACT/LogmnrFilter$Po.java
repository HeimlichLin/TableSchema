package com.doc.common.po.impl; 
 
public class LogmnrFilter$Po implements ILogmnrFilter$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		FILTER_TYPE("null"), //
		ATTR1("null"), //
		ATTR2("null"), //
		ATTR3("null"), //
		ATTR4("null"), //
		ATTR5("null"), //
		ATTR6("null"), //
		FILTER_SCN("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal session#;
	private String filterType;
	private BigDecimal attr1;
	private BigDecimal attr2;
	private BigDecimal attr3;
	private BigDecimal attr4;
	private BigDecimal attr5;
	private BigDecimal attr6;
	private BigDecimal filterScn;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private java.sql.Timestamp spare3;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public String getFilterType() {
		return this.filterType;
	}
 
	@Override
	public void setFilterType(final String filterType) {
		this.filterType = filterType; 
	}
 
	@Override
	public BigDecimal getAttr1() {
		return this.attr1;
	}
 
	@Override
	public void setAttr1(final BigDecimal attr1) {
		this.attr1 = attr1; 
	}
 
	@Override
	public BigDecimal getAttr2() {
		return this.attr2;
	}
 
	@Override
	public void setAttr2(final BigDecimal attr2) {
		this.attr2 = attr2; 
	}
 
	@Override
	public BigDecimal getAttr3() {
		return this.attr3;
	}
 
	@Override
	public void setAttr3(final BigDecimal attr3) {
		this.attr3 = attr3; 
	}
 
	@Override
	public BigDecimal getAttr4() {
		return this.attr4;
	}
 
	@Override
	public void setAttr4(final BigDecimal attr4) {
		this.attr4 = attr4; 
	}
 
	@Override
	public BigDecimal getAttr5() {
		return this.attr5;
	}
 
	@Override
	public void setAttr5(final BigDecimal attr5) {
		this.attr5 = attr5; 
	}
 
	@Override
	public BigDecimal getAttr6() {
		return this.attr6;
	}
 
	@Override
	public void setAttr6(final BigDecimal attr6) {
		this.attr6 = attr6; 
	}
 
	@Override
	public BigDecimal getFilterScn() {
		return this.filterScn;
	}
 
	@Override
	public void setFilterScn(final BigDecimal filterScn) {
		this.filterScn = filterScn; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public java.sql.Timestamp getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final java.sql.Timestamp spare3) {
		this.spare3 = spare3; 
	}
 
}
