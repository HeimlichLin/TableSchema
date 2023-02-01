package com.doc.common.po.impl; 
 
public class LogmnrError$Po implements ILogmnrError$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		TIME_OF_ERROR("null"), //
		CODE("null"), //
		MESSAGE("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null"), //
		SPARE5("null") //
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
	private java.sql.Timestamp timeOfError;
	private BigDecimal code;
	private String message;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private String spare4;
	private String spare5;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public java.sql.Timestamp getTimeOfError() {
		return this.timeOfError;
	}
 
	@Override
	public void setTimeOfError(final java.sql.Timestamp timeOfError) {
		this.timeOfError = timeOfError; 
	}
 
	@Override
	public BigDecimal getCode() {
		return this.code;
	}
 
	@Override
	public void setCode(final BigDecimal code) {
		this.code = code; 
	}
 
	@Override
	public String getMessage() {
		return this.message;
	}
 
	@Override
	public void setMessage(final String message) {
		this.message = message; 
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
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public String getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final String spare4) {
		this.spare4 = spare4; 
	}
 
	@Override
	public String getSpare5() {
		return this.spare5;
	}
 
	@Override
	public void setSpare5(final String spare5) {
		this.spare5 = spare5; 
	}
 
}
