package com.doc.common.po.impl; 
 
public class Cmn06mPo implements ICmn06mPo {
 
	public enum COLUMNS {
		CMN06M_DES_AIRPORT("null"), //
		CMN06M_AREA("null"), //
		CMN06M_AREA_CODE("null"), //
		CMN06M_AREA_NAME("null"), //
		CMN06M_AREA_STATE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String cmn06mDesAirport;
	private BigDecimal cmn06mArea;
	private String cmn06mAreaCode;
	private String cmn06mAreaName;
	private String cmn06mAreaState;

	@Override
	public String getCmn06mDesAirport() {
		return this.cmn06mDesAirport;
	}
 
	@Override
	public void setCmn06mDesAirport(final String cmn06mDesAirport) {
		this.cmn06mDesAirport = cmn06mDesAirport; 
	}
 
	@Override
	public BigDecimal getCmn06mArea() {
		return this.cmn06mArea;
	}
 
	@Override
	public void setCmn06mArea(final BigDecimal cmn06mArea) {
		this.cmn06mArea = cmn06mArea; 
	}
 
	@Override
	public String getCmn06mAreaCode() {
		return this.cmn06mAreaCode;
	}
 
	@Override
	public void setCmn06mAreaCode(final String cmn06mAreaCode) {
		this.cmn06mAreaCode = cmn06mAreaCode; 
	}
 
	@Override
	public String getCmn06mAreaName() {
		return this.cmn06mAreaName;
	}
 
	@Override
	public void setCmn06mAreaName(final String cmn06mAreaName) {
		this.cmn06mAreaName = cmn06mAreaName; 
	}
 
	@Override
	public String getCmn06mAreaState() {
		return this.cmn06mAreaState;
	}
 
	@Override
	public void setCmn06mAreaState(final String cmn06mAreaState) {
		this.cmn06mAreaState = cmn06mAreaState; 
	}
 
}
