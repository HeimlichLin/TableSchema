package com.doc.common.po.impl; 
 
public class OpconfigPo implements IOpconfigPo {
 
	public enum COLUMNS {
		OP_CODE("null"), //
		OP_COMMENT("null"), //
		DESC("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String opCode;
	private String opComment;
	private String desc;

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
	public String getDesc() {
		return this.desc;
	}
 
	@Override
	public void setDesc(final String desc) {
		this.desc = desc; 
	}
 
}
