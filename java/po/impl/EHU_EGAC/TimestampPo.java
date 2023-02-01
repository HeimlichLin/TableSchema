package com.doc.common.po.impl; 
 
public class TimestampPo implements ITimestampPo {
 
	public enum COLUMNS {
		BAGNODATE("null"), //
		BAGNO("null"), //
		CONTROLNODATE("null"), //
		CONTROLNO("null"), //
		T5102DATE("null"), //
		T5102NO("null"), //
		T5117DATE("null"), //
		T5117NO("null"), //
		T5201DATE("null"), //
		T5201NO("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private java.sql.Timestamp bagnodate;
	private BigDecimal bagno;
	private java.sql.Timestamp controlnodate;
	private BigDecimal controlno;
	private java.sql.Timestamp t5102date;
	private BigDecimal t5102no;
	private java.sql.Timestamp t5117date;
	private BigDecimal t5117no;
	private java.sql.Timestamp t5201date;
	private BigDecimal t5201no;

	@Override
	public java.sql.Timestamp getBagnodate() {
		return this.bagnodate;
	}
 
	@Override
	public void setBagnodate(final java.sql.Timestamp bagnodate) {
		this.bagnodate = bagnodate; 
	}
 
	@Override
	public BigDecimal getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final BigDecimal bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public java.sql.Timestamp getControlnodate() {
		return this.controlnodate;
	}
 
	@Override
	public void setControlnodate(final java.sql.Timestamp controlnodate) {
		this.controlnodate = controlnodate; 
	}
 
	@Override
	public BigDecimal getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final BigDecimal controlno) {
		this.controlno = controlno; 
	}
 
	@Override
	public java.sql.Timestamp getT5102date() {
		return this.t5102date;
	}
 
	@Override
	public void setT5102date(final java.sql.Timestamp t5102date) {
		this.t5102date = t5102date; 
	}
 
	@Override
	public BigDecimal getT5102no() {
		return this.t5102no;
	}
 
	@Override
	public void setT5102no(final BigDecimal t5102no) {
		this.t5102no = t5102no; 
	}
 
	@Override
	public java.sql.Timestamp getT5117date() {
		return this.t5117date;
	}
 
	@Override
	public void setT5117date(final java.sql.Timestamp t5117date) {
		this.t5117date = t5117date; 
	}
 
	@Override
	public BigDecimal getT5117no() {
		return this.t5117no;
	}
 
	@Override
	public void setT5117no(final BigDecimal t5117no) {
		this.t5117no = t5117no; 
	}
 
	@Override
	public java.sql.Timestamp getT5201date() {
		return this.t5201date;
	}
 
	@Override
	public void setT5201date(final java.sql.Timestamp t5201date) {
		this.t5201date = t5201date; 
	}
 
	@Override
	public BigDecimal getT5201no() {
		return this.t5201no;
	}
 
	@Override
	public void setT5201no(final BigDecimal t5201no) {
		this.t5201no = t5201no; 
	}
 
}
