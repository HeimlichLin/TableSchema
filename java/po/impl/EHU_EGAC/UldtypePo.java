package com.doc.common.po.impl; 
 
public class UldtypePo implements IUldtypePo {
 
	public enum COLUMNS {
		AIRLINEID("null"), //
		ULDTYPE("null"), //
		ULDWEIGHT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String airlineid;
	private String uldtype;
	private BigDecimal uldweight;

	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getUldtype() {
		return this.uldtype;
	}
 
	@Override
	public void setUldtype(final String uldtype) {
		this.uldtype = uldtype; 
	}
 
	@Override
	public BigDecimal getUldweight() {
		return this.uldweight;
	}
 
	@Override
	public void setUldweight(final BigDecimal uldweight) {
		this.uldweight = uldweight; 
	}
 
}
