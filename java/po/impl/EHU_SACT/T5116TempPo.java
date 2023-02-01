package com.doc.common.po.impl; 
 
public class T5116TempPo implements IT5116TempPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("????"), //
		WTIME("????"), //
		IMPORTATIONDATE("????"), //
		FLIGHTNO("????(?)/????(?)"), //
		INDICATOR("??????;23???, 22???, 24???"), //
		MWB("?????"), //
		HWB("?????"), //
		RELEASEDATE("null"), //
		RELEASETIME("??????"), //
		TTYPE("null"), //
		EXTRACONDITION("????????1"), //
		BOXNO("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		QUANTITYLANDED("???(??????)"), //
		LANDEDUNIT("??????"), //
		QUANTITYRELEASED("????"), //
		RELEASEDUNIT("??????"), //
		GROSSWEIGHT("???"), //
		EXAMINATIONNOTE("null"), //
		COPACKAGE("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		SUBBOXNO("????????"), //
		RELEASETYPECODE("??????"), //
		WAREHOUSENO("??????"), //
		CCCCODE("??????"), //
		UNRELEASEDPIECE("?????"), //
		UNRELEASEDUNIT("???????"), //
		CLEARANCETYPE("????"), //
		IMPORTERENAME("???(?????)????"), //
		IMPORTERID("???(?????)????"), //
		VEHICLECODE("?(?)??"), //
		ENTRYOFFICEID("????????"), //
		SHORTLANDEDNOTE("????"), //
		EXTRACODE2("????????2"), //
		EXTRACODE3("????????3"), //
		EXTRACODE4("????????4"), //
		EXTRACODE5("????????5"), //
		EXTRACODE6("????????6"), //
		EXTRACODE7("????????7"), //
		EXTRACODE8("????????8"), //
		EXTRACODE9("????????9"), //
		IMPORTERCNAME("???(?????)????"), //
		CUSTOMSCODE("??????"), //
		BONDEDWCODE("????????"), //
		SHIPNOTE("????"), //
		EXPBAGNO("????"), //
		BAGHWB("????") //
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
	private String subboxno;
	private String releasetypecode;
	private String warehouseno;
	private String ccccode;
	private String unreleasedpiece;
	private String unreleasedunit;
	private String clearancetype;
	private String importerename;
	private String importerid;
	private String vehiclecode;
	private String entryofficeid;
	private String shortlandednote;
	private String extracode2;
	private String extracode3;
	private String extracode4;
	private String extracode5;
	private String extracode6;
	private String extracode7;
	private String extracode8;
	private String extracode9;
	private String importercname;
	private String customscode;
	private String bondedwcode;
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
	public String getSubboxno() {
		return this.subboxno;
	}
 
	@Override
	public void setSubboxno(final String subboxno) {
		this.subboxno = subboxno; 
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
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
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
	public String getUnreleasedunit() {
		return this.unreleasedunit;
	}
 
	@Override
	public void setUnreleasedunit(final String unreleasedunit) {
		this.unreleasedunit = unreleasedunit; 
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
	public String getImporterename() {
		return this.importerename;
	}
 
	@Override
	public void setImporterename(final String importerename) {
		this.importerename = importerename; 
	}
 
	@Override
	public String getImporterid() {
		return this.importerid;
	}
 
	@Override
	public void setImporterid(final String importerid) {
		this.importerid = importerid; 
	}
 
	@Override
	public String getVehiclecode() {
		return this.vehiclecode;
	}
 
	@Override
	public void setVehiclecode(final String vehiclecode) {
		this.vehiclecode = vehiclecode; 
	}
 
	@Override
	public String getEntryofficeid() {
		return this.entryofficeid;
	}
 
	@Override
	public void setEntryofficeid(final String entryofficeid) {
		this.entryofficeid = entryofficeid; 
	}
 
	@Override
	public String getShortlandednote() {
		return this.shortlandednote;
	}
 
	@Override
	public void setShortlandednote(final String shortlandednote) {
		this.shortlandednote = shortlandednote; 
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
	public String getExtracode4() {
		return this.extracode4;
	}
 
	@Override
	public void setExtracode4(final String extracode4) {
		this.extracode4 = extracode4; 
	}
 
	@Override
	public String getExtracode5() {
		return this.extracode5;
	}
 
	@Override
	public void setExtracode5(final String extracode5) {
		this.extracode5 = extracode5; 
	}
 
	@Override
	public String getExtracode6() {
		return this.extracode6;
	}
 
	@Override
	public void setExtracode6(final String extracode6) {
		this.extracode6 = extracode6; 
	}
 
	@Override
	public String getExtracode7() {
		return this.extracode7;
	}
 
	@Override
	public void setExtracode7(final String extracode7) {
		this.extracode7 = extracode7; 
	}
 
	@Override
	public String getExtracode8() {
		return this.extracode8;
	}
 
	@Override
	public void setExtracode8(final String extracode8) {
		this.extracode8 = extracode8; 
	}
 
	@Override
	public String getExtracode9() {
		return this.extracode9;
	}
 
	@Override
	public void setExtracode9(final String extracode9) {
		this.extracode9 = extracode9; 
	}
 
	@Override
	public String getImportercname() {
		return this.importercname;
	}
 
	@Override
	public void setImportercname(final String importercname) {
		this.importercname = importercname; 
	}
 
	@Override
	public String getCustomscode() {
		return this.customscode;
	}
 
	@Override
	public void setCustomscode(final String customscode) {
		this.customscode = customscode; 
	}
 
	@Override
	public String getBondedwcode() {
		return this.bondedwcode;
	}
 
	@Override
	public void setBondedwcode(final String bondedwcode) {
		this.bondedwcode = bondedwcode; 
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
