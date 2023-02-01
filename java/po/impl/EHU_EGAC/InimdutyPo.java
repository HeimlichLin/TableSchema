package com.doc.common.po.impl; 
 
public class InimdutyPo implements IInimdutyPo {
 
	public enum COLUMNS {
		DUTYNO("null"), //
		DUTYPAYERNAME("null"), //
		DUTYPAYERBAN("null"), //
		BOXNO("null"), //
		FLIGHTNO("null"), //
		MWB("null"), //
		HWB("null"), //
		EXAMINATIONNOTE("null"), //
		CUSTOMSACTNO("null"), //
		IMPORTATIONDATE("null"), //
		EXPORTATIONDATE("null"), //
		EXPORTDECLDATE("null"), //
		DUTYDEADLINE("null"), //
		DECLNO("null"), //
		FOBVALUE("null"), //
		PAYMETHORD1("null"), //
		PAYMETHORD2("null"), //
		PAYMETHORD3("null"), //
		PAYMETHORD4("null"), //
		PAYMETHORD5("null"), //
		PAYMETHORD6("null"), //
		PAYMETHORD7("null"), //
		PAYMETHORD8("null"), //
		PAYMETHORD9("null"), //
		TAX1("null"), //
		TAX2("null"), //
		TAX3("null"), //
		TAX4("null"), //
		TAX5("null"), //
		TAX6("null"), //
		TAX7("null"), //
		TAX8("null"), //
		TAX9("null"), //
		TAXTOTAL("null"), //
		TAXBASIS("null"), //
		CCCCODE("null"), //
		PIECE("null"), //
		UNIT("null"), //
		ISSUEREASON("null"), //
		DEPOSIT("null"), //
		CASENO("null"), //
		DEPOSITBANK("null"), //
		CHARCODE("null"), //
		MESSAGETYPE("null"), //
		IETYPE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dutyno;
	private String dutypayername;
	private String dutypayerban;
	private String boxno;
	private String flightno;
	private String mwb;
	private String hwb;
	private String examinationnote;
	private String customsactno;
	private String importationdate;
	private String exportationdate;
	private String exportdecldate;
	private String dutydeadline;
	private String declno;
	private String fobvalue;
	private String paymethord1;
	private String paymethord2;
	private String paymethord3;
	private String paymethord4;
	private String paymethord5;
	private String paymethord6;
	private String paymethord7;
	private String paymethord8;
	private String paymethord9;
	private String tax1;
	private String tax2;
	private String tax3;
	private String tax4;
	private String tax5;
	private String tax6;
	private String tax7;
	private String tax8;
	private String tax9;
	private String taxtotal;
	private String taxbasis;
	private String ccccode;
	private String piece;
	private String unit;
	private String issuereason;
	private String deposit;
	private String caseno;
	private String depositbank;
	private String charcode;
	private String messagetype;
	private String ietype;

	@Override
	public String getDutyno() {
		return this.dutyno;
	}
 
