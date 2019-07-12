package com.doc.common.bean; 
 
public class MessageTmpDo { 
 
	public enum COLUMNS { 
		BF_NO("監管編號"), 
		CONTROL_NO("檔案名稱"), 
		SERIAL_NO("上傳序號"), 
		TIME("上傳時間"), 
		MSG_TYPE("訊息類別"), 
		STATUS("處理進度 N待執行 W:執行中 Y:已完成 E:作業失敗"), 
		DEALFINISH_TIME("完成時間") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bfNo; 
	private String controlNo; 
	private BigDecimal serialNo; 
	private java.sql.Timestamp time; 
	private String msgType; 
	private String status; 
	private java.sql.Timestamp dealfinishTime; 
	
	public String getBfNo() { 
		return bfNo; 
	} 
 
	public void setBfNo(String bfNo) { 
		this.bfNo = bfNo; 
	} 
 
	public String getControlNo() { 
		return controlNo; 
	} 
 
	public void setControlNo(String controlNo) { 
		this.controlNo = controlNo; 
	} 
 
	public BigDecimal getSerialNo() { 
		return serialNo; 
	} 
 
	public void setSerialNo(BigDecimal serialNo) { 
		this.serialNo = serialNo; 
	} 
 
	public java.sql.Timestamp getTime() { 
		return time; 
	} 
 
	public void setTime(java.sql.Timestamp time) { 
		this.time = time; 
	} 
 
	public String getMsgType() { 
		return msgType; 
	} 
 
	public void setMsgType(String msgType) { 
		this.msgType = msgType; 
	} 
 
	public String getStatus() { 
		return status; 
	} 
 
	public void setStatus(String status) { 
		this.status = status; 
	} 
 
	public java.sql.Timestamp getDealfinishTime() { 
		return dealfinishTime; 
	} 
 
	public void setDealfinishTime(java.sql.Timestamp dealfinishTime) { 
		this.dealfinishTime = dealfinishTime; 
	} 
 
} 
