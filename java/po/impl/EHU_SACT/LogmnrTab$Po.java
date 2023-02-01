package com.doc.common.po.impl; 
 
public class LogmnrTab$Po implements ILogmnrTab$Po {
 
	public enum COLUMNS {
		TS#("null"), //
		COLS("null"), //
		PROPERTY("null"), //
		INTCOLS("null"), //
		KERNELCOLS("null"), //
		BOBJ#("null"), //
		TRIGFLAG("null"), //
		FLAGS("null"), //
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
 
	private BigDecimal ts#;
	private BigDecimal cols;
	private BigDecimal property;
	private BigDecimal intcols;
	private BigDecimal kernelcols;
	private BigDecimal bobj#;
	private BigDecimal trigflag;
	private BigDecimal flags;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getTs#() {
		return this.ts#;
	}
 
	@Override
	public void setTs#(final BigDecimal ts#) {
		this.ts# = ts#; 
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
	public BigDecimal getProperty() {
		return this.property;
	}
 
	@Override
	public void setProperty(final BigDecimal property) {
		this.property = property; 
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
	public BigDecimal getKernelcols() {
		return this.kernelcols;
	}
 
	@Override
	public void setKernelcols(final BigDecimal kernelcols) {
		this.kernelcols = kernelcols; 
	}
 
	@Override
	public BigDecimal getBobj#() {
		return this.bobj#;
	}
 
	@Override
	public void setBobj#(final BigDecimal bobj#) {
		this.bobj# = bobj#; 
	}
 
	@Override
	public BigDecimal getTrigflag() {
		return this.trigflag;
	}
 
	@Override
	public void setTrigflag(final BigDecimal trigflag) {
		this.trigflag = trigflag; 
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
