package com.doc.common.po.impl; 
 
public class InexcontainerstPo implements IInexcontainerstPo {
 
	public enum COLUMNS {
		TTYPE("null"), //
		INDICATOR("null"), //
		DECLTYPE("null"), //
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		ITEMNO("null"), //
		CONTAINER("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String ttype;
	private String indicator;
	private String decltype;
	private String declno;
	private String mwb;
	private String hwb;
	private String itemno;
	private String container;

	@Override
	public String getTtype() {
		return this.ttype;
	}
 
	@Override
	public void setTtype(final String ttype) {
		this.ttype = ttype; 
	}
 
	@Override
	public String getIndicator() {
		return this.indicator;
	}
 
	@Override
	public void setIndicator(final String indicator) {
		this.indicator = indicator; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getMwb() {
		return this.mwb;
	}
 
	@Override
	public void setMwb(final String mwb) {
		this.mwb = mwb; 
	}
 
	@Override
	public String getHwb() {
		return this.hwb;
	}
 
	@Override
	public void setHwb(final String hwb) {
		this.hwb = hwb; 
	}
 
	@Override
	public String getItemno() {
		return this.itemno;
	}
 
	@Override
	public void setItemno(final String itemno) {
		this.itemno = itemno; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
}
