package com.doc.common.po.impl; 
 
public class FileInfPo implements IFileInfPo {
 
	public enum COLUMNS {
		TRANSACTION("交易序號"), //
		CONTENT("檔案內容"), //
		FILE_NAME("檔名"), //
		CREA_TIME("建立時間"), //
		FILE_SIZE("檔案大小") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transaction;
	private String content;
	private String fileName;
	private java.sql.Timestamp creaTime;
	private BigDecimal fileSize;

	@Override
	public String getTransaction() {
		return this.transaction;
	}
 
	@Override
	public void setTransaction(final String transaction) {
		this.transaction = transaction; 
	}
 
	@Override
	public String getContent() {
		return this.content;
	}
 
	@Override
	public void setContent(final String content) {
		this.content = content; 
	}
 
	@Override
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
	}
 
	@Override
	public java.sql.Timestamp getCreaTime() {
		return this.creaTime;
	}
 
	@Override
	public void setCreaTime(final java.sql.Timestamp creaTime) {
		this.creaTime = creaTime; 
	}
 
	@Override
	public BigDecimal getFileSize() {
		return this.fileSize;
	}
 
	@Override
	public void setFileSize(final BigDecimal fileSize) {
		this.fileSize = fileSize; 
	}
 
}
