package com.doc.common.po.impl; 
 
public class TmpOutdetailPo implements ITmpOutdetailPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		PRDTNO("null"), //
		OUTUNIT("null"), //
		OUTQTY("null"), //
		DECLTYPE("null"), //
		IDECLTYPE("null"), //
		PROCESS("null"), //
		BOMRATE("null"), //
		SESSIONID("null"), //
		PARTNO("null"), //
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
	private String outunit;
	private BigDecimal outqty;
	private String decltype;
	private String idecltype;
	private String process;
	private BigDecimal bomrate;
	private String sessionid;
	private String partno;
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
	public String getOutunit() {
		return this.outunit;
	}
 
	@Override
	public void setOutunit(final String outunit) {
		this.outunit = outunit; 
	}
 
	@Override
	public BigDecimal getOutqty() {
		return this.outqty;
	}
 
	@Override
	public void setOutqty(final BigDecimal outqty) {
		this.outqty = outqty; 
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
	public String getIdecltype() {
		return this.idecltype;
	}
 
	@Override
	public void setIdecltype(final String idecltype) {
		this.idecltype = idecltype; 
	}
 
	@Override
	public String getProcess() {
		return this.process;
	}
 
	@Override
	public void setProcess(final String process) {
		this.process = process; 
	}
 
	@Override
	public BigDecimal getBomrate() {
		return this.bomrate;
	}
 
	@Override
	public void setBomrate(final BigDecimal bomrate) {
		this.bomrate = bomrate; 
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
	public String getPartno() {
		return this.partno;
	}
 
	@Override
	public void setPartno(final String partno) {
		this.partno = partno; 
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
