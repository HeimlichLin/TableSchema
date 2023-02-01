package com.doc.common.po.impl; 
 
public class RecvlogPo implements IRecvlogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		RECV_TYPE("接收類別"), //
		KEYWORD("參考單號"), //
		MSG_TYPE("訊息類別"), //
		PROC_TIME("處理時間"), //
		PROC_STATUS("處理狀態"), //
		PROC_RMK("處理註記"), //
		CONTROL_NO("封包號碼"), //
		SRC_TYPE("資料來源.S:三大 A:APP L:自主 X:XML"), //
		MAWB_NO("主提單號"), //
		HAWB_NO("分提單號") //
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
	private String recvType;
	private String keyword;
	private String msgType;
	private java.sql.Timestamp procTime;
	private BigDecimal procStatus;
	private String procRmk;
	private String controlNo;
	private String srcType;
	private String mawbNo;
	private String hawbNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getRecvType() {
		return this.recvType;
	}
 
	@Override
	public void setRecvType(final String recvType) {
		this.recvType = recvType; 
	}
 
	@Override
	public String getKeyword() {
		return this.keyword;
	}
 
	@Override
	public void setKeyword(final String keyword) {
		this.keyword = keyword; 
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
	public java.sql.Timestamp getProcTime() {
		return this.procTime;
	}
 
	@Override
	public void setProcTime(final java.sql.Timestamp procTime) {
		this.procTime = procTime; 
	}
 
	@Override
	public BigDecimal getProcStatus() {
		return this.procStatus;
	}
 
	@Override
	public void setProcStatus(final BigDecimal procStatus) {
		this.procStatus = procStatus; 
	}
 
	@Override
	public String getProcRmk() {
		return this.procRmk;
	}
 
	@Override
	public void setProcRmk(final String procRmk) {
		this.procRmk = procRmk; 
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
	public String getSrcType() {
		return this.srcType;
	}
 
	@Override
	public void setSrcType(final String srcType) {
		this.srcType = srcType; 
	}
 
	@Override
	public String getMawbNo() {
		return this.mawbNo;
	}
 
	@Override
	public void setMawbNo(final String mawbNo) {
		this.mawbNo = mawbNo; 
	}
 
	@Override
	public String getHawbNo() {
		return this.hawbNo;
	}
 
	@Override
	public void setHawbNo(final String hawbNo) {
		this.hawbNo = hawbNo; 
	}
 
}
