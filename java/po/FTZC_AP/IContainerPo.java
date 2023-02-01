package com.doc.common.po; 
 
public interface IContainerPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getPassNo();
 
	void setPassNo(final String passNo);
 
	String getPassDate();
 
	void setPassDate(final String passDate);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getContrNo();
 
	void setContrNo(final String contrNo);
 
	String getPcontrNo();
 
	void setPcontrNo(final String pcontrNo);
 
	String getContrType();
 
	void setContrType(final String contrType);
 
	String getTransMode();
 
	void setTransMode(final String transMode);
 
	String getSealNo();
 
	void setSealNo(final String sealNo);
 
	String getShSealNo();
 
	void setShSealNo(final String shSealNo);
 
	String getPlatNo();
 
	void setPlatNo(final String platNo);
 
	java.sql.Timestamp getOutTime();
 
	void setOutTime(final java.sql.Timestamp outTime);
 
	java.sql.Timestamp getInTime();
 
	void setInTime(final java.sql.Timestamp inTime);
 
	String getCarComp();
 
	void setCarComp(final String carComp);
 
	String getCarNo();
 
	void setCarNo(final String carNo);
 
	String getDriver();
 
	void setDriver(final String driver);
 
	String getDrvlNo();
 
	void setDrvlNo(final String drvlNo);
 
	String getCnStatus();
 
	void setCnStatus(final String cnStatus);
 
	String getPackCode();
 
	void setPackCode(final String packCode);
 
	String getDestPort();
 
	void setDestPort(final String destPort);
 
	BigDecimal getCntGross();
 
	void setCntGross(final BigDecimal cntGross);
 
	String getListNo();
 
	void setListNo(final String listNo);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
}
