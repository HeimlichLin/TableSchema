package com.doc.common.po.impl; 
 
public class L5LogPo implements IL5LogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("檔案名稱"), //
		VERSION("檔案版本"), //
		SEQ_NO("明細順序"), //
		LOG_STATUS("處理狀態"), //
		LOG_RMK("上傳訊息"), //
		L5_TIME("接收時間"), //
		MSG_FUN("異動別 9:新增 5:修改 1:刪除"), //
		REF_BILL_NO("參考單號"), //
		ITEM("項次") //
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
	private BigDecimal version;
	private BigDecimal seqNo;
	private String logStatus;
	private String logRmk;
	private java.sql.Timestamp l5Time;
	private String msgFun;
	private String refBillNo;
	private BigDecimal item;

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
	public BigDecimal getVersion() {
		return this.version;
	}
 
	@Override
	public void setVersion(final BigDecimal version) {
		this.version = version; 
	}
 
	@Override
	public BigDecimal getSeqNo() {
		return this.seqNo;
	}
 
	@Override
	public void setSeqNo(final BigDecimal seqNo) {
		this.seqNo = seqNo; 
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
	public String getLogRmk() {
		return this.logRmk;
	}
 
	@Override
	public void setLogRmk(final String logRmk) {
		this.logRmk = logRmk; 
	}
 
	@Override
	public java.sql.Timestamp getL5Time() {
		return this.l5Time;
	}
 
	@Override
	public void setL5Time(final java.sql.Timestamp l5Time) {
		this.l5Time = l5Time; 
	}
 
	@Override
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
	}
 
	@Override
	public String getRefBillNo() {
		return this.refBillNo;
	}
 
	@Override
	public void setRefBillNo(final String refBillNo) {
		this.refBillNo = refBillNo; 
	}
 
	@Override
	public BigDecimal getItem() {
		return this.item;
	}
 
	@Override
	public void setItem(final BigDecimal item) {
		this.item = item; 
	}
 
}
