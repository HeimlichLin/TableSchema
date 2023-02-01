package com.doc.common.po.impl; 
 
public class ObculdPo implements IObculdPo {
 
	public enum COLUMNS {
		FLIGHTNO("null"), //
		FLIGHTDATE("null"), //
		FLIGHTDEST("null"), //
		OBCMAWB("null"), //
		CONTAINER("null"), //
		USERID("null"), //
		OBCDATE("null"), //
		WORKAREA("null"), //
		ULDFLAG("null"), //
		PIECE("null") //
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
	private java.sql.Timestamp flightdate;
	private String flightdest;
	private String obcmawb;
	private String container;
	private String userid;
	private java.sql.Timestamp obcdate;
	private String workarea;
	private java.sql.Timestamp uldflag;
	private String piece;

	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public java.sql.Timestamp getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final java.sql.Timestamp flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
	@Override
	public String getObcmawb() {
		return this.obcmawb;
	}
 
	@Override
	public void setObcmawb(final String obcmawb) {
		this.obcmawb = obcmawb; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public String getUserid() {
		return this.userid;
	}
 
	@Override
	public void setUserid(final String userid) {
		this.userid = userid; 
	}
 
	@Override
	public java.sql.Timestamp getObcdate() {
		return this.obcdate;
	}
 
	@Override
	public void setObcdate(final java.sql.Timestamp obcdate) {
		this.obcdate = obcdate; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
	@Override
	public java.sql.Timestamp getUldflag() {
		return this.uldflag;
	}
 
	@Override
	public void setUldflag(final java.sql.Timestamp uldflag) {
		this.uldflag = uldflag; 
	}
 
	@Override
	public String getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final String piece) {
		this.piece = piece; 
	}
 
}
