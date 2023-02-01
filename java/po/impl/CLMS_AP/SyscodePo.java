package com.doc.common.po.impl; 
 
public class SyscodePo implements ISyscodePo {
 
	public enum COLUMNS {
		TYPE_ID("代碼別"), //
		CODE_ID("代碼"), //
		CODE_DATA1("中文說明一"), //
		CODE_DATA2("中文說明二"), //
		CODE_DATA3("中文說明三"), //
		CODE_DATA4("中文說明四") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String typeId;
	private String codeId;
	private String codeData1;
	private String codeData2;
	private String codeData3;
	private String codeData4;

	@Override
	public String getTypeId() {
		return this.typeId;
	}
 
	@Override
	public void setTypeId(final String typeId) {
		this.typeId = typeId; 
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
	public String getCodeData1() {
		return this.codeData1;
	}
 
	@Override
	public void setCodeData1(final String codeData1) {
		this.codeData1 = codeData1; 
	}
 
	@Override
	public String getCodeData2() {
		return this.codeData2;
	}
 
	@Override
	public void setCodeData2(final String codeData2) {
		this.codeData2 = codeData2; 
	}
 
	@Override
	public String getCodeData3() {
		return this.codeData3;
	}
 
	@Override
	public void setCodeData3(final String codeData3) {
		this.codeData3 = codeData3; 
	}
 
	@Override
	public String getCodeData4() {
		return this.codeData4;
	}
 
	@Override
	public void setCodeData4(final String codeData4) {
		this.codeData4 = codeData4; 
	}
 
}
