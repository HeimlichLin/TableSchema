package com.doc.common.po.impl; 
 
public class ScraporderPo implements IScraporderPo {
 
	public enum COLUMNS {
		BONDNO("監管編號"), //
		SCRAPNO("報廢單號"), //
		SERIESNO("報廢序號"), //
		SCRAPDATE("報廢日期"), //
		WORKNO("加工單號"), //
		APPLYDATE("申請日期"), //
		APPRVNO("核准文號"), //
		APPRVDATE("核准日期"), //
		SCRAPPLACE("報廢地點"), //
		SCRAPTYPE("報廢方式"), //
		SCRAPSTATUS("報廢狀態"), //
		OPTYPE("營運貨物別"), //
		PRDTTYPE("成品或原料") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
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

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getScrapno() {
		return this.scrapno;
	}
 
	@Override
	public void setScrapno(final String scrapno) {
		this.scrapno = scrapno; 
	}
 
	@Override
	public String getSeriesno() {
		return this.seriesno;
	}
 
	@Override
	public void setSeriesno(final String seriesno) {
		this.seriesno = seriesno; 
	}
 
	@Override
	public java.sql.Timestamp getScrapdate() {
		return this.scrapdate;
	}
 
	@Override
	public void setScrapdate(final java.sql.Timestamp scrapdate) {
		this.scrapdate = scrapdate; 
	}
 
	@Override
	public String getWorkno() {
		return this.workno;
	}
 
	@Override
	public void setWorkno(final String workno) {
		this.workno = workno; 
	}
 
	@Override
	public java.sql.Timestamp getApplydate() {
		return this.applydate;
	}
 
	@Override
	public void setApplydate(final java.sql.Timestamp applydate) {
		this.applydate = applydate; 
	}
 
	@Override
	public String getApprvno() {
		return this.apprvno;
	}
 
	@Override
	public void setApprvno(final String apprvno) {
		this.apprvno = apprvno; 
	}
 
	@Override
	public java.sql.Timestamp getApprvdate() {
		return this.apprvdate;
	}
 
	@Override
	public void setApprvdate(final java.sql.Timestamp apprvdate) {
		this.apprvdate = apprvdate; 
	}
 
	@Override
	public String getScrapplace() {
		return this.scrapplace;
	}
 
	@Override
	public void setScrapplace(final String scrapplace) {
		this.scrapplace = scrapplace; 
	}
 
	@Override
	public String getScraptype() {
		return this.scraptype;
	}
 
	@Override
	public void setScraptype(final String scraptype) {
		this.scraptype = scraptype; 
	}
 
	@Override
	public String getScrapstatus() {
		return this.scrapstatus;
	}
 
	@Override
	public void setScrapstatus(final String scrapstatus) {
		this.scrapstatus = scrapstatus; 
	}
 
	@Override
	public String getOptype() {
		return this.optype;
	}
 
	@Override
	public void setOptype(final String optype) {
		this.optype = optype; 
	}
 
	@Override
	public String getPrdttype() {
		return this.prdttype;
	}
 
	@Override
	public void setPrdttype(final String prdttype) {
		this.prdttype = prdttype; 
	}
 
}
