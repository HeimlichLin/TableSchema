package com.doc.common.po.impl; 
 
public class TransactionPo implements ITransactionPo {
 
	public enum COLUMNS {
		TRANSACTION_MASTER_IDEN_CODE("交易對象主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		FACTORY_INFO_ASSO_CODE("工廠基本資料關聯碼"), //
		TRANSACTION_RELATION("交易對象關係"), //
		DOMESTIC_CUSTOMER("國內客戶"), //
		DOMESTIC_SUPPLIER("國內供應商"), //
		DOMESTIC_PROVIDER("國內物流商"), //
		FOREIGN_CUSTOMER("國外客戶"), //
		FOREIGN_SUPPLIER("國外製造商"), //
		FOREIGN_PROVIDER("國外出口商"), //
		FOOD_BUSINESS_REGISTER_ID("交易對象食品業者登錄字號"), //
		NO_REGISTER_ID_REASON("交易對象未輸入登錄字號理由"), //
		NO_REGISTER_ID_DESCRIPTION("交易對象未輸入登錄字號說明"), //
		TRANSACTION_SELF_CODE("交易對象自編碼"), //
		TRANSACTION_COMPANY_CODE("交易對象統一編號"), //
		TRANSACTION_NAME("交易對象名稱"), //
		TRANSACTION_CITY("交易對象聯絡地址_縣市"), //
		TRANSACTION_TOWNSHIP_AREA("交易對象聯絡地址_鄉鎮區"), //
		TRANSACTION_DOMESTIC_ADDRESS("交易對象國內聯絡地址"), //
		TRANSACTION_FORIGN_ADDRESS("交易對象國外聯絡地址"), //
		TRANSACTION_CONTACT_PERSON("交易對象聯絡人"), //
		TRANSACTION_CONTACT_PHONE1("交易對象聯絡電話一"), //
		TRANSACTION_CONTACT_PHONE2("交易對象聯絡電話二") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String transactionMasterIdenCode;
	private String businessInfoAssoCode;
	private String factoryInfoAssoCode;
	private String transactionRelation;
	private String domesticCustomer;
	private String domesticSupplier;
	private String domesticProvider;
	private String foreignCustomer;
	private String foreignSupplier;
	private String foreignProvider;
	private String foodBusinessRegisterId;
	private String noRegisterIdReason;
	private String noRegisterIdDescription;
	private String transactionSelfCode;
	private String transactionCompanyCode;
	private String transactionName;
	private String transactionCity;
	private String transactionTownshipArea;
	private String transactionDomesticAddress;
	private String transactionForignAddress;
	private String transactionContactPerson;
	private String transactionContactPhone1;
	private String transactionContactPhone2;

	@Override
	public String getTransactionMasterIdenCode() {
		return this.transactionMasterIdenCode;
	}
 
	@Override
	public void setTransactionMasterIdenCode(final String transactionMasterIdenCode) {
		this.transactionMasterIdenCode = transactionMasterIdenCode; 
	}
 
	@Override
	public String getBusinessInfoAssoCode() {
		return this.businessInfoAssoCode;
	}
 
	@Override
	public void setBusinessInfoAssoCode(final String businessInfoAssoCode) {
		this.businessInfoAssoCode = businessInfoAssoCode; 
	}
 
	@Override
	public String getFactoryInfoAssoCode() {
		return this.factoryInfoAssoCode;
	}
 
	@Override
	public void setFactoryInfoAssoCode(final String factoryInfoAssoCode) {
		this.factoryInfoAssoCode = factoryInfoAssoCode; 
	}
 
	@Override
	public String getTransactionRelation() {
		return this.transactionRelation;
	}
 
	@Override
	public void setTransactionRelation(final String transactionRelation) {
		this.transactionRelation = transactionRelation; 
	}
 
	@Override
	public String getDomesticCustomer() {
		return this.domesticCustomer;
	}
 
	@Override
	public void setDomesticCustomer(final String domesticCustomer) {
		this.domesticCustomer = domesticCustomer; 
	}
 
	@Override
	public String getDomesticSupplier() {
		return this.domesticSupplier;
	}
 
	@Override
	public void setDomesticSupplier(final String domesticSupplier) {
		this.domesticSupplier = domesticSupplier; 
	}
 
	@Override
	public String getDomesticProvider() {
		return this.domesticProvider;
	}
 
	@Override
	public void setDomesticProvider(final String domesticProvider) {
		this.domesticProvider = domesticProvider; 
	}
 
	@Override
	public String getForeignCustomer() {
		return this.foreignCustomer;
	}
 
	@Override
	public void setForeignCustomer(final String foreignCustomer) {
		this.foreignCustomer = foreignCustomer; 
	}
 
	@Override
	public String getForeignSupplier() {
		return this.foreignSupplier;
	}
 
	@Override
	public void setForeignSupplier(final String foreignSupplier) {
		this.foreignSupplier = foreignSupplier; 
	}
 
	@Override
	public String getForeignProvider() {
		return this.foreignProvider;
	}
 
	@Override
	public void setForeignProvider(final String foreignProvider) {
		this.foreignProvider = foreignProvider; 
	}
 
	@Override
	public String getFoodBusinessRegisterId() {
		return this.foodBusinessRegisterId;
	}
 
	@Override
	public void setFoodBusinessRegisterId(final String foodBusinessRegisterId) {
		this.foodBusinessRegisterId = foodBusinessRegisterId; 
	}
 
	@Override
	public String getNoRegisterIdReason() {
		return this.noRegisterIdReason;
	}
 
	@Override
	public void setNoRegisterIdReason(final String noRegisterIdReason) {
		this.noRegisterIdReason = noRegisterIdReason; 
	}
 
	@Override
	public String getNoRegisterIdDescription() {
		return this.noRegisterIdDescription;
	}
 
	@Override
	public void setNoRegisterIdDescription(final String noRegisterIdDescription) {
		this.noRegisterIdDescription = noRegisterIdDescription; 
	}
 
	@Override
	public String getTransactionSelfCode() {
		return this.transactionSelfCode;
	}
 
	@Override
	public void setTransactionSelfCode(final String transactionSelfCode) {
		this.transactionSelfCode = transactionSelfCode; 
	}
 
	@Override
	public String getTransactionCompanyCode() {
		return this.transactionCompanyCode;
	}
 
	@Override
	public void setTransactionCompanyCode(final String transactionCompanyCode) {
		this.transactionCompanyCode = transactionCompanyCode; 
	}
 
	@Override
	public String getTransactionName() {
		return this.transactionName;
	}
 
	@Override
	public void setTransactionName(final String transactionName) {
		this.transactionName = transactionName; 
	}
 
	@Override
	public String getTransactionCity() {
		return this.transactionCity;
	}
 
	@Override
	public void setTransactionCity(final String transactionCity) {
		this.transactionCity = transactionCity; 
	}
 
	@Override
	public String getTransactionTownshipArea() {
		return this.transactionTownshipArea;
	}
 
	@Override
	public void setTransactionTownshipArea(final String transactionTownshipArea) {
		this.transactionTownshipArea = transactionTownshipArea; 
	}
 
	@Override
	public String getTransactionDomesticAddress() {
		return this.transactionDomesticAddress;
	}
 
	@Override
	public void setTransactionDomesticAddress(final String transactionDomesticAddress) {
		this.transactionDomesticAddress = transactionDomesticAddress; 
	}
 
	@Override
	public String getTransactionForignAddress() {
		return this.transactionForignAddress;
	}
 
	@Override
	public void setTransactionForignAddress(final String transactionForignAddress) {
		this.transactionForignAddress = transactionForignAddress; 
	}
 
	@Override
	public String getTransactionContactPerson() {
		return this.transactionContactPerson;
	}
 
	@Override
	public void setTransactionContactPerson(final String transactionContactPerson) {
		this.transactionContactPerson = transactionContactPerson; 
	}
 
	@Override
	public String getTransactionContactPhone1() {
		return this.transactionContactPhone1;
	}
 
	@Override
	public void setTransactionContactPhone1(final String transactionContactPhone1) {
		this.transactionContactPhone1 = transactionContactPhone1; 
	}
 
	@Override
	public String getTransactionContactPhone2() {
		return this.transactionContactPhone2;
	}
 
	@Override
	public void setTransactionContactPhone2(final String transactionContactPhone2) {
		this.transactionContactPhone2 = transactionContactPhone2; 
	}
 
}
