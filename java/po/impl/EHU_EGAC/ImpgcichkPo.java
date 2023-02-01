package com.doc.common.po.impl; 
 
public class ImpgcichkPo implements IImpgcichkPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		MWB("null"), //
		EXPBAGNO("null"), //
		CONTAINER("null"), //
		ULDRMK("null"), //
		FLIGHTNO("null"), //
		FLIGHTDATE("null"), //
		INPUTMODE("null"), //
		CHKPIECE("null"), //
		CHKUSER("null"), //
		CHECKDATE("null"), //
		BAGNO("null"), //
		LASTUPDATE("null"), //
		LASTUPUSER("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal uniqueid;
	private String mwb;
	private String expbagno;
	private String container;
	private String uldrmk;
	private String flightno;
	private java.sql.Timestamp flightdate;
	private String inputmode;
	private BigDecimal chkpiece;
	private String chkuser;
	private java.sql.Timestamp checkdate;
	private String bagno;
	private java.sql.Timestamp lastupdate;
	private String lastupuser;

	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
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
	public String getUldrmk() {
		return this.uldrmk;
	}
 
	@Override
	public void setUldrmk(final String uldrmk) {
		this.uldrmk = uldrmk; 
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
	public java.sql.Timestamp getFlightdate() {
		return this.flightdate;
	}
 
	@Override
	public void setFlightdate(final java.sql.Timestamp flightdate) {
		this.flightdate = flightdate; 
	}
 
	@Override
	public String getInputmode() {
		return this.inputmode;
	}
 
	@Override
	public void setInputmode(final String inputmode) {
		this.inputmode = inputmode; 
	}
 
	@Override
	public BigDecimal getChkpiece() {
		return this.chkpiece;
	}
 
	@Override
	public void setChkpiece(final BigDecimal chkpiece) {
		this.chkpiece = chkpiece; 
	}
 
	@Override
	public String getChkuser() {
		return this.chkuser;
	}
 
	@Override
	public void setChkuser(final String chkuser) {
		this.chkuser = chkuser; 
	}
 
	@Override
	public java.sql.Timestamp getCheckdate() {
		return this.checkdate;
	}
 
	@Override
	public void setCheckdate(final java.sql.Timestamp checkdate) {
		this.checkdate = checkdate; 
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
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getLastupuser() {
		return this.lastupuser;
	}
 
	@Override
	public void setLastupuser(final String lastupuser) {
		this.lastupuser = lastupuser; 
	}
 
}
