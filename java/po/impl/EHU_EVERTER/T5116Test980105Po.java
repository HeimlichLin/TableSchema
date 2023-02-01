package com.doc.common.po.impl; 
 
public class T5116Test980105Po implements IT5116Test980105Po {
 
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
		RECEIVERQUALIFIER("null") //
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
 
}
