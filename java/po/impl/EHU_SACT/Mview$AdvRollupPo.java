package com.doc.common.po.impl; 
 
public class Mview$AdvRollupPo implements IMview$AdvRollupPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		CLEVELID#("null"), //
		PLEVELID#("null"), //
		PLEVELID#("null"), //
		FLAGS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal runid#;
	private BigDecimal clevelid#;
	private BigDecimal plevelid#;
	private BigDecimal plevelid#;
	private BigDecimal flags;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getClevelid#() {
		return this.clevelid#;
	}
 
	@Override
	public void setClevelid#(final BigDecimal clevelid#) {
		this.clevelid# = clevelid#; 
	}
 
	@Override
	public BigDecimal getPlevelid#() {
		return this.plevelid#;
	}
 
	@Override
	public void setPlevelid#(final BigDecimal plevelid#) {
		this.plevelid# = plevelid#; 
	}
 
	@Override
	public BigDecimal getPlevelid#() {
		return this.plevelid#;
	}
 
	@Override
	public void setPlevelid#(final BigDecimal plevelid#) {
		this.plevelid# = plevelid#; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
}
