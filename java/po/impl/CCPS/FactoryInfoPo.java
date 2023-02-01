package com.doc.common.po.impl; 
 
public class FactoryInfoPo implements IFactoryInfoPo {
 
	public enum COLUMNS {
		FACTORY_INFO_MASTER_IDEN_CODE("工廠基本資料主檔識別碼"), //
		BUSINESS_INFO_MASTER_ASSO_CODE("業者基本資料主檔關聯碼"), //
		FOOD_REG_NUM("食品登記字號"), //
		SCALE("工廠製造場所規模"), //
		REGED("工廠登記"), //
		BAN("工廠登記編號"), //
		NAME("工廠製造場所名稱"), //
		CITY("工廠製造場所地址_縣市"), //
		AREA("工廠製造場所地址_鄉鎮市區"), //
		ADDRESS("工廠製造場所地址_街道門牌"), //
		ZIPCODE("郵遞區號"), //
		TEL("電話號碼"), //
		FAX("傳真號碼"), //
		CONTACTS("工廠製造場所聯絡人"), //
		CONTACTS_TITLE("工廠製造場所聯絡人職稱"), //
		CONTACTS_EMAIL("工廠製造場所聯絡人Email"), //
		STATUS("營業狀況") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String factoryInfoMasterIdenCode;
	private String businessInfoMasterAssoCode;
	private String foodRegNum;
	private String scale;
	private String reged;
	private String ban;
	private String name;
	private String city;
	private String area;
	private String address;
	private String zipcode;
	private String tel;
	private String fax;
	private String contacts;
	private String contactsTitle;
	private String contactsEmail;
	private String status;

	@Override
	public String getFactoryInfoMasterIdenCode() {
		return this.factoryInfoMasterIdenCode;
	}
 
	@Override
	public void setFactoryInfoMasterIdenCode(final String factoryInfoMasterIdenCode) {
		this.factoryInfoMasterIdenCode = factoryInfoMasterIdenCode; 
	}
 
	@Override
	public String getBusinessInfoMasterAssoCode() {
		return this.businessInfoMasterAssoCode;
	}
 
	@Override
	public void setBusinessInfoMasterAssoCode(final String businessInfoMasterAssoCode) {
		this.businessInfoMasterAssoCode = businessInfoMasterAssoCode; 
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
	public String getScale() {
		return this.scale;
	}
 
	@Override
	public void setScale(final String scale) {
		this.scale = scale; 
	}
 
	@Override
	public String getReged() {
		return this.reged;
	}
 
	@Override
	public void setReged(final String reged) {
		this.reged = reged; 
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
	public String getStatus() {
		return this.status;
	}
 
	@Override
	public void setStatus(final String status) {
		this.status = status; 
	}
 
}