	@Override
	public void setDutyno(final String dutyno) {
		this.dutyno = dutyno; 
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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
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
	public String getImportationdate() {
		return this.importationdate;
	}
 
	@Override
	public void setImportationdate(final String importationdate) {
		this.importationdate = importationdate; 
	}
 
	@Override
	public String getExportationdate() {
		return this.exportationdate;
	}
 
	@Override
	public void setExportationdate(final String exportationdate) {
		this.exportationdate = exportationdate; 
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
	public String getDutydeadline() {
		return this.dutydeadline;
	}
 
	@Override
	public void setDutydeadline(final String dutydeadline) {
		this.dutydeadline = dutydeadline; 
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
	public String getFobvalue() {
		return this.fobvalue;
	}
 
	@Override
	public void setFobvalue(final String fobvalue) {
		this.fobvalue = fobvalue; 
	}
 
	@Override
	public String getPaymethord1() {
		return this.paymethord1;
	}
 
	@Override
	public void setPaymethord1(final String paymethord1) {
		this.paymethord1 = paymethord1; 
	}
 
	@Override
	public String getPaymethord2() {
		return this.paymethord2;
	}
 
	@Override
	public void setPaymethord2(final String paymethord2) {
		this.paymethord2 = paymethord2; 
	}
 
	@Override
	public String getPaymethord3() {
		return this.paymethord3;
	}
 
	@Override
	public void setPaymethord3(final String paymethord3) {
		this.paymethord3 = paymethord3; 
	}
 
	@Override
	public String getPaymethord4() {
		return this.paymethord4;
	}
 
	@Override
	public void setPaymethord4(final String paymethord4) {
		this.paymethord4 = paymethord4; 
	}
 
	@Override
	public String getPaymethord5() {
		return this.paymethord5;
	}
 
	@Override
	public void setPaymethord5(final String paymethord5) {
		this.paymethord5 = paymethord5; 
	}
 
	@Override
	public String getPaymethord6() {
		return this.paymethord6;
	}
 
	@Override
	public void setPaymethord6(final String paymethord6) {
		this.paymethord6 = paymethord6; 
	}
 
	@Override
	public String getPaymethord7() {
		return this.paymethord7;
	}
 
	@Override
	public void setPaymethord7(final String paymethord7) {
		this.paymethord7 = paymethord7; 
	}
 
	@Override
	public String getPaymethord8() {
		return this.paymethord8;
	}
 
	@Override
	public void setPaymethord8(final String paymethord8) {
		this.paymethord8 = paymethord8; 
	}
 
	@Override
	public String getPaymethord9() {
		return this.paymethord9;
	}
 
	@Override
	public void setPaymethord9(final String paymethord9) {
		this.paymethord9 = paymethord9; 
	}
 
	@Override
	public String getTax1() {
		return this.tax1;
	}
 
	@Override
	public void setTax1(final String tax1) {
		this.tax1 = tax1; 
	}
 
	@Override
	public String getTax2() {
		return this.tax2;
	}
 
	@Override
	public void setTax2(final String tax2) {
		this.tax2 = tax2; 
	}
 
	@Override
	public String getTax3() {
		return this.tax3;
	}
 
	@Override
	public void setTax3(final String tax3) {
		this.tax3 = tax3; 
	}
 
	@Override
	public String getTax4() {
		return this.tax4;
	}
 
	@Override
	public void setTax4(final String tax4) {
		this.tax4 = tax4; 
	}
 
	@Override
	public String getTax5() {
		return this.tax5;
	}
 
	@Override
	public void setTax5(final String tax5) {
		this.tax5 = tax5; 
	}
 
	@Override
	public String getTax6() {
		return this.tax6;
	}
 
	@Override
	public void setTax6(final String tax6) {
		this.tax6 = tax6; 
	}
 
	@Override
	public String getTax7() {
		return this.tax7;
	}
 
	@Override
	public void setTax7(final String tax7) {
		this.tax7 = tax7; 
	}
 
	@Override
	public String getTax8() {
		return this.tax8;
	}
 
	@Override
	public void setTax8(final String tax8) {
		this.tax8 = tax8; 
	}
 
	@Override
	public String getTax9() {
		return this.tax9;
	}
 
	@Override
	public void setTax9(final String tax9) {
		this.tax9 = tax9; 
	}
 
	@Override
	public String getTaxtotal() {
		return this.taxtotal;
	}
 
	@Override
	public void setTaxtotal(final String taxtotal) {
		this.taxtotal = taxtotal; 
	}
 
	@Override
	public String getTaxbasis() {
		return this.taxbasis;
	}
 
	@Override
	public void setTaxbasis(final String taxbasis) {
		this.taxbasis = taxbasis; 
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
	public String getIssuereason() {
		return this.issuereason;
	}
 
	@Override
	public void setIssuereason(final String issuereason) {
		this.issuereason = issuereason; 
	}
 
	@Override
	public String getDeposit() {
		return this.deposit;
	}
 
	@Override
	public void setDeposit(final String deposit) {
		this.deposit = deposit; 
	}
 
	@Override
	public String getCaseno() {
		return this.caseno;
	}
 
	@Override
	public void setCaseno(final String caseno) {
		this.caseno = caseno; 
	}
 
	@Override
	public String getDepositbank() {
		return this.depositbank;
	}
 
	@Override
	public void setDepositbank(final String depositbank) {
		this.depositbank = depositbank; 
	}
 
	@Override
	public String getCharcode() {
		return this.charcode;
	}
 
	@Override
	public void setCharcode(final String charcode) {
		this.charcode = charcode; 
	}
 
	@Override
	public String getMessagetype() {
		return this.messagetype;
	}
 
	@Override
	public void setMessagetype(final String messagetype) {
		this.messagetype = messagetype; 
	}
 
	@Override
	public String getIetype() {
		return this.ietype;
	}
 
	@Override
	public void setIetype(final String ietype) {
		this.ietype = ietype; 
	}
 
}
