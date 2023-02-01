package com.doc.common.po.impl; 
 
public class LogmnrcGsbaPo implements ILogmnrcGsbaPo {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		AS_OF_SCN("null"), //
		FDO_LENGTH("null"), //
		FDO_VALUE("null"), //
		CHARSETID("null"), //
		NCHARSETID("null"), //
		DBTIMEZONE_LEN("null"), //
		DBTIMEZONE_VALUE("null"), //
		LOGMNR_SPARE1("null"), //
		LOGMNR_SPARE2("null"), //
		LOGMNR_SPARE3("null"), //
		LOGMNR_SPARE4("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal logmnrUid;
	private BigDecimal asOfScn;
	private BigDecimal fdoLength;
	private String fdoValue;
	private BigDecimal charsetid;
	private BigDecimal ncharsetid;
	private BigDecimal dbtimezoneLen;
	private String dbtimezoneValue;
	private BigDecimal logmnrSpare1;
	private BigDecimal logmnrSpare2;
	private String logmnrSpare3;
	private java.sql.Timestamp logmnrSpare4;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getAsOfScn() {
		return this.asOfScn;
	}
 
	@Override
	public void setAsOfScn(final BigDecimal asOfScn) {
		this.asOfScn = asOfScn; 
	}
 
	@Override
	public BigDecimal getFdoLength() {
		return this.fdoLength;
	}
 
	@Override
	public void setFdoLength(final BigDecimal fdoLength) {
		this.fdoLength = fdoLength; 
	}
 
	@Override
	public String getFdoValue() {
		return this.fdoValue;
	}
 
	@Override
	public void setFdoValue(final String fdoValue) {
		this.fdoValue = fdoValue; 
	}
 
	@Override
	public BigDecimal getCharsetid() {
		return this.charsetid;
	}
 
	@Override
	public void setCharsetid(final BigDecimal charsetid) {
		this.charsetid = charsetid; 
	}
 
	@Override
	public BigDecimal getNcharsetid() {
		return this.ncharsetid;
	}
 
	@Override
	public void setNcharsetid(final BigDecimal ncharsetid) {
		this.ncharsetid = ncharsetid; 
	}
 
	@Override
	public BigDecimal getDbtimezoneLen() {
		return this.dbtimezoneLen;
	}
 
	@Override
	public void setDbtimezoneLen(final BigDecimal dbtimezoneLen) {
		this.dbtimezoneLen = dbtimezoneLen; 
	}
 
	@Override
	public String getDbtimezoneValue() {
		return this.dbtimezoneValue;
	}
 
	@Override
	public void setDbtimezoneValue(final String dbtimezoneValue) {
		this.dbtimezoneValue = dbtimezoneValue; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare1() {
		return this.logmnrSpare1;
	}
 
	@Override
	public void setLogmnrSpare1(final BigDecimal logmnrSpare1) {
		this.logmnrSpare1 = logmnrSpare1; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare2() {
		return this.logmnrSpare2;
	}
 
	@Override
	public void setLogmnrSpare2(final BigDecimal logmnrSpare2) {
		this.logmnrSpare2 = logmnrSpare2; 
	}
 
	@Override
	public String getLogmnrSpare3() {
		return this.logmnrSpare3;
	}
 
	@Override
	public void setLogmnrSpare3(final String logmnrSpare3) {
		this.logmnrSpare3 = logmnrSpare3; 
	}
 
	@Override
	public java.sql.Timestamp getLogmnrSpare4() {
		return this.logmnrSpare4;
	}
 
	@Override
	public void setLogmnrSpare4(final java.sql.Timestamp logmnrSpare4) {
		this.logmnrSpare4 = logmnrSpare4; 
	}
 
}
