package com.doc.common.po.impl; 
 
public class LogmnrtMddl$Po implements ILogmnrtMddl$Po {
 
	public enum COLUMNS {
		SOURCE_OBJ#("null"), //
		SOURCE_ROWID("null"), //
		DEST_ROWID("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sourceObj#;
	private String sourceRowid;
	private String destRowid;

	@Override
	public BigDecimal getSourceObj#() {
		return this.sourceObj#;
	}
 
	@Override
	public void setSourceObj#(final BigDecimal sourceObj#) {
		this.sourceObj# = sourceObj#; 
	}
 
	@Override
	public String getSourceRowid() {
		return this.sourceRowid;
	}
 
	@Override
	public void setSourceRowid(final String sourceRowid) {
		this.sourceRowid = sourceRowid; 
	}
 
	@Override
	public String getDestRowid() {
		return this.destRowid;
	}
 
	@Override
	public void setDestRowid(final String destRowid) {
		this.destRowid = destRowid; 
	}
 
}
