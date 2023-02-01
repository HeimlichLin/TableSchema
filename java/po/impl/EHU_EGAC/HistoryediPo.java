package com.doc.common.po.impl; 
 
public class HistoryediPo implements IHistoryediPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		PIECE("null"), //
		WEIGHT("null"), //
		RELEASEDATE("null"), //
		RELEASETIME("null"), //
		LASTUPDATE("null"), //
		CLEARANCETYPE("null"), //
		TRANSTYPE("null"), //
		MESSAGETYPE("null"), //
		DUTYNO("null"), //
		IE("null"), //
		GCIWEIGHT("null"), //
		DUTYPAYMENT("null") //
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
	private BigDecimal piece;
	private BigDecimal weight;
	private String releasedate;
	private String releasetime;
	private java.sql.Timestamp lastupdate;
	private String clearancetype;
	private String transtype;
	private String messagetype;
	private String dutyno;
	private String ie;
	private BigDecimal gciweight;
	private String dutypayment;

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
	public BigDecimal getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final BigDecimal piece) {
		this.piece = piece; 
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
	public String getReleasedate() {
		return this.releasedate;
	}
 
	@Override
	public void setReleasedate(final String releasedate) {
		this.releasedate = releasedate; 
	}
 
	@Override
	public String getReleasetime() {
		return this.releasetime;
	}
 
	@Override
	public void setReleasetime(final String releasetime) {
		this.releasetime = releasetime; 
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
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public String getTranstype() {
		return this.transtype;
	}
 
	@Override
	public void setTranstype(final String transtype) {
		this.transtype = transtype; 
	}
 
	@Override
	public String getMessagetype() {
		return this.messagetype;
	}
 
	@Override
	public void setMessagetype(final String messagetype) {
		this.messagetype = messagetype; 
	}
 
	@Override
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
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
	public BigDecimal getGciweight() {
		return this.gciweight;
	}
 
	@Override
	public void setGciweight(final BigDecimal gciweight) {
		this.gciweight = gciweight; 
	}
 
	@Override
	public String getDutypayment() {
		return this.dutypayment;
	}
 
	@Override
	public void setDutypayment(final String dutypayment) {
		this.dutypayment = dutypayment; 
	}
 
}
