package com.doc.common.po.impl; 
 
public class DiscountPo implements IDiscountPo {
 
	public enum COLUMNS {
		BDATE("null"), //
		EDATE("null"), //
		KEYVALUE("null"), //
		KEYTYPE("null"), //
		RATE("null"), //
		CDATE("null"), //
		ROUNDTYPE("null"), //
		MINWEIGHT("null"), //
		ACCTYPE("null"), //
		MDATE("null"), //
		LASTUPDATE("null"), //
		LDATE("null"), //
		DISCOUNTBOX("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp bdate;
	private java.sql.Timestamp edate;
	private String keyvalue;
	private String keytype;
	private BigDecimal rate;
	private java.sql.Timestamp cdate;
	private BigDecimal roundtype;
	private BigDecimal minweight;
	private String acctype;
	private java.sql.Timestamp mdate;
	private java.sql.Timestamp lastupdate;
	private java.sql.Timestamp ldate;
	private String discountbox;

	@Override
	public java.sql.Timestamp getBdate() {
		return this.bdate;
	}
 
	@Override
	public void setBdate(final java.sql.Timestamp bdate) {
		this.bdate = bdate; 
	}
 
	@Override
	public java.sql.Timestamp getEdate() {
		return this.edate;
	}
 
	@Override
	public void setEdate(final java.sql.Timestamp edate) {
		this.edate = edate; 
	}
 
	@Override
	public String getKeyvalue() {
		return this.keyvalue;
	}
 
	@Override
	public void setKeyvalue(final String keyvalue) {
		this.keyvalue = keyvalue; 
	}
 
	@Override
	public String getKeytype() {
		return this.keytype;
	}
 
	@Override
	public void setKeytype(final String keytype) {
		this.keytype = keytype; 
	}
 
	@Override
	public BigDecimal getRate() {
		return this.rate;
	}
 
	@Override
	public void setRate(final BigDecimal rate) {
		this.rate = rate; 
	}
 
	@Override
	public java.sql.Timestamp getCdate() {
		return this.cdate;
	}
 
	@Override
	public void setCdate(final java.sql.Timestamp cdate) {
		this.cdate = cdate; 
	}
 
	@Override
	public BigDecimal getRoundtype() {
		return this.roundtype;
	}
 
	@Override
	public void setRoundtype(final BigDecimal roundtype) {
		this.roundtype = roundtype; 
	}
 
	@Override
	public BigDecimal getMinweight() {
		return this.minweight;
	}
 
	@Override
	public void setMinweight(final BigDecimal minweight) {
		this.minweight = minweight; 
	}
 
	@Override
	public String getAcctype() {
		return this.acctype;
	}
 
	@Override
	public void setAcctype(final String acctype) {
		this.acctype = acctype; 
	}
 
	@Override
	public java.sql.Timestamp getMdate() {
		return this.mdate;
	}
 
	@Override
	public void setMdate(final java.sql.Timestamp mdate) {
		this.mdate = mdate; 
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
	public java.sql.Timestamp getLdate() {
		return this.ldate;
	}
 
	@Override
	public void setLdate(final java.sql.Timestamp ldate) {
		this.ldate = ldate; 
	}
 
	@Override
	public String getDiscountbox() {
		return this.discountbox;
	}
 
	@Override
	public void setDiscountbox(final String discountbox) {
		this.discountbox = discountbox; 
	}
 
}
