package com.doc.common.po.impl; 
 
public class BigDateTransactionIdQuePo implements IBigDateTransactionIdQuePo {
 
	public enum COLUMNS {
		TRANSACTION_ID("交易序號"), //
		DECL_NO("報單號碼"), //
		STATUS("轉檔狀態"), //
		MSG_TYPE("轉檔訊息類別") //
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
	private String declNo;
	private String status;
	private String msgType;

	@Override
	public String getTransactionId() {
		return this.transactionId;
	}
 
	@Override
	public void setTransactionId(final String transactionId) {
		this.transactionId = transactionId; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
}
