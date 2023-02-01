package com.doc.common.po.impl; 
 
public class LogmnrCol$Po implements ILogmnrCol$Po {
 
	public enum COLUMNS {
		COL#("null"), //
		SEGCOL#("null"), //
		NAME("null"), //
		TYPE#("null"), //
		LENGTH("null"), //
		PRECISION#("null"), //
		SCALE("null"), //
		NULL$("null"), //
		INTCOL#("null"), //
		PROPERTY("null"), //
		CHARSETID("null"), //
		CHARSETFORM("null"), //
		SPARE1("null"), //
		SPARE2("null"), //
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
	private BigDecimal segcol#;
	private String name;
	private BigDecimal type#;
	private BigDecimal length;
	private BigDecimal precision#;
	private BigDecimal scale;
	private BigDecimal null$;
	private BigDecimal intcol#;
	private BigDecimal property;
	private BigDecimal charsetid;
	private BigDecimal charsetform;
	private BigDecimal spare1;
	private BigDecimal spare2;
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
	public BigDecimal getSegcol#() {
		return this.segcol#;
	}
 
	@Override
	public void setSegcol#(final BigDecimal segcol#) {
		this.segcol# = segcol#; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
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
	public BigDecimal getLength() {
		return this.length;
	}
 
	@Override
	public void setLength(final BigDecimal length) {
		this.length = length; 
	}
 
	@Override
	public BigDecimal getPrecision#() {
		return this.precision#;
	}
 
	@Override
	public void setPrecision#(final BigDecimal precision#) {
		this.precision# = precision#; 
	}
 
	@Override
	public BigDecimal getScale() {
		return this.scale;
	}
 
	@Override
	public void setScale(final BigDecimal scale) {
		this.scale = scale; 
	}
 
	@Override
	public BigDecimal getNull$() {
		return this.null$;
	}
 
	@Override
	public void setNull$(final BigDecimal null$) {
		this.null$ = null$; 
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
	public BigDecimal getProperty() {
		return this.property;
	}
 
	@Override
	public void setProperty(final BigDecimal property) {
		this.property = property; 
	}
 
	@Override
	public BigDecimal getCharsetid() {
		return this.charsetid;
	}
 
	@Override
	public void setCharsetid(final BigDecimal charsetid) {
		this.charsetid = charsetid; 
	}
 
	@Override
	public BigDecimal getCharsetform() {
		return this.charsetform;
	}
 
	@Override
	public void setCharsetform(final BigDecimal charsetform) {
		this.charsetform = charsetform; 
	}
 
	@Override
	public BigDecimal getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final BigDecimal spare1) {
		this.spare1 = spare1; 
	}
 
	@Override
	public BigDecimal getSpare2() {
		return this.spare2;
	}
 
	@Override
	public void setSpare2(final BigDecimal spare2) {
		this.spare2 = spare2; 
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
