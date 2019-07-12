package com.doc.common.bean; 
 
public class ScraporderDo { 
 
	public enum COLUMNS { 
		BONDNO("null"), 
		SCRAPNO("null"), 
		SERIESNO("null"), 
		SCRAPDATE("null"), 
		WORKNO("null"), 
		APPLYDATE("null"), 
		APPRVNO("null"), 
		APPRVDATE("null"), 
		SCRAPPLACE("null"), 
		SCRAPTYPE("null"), 
		SCRAPSTATUS("null"), 
		OPTYPE("null"), 
		PRDTTYPE("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String bondno; 
	private String scrapno; 
	private String seriesno; 
	private java.sql.Timestamp scrapdate; 
	private String workno; 
	private java.sql.Timestamp applydate; 
	private String apprvno; 
	private java.sql.Timestamp apprvdate; 
	private String scrapplace; 
	private String scraptype; 
	private String scrapstatus; 
	private String optype; 
	private String prdttype; 
	
	public String getBondno() { 
		return bondno; 
	} 
 
	public void setBondno(String bondno) { 
		this.bondno = bondno; 
	} 
 
	public String getScrapno() { 
		return scrapno; 
	} 
 
	public void setScrapno(String scrapno) { 
		this.scrapno = scrapno; 
	} 
 
	public String getSeriesno() { 
		return seriesno; 
	} 
 
	public void setSeriesno(String seriesno) { 
		this.seriesno = seriesno; 
	} 
 
	public java.sql.Timestamp getScrapdate() { 
		return scrapdate; 
	} 
 
	public void setScrapdate(java.sql.Timestamp scrapdate) { 
		this.scrapdate = scrapdate; 
	} 
 
	public String getWorkno() { 
		return workno; 
	} 
 
	public void setWorkno(String workno) { 
		this.workno = workno; 
	} 
 
	public java.sql.Timestamp getApplydate() { 
		return applydate; 
	} 
 
	public void setApplydate(java.sql.Timestamp applydate) { 
		this.applydate = applydate; 
	} 
 
	public String getApprvno() { 
		return apprvno; 
	} 
 
	public void setApprvno(String apprvno) { 
		this.apprvno = apprvno; 
	} 
 
	public java.sql.Timestamp getApprvdate() { 
		return apprvdate; 
	} 
 
	public void setApprvdate(java.sql.Timestamp apprvdate) { 
		this.apprvdate = apprvdate; 
	} 
 
	public String getScrapplace() { 
		return scrapplace; 
	} 
 
	public void setScrapplace(String scrapplace) { 
		this.scrapplace = scrapplace; 
	} 
 
	public String getScraptype() { 
		return scraptype; 
	} 
 
	public void setScraptype(String scraptype) { 
		this.scraptype = scraptype; 
	} 
 
	public String getScrapstatus() { 
		return scrapstatus; 
	} 
 
	public void setScrapstatus(String scrapstatus) { 
		this.scrapstatus = scrapstatus; 
	} 
 
	public String getOptype() { 
		return optype; 
	} 
 
	public void setOptype(String optype) { 
		this.optype = optype; 
	} 
 
	public String getPrdttype() { 
		return prdttype; 
	} 
 
	public void setPrdttype(String prdttype) { 
		this.prdttype = prdttype; 
	} 
 
} 
