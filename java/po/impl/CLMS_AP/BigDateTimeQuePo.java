package com.doc.common.po.impl; 
 
public class BigDateTimeQuePo implements IBigDateTimeQuePo {
 
	public enum COLUMNS {
		MSG_TYPE("轉檔訊息類別"), //
		TIME("轉檔區間"), //
		STATUS("轉檔狀態") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgType;
	private String time;
	private String status;

	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
}
