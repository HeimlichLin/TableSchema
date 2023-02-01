package com.doc.common.po; 
 
public interface IWorkorderPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getWorkno();
 
	void setWorkno(final String workno);
 
	String getCtmcode();
 
	void setCtmcode(final String ctmcode);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	BigDecimal getPrdtqty();
 
	void setPrdtqty(final BigDecimal prdtqty);
 
	BigDecimal getRstrqty();
 
	void setRstrqty(final BigDecimal rstrqty);
 
	String getPrdtunit();
 
	void setPrdtunit(final String prdtunit);
 
	String getReqrdate();
 
	void setReqrdate(final String reqrdate);
 
	String getApplydate();
 
	void setApplydate(final String applydate);
 
	String getApprovedno();
 
	void setApprovedno(final String approvedno);
 
	String getApproveddate();
 
	void setApproveddate(final String approveddate);
 
	String getPrdtname();
 
	void setPrdtname(final String prdtname);
 
	String getPrdtspec();
 
	void setPrdtspec(final String prdtspec);
 
	String getProcess();
 
	void setProcess(final String process);
 
	String getD8date();
 
	void setD8date(final String d8date);
 
}
