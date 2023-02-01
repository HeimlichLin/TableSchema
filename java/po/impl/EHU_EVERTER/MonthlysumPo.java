package com.doc.common.po.impl; 
 
public class MonthlysumPo implements IMonthlysumPo {
 
	public enum COLUMNS {
		YYMM("null"), //
		BAGTYPE("null"), //
		CUSTYPE("null"), //
		CUSID("null"), //
		EXPCOUNT("null"), //
		EXPPIECE("null"), //
		EXPWEIGHT("null"), //
		IMPCOUNT("null"), //
		IMPPIECE("null"), //
		IMPWEIGHT("null"), //
		TOTCOUNT("null"), //
		TOTPIECE("null"), //
		TOTWEIGHT("null"), //
		TRANSDATE("null"), //
		TRANSUSER("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String yymm;
	private String bagtype;
	private String custype;
	private String cusid;
	private BigDecimal expcount;
	private BigDecimal exppiece;
	private BigDecimal expweight;
	private BigDecimal impcount;
	private BigDecimal imppiece;
	private BigDecimal impweight;
	private BigDecimal totcount;
	private BigDecimal totpiece;
	private BigDecimal totweight;
	private String transdate;
	private String transuser;

	@Override
	public String getYymm() {
		return this.yymm;
	}
 
	@Override
	public void setYymm(final String yymm) {
		this.yymm = yymm; 
	}
 
	@Override
	public String getBagtype() {
		return this.bagtype;
	}
 
	@Override
	public void setBagtype(final String bagtype) {
		this.bagtype = bagtype; 
	}
 
	@Override
	public String getCustype() {
		return this.custype;
	}
 
	@Override
	public void setCustype(final String custype) {
		this.custype = custype; 
	}
 
	@Override
	public String getCusid() {
		return this.cusid;
	}
 
	@Override
	public void setCusid(final String cusid) {
		this.cusid = cusid; 
	}
 
	@Override
	public BigDecimal getExpcount() {
		return this.expcount;
	}
 
	@Override
	public void setExpcount(final BigDecimal expcount) {
		this.expcount = expcount; 
	}
 
	@Override
	public BigDecimal getExppiece() {
		return this.exppiece;
	}
 
	@Override
	public void setExppiece(final BigDecimal exppiece) {
		this.exppiece = exppiece; 
	}
 
	@Override
	public BigDecimal getExpweight() {
		return this.expweight;
	}
 
	@Override
	public void setExpweight(final BigDecimal expweight) {
		this.expweight = expweight; 
	}
 
	@Override
	public BigDecimal getImpcount() {
		return this.impcount;
	}
 
	@Override
	public void setImpcount(final BigDecimal impcount) {
		this.impcount = impcount; 
	}
 
	@Override
	public BigDecimal getImppiece() {
		return this.imppiece;
	}
 
	@Override
	public void setImppiece(final BigDecimal imppiece) {
		this.imppiece = imppiece; 
	}
 
	@Override
	public BigDecimal getImpweight() {
		return this.impweight;
	}
 
	@Override
	public void setImpweight(final BigDecimal impweight) {
		this.impweight = impweight; 
	}
 
	@Override
	public BigDecimal getTotcount() {
		return this.totcount;
	}
 
	@Override
	public void setTotcount(final BigDecimal totcount) {
		this.totcount = totcount; 
	}
 
	@Override
	public BigDecimal getTotpiece() {
		return this.totpiece;
	}
 
	@Override
	public void setTotpiece(final BigDecimal totpiece) {
		this.totpiece = totpiece; 
	}
 
	@Override
	public BigDecimal getTotweight() {
		return this.totweight;
	}
 
	@Override
	public void setTotweight(final BigDecimal totweight) {
		this.totweight = totweight; 
	}
 
	@Override
	public String getTransdate() {
		return this.transdate;
	}
 
	@Override
	public void setTransdate(final String transdate) {
		this.transdate = transdate; 
	}
 
	@Override
	public String getTransuser() {
		return this.transuser;
	}
 
	@Override
	public void setTransuser(final String transuser) {
		this.transuser = transuser; 
	}
 
}
