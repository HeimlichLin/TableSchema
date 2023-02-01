package com.doc.common.po.impl; 
 
public class DhlImmawblistPo implements IDhlImmawblistPo {
 
	public enum COLUMNS {
		FLIGHTNO("null"), //
		MAWB("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String flightno;
	private String mawb;

	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getMawb() {
		return this.mawb;
	}
 
	@Override
	public void setMawb(final String mawb) {
		this.mawb = mawb; 
	}
 
}
