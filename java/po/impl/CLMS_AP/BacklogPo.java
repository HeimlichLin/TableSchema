package com.doc.common.po.impl; 
 
public class BacklogPo implements IBacklogPo {
 
	public enum COLUMNS {
		LOGTABLE("null"), //
		INSCNT("null"), //
		DELCNT("null"), //
		LOGTIME("null"), //
		BACKUPDATE("null"), //
		EXPDATE("null"), //
		CLEARDATE("null"), //
		CLEARDATE2("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String logtable;
	private BigDecimal inscnt;
	private BigDecimal delcnt;
	private String logtime;
	private String backupdate;
	private String expdate;
	private String cleardate;
	private String cleardate2;

	@Override
	public String getLogtable() {
		return this.logtable;
	}
 
	@Override
	public void setLogtable(final String logtable) {
		this.logtable = logtable; 
	}
 
	@Override
	public BigDecimal getInscnt() {
		return this.inscnt;
	}
 
	@Override
	public void setInscnt(final BigDecimal inscnt) {
		this.inscnt = inscnt; 
	}
 
	@Override
	public BigDecimal getDelcnt() {
		return this.delcnt;
	}
 
	@Override
	public void setDelcnt(final BigDecimal delcnt) {
		this.delcnt = delcnt; 
	}
 
	@Override
	public String getLogtime() {
		return this.logtime;
	}
 
	@Override
	public void setLogtime(final String logtime) {
		this.logtime = logtime; 
	}
 
	@Override
	public String getBackupdate() {
		return this.backupdate;
	}
 
	@Override
	public void setBackupdate(final String backupdate) {
		this.backupdate = backupdate; 
	}
 
	@Override
	public String getExpdate() {
		return this.expdate;
	}
 
	@Override
	public void setExpdate(final String expdate) {
		this.expdate = expdate; 
	}
 
	@Override
	public String getCleardate() {
		return this.cleardate;
	}
 
	@Override
	public void setCleardate(final String cleardate) {
		this.cleardate = cleardate; 
	}
 
	@Override
	public String getCleardate2() {
		return this.cleardate2;
	}
 
	@Override
	public void setCleardate2(final String cleardate2) {
		this.cleardate2 = cleardate2; 
	}
 
}
