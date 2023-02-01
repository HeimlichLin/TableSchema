package com.doc.common.po; 
 
public interface IWorkexpuldPo {
 
	String getContainer();
 
	void setContainer(final String container);
 
	java.sql.Timestamp getCreatedate();
 
	void setCreatedate(final java.sql.Timestamp createdate);
 
	BigDecimal getTotalweight();
 
	void setTotalweight(final BigDecimal totalweight);
 
	String getUpdateuser();
 
	void setUpdateuser(final String updateuser);
 
	java.sql.Timestamp getLastupdate();
 
	void setLastupdate(final java.sql.Timestamp lastupdate);
 
	java.sql.Timestamp getSendtime();
 
	void setSendtime(final java.sql.Timestamp sendtime);
 
	String getWorkarea();
 
	void setWorkarea(final String workarea);
 
}
