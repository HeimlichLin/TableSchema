package com.doc.common.po; 
 
public interface IT5171LockPo {
 
	String getWdate();
 
	void setWdate(final String wdate);
 
	String getWtime();
 
	void setWtime(final String wtime);
 
	String getTtype();
 
	void setTtype(final String ttype);
 
	String getImportationdate();
 
	void setImportationdate(final String importationdate);
 
	String getMwb();
 
	void setMwb(final String mwb);
 
	String getFlightno();
 
	void setFlightno(final String flightno);
 
	String getPkghwb();
 
	void setPkghwb(final String pkghwb);
 
	String getPkghwbqty();
 
	void setPkghwbqty(final String pkghwbqty);
 
	String getPkgbagweight();
 
	void setPkgbagweight(final String pkgbagweight);
 
	String getPkgbagpce();
 
	void setPkgbagpce(final String pkgbagpce);
 
	String getPkgbagno();
 
	void setPkgbagno(final String pkgbagno);
 
	java.sql.Timestamp getLockdate();
 
	void setLockdate(final java.sql.Timestamp lockdate);
 
	String getLockuser();
 
	void setLockuser(final String lockuser);
 
	String getSenddate();
 
	void setSenddate(final String senddate);
 
	java.sql.Timestamp getPrintdate();
 
	void setPrintdate(final java.sql.Timestamp printdate);
 
}
