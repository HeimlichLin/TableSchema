package com.doc.common.po.impl; 
 
public class ManufactureProductdayPo implements IManufactureProductdayPo {
 
	public enum COLUMNS {
		MANUFACTURE_DATE_IDEN_CODE("製造資料產品日期識別碼"), //
		MANUFACTURE_MASTER_ASSO_CODE("製造資料主檔關聯碼"), //
		MANUFACTURE_DAY("製造日期"), //
		EXPIRY_DAY("有效日期") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String manufactureDateIdenCode;
	private String manufactureMasterAssoCode;
	private String manufactureDay;
	private String expiryDay;

	@Override
	public String getManufactureDateIdenCode() {
		return this.manufactureDateIdenCode;
	}
 
	@Override
	public void setManufactureDateIdenCode(final String manufactureDateIdenCode) {
		this.manufactureDateIdenCode = manufactureDateIdenCode; 
	}
 
	@Override
	public String getManufactureMasterAssoCode() {
		return this.manufactureMasterAssoCode;
	}
 
	@Override
	public void setManufactureMasterAssoCode(final String manufactureMasterAssoCode) {
		this.manufactureMasterAssoCode = manufactureMasterAssoCode; 
	}
 
	@Override
	public String getManufactureDay() {
		return this.manufactureDay;
	}
 
	@Override
	public void setManufactureDay(final String manufactureDay) {
		this.manufactureDay = manufactureDay; 
	}
 
	@Override
	public String getExpiryDay() {
		return this.expiryDay;
	}
 
	@Override
	public void setExpiryDay(final String expiryDay) {
		this.expiryDay = expiryDay; 
	}
 
}
