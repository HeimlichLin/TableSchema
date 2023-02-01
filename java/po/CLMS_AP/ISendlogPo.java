package com.doc.common.po; 
 
public interface ISendlogPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getDeclno();
 
	void setDeclno(final String declno);
 
	String getStrtype();
 
	void setStrtype(final String strtype);
 
	String getSendflag();
 
	void setSendflag(final String sendflag);
 
	String getControlno();
 
	void setControlno(final String controlno);
 
	java.sql.Timestamp getSendtime();
 
	void setSendtime(final java.sql.Timestamp sendtime);
 
	String getMsgfun();
 
	void setMsgfun(final String msgfun);
 
	String getMsgtype();
 
	void setMsgtype(final String msgtype);
 
	String getAstype();
 
	void setAstype(final String astype);
 
}
