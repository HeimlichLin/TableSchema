package com.doc.common.po.impl; 
 
public class T5117dBugPo implements IT5117dBugPo {
 
	public enum COLUMNS {
		CONTROLNO("null"), //
		DECLNO("null"), //
		PARTIALRELEASENOTE("null"), //
		GCODATE("null"), //
		DECLTYPE("null"), //
		IE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String controlno;
	private String declno;
	private String partialreleasenote;
	private String gcodate;
	private String decltype;
	private String ie;

	@Override
	public String getControlno() {
		return this.controlno;
	}
 
	@Override
	public void setControlno(final String controlno) {
		this.controlno = controlno; 
	}
 
	@Override
	public String getDeclno() {
		return this.declno;
	}
 
	@Override
	public void setDeclno(final String declno) {
		this.declno = declno; 
	}
 
	@Override
	public String getPartialreleasenote() {
		return this.partialreleasenote;
	}
 
	@Override
	public void setPartialreleasenote(final String partialreleasenote) {
		this.partialreleasenote = partialreleasenote; 
	}
 
	@Override
	public String getGcodate() {
		return this.gcodate;
	}
 
	@Override
	public void setGcodate(final String gcodate) {
		this.gcodate = gcodate; 
	}
 
	@Override
	public String getDecltype() {
		return this.decltype;
	}
 
	@Override
	public void setDecltype(final String decltype) {
		this.decltype = decltype; 
	}
 
	@Override
	public String getIe() {
		return this.ie;
	}
 
	@Override
	public void setIe(final String ie) {
		this.ie = ie; 
	}
 
}
