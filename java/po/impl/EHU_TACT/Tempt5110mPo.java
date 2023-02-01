package com.doc.common.po.impl; 
 
public class Tempt5110mPo implements ITempt5110mPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("null"), //
		WTIME("null"), //
		DUTYNO("null"), //
		DUTYPAYERBAN("null"), //
		BOXNO("null"), //
		DUTYDEADLINE("null"), //
		FLIGHTNO("null"), //
		SHIPNO("null"), //
		DECLNO("null"), //
		DUTYPAYMENT("null"), //
		MWB("null"), //
		HWB("null"), //
		ISSUEREASON("null"), //
		IMPORTATIONDATE("null"), //
		EXPORTDECLDATE("null"), //
		PIECE("null"), //
		UNIT("null"), //
		CCCCODE("null"), //
		FOBVALUE("null"), //
		DUTYBASIS("null"), //
		EXAMINATIONNOTE("null"), //
		CUSTOMSACTNO("null"), //
		DUTYPAYERNAME("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		SUBBOXNO("報關業者箱號附碼"), //
		COLLECTIONITEM("代收項目
"), //
		AGENCYBARCODE("條碼機關別代碼
"), //
		IMPORTERENAME("進口人(納稅義務人)英文名稱"), //
		CLEARANCETYPE("通關方式
"), //
		WRITEOFFNO("銷帳編號
"), //
		DECLTYPE("報單類別
"), //
		CASENO("案號
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
	private String dutyno;
	private String dutypayerban;
	private String boxno;
	private String dutydeadline;
	private String flightno;
	private String shipno;
	private String declno;
	private String dutypayment;
	private String mwb;
	private String hwb;
	private String issuereason;
	private String importationdate;
	private String exportdecldate;
	private BigDecimal piece;
	private String unit;
	private String ccccode;
	private String fobvalue;
	private String dutybasis;
	private String examinationnote;
	private String customsactno;
	private String dutypayername;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String subboxno;
	private String collectionitem;
	private String agencybarcode;
	private String importerename;
	private String clearancetype;
	private String writeoffno;
	private String decltype;
	private String caseno;

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
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
	}
 
	@Override
	public String getDutypayerban() {
		return this.dutypayerban;
	}
 
	@Override
	public void setDutypayerban(final String dutypayerban) {
		this.dutypayerban = dutypayerban; 
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
	public String getDutydeadline() {
		return this.dutydeadline;
	}
 
	@Override
	public void setDutydeadline(final String dutydeadline) {
		this.dutydeadline = dutydeadline; 
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
	public String getShipno() {
		return this.shipno;
	}
 
	@Override
	public void setShipno(final String shipno) {
		this.shipno = shipno; 
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
	public String getDutypayment() {
		return this.dutypayment;
	}
 
	@Override
	public void setDutypayment(final String dutypayment) {
		this.dutypayment = dutypayment; 
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
	public String getIssuereason() {
		return this.issuereason;
	}
 
	@Override
	public void setIssuereason(final String issuereason) {
		this.issuereason = issuereason; 
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
	public String getExportdecldate() {
		return this.exportdecldate;
	}
 
	@Override
	public void setExportdecldate(final String exportdecldate) {
		this.exportdecldate = exportdecldate; 
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
	public String getCcccode() {
		return this.ccccode;
	}
 
	@Override
	public void setCcccode(final String ccccode) {
		this.ccccode = ccccode; 
	}
 
	@Override
	public String getFobvalue() {
		return this.fobvalue;
	}
 
	@Override
	public void setFobvalue(final String fobvalue) {
		this.fobvalue = fobvalue; 
	}
 
	@Override
	public String getDutybasis() {
		return this.dutybasis;
	}
 
	@Override
	public void setDutybasis(final String dutybasis) {
		this.dutybasis = dutybasis; 
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
	public String getCustomsactno() {
		return this.customsactno;
	}
 
	@Override
	public void setCustomsactno(final String customsactno) {
		this.customsactno = customsactno; 
	}
 
	@Override
	public String getDutypayername() {
		return this.dutypayername;
	}
 
	@Override
	public void setDutypayername(final String dutypayername) {
		this.dutypayername = dutypayername; 
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
	public String getCollectionitem() {
		return this.collectionitem;
	}
 
	@Override
	public void setCollectionitem(final String collectionitem) {
		this.collectionitem = collectionitem; 
	}
 
	@Override
	public String getAgencybarcode() {
		return this.agencybarcode;
	}
 
	@Override
	public void setAgencybarcode(final String agencybarcode) {
		this.agencybarcode = agencybarcode; 
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
	public String getClearancetype() {
		return this.clearancetype;
	}
 
	@Override
	public void setClearancetype(final String clearancetype) {
		this.clearancetype = clearancetype; 
	}
 
	@Override
	public String getWriteoffno() {
		return this.writeoffno;
	}
 
	@Override
	public void setWriteoffno(final String writeoffno) {
		this.writeoffno = writeoffno; 
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
	public String getCaseno() {
		return this.caseno;
	}
 
	@Override
	public void setCaseno(final String caseno) {
		this.caseno = caseno; 
	}
 
}
