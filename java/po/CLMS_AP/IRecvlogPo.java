package com.doc.common.po; 
 
public interface IRecvlogPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getRecvtype();
 
	void setRecvtype(final String recvtype);
 
	String getKeyword();
 
	void setKeyword(final String keyword);
 
	String getMsgtype();
 
	void setMsgtype(final String msgtype);
 
	java.sql.Timestamp getProctime();
 
	void setProctime(final java.sql.Timestamp proctime);
 
	BigDecimal getProcstatus();
 
	void setProcstatus(final BigDecimal procstatus);
 
	String getProcrmk();
 
	void setProcrmk(final String procrmk);
 
	String getControlno();
 
	void setControlno(final String controlno);
 
}
