package com.doc.common.po.impl; 
 
public class LogmnrProcessedLog$Po implements ILogmnrProcessedLog$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		THREAD#("null"), //
		SEQUENCE#("null"), //
		FIRST_CHANGE#("null"), //
		NEXT_CHANGE#("null"), //
		FIRST_TIME("null"), //
		NEXT_TIME("null"), //
		FILE_NAME("null"), //
		STATUS("null"), //
		INFO("null"), //
		TIMESTAMP("null") //
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
	private BigDecimal thread#;
	private BigDecimal sequence#;
	private BigDecimal firstChange#;
	private BigDecimal nextChange#;
	private java.sql.Timestamp firstTime;
	private java.sql.Timestamp nextTime;
	private String fileName;
	private BigDecimal status;
	private String info;
	private java.sql.Timestamp timestamp;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getThread#() {
		return this.thread#;
	}
 
	@Override
	public void setThread#(final BigDecimal thread#) {
		this.thread# = thread#; 
	}
 
	@Override
	public BigDecimal getSequence#() {
		return this.sequence#;
	}
 
	@Override
	public void setSequence#(final BigDecimal sequence#) {
		this.sequence# = sequence#; 
	}
 
	@Override
	public BigDecimal getFirstChange#() {
		return this.firstChange#;
	}
 
	@Override
	public void setFirstChange#(final BigDecimal firstChange#) {
		this.firstChange# = firstChange#; 
	}
 
	@Override
	public BigDecimal getNextChange#() {
		return this.nextChange#;
	}
 
	@Override
	public void setNextChange#(final BigDecimal nextChange#) {
		this.nextChange# = nextChange#; 
	}
 
	@Override
	public java.sql.Timestamp getFirstTime() {
		return this.firstTime;
	}
 
	@Override
	public void setFirstTime(final java.sql.Timestamp firstTime) {
		this.firstTime = firstTime; 
	}
 
	@Override
	public java.sql.Timestamp getNextTime() {
		return this.nextTime;
	}
 
	@Override
	public void setNextTime(final java.sql.Timestamp nextTime) {
		this.nextTime = nextTime; 
	}
 
	@Override
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
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
	public String getInfo() {
		return this.info;
	}
 
	@Override
	public void setInfo(final String info) {
		this.info = info; 
	}
 
	@Override
	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}
 
	@Override
	public void setTimestamp(final java.sql.Timestamp timestamp) {
		this.timestamp = timestamp; 
	}
 
}
