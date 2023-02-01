package com.doc.common.po.impl; 
 
public class LogmnrProps$Po implements ILogmnrProps$Po {
 
	public enum COLUMNS {
		VALUE$("null"), //
		COMMENT$("null"), //
		NAME("null"), //
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
 
	private String value$;
	private String comment$;
	private String name;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public String getValue$() {
		return this.value$;
	}
 
	@Override
	public void setValue$(final String value$) {
		this.value$ = value$; 
	}
 
	@Override
	public String getComment$() {
		return this.comment$;
	}
 
	@Override
	public void setComment$(final String comment$) {
		this.comment$ = comment$; 
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
