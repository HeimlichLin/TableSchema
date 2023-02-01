package com.doc.common.po.impl; 
 
public class LogmnrcGtcsPo implements ILogmnrcGtcsPo {
 
	public enum COLUMNS {
		LOGMNR_UID("null"), //
		OBJ#("null"), //
		OBJV#("null"), //
		SEGCOL#("null"), //
		INTCOL#("null"), //
		COLNAME("null"), //
		TYPE#("null"), //
		LENGTH("null"), //
		PRECISION("null"), //
		SCALE("null"), //
		INTERVAL_LEADING_PRECISION("null"), //
		INTERVAL_TRAILING_PRECISION("null"), //
		PROPERTY("null"), //
		TOID("null"), //
		CHARSETID("null"), //
		CHARSETFORM("null"), //
		TYPENAME("null"), //
		FQCOLNAME("null"), //
		NUMINTCOLS("null"), //
		NUMATTRS("null"), //
		ADTORDER("null"), //
		LOGMNR_SPARE1("null"), //
		LOGMNR_SPARE2("null"), //
		LOGMNR_SPARE3("null"), //
		LOGMNR_SPARE4("null"), //
		LOGMNR_SPARE5("null"), //
		LOGMNR_SPARE6("null"), //
		LOGMNR_SPARE7("null"), //
		LOGMNR_SPARE8("null"), //
		LOGMNR_SPARE9("null"), //
		COL#("null"), //
		XTYPESCHEMANAME("null"), //
		XTYPENAME("null"), //
		XFQCOLNAME("null"), //
		XTOPINTCOL("null"), //
		XREFFEDTABLEOBJN("null"), //
		XREFFEDTABLEOBJV("null"), //
		XCOLTYPEFLAGS("null"), //
		XOPQTYPETYPE("null"), //
		XOPQTYPEFLAGS("null"), //
		XOPQLOBINTCOL("null"), //
		XOPQOBJINTCOL("null"), //
		XXMLINTCOL("null"), //
		EAOWNER#("null"), //
		EAMKEYID("null"), //
		EAENCALG("null"), //
		EAINTALG("null"), //
		EACOLKLC("null"), //
		EAKLCLEN("null"), //
		EAFLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal logmnrUid;
	private BigDecimal obj#;
	private BigDecimal objv#;
	private BigDecimal segcol#;
	private BigDecimal intcol#;
	private String colname;
	private BigDecimal type#;
	private BigDecimal length;
	private BigDecimal precision;
	private BigDecimal scale;
	private BigDecimal intervalLeadingPrecision;
	private BigDecimal intervalTrailingPrecision;
	private BigDecimal property;
	private String toid;
	private BigDecimal charsetid;
	private BigDecimal charsetform;
	private String typename;
	private String fqcolname;
	private BigDecimal numintcols;
	private BigDecimal numattrs;
	private BigDecimal adtorder;
	private BigDecimal logmnrSpare1;
	private BigDecimal logmnrSpare2;
	private String logmnrSpare3;
	private java.sql.Timestamp logmnrSpare4;
	private BigDecimal logmnrSpare5;
	private BigDecimal logmnrSpare6;
	private BigDecimal logmnrSpare7;
	private BigDecimal logmnrSpare8;
	private BigDecimal logmnrSpare9;
	private BigDecimal col#;
	private String xtypeschemaname;
	private String xtypename;
	private String xfqcolname;
	private BigDecimal xtopintcol;
	private BigDecimal xreffedtableobjn;
	private BigDecimal xreffedtableobjv;
	private BigDecimal xcoltypeflags;
	private BigDecimal xopqtypetype;
	private BigDecimal xopqtypeflags;
	private BigDecimal xopqlobintcol;
	private BigDecimal xopqobjintcol;
	private BigDecimal xxmlintcol;
	private BigDecimal eaowner#;
	private String eamkeyid;
	private BigDecimal eaencalg;
	private BigDecimal eaintalg;
	private String eacolklc;
	private BigDecimal eaklclen;
	private BigDecimal eaflags;

	@Override
	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}
 
	@Override
	public void setLogmnrUid(final BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid; 
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
	public BigDecimal getObjv#() {
		return this.objv#;
	}
 
	@Override
	public void setObjv#(final BigDecimal objv#) {
		this.objv# = objv#; 
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
	public String getColname() {
		return this.colname;
	}
 
