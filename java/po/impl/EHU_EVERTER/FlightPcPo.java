package com.doc.common.po.impl; 
 
public class FlightPcPo implements IFlightPcPo {
 
	public enum COLUMNS {
		AIRLINE_ID("null"), //
		FLIGHT_NO("null"), //
		IE_TYPE("null"), //
		AIR_PC("null") //
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
	private String ieType;
	private String airPc;

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
	public String getIeType() {
		return this.ieType;
	}
 
	@Override
	public void setIeType(final String ieType) {
		this.ieType = ieType; 
	}
 
	@Override
	public String getAirPc() {
		return this.airPc;
	}
 
	@Override
	public void setAirPc(final String airPc) {
		this.airPc = airPc; 
	}
 
}
