package com.doc.common.po; 
 
public interface IGcotempOldPo {
 
	BigDecimal getSn();
 
	void setSn(final BigDecimal sn);
 
	String getIe();
 
	void setIe(final String ie);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getGcodate();
 
	void setGcodate(final String gcodate);
 
	String getResultCode();
 
	void setResultCode(final String resultCode);
 
	String getResultMsg();
 
	void setResultMsg(final String resultMsg);
 
	String getExtraCondition();
 
	void setExtraCondition(final String extraCondition);
 
	String getSendStatus();
 
	void setSendStatus(final String sendStatus);
 
	BigDecimal getSendQty();
 
	void setSendQty(final BigDecimal sendQty);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getContainer();
 
	void setContainer(final String container);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getFlightdest();
 
	void setFlightdest(final String flightdest);
 
	String getChws();
 
	void setChws(final String chws);
 
	String getIsRead();
 
	void setIsRead(final String isRead);
 
	String getIsMigration();
 
	void setIsMigration(final String isMigration);
 
	String getUserid();
 
	void setUserid(final String userid);
 
	java.sql.Timestamp getCrtDate();
 
	void setCrtDate(final java.sql.Timestamp crtDate);
 
	java.sql.Timestamp getUptDt();
 
	void setUptDt(final java.sql.Timestamp uptDt);
 
}
