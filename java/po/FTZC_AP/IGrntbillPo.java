package com.doc.common.po; 
 
public interface IGrntbillPo {
 
	String getBfNo();
 
	void setBfNo(final String bfNo);
 
	String getDepositMemoNo();
 
	void setDepositMemoNo(final String depositMemoNo);
 
	String getDepositStartDate();
 
	void setDepositStartDate(final String depositStartDate);
 
	BigDecimal getDepositAmt();
 
	void setDepositAmt(final BigDecimal depositAmt);
 
	String getDepositEndDate();
 
	void setDepositEndDate(final String depositEndDate);
 
	String getDepositMemo();
 
	void setDepositMemo(final String depositMemo);
 
	String getUserId();
 
	void setUserId(final String userId);
 
}
