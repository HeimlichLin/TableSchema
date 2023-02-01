package com.doc.common.po.impl; 
 
public class InvtrybondPo implements IInvtrybondPo {
 
	public enum COLUMNS {
		BONDNO("null"), //
		YY("null"), //
		STRTDATE("null"), //
		ENDDATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String bondno;
	private String yy;
	private String strtdate;
	private String enddate;

	@Override
	public String getBondno() {
		return this.bondno;
	}
 
	@Override
	public void setBondno(final String bondno) {
		this.bondno = bondno; 
	}
 
	@Override
	public String getYy() {
		return this.yy;
	}
 
	@Override
	public void setYy(final String yy) {
		this.yy = yy; 
	}
 
	@Override
	public String getStrtdate() {
		return this.strtdate;
	}
 
	@Override
	public void setStrtdate(final String strtdate) {
		this.strtdate = strtdate; 
	}
 
	@Override
	public String getEnddate() {
		return this.enddate;
	}
 
	@Override
	public void setEnddate(final String enddate) {
		this.enddate = enddate; 
	}
 
}
