package com.doc.common.po.impl; 
 
public class ChinaFlightPo implements IChinaFlightPo {
 
	public enum COLUMNS {
		IE_TYPE("null"), //
		AIRLINE_ID("null"), //
		FLIGHT_NO("null"), //
		FLIGHT_DATE("null"), //
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
 
	private String ieType;
	private String airlineId;
	private String flightNo;
	private String flightDate;
	private String flightDest;

	@Override
	public String getIeType() {
		return this.ieType;
	}
 
	@Override
	public void setIeType(final String ieType) {
		this.ieType = ieType; 
	}
 
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
	public String getFlightDate() {
		return this.flightDate;
	}
 
	@Override
	public void setFlightDate(final String flightDate) {
		this.flightDate = flightDate; 
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
