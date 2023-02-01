package com.doc.common.po.impl; 
 
public class DhlImprtPo implements IDhlImprtPo {
 
	public enum COLUMNS {
		TAXNO("null"), //
		PRTTIME("null"), //
		SERVER("null"), //
		PRTNO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String taxno;
	private String prttime;
	private String server;
	private String prtno;

	@Override
	public String getTaxno() {
		return this.taxno;
	}
 
	@Override
	public void setTaxno(final String taxno) {
		this.taxno = taxno; 
	}
 
	@Override
	public String getPrttime() {
		return this.prttime;
	}
 
	@Override
	public void setPrttime(final String prttime) {
		this.prttime = prttime; 
	}
 
	@Override
	public String getServer() {
		return this.server;
	}
 
	@Override
	public void setServer(final String server) {
		this.server = server; 
	}
 
	@Override
	public String getPrtno() {
		return this.prtno;
	}
 
	@Override
	public void setPrtno(final String prtno) {
		this.prtno = prtno; 
	}
 
}
