package com.doc.common.po.impl; 
 
public class LogmnrSessionEvolve$Po implements ILogmnrSessionEvolve$Po {
 
	public enum COLUMNS {
		BRANCH_LEVEL("null"), //
		SESSION#("null"), //
		DB_ID("null"), //
		RESET_SCN("null"), //
		RESET_TIMESTAMP("null"), //
		PREV_RESET_SCN("null"), //
		PREV_RESET_TIMESTAMP("null"), //
		STATUS("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null"), //
		SPARE4("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal branchLevel;
	private BigDecimal session#;
	private BigDecimal dbId;
	private BigDecimal resetScn;
	private BigDecimal resetTimestamp;
	private BigDecimal prevResetScn;
	private BigDecimal prevResetTimestamp;
	private BigDecimal status;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private java.sql.Timestamp spare4;

	@Override
	public BigDecimal getBranchLevel() {
		return this.branchLevel;
	}
 
	@Override
	public void setBranchLevel(final BigDecimal branchLevel) {
		this.branchLevel = branchLevel; 
	}
 
	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
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
	public BigDecimal getResetScn() {
		return this.resetScn;
	}
 
	@Override
	public void setResetScn(final BigDecimal resetScn) {
		this.resetScn = resetScn; 
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
	public BigDecimal getPrevResetScn() {
		return this.prevResetScn;
	}
 
	@Override
	public void setPrevResetScn(final BigDecimal prevResetScn) {
		this.prevResetScn = prevResetScn; 
	}
 
	@Override
	public BigDecimal getPrevResetTimestamp() {
		return this.prevResetTimestamp;
	}
 
	@Override
	public void setPrevResetTimestamp(final BigDecimal prevResetTimestamp) {
		this.prevResetTimestamp = prevResetTimestamp; 
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
	public java.sql.Timestamp getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final java.sql.Timestamp spare4) {
		this.spare4 = spare4; 
	}
 
}
