package com.doc.common.po.impl; 
 
public class ScrapOrderPo implements IScrapOrderPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		SCRAP_NO("報廢單號碼"), //
		SERIES_NO("報廢序號"), //
		SCRAP_DATE("報廢日期"), //
		APPLY_DATE("申請日期"), //
		APPRV_NO("核准文號"), //
		APPRV_DATE("核准日期"), //
		SCRAP_PLACE("報廢地點"), //
		SCRAP_TYPE("報廢方式"), //
		SCRAP_STATUS("確認狀態"), //
		OP_TYPE("貨物性質"), //
		PRDT_TYPE("貨物狀態") //
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
	private String scrapNo;
	private String seriesNo;
	private String scrapDate;
	private String applyDate;
	private String apprvNo;
	private String apprvDate;
	private String scrapPlace;
	private String scrapType;
	private String scrapStatus;
	private String opType;
	private String prdtType;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getScrapNo() {
		return this.scrapNo;
	}
 
	@Override
	public void setScrapNo(final String scrapNo) {
		this.scrapNo = scrapNo; 
	}
 
	@Override
	public String getSeriesNo() {
		return this.seriesNo;
	}
 
	@Override
	public void setSeriesNo(final String seriesNo) {
		this.seriesNo = seriesNo; 
	}
 
	@Override
	public String getScrapDate() {
		return this.scrapDate;
	}
 
	@Override
	public void setScrapDate(final String scrapDate) {
		this.scrapDate = scrapDate; 
	}
 
	@Override
	public String getApplyDate() {
		return this.applyDate;
	}
 
	@Override
	public void setApplyDate(final String applyDate) {
		this.applyDate = applyDate; 
	}
 
	@Override
	public String getApprvNo() {
		return this.apprvNo;
	}
 
	@Override
	public void setApprvNo(final String apprvNo) {
		this.apprvNo = apprvNo; 
	}
 
	@Override
	public String getApprvDate() {
		return this.apprvDate;
	}
 
	@Override
	public void setApprvDate(final String apprvDate) {
		this.apprvDate = apprvDate; 
	}
 
	@Override
	public String getScrapPlace() {
		return this.scrapPlace;
	}
 
	@Override
	public void setScrapPlace(final String scrapPlace) {
		this.scrapPlace = scrapPlace; 
	}
 
	@Override
	public String getScrapType() {
		return this.scrapType;
	}
 
	@Override
	public void setScrapType(final String scrapType) {
		this.scrapType = scrapType; 
	}
 
	@Override
	public String getScrapStatus() {
		return this.scrapStatus;
	}
 
	@Override
	public void setScrapStatus(final String scrapStatus) {
		this.scrapStatus = scrapStatus; 
	}
 
	@Override
	public String getOpType() {
		return this.opType;
	}
 
	@Override
	public void setOpType(final String opType) {
		this.opType = opType; 
	}
 
	@Override
	public String getPrdtType() {
		return this.prdtType;
	}
 
	@Override
	public void setPrdtType(final String prdtType) {
		this.prdtType = prdtType; 
	}
 
}
