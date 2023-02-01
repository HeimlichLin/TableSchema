package com.doc.common.po.impl; 
 
public class ProductInfoPo implements IProductInfoPo {
 
	public enum COLUMNS {
		PRODUCT_INFO_MASTER_IDEN_CODE("產品資訊主檔識別碼"), //
		BUSINESS_INFO_ASSO_CODE("業者基本資料關聯碼"), //
		FACTORY_INFO_ASSO_CODE("工廠基本資料關聯碼"), //
		PRODUCT_SORT_BIG("產品分類大分類"), //
		PRODUCT_SORT_MID("產品分類中分類"), //
		PRODUCT_SORT_SMALL("產品分類小分類"), //
		PRODUCT_SORT_CAREFUL("產品分類細分類"), //
		PRODUCT_CHINESE_NAME("產品中文名稱"), //
		PRODUCT_ENG_NAME("產品英文名稱"), //
		STORAGE_TRANS_CONDITION("儲運條件"), //
		STORAGE_TRANS_CONDITION_REMARK("儲運條件其他備註"), //
		OTHER_STORAGE_TRANS_CONDITION("其他儲運條件"), //
		RESPONSIBLE_COMPANY_CODE("負責廠商登錄字號"), //
		RESPONSIBLE_COMPANY_NAME("負責廠商名稱"), //
		RESPONSIBLE_COMPANY_ADDRESS("負責廠商地址"), //
		TRANSFAT_CAVEAT("反式脂肪醒語"), //
		WARNING("警語"), //
		FEATURE("特色"), //
		RECOMMEND_FOOD_METHOD("建議食用方式"), //
		PRODUCT_URL("產品網址") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String productInfoMasterIdenCode;
	private String businessInfoAssoCode;
	private String factoryInfoAssoCode;
	private String productSortBig;
	private String productSortMid;
	private String productSortSmall;
	private String productSortCareful;
	private String productChineseName;
	private String productEngName;
	private String storageTransCondition;
	private String storageTransConditionRemark;
	private String otherStorageTransCondition;
	private String responsibleCompanyCode;
	private String responsibleCompanyName;
	private String responsibleCompanyAddress;
	private String transfatCaveat;
	private String warning;
	private String feature;
	private String recommendFoodMethod;
	private String productUrl;

	@Override
	public String getProductInfoMasterIdenCode() {
		return this.productInfoMasterIdenCode;
	}
 
	@Override
	public void setProductInfoMasterIdenCode(final String productInfoMasterIdenCode) {
		this.productInfoMasterIdenCode = productInfoMasterIdenCode; 
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
	public String getProductSortBig() {
		return this.productSortBig;
	}
 
	@Override
	public void setProductSortBig(final String productSortBig) {
		this.productSortBig = productSortBig; 
	}
 
	@Override
	public String getProductSortMid() {
		return this.productSortMid;
	}
 
	@Override
	public void setProductSortMid(final String productSortMid) {
		this.productSortMid = productSortMid; 
	}
 
	@Override
	public String getProductSortSmall() {
		return this.productSortSmall;
	}
 
	@Override
	public void setProductSortSmall(final String productSortSmall) {
		this.productSortSmall = productSortSmall; 
	}
 
	@Override
	public String getProductSortCareful() {
		return this.productSortCareful;
	}
 
	@Override
	public void setProductSortCareful(final String productSortCareful) {
		this.productSortCareful = productSortCareful; 
	}
 
	@Override
	public String getProductChineseName() {
		return this.productChineseName;
	}
 
	@Override
	public void setProductChineseName(final String productChineseName) {
		this.productChineseName = productChineseName; 
	}
 
	@Override
	public String getProductEngName() {
		return this.productEngName;
	}
 
	@Override
	public void setProductEngName(final String productEngName) {
		this.productEngName = productEngName; 
	}
 
	@Override
	public String getStorageTransCondition() {
		return this.storageTransCondition;
	}
 
	@Override
	public void setStorageTransCondition(final String storageTransCondition) {
		this.storageTransCondition = storageTransCondition; 
	}
 
	@Override
	public String getStorageTransConditionRemark() {
		return this.storageTransConditionRemark;
	}
 
	@Override
	public void setStorageTransConditionRemark(final String storageTransConditionRemark) {
		this.storageTransConditionRemark = storageTransConditionRemark; 
	}
 
	@Override
	public String getOtherStorageTransCondition() {
		return this.otherStorageTransCondition;
	}
 
	@Override
	public void setOtherStorageTransCondition(final String otherStorageTransCondition) {
		this.otherStorageTransCondition = otherStorageTransCondition; 
	}
 
	@Override
	public String getResponsibleCompanyCode() {
		return this.responsibleCompanyCode;
	}
 
	@Override
	public void setResponsibleCompanyCode(final String responsibleCompanyCode) {
		this.responsibleCompanyCode = responsibleCompanyCode; 
	}
 
	@Override
	public String getResponsibleCompanyName() {
		return this.responsibleCompanyName;
	}
 
	@Override
	public void setResponsibleCompanyName(final String responsibleCompanyName) {
		this.responsibleCompanyName = responsibleCompanyName; 
	}
 
	@Override
	public String getResponsibleCompanyAddress() {
		return this.responsibleCompanyAddress;
	}
 
	@Override
	public void setResponsibleCompanyAddress(final String responsibleCompanyAddress) {
		this.responsibleCompanyAddress = responsibleCompanyAddress; 
	}
 
	@Override
	public String getTransfatCaveat() {
		return this.transfatCaveat;
	}
 
	@Override
	public void setTransfatCaveat(final String transfatCaveat) {
		this.transfatCaveat = transfatCaveat; 
	}
 
	@Override
	public String getWarning() {
		return this.warning;
	}
 
	@Override
	public void setWarning(final String warning) {
		this.warning = warning; 
	}
 
	@Override
	public String getFeature() {
		return this.feature;
	}
 
	@Override
	public void setFeature(final String feature) {
		this.feature = feature; 
	}
 
	@Override
	public String getRecommendFoodMethod() {
		return this.recommendFoodMethod;
	}
 
	@Override
	public void setRecommendFoodMethod(final String recommendFoodMethod) {
		this.recommendFoodMethod = recommendFoodMethod; 
	}
 
	@Override
	public String getProductUrl() {
		return this.productUrl;
	}
 
	@Override
	public void setProductUrl(final String productUrl) {
		this.productUrl = productUrl; 
	}
 
}
