package com.doc.common.bean; 
 
public class HDelokDo { 
 
	public enum COLUMNS { 
		LOGTABLE("null"), 
		DELCNT("null"), 
		OKFLG("null"), 
		LOGTIME("null") 
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
	private BigDecimal delcnt; 
	private String okflg; 
	private String logtime; 
	
	public String getLogtable() { 
		return logtable; 
	} 
 
	public void setLogtable(String logtable) { 
		this.logtable = logtable; 
	} 
 
	public BigDecimal getDelcnt() { 
		return delcnt; 
	} 
 
	public void setDelcnt(BigDecimal delcnt) { 
		this.delcnt = delcnt; 
	} 
 
	public String getOkflg() { 
		return okflg; 
	} 
 
	public void setOkflg(String okflg) { 
		this.okflg = okflg; 
	} 
 
	public String getLogtime() { 
		return logtime; 
	} 
 
	public void setLogtime(String logtime) { 
		this.logtime = logtime; 
	} 
 
} 
