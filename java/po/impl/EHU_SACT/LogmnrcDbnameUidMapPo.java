package com.doc.common.po.impl; 
 
public class LogmnrcDbnameUidMapPo implements ILogmnrcDbnameUidMapPo {
 
	public enum COLUMNS {
		GLOBAL_NAME("null"), //
		LOGMNR_UID("null"), //
		FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String globalName;
	private BigDecimal logmnrUid;
	private BigDecimal flags;

	@Override
	public String getGlobalName() {
		return this.globalName;
	}
 
	@Override
	public void setGlobalName(final String globalName) {
		this.globalName = globalName; 
	}
 
	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
}
