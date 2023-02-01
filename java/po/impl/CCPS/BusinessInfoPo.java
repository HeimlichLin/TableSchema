package com.doc.common.po.impl; 
 
public class BusinessInfoPo implements IBusinessInfoPo {
 
	public enum COLUMNS {
		BUSINESS_INFO_MASTER_IDEN_CODE("業者基本資料主檔識別碼"), //
		FOOD_REG_NUM("食品登記字號"), //
		BAN("公司商業統一編號"), //
		NAME("公司商業登記名稱"), //
		BRAND("品牌名稱或店名"), //
		BOSS("負責人"), //
		CITY("公司商業登記地址_縣市"), //
		AREA("公司商業登記地址_鄉鎮市區"), //
		ADDRESS("公司商業登記地址_街道門牌"), //
		ZIPCODE("郵遞區號"), //
		TEL("電話號碼"), //
		FAX("傳真號碼"), //
		CONTACTS("緊急聯絡人"), //
		CONTACTS_TITLE("緊急聯絡人職稱"), //
		CONTACTS_EMAIL("緊急聯絡人Email"), //
		CONTACTS_MOBILE("緊急聯絡人手機"), //
		STATUS("營業狀況"), //
		REMARK("備註"), //
		INDUSTRY_II("營業項目_輸入"), //
		INDUSTRY_MF("營業項目_製造及加工"), //
		INDUSTRY_SB("營業項目_販售"), //
		INDUSTRY_BI("營業項目_餐飲") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String businessInfoMasterIdenCode;
	private String foodRegNum;
	private String ban;
	private String name;
	private String brand;
	private String boss;
	private String city;
	private String area;
	private String address;
	private String zipcode;
	private String tel;
	private String fax;
	private String contacts;
	private String contactsTitle;
	private String contactsEmail;
	private String contactsMobile;
	private String status;
	private String remark;
	private String industryIi;
	private String industryMf;
	private String industrySb;
	private String industryBi;

	@Override
	public String getBusinessInfoMasterIdenCode() {
		return this.businessInfoMasterIdenCode;
	}
 
	@Override
	public void setBusinessInfoMasterIdenCode(final String businessInfoMasterIdenCode) {
		this.businessInfoMasterIdenCode = businessInfoMasterIdenCode; 
	}
 
	@Override
	public String getFoodRegNum() {
		return this.foodRegNum;
	}
 
	@Override
	public void setFoodRegNum(final String foodRegNum) {
		this.foodRegNum = foodRegNum; 
	}
 
	@Override
	public String getBan() {
		return this.ban;
	}
 
	@Override
	public void setBan(final String ban) {
		this.ban = ban; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public String getBrand() {
		return this.brand;
	}
 
	@Override
	public void setBrand(final String brand) {
		this.brand = brand; 
	}
 
	@Override
	public String getBoss() {
		return this.boss;
	}
 
	@Override
	public void setBoss(final String boss) {
		this.boss = boss; 
	}
 
	@Override
	public String getCity() {
		return this.city;
	}
 
	@Override
	public void setCity(final String city) {
		this.city = city; 
	}
 
	@Override
	public String getArea() {
		return this.area;
	}
 
	@Override
	public void setArea(final String area) {
		this.area = area; 
	}
 
	@Override
	public String getAddress() {
		return this.address;
	}
 
	@Override
	public void setAddress(final String address) {
		this.address = address; 
	}
 
	@Override
	public String getZipcode() {
		return this.zipcode;
	}
 
	@Override
	public void setZipcode(final String zipcode) {
		this.zipcode = zipcode; 
	}
 
	@Override
	public String getTel() {
		return this.tel;
	}
 
	@Override
	public void setTel(final String tel) {
		this.tel = tel; 
	}
 
	@Override
	public String getFax() {
		return this.fax;
	}
 
	@Override
	public void setFax(final String fax) {
		this.fax = fax; 
	}
 
	@Override
	public String getContacts() {
		return this.contacts;
	}
 
	@Override
	public void setContacts(final String contacts) {
		this.contacts = contacts; 
	}
 
	@Override
	public String getContactsTitle() {
		return this.contactsTitle;
	}
 
	@Override
	public void setContactsTitle(final String contactsTitle) {
		this.contactsTitle = contactsTitle; 
	}
 
	@Override
	public String getContactsEmail() {
		return this.contactsEmail;
	}
 
	@Override
	public void setContactsEmail(final String contactsEmail) {
		this.contactsEmail = contactsEmail; 
	}
 
	@Override
	public String getContactsMobile() {
		return this.contactsMobile;
	}
 
	@Override
	public void setContactsMobile(final String contactsMobile) {
		this.contactsMobile = contactsMobile; 
	}
 
	@Override
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
	@Override
	public String getRemark() {
		return this.remark;
	}
 
	@Override
	public void setRemark(final String remark) {
		this.remark = remark; 
	}
 
	@Override
	public String getIndustryIi() {
		return this.industryIi;
	}
 
	@Override
	public void setIndustryIi(final String industryIi) {
		this.industryIi = industryIi; 
	}
 
	@Override
	public String getIndustryMf() {
		return this.industryMf;
	}
 
	@Override
	public void setIndustryMf(final String industryMf) {
		this.industryMf = industryMf; 
	}
 
	@Override
	public String getIndustrySb() {
		return this.industrySb;
	}
 
	@Override
	public void setIndustrySb(final String industrySb) {
		this.industrySb = industrySb; 
	}
 
	@Override
	public String getIndustryBi() {
		return this.industryBi;
	}
 
	@Override
	public void setIndustryBi(final String industryBi) {
		this.industryBi = industryBi; 
	}
 
}
