package com.doc.common.po.impl; 
 
public class InexgcostPo implements IInexgcostPo {
 
	public enum COLUMNS {
		TTYPE("null"), //
		INDICATOR("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		RELEASETIME("null"), //
		RELEASEPIECE("null"), //
		CLEARANCETYPE("null"), //
		GCODATE("null"), //
		GCOPIECE("null"), //
		GCIWEIGHT("null"), //
		FEE("null"), //
		EXPRESSID("null"), //
		FLIGHTNO("null"), //
		CONTAINER("null"), //
		GCOMARK("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ttype;
	private String indicator;
	private String decltype;
	private String declno;
	private String mwb;
	private String hwb;
	private String releasetime;
	private String releasepiece;
	private String clearancetype;
	private String gcodate;
	private String gcopiece;
	private String gciweight;
	private String fee;
	private String expressid;
	private String flightno;
	private String container;
	private String gcomark;

	@Override
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
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
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getReleasetime() {
		return this.releasetime;
	}
 
	@Override
	public void setReleasetime(final String releasetime) {
		this.releasetime = releasetime; 
	}
 
	@Override
	public String getReleasepiece() {
		return this.releasepiece;
	}
 
	@Override
	public void setReleasepiece(final String releasepiece) {
		this.releasepiece = releasepiece; 
	}
 
	@Override
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public String getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final String gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public String getGcopiece() {
		return this.gcopiece;
	}
 
	@Override
	public void setGcopiece(final String gcopiece) {
		this.gcopiece = gcopiece; 
	}
 
	@Override
	public String getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final String gciweight) {
		this.gciweight = gciweight; 
	}
 
	@Override
	public String getFee() {
		return this.fee;
	}
 
	@Override
	public void setFee(final String fee) {
		this.fee = fee; 
	}
 
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
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public String getGcomark() {
		return this.gcomark;
	}
 
	@Override
	public void setGcomark(final String gcomark) {
		this.gcomark = gcomark; 
	}
 
}
