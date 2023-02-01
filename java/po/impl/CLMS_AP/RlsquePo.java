package com.doc.common.po.impl; 
 
public class RlsquePo implements IRlsquePo {
 
	public enum COLUMNS {
		DECL_NO("null"), //
		RLS_DATE("null"), //
		TRANS_ID("null"), //
		ERR_TYPE("null"), //
		RSN("null"), //
		LOG_DATM("null") //
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
 
}
