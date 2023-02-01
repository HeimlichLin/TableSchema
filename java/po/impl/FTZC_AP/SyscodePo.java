package com.doc.common.po.impl; 
 
public class SyscodePo implements ISyscodePo {
 
	public enum COLUMNS {
		CODE_TYPE("代碼類別"), //
		CODE_ID("代碼id"), //
		CODE_COMMENT("代碼說明"), //
		CODE_REF1("代碼參考值1"), //
		CODE_REF2("代碼參考值2"), //
		CODE_REF3("代碼參考值3"), //
		CODE_PROCESS("使用代碼程式清單，以逗號分隔") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String codeType;
	private String codeId;
	private String codeComment;
	private String codeRef1;
	private String codeRef2;
	private String codeRef3;
	private String codeProcess;

	@Override
	public String getCodeType() {
		return this.codeType;
	}
 
	@Override
	public void setCodeType(final String codeType) {
		this.codeType = codeType; 
	}
 
	@Override
	public String getCodeId() {
		return this.codeId;
	}
 
	@Override
	public void setCodeId(final String codeId) {
		this.codeId = codeId; 
	}
 
	@Override
	public String getCodeComment() {
		return this.codeComment;
	}
 
	@Override
	public void setCodeComment(final String codeComment) {
		this.codeComment = codeComment; 
	}
 
	@Override
	public String getCodeRef1() {
		return this.codeRef1;
	}
 
	@Override
	public void setCodeRef1(final String codeRef1) {
		this.codeRef1 = codeRef1; 
	}
 
	@Override
	public String getCodeRef2() {
		return this.codeRef2;
	}
 
	@Override
	public void setCodeRef2(final String codeRef2) {
		this.codeRef2 = codeRef2; 
	}
 
	@Override
	public String getCodeRef3() {
		return this.codeRef3;
	}
 
	@Override
	public void setCodeRef3(final String codeRef3) {
		this.codeRef3 = codeRef3; 
	}
 
	@Override
	public String getCodeProcess() {
		return this.codeProcess;
	}
 
	@Override
	public void setCodeProcess(final String codeProcess) {
		this.codeProcess = codeProcess; 
	}
 
}
