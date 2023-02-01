package com.doc.common.po.impl; 
 
public class MisAirlinePo implements IMisAirlinePo {
 
	public enum COLUMNS {
		AIRLINEID("null"), //
		AIRLINECNAME("null"), //
		AIRLINEENAME("null"), //
		AIRLINESNAME("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String airlineid;
	private String airlinecname;
	private String airlineename;
	private String airlinesname;

	@Override
	public String getAirlineid() {
		return this.airlineid;
	}
 
	@Override
	public void setAirlineid(final String airlineid) {
		this.airlineid = airlineid; 
	}
 
	@Override
	public String getAirlinecname() {
		return this.airlinecname;
	}
 
	@Override
	public void setAirlinecname(final String airlinecname) {
		this.airlinecname = airlinecname; 
	}
 
	@Override
	public String getAirlineename() {
		return this.airlineename;
	}
 
	@Override
	public void setAirlineename(final String airlineename) {
		this.airlineename = airlineename; 
	}
 
	@Override
	public String getAirlinesname() {
		return this.airlinesname;
	}
 
	@Override
	public void setAirlinesname(final String airlinesname) {
		this.airlinesname = airlinesname; 
	}
 
}
