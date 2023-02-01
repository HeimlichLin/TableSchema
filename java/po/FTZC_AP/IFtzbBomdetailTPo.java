package com.doc.common.po; 
 
public interface IFtzbBomdetailTPo {
 
	String getBondno();
 
	void setBondno(final String bondno);
 
	String getCtmcode();
 
	void setCtmcode(final String ctmcode);
 
	String getPrdtno();
 
	void setPrdtno(final String prdtno);
 
	String getPartno();
 
	void setPartno(final String partno);
 
	String getPartname();
 
	void setPartname(final String partname);
 
	BigDecimal getUnitqty();
 
	void setUnitqty(final BigDecimal unitqty);
 
	String getUnit();
 
	void setUnit(final String unit);
 
	String getBegindate();
 
	void setBegindate(final String begindate);
 
	String getEnddate();
 
	void setEnddate(final String enddate);
 
	String getPrdttype();
 
	void setPrdttype(final String prdttype);
 
	String getRecvdate();
 
	void setRecvdate(final String recvdate);
 
	String getBomfile();
 
	void setBomfile(final String bomfile);
 
	String getBomno();
 
	void setBomno(final String bomno);
 
	BigDecimal getSeqno();
 
	void setSeqno(final BigDecimal seqno);
 
}
