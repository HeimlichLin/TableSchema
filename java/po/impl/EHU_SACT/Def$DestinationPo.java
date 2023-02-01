package com.doc.common.po.impl; 
 
public class Def$DestinationPo implements IDef$DestinationPo {
 
	public enum COLUMNS {
		DBLINK("Destination"), //
		LAST_DELIVERED("Value of delivery_order of last transaction propagated"), //
		LAST_ENQ_TID("Transaction ID of last transaction propagated"), //
		LAST_SEQ("Parallel prop seq number of last transaction propagated"), //
		DISABLED("Is propagation to destination disabled"), //
		JOB("Number of job that pushes queue"), //
		LAST_TXN_COUNT("Number of transactions pushed during last attempt"), //
		LAST_ERROR_NUMBER("Oracle error number from last push"), //
		LAST_ERROR_MESSAGE("Error message from last push"), //
		APPLY_INIT("null"), //
		CATCHUP("Used to break transaction into pieces"), //
		ALTERNATE("Used to break transaction into pieces"), //
		TOTAL_TXN_COUNT("Total number of transactions pushed"), //
		TOTAL_PROP_TIME_THROUGHPUT("Total propagation time in seconds for measuring throughput"), //
		TOTAL_PROP_TIME_LATENCY("Total propagation time in seconds for measuring latency"), //
		TO_COMMUNICATION_SIZE("Total number of bytes sent to this dblink"), //
		FROM_COMMUNICATION_SIZE("Total number of bytes received from this dblink"), //
		FLAG("null"), //
		SPARE1("Total number of round trips for this dblink"), //
		SPARE2("Total number of administrative requests"), //
		SPARE3("Total number of error transactions pushed"), //
		SPARE4("Total time in seconds spent sleeping during push") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dblink;
	private BigDecimal lastDelivered;
	private String lastEnqTid;
	private BigDecimal lastSeq;
	private String disabled;
	private BigDecimal job;
	private BigDecimal lastTxnCount;
	private BigDecimal lastErrorNumber;
	private String lastErrorMessage;
	private String applyInit;
	private String catchup;
	private String alternate;
	private BigDecimal totalTxnCount;
	private BigDecimal totalPropTimeThroughput;
	private BigDecimal totalPropTimeLatency;
	private BigDecimal toCommunicationSize;
	private BigDecimal fromCommunicationSize;
	private String flag;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private BigDecimal spare4;

	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
	@Override
	public BigDecimal getLastDelivered() {
		return this.lastDelivered;
	}
 
	@Override
	public void setLastDelivered(final BigDecimal lastDelivered) {
		this.lastDelivered = lastDelivered; 
	}
 
	@Override
	public String getLastEnqTid() {
		return this.lastEnqTid;
	}
 
	@Override
	public void setLastEnqTid(final String lastEnqTid) {
		this.lastEnqTid = lastEnqTid; 
	}
 
	@Override
	public BigDecimal getLastSeq() {
		return this.lastSeq;
	}
 
	@Override
	public void setLastSeq(final BigDecimal lastSeq) {
		this.lastSeq = lastSeq; 
	}
 
	@Override
	public String getDisabled() {
		return this.disabled;
	}
 
	@Override
	public void setDisabled(final String disabled) {
		this.disabled = disabled; 
	}
 
	@Override
	public BigDecimal getJob() {
		return this.job;
	}
 
	@Override
	public void setJob(final BigDecimal job) {
		this.job = job; 
	}
 
	@Override
	public BigDecimal getLastTxnCount() {
		return this.lastTxnCount;
	}
 
	@Override
	public void setLastTxnCount(final BigDecimal lastTxnCount) {
		this.lastTxnCount = lastTxnCount; 
	}
 
	@Override
	public BigDecimal getLastErrorNumber() {
		return this.lastErrorNumber;
	}
 
	@Override
	public void setLastErrorNumber(final BigDecimal lastErrorNumber) {
		this.lastErrorNumber = lastErrorNumber; 
	}
 
	@Override
	public String getLastErrorMessage() {
		return this.lastErrorMessage;
	}
 
	@Override
	public void setLastErrorMessage(final String lastErrorMessage) {
		this.lastErrorMessage = lastErrorMessage; 
	}
 
	@Override
	public String getApplyInit() {
		return this.applyInit;
	}
 
	@Override
	public void setApplyInit(final String applyInit) {
		this.applyInit = applyInit; 
	}
 
	@Override
	public String getCatchup() {
		return this.catchup;
	}
 
	@Override
	public void setCatchup(final String catchup) {
		this.catchup = catchup; 
	}
 
	@Override
	public String getAlternate() {
		return this.alternate;
	}
 
	@Override
	public void setAlternate(final String alternate) {
		this.alternate = alternate; 
	}
 
	@Override
	public BigDecimal getTotalTxnCount() {
		return this.totalTxnCount;
	}
 
	@Override
	public void setTotalTxnCount(final BigDecimal totalTxnCount) {
		this.totalTxnCount = totalTxnCount; 
	}
 
	@Override
	public BigDecimal getTotalPropTimeThroughput() {
		return this.totalPropTimeThroughput;
	}
 
	@Override
	public void setTotalPropTimeThroughput(final BigDecimal totalPropTimeThroughput) {
		this.totalPropTimeThroughput = totalPropTimeThroughput; 
	}
 
	@Override
	public BigDecimal getTotalPropTimeLatency() {
		return this.totalPropTimeLatency;
	}
 
	@Override
	public void setTotalPropTimeLatency(final BigDecimal totalPropTimeLatency) {
		this.totalPropTimeLatency = totalPropTimeLatency; 
	}
 
	@Override
	public BigDecimal getToCommunicationSize() {
		return this.toCommunicationSize;
	}
 
	@Override
	public void setToCommunicationSize(final BigDecimal toCommunicationSize) {
		this.toCommunicationSize = toCommunicationSize; 
	}
 
	@Override
	public BigDecimal getFromCommunicationSize() {
		return this.fromCommunicationSize;
	}
 
	@Override
	public void setFromCommunicationSize(final BigDecimal fromCommunicationSize) {
		this.fromCommunicationSize = fromCommunicationSize; 
	}
 
	@Override
	public String getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final String flag) {
		this.flag = flag; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
	}
 
	@Override
	public BigDecimal getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final BigDecimal spare3) {
		this.spare3 = spare3; 
	}
 
	@Override
	public BigDecimal getSpare4() {
		return this.spare4;
	}
 
	@Override
	public void setSpare4(final BigDecimal spare4) {
		this.spare4 = spare4; 
	}
 
}
