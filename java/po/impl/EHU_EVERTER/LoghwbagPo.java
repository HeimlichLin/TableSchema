package com.doc.common.po.impl; 
 
public class LoghwbagPo implements ILoghwbagPo {
 
	public enum COLUMNS {
		HWB_BAGNO("null"), //
		HWB_HWB("null"), //
		HWB_MWB("null"), //
		HWB_EXPBAGNO("null"), //
		HWB_DECLNO("null"), //
		HWB_DELTYPE("null"), //
		HWB_PIECE("null"), //
		HWB_GCIWEIGHT("null"), //
		HWB_GCIDATE1("null"), //
		HWB_GCIDATE2("null"), //
		HWB_GCODATE1("null"), //
		HWB_GCODATE2("null"), //
		HWB_LASTUPDATE("null"), //
		BAG_BAGHWB("null"), //
		BAG_BAGPIECE("null"), //
		BAG_BAGWEIGHT("null"), //
		BAG_BAGFEE("null"), //
		BAG_LASTUPDATE("null"), //
		HWB_GCIPIECE("null"), //
		HWB_GCOPIECE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String hwbBagno;
	private String hwbHwb;
	private String hwbMwb;
	private String hwbExpbagno;
	private String hwbDeclno;
	private String hwbDeltype;
	private BigDecimal hwbPiece;
	private BigDecimal hwbGciweight;
	private java.sql.Timestamp hwbGcidate1;
	private java.sql.Timestamp hwbGcidate2;
	private java.sql.Timestamp hwbGcodate1;
	private java.sql.Timestamp hwbGcodate2;
	private java.sql.Timestamp hwbLastupdate;
	private BigDecimal bagBaghwb;
	private BigDecimal bagBagpiece;
	private BigDecimal bagBagweight;
	private BigDecimal bagBagfee;
	private java.sql.Timestamp bagLastupdate;
	private BigDecimal hwbGcipiece;
	private BigDecimal hwbGcopiece;

	@Override
	public String getHwbBagno() {
		return this.hwbBagno;
	}
 
	@Override
	public void setHwbBagno(final String hwbBagno) {
		this.hwbBagno = hwbBagno; 
	}
 
	@Override
	public String getHwbHwb() {
		return this.hwbHwb;
	}
 
	@Override
	public void setHwbHwb(final String hwbHwb) {
		this.hwbHwb = hwbHwb; 
	}
 
	@Override
	public String getHwbMwb() {
		return this.hwbMwb;
	}
 
	@Override
	public void setHwbMwb(final String hwbMwb) {
		this.hwbMwb = hwbMwb; 
	}
 
	@Override
	public String getHwbExpbagno() {
		return this.hwbExpbagno;
	}
 
	@Override
	public void setHwbExpbagno(final String hwbExpbagno) {
		this.hwbExpbagno = hwbExpbagno; 
	}
 
	@Override
	public String getHwbDeclno() {
		return this.hwbDeclno;
	}
 
	@Override
	public void setHwbDeclno(final String hwbDeclno) {
		this.hwbDeclno = hwbDeclno; 
	}
 
	@Override
	public String getHwbDeltype() {
		return this.hwbDeltype;
	}
 
	@Override
	public void setHwbDeltype(final String hwbDeltype) {
		this.hwbDeltype = hwbDeltype; 
	}
 
	@Override
	public BigDecimal getHwbPiece() {
		return this.hwbPiece;
	}
 
	@Override
	public void setHwbPiece(final BigDecimal hwbPiece) {
		this.hwbPiece = hwbPiece; 
	}
 
	@Override
	public BigDecimal getHwbGciweight() {
		return this.hwbGciweight;
	}
 
	@Override
	public void setHwbGciweight(final BigDecimal hwbGciweight) {
		this.hwbGciweight = hwbGciweight; 
	}
 
	@Override
	public java.sql.Timestamp getHwbGcidate1() {
		return this.hwbGcidate1;
	}
 
	@Override
	public void setHwbGcidate1(final java.sql.Timestamp hwbGcidate1) {
		this.hwbGcidate1 = hwbGcidate1; 
	}
 
	@Override
	public java.sql.Timestamp getHwbGcidate2() {
		return this.hwbGcidate2;
	}
 
	@Override
	public void setHwbGcidate2(final java.sql.Timestamp hwbGcidate2) {
		this.hwbGcidate2 = hwbGcidate2; 
	}
 
	@Override
	public java.sql.Timestamp getHwbGcodate1() {
		return this.hwbGcodate1;
	}
 
	@Override
	public void setHwbGcodate1(final java.sql.Timestamp hwbGcodate1) {
		this.hwbGcodate1 = hwbGcodate1; 
	}
 
	@Override
	public java.sql.Timestamp getHwbGcodate2() {
		return this.hwbGcodate2;
	}
 
	@Override
	public void setHwbGcodate2(final java.sql.Timestamp hwbGcodate2) {
		this.hwbGcodate2 = hwbGcodate2; 
	}
 
	@Override
	public java.sql.Timestamp getHwbLastupdate() {
		return this.hwbLastupdate;
	}
 
	@Override
	public void setHwbLastupdate(final java.sql.Timestamp hwbLastupdate) {
		this.hwbLastupdate = hwbLastupdate; 
	}
 
	@Override
	public BigDecimal getBagBaghwb() {
		return this.bagBaghwb;
	}
 
	@Override
	public void setBagBaghwb(final BigDecimal bagBaghwb) {
		this.bagBaghwb = bagBaghwb; 
	}
 
	@Override
	public BigDecimal getBagBagpiece() {
		return this.bagBagpiece;
	}
 
	@Override
	public void setBagBagpiece(final BigDecimal bagBagpiece) {
		this.bagBagpiece = bagBagpiece; 
	}
 
	@Override
	public BigDecimal getBagBagweight() {
		return this.bagBagweight;
	}
 
	@Override
	public void setBagBagweight(final BigDecimal bagBagweight) {
		this.bagBagweight = bagBagweight; 
	}
 
	@Override
	public BigDecimal getBagBagfee() {
		return this.bagBagfee;
	}
 
	@Override
	public void setBagBagfee(final BigDecimal bagBagfee) {
		this.bagBagfee = bagBagfee; 
	}
 
	@Override
	public java.sql.Timestamp getBagLastupdate() {
		return this.bagLastupdate;
	}
 
	@Override
	public void setBagLastupdate(final java.sql.Timestamp bagLastupdate) {
		this.bagLastupdate = bagLastupdate; 
	}
 
	@Override
	public BigDecimal getHwbGcipiece() {
		return this.hwbGcipiece;
	}
 
	@Override
	public void setHwbGcipiece(final BigDecimal hwbGcipiece) {
		this.hwbGcipiece = hwbGcipiece; 
	}
 
	@Override
	public BigDecimal getHwbGcopiece() {
		return this.hwbGcopiece;
	}
 
	@Override
	public void setHwbGcopiece(final BigDecimal hwbGcopiece) {
		this.hwbGcopiece = hwbGcopiece; 
	}
 
}
