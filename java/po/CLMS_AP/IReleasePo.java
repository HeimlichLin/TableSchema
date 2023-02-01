package com.doc.common.po; 
 
public interface IReleasePo {
 
	String getBoxno();
 
	void setBoxno(final String boxno);
 
	String getDecltype();
 
	void setDecltype(final String decltype);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getStgplace();
 
	void setStgplace(final String stgplace);
 
	java.sql.Timestamp getRlstime();
 
	void setRlstime(final java.sql.Timestamp rlstime);
 
	BigDecimal getRlspkg();
 
	void setRlspkg(final BigDecimal rlspkg);
 
	String getPkgunit();
 
	void setPkgunit(final String pkgunit);
 
	BigDecimal getGwgt();
 
	void setGwgt(final BigDecimal gwgt);
 
	String getExtracond();
 
	void setExtracond(final String extracond);
 
	String getVesselsign();
 
	void setVesselsign(final String vesselsign);
 
	String getVoyageno();
 
	void setVoyageno(final String voyageno);
 
	String getShipcode();
 
	void setShipcode(final String shipcode);
 
	String getExporter();
 
	void setExporter(final String exporter);
 
	String getCleartype();
 
	void setCleartype(final String cleartype);
 
	String getMsgtype();
 
	void setMsgtype(final String msgtype);
 
	String getStrtype();
 
	void setStrtype(final String strtype);
 
	String getAstype();
 
	void setAstype(final String astype);
 
	String getMawbno();
 
	void setMawbno(final String mawbno);
 
	String getHawbno();
 
	void setHawbno(final String hawbno);
 
	BigDecimal getUnrlspkg();
 
	void setUnrlspkg(final BigDecimal unrlspkg);
 
	String getUnpkgunit();
 
	void setUnpkgunit(final String unpkgunit);
 
}
