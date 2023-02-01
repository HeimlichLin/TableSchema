package com.doc.common.po.impl; 
 
public class LogmnrGlobal$Po implements ILogmnrGlobal$Po {
 
	public enum COLUMNS {
		HIGH_RECID_FOREIGN("null"), //
		HIGH_RECID_DELETED("null"), //
		LOCAL_RESET_SCN("null"), //
		LOCAL_RESET_TIMESTAMP("null"), //
		VERSION_TIMESTAMP("null"), //
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
 
	private BigDecimal highRecidForeign;
	private BigDecimal highRecidDeleted;
	private BigDecimal localResetScn;
	private BigDecimal localResetTimestamp;
	private BigDecimal versionTimestamp;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private String spare4;
	private java.sql.Timestamp spare5;

	@Override
	public BigDecimal getHighRecidForeign() {
		return this.highRecidForeign;
	}
 
	@Override
	public void setHighRecidForeign(final BigDecimal highRecidForeign) {
		this.highRecidForeign = highRecidForeign; 
	}
 
	@Override
	public BigDecimal getHighRecidDeleted() {
		return this.highRecidDeleted;
	}
 
	@Override
	public void setHighRecidDeleted(final BigDecimal highRecidDeleted) {
		this.highRecidDeleted = highRecidDeleted; 
	}
 
	@Override
	public BigDecimal getLocalResetScn() {
		return this.localResetScn;
	}
 
	@Override
	public void setLocalResetScn(final BigDecimal localResetScn) {
		this.localResetScn = localResetScn; 
	}
 
	@Override
	public BigDecimal getLocalResetTimestamp() {
		return this.localResetTimestamp;
	}
 
	@Override
	public void setLocalResetTimestamp(final BigDecimal localResetTimestamp) {
		this.localResetTimestamp = localResetTimestamp; 
	}
 
	@Override
	public BigDecimal getVersionTimestamp() {
		return this.versionTimestamp;
	}
 
	@Override
	public void setVersionTimestamp(final BigDecimal versionTimestamp) {
		this.versionTimestamp = versionTimestamp; 
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
	public java.sql.Timestamp getSpare5() {
		return this.spare5;
	}
 
	@Override
	public void setSpare5(final java.sql.Timestamp spare5) {
		this.spare5 = spare5; 
	}
 
}
