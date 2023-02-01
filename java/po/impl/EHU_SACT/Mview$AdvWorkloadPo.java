package com.doc.common.po.impl; 
 
public class Mview$AdvWorkloadPo implements IMview$AdvWorkloadPo {
 
	public enum COLUMNS {
		QUERYID#("null"), //
		COLLECTIONID#("null"), //
		COLLECTTIME("null"), //
		APPLICATION("null"), //
		CARDINALITY("null"), //
		RESULTSIZE("null"), //
		UNAME("null"), //
		QDATE("null"), //
		PRIORITY("null"), //
		EXEC_TIME("null"), //
		SQL_TEXT("null"), //
		SQL_TEXTLEN("null"), //
		SQL_HASH("null"), //
		SQL_ADDR("null"), //
		FREQUENCY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal queryid#;
	private BigDecimal collectionid#;
	private java.sql.Timestamp collecttime;
	private String application;
	private BigDecimal cardinality;
	private BigDecimal resultsize;
	private String uname;
	private java.sql.Timestamp qdate;
	private BigDecimal priority;
	private BigDecimal execTime;
	private String sqlText;
	private BigDecimal sqlTextlen;
	private BigDecimal sqlHash;
	private String sqlAddr;
	private BigDecimal frequency;

	@Override
	public BigDecimal getQueryid#() {
		return this.queryid#;
	}
 
	@Override
	public void setQueryid#(final BigDecimal queryid#) {
		this.queryid# = queryid#; 
	}
 
	@Override
	public BigDecimal getCollectionid#() {
		return this.collectionid#;
	}
 
	@Override
	public void setCollectionid#(final BigDecimal collectionid#) {
		this.collectionid# = collectionid#; 
	}
 
	@Override
	public java.sql.Timestamp getCollecttime() {
		return this.collecttime;
	}
 
	@Override
	public void setCollecttime(final java.sql.Timestamp collecttime) {
		this.collecttime = collecttime; 
	}
 
	@Override
	public String getApplication() {
		return this.application;
	}
 
	@Override
	public void setApplication(final String application) {
		this.application = application; 
	}
 
	@Override
	public BigDecimal getCardinality() {
		return this.cardinality;
	}
 
	@Override
	public void setCardinality(final BigDecimal cardinality) {
		this.cardinality = cardinality; 
	}
 
	@Override
	public BigDecimal getResultsize() {
		return this.resultsize;
	}
 
	@Override
	public void setResultsize(final BigDecimal resultsize) {
		this.resultsize = resultsize; 
	}
 
	@Override
	public String getUname() {
		return this.uname;
	}
 
	@Override
	public void setUname(final String uname) {
		this.uname = uname; 
	}
 
	@Override
	public java.sql.Timestamp getQdate() {
		return this.qdate;
	}
 
	@Override
	public void setQdate(final java.sql.Timestamp qdate) {
		this.qdate = qdate; 
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
	public BigDecimal getExecTime() {
		return this.execTime;
	}
 
	@Override
	public void setExecTime(final BigDecimal execTime) {
		this.execTime = execTime; 
	}
 
	@Override
	public String getSqlText() {
		return this.sqlText;
	}
 
	@Override
	public void setSqlText(final String sqlText) {
		this.sqlText = sqlText; 
	}
 
	@Override
	public BigDecimal getSqlTextlen() {
		return this.sqlTextlen;
	}
 
	@Override
	public void setSqlTextlen(final BigDecimal sqlTextlen) {
		this.sqlTextlen = sqlTextlen; 
	}
 
	@Override
	public BigDecimal getSqlHash() {
		return this.sqlHash;
	}
 
	@Override
	public void setSqlHash(final BigDecimal sqlHash) {
		this.sqlHash = sqlHash; 
	}
 
	@Override
	public String getSqlAddr() {
		return this.sqlAddr;
	}
 
	@Override
	public void setSqlAddr(final String sqlAddr) {
		this.sqlAddr = sqlAddr; 
	}
 
	@Override
	public BigDecimal getFrequency() {
		return this.frequency;
	}
 
	@Override
	public void setFrequency(final BigDecimal frequency) {
		this.frequency = frequency; 
	}
 
}
