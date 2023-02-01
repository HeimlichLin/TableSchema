package com.doc.common.po.impl; 
 
public class Repcat$DdlPo implements IRepcat$DdlPo {
 
	public enum COLUMNS {
		LOG_ID("Identifying number of the repcat log record"), //
		SOURCE("Name of the database at which the request originated"), //
		ROLE("Is this database the masterdef for the request"), //
		MASTER("Name of the database that processes this request"), //
		LINE("Ordering of records within a single request"), //
		TEXT("Portion of an argument"), //
		DDL_NUM("Ordering of DDLs to execute") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal logId;
	private String source;
	private String role;
	private String master;
	private BigDecimal line;
	private String text;
	private BigDecimal ddlNum;

	@Override
	public BigDecimal getLogId() {
		return this.logId;
	}
 
	@Override
	public void setLogId(final BigDecimal logId) {
		this.logId = logId; 
	}
 
	@Override
	public String getSource() {
		return this.source;
	}
 
	@Override
	public void setSource(final String source) {
		this.source = source; 
	}
 
	@Override
	public String getRole() {
		return this.role;
	}
 
	@Override
	public void setRole(final String role) {
		this.role = role; 
	}
 
	@Override
	public String getMaster() {
		return this.master;
	}
 
	@Override
	public void setMaster(final String master) {
		this.master = master; 
	}
 
	@Override
	public BigDecimal getLine() {
		return this.line;
	}
 
	@Override
	public void setLine(final BigDecimal line) {
		this.line = line; 
	}
 
	@Override
	public String getText() {
		return this.text;
	}
 
	@Override
	public void setText(final String text) {
		this.text = text; 
	}
 
	@Override
	public BigDecimal getDdlNum() {
		return this.ddlNum;
	}
 
	@Override
	public void setDdlNum(final BigDecimal ddlNum) {
		this.ddlNum = ddlNum; 
	}
 
}
