package com.doc.common.po.impl; 
 
public class Mview$AdvInfoPo implements IMview$AdvInfoPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		SEQ#("null"), //
		TYPE("null"), //
		INFOLEN("null"), //
		INFO("null"), //
		STATUS("null"), //
		FLAG("null") //
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
	private BigDecimal seq#;
	private BigDecimal type;
	private BigDecimal infolen;
	private String info;
	private BigDecimal status;
	private BigDecimal flag;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getSeq#() {
		return this.seq#;
	}
 
	@Override
	public void setSeq#(final BigDecimal seq#) {
		this.seq# = seq#; 
	}
 
	@Override
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
	}
 
	@Override
	public BigDecimal getInfolen() {
		return this.infolen;
	}
 
	@Override
	public void setInfolen(final BigDecimal infolen) {
		this.infolen = infolen; 
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
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
	}
 
	@Override
	public BigDecimal getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final BigDecimal flag) {
		this.flag = flag; 
	}
 
}
