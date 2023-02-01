package com.doc.common.po.impl; 
 
public class MailquePo implements IMailquePo {
 
	public enum COLUMNS {
		PGM_ID("產生程式"), //
		CREATE_DATE("建立日期"), //
		SUBJECT("信件主旨"), //
		MAIL_TO("收件者,多筆以分號隔開"), //
		MAIL_CC("副本"), //
		MAIL_BCC("密件副本"), //
		MAIL_FROM("寄件者"), //
		MESSAGE("信件內容"), //
		REMARKS("備註"), //
		MAIL_ID("信件ID"), //
		STATUS("狀態.W:等待,R:重送,C:完成"), //
		SEND_DATE("寄件時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String pgmId;
	private java.sql.Timestamp createDate;
	private String subject;
	private String mailTo;
	private String mailCc;
	private String mailBcc;
	private String mailFrom;
	private String message;
	private String remarks;
	private String mailId;
	private String status;
	private java.sql.Timestamp sendDate;

	@Override
	public String getPgmId() {
		return this.pgmId;
	}
 
	@Override
	public void setPgmId(final String pgmId) {
		this.pgmId = pgmId; 
	}
 
	@Override
	public java.sql.Timestamp getCreateDate() {
		return this.createDate;
	}
 
	@Override
	public void setCreateDate(final java.sql.Timestamp createDate) {
		this.createDate = createDate; 
	}
 
	@Override
	public String getSubject() {
		return this.subject;
	}
 
	@Override
	public void setSubject(final String subject) {
		this.subject = subject; 
	}
 
	@Override
	public String getMailTo() {
		return this.mailTo;
	}
 
	@Override
	public void setMailTo(final String mailTo) {
		this.mailTo = mailTo; 
	}
 
	@Override
	public String getMailCc() {
		return this.mailCc;
	}
 
	@Override
	public void setMailCc(final String mailCc) {
		this.mailCc = mailCc; 
	}
 
	@Override
	public String getMailBcc() {
		return this.mailBcc;
	}
 
	@Override
	public void setMailBcc(final String mailBcc) {
		this.mailBcc = mailBcc; 
	}
 
	@Override
	public String getMailFrom() {
		return this.mailFrom;
	}
 
	@Override
	public void setMailFrom(final String mailFrom) {
		this.mailFrom = mailFrom; 
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
	public String getRemarks() {
		return this.remarks;
	}
 
	@Override
	public void setRemarks(final String remarks) {
		this.remarks = remarks; 
	}
 
	@Override
	public String getMailId() {
		return this.mailId;
	}
 
	@Override
	public void setMailId(final String mailId) {
		this.mailId = mailId; 
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
	public java.sql.Timestamp getSendDate() {
		return this.sendDate;
	}
 
	@Override
	public void setSendDate(final java.sql.Timestamp sendDate) {
		this.sendDate = sendDate; 
	}
 
}
