package com.doc.common.po.impl; 
 
public class CloudgciBackupPo implements ICloudgciBackupPo {
 
	public enum COLUMNS {
		HWB("null"), //
		WEIGHT("null"), //
		GCIDATE("null"), //
		GCIPIECE("null"), //
		EXPRESSID("null"), //
		FLIGHTNO("null"), //
		FLIGHTDEST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String hwb;
	private BigDecimal weight;
	private java.sql.Timestamp gcidate;
	private BigDecimal gcipiece;
	private String expressid;
	private String flightno;
	private String flightdest;

	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public BigDecimal getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final BigDecimal weight) {
		this.weight = weight; 
	}
 
	@Override
	public java.sql.Timestamp getGcidate() {
		return this.gcidate;
	}
 
	@Override
	public void setGcidate(final java.sql.Timestamp gcidate) {
		this.gcidate = gcidate; 
	}
 
	@Override
	public BigDecimal getGcipiece() {
		return this.gcipiece;
	}
 
	@Override
	public void setGcipiece(final BigDecimal gcipiece) {
		this.gcipiece = gcipiece; 
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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
}
