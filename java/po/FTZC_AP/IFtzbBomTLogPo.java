package com.doc.common.po; 
 
public interface IFtzbBomTLogPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getBomfile();
 
	void setBomfile(final String bomfile);
 
	String getBomdate();
 
	void setBomdate(final String bomdate);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getPartno();
 
	void setPartno(final String partno);
 
	String getBomstatus();
 
	void setBomstatus(final String bomstatus);
 
	String getBommsg();
 
	void setBommsg(final String bommsg);
 
	String getRecvdate();
 
	void setRecvdate(final String recvdate);
 
	String getCocompno();
 
	void setCocompno(final String cocompno);
 
	BigDecimal getSeqno();
 
	void setSeqno(final BigDecimal seqno);
 
	BigDecimal getSerialno();
 
	void setSerialno(final BigDecimal serialno);
 
}
