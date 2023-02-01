package com.doc.common.po.impl; 
 
public class ProcLogPo implements IProcLogPo {
 
	public enum COLUMNS {
		PROGRAME_ID("程式代碼"), //
		STATUS("狀態
"), //
		MESSSAGE("訊息
"), //
		YYYYMMDD("時間"), //
		HHMMSS("日期"), //
		METHOD("方法"), //
		LINE("行數
"), //
		IP("執行IP
"), //
		STACKTRACE("異常紀錄") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String programeId;
	private String status;
	private String messsage;
	private String yyyymmdd;
	private String hhmmss;
	private String method;
	private String line;
	private String ip;
	private String stacktrace;

	@Override
	public String getProgrameId() {
		return this.programeId;
	}
 
	@Override
	public void setProgrameId(final String programeId) {
		this.programeId = programeId; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getMesssage() {
		return this.messsage;
	}
 
	@Override
	public void setMesssage(final String messsage) {
		this.messsage = messsage; 
	}
 
	@Override
	public String getYyyymmdd() {
		return this.yyyymmdd;
	}
 
	@Override
	public void setYyyymmdd(final String yyyymmdd) {
		this.yyyymmdd = yyyymmdd; 
	}
 
	@Override
	public String getHhmmss() {
		return this.hhmmss;
	}
 
	@Override
	public void setHhmmss(final String hhmmss) {
		this.hhmmss = hhmmss; 
	}
 
	@Override
	public String getMethod() {
		return this.method;
	}
 
	@Override
	public void setMethod(final String method) {
		this.method = method; 
	}
 
	@Override
	public String getLine() {
		return this.line;
	}
 
	@Override
	public void setLine(final String line) {
		this.line = line; 
	}
 
	@Override
	public String getIp() {
		return this.ip;
	}
 
	@Override
	public void setIp(final String ip) {
		this.ip = ip; 
	}
 
	@Override
	public String getStacktrace() {
		return this.stacktrace;
	}
 
	@Override
	public void setStacktrace(final String stacktrace) {
		this.stacktrace = stacktrace; 
	}
 
}
