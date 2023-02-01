package com.doc.common.po.impl; 
 
public class MessageTmpPo implements IMessageTmpPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("檔案名稱"), //
		SERIAL_NO("上傳序號"), //
		TIME("上傳時間"), //
		MSG_TYPE("訊息類別"), //
		STATUS("處理進度 N:待執行 W:執行中 Y:已完成 E:作業失敗"), //
		DEALBEGIN_TIME("開始時間"), //
		DEALFINISH_TIME("完成時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bfNo;
	private String controlNo;
	private BigDecimal serialNo;
	private java.sql.Timestamp time;
	private String msgType;
	private String status;
	private java.sql.Timestamp dealbeginTime;
	private java.sql.Timestamp dealfinishTime;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getControlNo() {
		return this.controlNo;
	}
 
	@Override
	public void setControlNo(final String controlNo) {
		this.controlNo = controlNo; 
	}
 
	@Override
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final BigDecimal serialNo) {
		this.serialNo = serialNo; 
	}
 
	@Override
	public java.sql.Timestamp getTime() {
		return this.time;
	}
 
	@Override
	public void setTime(final java.sql.Timestamp time) {
		this.time = time; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public java.sql.Timestamp getDealbeginTime() {
		return this.dealbeginTime;
	}
 
	@Override
	public void setDealbeginTime(final java.sql.Timestamp dealbeginTime) {
		this.dealbeginTime = dealbeginTime; 
	}
 
	@Override
	public java.sql.Timestamp getDealfinishTime() {
		return this.dealfinishTime;
	}
 
	@Override
	public void setDealfinishTime(final java.sql.Timestamp dealfinishTime) {
		this.dealfinishTime = dealfinishTime; 
	}
 
}
