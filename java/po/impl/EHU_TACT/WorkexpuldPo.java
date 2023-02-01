package com.doc.common.po.impl; 
 
public class WorkexpuldPo implements IWorkexpuldPo {
 
	public enum COLUMNS {
		CONTAINER("null"), //
		CREATEDATE("null"), //
		TOTALWEIGHT("null"), //
		UPDATEUSER("null"), //
		LASTUPDATE("null"), //
		SENDTIME("null"), //
		WORKAREA("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String container;
	private java.sql.Timestamp createdate;
	private BigDecimal totalweight;
	private String updateuser;
	private java.sql.Timestamp lastupdate;
	private java.sql.Timestamp sendtime;
	private String workarea;

	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
	@Override
	public java.sql.Timestamp getCreatedate() {
		return this.createdate;
	}
 
	@Override
	public void setCreatedate(final java.sql.Timestamp createdate) {
		this.createdate = createdate; 
	}
 
	@Override
	public BigDecimal getTotalweight() {
		return this.totalweight;
	}
 
	@Override
	public void setTotalweight(final BigDecimal totalweight) {
		this.totalweight = totalweight; 
	}
 
	@Override
	public String getUpdateuser() {
		return this.updateuser;
	}
 
	@Override
	public void setUpdateuser(final String updateuser) {
		this.updateuser = updateuser; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public java.sql.Timestamp getSendtime() {
		return this.sendtime;
	}
 
	@Override
	public void setSendtime(final java.sql.Timestamp sendtime) {
		this.sendtime = sendtime; 
	}
 
	@Override
	public String getWorkarea() {
		return this.workarea;
	}
 
	@Override
	public void setWorkarea(final String workarea) {
		this.workarea = workarea; 
	}
 
}
