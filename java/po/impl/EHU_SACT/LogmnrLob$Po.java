package com.doc.common.po.impl; 
 
public class LogmnrLob$Po implements ILogmnrLob$Po {
 
	public enum COLUMNS {
		OBJ#("null"), //
		INTCOL#("null"), //
		COL#("null"), //
		LOBJ#("null"), //
		CHUNK("null"), //
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
	private BigDecimal intcol#;
	private BigDecimal col#;
	private BigDecimal lobj#;
	private BigDecimal chunk;
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
	public BigDecimal getIntcol#() {
		return this.intcol#;
	}
 
	@Override
	public void setIntcol#(final BigDecimal intcol#) {
		this.intcol# = intcol#; 
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
	public BigDecimal getLobj#() {
		return this.lobj#;
	}
 
	@Override
	public void setLobj#(final BigDecimal lobj#) {
		this.lobj# = lobj#; 
	}
 
	@Override
	public BigDecimal getChunk() {
		return this.chunk;
	}
 
	@Override
	public void setChunk(final BigDecimal chunk) {
		this.chunk = chunk; 
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
