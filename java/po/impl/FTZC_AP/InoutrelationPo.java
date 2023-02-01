package com.doc.common.po.impl; 
 
public class InoutrelationPo implements IInoutrelationPo {
 
	public enum COLUMNS {
		TRANSID("null"), //
		PARENTNO("null"), //
		PARENTITEM("null"), //
		CHILDNO("null"), //
		CHILDITEM("null"), //
		TRANSDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transid;
	private String parentno;
	private String parentitem;
	private String childno;
	private String childitem;
	private String transdate;

	@Override
	public String getTransid() {
		return this.transid;
	}
 
	@Override
	public void setTransid(final String transid) {
		this.transid = transid; 
	}
 
	@Override
	public String getParentno() {
		return this.parentno;
	}
 
	@Override
	public void setParentno(final String parentno) {
		this.parentno = parentno; 
	}
 
	@Override
	public String getParentitem() {
		return this.parentitem;
	}
 
	@Override
	public void setParentitem(final String parentitem) {
		this.parentitem = parentitem; 
	}
 
	@Override
	public String getChildno() {
		return this.childno;
	}
 
	@Override
	public void setChildno(final String childno) {
		this.childno = childno; 
	}
 
	@Override
	public String getChilditem() {
		return this.childitem;
	}
 
	@Override
	public void setChilditem(final String childitem) {
		this.childitem = childitem; 
	}
 
	@Override
	public String getTransdate() {
		return this.transdate;
	}
 
	@Override
	public void setTransdate(final String transdate) {
		this.transdate = transdate; 
	}
 
}
