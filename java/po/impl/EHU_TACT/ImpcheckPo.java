package com.doc.common.po.impl; 
 
public class ImpcheckPo implements IImpcheckPo {
 
	public enum COLUMNS {
		CHECKDATE("null"), //
		CHECKUSER("null"), //
		EXPBAGNO("null"), //
		STATUS("null"), //
		HOLDAREA("null"), //
		SN("null"), //
		CNT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp checkdate;
	private String checkuser;
	private String expbagno;
	private BigDecimal status;
	private String holdarea;
	private BigDecimal sn;
	private BigDecimal cnt;

	@Override
	public java.sql.Timestamp getCheckdate() {
		return this.checkdate;
	}
 
	@Override
	public void setCheckdate(final java.sql.Timestamp checkdate) {
		this.checkdate = checkdate; 
	}
 
	@Override
	public String getCheckuser() {
		return this.checkuser;
	}
 
	@Override
	public void setCheckuser(final String checkuser) {
		this.checkuser = checkuser; 
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
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
	}
 
	@Override
	public String getHoldarea() {
		return this.holdarea;
	}
 
	@Override
	public void setHoldarea(final String holdarea) {
		this.holdarea = holdarea; 
	}
 
	@Override
	public BigDecimal getSn() {
		return this.sn;
	}
 
	@Override
	public void setSn(final BigDecimal sn) {
		this.sn = sn; 
	}
 
	@Override
	public BigDecimal getCnt() {
		return this.cnt;
	}
 
	@Override
	public void setCnt(final BigDecimal cnt) {
		this.cnt = cnt; 
	}
 
}
