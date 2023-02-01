package com.doc.common.po.impl; 
 
public class FlightdestPo implements IFlightdestPo {
 
	public enum COLUMNS {
		FLIGHTNO("null"), //
		FLIGHTDEST("null"), //
		DESTDESCRIPTION("null") //
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
	private String flightdest;
	private String destdescription;

	@Override
	public String getFlightno() {
		return this.flightno;
	}
 
	@Override
	public void setFlightno(final String flightno) {
		this.flightno = flightno; 
	}
 
	@Override
	public String getFlightdest() {
		return this.flightdest;
	}
 
	@Override
	public void setFlightdest(final String flightdest) {
		this.flightdest = flightdest; 
	}
 
	@Override
	public String getDestdescription() {
		return this.destdescription;
	}
 
	@Override
	public void setDestdescription(final String destdescription) {
		this.destdescription = destdescription; 
	}
 
}
