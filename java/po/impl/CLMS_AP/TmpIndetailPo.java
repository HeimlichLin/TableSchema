package com.doc.common.po.impl; 
 
public class TmpIndetailPo implements ITmpIndetailPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		PRDTNO("null"), //
		INUNIT("null"), //
		RINQTY("null"), //
		DECLTYPE("null"), //
		SESSIONID("null"), //
		OPTYPENME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String prdtno;
	private String inunit;
	private BigDecimal rinqty;
	private String decltype;
	private String sessionid;
	private String optypenme;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getPrdtno() {
		return this.prdtno;
	}
 
	@Override
	public void setPrdtno(final String prdtno) {
		this.prdtno = prdtno; 
	}
 
	@Override
	public String getInunit() {
		return this.inunit;
	}
 
	@Override
	public void setInunit(final String inunit) {
		this.inunit = inunit; 
	}
 
	@Override
	public BigDecimal getRinqty() {
		return this.rinqty;
	}
 
	@Override
	public void setRinqty(final BigDecimal rinqty) {
		this.rinqty = rinqty; 
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
	public String getSessionid() {
		return this.sessionid;
	}
 
	@Override
	public void setSessionid(final String sessionid) {
		this.sessionid = sessionid; 
	}
 
	@Override
	public String getOptypenme() {
		return this.optypenme;
	}
 
	@Override
	public void setOptypenme(final String optypenme) {
		this.optypenme = optypenme; 
	}
 
}
