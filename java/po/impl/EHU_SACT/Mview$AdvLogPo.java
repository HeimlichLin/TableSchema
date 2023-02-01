package com.doc.common.po.impl; 
 
public class Mview$AdvLogPo implements IMview$AdvLogPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		FILTERID#("null"), //
		RUN_BEGIN("null"), //
		RUN_END("null"), //
		RUN_TYPE("null"), //
		UNAME("null"), //
		STATUS("null"), //
		MESSAGE("null"), //
		COMPLETED("null"), //
		TOTAL("null"), //
		ERROR_CODE("null") //
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
	private java.sql.Timestamp runBegin;
	private java.sql.Timestamp runEnd;
	private BigDecimal runType;
	private String uname;
	private BigDecimal status;
	private String message;
	private BigDecimal completed;
	private BigDecimal total;
	private String errorCode;

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
	public java.sql.Timestamp getRunBegin() {
		return this.runBegin;
	}
 
	@Override
	public void setRunBegin(final java.sql.Timestamp runBegin) {
		this.runBegin = runBegin; 
	}
 
	@Override
	public java.sql.Timestamp getRunEnd() {
		return this.runEnd;
	}
 
	@Override
	public void setRunEnd(final java.sql.Timestamp runEnd) {
		this.runEnd = runEnd; 
	}
 
	@Override
	public BigDecimal getRunType() {
		return this.runType;
	}
 
	@Override
	public void setRunType(final BigDecimal runType) {
		this.runType = runType; 
	}
 
	@Override
	public String getUname() {
		return this.uname;
	}
 
	@Override
	public void setUname(final String uname) {
		this.uname = uname; 
	}
 
	@Override
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
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
	public BigDecimal getCompleted() {
		return this.completed;
	}
 
	@Override
	public void setCompleted(final BigDecimal completed) {
		this.completed = completed; 
	}
 
	@Override
	public BigDecimal getTotal() {
		return this.total;
	}
 
	@Override
	public void setTotal(final BigDecimal total) {
		this.total = total; 
	}
 
	@Override
	public String getErrorCode() {
		return this.errorCode;
	}
 
	@Override
	public void setErrorCode(final String errorCode) {
		this.errorCode = errorCode; 
	}
 
}
