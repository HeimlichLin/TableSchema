package com.doc.common.po.impl; 
 
public class ImpDeclareInfoPo implements IImpDeclareInfoPo {
 
	public enum COLUMNS {
		FLIGHTNO("艙單-航機班次"), //
		FLIGHTDATE("艙單-班機日期"), //
		MWB("艙單-主號"), //
		DECLAREQTY("艙單-總件數"), //
		SENDRCF("是否已傳送RCF訊息；Y：已傳送，N：未傳送"), //
		SENDDLV("是否已傳送DLV訊息；Y：已傳送，N：未傳送，如果為ModeType=2處理模式，改寫為日期資料"), //
		CHKGCIQTY("傳送時累績點貨總件數"), //
		CRT_DATE("建立時間"), //
		LASTUPDATE("最後異動時間") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String flightno;
	private String flightdate;
	private String mwb;
	private BigDecimal declareqty;
	private String sendrcf;
	private String senddlv;
	private BigDecimal chkgciqty;
	private java.sql.Timestamp crtDate;
	private java.sql.Timestamp lastupdate;

	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final String flightdate) {
		this.flightdate = flightdate; 
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
	public BigDecimal getDeclareqty() {
		return this.declareqty;
	}
 
	@Override
	public void setDeclareqty(final BigDecimal declareqty) {
		this.declareqty = declareqty; 
	}
 
	@Override
	public String getSendrcf() {
		return this.sendrcf;
	}
 
	@Override
	public void setSendrcf(final String sendrcf) {
		this.sendrcf = sendrcf; 
	}
 
	@Override
	public String getSenddlv() {
		return this.senddlv;
	}
 
	@Override
	public void setSenddlv(final String senddlv) {
		this.senddlv = senddlv; 
	}
 
	@Override
	public BigDecimal getChkgciqty() {
		return this.chkgciqty;
	}
 
	@Override
	public void setChkgciqty(final BigDecimal chkgciqty) {
		this.chkgciqty = chkgciqty; 
	}
 
	@Override
	public java.sql.Timestamp getCrtDate() {
		return this.crtDate;
	}
 
	@Override
	public void setCrtDate(final java.sql.Timestamp crtDate) {
		this.crtDate = crtDate; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
}
