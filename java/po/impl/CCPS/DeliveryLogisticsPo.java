package com.doc.common.po.impl; 
 
public class DeliveryLogisticsPo implements IDeliveryLogisticsPo {
 
	public enum COLUMNS {
		DELIVERY_LOGISTICS_IDEN_CODE("交貨資料物流業者識別碼"), //
		DELIVERY_MASTER_ASSO_CODE("交貨資料主檔關聯碼"), //
		DOMESTIC_LOGISTICS_ASSO_CODE("國內物流業者交易對象關聯碼"), //
		DOMESTIC_LOGISTICS_SELF_CODE("國內物流業者交易對象自編碼"), //
		LOGISTICS_NAME("物流業者名稱") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String deliveryLogisticsIdenCode;
	private String deliveryMasterAssoCode;
	private String domesticLogisticsAssoCode;
	private String domesticLogisticsSelfCode;
	private String logisticsName;

	@Override
	public String getDeliveryLogisticsIdenCode() {
		return this.deliveryLogisticsIdenCode;
	}
 
	@Override
	public void setDeliveryLogisticsIdenCode(final String deliveryLogisticsIdenCode) {
		this.deliveryLogisticsIdenCode = deliveryLogisticsIdenCode; 
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
	public String getDomesticLogisticsAssoCode() {
		return this.domesticLogisticsAssoCode;
	}
 
	@Override
	public void setDomesticLogisticsAssoCode(final String domesticLogisticsAssoCode) {
		this.domesticLogisticsAssoCode = domesticLogisticsAssoCode; 
	}
 
	@Override
	public String getDomesticLogisticsSelfCode() {
		return this.domesticLogisticsSelfCode;
	}
 
	@Override
	public void setDomesticLogisticsSelfCode(final String domesticLogisticsSelfCode) {
		this.domesticLogisticsSelfCode = domesticLogisticsSelfCode; 
	}
 
	@Override
	public String getLogisticsName() {
		return this.logisticsName;
	}
 
	@Override
	public void setLogisticsName(final String logisticsName) {
		this.logisticsName = logisticsName; 
	}
 
}
