package com.doc.common.po.impl; 
 
public class WorkpreexpPo implements IWorkpreexpPo {
 
	public enum COLUMNS {
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		BOXNO("null"), //
		CLEARANCETYPE("null"), //
		PIECE("null"), //
		UNIT("null"), //
		WEIGHT("null"), //
		EXPRESSID("null"), //
		AIRLINEID("null"), //
		FLIGHTNO("null"), //
		LASTUPDATE("null"), //
		DATAUSER("null"), //
		DATADATE("null"), //
		CLEARANCEUSER("null"), //
		CLEARANCEDATE("null"), //
		PORTUSER("null"), //
		PORTDATE("null"), //
		CLOSEMARK("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declno;
	private String mwb;
	private String hwb;
	private String boxno;
	private String clearancetype;
	private BigDecimal piece;
	private String unit;
	private BigDecimal weight;
	private String expressid;
	private String airlineid;
	private String flightno;
	private java.sql.Timestamp lastupdate;
	private String datauser;
	private java.sql.Timestamp datadate;
	private String clearanceuser;
	private java.sql.Timestamp clearancedate;
	private String portuser;
	private java.sql.Timestamp portdate;
	private String closemark;

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
	public String getBoxno() {
		return this.boxno;
	}
 
	@Override
	public void setBoxno(final String boxno) {
		this.boxno = boxno; 
	}
 
	@Override
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public String getExpressid() {
		return this.expressid;
	}
 
	@Override
	public void setExpressid(final String expressid) {
		this.expressid = expressid; 
	}
 
	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
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
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getDatauser() {
		return this.datauser;
	}
 
	@Override
	public void setDatauser(final String datauser) {
		this.datauser = datauser; 
	}
 
	@Override
	public java.sql.Timestamp getDatadate() {
		return this.datadate;
	}
 
	@Override
	public void setDatadate(final java.sql.Timestamp datadate) {
		this.datadate = datadate; 
	}
 
	@Override
	public String getClearanceuser() {
		return this.clearanceuser;
	}
 
	@Override
	public void setClearanceuser(final String clearanceuser) {
		this.clearanceuser = clearanceuser; 
	}
 
	@Override
	public java.sql.Timestamp getClearancedate() {
		return this.clearancedate;
	}
 
	@Override
	public void setClearancedate(final java.sql.Timestamp clearancedate) {
		this.clearancedate = clearancedate; 
	}
 
	@Override
	public String getPortuser() {
		return this.portuser;
	}
 
	@Override
	public void setPortuser(final String portuser) {
		this.portuser = portuser; 
	}
 
	@Override
	public java.sql.Timestamp getPortdate() {
		return this.portdate;
	}
 
	@Override
	public void setPortdate(final java.sql.Timestamp portdate) {
		this.portdate = portdate; 
	}
 
	@Override
	public String getClosemark() {
		return this.closemark;
	}
 
	@Override
	public void setClosemark(final String closemark) {
		this.closemark = closemark; 
	}
 
}
