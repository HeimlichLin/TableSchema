package com.doc.common.po.impl; 
 
public class T5171LockPo implements IT5171LockPo {
 
	public enum COLUMNS {
		WDATE("null"), //
		WTIME("null"), //
		TTYPE("null"), //
		IMPORTATIONDATE("null"), //
		MWB("null"), //
		FLIGHTNO("null"), //
		PKGHWB("null"), //
		PKGHWBQTY("null"), //
		PKGBAGWEIGHT("null"), //
		PKGBAGPCE("null"), //
		PKGBAGNO("null"), //
		LOCKDATE("null"), //
		LOCKUSER("null"), //
		SENDDATE("null"), //
		PRINTDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String wdate;
	private String wtime;
	private String ttype;
	private String importationdate;
	private String mwb;
	private String flightno;
	private String pkghwb;
	private String pkghwbqty;
	private String pkgbagweight;
	private String pkgbagpce;
	private String pkgbagno;
	private java.sql.Timestamp lockdate;
	private String lockuser;
	private String senddate;
	private java.sql.Timestamp printdate;

	@Override
	public String getWdate() {
		return this.wdate;
	}
 
	@Override
	public void setWdate(final String wdate) {
		this.wdate = wdate; 
	}
 
	@Override
	public String getWtime() {
		return this.wtime;
	}
 
	@Override
	public void setWtime(final String wtime) {
		this.wtime = wtime; 
	}
 
	@Override
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getImportationdate() {
		return this.importationdate;
	}
 
	@Override
	public void setImportationdate(final String importationdate) {
		this.importationdate = importationdate; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getPkghwb() {
		return this.pkghwb;
	}
 
	@Override
	public void setPkghwb(final String pkghwb) {
		this.pkghwb = pkghwb; 
	}
 
	@Override
	public String getPkghwbqty() {
		return this.pkghwbqty;
	}
 
	@Override
	public void setPkghwbqty(final String pkghwbqty) {
		this.pkghwbqty = pkghwbqty; 
	}
 
	@Override
	public String getPkgbagweight() {
		return this.pkgbagweight;
	}
 
	@Override
	public void setPkgbagweight(final String pkgbagweight) {
		this.pkgbagweight = pkgbagweight; 
	}
 
	@Override
	public String getPkgbagpce() {
		return this.pkgbagpce;
	}
 
	@Override
	public void setPkgbagpce(final String pkgbagpce) {
		this.pkgbagpce = pkgbagpce; 
	}
 
	@Override
	public String getPkgbagno() {
		return this.pkgbagno;
	}
 
	@Override
	public void setPkgbagno(final String pkgbagno) {
		this.pkgbagno = pkgbagno; 
	}
 
	@Override
	public java.sql.Timestamp getLockdate() {
		return this.lockdate;
	}
 
	@Override
	public void setLockdate(final java.sql.Timestamp lockdate) {
		this.lockdate = lockdate; 
	}
 
	@Override
	public String getLockuser() {
		return this.lockuser;
	}
 
	@Override
	public void setLockuser(final String lockuser) {
		this.lockuser = lockuser; 
	}
 
	@Override
	public String getSenddate() {
		return this.senddate;
	}
 
	@Override
	public void setSenddate(final String senddate) {
		this.senddate = senddate; 
	}
 
	@Override
	public java.sql.Timestamp getPrintdate() {
		return this.printdate;
	}
 
	@Override
	public void setPrintdate(final java.sql.Timestamp printdate) {
		this.printdate = printdate; 
	}
 
}
