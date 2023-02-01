package com.doc.common.po.impl; 
 
public class ServiceTypePo implements IServiceTypePo {
 
	public enum COLUMNS {
		TYPE_NAME("類別名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String typeName;

	@Override
	public String getTypeName() {
		return this.typeName;
	}
 
	@Override
	public void setTypeName(final String typeName) {
		this.typeName = typeName; 
	}
 
}
