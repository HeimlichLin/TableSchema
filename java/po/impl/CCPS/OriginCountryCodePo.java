package com.doc.common.po.impl; 
 
public class OriginCountryCodePo implements IOriginCountryCodePo {
 
	public enum COLUMNS {
		ORIGIN_COUNTRY_CODE("代碼"), //
		ORIGIN_COUNTRY_NAME("國別中文名稱"), //
		ORIGIN_COUNTRY_ENG_NAME("國別英文名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String originCountryCode;
	private String originCountryName;
	private String originCountryEngName;

	@Override
	public String getOriginCountryCode() {
		return this.originCountryCode;
	}
 
	@Override
	public void setOriginCountryCode(final String originCountryCode) {
		this.originCountryCode = originCountryCode; 
	}
 
	@Override
	public String getOriginCountryName() {
		return this.originCountryName;
	}
 
	@Override
	public void setOriginCountryName(final String originCountryName) {
		this.originCountryName = originCountryName; 
	}
 
	@Override
	public String getOriginCountryEngName() {
		return this.originCountryEngName;
	}
 
	@Override
	public void setOriginCountryEngName(final String originCountryEngName) {
		this.originCountryEngName = originCountryEngName; 
	}
 
}
