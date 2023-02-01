package com.doc.common.po.impl; 
 
public class Logstdby$applyMilestonePo implements ILogstdby$applyMilestonePo {
 
	public enum COLUMNS {
		SESSION_ID("null"), //
		COMMIT_SCN("null"), //
		COMMIT_TIME("null"), //
		SYNCH_SCN("null"), //
		EPOCH("null"), //
		PROCESSED_SCN("null"), //
		PROCESSED_TIME("null"), //
		FETCHLWM_SCN("null"), //
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
 
	private BigDecimal sessionId;
	private BigDecimal commitScn;
	private java.sql.Timestamp commitTime;
	private BigDecimal synchScn;
	private BigDecimal epoch;
	private BigDecimal processedScn;
	private java.sql.Timestamp processedTime;
	private BigDecimal fetchlwmScn;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getSessionId() {
		return this.sessionId;
	}
 
	@Override
	public void setSessionId(final BigDecimal sessionId) {
		this.sessionId = sessionId; 
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
	public java.sql.Timestamp getCommitTime() {
		return this.commitTime;
	}
 
	@Override
	public void setCommitTime(final java.sql.Timestamp commitTime) {
		this.commitTime = commitTime; 
	}
 
	@Override
	public BigDecimal getSynchScn() {
		return this.synchScn;
	}
 
	@Override
	public void setSynchScn(final BigDecimal synchScn) {
		this.synchScn = synchScn; 
	}
 
	@Override
	public BigDecimal getEpoch() {
		return this.epoch;
	}
 
	@Override
	public void setEpoch(final BigDecimal epoch) {
		this.epoch = epoch; 
	}
 
	@Override
	public BigDecimal getProcessedScn() {
		return this.processedScn;
	}
 
	@Override
	public void setProcessedScn(final BigDecimal processedScn) {
		this.processedScn = processedScn; 
	}
 
	@Override
	public java.sql.Timestamp getProcessedTime() {
		return this.processedTime;
	}
 
	@Override
	public void setProcessedTime(final java.sql.Timestamp processedTime) {
		this.processedTime = processedTime; 
	}
 
	@Override
	public BigDecimal getFetchlwmScn() {
		return this.fetchlwmScn;
	}
 
	@Override
	public void setFetchlwmScn(final BigDecimal fetchlwmScn) {
		this.fetchlwmScn = fetchlwmScn; 
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
