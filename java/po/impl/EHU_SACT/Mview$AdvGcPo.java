package com.doc.common.po.impl; 
 
public class Mview$AdvGcPo implements IMview$AdvGcPo {
 
	public enum COLUMNS {
		GCID#("null"), //
		FJGID#("null"), //
		GCDESLEN("null"), //
		GCDES("null"), //
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
 
	private BigDecimal gcid#;
	private BigDecimal fjgid#;
	private BigDecimal gcdeslen;
	private String gcdes;
	private BigDecimal hashvalue;
	private BigDecimal frequency;

	@Override
	public BigDecimal getGcid#() {
		return this.gcid#;
	}
 
	@Override
	public void setGcid#(final BigDecimal gcid#) {
		this.gcid# = gcid#; 
	}
 
	@Override
	public BigDecimal getFjgid#() {
		return this.fjgid#;
	}
 
	@Override
	public void setFjgid#(final BigDecimal fjgid#) {
		this.fjgid# = fjgid#; 
	}
 
	@Override
	public BigDecimal getGcdeslen() {
		return this.gcdeslen;
	}
 
	@Override
	public void setGcdeslen(final BigDecimal gcdeslen) {
		this.gcdeslen = gcdeslen; 
	}
 
	@Override
	public String getGcdes() {
		return this.gcdes;
	}
 
	@Override
	public void setGcdes(final String gcdes) {
		this.gcdes = gcdes; 
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
