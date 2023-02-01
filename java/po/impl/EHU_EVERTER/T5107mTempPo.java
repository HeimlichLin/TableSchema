package com.doc.common.po.impl; 
 
public class T5107mTempPo implements IT5107mTempPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("null"), //
		WTIME("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		BOXNO("null"), //
		MWB("null"), //
		HWB("null"), //
		PROCESSINGUNIT("null"), //
		NOTICEDATE("null"), //
		DEADLINE("null"), //
		RELEASEDATE("null"), //
		INDICATOR("null"), //
		CLEARANCETYPE("null"), //
		PIECE("null"), //
		UNIT("null"), //
		PERMITNO1("null"), //
		PERMITNO2("null"), //
		PERMITNO3("null"), //
		PERMITNO4("null"), //
		PERMITNO5("null"), //
		PERMITNO6("null"), //
		PERMITNO7("null"), //
		PERMITNO8("null"), //
		PERMITNO9("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		SUBBOXNO("null"), //
		IMPORTATION_DATE("null"), //
		EXPBAGNO("null"), //
		EXPBAGNO_PIECE("null"), //
		FLIGHTNO("航機班次") //
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
	private String wdate;
	private String wtime;
	private String declno;
	private String decltype;
	private String boxno;
	private String mwb;
	private String hwb;
	private String processingunit;
	private String noticedate;
	private String deadline;
	private String releasedate;
	private String indicator;
	private String clearancetype;
	private BigDecimal piece;
	private String unit;
	private String permitno1;
	private String permitno2;
	private String permitno3;
	private String permitno4;
	private String permitno5;
	private String permitno6;
	private String permitno7;
	private String permitno8;
	private String permitno9;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String subboxno;
	private String importationDate;
	private String expbagno;
	private BigDecimal expbagnoPiece;
	private String flightno;

	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
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
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
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
	public String getProcessingunit() {
		return this.processingunit;
	}
 
	@Override
	public void setProcessingunit(final String processingunit) {
		this.processingunit = processingunit; 
	}
 
	@Override
	public String getNoticedate() {
		return this.noticedate;
	}
 
	@Override
	public void setNoticedate(final String noticedate) {
		this.noticedate = noticedate; 
	}
 
	@Override
	public String getDeadline() {
		return this.deadline;
	}
 
	@Override
	public void setDeadline(final String deadline) {
		this.deadline = deadline; 
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
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
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
	public String getPermitno1() {
		return this.permitno1;
	}
 
	@Override
	public void setPermitno1(final String permitno1) {
		this.permitno1 = permitno1; 
	}
 
	@Override
	public String getPermitno2() {
		return this.permitno2;
	}
 
	@Override
	public void setPermitno2(final String permitno2) {
		this.permitno2 = permitno2; 
	}
 
	@Override
	public String getPermitno3() {
		return this.permitno3;
	}
 
	@Override
	public void setPermitno3(final String permitno3) {
		this.permitno3 = permitno3; 
	}
 
	@Override
	public String getPermitno4() {
		return this.permitno4;
	}
 
	@Override
	public void setPermitno4(final String permitno4) {
		this.permitno4 = permitno4; 
	}
 
	@Override
	public String getPermitno5() {
		return this.permitno5;
	}
 
	@Override
	public void setPermitno5(final String permitno5) {
		this.permitno5 = permitno5; 
	}
 
	@Override
	public String getPermitno6() {
		return this.permitno6;
	}
 
	@Override
	public void setPermitno6(final String permitno6) {
		this.permitno6 = permitno6; 
	}
 
	@Override
	public String getPermitno7() {
		return this.permitno7;
	}
 
	@Override
	public void setPermitno7(final String permitno7) {
		this.permitno7 = permitno7; 
	}
 
	@Override
	public String getPermitno8() {
		return this.permitno8;
	}
 
	@Override
	public void setPermitno8(final String permitno8) {
		this.permitno8 = permitno8; 
	}
 
	@Override
	public String getPermitno9() {
		return this.permitno9;
	}
 
	@Override
	public void setPermitno9(final String permitno9) {
		this.permitno9 = permitno9; 
	}
 
	@Override
	public String getSenderid() {
		return this.senderid;
	}
 
	@Override
	public void setSenderid(final String senderid) {
		this.senderid = senderid; 
	}
 
	@Override
	public String getSenderqualifier() {
		return this.senderqualifier;
	}
 
	@Override
	public void setSenderqualifier(final String senderqualifier) {
		this.senderqualifier = senderqualifier; 
	}
 
	@Override
	public String getReceiverid() {
		return this.receiverid;
	}
 
	@Override
	public void setReceiverid(final String receiverid) {
		this.receiverid = receiverid; 
	}
 
	@Override
	public String getReceiverqualifier() {
		return this.receiverqualifier;
	}
 
	@Override
	public void setReceiverqualifier(final String receiverqualifier) {
		this.receiverqualifier = receiverqualifier; 
	}
 
	@Override
	public String getSubboxno() {
		return this.subboxno;
	}
 
	@Override
	public void setSubboxno(final String subboxno) {
		this.subboxno = subboxno; 
	}
 
	@Override
	public String getImportationDate() {
		return this.importationDate;
	}
 
	@Override
	public void setImportationDate(final String importationDate) {
		this.importationDate = importationDate; 
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
	public BigDecimal getExpbagnoPiece() {
		return this.expbagnoPiece;
	}
 
	@Override
	public void setExpbagnoPiece(final BigDecimal expbagnoPiece) {
		this.expbagnoPiece = expbagnoPiece; 
	}
 
	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
}
