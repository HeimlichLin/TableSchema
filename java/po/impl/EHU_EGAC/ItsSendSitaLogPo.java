package com.doc.common.po.impl; 
 
public class ItsSendSitaLogPo implements IItsSendSitaLogPo {
 
	public enum COLUMNS {
		DATE_TIME("null"), //
		STATUS("null"), //
		DES("null"), //
		SEQ("null"), //
		DAT_MSG_LOG("null"), //
		COD_SEQ_NUM("null"), //
		MINT_NUM("null"), //
		SITA_NUM("null"), //
		DES_ERR("null"), //
		RETURN_DATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp dateTime;
	private String status;
	private String des;
	private BigDecimal seq;
	private java.sql.Timestamp datMsgLog;
	private String codSeqNum;
	private String mintNum;
	private String sitaNum;
	private String desErr;
	private String returnDate;

	@Override
	public java.sql.Timestamp getDateTime() {
		return this.dateTime;
	}
 
	@Override
	public void setDateTime(final java.sql.Timestamp dateTime) {
		this.dateTime = dateTime; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getDes() {
		return this.des;
	}
 
	@Override
	public void setDes(final String des) {
		this.des = des; 
	}
 
	@Override
	public BigDecimal getSeq() {
		return this.seq;
	}
 
	@Override
	public void setSeq(final BigDecimal seq) {
		this.seq = seq; 
	}
 
	@Override
	public java.sql.Timestamp getDatMsgLog() {
		return this.datMsgLog;
	}
 
	@Override
	public void setDatMsgLog(final java.sql.Timestamp datMsgLog) {
		this.datMsgLog = datMsgLog; 
	}
 
	@Override
	public String getCodSeqNum() {
		return this.codSeqNum;
	}
 
	@Override
	public void setCodSeqNum(final String codSeqNum) {
		this.codSeqNum = codSeqNum; 
	}
 
	@Override
	public String getMintNum() {
		return this.mintNum;
	}
 
	@Override
	public void setMintNum(final String mintNum) {
		this.mintNum = mintNum; 
	}
 
	@Override
	public String getSitaNum() {
		return this.sitaNum;
	}
 
	@Override
	public void setSitaNum(final String sitaNum) {
		this.sitaNum = sitaNum; 
	}
 
	@Override
	public String getDesErr() {
		return this.desErr;
	}
 
	@Override
	public void setDesErr(final String desErr) {
		this.desErr = desErr; 
	}
 
	@Override
	public String getReturnDate() {
		return this.returnDate;
	}
 
	@Override
	public void setReturnDate(final String returnDate) {
		this.returnDate = returnDate; 
	}
 
}
