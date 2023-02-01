package com.doc.common.po; 
 
public interface ISitadlvPo {
 
	String getAwb();
 
	void setAwb(final String awb);
 
	String getFlightdate();
 
	void setFlightdate(final String flightdate);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	BigDecimal getPc();
 
	void setPc(final BigDecimal pc);
 
	String getProcess();
 
	void setProcess(final String process);
 
	String getProcesstime();
 
	void setProcesstime(final String processtime);
 
	BigDecimal getInpc();
 
	void setInpc(final BigDecimal inpc);
 
}
