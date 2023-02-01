package com.doc.common.po.impl; 
 
public class WorkimpmwbPo implements IWorkimpmwbPo {
 
	public enum COLUMNS {
		LASTUPDATE("null"), //
		MWB("null"), //
		HWBCOUNT("null"), //
		HWBPIECE("null"), //
		BAGCOUNT("null"), //
		BAGHWB("null"), //
		BAGPIECE("null"), //
		GCIHWBCOUNT("null"), //
		GCIHWBPIECE("null"), //
		GCIBAGCOUNT("null"), //
		GCIBAGHWB("null"), //
		GCIBAGPIECE("null"), //
		WORKING("null"), //
		RELEASE("null"), //
		IE("null"), //
		WORKAREA("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp lastupdate;
	private String mwb;
	private BigDecimal hwbcount;
	private BigDecimal hwbpiece;
	private BigDecimal bagcount;
	private BigDecimal baghwb;
	private BigDecimal bagpiece;
	private BigDecimal gcihwbcount;
	private BigDecimal gcihwbpiece;
	private BigDecimal gcibagcount;
	private BigDecimal gcibaghwb;
	private BigDecimal gcibagpiece;
	private String working;
	private java.sql.Timestamp release;
	private String ie;
	private String workarea;

	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
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
	public BigDecimal getHwbcount() {
		return this.hwbcount;
	}
 
	@Override
	public void setHwbcount(final BigDecimal hwbcount) {
		this.hwbcount = hwbcount; 
	}
 
	@Override
	public BigDecimal getHwbpiece() {
		return this.hwbpiece;
	}
 
	@Override
	public void setHwbpiece(final BigDecimal hwbpiece) {
		this.hwbpiece = hwbpiece; 
	}
 
	@Override
	public BigDecimal getBagcount() {
		return this.bagcount;
	}
 
	@Override
	public void setBagcount(final BigDecimal bagcount) {
		this.bagcount = bagcount; 
	}
 
	@Override
	public BigDecimal getBaghwb() {
		return this.baghwb;
	}
 
	@Override
	public void setBaghwb(final BigDecimal baghwb) {
		this.baghwb = baghwb; 
	}
 
	@Override
	public BigDecimal getBagpiece() {
		return this.bagpiece;
	}
 
	@Override
	public void setBagpiece(final BigDecimal bagpiece) {
		this.bagpiece = bagpiece; 
	}
 
	@Override
	public BigDecimal getGcihwbcount() {
		return this.gcihwbcount;
	}
 
	@Override
	public void setGcihwbcount(final BigDecimal gcihwbcount) {
		this.gcihwbcount = gcihwbcount; 
	}
 
	@Override
	public BigDecimal getGcihwbpiece() {
		return this.gcihwbpiece;
	}
 
	@Override
	public void setGcihwbpiece(final BigDecimal gcihwbpiece) {
		this.gcihwbpiece = gcihwbpiece; 
	}
 
	@Override
	public BigDecimal getGcibagcount() {
		return this.gcibagcount;
	}
 
	@Override
	public void setGcibagcount(final BigDecimal gcibagcount) {
		this.gcibagcount = gcibagcount; 
	}
 
	@Override
	public BigDecimal getGcibaghwb() {
		return this.gcibaghwb;
	}
 
	@Override
	public void setGcibaghwb(final BigDecimal gcibaghwb) {
		this.gcibaghwb = gcibaghwb; 
	}
 
	@Override
	public BigDecimal getGcibagpiece() {
		return this.gcibagpiece;
	}
 
	@Override
	public void setGcibagpiece(final BigDecimal gcibagpiece) {
		this.gcibagpiece = gcibagpiece; 
	}
 
	@Override
	public String getWorking() {
		return this.working;
	}
 
	@Override
	public void setWorking(final String working) {
		this.working = working; 
	}
 
	@Override
	public java.sql.Timestamp getRelease() {
		return this.release;
	}
 
	@Override
	public void setRelease(final java.sql.Timestamp release) {
		this.release = release; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
}
