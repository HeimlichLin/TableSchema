package com.doc.common.po.impl; 
 
public class Mview$AdvTempPo implements IMview$AdvTempPo {
 
	public enum COLUMNS {
		ID#("null"), //
		SEQ#("null"), //
		TEXT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal id#;
	private BigDecimal seq#;
	private String text;

	@Override
	public BigDecimal getId#() {
		return this.id#;
	}
 
	@Override
	public void setId#(final BigDecimal id#) {
		this.id# = id#; 
	}
 
	@Override
	public BigDecimal getSeq#() {
		return this.seq#;
	}
 
	@Override
	public void setSeq#(final BigDecimal seq#) {
		this.seq# = seq#; 
	}
 
	@Override
	public String getText() {
		return this.text;
	}
 
	@Override
	public void setText(final String text) {
		this.text = text; 
	}
 
}
