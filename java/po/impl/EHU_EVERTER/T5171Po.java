package com.doc.common.po.impl; 
 
public class T5171Po implements IT5171Po {
 
	public enum COLUMNS {
		WDATE("資料寫入日期"), //
		WTIME("資料寫入時間"), //
		TTYPE("異動別"), //
		IMPORTATIONDATE("進口日期"), //
		MWB("主號"), //
		HWB("分號"), //
		EXPBAGNO("袋號"), //
		BAGPIECE("袋數"), //
		FLIGHTNO("航班"), //
		PIECE("總件數"), //
		UNIT("件數單位"), //
		WEIGHT("總毛重"), //
		CHECKCODE("主分比對代碼"), //
		BRIEFNOTE("簡易申報註記"), //
		RESERVEDCODE1("備用欄位識別代碼"), //
		RESERVEDFIELD1("備用欄位"), //
		RESERVEDCODE2("備用欄位識別代碼"), //
		RESERVEDFIELD2("備用欄位"), //
		RESERVEDCODE3("備用欄位識別代碼"), //
		RESERVEDFIELD3("備用欄位"), //
		RESERVEDCODE4("備用欄位識別代碼"), //
		RESERVEDFIELD4("備用欄位"), //
		RESERVEDCODE5("備用欄位識別代碼"), //
		RESERVEDFIELD5("備用欄位") //
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
 
}
