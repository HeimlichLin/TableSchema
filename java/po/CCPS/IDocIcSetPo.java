package com.doc.common.po; 
 
public interface IDocIcSetPo {
 
	String getDocType();
 
	void setDocType(final String docType);
 
	String getDocNo();
 
	void setDocNo(final String docNo);
 
	String getId();
 
	void setId(final String id);
 
	String getName();
 
	void setName(final String name);
 
	String getCompName();
 
	void setCompName(final String compName);
 
	String getPhoto();
 
	void setPhoto(final String photo);
 
	String getIcNo();
 
	void setIcNo(final String icNo);
 
	java.sql.Timestamp getValidDeadLine();
 
	void setValidDeadLine(final java.sql.Timestamp validDeadLine);
 
	String getSuspendMark();
 
	void setSuspendMark(final String suspendMark);
 
	java.sql.Timestamp getSuspendDtS();
 
	void setSuspendDtS(final java.sql.Timestamp suspendDtS);
 
	java.sql.Timestamp getSuspendDtE();
 
	void setSuspendDtE(final java.sql.Timestamp suspendDtE);
 
}
