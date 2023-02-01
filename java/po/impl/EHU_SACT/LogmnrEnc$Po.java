package com.doc.common.po.impl; 
 
public class LogmnrEnc$Po implements ILogmnrEnc$Po {
 
	public enum COLUMNS {
		OBJ#("null"), //
		OWNER#("null"), //
		ENCALG("null"), //
		INTALG("null"), //
		COLKLC("null"), //
		KLCLEN("null"), //
		FLAG("null"), //
		MKEYID("null"), //
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
	private BigDecimal owner#;
	private BigDecimal encalg;
	private BigDecimal intalg;
	private String colklc;
	private BigDecimal klclen;
	private BigDecimal flag;
	private String mkeyid;
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
	public BigDecimal getOwner#() {
		return this.owner#;
	}
 
	@Override
	public void setOwner#(final BigDecimal owner#) {
		this.owner# = owner#; 
	}
 
	@Override
	public BigDecimal getEncalg() {
		return this.encalg;
	}
 
	@Override
	public void setEncalg(final BigDecimal encalg) {
		this.encalg = encalg; 
	}
 
	@Override
	public BigDecimal getIntalg() {
		return this.intalg;
	}
 
	@Override
	public void setIntalg(final BigDecimal intalg) {
		this.intalg = intalg; 
	}
 
	@Override
	public String getColklc() {
		return this.colklc;
	}
 
	@Override
	public void setColklc(final String colklc) {
		this.colklc = colklc; 
	}
 
	@Override
	public BigDecimal getKlclen() {
		return this.klclen;
	}
 
	@Override
	public void setKlclen(final BigDecimal klclen) {
		this.klclen = klclen; 
	}
 
	@Override
	public BigDecimal getFlag() {
		return this.flag;
	}
 
	@Override
	public void setFlag(final BigDecimal flag) {
		this.flag = flag; 
	}
 
	@Override
	public String getMkeyid() {
		return this.mkeyid;
	}
 
	@Override
	public void setMkeyid(final String mkeyid) {
		this.mkeyid = mkeyid; 
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
