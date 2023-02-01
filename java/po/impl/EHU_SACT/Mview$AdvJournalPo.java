package com.doc.common.po.impl; 
 
public class Mview$AdvJournalPo implements IMview$AdvJournalPo {
 
	public enum COLUMNS {
		RUNID#("null"), //
		SEQ#("null"), //
		TIMESTAMP("null"), //
		FLAGS("null"), //
		NUM("null"), //
		TEXT("null"), //
		TEXTLEN("null") //
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
	private BigDecimal seq#;
	private java.sql.Timestamp timestamp;
	private BigDecimal flags;
	private BigDecimal num;
	private String text;
	private BigDecimal textlen;

	@Override
	public BigDecimal getRunid#() {
		return this.runid#;
	}
 
	@Override
	public void setRunid#(final BigDecimal runid#) {
		this.runid# = runid#; 
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
	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}
 
	@Override
	public void setTimestamp(final java.sql.Timestamp timestamp) {
		this.timestamp = timestamp; 
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
	public BigDecimal getNum() {
		return this.num;
	}
 
	@Override
	public void setNum(final BigDecimal num) {
		this.num = num; 
	}
 
	@Override
	public String getText() {
		return this.text;
	}
 
	@Override
	public void setText(final String text) {
		this.text = text; 
	}
 
	@Override
	public BigDecimal getTextlen() {
		return this.textlen;
	}
 
	@Override
	public void setTextlen(final BigDecimal textlen) {
		this.textlen = textlen; 
	}
 
}
