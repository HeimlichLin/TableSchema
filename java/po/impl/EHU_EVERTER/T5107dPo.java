package com.doc.common.po.impl; 
 
public class T5107dPo implements IT5107dPo {
 
	public enum COLUMNS {
		DECLNO("null"), //
		MWB("null"), //
		HWB("null"), //
		ITEMNO("null"), //
		REQUIREDCODE1("null"), //
		REQUIREDCODE2("null"), //
		REQUIREDCODE3("null"), //
		REQUIREDCODE4("null"), //
		REQUIREDCODE5("null"), //
		LASTUPDATE("null"), //
		REQUIREDCODE6("應補辦事項代碼6"), //
		REQUIREDCODE7("應補辦事項代碼7"), //
		REQUIREDCODE8("應補辦事項代碼8"), //
		REQUIREDCODE9("應補辦事項代碼9") //
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
	private String itemno;
	private String requiredcode1;
	private String requiredcode2;
	private String requiredcode3;
	private String requiredcode4;
	private String requiredcode5;
	private java.sql.Timestamp lastupdate;
	private String requiredcode6;
	private String requiredcode7;
	private String requiredcode8;
	private String requiredcode9;

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
	public String getRequiredcode1() {
		return this.requiredcode1;
	}
 
	@Override
	public void setRequiredcode1(final String requiredcode1) {
		this.requiredcode1 = requiredcode1; 
	}
 
	@Override
	public String getRequiredcode2() {
		return this.requiredcode2;
	}
 
	@Override
	public void setRequiredcode2(final String requiredcode2) {
		this.requiredcode2 = requiredcode2; 
	}
 
	@Override
	public String getRequiredcode3() {
		return this.requiredcode3;
	}
 
	@Override
	public void setRequiredcode3(final String requiredcode3) {
		this.requiredcode3 = requiredcode3; 
	}
 
	@Override
	public String getRequiredcode4() {
		return this.requiredcode4;
	}
 
	@Override
	public void setRequiredcode4(final String requiredcode4) {
		this.requiredcode4 = requiredcode4; 
	}
 
	@Override
	public String getRequiredcode5() {
		return this.requiredcode5;
	}
 
	@Override
	public void setRequiredcode5(final String requiredcode5) {
		this.requiredcode5 = requiredcode5; 
	}
 
	@Override
	public java.sql.Timestamp getLastupdate() {
		return this.lastupdate;
	}
 
	@Override
	public void setLastupdate(final java.sql.Timestamp lastupdate) {
		this.lastupdate = lastupdate; 
	}
 
	@Override
	public String getRequiredcode6() {
		return this.requiredcode6;
	}
 
	@Override
	public void setRequiredcode6(final String requiredcode6) {
		this.requiredcode6 = requiredcode6; 
	}
 
	@Override
	public String getRequiredcode7() {
		return this.requiredcode7;
	}
 
	@Override
	public void setRequiredcode7(final String requiredcode7) {
		this.requiredcode7 = requiredcode7; 
	}
 
	@Override
	public String getRequiredcode8() {
		return this.requiredcode8;
	}
 
	@Override
	public void setRequiredcode8(final String requiredcode8) {
		this.requiredcode8 = requiredcode8; 
	}
 
	@Override
	public String getRequiredcode9() {
		return this.requiredcode9;
	}
 
	@Override
	public void setRequiredcode9(final String requiredcode9) {
		this.requiredcode9 = requiredcode9; 
	}
 
}
