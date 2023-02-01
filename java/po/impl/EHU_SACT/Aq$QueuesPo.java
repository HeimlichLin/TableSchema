package com.doc.common.po.impl; 
 
public class Aq$QueuesPo implements IAq$QueuesPo {
 
	public enum COLUMNS {
		OID("null"), //
		EVENTID("null"), //
		NAME("null"), //
		TABLE_OBJNO("null"), //
		USAGE("null"), //
		ENABLE_FLAG("null"), //
		MAX_RETRIES("null"), //
		RETRY_DELAY("null"), //
		PROPERTIES("null"), //
		RET_TIME("null"), //
		QUEUE_COMMENT("null"), //
		SUBSCRIBERS("null"), //
		MEMORY_THRESHOLD("null"), //
		SERVICE_NAME("null"), //
		NETWORK_NAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String oid;
	private BigDecimal eventid;
	private String name;
	private BigDecimal tableObjno;
	private BigDecimal usage;
	private BigDecimal enableFlag;
	private BigDecimal maxRetries;
	private BigDecimal retryDelay;
	private BigDecimal properties;
	private BigDecimal retTime;
	private String queueComment;
	private String subscribers;
	private BigDecimal memoryThreshold;
	private String serviceName;
	private String networkName;

	@Override
	public String getOid() {
		return this.oid;
	}
 
	@Override
	public void setOid(final String oid) {
		this.oid = oid; 
	}
 
	@Override
	public BigDecimal getEventid() {
		return this.eventid;
	}
 
	@Override
	public void setEventid(final BigDecimal eventid) {
		this.eventid = eventid; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getTableObjno() {
		return this.tableObjno;
	}
 
	@Override
	public void setTableObjno(final BigDecimal tableObjno) {
		this.tableObjno = tableObjno; 
	}
 
	@Override
	public BigDecimal getUsage() {
		return this.usage;
	}
 
	@Override
	public void setUsage(final BigDecimal usage) {
		this.usage = usage; 
	}
 
	@Override
	public BigDecimal getEnableFlag() {
		return this.enableFlag;
	}
 
	@Override
	public void setEnableFlag(final BigDecimal enableFlag) {
		this.enableFlag = enableFlag; 
	}
 
	@Override
	public BigDecimal getMaxRetries() {
		return this.maxRetries;
	}
 
	@Override
	public void setMaxRetries(final BigDecimal maxRetries) {
		this.maxRetries = maxRetries; 
	}
 
	@Override
	public BigDecimal getRetryDelay() {
		return this.retryDelay;
	}
 
	@Override
	public void setRetryDelay(final BigDecimal retryDelay) {
		this.retryDelay = retryDelay; 
	}
 
	@Override
	public BigDecimal getProperties() {
		return this.properties;
	}
 
	@Override
	public void setProperties(final BigDecimal properties) {
		this.properties = properties; 
	}
 
	@Override
	public BigDecimal getRetTime() {
		return this.retTime;
	}
 
	@Override
	public void setRetTime(final BigDecimal retTime) {
		this.retTime = retTime; 
	}
 
	@Override
	public String getQueueComment() {
		return this.queueComment;
	}
 
	@Override
	public void setQueueComment(final String queueComment) {
		this.queueComment = queueComment; 
	}
 
	@Override
	public String getSubscribers() {
		return this.subscribers;
	}
 
	@Override
	public void setSubscribers(final String subscribers) {
		this.subscribers = subscribers; 
	}
 
	@Override
	public BigDecimal getMemoryThreshold() {
		return this.memoryThreshold;
	}
 
	@Override
	public void setMemoryThreshold(final BigDecimal memoryThreshold) {
		this.memoryThreshold = memoryThreshold; 
	}
 
	@Override
	public String getServiceName() {
		return this.serviceName;
	}
 
	@Override
	public void setServiceName(final String serviceName) {
		this.serviceName = serviceName; 
	}
 
	@Override
	public String getNetworkName() {
		return this.networkName;
	}
 
	@Override
	public void setNetworkName(final String networkName) {
		this.networkName = networkName; 
	}
 
}
