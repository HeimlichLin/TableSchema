package com.doc.common.po.impl; 
 
public class LogmnrRestartCkptTxinfo$Po implements ILogmnrRestartCkptTxinfo$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		SESSION_NUM("null"), //
		SERIAL_NUM("null"), //
		FLAG("null"), //
		START_SCN("null"), //
		EFFECTIVE_SCN("null"), //
		OFFSET("null"), //
		TX_DATA("null") //
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
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal sessionNum;
	private BigDecimal serialNum;
	private BigDecimal flag;
	private BigDecimal startScn;
	private BigDecimal effectiveScn;
	private BigDecimal offset;
	private String txData;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
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
	public BigDecimal getSessionNum() {
		return this.sessionNum;
	}
 
	@Override
	public void setSessionNum(final BigDecimal sessionNum) {
		this.sessionNum = sessionNum; 
	}
 
	@Override
	public BigDecimal getSerialNum() {
		return this.serialNum;
	}
 
	@Override
	public void setSerialNum(final BigDecimal serialNum) {
		this.serialNum = serialNum; 
	}
 
	@Override
	public BigDecimal getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final BigDecimal flag) {
		this.flag = flag; 
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
	public BigDecimal getEffectiveScn() {
		return this.effectiveScn;
	}
 
	@Override
	public void setEffectiveScn(final BigDecimal effectiveScn) {
		this.effectiveScn = effectiveScn; 
	}
 
	@Override
	public BigDecimal getOffset() {
		return this.offset;
	}
 
	@Override
	public void setOffset(final BigDecimal offset) {
		this.offset = offset; 
	}
 
	@Override
	public String getTxData() {
		return this.txData;
	}
 
	@Override
	public void setTxData(final String txData) {
		this.txData = txData; 
	}
 
}
