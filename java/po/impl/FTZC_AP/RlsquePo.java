package com.doc.common.po.impl; 
 
public class RlsquePo implements IRlsquePo {
 
	public enum COLUMNS {
		DECL_NO("報單號碼"), //
		RLS_DATE("放行日期"), //
		TRANS_ID("交易識別碼"), //
		ERR_TYPE("錯誤類型:W:待送,E:已送"), //
		RSN("錯誤原因"), //
		LOG_DATM("LOG日期"), //
		MSG_TYPE("null"), //
		AS_TYPE("null"), //
		IO_TYPE("null"), //
		MAWB_NO("主提單號"), //
		HAWB_NO("分提單號"), //
		DECL_TYPE("報單類別") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declNo;
	private java.sql.Timestamp rlsDate;
	private String transId;
	private String errType;
	private String rsn;
	private String logDatm;
	private String msgType;
	private String asType;
	private String ioType;
	private String mawbNo;
	private String hawbNo;
	private String declType;

	@Override
	public String getDeclNo() {
		return this.declNo;
	}
 
	@Override
	public void setDeclNo(final String declNo) {
		this.declNo = declNo; 
	}
 
	@Override
	public java.sql.Timestamp getRlsDate() {
		return this.rlsDate;
	}
 
	@Override
	public void setRlsDate(final java.sql.Timestamp rlsDate) {
		this.rlsDate = rlsDate; 
	}
 
	@Override
	public String getTransId() {
		return this.transId;
	}
 
	@Override
	public void setTransId(final String transId) {
		this.transId = transId; 
	}
 
	@Override
	public String getErrType() {
		return this.errType;
	}
 
	@Override
	public void setErrType(final String errType) {
		this.errType = errType; 
	}
 
	@Override
	public String getRsn() {
		return this.rsn;
	}
 
	@Override
	public void setRsn(final String rsn) {
		this.rsn = rsn; 
	}
 
	@Override
	public String getLogDatm() {
		return this.logDatm;
	}
 
	@Override
	public void setLogDatm(final String logDatm) {
		this.logDatm = logDatm; 
	}
 
	@Override
	public String getMsgType() {
		return this.msgType;
	}
 
	@Override
	public void setMsgType(final String msgType) {
		this.msgType = msgType; 
	}
 
	@Override
	public String getAsType() {
		return this.asType;
	}
 
	@Override
	public void setAsType(final String asType) {
		this.asType = asType; 
	}
 
	@Override
	public String getIoType() {
		return this.ioType;
	}
 
	@Override
	public void setIoType(final String ioType) {
		this.ioType = ioType; 
	}
 
	@Override
	public String getMawbNo() {
		return this.mawbNo;
	}
 
	@Override
	public void setMawbNo(final String mawbNo) {
		this.mawbNo = mawbNo; 
	}
 
	@Override
	public String getHawbNo() {
		return this.hawbNo;
	}
 
	@Override
	public void setHawbNo(final String hawbNo) {
		this.hawbNo = hawbNo; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
}
