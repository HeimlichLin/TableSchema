package com.doc.common.po.impl; 
 
public class DeliveryOtherFactoryPo implements IDeliveryOtherFactoryPo {
 
	public enum COLUMNS {
		DELIVERY_FACTORY_SEL_IDEN_CODE("其他交貨工廠自用識別碼"), //
		DELIVERY_OTHER_ASSO_CODE("其他交貨關聯碼"), //
		DELIVERY_FACTORY_ASSO_CODE("其他交貨工廠基本資料關聯碼"), //
		DELIVERY_FACTORY_NAME("其他交貨工廠名稱"), //
		DELIVERY_FACTORY_REGISTER_ID("其他交貨工廠登錄字號"), //
		DELIVERY_FACTORY_SEL_WEIGHT("其他交貨工廠自用總淨重") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryFactorySelIdenCode;
	private String deliveryOtherAssoCode;
	private String deliveryFactoryAssoCode;
	private String deliveryFactoryName;
	private String deliveryFactoryRegisterId;
	private String deliveryFactorySelWeight;

	@Override
	public String getDeliveryFactorySelIdenCode() {
		return this.deliveryFactorySelIdenCode;
	}
 
	@Override
	public void setDeliveryFactorySelIdenCode(final String deliveryFactorySelIdenCode) {
		this.deliveryFactorySelIdenCode = deliveryFactorySelIdenCode; 
	}
 
	@Override
	public String getDeliveryOtherAssoCode() {
		return this.deliveryOtherAssoCode;
	}
 
	@Override
	public void setDeliveryOtherAssoCode(final String deliveryOtherAssoCode) {
		this.deliveryOtherAssoCode = deliveryOtherAssoCode; 
	}
 
	@Override
	public String getDeliveryFactoryAssoCode() {
		return this.deliveryFactoryAssoCode;
	}
 
	@Override
	public void setDeliveryFactoryAssoCode(final String deliveryFactoryAssoCode) {
		this.deliveryFactoryAssoCode = deliveryFactoryAssoCode; 
	}
 
	@Override
	public String getDeliveryFactoryName() {
		return this.deliveryFactoryName;
	}
 
	@Override
	public void setDeliveryFactoryName(final String deliveryFactoryName) {
		this.deliveryFactoryName = deliveryFactoryName; 
	}
 
	@Override
	public String getDeliveryFactoryRegisterId() {
		return this.deliveryFactoryRegisterId;
	}
 
	@Override
	public void setDeliveryFactoryRegisterId(final String deliveryFactoryRegisterId) {
		this.deliveryFactoryRegisterId = deliveryFactoryRegisterId; 
	}
 
	@Override
	public String getDeliveryFactorySelWeight() {
		return this.deliveryFactorySelWeight;
	}
 
	@Override
	public void setDeliveryFactorySelWeight(final String deliveryFactorySelWeight) {
		this.deliveryFactorySelWeight = deliveryFactorySelWeight; 
	}
 
}
