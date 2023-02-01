package com.doc.common.po.impl; 
 
public class L4T1Po implements IL4T1Po {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		CONTROL_NO("上傳檔名"), //
		SERIAL_NO("上傳序號"), //
		SEQ_NO("資料序號"), //
		MSG_FUN("異動別 9:新增 5:修改 1:刪除"), //
		STR_TYPE("進出倉別 1:進倉 2:出倉"), //
		GDS_TYPE("貨物類別"), //
		REF_BILL_NO("參考單號"), //
		CTM_CODE("客戶代碼"), //
		COCOMP_NO("協力廠商編號"), //
		INVTRY_TYPE("成車別"), //
		L4_TIME("上傳時間"), //
		I_CONFIRMED("是否確認"), //
		DECL_SEQ_NO("報單序號(5205使用)") //
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
	private BigDecimal serialNo;
	private BigDecimal seqNo;
	private String msgFun;
	private String strType;
	private String gdsType;
	private String refBillNo;
	private String ctmCode;
	private String cocompNo;
	private String invtryType;
	private java.sql.Timestamp l4Time;
	private String iConfirmed;
	private BigDecimal declSeqNo;

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
	public BigDecimal getSerialNo() {
		return this.serialNo;
	}
 
	@Override
	public void setSerialNo(final BigDecimal serialNo) {
		this.serialNo = serialNo; 
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
	public String getMsgFun() {
		return this.msgFun;
	}
 
	@Override
	public void setMsgFun(final String msgFun) {
		this.msgFun = msgFun; 
	}
 
	@Override
	public String getStrType() {
		return this.strType;
	}
 
	@Override
	public void setStrType(final String strType) {
		this.strType = strType; 
	}
 
	@Override
	public String getGdsType() {
		return this.gdsType;
	}
 
	@Override
	public void setGdsType(final String gdsType) {
		this.gdsType = gdsType; 
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
	public String getCtmCode() {
		return this.ctmCode;
	}
 
	@Override
	public void setCtmCode(final String ctmCode) {
		this.ctmCode = ctmCode; 
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
	public String getInvtryType() {
		return this.invtryType;
	}
 
	@Override
	public void setInvtryType(final String invtryType) {
		this.invtryType = invtryType; 
	}
 
	@Override
	public java.sql.Timestamp getL4Time() {
		return this.l4Time;
	}
 
	@Override
	public void setL4Time(final java.sql.Timestamp l4Time) {
		this.l4Time = l4Time; 
	}
 
	@Override
	public String getIConfirmed() {
		return this.iConfirmed;
	}
 
	@Override
	public void setIConfirmed(final String iConfirmed) {
		this.iConfirmed = iConfirmed; 
	}
 
	@Override
	public BigDecimal getDeclSeqNo() {
		return this.declSeqNo;
	}
 
	@Override
	public void setDeclSeqNo(final BigDecimal declSeqNo) {
		this.declSeqNo = declSeqNo; 
	}
 
}
