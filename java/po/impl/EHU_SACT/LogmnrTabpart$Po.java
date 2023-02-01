package com.doc.common.po.impl; 
 
public class LogmnrTabpart$Po implements ILogmnrTabpart$Po {
 
	public enum COLUMNS {
		OBJ#("null"), //
		TS#("null"), //
		PART#("null"), //
		BO#("null"), //
		LOGMNR_UID("null"), //
		LOGMNR_FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal obj#;
	private BigDecimal ts#;
	private BigDecimal part#;
	private BigDecimal bo#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
	}
 
	@Override
	public BigDecimal getTs#() {
		return this.ts#;
	}
 
	@Override
	public void setTs#(final BigDecimal ts#) {
		this.ts# = ts#; 
	}
 
	@Override
	public BigDecimal getPart#() {
		return this.part#;
	}
 
	@Override
	public void setPart#(final BigDecimal part#) {
		this.part# = part#; 
	}
 
	@Override
	public BigDecimal getBo#() {
		return this.bo#;
	}
 
	@Override
	public void setBo#(final BigDecimal bo#) {
		this.bo# = bo#; 
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
	public BigDecimal getLogmnrFlags() {
		return this.logmnrFlags;
	}
 
	@Override
	public void setLogmnrFlags(final BigDecimal logmnrFlags) {
		this.logmnrFlags = logmnrFlags; 
	}
 
}
