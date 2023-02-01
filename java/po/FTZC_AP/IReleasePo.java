package com.doc.common.po; 
 
public interface IReleasePo {
 
	String getBoxNo();
 
	void setBoxNo(final String boxNo);
 
	String getDeclType();
 
	void setDeclType(final String declType);
 
	String getDeclNo();
 
	void setDeclNo(final String declNo);
 
	String getStgPlace();
 
	void setStgPlace(final String stgPlace);
 
	java.sql.Timestamp getRlsTime();
 
	void setRlsTime(final java.sql.Timestamp rlsTime);
 
	BigDecimal getRlsPkg();
 
	void setRlsPkg(final BigDecimal rlsPkg);
 
	String getPkgUnit();
 
	void setPkgUnit(final String pkgUnit);
 
	BigDecimal getGWgt();
 
	void setGWgt(final BigDecimal gWgt);
 
	String getExtracond();
 
	void setExtracond(final String extracond);
 
	String getVesselSign();
 
	void setVesselSign(final String vesselSign);
 
	String getVoyageNo();
 
	void setVoyageNo(final String voyageNo);
 
	String getShipCode();
 
	void setShipCode(final String shipCode);
 
	String getExporter();
 
	void setExporter(final String exporter);
 
	String getClearType();
 
	void setClearType(final String clearType);
 
	String getMsgType();
 
	void setMsgType(final String msgType);
 
	String getStrType();
 
	void setStrType(final String strType);
 
	String getTransId();
 
	void setTransId(final String transId);
 
	String getAsType();
 
	void setAsType(final String asType);
 
	String getIoType();
 
	void setIoType(final String ioType);
 
	String getMawbNo();
 
	void setMawbNo(final String mawbNo);
 
	String getHawbNo();
 
	void setHawbNo(final String hawbNo);
 
	BigDecimal getDeclSeqNo();
 
	void setDeclSeqNo(final BigDecimal declSeqNo);
 
}
