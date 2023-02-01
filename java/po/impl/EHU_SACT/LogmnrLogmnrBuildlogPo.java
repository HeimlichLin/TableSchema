package com.doc.common.po.impl; 
 
public class LogmnrLogmnrBuildlogPo implements ILogmnrLogmnrBuildlogPo {
 
	public enum COLUMNS {
		BUILD_DATE("null"), //
		DB_TXN_SCNBAS("null"), //
		DB_TXN_SCNWRP("null"), //
		CURRENT_BUILD_STATE("null"), //
		COMPLETION_STATUS("null"), //
		MARKED_LOG_FILE_LOW_SCN("null"), //
		INITIAL_XID("null"), //
		LOGMNR_UID("null"), //
		LOGMNR_FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String buildDate;
	private BigDecimal dbTxnScnbas;
	private BigDecimal dbTxnScnwrp;
	private BigDecimal currentBuildState;
	private BigDecimal completionStatus;
	private BigDecimal markedLogFileLowScn;
	private String initialXid;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public String getBuildDate() {
		return this.buildDate;
	}
 
	@Override
	public void setBuildDate(final String buildDate) {
		this.buildDate = buildDate; 
	}
 
	@Override
	public BigDecimal getDbTxnScnbas() {
		return this.dbTxnScnbas;
	}
 
	@Override
	public void setDbTxnScnbas(final BigDecimal dbTxnScnbas) {
		this.dbTxnScnbas = dbTxnScnbas; 
	}
 
	@Override
	public BigDecimal getDbTxnScnwrp() {
		return this.dbTxnScnwrp;
	}
 
	@Override
	public void setDbTxnScnwrp(final BigDecimal dbTxnScnwrp) {
		this.dbTxnScnwrp = dbTxnScnwrp; 
	}
 
	@Override
	public BigDecimal getCurrentBuildState() {
		return this.currentBuildState;
	}
 
	@Override
	public void setCurrentBuildState(final BigDecimal currentBuildState) {
		this.currentBuildState = currentBuildState; 
	}
 
	@Override
	public BigDecimal getCompletionStatus() {
		return this.completionStatus;
	}
 
	@Override
	public void setCompletionStatus(final BigDecimal completionStatus) {
		this.completionStatus = completionStatus; 
	}
 
	@Override
	public BigDecimal getMarkedLogFileLowScn() {
		return this.markedLogFileLowScn;
	}
 
	@Override
	public void setMarkedLogFileLowScn(final BigDecimal markedLogFileLowScn) {
		this.markedLogFileLowScn = markedLogFileLowScn; 
	}
 
	@Override
	public String getInitialXid() {
		return this.initialXid;
	}
 
	@Override
	public void setInitialXid(final String initialXid) {
		this.initialXid = initialXid; 
	}
 
	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getLogmnrFlags() {
		return this.logmnrFlags;
	}
 
	@Override
	public void setLogmnrFlags(final BigDecimal logmnrFlags) {
		this.logmnrFlags = logmnrFlags; 
	}
 
}
