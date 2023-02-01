package com.doc.common.po.impl; 
 
public class OrderworkimphPo implements IOrderworkimphPo {
 
	public enum COLUMNS {
		WDATE("null"), //
		WTIME("null"), //
		TTYPE("null"), //
		IMPORTDATE("null"), //
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		BAGPIECE("null"), //
		FLIGHTNO("null"), //
		PIECE("null"), //
		WEIGHT("null"), //
		CHECKCODE("null"), //
		BRIEFNOTE("null"), //
		INPIECE("null"), //
		INDATE1("null"), //
		INDATE2("null"), //
		INUSER("null"), //
		INFINISH("null"), //
		MARK("null"), //
		ULDNO("null"), //
		UNIT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String wdate;
	private String wtime;
	private String ttype;
	private String importdate;
	private String mwb;
	private String hwb;
	private String expbagno;
	private String bagpiece;
	private String flightno;
	private String piece;
	private String weight;
	private String checkcode;
	private String briefnote;
	private BigDecimal inpiece;
	private java.sql.Timestamp indate1;
	private java.sql.Timestamp indate2;
	private String inuser;
	private String infinish;
	private String mark;
	private String uldno;
	private String unit;

	@Override
	public String getWdate() {
		return this.wdate;
	}
 
	@Override
	public void setWdate(final String wdate) {
		this.wdate = wdate; 
	}
 
	@Override
	public String getWtime() {
		return this.wtime;
	}
 
	@Override
	public void setWtime(final String wtime) {
		this.wtime = wtime; 
	}
 
	@Override
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getImportdate() {
		return this.importdate;
	}
 
	@Override
	public void setImportdate(final String importdate) {
		this.importdate = importdate; 
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
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public String getBagpiece() {
		return this.bagpiece;
	}
 
	@Override
	public void setBagpiece(final String bagpiece) {
		this.bagpiece = bagpiece; 
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
	public String getPiece() {
		return this.piece;
	}
 
	@Override
	public void setPiece(final String piece) {
		this.piece = piece; 
	}
 
	@Override
	public String getWeight() {
		return this.weight;
	}
 
	@Override
	public void setWeight(final String weight) {
		this.weight = weight; 
	}
 
	@Override
	public String getCheckcode() {
		return this.checkcode;
	}
 
	@Override
	public void setCheckcode(final String checkcode) {
		this.checkcode = checkcode; 
	}
 
	@Override
	public String getBriefnote() {
		return this.briefnote;
	}
 
	@Override
	public void setBriefnote(final String briefnote) {
		this.briefnote = briefnote; 
	}
 
	@Override
	public BigDecimal getInpiece() {
		return this.inpiece;
	}
 
	@Override
	public void setInpiece(final BigDecimal inpiece) {
		this.inpiece = inpiece; 
	}
 
	@Override
	public java.sql.Timestamp getIndate1() {
		return this.indate1;
	}
 
	@Override
	public void setIndate1(final java.sql.Timestamp indate1) {
		this.indate1 = indate1; 
	}
 
	@Override
	public java.sql.Timestamp getIndate2() {
		return this.indate2;
	}
 
	@Override
	public void setIndate2(final java.sql.Timestamp indate2) {
		this.indate2 = indate2; 
	}
 
	@Override
	public String getInuser() {
		return this.inuser;
	}
 
	@Override
	public void setInuser(final String inuser) {
		this.inuser = inuser; 
	}
 
	@Override
	public String getInfinish() {
		return this.infinish;
	}
 
	@Override
	public void setInfinish(final String infinish) {
		this.infinish = infinish; 
	}
 
	@Override
	public String getMark() {
		return this.mark;
	}
 
	@Override
	public void setMark(final String mark) {
		this.mark = mark; 
	}
 
	@Override
	public String getUldno() {
		return this.uldno;
	}
 
	@Override
	public void setUldno(final String uldno) {
		this.uldno = uldno; 
	}
 
	@Override
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
	}
 
}
