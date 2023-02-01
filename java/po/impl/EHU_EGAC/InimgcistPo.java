package com.doc.common.po.impl; 
 
public class InimgcistPo implements IInimgcistPo {
 
	public enum COLUMNS {
		TTYPE("null"), //
		INDICATOR("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		GCIPIECE("null"), //
		GCIWEIGHT("null"), //
		CLEARANCETYPE("null"), //
		GCIDATE("null") //
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
	private String gcipiece;
	private String gciweight;
	private String clearancetype;
	private String gcidate;

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
	public String getGcipiece() {
		return this.gcipiece;
	}
 
	@Override
	public void setGcipiece(final String gcipiece) {
		this.gcipiece = gcipiece; 
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
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public String getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final String gcidate) {
		this.gcidate = gcidate; 
	}
 
}
