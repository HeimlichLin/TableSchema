package com.doc.common.po.impl; 
 
public class IndeclarLogPo implements IIndeclarLogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("檔案名稱"), //
		LOG_RMK("上傳訊息"), //
		PROC_TIME("接收時間"), //
		O_DECL_NO("原報單號碼") //
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
	private String controlNo;
	private String logRmk;
	private String procTime;
	private String oDeclNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
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
	public String getLogRmk() {
		return this.logRmk;
	}
 
	@Override
	public void setLogRmk(final String logRmk) {
		this.logRmk = logRmk; 
	}
 
	@Override
	public String getProcTime() {
		return this.procTime;
	}
 
	@Override
	public void setProcTime(final String procTime) {
		this.procTime = procTime; 
	}
 
	@Override
	public String getODeclNo() {
		return this.oDeclNo;
	}
 
	@Override
	public void setODeclNo(final String oDeclNo) {
		this.oDeclNo = oDeclNo; 
	}
 
}
