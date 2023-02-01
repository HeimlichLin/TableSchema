package com.doc.common.po.impl; 
 
public class LogmnrColtype$Po implements ILogmnrColtype$Po {
 
	public enum COLUMNS {
		COL#("null"), //
		INTCOL#("null"), //
		TOID("null"), //
		VERSION#("null"), //
		PACKED("null"), //
		INTCOLS("null"), //
		INTCOL#S("null"), //
		FLAGS("null"), //
		TYPIDCOL#("null"), //
		SYNOBJ#("null"), //
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
	private String toid;
	private BigDecimal version#;
	private BigDecimal packed;
	private BigDecimal intcols;
	private String intcol#s;
	private BigDecimal flags;
	private BigDecimal typidcol#;
	private BigDecimal synobj#;
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
	public String getToid() {
		return this.toid;
	}
 
	@Override
	public void setToid(final String toid) {
		this.toid = toid; 
	}
 
	@Override
	public BigDecimal getVersion#() {
		return this.version#;
	}
 
	@Override
	public void setVersion#(final BigDecimal version#) {
		this.version# = version#; 
	}
 
	@Override
	public BigDecimal getPacked() {
		return this.packed;
	}
 
	@Override
	public void setPacked(final BigDecimal packed) {
		this.packed = packed; 
	}
 
	@Override
	public BigDecimal getIntcols() {
		return this.intcols;
	}
 
	@Override
	public void setIntcols(final BigDecimal intcols) {
		this.intcols = intcols; 
	}
 
	@Override
	public String getIntcol#s() {
		return this.intcol#s;
	}
 
	@Override
	public void setIntcol#s(final String intcol#s) {
		this.intcol#s = intcol#s; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getTypidcol#() {
		return this.typidcol#;
	}
 
	@Override
	public void setTypidcol#(final BigDecimal typidcol#) {
		this.typidcol# = typidcol#; 
	}
 
	@Override
	public BigDecimal getSynobj#() {
		return this.synobj#;
	}
 
	@Override
	public void setSynobj#(final BigDecimal synobj#) {
		this.synobj# = synobj#; 
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
