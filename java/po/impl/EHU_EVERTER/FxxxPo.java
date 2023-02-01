package com.doc.common.po.impl; 
 
public class FxxxPo implements IFxxxPo {
 
	public enum COLUMNS {
		BAGNO("null"), //
		A1("null"), //
		F1("null"), //
		A2("null"), //
		F2("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bagno;
	private String a1;
	private String f1;
	private String a2;
	private String f2;

	@Override
	public String getBagno() {
		return this.bagno;
	}
 
	@Override
	public void setBagno(final String bagno) {
		this.bagno = bagno; 
	}
 
	@Override
	public String getA1() {
		return this.a1;
	}
 
	@Override
	public void setA1(final String a1) {
		this.a1 = a1; 
	}
 
	@Override
	public String getF1() {
		return this.f1;
	}
 
	@Override
	public void setF1(final String f1) {
		this.f1 = f1; 
	}
 
	@Override
	public String getA2() {
		return this.a2;
	}
 
	@Override
	public void setA2(final String a2) {
		this.a2 = a2; 
	}
 
	@Override
	public String getF2() {
		return this.f2;
	}
 
	@Override
	public void setF2(final String f2) {
		this.f2 = f2; 
	}
 
}
