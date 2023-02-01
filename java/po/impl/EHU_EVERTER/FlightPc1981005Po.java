package com.doc.common.po.impl; 
 
public class FlightPc1981005Po implements IFlightPc1981005Po {
 
	public enum COLUMNS {
		AIRLINE_ID("null"), //
		FLIGHT_NO("null"), //
		FLIGHT_PC("null"), //
		IE_TYPE("null"), //
		FLIGHT_PACK("null"), //
		FLIGHT_DEST("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String airlineId;
	private String flightNo;
	private String flightPc;
	private String ieType;
	private String flightPack;
	private String flightDest;

	@Override
	public String getAirlineId() {
		return this.airlineId;
	}
 
	@Override
	public void setAirlineId(final String airlineId) {
		this.airlineId = airlineId; 
	}
 
	@Override
	public String getFlightNo() {
		return this.flightNo;
	}
 
	@Override
	public void setFlightNo(final String flightNo) {
		this.flightNo = flightNo; 
	}
 
	@Override
	public String getFlightPc() {
		return this.flightPc;
	}
 
	@Override
	public void setFlightPc(final String flightPc) {
		this.flightPc = flightPc; 
	}
 
	@Override
	public String getIeType() {
		return this.ieType;
	}
 
	@Override
	public void setIeType(final String ieType) {
		this.ieType = ieType; 
	}
 
	@Override
	public String getFlightPack() {
		return this.flightPack;
	}
 
	@Override
	public void setFlightPack(final String flightPack) {
		this.flightPack = flightPack; 
	}
 
	@Override
	public String getFlightDest() {
		return this.flightDest;
	}
 
	@Override
	public void setFlightDest(final String flightDest) {
		this.flightDest = flightDest; 
	}
 
}
