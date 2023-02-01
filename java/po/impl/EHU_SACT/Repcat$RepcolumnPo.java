package com.doc.common.po.impl; 
 
public class Repcat$RepcolumnPo implements IRepcat$RepcolumnPo {
 
	public enum COLUMNS {
		SNAME("Name of the object owner"), //
		ONAME("Name of the object"), //
		TYPE("Type of the object"), //
		CNAME("Column name"), //
		LCNAME("Long column name"), //
		TOID("Type object identifier of a user-defined type"), //
		VERSION#("Version# of a column of user-defined type"), //
		HASHCODE("Hashcode of a column of user-defined type"), //
		CTYPE_NAME("null"), //
		CTYPE_OWNER("null"), //
		ID("Column ID"), //
		POS("Ordering of column used as IN parameter in the replication procedures"), //
		TOP("Top column name for an attribute"), //
		FLAG("Replication information about column"), //
		CTYPE("Type of the column"), //
		LENGTH("Length of the column in bytes"), //
		PRECISION#("Length: decimal digits (NUMBER) or binary digits (FLOAT)"), //
		SCALE("Digits to right of decimal point in a number"), //
		NULL$("Does column allow NULL values?"), //
		CHARSETID("Character set identifier"), //
		CHARSETFORM("Character set form"), //
		PROPERTY("null"), //
		CLENGTH("The maximum length of the column in characters") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String oname;
	private BigDecimal type;
	private String cname;
	private String lcname;
	private String toid;
	private BigDecimal version#;
	private String hashcode;
	private String ctypeName;
	private String ctypeOwner;
	private BigDecimal id;
	private BigDecimal pos;
	private String top;
	private String flag;
	private BigDecimal ctype;
	private BigDecimal length;
	private BigDecimal precision#;
	private BigDecimal scale;
	private BigDecimal null$;
	private BigDecimal charsetid;
	private BigDecimal charsetform;
	private String property;
	private BigDecimal clength;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
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
	public String getCname() {
		return this.cname;
	}
 
	@Override
	public void setCname(final String cname) {
		this.cname = cname; 
	}
 
	@Override
	public String getLcname() {
		return this.lcname;
	}
 
	@Override
	public void setLcname(final String lcname) {
		this.lcname = lcname; 
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
	public String getHashcode() {
		return this.hashcode;
	}
 
	@Override
	public void setHashcode(final String hashcode) {
		this.hashcode = hashcode; 
	}
 
	@Override
	public String getCtypeName() {
		return this.ctypeName;
	}
 
	@Override
	public void setCtypeName(final String ctypeName) {
		this.ctypeName = ctypeName; 
	}
 
	@Override
	public String getCtypeOwner() {
		return this.ctypeOwner;
	}
 
	@Override
	public void setCtypeOwner(final String ctypeOwner) {
		this.ctypeOwner = ctypeOwner; 
	}
 
	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public BigDecimal getPos() {
		return this.pos;
	}
 
	@Override
	public void setPos(final BigDecimal pos) {
		this.pos = pos; 
	}
 
	@Override
	public String getTop() {
		return this.top;
	}
 
	@Override
	public void setTop(final String top) {
		this.top = top; 
	}
 
	@Override
	public String getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final String flag) {
		this.flag = flag; 
	}
 
	@Override
	public BigDecimal getCtype() {
		return this.ctype;
	}
 
	@Override
	public void setCtype(final BigDecimal ctype) {
		this.ctype = ctype; 
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
	public String getProperty() {
		return this.property;
	}
 
	@Override
	public void setProperty(final String property) {
		this.property = property; 
	}
 
	@Override
	public BigDecimal getClength() {
		return this.clength;
	}
 
	@Override
	public void setClength(final BigDecimal clength) {
		this.clength = clength; 
	}
 
}
