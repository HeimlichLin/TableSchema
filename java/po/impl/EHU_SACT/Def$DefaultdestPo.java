package com.doc.common.po.impl; 
 
public class Def$DefaultdestPo implements IDef$DefaultdestPo {
 
	public enum COLUMNS {
		DBLINK("Default destination") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String dblink;

	@Override
	public String getDblink() {
		return this.dblink;
	}
 
	@Override
	public void setDblink(final String dblink) {
		this.dblink = dblink; 
	}
 
}
