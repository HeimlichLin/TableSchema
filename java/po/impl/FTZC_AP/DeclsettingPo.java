package com.doc.common.po.impl; 
 
public class DeclsettingPo implements IDeclsettingPo {
 
	public enum COLUMNS {
		KEY("PK"), //
		DECL_TYPE("報單類別"), //
		DECL_KIND("統計或是納稅辦法"), //
		DECL_IM("進口報單為I出口報單E"), //
		REF1("參考值1"), //
		REF2("參考值2"), //
		REF3("參考值3"), //
		OP_CODE("作業類別"), //
		OP_COMMENT("作業類別說明"), //
		VALUE1("數值1"), //
		VALUE2("數值2"), //
		VALUE3("數值3"), //
		INOUT_TYPE("進出倉別"), //
		BOM_MARK("Y:挑選用料單"), //
		BAL_MARK("滯外帳註記,Y:挑選滯外帳"), //
		BAL_T_MARK("BALANCE_T_MARK Y 產生/使用多階段加工滯外帳") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String key;
	private String declType;
	private String declKind;
	private String declIm;
	private String ref1;
	private String ref2;
	private String ref3;
	private String opCode;
	private String opComment;
	private String value1;
	private String value2;
	private String value3;
	private String inoutType;
	private String bomMark;
	private String balMark;
	private String balTMark;

	@Override
	public String getKey() {
		return this.key;
	}
 
	@Override
	public void setKey(final String key) {
		this.key = key; 
	}
 
	@Override
	public String getDeclType() {
		return this.declType;
	}
 
	@Override
	public void setDeclType(final String declType) {
		this.declType = declType; 
	}
 
	@Override
	public String getDeclKind() {
		return this.declKind;
	}
 
	@Override
	public void setDeclKind(final String declKind) {
		this.declKind = declKind; 
	}
 
	@Override
	public String getDeclIm() {
		return this.declIm;
	}
 
	@Override
	public void setDeclIm(final String declIm) {
		this.declIm = declIm; 
	}
 
	@Override
	public String getRef1() {
		return this.ref1;
	}
 
	@Override
	public void setRef1(final String ref1) {
		this.ref1 = ref1; 
	}
 
	@Override
	public String getRef2() {
		return this.ref2;
	}
 
	@Override
	public void setRef2(final String ref2) {
		this.ref2 = ref2; 
	}
 
	@Override
	public String getRef3() {
		return this.ref3;
	}
 
	@Override
	public void setRef3(final String ref3) {
		this.ref3 = ref3; 
	}
 
	@Override
	public String getOpCode() {
		return this.opCode;
	}
 
	@Override
	public void setOpCode(final String opCode) {
		this.opCode = opCode; 
	}
 
	@Override
	public String getOpComment() {
		return this.opComment;
	}
 
	@Override
	public void setOpComment(final String opComment) {
		this.opComment = opComment; 
	}
 
	@Override
	public String getValue1() {
		return this.value1;
	}
 
	@Override
	public void setValue1(final String value1) {
		this.value1 = value1; 
	}
 
	@Override
	public String getValue2() {
		return this.value2;
	}
 
	@Override
	public void setValue2(final String value2) {
		this.value2 = value2; 
	}
 
	@Override
	public String getValue3() {
		return this.value3;
	}
 
	@Override
	public void setValue3(final String value3) {
		this.value3 = value3; 
	}
 
	@Override
	public String getInoutType() {
		return this.inoutType;
	}
 
	@Override
	public void setInoutType(final String inoutType) {
		this.inoutType = inoutType; 
	}
 
	@Override
	public String getBomMark() {
		return this.bomMark;
	}
 
	@Override
	public void setBomMark(final String bomMark) {
		this.bomMark = bomMark; 
	}
 
	@Override
	public String getBalMark() {
		return this.balMark;
	}
 
	@Override
	public void setBalMark(final String balMark) {
		this.balMark = balMark; 
	}
 
	@Override
	public String getBalTMark() {
		return this.balTMark;
	}
 
	@Override
	public void setBalTMark(final String balTMark) {
		this.balTMark = balTMark; 
	}
 
}
