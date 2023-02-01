package com.doc.common.po.impl; 
 
public class LogmnrSession$Po implements ILogmnrSession$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		CLIENT#("null"), //
		SESSION_NAME("null"), //
		DB_ID("null"), //
		RESETLOGS_CHANGE#("null"), //
		SESSION_ATTR("null"), //
		SESSION_ATTR_VERBOSE("null"), //
		START_SCN("null"), //
		END_SCN("null"), //
		SPILL_SCN("null"), //
		SPILL_TIME("null"), //
		OLDEST_SCN("null"), //
		RESUME_SCN("null"), //
		GLOBAL_DB_NAME("null"), //
		RESET_TIMESTAMP("null"), //
		BRANCH_SCN("null"), //
		VERSION("null"), //
		REDO_COMPAT("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null"), //
		SPARE5("null"), //
		SPARE6("null"), //
		SPARE7("null"), //
		SPARE8("null") //
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
	private BigDecimal client#;
	private String sessionName;
	private BigDecimal dbId;
	private BigDecimal resetlogsChange#;
	private BigDecimal sessionAttr;
	private String sessionAttrVerbose;
	private BigDecimal startScn;
	private BigDecimal endScn;
	private BigDecimal spillScn;
	private java.sql.Timestamp spillTime;
	private BigDecimal oldestScn;
	private BigDecimal resumeScn;
	private String globalDbName;
	private BigDecimal resetTimestamp;
	private BigDecimal branchScn;
	private String version;
	private String redoCompat;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private BigDecimal spare4;
	private BigDecimal spare5;
	private java.sql.Timestamp spare6;
	private String spare7;
	private String spare8;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getClient#() {
		return this.client#;
	}
 
	@Override
	public void setClient#(final BigDecimal client#) {
		this.client# = client#; 
	}
 
	@Override
	public String getSessionName() {
		return this.sessionName;
	}
 
	@Override
	public void setSessionName(final String sessionName) {
		this.sessionName = sessionName; 
	}
 
	@Override
	public BigDecimal getDbId() {
		return this.dbId;
	}
 
	@Override
	public void setDbId(final BigDecimal dbId) {
		this.dbId = dbId; 
	}
 
	@Override
	public BigDecimal getResetlogsChange#() {
		return this.resetlogsChange#;
	}
 
	@Override
	public void setResetlogsChange#(final BigDecimal resetlogsChange#) {
		this.resetlogsChange# = resetlogsChange#; 
	}
 
	@Override
	public BigDecimal getSessionAttr() {
		return this.sessionAttr;
	}
 
	@Override
	public void setSessionAttr(final BigDecimal sessionAttr) {
		this.sessionAttr = sessionAttr; 
	}
 
	@Override
	public String getSessionAttrVerbose() {
		return this.sessionAttrVerbose;
	}
 
	@Override
	public void setSessionAttrVerbose(final String sessionAttrVerbose) {
		this.sessionAttrVerbose = sessionAttrVerbose; 
	}
 
	@Override
	public BigDecimal getStartScn() {
		return this.startScn;
	}
 
	@Override
	public void setStartScn(final BigDecimal startScn) {
		this.startScn = startScn; 
	}
 
	@Override
	public BigDecimal getEndScn() {
		return this.endScn;
	}
 
	@Override
	public void setEndScn(final BigDecimal endScn) {
		this.endScn = endScn; 
	}
 
	@Override
	public BigDecimal getSpillScn() {
		return this.spillScn;
	}
 
	@Override
	public void setSpillScn(final BigDecimal spillScn) {
		this.spillScn = spillScn; 
	}
 
	@Override
	public java.sql.Timestamp getSpillTime() {
		return this.spillTime;
	}
 
	@Override
	public void setSpillTime(final java.sql.Timestamp spillTime) {
		this.spillTime = spillTime; 
	}
 
	@Override
	public BigDecimal getOldestScn() {
		return this.oldestScn;
	}
 
	@Override
	public void setOldestScn(final BigDecimal oldestScn) {
		this.oldestScn = oldestScn; 
	}
 
	@Override
	public BigDecimal getResumeScn() {
		return this.resumeScn;
	}
 
	@Override
	public void setResumeScn(final BigDecimal resumeScn) {
		this.resumeScn = resumeScn; 
	}
 
	@Override
	public String getGlobalDbName() {
		return this.globalDbName;
	}
 
	@Override
	public void setGlobalDbName(final String globalDbName) {
		this.globalDbName = globalDbName; 
	}
 
	@Override
	public BigDecimal getResetTimestamp() {
		return this.resetTimestamp;
	}
 
	@Override
	public void setResetTimestamp(final BigDecimal resetTimestamp) {
		this.resetTimestamp = resetTimestamp; 
	}
 
	@Override
	public BigDecimal getBranchScn() {
		return this.branchScn;
	}
 
	@Override
	public void setBranchScn(final BigDecimal branchScn) {
		this.branchScn = branchScn; 
	}
 
	@Override
	public String getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final String version) {
		this.version = version; 
	}
 
	@Override
	public String getRedoCompat() {
		return this.redoCompat;
	}
 
	@Override
	public void setRedoCompat(final String redoCompat) {
		this.redoCompat = redoCompat; 
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
	public BigDecimal getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final BigDecimal spare4) {
		this.spare4 = spare4; 
	}
 
	@Override
	public BigDecimal getSpare5() {
		return this.spare5;
	}
 
	@Override
	public void setSpare5(final BigDecimal spare5) {
		this.spare5 = spare5; 
	}
 
	@Override
	public java.sql.Timestamp getSpare6() {
		return this.spare6;
	}
 
	@Override
	public void setSpare6(final java.sql.Timestamp spare6) {
		this.spare6 = spare6; 
	}
 
	@Override
	public String getSpare7() {
		return this.spare7;
	}
 
	@Override
	public void setSpare7(final String spare7) {
		this.spare7 = spare7; 
	}
 
	@Override
	public String getSpare8() {
		return this.spare8;
	}
 
	@Override
	public void setSpare8(final String spare8) {
		this.spare8 = spare8; 
	}
 
}
