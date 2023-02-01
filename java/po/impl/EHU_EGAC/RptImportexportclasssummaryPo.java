package com.doc.common.po.impl; 
 
public class RptImportexportclasssummaryPo implements IRptImportexportclasssummaryPo {
 
	public enum COLUMNS {
		UNIQUEID("null"), //
		TRANID("null"), //
		EXPRESSID("null"), //
		EXPRESSCNAME("null"), //
		C1PIECE("null"), //
		C2PIECE("null"), //
		C3PIECE("null"), //
		TOTALPIECE("null"), //
		C1WEIGHT("null"), //
		C2WEIGHT("null"), //
		C3WEIGHT("null"), //
		TOTALWEIGHT("null"), //
		C1FEE("null"), //
		C2FEE("null"), //
		C3FEE("null"), //
		TOTALFEE("null"), //
		CREATEDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal uniqueid;
	private BigDecimal tranid;
	private String expressid;
	private String expresscname;
	private BigDecimal c1piece;
	private BigDecimal c2piece;
	private BigDecimal c3piece;
	private BigDecimal totalpiece;
	private BigDecimal c1weight;
	private BigDecimal c2weight;
	private BigDecimal c3weight;
	private BigDecimal totalweight;
	private BigDecimal c1fee;
	private BigDecimal c2fee;
	private BigDecimal c3fee;
	private BigDecimal totalfee;
	private java.sql.Timestamp createdate;

	@Override
	public BigDecimal getUniqueid() {
		return this.uniqueid;
	}
 
	@Override
	public void setUniqueid(final BigDecimal uniqueid) {
		this.uniqueid = uniqueid; 
	}
 
	@Override
	public BigDecimal getTranid() {
		return this.tranid;
	}
 
	@Override
	public void setTranid(final BigDecimal tranid) {
		this.tranid = tranid; 
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
	public String getExpresscname() {
		return this.expresscname;
	}
 
	@Override
	public void setExpresscname(final String expresscname) {
		this.expresscname = expresscname; 
	}
 
	@Override
	public BigDecimal getC1piece() {
		return this.c1piece;
	}
 
	@Override
	public void setC1piece(final BigDecimal c1piece) {
		this.c1piece = c1piece; 
	}
 
	@Override
	public BigDecimal getC2piece() {
		return this.c2piece;
	}
 
	@Override
	public void setC2piece(final BigDecimal c2piece) {
		this.c2piece = c2piece; 
	}
 
	@Override
	public BigDecimal getC3piece() {
		return this.c3piece;
	}
 
	@Override
	public void setC3piece(final BigDecimal c3piece) {
		this.c3piece = c3piece; 
	}
 
	@Override
	public BigDecimal getTotalpiece() {
		return this.totalpiece;
	}
 
	@Override
	public void setTotalpiece(final BigDecimal totalpiece) {
		this.totalpiece = totalpiece; 
	}
 
	@Override
	public BigDecimal getC1weight() {
		return this.c1weight;
	}
 
	@Override
	public void setC1weight(final BigDecimal c1weight) {
		this.c1weight = c1weight; 
	}
 
	@Override
	public BigDecimal getC2weight() {
		return this.c2weight;
	}
 
	@Override
	public void setC2weight(final BigDecimal c2weight) {
		this.c2weight = c2weight; 
	}
 
	@Override
	public BigDecimal getC3weight() {
		return this.c3weight;
	}
 
	@Override
	public void setC3weight(final BigDecimal c3weight) {
		this.c3weight = c3weight; 
	}
 
	@Override
	public BigDecimal getTotalweight() {
		return this.totalweight;
	}
 
	@Override
	public void setTotalweight(final BigDecimal totalweight) {
		this.totalweight = totalweight; 
	}
 
	@Override
	public BigDecimal getC1fee() {
		return this.c1fee;
	}
 
	@Override
	public void setC1fee(final BigDecimal c1fee) {
		this.c1fee = c1fee; 
	}
 
	@Override
	public BigDecimal getC2fee() {
		return this.c2fee;
	}
 
	@Override
	public void setC2fee(final BigDecimal c2fee) {
		this.c2fee = c2fee; 
	}
 
	@Override
	public BigDecimal getC3fee() {
		return this.c3fee;
	}
 
	@Override
	public void setC3fee(final BigDecimal c3fee) {
		this.c3fee = c3fee; 
	}
 
	@Override
	public BigDecimal getTotalfee() {
		return this.totalfee;
	}
 
	@Override
	public void setTotalfee(final BigDecimal totalfee) {
		this.totalfee = totalfee; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
}
