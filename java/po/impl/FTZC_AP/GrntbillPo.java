package com.doc.common.po.impl; 
 
public class GrntbillPo implements IGrntbillPo {
 
	public enum COLUMNS {
		BF_NO("監管編號"), //
		DEPOSIT_MEMO_NO("繳納單號"), //
		DEPOSIT_START_DATE("繳納日期"), //
		DEPOSIT_AMT("保證金額"), //
		DEPOSIT_END_DATE("保證金截止日"), //
		DEPOSIT_MEMO("備註說明"), //
		USER_ID("建置者/異動者") //
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
	private String depositMemoNo;
	private String depositStartDate;
	private BigDecimal depositAmt;
	private String depositEndDate;
	private String depositMemo;
	private String userId;

	@Override
	public String getBfNo() {
		return this.bfNo;
	}
 
	@Override
	public void setBfNo(final String bfNo) {
		this.bfNo = bfNo; 
	}
 
	@Override
	public String getDepositMemoNo() {
		return this.depositMemoNo;
	}
 
	@Override
	public void setDepositMemoNo(final String depositMemoNo) {
		this.depositMemoNo = depositMemoNo; 
	}
 
	@Override
	public String getDepositStartDate() {
		return this.depositStartDate;
	}
 
	@Override
	public void setDepositStartDate(final String depositStartDate) {
		this.depositStartDate = depositStartDate; 
	}
 
	@Override
	public BigDecimal getDepositAmt() {
		return this.depositAmt;
	}
 
	@Override
	public void setDepositAmt(final BigDecimal depositAmt) {
		this.depositAmt = depositAmt; 
	}
 
	@Override
	public String getDepositEndDate() {
		return this.depositEndDate;
	}
 
	@Override
	public void setDepositEndDate(final String depositEndDate) {
		this.depositEndDate = depositEndDate; 
	}
 
	@Override
	public String getDepositMemo() {
		return this.depositMemo;
	}
 
	@Override
	public void setDepositMemo(final String depositMemo) {
		this.depositMemo = depositMemo; 
	}
 
	@Override
	public String getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final String userId) {
		this.userId = userId; 
	}
 
}
