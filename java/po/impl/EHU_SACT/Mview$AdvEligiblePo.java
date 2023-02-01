package com.doc.common.po.impl; 
 
public class Mview$AdvEligiblePo implements IMview$AdvEligiblePo {
 
	public enum COLUMNS {
		SUMOBJN#("null"), //
		RUNID#("null"), //
		RUNID#("null"), //
		BYTECOST("null"), //
		FLAGS("null"), //
		FREQUENCY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal sumobjn#;
	private BigDecimal runid#;
	private BigDecimal runid#;
	private BigDecimal bytecost;
	private BigDecimal flags;
	private BigDecimal frequency;

	@Override
	public BigDecimal getSumobjn#() {
		return this.sumobjn#;
	}
 
	@Override
	public void setSumobjn#(final BigDecimal sumobjn#) {
		this.sumobjn# = sumobjn#; 
	}
 
	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
	}
 
	@Override
	public BigDecimal getBytecost() {
		return this.bytecost;
	}
 
	@Override
	public void setBytecost(final BigDecimal bytecost) {
		this.bytecost = bytecost; 
	}
 
	@Override
	public BigDecimal getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final BigDecimal flags) {
		this.flags = flags; 
	}
 
	@Override
	public BigDecimal getFrequency() {
		return this.frequency;
	}
 
	@Override
	public void setFrequency(final BigDecimal frequency) {
		this.frequency = frequency; 
	}
 
}
