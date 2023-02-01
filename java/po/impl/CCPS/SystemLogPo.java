package com.doc.common.po.impl; 
 
public class SystemLogPo implements ISystemLogPo {
 
	public enum COLUMNS {
		TRANSACTION_ID("交易編號"), //
		TRANSACTION_MODE("交易模式"), //
		DATA_FORMAT("資料格式"), //
		RETURN_CODE("回傳代號"), //
		RETURN_MSG("回傳訊息"), //
		UPDATE_USER("更新使用者"), //
		UPDATE_DATE("更新日期") //
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
	private String transactionMode;
	private String dataFormat;
	private String returnCode;
	private String returnMsg;
	private String updateUser;
	private java.sql.Timestamp updateDate;

	@Override
	public String getTransactionId() {
		return this.transactionId;
	}
 
	@Override
	public void setTransactionId(final String transactionId) {
		this.transactionId = transactionId; 
	}
 
	@Override
	public String getTransactionMode() {
		return this.transactionMode;
	}
 
	@Override
	public void setTransactionMode(final String transactionMode) {
		this.transactionMode = transactionMode; 
	}
 
	@Override
	public String getDataFormat() {
		return this.dataFormat;
	}
 
	@Override
	public void setDataFormat(final String dataFormat) {
		this.dataFormat = dataFormat; 
	}
 
	@Override
	public String getReturnCode() {
		return this.returnCode;
	}
 
	@Override
	public void setReturnCode(final String returnCode) {
		this.returnCode = returnCode; 
	}
 
	@Override
	public String getReturnMsg() {
		return this.returnMsg;
	}
 
	@Override
	public void setReturnMsg(final String returnMsg) {
		this.returnMsg = returnMsg; 
	}
 
	@Override
	public String getUpdateUser() {
		return this.updateUser;
	}
 
	@Override
	public void setUpdateUser(final String updateUser) {
		this.updateUser = updateUser; 
	}
 
	@Override
	public java.sql.Timestamp getUpdateDate() {
		return this.updateDate;
	}
 
	@Override
	public void setUpdateDate(final java.sql.Timestamp updateDate) {
		this.updateDate = updateDate; 
	}
 
}
