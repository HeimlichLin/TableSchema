package com.doc.common.po.impl; 
 
public class DeclT1Po implements IDeclT1Po {
 
	public enum COLUMNS {
		TRANSACTION_ID("交易序號"), //
		MSG_TYPE("訊息別"), //
		PROC_STATUS("處理狀況 w:等待 r:執行中 t:中斷"), //
		DOWN_TIME("取得交易時間"), //
		START_TIME("執行開始時間"), //
		END_TIME("執行結束時間"), //
		CONSUMER("消費者 1.主消費者  2.重試人員"), //
		DECLNO("報單號碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transactionId;
	private String msgType;
	private String procStatus;
	private String downTime;
	private String startTime;
	private String endTime;
	private String consumer;
	private String declno;

	@Override
	public String getTransactionId() {
		return this.transactionId;
	}
 
	@Override
	public void setTransactionId(final String transactionId) {
		this.transactionId = transactionId; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
	@Override
	public String getProcStatus() {
		return this.procStatus;
	}
 
	@Override
	public void setProcStatus(final String procStatus) {
		this.procStatus = procStatus; 
	}
 
	@Override
	public String getDownTime() {
		return this.downTime;
	}
 
	@Override
	public void setDownTime(final String downTime) {
		this.downTime = downTime; 
	}
 
	@Override
	public String getStartTime() {
		return this.startTime;
	}
 
	@Override
	public void setStartTime(final String startTime) {
		this.startTime = startTime; 
	}
 
	@Override
	public String getEndTime() {
		return this.endTime;
	}
 
	@Override
	public void setEndTime(final String endTime) {
		this.endTime = endTime; 
	}
 
	@Override
	public String getConsumer() {
		return this.consumer;
	}
 
	@Override
	public void setConsumer(final String consumer) {
		this.consumer = consumer; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
}
