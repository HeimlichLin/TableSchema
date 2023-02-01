package com.doc.common.po.impl; 
 
public class LogmnrTs$Po implements ILogmnrTs$Po {
 
	public enum COLUMNS {
		TS#("null"), //
		NAME("null"), //
		OWNER#("null"), //
		BLOCKSIZE("null"), //
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
	private String name;
	private BigDecimal owner#;
	private BigDecimal blocksize;
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
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
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
	public BigDecimal getBlocksize() {
		return this.blocksize;
	}
 
	@Override
	public void setBlocksize(final BigDecimal blocksize) {
		this.blocksize = blocksize; 
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
