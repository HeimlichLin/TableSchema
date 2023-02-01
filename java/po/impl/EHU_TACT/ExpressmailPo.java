package com.doc.common.po.impl; 
 
public class ExpressmailPo implements IExpressmailPo {
 
	public enum COLUMNS {
		AREA("null"), //
		MAILSUB("null"), //
		MAILBODY("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String area;
	private String mailsub;
	private String mailbody;

	@Override
	public String getArea() {
		return this.area;
	}
 
	@Override
	public void setArea(final String area) {
		this.area = area; 
	}
 
	@Override
	public String getMailsub() {
		return this.mailsub;
	}
 
	@Override
	public void setMailsub(final String mailsub) {
		this.mailsub = mailsub; 
	}
 
	@Override
	public String getMailbody() {
		return this.mailbody;
	}
 
	@Override
	public void setMailbody(final String mailbody) {
		this.mailbody = mailbody; 
	}
 
}
