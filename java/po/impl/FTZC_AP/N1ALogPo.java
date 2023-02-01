package com.doc.common.po.impl; 
 
public class N1ALogPo implements IN1ALogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("檔案名稱"), //
		VERSION("檔案版本"), //
		SEQ_NO("明細順序"), //
		LOG_STATUS("處理狀態"), //
		LOG_RMK("上傳訊息"), //
		RECV_TIME("接收時間"), //
		REF_BILL_NO("參考單號"), //
		ITEM("項次"), //
		OUT_STORAGE_AREA("進出倉儲位") //
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
	private java.sql.Timestamp recvTime;
	private String refBillNo;
	private BigDecimal item;
	private String outStorageArea;

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
	public java.sql.Timestamp getRecvTime() {
		return this.recvTime;
	}
 
	@Override
	public void setRecvTime(final java.sql.Timestamp recvTime) {
		this.recvTime = recvTime; 
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
 
	@Override
	public String getOutStorageArea() {
		return this.outStorageArea;
	}
 
	@Override
	public void setOutStorageArea(final String outStorageArea) {
		this.outStorageArea = outStorageArea; 
	}
 
}
