package com.doc.common.po.impl; 
 
public class LogmnrIcol$Po implements ILogmnrIcol$Po {
 
	public enum COLUMNS {
		OBJ#("null"), //
		BO#("null"), //
		COL#("null"), //
		POS#("null"), //
		SEGCOL#("null"), //
		INTCOL#("null"), //
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
	private BigDecimal bo#;
	private BigDecimal col#;
	private BigDecimal pos#;
	private BigDecimal segcol#;
	private BigDecimal intcol#;
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
	public BigDecimal getBo#() {
		return this.bo#;
	}
 
	@Override
	public void setBo#(final BigDecimal bo#) {
		this.bo# = bo#; 
	}
 
	@Override
	public BigDecimal getCol#() {
		return this.col#;
	}
 
	@Override
	public void setCol#(final BigDecimal col#) {
		this.col# = col#; 
	}
 
	@Override
	public BigDecimal getPos#() {
		return this.pos#;
	}
 
	@Override
	public void setPos#(final BigDecimal pos#) {
		this.pos# = pos#; 
	}
 
	@Override
	public BigDecimal getSegcol#() {
		return this.segcol#;
	}
 
	@Override
	public void setSegcol#(final BigDecimal segcol#) {
		this.segcol# = segcol#; 
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
