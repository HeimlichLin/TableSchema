package com.doc.common.po.impl; 
 
public class SysMsgPo implements ISysMsgPo {
 
	public enum COLUMNS {
		MSG_ID("yyyyMMddHHMMssSSS+三位流水號"), //
		MSG_TYPE("00：系統訊息
01：公告訊息
02：案件待審通知"), //
		DEV_TOKEN("參考：管制點裝置資訊"), //
		MSG_TITLE("訊息標題"), //
		MSG_CONTENT("訊息內容"), //
		SEND_FLAG("Y：已傳送
N：未傳送") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String msgId;
	private String msgType;
	private String devToken;
	private String msgTitle;
	private String msgContent;
	private String sendFlag;

	@Override
	public String getMsgId() {
		return this.msgId;
	}
 
	@Override
	public void setMsgId(final String msgId) {
		this.msgId = msgId; 
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
	public String getDevToken() {
		return this.devToken;
	}
 
	@Override
	public void setDevToken(final String devToken) {
		this.devToken = devToken; 
	}
 
	@Override
	public String getMsgTitle() {
		return this.msgTitle;
	}
 
	@Override
	public void setMsgTitle(final String msgTitle) {
		this.msgTitle = msgTitle; 
	}
 
	@Override
	public String getMsgContent() {
		return this.msgContent;
	}
 
	@Override
	public void setMsgContent(final String msgContent) {
		this.msgContent = msgContent; 
	}
 
	@Override
	public String getSendFlag() {
		return this.sendFlag;
	}
 
	@Override
	public void setSendFlag(final String sendFlag) {
		this.sendFlag = sendFlag; 
	}
 
}