	@Override
	public void setColname(final String colname) {
		this.colname = colname; 
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
	public BigDecimal getPrecision() {
		return this.precision;
	}
 
	@Override
	public void setPrecision(final BigDecimal precision) {
		this.precision = precision; 
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
	public BigDecimal getIntervalLeadingPrecision() {
		return this.intervalLeadingPrecision;
	}
 
	@Override
	public void setIntervalLeadingPrecision(final BigDecimal intervalLeadingPrecision) {
		this.intervalLeadingPrecision = intervalLeadingPrecision; 
	}
 
	@Override
	public BigDecimal getIntervalTrailingPrecision() {
		return this.intervalTrailingPrecision;
	}
 
	@Override
	public void setIntervalTrailingPrecision(final BigDecimal intervalTrailingPrecision) {
		this.intervalTrailingPrecision = intervalTrailingPrecision; 
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
	public String getToid() {
		return this.toid;
	}
 
	@Override
	public void setToid(final String toid) {
		this.toid = toid; 
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
	public String getTypename() {
		return this.typename;
	}
 
	@Override
	public void setTypename(final String typename) {
		this.typename = typename; 
	}
 
	@Override
	public String getFqcolname() {
		return this.fqcolname;
	}
 
	@Override
	public void setFqcolname(final String fqcolname) {
		this.fqcolname = fqcolname; 
	}
 
	@Override
	public BigDecimal getNumintcols() {
		return this.numintcols;
	}
 
	@Override
	public void setNumintcols(final BigDecimal numintcols) {
		this.numintcols = numintcols; 
	}
 
	@Override
	public BigDecimal getNumattrs() {
		return this.numattrs;
	}
 
	@Override
	public void setNumattrs(final BigDecimal numattrs) {
		this.numattrs = numattrs; 
	}
 
	@Override
	public BigDecimal getAdtorder() {
		return this.adtorder;
	}
 
	@Override
	public void setAdtorder(final BigDecimal adtorder) {
		this.adtorder = adtorder; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare1() {
		return this.logmnrSpare1;
	}
 
	@Override
	public void setLogmnrSpare1(final BigDecimal logmnrSpare1) {
		this.logmnrSpare1 = logmnrSpare1; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare2() {
		return this.logmnrSpare2;
	}
 
	@Override
	public void setLogmnrSpare2(final BigDecimal logmnrSpare2) {
		this.logmnrSpare2 = logmnrSpare2; 
	}
 
	@Override
	public String getLogmnrSpare3() {
		return this.logmnrSpare3;
	}
 
	@Override
	public void setLogmnrSpare3(final String logmnrSpare3) {
		this.logmnrSpare3 = logmnrSpare3; 
	}
 
	@Override
	public java.sql.Timestamp getLogmnrSpare4() {
		return this.logmnrSpare4;
	}
 
	@Override
	public void setLogmnrSpare4(final java.sql.Timestamp logmnrSpare4) {
		this.logmnrSpare4 = logmnrSpare4; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare5() {
		return this.logmnrSpare5;
	}
 
	@Override
	public void setLogmnrSpare5(final BigDecimal logmnrSpare5) {
		this.logmnrSpare5 = logmnrSpare5; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare6() {
		return this.logmnrSpare6;
	}
 
	@Override
	public void setLogmnrSpare6(final BigDecimal logmnrSpare6) {
		this.logmnrSpare6 = logmnrSpare6; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare7() {
		return this.logmnrSpare7;
	}
 
	@Override
	public void setLogmnrSpare7(final BigDecimal logmnrSpare7) {
		this.logmnrSpare7 = logmnrSpare7; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare8() {
		return this.logmnrSpare8;
	}
 
	@Override
	public void setLogmnrSpare8(final BigDecimal logmnrSpare8) {
		this.logmnrSpare8 = logmnrSpare8; 
	}
 
	@Override
	public BigDecimal getLogmnrSpare9() {
		return this.logmnrSpare9;
	}
 
	@Override
	public void setLogmnrSpare9(final BigDecimal logmnrSpare9) {
		this.logmnrSpare9 = logmnrSpare9; 
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
	public String getXtypeschemaname() {
		return this.xtypeschemaname;
	}
 
	@Override
	public void setXtypeschemaname(final String xtypeschemaname) {
		this.xtypeschemaname = xtypeschemaname; 
	}
 
	@Override
	public String getXtypename() {
		return this.xtypename;
	}
 
	@Override
	public void setXtypename(final String xtypename) {
		this.xtypename = xtypename; 
	}
 
	@Override
	public String getXfqcolname() {
		return this.xfqcolname;
	}
 
	@Override
	public void setXfqcolname(final String xfqcolname) {
		this.xfqcolname = xfqcolname; 
	}
 
	@Override
	public BigDecimal getXtopintcol() {
		return this.xtopintcol;
	}
 
	@Override
	public void setXtopintcol(final BigDecimal xtopintcol) {
		this.xtopintcol = xtopintcol; 
	}
 
	@Override
	public BigDecimal getXreffedtableobjn() {
		return this.xreffedtableobjn;
	}
 
	@Override
	public void setXreffedtableobjn(final BigDecimal xreffedtableobjn) {
		this.xreffedtableobjn = xreffedtableobjn; 
	}
 
	@Override
	public BigDecimal getXreffedtableobjv() {
		return this.xreffedtableobjv;
	}
 
	@Override
	public void setXreffedtableobjv(final BigDecimal xreffedtableobjv) {
		this.xreffedtableobjv = xreffedtableobjv; 
	}
 
	@Override
	public BigDecimal getXcoltypeflags() {
		return this.xcoltypeflags;
	}
 
	@Override
	public void setXcoltypeflags(final BigDecimal xcoltypeflags) {
		this.xcoltypeflags = xcoltypeflags; 
	}
 
	@Override
	public BigDecimal getXopqtypetype() {
		return this.xopqtypetype;
	}
 
	@Override
	public void setXopqtypetype(final BigDecimal xopqtypetype) {
		this.xopqtypetype = xopqtypetype; 
	}
 
	@Override
	public BigDecimal getXopqtypeflags() {
		return this.xopqtypeflags;
	}
 
	@Override
	public void setXopqtypeflags(final BigDecimal xopqtypeflags) {
		this.xopqtypeflags = xopqtypeflags; 
	}
 
	@Override
	public BigDecimal getXopqlobintcol() {
		return this.xopqlobintcol;
	}
 
	@Override
	public void setXopqlobintcol(final BigDecimal xopqlobintcol) {
		this.xopqlobintcol = xopqlobintcol; 
	}
 
	@Override
	public BigDecimal getXopqobjintcol() {
		return this.xopqobjintcol;
	}
 
	@Override
	public void setXopqobjintcol(final BigDecimal xopqobjintcol) {
		this.xopqobjintcol = xopqobjintcol; 
	}
 
	@Override
	public BigDecimal getXxmlintcol() {
		return this.xxmlintcol;
	}
 
	@Override
	public void setXxmlintcol(final BigDecimal xxmlintcol) {
		this.xxmlintcol = xxmlintcol; 
	}
 
	@Override
	public BigDecimal getEaowner#() {
		return this.eaowner#;
	}
 
	@Override
	public void setEaowner#(final BigDecimal eaowner#) {
		this.eaowner# = eaowner#; 
	}
 
	@Override
	public String getEamkeyid() {
		return this.eamkeyid;
	}
 
	@Override
	public void setEamkeyid(final String eamkeyid) {
		this.eamkeyid = eamkeyid; 
	}
 
	@Override
	public BigDecimal getEaencalg() {
		return this.eaencalg;
	}
 
	@Override
	public void setEaencalg(final BigDecimal eaencalg) {
		this.eaencalg = eaencalg; 
	}
 
	@Override
	public BigDecimal getEaintalg() {
		return this.eaintalg;
	}
 
	@Override
	public void setEaintalg(final BigDecimal eaintalg) {
		this.eaintalg = eaintalg; 
	}
 
	@Override
	public String getEacolklc() {
		return this.eacolklc;
	}
 
	@Override
	public void setEacolklc(final String eacolklc) {
		this.eacolklc = eacolklc; 
	}
 
	@Override
	public BigDecimal getEaklclen() {
		return this.eaklclen;
	}
 
	@Override
	public void setEaklclen(final BigDecimal eaklclen) {
		this.eaklclen = eaklclen; 
	}
 
	@Override
	public BigDecimal getEaflags() {
		return this.eaflags;
	}
 
	@Override
	public void setEaflags(final BigDecimal eaflags) {
		this.eaflags = eaflags; 
	}
 
}
