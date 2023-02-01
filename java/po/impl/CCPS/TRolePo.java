package com.doc.common.po.impl; 
 
public class TRolePo implements ITRolePo {
 
	public enum COLUMNS {
		ID("null"), //
		NAME("null"), //
		NAME_ZH("null") //
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
	private String nameZh;

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
	public String getNameZh() {
		return this.nameZh;
	}
 
	@Override
	public void setNameZh(final String nameZh) {
		this.nameZh = nameZh; 
	}
 
}
