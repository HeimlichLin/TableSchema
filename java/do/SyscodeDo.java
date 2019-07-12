package com.doc.common.bean; 
 
public class SyscodeDo { 
 
	public enum COLUMNS { 
		TYPE_ID("null"), 
		CODE_ID("null"), 
		CODE_DATA1("null"), 
		CODE_DATA2("null"), 
		CODE_DATA3("null"), 
		CODE_DATA4("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String typeId; 
	private String codeId; 
	private String codeData1; 
	private String codeData2; 
	private String codeData3; 
	private String codeData4; 
	
	public String getTypeId() { 
		return typeId; 
	} 
 
	public void setTypeId(String typeId) { 
		this.typeId = typeId; 
	} 
 
	public String getCodeId() { 
		return codeId; 
	} 
 
	public void setCodeId(String codeId) { 
		this.codeId = codeId; 
	} 
 
	public String getCodeData1() { 
		return codeData1; 
	} 
 
	public void setCodeData1(String codeData1) { 
		this.codeData1 = codeData1; 
	} 
 
	public String getCodeData2() { 
		return codeData2; 
	} 
 
	public void setCodeData2(String codeData2) { 
		this.codeData2 = codeData2; 
	} 
 
	public String getCodeData3() { 
		return codeData3; 
	} 
 
	public void setCodeData3(String codeData3) { 
		this.codeData3 = codeData3; 
	} 
 
	public String getCodeData4() { 
		return codeData4; 
	} 
 
	public void setCodeData4(String codeData4) { 
		this.codeData4 = codeData4; 
	} 
 
} 
