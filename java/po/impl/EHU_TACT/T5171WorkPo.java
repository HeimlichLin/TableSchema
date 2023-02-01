package com.doc.common.po.impl; 
 
public class T5171WorkPo implements IT5171WorkPo {
 
	public enum COLUMNS {
		WDATE("null"), //
		WTIME("null"), //
		TTYPE("null"), //
		IMPORTATIONDATE("null"), //
		MWB("null"), //
		HWB("null"), //
		EXPBAGNO("null"), //
		BAGPIECE("null"), //
		FLIGHTNO("null"), //
		PIECE("null"), //
		UNIT("null"), //
		WEIGHT("null"), //
		CHECKCODE("null"), //
		BRIEFNOTE("null"), //
		RESERVEDCODE1("null"), //
		RESERVEDFIELD1("null"), //
		RESERVEDCODE2("null"), //
		RESERVEDFIELD2("null"), //
		RESERVEDCODE3("null"), //
		RESERVEDFIELD3("null"), //
		RESERVEDCODE4("null"), //
		RESERVEDFIELD4("null"), //
		RESERVEDCODE5("null"), //
		RESERVEDFIELD5("null"), //
		DECLNO("null"), //
		BAGNO("null"), //
		PKGHWB("null"), //
		PKGHWBQTY("null"), //
		PKGBAGWEIGHT("null"), //
		PKGBAGPCE("null"), //
		PKGBAGNO("null"), //
		SENDDATE("null") //
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
	private String importationdate;
	private String mwb;
	private String hwb;
	private String expbagno;
	private String bagpiece;
	private String flightno;
	private String piece;
	private String unit;
	private String weight;
	private String checkcode;
	private String briefnote;
	private String reservedcode1;
	private String reservedfield1;
	private String reservedcode2;
	private String reservedfield2;
	private String reservedcode3;
	private String reservedfield3;
	private String reservedcode4;
	private String reservedfield4;
	private String reservedcode5;
	private String reservedfield5;
	private String declno;
	private String bagno;
	private String pkghwb;
	private String pkghwbqty;
	private String pkgbagweight;
	private String pkgbagpce;
	private String pkgbagno;
	private String senddate;

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
	public String getImportationdate() {
		return this.importationdate;
	}
 
	@Override
	public void setImportationdate(final String importationdate) {
		this.importationdate = importationdate; 
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
	public String getUnit() {
		return this.unit;
	}
 
	@Override
	public void setUnit(final String unit) {
		this.unit = unit; 
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
	public String getReservedcode1() {
		return this.reservedcode1;
	}
 
	@Override
	public void setReservedcode1(final String reservedcode1) {
		this.reservedcode1 = reservedcode1; 
	}
 
	@Override
	public String getReservedfield1() {
		return this.reservedfield1;
	}
 
	@Override
	public void setReservedfield1(final String reservedfield1) {
		this.reservedfield1 = reservedfield1; 
	}
 
	@Override
	public String getReservedcode2() {
		return this.reservedcode2;
	}
 
	@Override
	public void setReservedcode2(final String reservedcode2) {
		this.reservedcode2 = reservedcode2; 
	}
 
	@Override
	public String getReservedfield2() {
		return this.reservedfield2;
	}
 
	@Override
	public void setReservedfield2(final String reservedfield2) {
		this.reservedfield2 = reservedfield2; 
	}
 
	@Override
	public String getReservedcode3() {
		return this.reservedcode3;
	}
 
	@Override
	public void setReservedcode3(final String reservedcode3) {
		this.reservedcode3 = reservedcode3; 
	}
 
	@Override
	public String getReservedfield3() {
		return this.reservedfield3;
	}
 
	@Override
	public void setReservedfield3(final String reservedfield3) {
		this.reservedfield3 = reservedfield3; 
	}
 
	@Override
	public String getReservedcode4() {
		return this.reservedcode4;
	}
 
	@Override
	public void setReservedcode4(final String reservedcode4) {
		this.reservedcode4 = reservedcode4; 
	}
 
	@Override
	public String getReservedfield4() {
		return this.reservedfield4;
	}
 
	@Override
	public void setReservedfield4(final String reservedfield4) {
		this.reservedfield4 = reservedfield4; 
	}
 
	@Override
	public String getReservedcode5() {
		return this.reservedcode5;
	}
 
	@Override
	public void setReservedcode5(final String reservedcode5) {
		this.reservedcode5 = reservedcode5; 
	}
 
	@Override
	public String getReservedfield5() {
		return this.reservedfield5;
	}
 
	@Override
	public void setReservedfield5(final String reservedfield5) {
		this.reservedfield5 = reservedfield5; 
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
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getPkghwb() {
		return this.pkghwb;
	}
 
	@Override
	public void setPkghwb(final String pkghwb) {
		this.pkghwb = pkghwb; 
	}
 
	@Override
	public String getPkghwbqty() {
		return this.pkghwbqty;
	}
 
	@Override
	public void setPkghwbqty(final String pkghwbqty) {
		this.pkghwbqty = pkghwbqty; 
	}
 
	@Override
	public String getPkgbagweight() {
		return this.pkgbagweight;
	}
 
	@Override
	public void setPkgbagweight(final String pkgbagweight) {
		this.pkgbagweight = pkgbagweight; 
	}
 
	@Override
	public String getPkgbagpce() {
		return this.pkgbagpce;
	}
 
	@Override
	public void setPkgbagpce(final String pkgbagpce) {
		this.pkgbagpce = pkgbagpce; 
	}
 
	@Override
	public String getPkgbagno() {
		return this.pkgbagno;
	}
 
	@Override
	public void setPkgbagno(final String pkgbagno) {
		this.pkgbagno = pkgbagno; 
	}
 
	@Override
	public String getSenddate() {
		return this.senddate;
	}
 
	@Override
	public void setSenddate(final String senddate) {
		this.senddate = senddate; 
	}
 
}
