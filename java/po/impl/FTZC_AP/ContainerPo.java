package com.doc.common.po.impl; 
 
public class ContainerPo implements IContainerPo {
 
	public enum COLUMNS {
		BF_NO("null"), //
		PASS_NO("null"), //
		PASS_DATE("null"), //
		DECL_NO("null"), //
		CONTR_NO("null"), //
		PCONTR_NO("null"), //
		CONTR_TYPE("null"), //
		TRANS_MODE("null"), //
		SEAL_NO("null"), //
		SH_SEAL_NO("null"), //
		PLAT_NO("null"), //
		OUT_TIME("null"), //
		IN_TIME("null"), //
		CAR_COMP("null"), //
		CAR_NO("null"), //
		DRIVER("null"), //
		DRVL_NO("null"), //
		CN_STATUS("null"), //
		PACK_CODE("null"), //
		DEST_PORT("null"), //
		CNT_GROSS("null"), //
		LIST_NO("null"), //
		MSG_TYPE("null") //
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
	private String passNo;
	private String passDate;
	private String declNo;
	private String contrNo;
	private String pcontrNo;
	private String contrType;
	private String transMode;
	private String sealNo;
	private String shSealNo;
	private String platNo;
	private java.sql.Timestamp outTime;
	private java.sql.Timestamp inTime;
	private String carComp;
	private String carNo;
	private String driver;
	private String drvlNo;
	private String cnStatus;
	private String packCode;
	private String destPort;
	private BigDecimal cntGross;
	private String listNo;
	private String msgType;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getPassNo() {
		return this.passNo;
	}
 
	@Override
	public void setPassNo(final String passNo) {
		this.passNo = passNo; 
	}
 
	@Override
	public String getPassDate() {
		return this.passDate;
	}
 
	@Override
	public void setPassDate(final String passDate) {
		this.passDate = passDate; 
	}
 
	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public String getContrNo() {
		return this.contrNo;
	}
 
	@Override
	public void setContrNo(final String contrNo) {
		this.contrNo = contrNo; 
	}
 
	@Override
	public String getPcontrNo() {
		return this.pcontrNo;
	}
 
	@Override
	public void setPcontrNo(final String pcontrNo) {
		this.pcontrNo = pcontrNo; 
	}
 
	@Override
	public String getContrType() {
		return this.contrType;
	}
 
	@Override
	public void setContrType(final String contrType) {
		this.contrType = contrType; 
	}
 
	@Override
	public String getTransMode() {
		return this.transMode;
	}
 
	@Override
	public void setTransMode(final String transMode) {
		this.transMode = transMode; 
	}
 
	@Override
	public String getSealNo() {
		return this.sealNo;
	}
 
	@Override
	public void setSealNo(final String sealNo) {
		this.sealNo = sealNo; 
	}
 
	@Override
	public String getShSealNo() {
		return this.shSealNo;
	}
 
	@Override
	public void setShSealNo(final String shSealNo) {
		this.shSealNo = shSealNo; 
	}
 
	@Override
	public String getPlatNo() {
		return this.platNo;
	}
 
	@Override
	public void setPlatNo(final String platNo) {
		this.platNo = platNo; 
	}
 
	@Override
	public java.sql.Timestamp getOutTime() {
		return this.outTime;
	}
 
	@Override
	public void setOutTime(final java.sql.Timestamp outTime) {
		this.outTime = outTime; 
	}
 
	@Override
	public java.sql.Timestamp getInTime() {
		return this.inTime;
	}
 
	@Override
	public void setInTime(final java.sql.Timestamp inTime) {
		this.inTime = inTime; 
	}
 
	@Override
	public String getCarComp() {
		return this.carComp;
	}
 
	@Override
	public void setCarComp(final String carComp) {
		this.carComp = carComp; 
	}
 
	@Override
	public String getCarNo() {
		return this.carNo;
	}
 
	@Override
	public void setCarNo(final String carNo) {
		this.carNo = carNo; 
	}
 
	@Override
	public String getDriver() {
		return this.driver;
	}
 
	@Override
	public void setDriver(final String driver) {
		this.driver = driver; 
	}
 
	@Override
	public String getDrvlNo() {
		return this.drvlNo;
	}
 
	@Override
	public void setDrvlNo(final String drvlNo) {
		this.drvlNo = drvlNo; 
	}
 
	@Override
	public String getCnStatus() {
		return this.cnStatus;
	}
 
	@Override
	public void setCnStatus(final String cnStatus) {
		this.cnStatus = cnStatus; 
	}
 
	@Override
	public String getPackCode() {
		return this.packCode;
	}
 
	@Override
	public void setPackCode(final String packCode) {
		this.packCode = packCode; 
	}
 
	@Override
	public String getDestPort() {
		return this.destPort;
	}
 
	@Override
	public void setDestPort(final String destPort) {
		this.destPort = destPort; 
	}
 
	@Override
	public BigDecimal getCntGross() {
		return this.cntGross;
	}
 
	@Override
	public void setCntGross(final BigDecimal cntGross) {
		this.cntGross = cntGross; 
	}
 
	@Override
	public String getListNo() {
		return this.listNo;
	}
 
	@Override
	public void setListNo(final String listNo) {
		this.listNo = listNo; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
}
