package com.doc.common.po.impl; 
 
public class Mview$AdvAjgPo implements IMview$AdvAjgPo {
 
	public enum COLUMNS {
		AJGID#("null"), //
		RUNID#("null"), //
		AJGDESLEN("null"), //
		AJGDES("null"), //
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
 
	private BigDecimal ajgid#;
	private BigDecimal runid#;
	private BigDecimal ajgdeslen;
	private String ajgdes;
	private BigDecimal hashvalue;
	private BigDecimal frequency;

	@Override
	public BigDecimal getAjgid#() {
		return this.ajgid#;
	}
 
	@Override
	public void setAjgid#(final BigDecimal ajgid#) {
		this.ajgid# = ajgid#; 
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
	public BigDecimal getAjgdeslen() {
		return this.ajgdeslen;
	}
 
	@Override
	public void setAjgdeslen(final BigDecimal ajgdeslen) {
		this.ajgdeslen = ajgdeslen; 
	}
 
	@Override
	public String getAjgdes() {
		return this.ajgdes;
	}
 
	@Override
	public void setAjgdes(final String ajgdes) {
		this.ajgdes = ajgdes; 
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
