package com.doc.common.po.impl; 
 
public class T5204Po implements IT5204Po {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("????"), //
		WTIME("????"), //
		MWB("null"), //
		HWB("null"), //
		RELEASEDATE("null"), //
		RELEASETIME("null"), //
		TTYPE("???"), //
		EXTRACONDITION("????????1"), //
		BOXNO("null"), //
		DECLNO("null"), //
		DECLTYPE("null"), //
		PIECE("????"), //
		UNIT("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		RELCOND("null"), //
		SUBBOXNO("????????"), //
		FLIGHTNO("????(?)/????(?)"), //
		WAREHOUSENO("??????"), //
		EXPORTERID("???(?????)????"), //
		IDENTIFIERCODED("??????"), //
		EXPORTERNAME("???(?????)????"), //
		CLEARANCETYPE("????"), //
		ORGDECLNO("?????"), //
		VEHICLECODE("????????"), //
		UNRELEASEDPIECE("?????"), //
		UNRELEASEDUNIT("?????"), //
		TOTALGROSSWEIGHT("???"), //
		EXTRACONDITION2("????????2"), //
		EXTRACONDITION3("????????3"), //
		EXTRACONDITION4("????????4"), //
		EXTRACONDITION5("????????5"), //
		EXTRACONDITION6("????????6"), //
		EXTRACONDITION7("????????7"), //
		EXTRACONDITION8("????????8"), //
		EXTRACONDITION9("????????9"), //
		CCCCODE("??????") //
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
	private String mwb;
	private String hwb;
	private String releasedate;
	private String releasetime;
	private String ttype;
	private String extracondition;
	private String boxno;
	private String declno;
	private String decltype;
	private BigDecimal piece;
	private String unit;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String relcond;
	private String subboxno;
	private String flightno;
	private String warehouseno;
	private String exporterid;
	private String identifiercoded;
	private String exportername;
	private String clearancetype;
	private String orgdeclno;
	private String vehiclecode;
	private String unreleasedpiece;
	private String unreleasedunit;
	private String totalgrossweight;
	private String extracondition2;
	private String extracondition3;
	private String extracondition4;
	private String extracondition5;
	private String extracondition6;
	private String extracondition7;
	private String extracondition8;
	private String extracondition9;
	private String ccccode;

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
	public String getRelcond() {
		return this.relcond;
	}
 
	@Override
	public void setRelcond(final String relcond) {
		this.relcond = relcond; 
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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
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
	public String getExporterid() {
		return this.exporterid;
	}
 
	@Override
	public void setExporterid(final String exporterid) {
		this.exporterid = exporterid; 
	}
 
	@Override
	public String getIdentifiercoded() {
		return this.identifiercoded;
	}
 
	@Override
	public void setIdentifiercoded(final String identifiercoded) {
		this.identifiercoded = identifiercoded; 
	}
 
	@Override
	public String getExportername() {
		return this.exportername;
	}
 
	@Override
	public void setExportername(final String exportername) {
		this.exportername = exportername; 
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
	public String getOrgdeclno() {
		return this.orgdeclno;
	}
 
	@Override
	public void setOrgdeclno(final String orgdeclno) {
		this.orgdeclno = orgdeclno; 
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
	public String getTotalgrossweight() {
		return this.totalgrossweight;
	}
 
	@Override
	public void setTotalgrossweight(final String totalgrossweight) {
		this.totalgrossweight = totalgrossweight; 
	}
 
	@Override
	public String getExtracondition2() {
		return this.extracondition2;
	}
 
	@Override
	public void setExtracondition2(final String extracondition2) {
		this.extracondition2 = extracondition2; 
	}
 
	@Override
	public String getExtracondition3() {
		return this.extracondition3;
	}
 
	@Override
	public void setExtracondition3(final String extracondition3) {
		this.extracondition3 = extracondition3; 
	}
 
	@Override
	public String getExtracondition4() {
		return this.extracondition4;
	}
 
	@Override
	public void setExtracondition4(final String extracondition4) {
		this.extracondition4 = extracondition4; 
	}
 
	@Override
	public String getExtracondition5() {
		return this.extracondition5;
	}
 
	@Override
	public void setExtracondition5(final String extracondition5) {
		this.extracondition5 = extracondition5; 
	}
 
	@Override
	public String getExtracondition6() {
		return this.extracondition6;
	}
 
	@Override
	public void setExtracondition6(final String extracondition6) {
		this.extracondition6 = extracondition6; 
	}
 
	@Override
	public String getExtracondition7() {
		return this.extracondition7;
	}
 
	@Override
	public void setExtracondition7(final String extracondition7) {
		this.extracondition7 = extracondition7; 
	}
 
	@Override
	public String getExtracondition8() {
		return this.extracondition8;
	}
 
	@Override
	public void setExtracondition8(final String extracondition8) {
		this.extracondition8 = extracondition8; 
	}
 
	@Override
	public String getExtracondition9() {
		return this.extracondition9;
	}
 
	@Override
	public void setExtracondition9(final String extracondition9) {
		this.extracondition9 = extracondition9; 
	}
 
	@Override
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
	}
 
}
