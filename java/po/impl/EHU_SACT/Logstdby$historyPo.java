package com.doc.common.po.impl; 
 
public class Logstdby$historyPo implements ILogstdby$historyPo {
 
	public enum COLUMNS {
		STREAM_SEQUENCE#("null"), //
		LMNR_SID("null"), //
		DBID("null"), //
		FIRST_CHANGE#("null"), //
		LAST_CHANGE#("null"), //
		SOURCE("null"), //
		STATUS("null"), //
		FIRST_TIME("null"), //
		LAST_TIME("null"), //
		DGNAME("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
		SPARE3("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal streamSequence#;
	private BigDecimal lmnrSid;
	private BigDecimal dbid;
	private BigDecimal firstChange#;
	private BigDecimal lastChange#;
	private BigDecimal source;
	private BigDecimal status;
	private java.sql.Timestamp firstTime;
	private java.sql.Timestamp lastTime;
	private String dgname;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	@Override
	public BigDecimal getStreamSequence#() {
		return this.streamSequence#;
	}
 
	@Override
	public void setStreamSequence#(final BigDecimal streamSequence#) {
		this.streamSequence# = streamSequence#; 
	}
 
	@Override
	public BigDecimal getLmnrSid() {
		return this.lmnrSid;
	}
 
	@Override
	public void setLmnrSid(final BigDecimal lmnrSid) {
		this.lmnrSid = lmnrSid; 
	}
 
	@Override
	public BigDecimal getDbid() {
		return this.dbid;
	}
 
	@Override
	public void setDbid(final BigDecimal dbid) {
		this.dbid = dbid; 
	}
 
	@Override
	public BigDecimal getFirstChange#() {
		return this.firstChange#;
	}
 
	@Override
	public void setFirstChange#(final BigDecimal firstChange#) {
		this.firstChange# = firstChange#; 
	}
 
	@Override
	public BigDecimal getLastChange#() {
		return this.lastChange#;
	}
 
	@Override
	public void setLastChange#(final BigDecimal lastChange#) {
		this.lastChange# = lastChange#; 
	}
 
	@Override
	public BigDecimal getSource() {
		return this.source;
	}
 
	@Override
	public void setSource(final BigDecimal source) {
		this.source = source; 
	}
 
	@Override
	public BigDecimal getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final BigDecimal status) {
		this.status = status; 
	}
 
	@Override
	public java.sql.Timestamp getFirstTime() {
		return this.firstTime;
	}
 
	@Override
	public void setFirstTime(final java.sql.Timestamp firstTime) {
		this.firstTime = firstTime; 
	}
 
	@Override
	public java.sql.Timestamp getLastTime() {
		return this.lastTime;
	}
 
	@Override
	public void setLastTime(final java.sql.Timestamp lastTime) {
		this.lastTime = lastTime; 
	}
 
	@Override
	public String getDgname() {
		return this.dgname;
	}
 
	@Override
	public void setDgname(final String dgname) {
		this.dgname = dgname; 
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
	public String getSpare3() {
		return this.spare3;
	}
 
	@Override
	public void setSpare3(final String spare3) {
		this.spare3 = spare3; 
	}
 
}
