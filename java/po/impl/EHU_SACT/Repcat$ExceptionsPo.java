package com.doc.common.po.impl; 
 
public class Repcat$ExceptionsPo implements IRepcat$ExceptionsPo {
 
	public enum COLUMNS {
		EXCEPTION_ID("Internal primary key of the exceptions table."), //
		USER_NAME("User name of user submitting the exception."), //
		REQUEST("Originating request containing the exception."), //
		JOB("Originating job containing the exception."), //
		ERROR_DATE("Date of occurance for the exception."), //
		ERROR_NUMBER("Error number generating the exception."), //
		ERROR_MESSAGE("Error message associated with the error generating the exception."), //
		LINE_NUMBER("Line number of the exception.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal exceptionId;
	private String userName;
	private String request;
	private BigDecimal job;
	private java.sql.Timestamp errorDate;
	private BigDecimal errorNumber;
	private String errorMessage;
	private BigDecimal lineNumber;

	@Override
	public BigDecimal getExceptionId() {
		return this.exceptionId;
	}
 
	@Override
	public void setExceptionId(final BigDecimal exceptionId) {
		this.exceptionId = exceptionId; 
	}
 
	@Override
	public String getUserName() {
		return this.userName;
	}
 
	@Override
	public void setUserName(final String userName) {
		this.userName = userName; 
	}
 
	@Override
	public String getRequest() {
		return this.request;
	}
 
	@Override
	public void setRequest(final String request) {
		this.request = request; 
	}
 
	@Override
	public BigDecimal getJob() {
		return this.job;
	}
 
	@Override
	public void setJob(final BigDecimal job) {
		this.job = job; 
	}
 
	@Override
	public java.sql.Timestamp getErrorDate() {
		return this.errorDate;
	}
 
	@Override
	public void setErrorDate(final java.sql.Timestamp errorDate) {
		this.errorDate = errorDate; 
	}
 
	@Override
	public BigDecimal getErrorNumber() {
		return this.errorNumber;
	}
 
	@Override
	public void setErrorNumber(final BigDecimal errorNumber) {
		this.errorNumber = errorNumber; 
	}
 
	@Override
	public String getErrorMessage() {
		return this.errorMessage;
	}
 
	@Override
	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage; 
	}
 
	@Override
	public BigDecimal getLineNumber() {
		return this.lineNumber;
	}
 
	@Override
	public void setLineNumber(final BigDecimal lineNumber) {
		this.lineNumber = lineNumber; 
	}
 
}
