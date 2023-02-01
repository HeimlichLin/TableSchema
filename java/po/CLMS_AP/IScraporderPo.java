package com.doc.common.po; 
 
public interface IScraporderPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getScrapno();
 
	void setScrapno(final String scrapno);
 
	String getSeriesno();
 
	void setSeriesno(final String seriesno);
 
	java.sql.Timestamp getScrapdate();
 
	void setScrapdate(final java.sql.Timestamp scrapdate);
 
	String getWorkno();
 
	void setWorkno(final String workno);
 
	java.sql.Timestamp getApplydate();
 
	void setApplydate(final java.sql.Timestamp applydate);
 
	String getApprvno();
 
	void setApprvno(final String apprvno);
 
	java.sql.Timestamp getApprvdate();
 
	void setApprvdate(final java.sql.Timestamp apprvdate);
 
	String getScrapplace();
 
	void setScrapplace(final String scrapplace);
 
	String getScraptype();
 
	void setScraptype(final String scraptype);
 
	String getScrapstatus();
 
	void setScrapstatus(final String scrapstatus);
 
	String getOptype();
 
	void setOptype(final String optype);
 
	String getPrdttype();
 
	void setPrdttype(final String prdttype);
 
}
