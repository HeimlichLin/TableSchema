package com.doc.common.po.impl; 
 
public class Mview$AdvFilterinstancePo implements IMview$AdvFilterinstancePo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		FILTERID#("null"), //
		SUBFILTERNUM#("null"), //
		SUBFILTERTYPE("null"), //
		STR_VALUE("null"), //
		NUM_VALUE1("null"), //
		NUM_VALUE2("null"), //
		DATE_VALUE1("null"), //
		DATE_VALUE2("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runid#;
	private BigDecimal filterid#;
	private BigDecimal subfilternum#;
	private BigDecimal subfiltertype;
	private String strValue;
	private BigDecimal numValue1;
	private BigDecimal numValue2;
	private java.sql.Timestamp dateValue1;
	private java.sql.Timestamp dateValue2;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getFilterid#() {
		return this.filterid#;
	}
 
	@Override
	public void setFilterid#(final BigDecimal filterid#) {
		this.filterid# = filterid#; 
	}
 
	@Override
	public BigDecimal getSubfilternum#() {
		return this.subfilternum#;
	}
 
	@Override
	public void setSubfilternum#(final BigDecimal subfilternum#) {
		this.subfilternum# = subfilternum#; 
	}
 
	@Override
	public BigDecimal getSubfiltertype() {
		return this.subfiltertype;
	}
 
	@Override
	public void setSubfiltertype(final BigDecimal subfiltertype) {
		this.subfiltertype = subfiltertype; 
	}
 
	@Override
	public String getStrValue() {
		return this.strValue;
	}
 
	@Override
	public void setStrValue(final String strValue) {
		this.strValue = strValue; 
	}
 
	@Override
	public BigDecimal getNumValue1() {
		return this.numValue1;
	}
 
	@Override
	public void setNumValue1(final BigDecimal numValue1) {
		this.numValue1 = numValue1; 
	}
 
	@Override
	public BigDecimal getNumValue2() {
		return this.numValue2;
	}
 
	@Override
	public void setNumValue2(final BigDecimal numValue2) {
		this.numValue2 = numValue2; 
	}
 
	@Override
	public java.sql.Timestamp getDateValue1() {
		return this.dateValue1;
	}
 
	@Override
	public void setDateValue1(final java.sql.Timestamp dateValue1) {
		this.dateValue1 = dateValue1; 
	}
 
	@Override
	public java.sql.Timestamp getDateValue2() {
		return this.dateValue2;
	}
 
	@Override
	public void setDateValue2(final java.sql.Timestamp dateValue2) {
		this.dateValue2 = dateValue2; 
	}
 
}
