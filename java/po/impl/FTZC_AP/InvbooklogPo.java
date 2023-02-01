package com.doc.common.po.impl; 
 
public class InvbooklogPo implements IInvbooklogPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		INV_YEAR("結算年度"), //
		INV_DATE("盤點日期"), //
		USER_ID("執行者"), //
		INV_START_DATE("盤點起始日"), //
		INV_END_DATE("盤點結束日"), //
		LOG_DATM("null"), //
		INV_TYPE("盤點類別 1：區內盤點，2：區外盤點，3：區間盤點") //
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
	private String invYear;
	private String invDate;
	private String userId;
	private String invStartDate;
	private String invEndDate;
	private String logDatm;
	private String invType;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getInvYear() {
		return this.invYear;
	}
 
	@Override
	public void setInvYear(final String invYear) {
		this.invYear = invYear; 
	}
 
	@Override
	public String getInvDate() {
		return this.invDate;
	}
 
	@Override
	public void setInvDate(final String invDate) {
		this.invDate = invDate; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getInvStartDate() {
		return this.invStartDate;
	}
 
	@Override
	public void setInvStartDate(final String invStartDate) {
		this.invStartDate = invStartDate; 
	}
 
	@Override
	public String getInvEndDate() {
		return this.invEndDate;
	}
 
	@Override
	public void setInvEndDate(final String invEndDate) {
		this.invEndDate = invEndDate; 
	}
 
	@Override
	public String getLogDatm() {
		return this.logDatm;
	}
 
	@Override
	public void setLogDatm(final String logDatm) {
		this.logDatm = logDatm; 
	}
 
	@Override
	public String getInvType() {
		return this.invType;
	}
 
	@Override
	public void setInvType(final String invType) {
		this.invType = invType; 
	}
 
}
