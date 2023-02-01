package com.doc.common.po.impl; 
 
public class XraycallPo implements IXraycallPo {
 
	public enum COLUMNS {
		EXPBAGNO("null"), //
		CALLTIMESTAMP("null"), //
		FINISH("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String expbagno;
	private java.sql.Timestamp calltimestamp;
	private String finish;

	@Override
	public String getExpbagno() {
		return this.expbagno;
	}
 
	@Override
	public void setExpbagno(final String expbagno) {
		this.expbagno = expbagno; 
	}
 
	@Override
	public java.sql.Timestamp getCalltimestamp() {
		return this.calltimestamp;
	}
 
	@Override
	public void setCalltimestamp(final java.sql.Timestamp calltimestamp) {
		this.calltimestamp = calltimestamp; 
	}
 
	@Override
	public String getFinish() {
		return this.finish;
	}
 
	@Override
	public void setFinish(final String finish) {
		this.finish = finish; 
	}
 
}
