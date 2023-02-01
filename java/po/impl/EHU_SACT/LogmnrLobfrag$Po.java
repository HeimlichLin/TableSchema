package com.doc.common.po.impl; 
 
public class LogmnrLobfrag$Po implements ILogmnrLobfrag$Po {
 
	public enum COLUMNS {
		FRAGOBJ#("null"), //
		PARENTOBJ#("null"), //
		TABFRAGOBJ#("null"), //
		INDFRAGOBJ#("null"), //
		FRAG#("null"), //
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
 
	private BigDecimal fragobj#;
	private BigDecimal parentobj#;
	private BigDecimal tabfragobj#;
	private BigDecimal indfragobj#;
	private BigDecimal frag#;
	private BigDecimal logmnrUid;
	private BigDecimal logmnrFlags;

	@Override
	public BigDecimal getFragobj#() {
		return this.fragobj#;
	}
 
	@Override
	public void setFragobj#(final BigDecimal fragobj#) {
		this.fragobj# = fragobj#; 
	}
 
	@Override
	public BigDecimal getParentobj#() {
		return this.parentobj#;
	}
 
	@Override
	public void setParentobj#(final BigDecimal parentobj#) {
		this.parentobj# = parentobj#; 
	}
 
	@Override
	public BigDecimal getTabfragobj#() {
		return this.tabfragobj#;
	}
 
	@Override
	public void setTabfragobj#(final BigDecimal tabfragobj#) {
		this.tabfragobj# = tabfragobj#; 
	}
 
	@Override
	public BigDecimal getIndfragobj#() {
		return this.indfragobj#;
	}
 
	@Override
	public void setIndfragobj#(final BigDecimal indfragobj#) {
		this.indfragobj# = indfragobj#; 
	}
 
	@Override
	public BigDecimal getFrag#() {
		return this.frag#;
	}
 
	@Override
	public void setFrag#(final BigDecimal frag#) {
		this.frag# = frag#; 
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
