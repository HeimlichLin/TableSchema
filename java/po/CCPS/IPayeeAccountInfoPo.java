package com.doc.common.po; 
 
public interface IPayeeAccountInfoPo {
 
	String getPayeeNo();
 
	void setPayeeNo(final String payeeNo);
 
	String getPayeeName();
 
	void setPayeeName(final String payeeName);
 
	String getPayeeEmail();
 
	void setPayeeEmail(final String payeeEmail);
 
	String getPayeeBank();
 
	void setPayeeBank(final String payeeBank);
 
	String getPayeeBranch();
 
	void setPayeeBranch(final String payeeBranch);
 
	String getPayeeAccount();
 
	void setPayeeAccount(final String payeeAccount);
 
	String getUpdateUser();
 
	void setUpdateUser(final String updateUser);
 
	java.sql.Timestamp getUpdateDate();
 
	void setUpdateDate(final java.sql.Timestamp updateDate);
 
}
