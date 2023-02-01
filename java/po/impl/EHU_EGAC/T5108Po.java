package com.doc.common.po.impl; 
 
public class T5108Po implements IT5108Po {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		WDATE("null"), //
		WTIME("null"), //
		INDICATOR("null"), //
		MWB("null"), //
		HWB("null"), //
		FLIGHTNO("null"), //
		ARRIVALDATE("null"), //
		CUSTOMSOFFICE("null"), //
		ERRORCODE1("null"), //
		ERRORCODE2("null"), //
		ERRORCODE3("null"), //
		ERRORCODE4("null"), //
		ERRORCODE5("null"), //
		SENDERID("null"), //
		SENDERQUALIFIER("null"), //
		RECEIVERID("null"), //
		RECEIVERQUALIFIER("null"), //
		ERRORCODE6("null"), //
		ERRORCODE7("null"), //
		ERRORCODE8("null"), //
		ERRORCODE9("null"), //
		IMP_MWB("null"), //
		IMP_HWB("null"), //
		ORGMSGTYPE("原訊息類別
"), //
		ORGMSGSENDERCODE("原訊息傳送者代碼
"), //
		ORGMSGID("原訊息編號
"), //
		RESPONSECODE("回應別
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
	private String indicator;
	private String mwb;
	private String hwb;
	private String flightno;
	private String arrivaldate;
	private String customsoffice;
	private String errorcode1;
	private String errorcode2;
	private String errorcode3;
	private String errorcode4;
	private String errorcode5;
	private String senderid;
	private String senderqualifier;
	private String receiverid;
	private String receiverqualifier;
	private String errorcode6;
	private String errorcode7;
	private String errorcode8;
	private String errorcode9;
	private String impMwb;
	private String impHwb;
	private String orgmsgtype;
	private String orgmsgsendercode;
	private String orgmsgid;
	private String responsecode;

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
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getArrivaldate() {
		return this.arrivaldate;
	}
 
	@Override
	public void setArrivaldate(final String arrivaldate) {
		this.arrivaldate = arrivaldate; 
	}
 
	@Override
	public String getCustomsoffice() {
		return this.customsoffice;
	}
 
	@Override
	public void setCustomsoffice(final String customsoffice) {
		this.customsoffice = customsoffice; 
	}
 
	@Override
	public String getErrorcode1() {
		return this.errorcode1;
	}
 
	@Override
	public void setErrorcode1(final String errorcode1) {
		this.errorcode1 = errorcode1; 
	}
 
	@Override
	public String getErrorcode2() {
		return this.errorcode2;
	}
 
	@Override
	public void setErrorcode2(final String errorcode2) {
		this.errorcode2 = errorcode2; 
	}
 
	@Override
	public String getErrorcode3() {
		return this.errorcode3;
	}
 
	@Override
	public void setErrorcode3(final String errorcode3) {
		this.errorcode3 = errorcode3; 
	}
 
	@Override
	public String getErrorcode4() {
		return this.errorcode4;
	}
 
	@Override
	public void setErrorcode4(final String errorcode4) {
		this.errorcode4 = errorcode4; 
	}
 
	@Override
	public String getErrorcode5() {
		return this.errorcode5;
	}
 
	@Override
	public void setErrorcode5(final String errorcode5) {
		this.errorcode5 = errorcode5; 
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
	public String getErrorcode6() {
		return this.errorcode6;
	}
 
	@Override
	public void setErrorcode6(final String errorcode6) {
		this.errorcode6 = errorcode6; 
	}
 
	@Override
	public String getErrorcode7() {
		return this.errorcode7;
	}
 
	@Override
	public void setErrorcode7(final String errorcode7) {
		this.errorcode7 = errorcode7; 
	}
 
	@Override
	public String getErrorcode8() {
		return this.errorcode8;
	}
 
	@Override
	public void setErrorcode8(final String errorcode8) {
		this.errorcode8 = errorcode8; 
	}
 
	@Override
	public String getErrorcode9() {
		return this.errorcode9;
	}
 
	@Override
	public void setErrorcode9(final String errorcode9) {
		this.errorcode9 = errorcode9; 
	}
 
	@Override
	public String getImpMwb() {
		return this.impMwb;
	}
 
	@Override
	public void setImpMwb(final String impMwb) {
		this.impMwb = impMwb; 
	}
 
	@Override
	public String getImpHwb() {
		return this.impHwb;
	}
 
	@Override
	public void setImpHwb(final String impHwb) {
		this.impHwb = impHwb; 
	}
 
	@Override
	public String getOrgmsgtype() {
		return this.orgmsgtype;
	}
 
	@Override
	public void setOrgmsgtype(final String orgmsgtype) {
		this.orgmsgtype = orgmsgtype; 
	}
 
	@Override
	public String getOrgmsgsendercode() {
		return this.orgmsgsendercode;
	}
 
	@Override
	public void setOrgmsgsendercode(final String orgmsgsendercode) {
		this.orgmsgsendercode = orgmsgsendercode; 
	}
 
	@Override
	public String getOrgmsgid() {
		return this.orgmsgid;
	}
 
	@Override
	public void setOrgmsgid(final String orgmsgid) {
		this.orgmsgid = orgmsgid; 
	}
 
	@Override
	public String getResponsecode() {
		return this.responsecode;
	}
 
	@Override
	public void setResponsecode(final String responsecode) {
		this.responsecode = responsecode; 
	}
 
}
