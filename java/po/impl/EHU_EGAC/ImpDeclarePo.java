package com.doc.common.po.impl; 
 
public class ImpDeclarePo implements IImpDeclarePo {
 
	public enum COLUMNS {
		EXPRESSID("記帳代號"), //
		FLIGHTNO("艙單班機資訊"), //
		MWB("艙單主號"), //
		DECLARE_NO("艙單項次"), //
		EXPBAGNO("艙單袋號"), //
		DECLARE_PIECE("艙單件數"), //
		CRT_DATE("建立時間"), //
		CRT_USER("使用者建立ID"), //
		MOD_DATE("修改時間"), //
		MOD_USER("使用者修改ID"), //
		DEL_DATE("刪除時間"), //
		DEL_USER("使用者刪除ID"), //
		BAGNO("艙單編號"), //
		FLIGHTDATE("艙單班機日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expressid;
	private String flightno;
	private String mwb;
	private BigDecimal declareNo;
	private String expbagno;
	private BigDecimal declarePiece;
	private java.sql.Timestamp crtDate;
	private String crtUser;
	private java.sql.Timestamp modDate;
	private String modUser;
	private java.sql.Timestamp delDate;
	private String delUser;
	private String bagno;
	private String flightdate;

	@Override
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
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
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public BigDecimal getDeclareNo() {
		return this.declareNo;
	}
 
	@Override
	public void setDeclareNo(final BigDecimal declareNo) {
		this.declareNo = declareNo; 
	}
 
	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public BigDecimal getDeclarePiece() {
		return this.declarePiece;
	}
 
	@Override
	public void setDeclarePiece(final BigDecimal declarePiece) {
		this.declarePiece = declarePiece; 
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
	public String getCrtUser() {
		return this.crtUser;
	}
 
	@Override
	public void setCrtUser(final String crtUser) {
		this.crtUser = crtUser; 
	}
 
	@Override
	public java.sql.Timestamp getModDate() {
		return this.modDate;
	}
 
	@Override
	public void setModDate(final java.sql.Timestamp modDate) {
		this.modDate = modDate; 
	}
 
	@Override
	public String getModUser() {
		return this.modUser;
	}
 
	@Override
	public void setModUser(final String modUser) {
		this.modUser = modUser; 
	}
 
	@Override
	public java.sql.Timestamp getDelDate() {
		return this.delDate;
	}
 
	@Override
	public void setDelDate(final java.sql.Timestamp delDate) {
		this.delDate = delDate; 
	}
 
	@Override
	public String getDelUser() {
		return this.delUser;
	}
 
	@Override
	public void setDelUser(final String delUser) {
		this.delUser = delUser; 
	}
 
	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final String flightdate) {
		this.flightdate = flightdate; 
	}
 
}
