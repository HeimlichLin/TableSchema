package com.doc.common.po.impl; 
 
public class UldreportPo implements IUldreportPo {
 
	public enum COLUMNS {
		SEALNO("null"), //
		FLIGHTDATE("null"), //
		FLIGHTNO("null"), //
		ULDNO("null"), //
		ULDTYPE("null"), //
		ULDVOL("null"), //
		MAXLOAD("null"), //
		ULDWEIGHT("null"), //
		PESIZE("null"), //
		PETOP("null"), //
		PEBUTTON("null"), //
		REMARK("null"), //
		USERID("null"), //
		ULDTIME("null"), //
		ULDSTATIC("null"), //
		AUTOFAXSTA("null"), //
		ULDBAS("null"), //
		WORKAREA("null"), //
		STARTLOAD("null"), //
		LOAD("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sealno;
	private java.sql.Timestamp flightdate;
	private String flightno;
	private String uldno;
	private String uldtype;
	private String uldvol;
	private BigDecimal maxload;
	private BigDecimal uldweight;
	private String pesize;
	private String petop;
	private String pebutton;
	private String remark;
	private String userid;
	private java.sql.Timestamp uldtime;
	private String uldstatic;
	private String autofaxsta;
	private String uldbas;
	private String workarea;
	private String startload;
	private BigDecimal load;

	@Override
	public String getSealno() {
		return this.sealno;
	}
 
	@Override
	public void setSealno(final String sealno) {
		this.sealno = sealno; 
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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getUldno() {
		return this.uldno;
	}
 
	@Override
	public void setUldno(final String uldno) {
		this.uldno = uldno; 
	}
 
	@Override
	public String getUldtype() {
		return this.uldtype;
	}
 
	@Override
	public void setUldtype(final String uldtype) {
		this.uldtype = uldtype; 
	}
 
	@Override
	public String getUldvol() {
		return this.uldvol;
	}
 
	@Override
	public void setUldvol(final String uldvol) {
		this.uldvol = uldvol; 
	}
 
	@Override
	public BigDecimal getMaxload() {
		return this.maxload;
	}
 
	@Override
	public void setMaxload(final BigDecimal maxload) {
		this.maxload = maxload; 
	}
 
	@Override
	public BigDecimal getUldweight() {
		return this.uldweight;
	}
 
	@Override
	public void setUldweight(final BigDecimal uldweight) {
		this.uldweight = uldweight; 
	}
 
	@Override
	public String getPesize() {
		return this.pesize;
	}
 
	@Override
	public void setPesize(final String pesize) {
		this.pesize = pesize; 
	}
 
	@Override
	public String getPetop() {
		return this.petop;
	}
 
	@Override
	public void setPetop(final String petop) {
		this.petop = petop; 
	}
 
	@Override
	public String getPebutton() {
		return this.pebutton;
	}
 
	@Override
	public void setPebutton(final String pebutton) {
		this.pebutton = pebutton; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
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
	public java.sql.Timestamp getUldtime() {
		return this.uldtime;
	}
 
	@Override
	public void setUldtime(final java.sql.Timestamp uldtime) {
		this.uldtime = uldtime; 
	}
 
	@Override
	public String getUldstatic() {
		return this.uldstatic;
	}
 
	@Override
	public void setUldstatic(final String uldstatic) {
		this.uldstatic = uldstatic; 
	}
 
	@Override
	public String getAutofaxsta() {
		return this.autofaxsta;
	}
 
	@Override
	public void setAutofaxsta(final String autofaxsta) {
		this.autofaxsta = autofaxsta; 
	}
 
	@Override
	public String getUldbas() {
		return this.uldbas;
	}
 
	@Override
	public void setUldbas(final String uldbas) {
		this.uldbas = uldbas; 
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
	public String getStartload() {
		return this.startload;
	}
 
	@Override
	public void setStartload(final String startload) {
		this.startload = startload; 
	}
 
	@Override
	public BigDecimal getLoad() {
		return this.load;
	}
 
	@Override
	public void setLoad(final BigDecimal load) {
		this.load = load; 
	}
 
}
