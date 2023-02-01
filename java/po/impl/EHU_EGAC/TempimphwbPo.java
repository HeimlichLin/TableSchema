package com.doc.common.po.impl; 
 
public class TempImphwbPo implements ITempImphwbPo {
 
	public enum COLUMNS {
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		BAG("null"), //
		BAGNO("null"), //
		OUT("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String declno;
	private String mwb;
	private String hwb;
	private String bag;
	private String bagno;
	private String out;

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
	public String getBag() {
		return this.bag;
	}
 
	@Override
	public void setBag(final String bag) {
		this.bag = bag; 
	}
 
	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getOut() {
		return this.out;
	}
 
	@Override
	public void setOut(final String out) {
		this.out = out; 
	}
 
}
