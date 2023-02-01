package com.doc.common.po.impl; 
 
public class T5117xPo implements IT5117xPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		LASTUPDATE("null"), //
		IE("null"), //
		WAREHOUSENO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String controlno;
	private String declno;
	private String mwb;
	private String hwb;
	private java.sql.Timestamp lastupdate;
	private String ie;
	private String warehouseno;

	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
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
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
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
	public String getWarehouseno() {
		return this.warehouseno;
	}
 
	@Override
	public void setWarehouseno(final String warehouseno) {
		this.warehouseno = warehouseno; 
	}
 
}
