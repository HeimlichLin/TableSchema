package com.doc.common.po.impl; 
 
public class Def$ErrorPo implements IDef$ErrorPo {
 
	public enum COLUMNS {
		ENQ_TID("The ID of the transaction that created the error"), //
		ORIGIN_TRAN_DB("The database originating the deferred transaction"), //
		ORIGIN_ENQ_TID("The original ID of the transaction"), //
		DESTINATION("Database link used to address destination"), //
		STEP_NO("Unique ID of call that caused an error"), //
		RECEIVER("User ID of the original receiver"), //
		ENQ_TIME("Time original transaction enqueued"), //
		ERROR_NUMBER("Oracle error number"), //
		ERROR_MSG("Error message text") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String enqTid;
	private String originTranDb;
	private String originEnqTid;
	private String destination;
	private BigDecimal stepNo;
	private BigDecimal receiver;
	private java.sql.Timestamp enqTime;
	private BigDecimal errorNumber;
	private String errorMsg;

	@Override
	public String getEnqTid() {
		return this.enqTid;
	}
 
	@Override
	public void setEnqTid(final String enqTid) {
		this.enqTid = enqTid; 
	}
 
	@Override
	public String getOriginTranDb() {
		return this.originTranDb;
	}
 
	@Override
	public void setOriginTranDb(final String originTranDb) {
		this.originTranDb = originTranDb; 
	}
 
	@Override
	public String getOriginEnqTid() {
		return this.originEnqTid;
	}
 
	@Override
	public void setOriginEnqTid(final String originEnqTid) {
		this.originEnqTid = originEnqTid; 
	}
 
	@Override
	public String getDestination() {
		return this.destination;
	}
 
	@Override
	public void setDestination(final String destination) {
		this.destination = destination; 
	}
 
	@Override
	public BigDecimal getStepNo() {
		return this.stepNo;
	}
 
	@Override
	public void setStepNo(final BigDecimal stepNo) {
		this.stepNo = stepNo; 
	}
 
	@Override
	public BigDecimal getReceiver() {
		return this.receiver;
	}
 
	@Override
	public void setReceiver(final BigDecimal receiver) {
		this.receiver = receiver; 
	}
 
	@Override
	public java.sql.Timestamp getEnqTime() {
		return this.enqTime;
	}
 
	@Override
	public void setEnqTime(final java.sql.Timestamp enqTime) {
		this.enqTime = enqTime; 
	}
 
	@Override
	public BigDecimal getErrorNumber() {
		return this.errorNumber;
	}
 
	@Override
	public void setErrorNumber(final BigDecimal errorNumber) {
		this.errorNumber = errorNumber; 
	}
 
	@Override
	public String getErrorMsg() {
		return this.errorMsg;
	}
 
	@Override
	public void setErrorMsg(final String errorMsg) {
		this.errorMsg = errorMsg; 
	}
 
}
