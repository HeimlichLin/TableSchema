package com.doc.common.po.impl; 
 
public class Def$AqcallPo implements IDef$AqcallPo {
 
	public enum COLUMNS {
		Q_NAME("null"), //
		MSGID("null"), //
		CORRID("null"), //
		PRIORITY("null"), //
		STATE("null"), //
		DELAY("null"), //
		EXPIRATION("null"), //
		TIME_MANAGER_INFO("null"), //
		LOCAL_ORDER_NO("null"), //
		CHAIN_NO("null"), //
		CSCN("null"), //
		DSCN("null"), //
		ENQ_TIME("null"), //
		ENQ_UID("null"), //
		ENQ_TID("null"), //
		DEQ_TIME("null"), //
		DEQ_UID("null"), //
		DEQ_TID("null"), //
		RETRY_COUNT("null"), //
		EXCEPTION_QSCHEMA("null"), //
		EXCEPTION_QUEUE("null"), //
		STEP_NO("null"), //
		RECIPIENT_KEY("null"), //
		DEQUEUE_MSGID("null"), //
		USER_DATA("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String qName;
	private String msgid;
	private String corrid;
	private BigDecimal priority;
	private BigDecimal state;
	private String delay;
	private BigDecimal expiration;
	private String timeManagerInfo;
	private BigDecimal localOrderNo;
	private BigDecimal chainNo;
	private BigDecimal cscn;
	private BigDecimal dscn;
	private String enqTime;
	private BigDecimal enqUid;
	private String enqTid;
	private String deqTime;
	private BigDecimal deqUid;
	private String deqTid;
	private BigDecimal retryCount;
	private String exceptionQschema;
	private String exceptionQueue;
	private BigDecimal stepNo;
	private BigDecimal recipientKey;
	private String dequeueMsgid;
	private String userData;

	@Override
	public String getQName() {
		return this.qName;
	}
 
	@Override
	public void setQName(final String qName) {
		this.qName = qName; 
	}
 
	@Override
	public String getMsgid() {
		return this.msgid;
	}
 
	@Override
	public void setMsgid(final String msgid) {
		this.msgid = msgid; 
	}
 
	@Override
	public String getCorrid() {
		return this.corrid;
	}
 
	@Override
	public void setCorrid(final String corrid) {
		this.corrid = corrid; 
	}
 
	@Override
	public BigDecimal getPriority() {
		return this.priority;
	}
 
	@Override
	public void setPriority(final BigDecimal priority) {
		this.priority = priority; 
	}
 
	@Override
	public BigDecimal getState() {
		return this.state;
	}
 
	@Override
	public void setState(final BigDecimal state) {
		this.state = state; 
	}
 
	@Override
	public String getDelay() {
		return this.delay;
	}
 
	@Override
	public void setDelay(final String delay) {
		this.delay = delay; 
	}
 
	@Override
	public BigDecimal getExpiration() {
		return this.expiration;
	}
 
	@Override
	public void setExpiration(final BigDecimal expiration) {
		this.expiration = expiration; 
	}
 
	@Override
	public String getTimeManagerInfo() {
		return this.timeManagerInfo;
	}
 
	@Override
	public void setTimeManagerInfo(final String timeManagerInfo) {
		this.timeManagerInfo = timeManagerInfo; 
	}
 
	@Override
	public BigDecimal getLocalOrderNo() {
		return this.localOrderNo;
	}
 
	@Override
	public void setLocalOrderNo(final BigDecimal localOrderNo) {
		this.localOrderNo = localOrderNo; 
	}
 
	@Override
	public BigDecimal getChainNo() {
		return this.chainNo;
	}
 
	@Override
	public void setChainNo(final BigDecimal chainNo) {
		this.chainNo = chainNo; 
	}
 
	@Override
	public BigDecimal getCscn() {
		return this.cscn;
	}
 
	@Override
	public void setCscn(final BigDecimal cscn) {
		this.cscn = cscn; 
	}
 
	@Override
	public BigDecimal getDscn() {
		return this.dscn;
	}
 
	@Override
	public void setDscn(final BigDecimal dscn) {
		this.dscn = dscn; 
	}
 
	@Override
	public String getEnqTime() {
		return this.enqTime;
	}
 
	@Override
	public void setEnqTime(final String enqTime) {
		this.enqTime = enqTime; 
	}
 
	@Override
	public BigDecimal getEnqUid() {
		return this.enqUid;
	}
 
	@Override
	public void setEnqUid(final BigDecimal enqUid) {
		this.enqUid = enqUid; 
	}
 
	@Override
	public String getEnqTid() {
		return this.enqTid;
	}
 
	@Override
	public void setEnqTid(final String enqTid) {
		this.enqTid = enqTid; 
	}
 
	@Override
	public String getDeqTime() {
		return this.deqTime;
	}
 
	@Override
	public void setDeqTime(final String deqTime) {
		this.deqTime = deqTime; 
	}
 
	@Override
	public BigDecimal getDeqUid() {
		return this.deqUid;
	}
 
	@Override
	public void setDeqUid(final BigDecimal deqUid) {
		this.deqUid = deqUid; 
	}
 
	@Override
	public String getDeqTid() {
		return this.deqTid;
	}
 
	@Override
	public void setDeqTid(final String deqTid) {
		this.deqTid = deqTid; 
	}
 
	@Override
	public BigDecimal getRetryCount() {
		return this.retryCount;
	}
 
	@Override
	public void setRetryCount(final BigDecimal retryCount) {
		this.retryCount = retryCount; 
	}
 
	@Override
	public String getExceptionQschema() {
		return this.exceptionQschema;
	}
 
	@Override
	public void setExceptionQschema(final String exceptionQschema) {
		this.exceptionQschema = exceptionQschema; 
	}
 
	@Override
	public String getExceptionQueue() {
		return this.exceptionQueue;
	}
 
	@Override
	public void setExceptionQueue(final String exceptionQueue) {
		this.exceptionQueue = exceptionQueue; 
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
	public BigDecimal getRecipientKey() {
		return this.recipientKey;
	}
 
	@Override
	public void setRecipientKey(final BigDecimal recipientKey) {
		this.recipientKey = recipientKey; 
	}
 
	@Override
	public String getDequeueMsgid() {
		return this.dequeueMsgid;
	}
 
	@Override
	public void setDequeueMsgid(final String dequeueMsgid) {
		this.dequeueMsgid = dequeueMsgid; 
	}
 
	@Override
	public String getUserData() {
		return this.userData;
	}
 
	@Override
	public void setUserData(final String userData) {
		this.userData = userData; 
	}
 
}
