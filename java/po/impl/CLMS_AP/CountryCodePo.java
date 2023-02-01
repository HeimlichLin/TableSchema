package com.doc.common.po.impl; 
 
public class CountryCodePo implements ICountryCodePo {
 
	public enum COLUMNS {
		COUNTRYID("國家縮寫"), //
		COUNTRY_NAME("國家中文名稱"), //
		COUNTRY_E_NAME("國家英文名稱"), //
		LOCATION("全球區位") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String countryid;
	private String countryName;
	private String countryEName;
	private String location;

	@Override
	public String getCountryid() {
		return this.countryid;
	}
 
	@Override
	public void setCountryid(final String countryid) {
		this.countryid = countryid; 
	}
 
	@Override
	public String getCountryName() {
		return this.countryName;
	}
 
	@Override
	public void setCountryName(final String countryName) {
		this.countryName = countryName; 
	}
 
	@Override
	public String getCountryEName() {
		return this.countryEName;
	}
 
	@Override
	public void setCountryEName(final String countryEName) {
		this.countryEName = countryEName; 
	}
 
	@Override
	public String getLocation() {
		return this.location;
	}
 
	@Override
	public void setLocation(final String location) {
		this.location = location; 
	}
 
}
