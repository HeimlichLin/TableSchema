package com.doc.common.po.impl; 
 
public class Repcat$TemplateRefgroupsPo implements IRepcat$TemplateRefgroupsPo {
 
	public enum COLUMNS {
		REFRESH_GROUP_ID("Internal primary key of the refresh groups table."), //
		REFRESH_GROUP_NAME("Name of the refresh group"), //
		REFRESH_TEMPLATE_ID("Primary key of the template containing the refresh group."), //
		ROLLBACK_SEG("Name of the rollback segment to use during refresh."), //
		START_DATE("Refresh start date."), //
		INTERVAL("Refresh interval.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal refreshGroupId;
	private String refreshGroupName;
	private BigDecimal refreshTemplateId;
	private String rollbackSeg;
	private String startDate;
	private String interval;

	@Override
	public BigDecimal getRefreshGroupId() {
		return this.refreshGroupId;
	}
 
	@Override
	public void setRefreshGroupId(final BigDecimal refreshGroupId) {
		this.refreshGroupId = refreshGroupId; 
	}
 
	@Override
	public String getRefreshGroupName() {
		return this.refreshGroupName;
	}
 
	@Override
	public void setRefreshGroupName(final String refreshGroupName) {
		this.refreshGroupName = refreshGroupName; 
	}
 
	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public String getRollbackSeg() {
		return this.rollbackSeg;
	}
 
	@Override
	public void setRollbackSeg(final String rollbackSeg) {
		this.rollbackSeg = rollbackSeg; 
	}
 
	@Override
	public String getStartDate() {
		return this.startDate;
	}
 
	@Override
	public void setStartDate(final String startDate) {
		this.startDate = startDate; 
	}
 
	@Override
	public String getInterval() {
		return this.interval;
	}
 
	@Override
	public void setInterval(final String interval) {
		this.interval = interval; 
	}
 
}
