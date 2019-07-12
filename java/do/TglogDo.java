package com.doc.common.bean; 
 
public class TglogDo { 
 
	public enum COLUMNS { 
		LOG_PGM("程式名稱"), 
		LOG_ACTION("ACTION"), 
		LOG_ERROR("錯誤"), 
		LOG_DATM("時間"), 
		LOG1("null"), 
		LOG2("null"), 
		LOG3("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String logPgm; 
	private String logAction; 
	private String logError; 
	private String logDatm; 
	private String log1; 
	private String log2; 
	private String log3; 
	
	public String getLogPgm() { 
		return logPgm; 
	} 
 
	public void setLogPgm(String logPgm) { 
		this.logPgm = logPgm; 
	} 
 
	public String getLogAction() { 
		return logAction; 
	} 
 
	public void setLogAction(String logAction) { 
		this.logAction = logAction; 
	} 
 
	public String getLogError() { 
		return logError; 
	} 
 
	public void setLogError(String logError) { 
		this.logError = logError; 
	} 
 
	public String getLogDatm() { 
		return logDatm; 
	} 
 
	public void setLogDatm(String logDatm) { 
		this.logDatm = logDatm; 
	} 
 
	public String getLog1() { 
		return log1; 
	} 
 
	public void setLog1(String log1) { 
		this.log1 = log1; 
	} 
 
	public String getLog2() { 
		return log2; 
	} 
 
	public void setLog2(String log2) { 
		this.log2 = log2; 
	} 
 
	public String getLog3() { 
		return log3; 
	} 
 
	public void setLog3(String log3) { 
		this.log3 = log3; 
	} 
 
} 
