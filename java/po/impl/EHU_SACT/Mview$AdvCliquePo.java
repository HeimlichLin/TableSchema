package com.doc.common.po.impl; 
 
public class Mview$AdvCliquePo implements IMview$AdvCliquePo {
 
	public enum COLUMNS {
		CLIQUEID#("null"), //
		RUNID#("null"), //
		CLIQUEDESLEN("null"), //
		CLIQUEDES("null"), //
		HASHVALUE("null"), //
		FREQUENCY("null"), //
		BYTECOST("null"), //
		ROWSIZE("null"), //
		NUMROWS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal cliqueid#;
	private BigDecimal runid#;
	private BigDecimal cliquedeslen;
	private String cliquedes;
	private BigDecimal hashvalue;
	private BigDecimal frequency;
	private BigDecimal bytecost;
	private BigDecimal rowsize;
	private BigDecimal numrows;

	@Override
	public BigDecimal getCliqueid#() {
		return this.cliqueid#;
	}
 
	@Override
	public void setCliqueid#(final BigDecimal cliqueid#) {
		this.cliqueid# = cliqueid#; 
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
	public BigDecimal getCliquedeslen() {
		return this.cliquedeslen;
	}
 
	@Override
	public void setCliquedeslen(final BigDecimal cliquedeslen) {
		this.cliquedeslen = cliquedeslen; 
	}
 
	@Override
	public String getCliquedes() {
		return this.cliquedes;
	}
 
	@Override
	public void setCliquedes(final String cliquedes) {
		this.cliquedes = cliquedes; 
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
 
	@Override
	public BigDecimal getBytecost() {
		return this.bytecost;
	}
 
	@Override
	public void setBytecost(final BigDecimal bytecost) {
		this.bytecost = bytecost; 
	}
 
	@Override
	public BigDecimal getRowsize() {
		return this.rowsize;
	}
 
	@Override
	public void setRowsize(final BigDecimal rowsize) {
		this.rowsize = rowsize; 
	}
 
	@Override
	public BigDecimal getNumrows() {
		return this.numrows;
	}
 
	@Override
	public void setNumrows(final BigDecimal numrows) {
		this.numrows = numrows; 
	}
 
}
