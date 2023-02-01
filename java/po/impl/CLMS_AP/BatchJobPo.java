package com.doc.common.po.impl; 
 
public class BatchJobPo implements IBatchJobPo {
 
	public enum COLUMNS {
		TRANSACTION("執行序號"), //
		EX_CODE("執行作業
"), //
		CREATER("建立者"), //
		EX_GROUP("任務群組
"), //
		CREATE_TIME("建立日期"), //
		START_TIME("開始日期"), //
		END_TIME("結束日期"), //
		STATUS("狀態 W:排隊中 R:執行中 E：異常 P:通過"), //
		PARAMETER("輸入參數轉成JSON存入"), //
		PARAMETER_CLASS("輸入資料Class"), //
		TARGET_CLASS("執行服務物件"), //
		HAS_FILE("是否產生檔案"), //
		IS_READ("N:未讀 Y 已讀"), //
		MAIL("背景通知人員"), //
		MESSAGE("處理訊息"), //
		FILE_CONTENT("檔案內容"), //
		FILE_NAME("檔名") //
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
	private String exCode;
	private String creater;
	private String exGroup;
	private java.sql.Timestamp createTime;
	private java.sql.Timestamp startTime;
	private java.sql.Timestamp endTime;
	private String status;
	private String parameter;
	private String parameterClass;
	private String targetClass;
	private String hasFile;
	private String isRead;
	private String mail;
	private String message;
	private String fileContent;
	private String fileName;

	@Override
	public String getTransaction() {
		return this.transaction;
	}
 
	@Override
	public void setTransaction(final String transaction) {
		this.transaction = transaction; 
	}
 
	@Override
	public String getExCode() {
		return this.exCode;
	}
 
	@Override
	public void setExCode(final String exCode) {
		this.exCode = exCode; 
	}
 
	@Override
	public String getCreater() {
		return this.creater;
	}
 
	@Override
	public void setCreater(final String creater) {
		this.creater = creater; 
	}
 
	@Override
	public String getExGroup() {
		return this.exGroup;
	}
 
	@Override
	public void setExGroup(final String exGroup) {
		this.exGroup = exGroup; 
	}
 
	@Override
	public java.sql.Timestamp getCreateTime() {
		return this.createTime;
	}
 
	@Override
	public void setCreateTime(final java.sql.Timestamp createTime) {
		this.createTime = createTime; 
	}
 
	@Override
	public java.sql.Timestamp getStartTime() {
		return this.startTime;
	}
 
	@Override
	public void setStartTime(final java.sql.Timestamp startTime) {
		this.startTime = startTime; 
	}
 
	@Override
	public java.sql.Timestamp getEndTime() {
		return this.endTime;
	}
 
	@Override
	public void setEndTime(final java.sql.Timestamp endTime) {
		this.endTime = endTime; 
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
	public String getParameter() {
		return this.parameter;
	}
 
	@Override
	public void setParameter(final String parameter) {
		this.parameter = parameter; 
	}
 
	@Override
	public String getParameterClass() {
		return this.parameterClass;
	}
 
	@Override
	public void setParameterClass(final String parameterClass) {
		this.parameterClass = parameterClass; 
	}
 
	@Override
	public String getTargetClass() {
		return this.targetClass;
	}
 
	@Override
	public void setTargetClass(final String targetClass) {
		this.targetClass = targetClass; 
	}
 
	@Override
	public String getHasFile() {
		return this.hasFile;
	}
 
	@Override
	public void setHasFile(final String hasFile) {
		this.hasFile = hasFile; 
	}
 
	@Override
	public String getIsRead() {
		return this.isRead;
	}
 
	@Override
	public void setIsRead(final String isRead) {
		this.isRead = isRead; 
	}
 
	@Override
	public String getMail() {
		return this.mail;
	}
 
	@Override
	public void setMail(final String mail) {
		this.mail = mail; 
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
	public String getFileContent() {
		return this.fileContent;
	}
 
	@Override
	public void setFileContent(final String fileContent) {
		this.fileContent = fileContent; 
	}
 
	@Override
	public String getFileName() {
		return this.fileName;
	}
 
	@Override
	public void setFileName(final String fileName) {
		this.fileName = fileName; 
	}
 
}
