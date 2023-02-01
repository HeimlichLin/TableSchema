package com.doc.common.po.impl; 
 
public class Logstdby$eventsPo implements ILogstdby$eventsPo {
 
	public enum COLUMNS {
		EVENT_TIME("null"), //
		CURRENT_SCN("null"), //
		COMMIT_SCN("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		ERRVAL("null"), //
		EVENT("null"), //
		FULL_EVENT("null"), //
		ERROR("null"), //
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
 
	private String eventTime;
	private BigDecimal currentScn;
	private BigDecimal commitScn;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal errval;
	private String event;
	private String fullEvent;
	private String error;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public String getEventTime() {
		return this.eventTime;
	}
 
	@Override
	public void setEventTime(final String eventTime) {
		this.eventTime = eventTime; 
	}
 
	@Override
	public BigDecimal getCurrentScn() {
		return this.currentScn;
	}
 
	@Override
	public void setCurrentScn(final BigDecimal currentScn) {
		this.currentScn = currentScn; 
	}
 
	@Override
	public BigDecimal getCommitScn() {
		return this.commitScn;
	}
 
	@Override
	public void setCommitScn(final BigDecimal commitScn) {
		this.commitScn = commitScn; 
	}
 
	@Override
	public BigDecimal getXidusn() {
		return this.xidusn;
	}
 
	@Override
	public void setXidusn(final BigDecimal xidusn) {
		this.xidusn = xidusn; 
	}
 
	@Override
	public BigDecimal getXidslt() {
		return this.xidslt;
	}
 
	@Override
	public void setXidslt(final BigDecimal xidslt) {
		this.xidslt = xidslt; 
	}
 
	@Override
	public BigDecimal getXidsqn() {
		return this.xidsqn;
	}
 
	@Override
	public void setXidsqn(final BigDecimal xidsqn) {
		this.xidsqn = xidsqn; 
	}
 
	@Override
	public BigDecimal getErrval() {
		return this.errval;
	}
 
	@Override
	public void setErrval(final BigDecimal errval) {
		this.errval = errval; 
	}
 
	@Override
	public String getEvent() {
		return this.event;
	}
 
	@Override
	public void setEvent(final String event) {
		this.event = event; 
	}
 
	@Override
	public String getFullEvent() {
		return this.fullEvent;
	}
 
	@Override
	public void setFullEvent(final String fullEvent) {
		this.fullEvent = fullEvent; 
	}
 
	@Override
	public String getError() {
		return this.error;
	}
 
	@Override
	public void setError(final String error) {
		this.error = error; 
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
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
}
