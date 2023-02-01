package com.doc.common.po.impl; 
 
public class LogmnrKopm$Po implements ILogmnrKopm$Po {
 
	public enum COLUMNS {
		LENGTH("null"), //
		METADATA("null"), //
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
 
	private BigDecimal length;
	private String metadata;
	private String name;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getLength() {
		return this.length;
	}
 
	@Override
	public void setLength(final BigDecimal length) {
		this.length = length; 
	}
 
	@Override
	public String getMetadata() {
		return this.metadata;
	}
 
	@Override
	public void setMetadata(final String metadata) {
		this.metadata = metadata; 
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
