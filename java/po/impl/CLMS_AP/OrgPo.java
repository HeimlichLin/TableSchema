package com.doc.common.po.impl; 
 
public class OrgPo implements IOrgPo {
 
	public enum COLUMNS {
		ID("null"), //
		NAME("null"), //
		YEAR("null"), //
		CODE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal id;
	private String name;
	private BigDecimal year;
	private String code;

	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public BigDecimal getYear() {
		return this.year;
	}
 
	@Override
	public void setYear(final BigDecimal year) {
		this.year = year; 
	}
 
	@Override
	public String getCode() {
		return this.code;
	}
 
	@Override
	public void setCode(final String code) {
		this.code = code; 
	}
 
}
