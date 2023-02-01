package com.doc.common.po.impl; 
 
public class BomTLogPo implements IBomTLogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		BOM_FILE("檔案名稱"), //
		BOM_DATE("生產線日期"), //
		PRDT_NO("成品編號"), //
		PART_NO("原料號碼"), //
		BOM_STATUS("狀態代碼"), //
		BOM_MSG("訊息狀態"), //
		RECV_DATE("接收時間"), //
		COCOMP_NO("協力廠商"), //
		SEQ_NO("建檔順序"), //
		SERIAL_NO("檔案版本") //
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
	private String bomFile;
	private String bomDate;
	private String prdtNo;
	private String partNo;
	private String bomStatus;
	private String bomMsg;
	private String recvDate;
	private String cocompNo;
	private BigDecimal seqNo;
	private BigDecimal serialNo;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getBomFile() {
		return this.bomFile;
	}
 
	@Override
	public void setBomFile(final String bomFile) {
		this.bomFile = bomFile; 
	}
 
	@Override
	public String getBomDate() {
		return this.bomDate;
	}
 
	@Override
	public void setBomDate(final String bomDate) {
		this.bomDate = bomDate; 
	}
 
	@Override
	public String getPrdtNo() {
		return this.prdtNo;
	}
 
	@Override
	public void setPrdtNo(final String prdtNo) {
		this.prdtNo = prdtNo; 
	}
 
	@Override
	public String getPartNo() {
		return this.partNo;
	}
 
	@Override
	public void setPartNo(final String partNo) {
		this.partNo = partNo; 
	}
 
	@Override
	public String getBomStatus() {
		return this.bomStatus;
	}
 
	@Override
	public void setBomStatus(final String bomStatus) {
		this.bomStatus = bomStatus; 
	}
 
	@Override
	public String getBomMsg() {
		return this.bomMsg;
	}
 
	@Override
	public void setBomMsg(final String bomMsg) {
		this.bomMsg = bomMsg; 
	}
 
	@Override
	public String getRecvDate() {
		return this.recvDate;
	}
 
	@Override
	public void setRecvDate(final String recvDate) {
		this.recvDate = recvDate; 
	}
 
	@Override
	public String getCocompNo() {
		return this.cocompNo;
	}
 
	@Override
	public void setCocompNo(final String cocompNo) {
		this.cocompNo = cocompNo; 
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
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final BigDecimal serialNo) {
		this.serialNo = serialNo; 
	}
 
}
