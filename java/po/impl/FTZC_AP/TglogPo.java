package com.doc.common.po.impl; 
 
public class TglogPo implements ITglogPo {
 
	public enum COLUMNS {
		LOG_PGM("程式名稱"), //
		LOG_ACTION("ACTION"), //
		LOG_ERROR("錯誤"), //
		LOG_DATM("時間"), //
		LOG1("null"), //
		LOG2("null"), //
		LOG3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String logPgm;
	private String logAction;
	private String logError;
	private String logDatm;
	private String log1;
	private String log2;
	private String log3;

	@Override
	public String getLogPgm() {
		return this.logPgm;
	}
 
	@Override
	public void setLogPgm(final String logPgm) {
		this.logPgm = logPgm; 
	}
 
	@Override
	public String getLogAction() {
		return this.logAction;
	}
 
	@Override
	public void setLogAction(final String logAction) {
		this.logAction = logAction; 
	}
 
	@Override
	public String getLogError() {
		return this.logError;
	}
 
	@Override
	public void setLogError(final String logError) {
		this.logError = logError; 
	}
 
	@Override
	public String getLogDatm() {
		return this.logDatm;
	}
 
	@Override
	public void setLogDatm(final String logDatm) {
		this.logDatm = logDatm; 
	}
 
	@Override
	public String getLog1() {
		return this.log1;
	}
 
	@Override
	public void setLog1(final String log1) {
		this.log1 = log1; 
	}
 
	@Override
	public String getLog2() {
		return this.log2;
	}
 
	@Override
	public void setLog2(final String log2) {
		this.log2 = log2; 
	}
 
	@Override
	public String getLog3() {
		return this.log3;
	}
 
	@Override
	public void setLog3(final String log3) {
		this.log3 = log3; 
	}
 
}
