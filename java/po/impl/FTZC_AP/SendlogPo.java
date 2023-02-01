package com.doc.common.po.impl; 
 
public class SendlogPo implements ISendlogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DECL_NO("報單號碼"), //
		STR_TYPE("進出倉別"), //
		SEND_FLAG("傳送註記R,N:待傳送,Y:已傳送"), //
		CONTROL_NO("封包號碼"), //
		SEND_TIME("傳送時間"), //
		MSG_FUN("異動別"), //
		MSG_TYPE("訊息別"), //
		AS_TYPE("海空運別.S:海運.A:空運"), //
		IO_TYPE("進出口別.I:進口.O:出口"), //
		DECL_SEQ_NO("報單序號(5205使用)"), //
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
	private String declNo;
	private String strType;
	private String sendFlag;
	private String controlNo;
	private String sendTime;
	private String msgFun;
	private String msgType;
	private String asType;
	private String ioType;
	private BigDecimal declSeqNo;
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
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public String getSendFlag() {
		return this.sendFlag;
	}
 
	@Override
	public void setSendFlag(final String sendFlag) {
		this.sendFlag = sendFlag; 
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
	public String getSendTime() {
		return this.sendTime;
	}
 
	@Override
	public void setSendTime(final String sendTime) {
		this.sendTime = sendTime; 
	}
 
	@Override
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
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
	public String getAsType() {
		return this.asType;
	}
 
	@Override
	public void setAsType(final String asType) {
		this.asType = asType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
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
