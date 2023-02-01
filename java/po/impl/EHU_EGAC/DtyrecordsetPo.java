package com.doc.common.po.impl; 
 
public class DtyrecordsetPo implements IDtyrecordsetPo {
 
	public enum COLUMNS {
		DTYN("null"), //
		MB("null"), //
		HB("null"), //
		PU("null"), //
		USU("null"), //
		PT("null"), //
		WS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dtyn;
	private String mb;
	private String hb;
	private String pu;
	private String usu;
	private String pt;
	private String ws;

	@Override
	public String getDtyn() {
		return this.dtyn;
	}
 
	@Override
	public void setDtyn(final String dtyn) {
		this.dtyn = dtyn; 
	}
 
	@Override
	public String getMb() {
		return this.mb;
	}
 
	@Override
	public void setMb(final String mb) {
		this.mb = mb; 
	}
 
	@Override
	public String getHb() {
		return this.hb;
	}
 
	@Override
	public void setHb(final String hb) {
		this.hb = hb; 
	}
 
	@Override
	public String getPu() {
		return this.pu;
	}
 
	@Override
	public void setPu(final String pu) {
		this.pu = pu; 
	}
 
	@Override
	public String getUsu() {
		return this.usu;
	}
 
	@Override
	public void setUsu(final String usu) {
		this.usu = usu; 
	}
 
	@Override
	public String getPt() {
		return this.pt;
	}
 
	@Override
	public void setPt(final String pt) {
		this.pt = pt; 
	}
 
	@Override
	public String getWs() {
		return this.ws;
	}
 
	@Override
	public void setWs(final String ws) {
		this.ws = ws; 
	}
 
}
