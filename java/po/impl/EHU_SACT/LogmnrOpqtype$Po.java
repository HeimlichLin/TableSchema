package com.doc.common.po.impl; 
 
public class LogmnrOpqtype$Po implements ILogmnrOpqtype$Po {
 
	public enum COLUMNS {
		INTCOL#("null"), //
		TYPE("null"), //
		FLAGS("null"), //
		LOBCOL("null"), //
		OBJCOL("null"), //
		EXTRACOL("null"), //
		SCHEMAOID("null"), //
		ELEMNUM("null"), //
		SCHEMAURL("null"), //
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
 
	private BigDecimal intcol#;
	private BigDecimal type;
	private BigDecimal flags;
	private BigDecimal lobcol;
	private BigDecimal objcol;
	private BigDecimal extracol;
	private String schemaoid;
	private BigDecimal elemnum;
	private String schemaurl;
	private BigDecimal obj#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getIntcol#() {
		return this.intcol#;
	}
 
	@Override
	public void setIntcol#(final BigDecimal intcol#) {
		this.intcol# = intcol#; 
	}
 
	@Override
	public BigDecimal getType() {
		return this.type;
	}
 
	@Override
	public void setType(final BigDecimal type) {
		this.type = type; 
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
	public BigDecimal getLobcol() {
		return this.lobcol;
	}
 
	@Override
	public void setLobcol(final BigDecimal lobcol) {
		this.lobcol = lobcol; 
	}
 
	@Override
	public BigDecimal getObjcol() {
		return this.objcol;
	}
 
	@Override
	public void setObjcol(final BigDecimal objcol) {
		this.objcol = objcol; 
	}
 
	@Override
	public BigDecimal getExtracol() {
		return this.extracol;
	}
 
	@Override
	public void setExtracol(final BigDecimal extracol) {
		this.extracol = extracol; 
	}
 
	@Override
	public String getSchemaoid() {
		return this.schemaoid;
	}
 
	@Override
	public void setSchemaoid(final String schemaoid) {
		this.schemaoid = schemaoid; 
	}
 
	@Override
	public BigDecimal getElemnum() {
		return this.elemnum;
	}
 
	@Override
	public void setElemnum(final BigDecimal elemnum) {
		this.elemnum = elemnum; 
	}
 
	@Override
	public String getSchemaurl() {
		return this.schemaurl;
	}
 
	@Override
	public void setSchemaurl(final String schemaurl) {
		this.schemaurl = schemaurl; 
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
