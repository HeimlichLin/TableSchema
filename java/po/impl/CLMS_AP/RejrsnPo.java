package com.doc.common.po.impl; 
 
public class RejrsnPo implements IRejrsnPo {
 
	public enum COLUMNS {
		REJNO("null"), //
		REJNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String rejno;
	private String rejname;

	@Override
	public String getRejno() {
		return this.rejno;
	}
 
	@Override
	public void setRejno(final String rejno) {
		this.rejno = rejno; 
	}
 
	@Override
	public String getRejname() {
		return this.rejname;
	}
 
	@Override
	public void setRejname(final String rejname) {
		this.rejname = rejname; 
	}
 
}
