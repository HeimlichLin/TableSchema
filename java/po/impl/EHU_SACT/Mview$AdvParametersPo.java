package com.doc.common.po.impl; 
 
public class Mview$AdvParametersPo implements IMview$AdvParametersPo {
 
	public enum COLUMNS {
		PARAMETER_NAME("null"), //
		PARAMETER_TYPE("null"), //
		STRING_VALUE("null"), //
		DATE_VALUE("null"), //
		NUMERICAL_VALUE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String parameterName;
	private BigDecimal parameterType;
	private String stringValue;
	private java.sql.Timestamp dateValue;
	private BigDecimal numericalValue;

	@Override
	public String getParameterName() {
		return this.parameterName;
	}
 
	@Override
	public void setParameterName(final String parameterName) {
		this.parameterName = parameterName; 
	}
 
	@Override
	public BigDecimal getParameterType() {
		return this.parameterType;
	}
 
	@Override
	public void setParameterType(final BigDecimal parameterType) {
		this.parameterType = parameterType; 
	}
 
	@Override
	public String getStringValue() {
		return this.stringValue;
	}
 
	@Override
	public void setStringValue(final String stringValue) {
		this.stringValue = stringValue; 
	}
 
	@Override
	public java.sql.Timestamp getDateValue() {
		return this.dateValue;
	}
 
	@Override
	public void setDateValue(final java.sql.Timestamp dateValue) {
		this.dateValue = dateValue; 
	}
 
	@Override
	public BigDecimal getNumericalValue() {
		return this.numericalValue;
	}
 
	@Override
	public void setNumericalValue(final BigDecimal numericalValue) {
		this.numericalValue = numericalValue; 
	}
 
}
