package com.doc.common.po.impl; 
 
public class LogmnrCdef$Po implements ILogmnrCdef$Po {
 
	public enum COLUMNS {
		CON#("null"), //
		COLS("null"), //
		TYPE#("null"), //
		ROBJ#("null"), //
		RCON#("null"), //
		ENABLED("null"), //
		DEFER("null"), //
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
 
	private BigDecimal con#;
	private BigDecimal cols;
	private BigDecimal type#;
	private BigDecimal robj#;
	private BigDecimal rcon#;
	private BigDecimal enabled;
	private BigDecimal defer;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getCon#() {
		return this.con#;
	}
 
	@Override
	public void setCon#(final BigDecimal con#) {
		this.con# = con#; 
	}
 
	@Override
	public BigDecimal getCols() {
		return this.cols;
	}
 
	@Override
	public void setCols(final BigDecimal cols) {
		this.cols = cols; 
	}
 
	@Override
	public BigDecimal getType#() {
		return this.type#;
	}
 
	@Override
	public void setType#(final BigDecimal type#) {
		this.type# = type#; 
	}
 
	@Override
	public BigDecimal getRobj#() {
		return this.robj#;
	}
 
	@Override
	public void setRobj#(final BigDecimal robj#) {
		this.robj# = robj#; 
	}
 
	@Override
	public BigDecimal getRcon#() {
		return this.rcon#;
	}
 
	@Override
	public void setRcon#(final BigDecimal rcon#) {
		this.rcon# = rcon#; 
	}
 
	@Override
	public BigDecimal getEnabled() {
		return this.enabled;
	}
 
	@Override
	public void setEnabled(final BigDecimal enabled) {
		this.enabled = enabled; 
	}
 
	@Override
	public BigDecimal getDefer() {
		return this.defer;
	}
 
	@Override
	public void setDefer(final BigDecimal defer) {
		this.defer = defer; 
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
