package com.doc.common.po.impl; 
 
public class ServiceLogPo implements IServiceLogPo {
 
	public enum COLUMNS {
		LOG_DATETIME("記錄時間"), //
		LOG_GUID("處理序號"), //
		LOG_TYPE("記錄類別"), //
		LOG_DESC("記錄說明"), //
		LOG_CONTENT("記錄處理訊息"), //
		LOG_SOURCE("記錄來源"), //
		LOG_STATUS("記錄狀態"), //
		LOG_REMARK("備註"), //
		LOG_FILENAME("處理的檔案名稱"), //
		FOOD_REG_NUM("食品登記字號") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String logDatetime;
	private String logGuid;
	private String logType;
	private String logDesc;
	private String logContent;
	private String logSource;
	private String logStatus;
	private String logRemark;
	private String logFilename;
	private String foodRegNum;

	@Override
	public String getLogDatetime() {
		return this.logDatetime;
	}
 
	@Override
	public void setLogDatetime(final String logDatetime) {
		this.logDatetime = logDatetime; 
	}
 
	@Override
	public String getLogGuid() {
		return this.logGuid;
	}
 
	@Override
	public void setLogGuid(final String logGuid) {
		this.logGuid = logGuid; 
	}
 
	@Override
	public String getLogType() {
		return this.logType;
	}
 
	@Override
	public void setLogType(final String logType) {
		this.logType = logType; 
	}
 
	@Override
	public String getLogDesc() {
		return this.logDesc;
	}
 
	@Override
	public void setLogDesc(final String logDesc) {
		this.logDesc = logDesc; 
	}
 
	@Override
	public String getLogContent() {
		return this.logContent;
	}
 
	@Override
	public void setLogContent(final String logContent) {
		this.logContent = logContent; 
	}
 
	@Override
	public String getLogSource() {
		return this.logSource;
	}
 
	@Override
	public void setLogSource(final String logSource) {
		this.logSource = logSource; 
	}
 
	@Override
	public String getLogStatus() {
		return this.logStatus;
	}
 
	@Override
	public void setLogStatus(final String logStatus) {
		this.logStatus = logStatus; 
	}
 
	@Override
	public String getLogRemark() {
		return this.logRemark;
	}
 
	@Override
	public void setLogRemark(final String logRemark) {
		this.logRemark = logRemark; 
	}
 
	@Override
	public String getLogFilename() {
		return this.logFilename;
	}
 
	@Override
	public void setLogFilename(final String logFilename) {
		this.logFilename = logFilename; 
	}
 
	@Override
	public String getFoodRegNum() {
		return this.foodRegNum;
	}
 
	@Override
	public void setFoodRegNum(final String foodRegNum) {
		this.foodRegNum = foodRegNum; 
	}
 
}
