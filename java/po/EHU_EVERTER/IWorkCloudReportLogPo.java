package com.doc.common.po; 
 
public interface IWorkCloudReportLogPo {
 
	String getIe();
 
	void setIe(final String ie);
 
	String getWhIo();
 
	void setWhIo(final String whIo);
 
	BigDecimal getSn();
 
	void setSn(final BigDecimal sn);
 
	String getLogdate();
 
	void setLogdate(final String logdate);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getHwb();
 
	void setHwb(final String hwb);
 
	String getEhustarttime();
 
	void setEhustarttime(final String ehustarttime);
 
	String getRdweightstarttime();
 
	void setRdweightstarttime(final String rdweightstarttime);
 
	String getRdweightendtime();
 
	void setRdweightendtime(final String rdweightendtime);
 
	String getSignstarttime();
 
	void setSignstarttime(final String signstarttime);
 
	String getSendwstime();
 
	void setSendwstime(final String sendwstime);
 
	String getReceivewstime();
 
	void setReceivewstime(final String receivewstime);
 
	String getReaddbtime();
 
	void setReaddbtime(final String readdbtime);
 
	String getPrnbarcodestime();
 
	void setPrnbarcodestime(final String prnbarcodestime);
 
	String getPrnbarcodeetime();
 
	void setPrnbarcodeetime(final String prnbarcodeetime);
 
	String getEhuclosetime();
 
	void setEhuclosetime(final String ehuclosetime);
 
	String getClearancetype();
 
	void setClearancetype(final String clearancetype);
 
	String getReplytype();
 
	void setReplytype(final String replytype);
 
	java.sql.Timestamp getCrtDate();
 
	void setCrtDate(final java.sql.Timestamp crtDate);
 
}
