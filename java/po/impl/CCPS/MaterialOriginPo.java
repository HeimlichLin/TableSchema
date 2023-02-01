package com.doc.common.po.impl; 
 
public class MaterialOriginPo implements IMaterialOriginPo {
 
	public enum COLUMNS {
		MATERIAL_ORIGIN_IDEN_CODE("原材料原產地識別碼"), //
		MATERIAL_COMPANY_ASSO_CODE("原材料廠商資料關聯碼"), //
		ORIGIN_COUNTRY_ASSO_CODE("原產地國別關聯碼") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String materialOriginIdenCode;
	private String materialCompanyAssoCode;
	private String originCountryAssoCode;

	@Override
	public String getMaterialOriginIdenCode() {
		return this.materialOriginIdenCode;
	}
 
	@Override
	public void setMaterialOriginIdenCode(final String materialOriginIdenCode) {
		this.materialOriginIdenCode = materialOriginIdenCode; 
	}
 
	@Override
	public String getMaterialCompanyAssoCode() {
		return this.materialCompanyAssoCode;
	}
 
	@Override
	public void setMaterialCompanyAssoCode(final String materialCompanyAssoCode) {
		this.materialCompanyAssoCode = materialCompanyAssoCode; 
	}
 
	@Override
	public String getOriginCountryAssoCode() {
		return this.originCountryAssoCode;
	}
 
	@Override
	public void setOriginCountryAssoCode(final String originCountryAssoCode) {
		this.originCountryAssoCode = originCountryAssoCode; 
	}
 
}
