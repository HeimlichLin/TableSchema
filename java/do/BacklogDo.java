package com.doc.common.bean; 
 
public class BacklogDo { 
 
	public enum COLUMNS { 
		LOGTABLE("null"), 
		INSCNT("null"), 
		DELCNT("null"), 
		LOGTIME("null"), 
		BACKUPDATE("null"), 
		EXPDATE("null"), 
		CLEARDATE("null"), 
		CLEARDATE2("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
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
	
	public String getLogtable() { 
		return logtable; 
	} 
 
	public void setLogtable(String logtable) { 
		this.logtable = logtable; 
	} 
 
	public BigDecimal getInscnt() { 
		return inscnt; 
	} 
 
	public void setInscnt(BigDecimal inscnt) { 
		this.inscnt = inscnt; 
	} 
 
	public BigDecimal getDelcnt() { 
		return delcnt; 
	} 
 
	public void setDelcnt(BigDecimal delcnt) { 
		this.delcnt = delcnt; 
	} 
 
	public String getLogtime() { 
		return logtime; 
	} 
 
	public void setLogtime(String logtime) { 
		this.logtime = logtime; 
	} 
 
	public String getBackupdate() { 
		return backupdate; 
	} 
 
	public void setBackupdate(String backupdate) { 
		this.backupdate = backupdate; 
	} 
 
	public String getExpdate() { 
		return expdate; 
	} 
 
	public void setExpdate(String expdate) { 
		this.expdate = expdate; 
	} 
 
	public String getCleardate() { 
		return cleardate; 
	} 
 
	public void setCleardate(String cleardate) { 
		this.cleardate = cleardate; 
	} 
 
	public String getCleardate2() { 
		return cleardate2; 
	} 
 
	public void setCleardate2(String cleardate2) { 
		this.cleardate2 = cleardate2; 
	} 
 
} 
