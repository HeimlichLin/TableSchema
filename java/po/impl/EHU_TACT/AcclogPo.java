package com.doc.common.po.impl; 
 
public class AcclogPo implements IAcclogPo {
 
	public enum COLUMNS {
		LOGUSERID("null"), //
		LOGDATE("null"), //
		EXPRESSID("null"), //
		OLDBASEREF("null"), //
		OLDCURRENTTOTOAL("null"), //
		OLDBASELINE("null"), //
		ADDCURRENT("null"), //
		NEWBASEREF("null"), //
		NEWCURRENTTOTAL("null"), //
		NEWBASELINE("null"), //
		LOGTYPE("null"), //
		VRADDCURRENT("null"), //
		VRACCOUNT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String loguserid;
	private java.sql.Timestamp logdate;
	private String expressid;
	private BigDecimal oldbaseref;
	private BigDecimal oldcurrenttotoal;
	private BigDecimal oldbaseline;
	private BigDecimal addcurrent;
	private BigDecimal newbaseref;
	private BigDecimal newcurrenttotal;
	private BigDecimal newbaseline;
	private String logtype;
	private BigDecimal vraddcurrent;
	private String vraccount;

	@Override
	public String getLoguserid() {
		return this.loguserid;
	}
 
	@Override
	public void setLoguserid(final String loguserid) {
		this.loguserid = loguserid; 
	}
 
	@Override
	public java.sql.Timestamp getLogdate() {
		return this.logdate;
	}
 
	@Override
	public void setLogdate(final java.sql.Timestamp logdate) {
		this.logdate = logdate; 
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
	public BigDecimal getOldbaseref() {
		return this.oldbaseref;
	}
 
	@Override
	public void setOldbaseref(final BigDecimal oldbaseref) {
		this.oldbaseref = oldbaseref; 
	}
 
	@Override
	public BigDecimal getOldcurrenttotoal() {
		return this.oldcurrenttotoal;
	}
 
	@Override
	public void setOldcurrenttotoal(final BigDecimal oldcurrenttotoal) {
		this.oldcurrenttotoal = oldcurrenttotoal; 
	}
 
	@Override
	public BigDecimal getOldbaseline() {
		return this.oldbaseline;
	}
 
	@Override
	public void setOldbaseline(final BigDecimal oldbaseline) {
		this.oldbaseline = oldbaseline; 
	}
 
	@Override
	public BigDecimal getAddcurrent() {
		return this.addcurrent;
	}
 
	@Override
	public void setAddcurrent(final BigDecimal addcurrent) {
		this.addcurrent = addcurrent; 
	}
 
	@Override
	public BigDecimal getNewbaseref() {
		return this.newbaseref;
	}
 
	@Override
	public void setNewbaseref(final BigDecimal newbaseref) {
		this.newbaseref = newbaseref; 
	}
 
	@Override
	public BigDecimal getNewcurrenttotal() {
		return this.newcurrenttotal;
	}
 
	@Override
	public void setNewcurrenttotal(final BigDecimal newcurrenttotal) {
		this.newcurrenttotal = newcurrenttotal; 
	}
 
	@Override
	public BigDecimal getNewbaseline() {
		return this.newbaseline;
	}
 
	@Override
	public void setNewbaseline(final BigDecimal newbaseline) {
		this.newbaseline = newbaseline; 
	}
 
	@Override
	public String getLogtype() {
		return this.logtype;
	}
 
	@Override
	public void setLogtype(final String logtype) {
		this.logtype = logtype; 
	}
 
	@Override
	public BigDecimal getVraddcurrent() {
		return this.vraddcurrent;
	}
 
	@Override
	public void setVraddcurrent(final BigDecimal vraddcurrent) {
		this.vraddcurrent = vraddcurrent; 
	}
 
	@Override
	public String getVraccount() {
		return this.vraccount;
	}
 
	@Override
	public void setVraccount(final String vraccount) {
		this.vraccount = vraccount; 
	}
 
}
