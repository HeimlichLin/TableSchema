package com.doc.common.po.impl; 
 
public class LogmnrRefcon$Po implements ILogmnrRefcon$Po {
 
	public enum COLUMNS {
		COL#("null"), //
		INTCOL#("null"), //
		REFTYP("null"), //
		STABID("null"), //
		EXPCTOID("null"), //
		OBJ#("null"), //
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
 
	private BigDecimal col#;
	private BigDecimal intcol#;
	private BigDecimal reftyp;
	private String stabid;
	private String expctoid;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getCol#() {
		return this.col#;
	}
 
	@Override
	public void setCol#(final BigDecimal col#) {
		this.col# = col#; 
	}
 
	@Override
	public BigDecimal getIntcol#() {
		return this.intcol#;
	}
 
	@Override
	public void setIntcol#(final BigDecimal intcol#) {
		this.intcol# = intcol#; 
	}
 
	@Override
	public BigDecimal getReftyp() {
		return this.reftyp;
	}
 
	@Override
	public void setReftyp(final BigDecimal reftyp) {
		this.reftyp = reftyp; 
	}
 
	@Override
	public String getStabid() {
		return this.stabid;
	}
 
	@Override
	public void setStabid(final String stabid) {
		this.stabid = stabid; 
	}
 
	@Override
	public String getExpctoid() {
		return this.expctoid;
	}
 
	@Override
	public void setExpctoid(final String expctoid) {
		this.expctoid = expctoid; 
	}
 
	@Override
	public BigDecimal getObj#() {
		return this.obj#;
	}
 
	@Override
	public void setObj#(final BigDecimal obj#) {
		this.obj# = obj#; 
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
