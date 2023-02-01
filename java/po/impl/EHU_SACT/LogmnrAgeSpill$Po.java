package com.doc.common.po.impl; 
 
public class LogmnrAgeSpill$Po implements ILogmnrAgeSpill$Po {
 
	public enum COLUMNS {
		SESSION#("null"), //
		XIDUSN("null"), //
		XIDSLT("null"), //
		XIDSQN("null"), //
		CHUNK("null"), //
		SEQUENCE#("null"), //
		OFFSET("null"), //
		SPILL_DATA("null"), //
		SPARE1("null"), //
		SPARE2("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal session#;
	private BigDecimal xidusn;
	private BigDecimal xidslt;
	private BigDecimal xidsqn;
	private BigDecimal chunk;
	private BigDecimal sequence#;
	private BigDecimal offset;
	private String spillData;
	private BigDecimal spare1;
	private BigDecimal spare2;

	@Override
	public BigDecimal getSession#() {
		return this.session#;
	}
 
	@Override
	public void setSession#(final BigDecimal session#) {
		this.session# = session#; 
	}
 
	@Override
	public BigDecimal getXidusn() {
		return this.xidusn;
	}
 
	@Override
	public void setXidusn(final BigDecimal xidusn) {
		this.xidusn = xidusn; 
	}
 
	@Override
	public BigDecimal getXidslt() {
		return this.xidslt;
	}
 
	@Override
	public void setXidslt(final BigDecimal xidslt) {
		this.xidslt = xidslt; 
	}
 
	@Override
	public BigDecimal getXidsqn() {
		return this.xidsqn;
	}
 
	@Override
	public void setXidsqn(final BigDecimal xidsqn) {
		this.xidsqn = xidsqn; 
	}
 
	@Override
	public BigDecimal getChunk() {
		return this.chunk;
	}
 
	@Override
	public void setChunk(final BigDecimal chunk) {
		this.chunk = chunk; 
	}
 
	@Override
	public BigDecimal getSequence#() {
		return this.sequence#;
	}
 
	@Override
	public void setSequence#(final BigDecimal sequence#) {
		this.sequence# = sequence#; 
	}
 
	@Override
	public BigDecimal getOffset() {
		return this.offset;
	}
 
	@Override
	public void setOffset(final BigDecimal offset) {
		this.offset = offset; 
	}
 
	@Override
	public String getSpillData() {
		return this.spillData;
	}
 
	@Override
	public void setSpillData(final String spillData) {
		this.spillData = spillData; 
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
 
}
