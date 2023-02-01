package com.doc.common.po.impl; 
 
public class UldreportqueryPo implements IUldreportqueryPo {
 
	public enum COLUMNS {
		QUERYTIME("null"), //
		CONTAINER("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String querytime;
	private String container;

	@Override
	public String getQuerytime() {
		return this.querytime;
	}
 
	@Override
	public void setQuerytime(final String querytime) {
		this.querytime = querytime; 
	}
 
	@Override
	public String getContainer() {
		return this.container;
	}
 
	@Override
	public void setContainer(final String container) {
		this.container = container; 
	}
 
}
