package com.doc.common.po.impl; 
 
public class LogmnrIndsubpart$Po implements ILogmnrIndsubpart$Po {
 
	public enum COLUMNS {
		OBJ#("null"), //
		DATAOBJ#("null"), //
		POBJ#("null"), //
		SUBPART#("null"), //
		TS#("null"), //
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
	private BigDecimal dataobj#;
	private BigDecimal pobj#;
	private BigDecimal subpart#;
	private BigDecimal ts#;
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
	public BigDecimal getDataobj#() {
		return this.dataobj#;
	}
 
	@Override
	public void setDataobj#(final BigDecimal dataobj#) {
		this.dataobj# = dataobj#; 
	}
 
	@Override
	public BigDecimal getPobj#() {
		return this.pobj#;
	}
 
	@Override
	public void setPobj#(final BigDecimal pobj#) {
		this.pobj# = pobj#; 
	}
 
	@Override
	public BigDecimal getSubpart#() {
		return this.subpart#;
	}
 
	@Override
	public void setSubpart#(final BigDecimal subpart#) {
		this.subpart# = subpart#; 
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
