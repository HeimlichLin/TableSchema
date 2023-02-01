package com.doc.common.po.impl; 
 
public class LogmnrInd$Po implements ILogmnrInd$Po {
 
	public enum COLUMNS {
		BO#("null"), //
		COLS("null"), //
		TYPE#("null"), //
		FLAGS("null"), //
		PROPERTY("null"), //
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
 
	private BigDecimal bo#;
	private BigDecimal cols;
	private BigDecimal type#;
	private BigDecimal flags;
	private BigDecimal property;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getBo#() {
		return this.bo#;
	}
 
	@Override
	public void setBo#(final BigDecimal bo#) {
		this.bo# = bo#; 
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
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
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
