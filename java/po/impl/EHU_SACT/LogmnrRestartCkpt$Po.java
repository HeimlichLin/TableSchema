package com.doc.common.po.impl; 
 
public class LogmnrRestartCkpt$Po implements ILogmnrRestartCkpt$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		VALID("null"), //
		CKPT_SCN("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		SESSION_NUM("null"), //
		SERIAL_NUM("null"), //
		CKPT_INFO("null"), //
		FLAG("null"), //
		OFFSET("null"), //
		CLIENT_DATA("null"), //
		SPARE1("null"), //
		SPARE2("null") //
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
	private BigDecimal valid;
	private BigDecimal ckptScn;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal sessionNum;
	private BigDecimal serialNum;
	private String ckptInfo;
	private BigDecimal flag;
	private BigDecimal offset;
	private String clientData;
	private BigDecimal spare1;
	private BigDecimal spare2;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getValid() {
		return this.valid;
	}
 
	@Override
	public void setValid(final BigDecimal valid) {
		this.valid = valid; 
	}
 
	@Override
	public BigDecimal getCkptScn() {
		return this.ckptScn;
	}
 
	@Override
	public void setCkptScn(final BigDecimal ckptScn) {
		this.ckptScn = ckptScn; 
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
	public String getCkptInfo() {
		return this.ckptInfo;
	}
 
	@Override
	public void setCkptInfo(final String ckptInfo) {
		this.ckptInfo = ckptInfo; 
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
	public BigDecimal getOffset() {
		return this.offset;
	}
 
	@Override
	public void setOffset(final BigDecimal offset) {
		this.offset = offset; 
	}
 
	@Override
	public String getClientData() {
		return this.clientData;
	}
 
	@Override
	public void setClientData(final String clientData) {
		this.clientData = clientData; 
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
 
}
