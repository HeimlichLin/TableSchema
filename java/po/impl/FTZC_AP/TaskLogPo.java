package com.doc.common.po.impl; 
 
public class TaskLogPo implements ITaskLogPo {
 
	public enum COLUMNS {
		CODE("程式名稱"), //
		LINE("程式行數"), //
		MESSAGE("異常訊息"), //
		TIME("發生時間
"), //
		PRIORITY("發生層級
") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String code;
	private BigDecimal line;
	private String message;
	private String time;
	private String priority;

	@Override
	public String getCode() {
		return this.code;
	}
 
	@Override
	public void setCode(final String code) {
		this.code = code; 
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
	public String getMessage() {
		return this.message;
	}
 
	@Override
	public void setMessage(final String message) {
		this.message = message; 
	}
 
	@Override
	public String getTime() {
		return this.time;
	}
 
	@Override
	public void setTime(final String time) {
		this.time = time; 
	}
 
	@Override
	public String getPriority() {
		return this.priority;
	}
 
	@Override
	public void setPriority(final String priority) {
		this.priority = priority; 
	}
 
}
