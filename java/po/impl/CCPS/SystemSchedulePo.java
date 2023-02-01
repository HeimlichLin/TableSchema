package com.doc.common.po.impl; 
 
public class SystemSchedulePo implements ISystemSchedulePo {
 
	public enum COLUMNS {
		SERVICE_NAME("服務名稱"), //
		STATUS("狀態"), //
		EXECUTION_INTERVAL("執行區間"), //
		UPDATE_FREQUENCY("更新頻率"), //
		LAST_UPDATE_TIME("最後更新時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String serviceName;
	private String status;
	private String executionInterval;
	private String updateFrequency;
	private java.sql.Timestamp lastUpdateTime;

	@Override
	public String getServiceName() {
		return this.serviceName;
	}
 
	@Override
	public void setServiceName(final String serviceName) {
		this.serviceName = serviceName; 
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
	public String getExecutionInterval() {
		return this.executionInterval;
	}
 
	@Override
	public void setExecutionInterval(final String executionInterval) {
		this.executionInterval = executionInterval; 
	}
 
	@Override
	public String getUpdateFrequency() {
		return this.updateFrequency;
	}
 
	@Override
	public void setUpdateFrequency(final String updateFrequency) {
		this.updateFrequency = updateFrequency; 
	}
 
	@Override
	public java.sql.Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}
 
	@Override
	public void setLastUpdateTime(final java.sql.Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime; 
	}
 
}
