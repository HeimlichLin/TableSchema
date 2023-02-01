package com.doc.common.po.impl; 
 
public class Mview$AdvFjgPo implements IMview$AdvFjgPo {
 
	public enum COLUMNS {
		FJGID#("null"), //
		AJGID#("null"), //
		FJGDESLEN("null"), //
		FJGDES("null"), //
		HASHVALUE("null"), //
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
 
	private BigDecimal fjgid#;
	private BigDecimal ajgid#;
	private BigDecimal fjgdeslen;
	private String fjgdes;
	private BigDecimal hashvalue;
	private BigDecimal frequency;

	@Override
	public BigDecimal getFjgid#() {
		return this.fjgid#;
	}
 
	@Override
	public void setFjgid#(final BigDecimal fjgid#) {
		this.fjgid# = fjgid#; 
	}
 
	@Override
	public BigDecimal getAjgid#() {
		return this.ajgid#;
	}
 
	@Override
	public void setAjgid#(final BigDecimal ajgid#) {
		this.ajgid# = ajgid#; 
	}
 
	@Override
	public BigDecimal getFjgdeslen() {
		return this.fjgdeslen;
	}
 
	@Override
	public void setFjgdeslen(final BigDecimal fjgdeslen) {
		this.fjgdeslen = fjgdeslen; 
	}
 
	@Override
	public String getFjgdes() {
		return this.fjgdes;
	}
 
	@Override
	public void setFjgdes(final String fjgdes) {
		this.fjgdes = fjgdes; 
	}
 
	@Override
	public BigDecimal getHashvalue() {
		return this.hashvalue;
	}
 
	@Override
	public void setHashvalue(final BigDecimal hashvalue) {
		this.hashvalue = hashvalue; 
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
