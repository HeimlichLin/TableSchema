package com.doc.common.po.impl; 
 
public class Repcat$ResolStatsControlPo implements IRepcat$ResolStatsControlPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		CREATED("Timestamp for which statistics collection was first started"), //
		STATUS("Status of statistics collection: ACTIVE, CANCELLED"), //
		STATUS_UPDATE_DATE("Timestamp for which the status was last updated"), //
		PURGED_DATE("Timestamp for the last purge of statistics data"), //
		LAST_PURGE_START_DATE("The last start date of the statistics purging date range"), //
		LAST_PURGE_END_DATE("The last end date of the statistics purging date range") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private java.sql.Timestamp created;
	private BigDecimal status;
	private java.sql.Timestamp statusUpdateDate;
	private java.sql.Timestamp purgedDate;
	private java.sql.Timestamp lastPurgeStartDate;
	private java.sql.Timestamp lastPurgeEndDate;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public java.sql.Timestamp getCreated() {
		return this.created;
	}
 
	@Override
	public void setCreated(final java.sql.Timestamp created) {
		this.created = created; 
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
	public java.sql.Timestamp getStatusUpdateDate() {
		return this.statusUpdateDate;
	}
 
	@Override
	public void setStatusUpdateDate(final java.sql.Timestamp statusUpdateDate) {
		this.statusUpdateDate = statusUpdateDate; 
	}
 
	@Override
	public java.sql.Timestamp getPurgedDate() {
		return this.purgedDate;
	}
 
	@Override
	public void setPurgedDate(final java.sql.Timestamp purgedDate) {
		this.purgedDate = purgedDate; 
	}
 
	@Override
	public java.sql.Timestamp getLastPurgeStartDate() {
		return this.lastPurgeStartDate;
	}
 
	@Override
	public void setLastPurgeStartDate(final java.sql.Timestamp lastPurgeStartDate) {
		this.lastPurgeStartDate = lastPurgeStartDate; 
	}
 
	@Override
	public java.sql.Timestamp getLastPurgeEndDate() {
		return this.lastPurgeEndDate;
	}
 
	@Override
	public void setLastPurgeEndDate(final java.sql.Timestamp lastPurgeEndDate) {
		this.lastPurgeEndDate = lastPurgeEndDate; 
	}
 
}
