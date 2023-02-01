package com.doc.common.po.impl; 
 
public class DeliveryOtherPo implements IDeliveryOtherPo {
 
	public enum COLUMNS {
		DELIVERY_OTHER_IDEN_CODE("交貨資料其他交貨識別碼"), //
		DELIVERY_MASTER_ASSO_CODE("交貨資料主檔關聯碼"), //
		DELIVERY_TO_CUSTOMER("交貨資料販售至消費者"), //
		DELIVERY_TO_CUSTOMER_WEIGHT("交貨資料販售至消費者總淨重"), //
		DELIVERY_TO_CUSTOMER_QUANTITY("交貨資料販售至消費者數量"), //
		DELIVERY_PERSONAL_USE("交貨資料自用"), //
		DELIVERY_PERSONAL_USE_WIEGHT("交貨資料自用總淨重"), //
		DELIVERY_PERSONAL_USE_QUANTITY("交貨資料自用數量"), //
		DELIVERY_FACTORY_SEL("交貨資料工廠自用"), //
		DELIVERY_PERSONAL_USE_TYPE("交貨資料自用類別"), //
		DELIVERY_OTH_PERSONAL_USE_DESC("交貨資料其它自用品說明") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryOtherIdenCode;
	private String deliveryMasterAssoCode;
	private String deliveryToCustomer;
	private String deliveryToCustomerWeight;
	private String deliveryToCustomerQuantity;
	private String deliveryPersonalUse;
	private String deliveryPersonalUseWieght;
	private String deliveryPersonalUseQuantity;
	private String deliveryFactorySel;
	private String deliveryPersonalUseType;
	private String deliveryOthPersonalUseDesc;

	@Override
	public String getDeliveryOtherIdenCode() {
		return this.deliveryOtherIdenCode;
	}
 
	@Override
	public void setDeliveryOtherIdenCode(final String deliveryOtherIdenCode) {
		this.deliveryOtherIdenCode = deliveryOtherIdenCode; 
	}
 
	@Override
	public String getDeliveryMasterAssoCode() {
		return this.deliveryMasterAssoCode;
	}
 
	@Override
	public void setDeliveryMasterAssoCode(final String deliveryMasterAssoCode) {
		this.deliveryMasterAssoCode = deliveryMasterAssoCode; 
	}
 
	@Override
	public String getDeliveryToCustomer() {
		return this.deliveryToCustomer;
	}
 
	@Override
	public void setDeliveryToCustomer(final String deliveryToCustomer) {
		this.deliveryToCustomer = deliveryToCustomer; 
	}
 
	@Override
	public String getDeliveryToCustomerWeight() {
		return this.deliveryToCustomerWeight;
	}
 
	@Override
	public void setDeliveryToCustomerWeight(final String deliveryToCustomerWeight) {
		this.deliveryToCustomerWeight = deliveryToCustomerWeight; 
	}
 
	@Override
	public String getDeliveryToCustomerQuantity() {
		return this.deliveryToCustomerQuantity;
	}
 
	@Override
	public void setDeliveryToCustomerQuantity(final String deliveryToCustomerQuantity) {
		this.deliveryToCustomerQuantity = deliveryToCustomerQuantity; 
	}
 
	@Override
	public String getDeliveryPersonalUse() {
		return this.deliveryPersonalUse;
	}
 
	@Override
	public void setDeliveryPersonalUse(final String deliveryPersonalUse) {
		this.deliveryPersonalUse = deliveryPersonalUse; 
	}
 
	@Override
	public String getDeliveryPersonalUseWieght() {
		return this.deliveryPersonalUseWieght;
	}
 
	@Override
	public void setDeliveryPersonalUseWieght(final String deliveryPersonalUseWieght) {
		this.deliveryPersonalUseWieght = deliveryPersonalUseWieght; 
	}
 
	@Override
	public String getDeliveryPersonalUseQuantity() {
		return this.deliveryPersonalUseQuantity;
	}
 
	@Override
	public void setDeliveryPersonalUseQuantity(final String deliveryPersonalUseQuantity) {
		this.deliveryPersonalUseQuantity = deliveryPersonalUseQuantity; 
	}
 
	@Override
	public String getDeliveryFactorySel() {
		return this.deliveryFactorySel;
	}
 
	@Override
	public void setDeliveryFactorySel(final String deliveryFactorySel) {
		this.deliveryFactorySel = deliveryFactorySel; 
	}
 
	@Override
	public String getDeliveryPersonalUseType() {
		return this.deliveryPersonalUseType;
	}
 
	@Override
	public void setDeliveryPersonalUseType(final String deliveryPersonalUseType) {
		this.deliveryPersonalUseType = deliveryPersonalUseType; 
	}
 
	@Override
	public String getDeliveryOthPersonalUseDesc() {
		return this.deliveryOthPersonalUseDesc;
	}
 
	@Override
	public void setDeliveryOthPersonalUseDesc(final String deliveryOthPersonalUseDesc) {
		this.deliveryOthPersonalUseDesc = deliveryOthPersonalUseDesc; 
	}
 
}
