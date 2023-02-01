package com.doc.common.po.impl; 
 
public class Tempt5116Po implements ITempt5116Po {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("null"), //
		WTIME("null"), //
		IMPORTATIONDATE("null"), //
		FLIGHTNO("null"), //
		INDICATOR("null"), //
		MWB("null"), //
		HWB("null"), //
		RELEASEDATE("null"), //
		RELEASETIME("null"), //
		TTYPE("null"), //
		EXTRACONDITION("null"), //
		BOXNO("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		QUANTITYLANDED("null"), //
		LANDEDUNIT("null"), //
		QUANTITYRELEASED("null"), //
		RELEASEDUNIT("null"), //
		GROSSWEIGHT("null"), //
		EXAMINATIONNOTE("null"), //
		COPACKAGE("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		RELEASETYPECODE("放行通知類別
"), //
		WAREHOUSENO("卸存地點代碼
"), //
		UNRELEASEDPIECE("未放行件數
"), //
		SONO("艙單號碼
"), //
		EXTRACODE1("放行附帶條件代碼1"), //
		EXTRACODE2("放行附帶條件代碼2"), //
		EXTRACODE3("放行附帶條件代碼3"), //
		SHIPNOTE("合併註記
"), //
		EXPBAGNO("併袋號碼
"), //
		BAGHWB("併袋筆數
") //
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
	private String importationdate;
	private String flightno;
	private String indicator;
	private String mwb;
	private String hwb;
	private String releasedate;
	private String releasetime;
	private String ttype;
	private String extracondition;
	private String boxno;
	private String declno;
	private String decltype;
	private BigDecimal quantitylanded;
	private String landedunit;
	private BigDecimal quantityreleased;
	private String releasedunit;
	private BigDecimal grossweight;
	private String examinationnote;
	private String copackage;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String releasetypecode;
	private String warehouseno;
	private String unreleasedpiece;
	private String sono;
	private String extracode1;
	private String extracode2;
	private String extracode3;
	private String shipnote;
	private String expbagno;
	private String baghwb;

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
	public String getImportationdate() {
		return this.importationdate;
	}
 
	@Override
	public void setImportationdate(final String importationdate) {
		this.importationdate = importationdate; 
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
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
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
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getExtracondition() {
		return this.extracondition;
	}
 
	@Override
	public void setExtracondition(final String extracondition) {
		this.extracondition = extracondition; 
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
	public BigDecimal getQuantitylanded() {
		return this.quantitylanded;
	}
 
	@Override
	public void setQuantitylanded(final BigDecimal quantitylanded) {
		this.quantitylanded = quantitylanded; 
	}
 
	@Override
	public String getLandedunit() {
		return this.landedunit;
	}
 
	@Override
	public void setLandedunit(final String landedunit) {
		this.landedunit = landedunit; 
	}
 
	@Override
	public BigDecimal getQuantityreleased() {
		return this.quantityreleased;
	}
 
	@Override
	public void setQuantityreleased(final BigDecimal quantityreleased) {
		this.quantityreleased = quantityreleased; 
	}
 
	@Override
	public String getReleasedunit() {
		return this.releasedunit;
	}
 
	@Override
	public void setReleasedunit(final String releasedunit) {
		this.releasedunit = releasedunit; 
	}
 
	@Override
	public BigDecimal getGrossweight() {
		return this.grossweight;
	}
 
	@Override
	public void setGrossweight(final BigDecimal grossweight) {
		this.grossweight = grossweight; 
	}
 
	@Override
	public String getExaminationnote() {
		return this.examinationnote;
	}
 
	@Override
	public void setExaminationnote(final String examinationnote) {
		this.examinationnote = examinationnote; 
	}
 
	@Override
	public String getCopackage() {
		return this.copackage;
	}
 
	@Override
	public void setCopackage(final String copackage) {
		this.copackage = copackage; 
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
	public String getReleasetypecode() {
		return this.releasetypecode;
	}
 
	@Override
	public void setReleasetypecode(final String releasetypecode) {
		this.releasetypecode = releasetypecode; 
	}
 
	@Override
	public String getWarehouseno() {
		return this.warehouseno;
	}
 
	@Override
	public void setWarehouseno(final String warehouseno) {
		this.warehouseno = warehouseno; 
	}
 
	@Override
	public String getUnreleasedpiece() {
		return this.unreleasedpiece;
	}
 
	@Override
	public void setUnreleasedpiece(final String unreleasedpiece) {
		this.unreleasedpiece = unreleasedpiece; 
	}
 
	@Override
	public String getSono() {
		return this.sono;
	}
 
	@Override
	public void setSono(final String sono) {
		this.sono = sono; 
	}
 
	@Override
	public String getExtracode1() {
		return this.extracode1;
	}
 
	@Override
	public void setExtracode1(final String extracode1) {
		this.extracode1 = extracode1; 
	}
 
	@Override
	public String getExtracode2() {
		return this.extracode2;
	}
 
	@Override
	public void setExtracode2(final String extracode2) {
		this.extracode2 = extracode2; 
	}
 
	@Override
	public String getExtracode3() {
		return this.extracode3;
	}
 
	@Override
	public void setExtracode3(final String extracode3) {
		this.extracode3 = extracode3; 
	}
 
	@Override
	public String getShipnote() {
		return this.shipnote;
	}
 
	@Override
	public void setShipnote(final String shipnote) {
		this.shipnote = shipnote; 
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
	public String getBaghwb() {
		return this.baghwb;
	}
 
	@Override
	public void setBaghwb(final String baghwb) {
		this.baghwb = baghwb; 
	}
 
}
