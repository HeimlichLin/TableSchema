package com.doc.common.po.impl; 
 
public class Aq$SchedulesPo implements IAq$SchedulesPo {
 
	public enum COLUMNS {
		OID("null"), //
		DESTINATION("null"), //
		START_TIME("null"), //
		DURATION("null"), //
		NEXT_TIME("null"), //
		LATENCY("null"), //
		LAST_TIME("null"), //
		JOBNO("null") //
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
	private String destination;
	private java.sql.Timestamp startTime;
	private String duration;
	private String nextTime;
	private String latency;
	private java.sql.Timestamp lastTime;
	private BigDecimal jobno;

	@Override
	public String getOid() {
		return this.oid;
	}
 
	@Override
	public void setOid(final String oid) {
		this.oid = oid; 
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
	public java.sql.Timestamp getStartTime() {
		return this.startTime;
	}
 
	@Override
	public void setStartTime(final java.sql.Timestamp startTime) {
		this.startTime = startTime; 
	}
 
	@Override
	public String getDuration() {
		return this.duration;
	}
 
	@Override
	public void setDuration(final String duration) {
		this.duration = duration; 
	}
 
	@Override
	public String getNextTime() {
		return this.nextTime;
	}
 
	@Override
	public void setNextTime(final String nextTime) {
		this.nextTime = nextTime; 
	}
 
	@Override
	public String getLatency() {
		return this.latency;
	}
 
	@Override
	public void setLatency(final String latency) {
		this.latency = latency; 
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
	public BigDecimal getJobno() {
		return this.jobno;
	}
 
	@Override
	public void setJobno(final BigDecimal jobno) {
		this.jobno = jobno; 
	}
 
}
