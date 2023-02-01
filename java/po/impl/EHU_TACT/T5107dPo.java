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
		REQUIREDCODE9("應補辦事項代碼9"), //
		IMAGENAME1("檢附影像文件名稱 1"), //
		IMAGENAME2("檢附影像文件名稱 2"), //
		IMAGENAME3("檢附影像文件名稱 3"), //
		IMAGENAME4("檢附影像文件名稱 4"), //
		IMAGENAME5("檢附影像文件名稱 5"), //
		IMAGENAME6("檢附影像文件名稱 6"), //
		IMAGENAME7("檢附影像文件名稱 7"), //
		IMAGENAME8("檢附影像文件名稱 8"), //
		IMAGENAME9("檢附影像文件名稱 9"), //
		PERMITNO1("輸出入規定1 "), //
		PERMITNO2("輸出入規定2"), //
		PERMITNO3("輸出入規定3"), //
		PERMITNO4("輸出入規定4"), //
		PERMITNO5("輸出入規定5"), //
		PERMITNO6("輸出入規定6"), //
		PERMITNO7("輸出入規定7"), //
		PERMITNO8("輸出入規定8"), //
		PERMITNO9("輸出入規定9") //
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
	private String imagename1;
	private String imagename2;
	private String imagename3;
	private String imagename4;
	private String imagename5;
	private String imagename6;
	private String imagename7;
	private String imagename8;
	private String imagename9;
	private String permitno1;
	private String permitno2;
	private String permitno3;
	private String permitno4;
	private String permitno5;
	private String permitno6;
	private String permitno7;
	private String permitno8;
	private String permitno9;

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
 
	@Override
	public String getImagename1() {
		return this.imagename1;
	}
 
	@Override
	public void setImagename1(final String imagename1) {
		this.imagename1 = imagename1; 
	}
 
	@Override
	public String getImagename2() {
		return this.imagename2;
	}
 
	@Override
	public void setImagename2(final String imagename2) {
		this.imagename2 = imagename2; 
	}
 
	@Override
	public String getImagename3() {
		return this.imagename3;
	}
 
	@Override
	public void setImagename3(final String imagename3) {
		this.imagename3 = imagename3; 
	}
 
	@Override
	public String getImagename4() {
		return this.imagename4;
	}
 
	@Override
	public void setImagename4(final String imagename4) {
		this.imagename4 = imagename4; 
	}
 
	@Override
	public String getImagename5() {
		return this.imagename5;
	}
 
	@Override
	public void setImagename5(final String imagename5) {
		this.imagename5 = imagename5; 
	}
 
	@Override
	public String getImagename6() {
		return this.imagename6;
	}
 
	@Override
	public void setImagename6(final String imagename6) {
		this.imagename6 = imagename6; 
	}
 
	@Override
	public String getImagename7() {
		return this.imagename7;
	}
 
	@Override
	public void setImagename7(final String imagename7) {
		this.imagename7 = imagename7; 
	}
 
	@Override
	public String getImagename8() {
		return this.imagename8;
	}
 
	@Override
	public void setImagename8(final String imagename8) {
		this.imagename8 = imagename8; 
	}
 
	@Override
	public String getImagename9() {
		return this.imagename9;
	}
 
	@Override
	public void setImagename9(final String imagename9) {
		this.imagename9 = imagename9; 
	}
 
	@Override
	public String getPermitno1() {
		return this.permitno1;
	}
 
	@Override
	public void setPermitno1(final String permitno1) {
		this.permitno1 = permitno1; 
	}
 
	@Override
	public String getPermitno2() {
		return this.permitno2;
	}
 
	@Override
	public void setPermitno2(final String permitno2) {
		this.permitno2 = permitno2; 
	}
 
	@Override
	public String getPermitno3() {
		return this.permitno3;
	}
 
	@Override
	public void setPermitno3(final String permitno3) {
		this.permitno3 = permitno3; 
	}
 
	@Override
	public String getPermitno4() {
		return this.permitno4;
	}
 
	@Override
	public void setPermitno4(final String permitno4) {
		this.permitno4 = permitno4; 
	}
 
	@Override
	public String getPermitno5() {
		return this.permitno5;
	}
 
	@Override
	public void setPermitno5(final String permitno5) {
		this.permitno5 = permitno5; 
	}
 
	@Override
	public String getPermitno6() {
		return this.permitno6;
	}
 
	@Override
	public void setPermitno6(final String permitno6) {
		this.permitno6 = permitno6; 
	}
 
	@Override
	public String getPermitno7() {
		return this.permitno7;
	}
 
	@Override
	public void setPermitno7(final String permitno7) {
		this.permitno7 = permitno7; 
	}
 
	@Override
	public String getPermitno8() {
		return this.permitno8;
	}
 
	@Override
	public void setPermitno8(final String permitno8) {
		this.permitno8 = permitno8; 
	}
 
	@Override
	public String getPermitno9() {
		return this.permitno9;
	}
 
	@Override
	public void setPermitno9(final String permitno9) {
		this.permitno9 = permitno9; 
	}
 
}
