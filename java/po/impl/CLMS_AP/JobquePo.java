package com.doc.common.po.impl; 
 
public class JobquePo implements IJobquePo {
 
	public enum COLUMNS {
		TRANACTION_ID("交易序號"), //
		JOB_ID("產生程式"), //
		CREATE_TIME("建立日期"), //
		EXECUTE_TIME("寄件時間"), //
		MESSAGE("訊息"), //
		STAUTS("狀態(W:等待執行 E:異常 S:成功)") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String tranactionId;
	private String jobId;
	private String createTime;
	private String executeTime;
	private String message;
	private String stauts;

	@Override
	public String getTranactionId() {
		return this.tranactionId;
	}
 
	@Override
	public void setTranactionId(final String tranactionId) {
		this.tranactionId = tranactionId; 
	}
 
	@Override
	public String getJobId() {
		return this.jobId;
	}
 
	@Override
	public void setJobId(final String jobId) {
		this.jobId = jobId; 
	}
 
	@Override
	public String getCreateTime() {
		return this.createTime;
	}
 
	@Override
	public void setCreateTime(final String createTime) {
		this.createTime = createTime; 
	}
 
	@Override
	public String getExecuteTime() {
		return this.executeTime;
	}
 
	@Override
	public void setExecuteTime(final String executeTime) {
		this.executeTime = executeTime; 
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
	public String getStauts() {
		return this.stauts;
	}
 
	@Override
	public void setStauts(final String stauts) {
		this.stauts = stauts; 
	}
 
}
