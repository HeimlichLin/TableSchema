package com.doc.common.dao.impl; 
 
public class DeliveryDAOImpl extends GeneralDAOImpl<DeliveryPo> implements DeliveryDAO { 
	public static final DeliveryDAOImpl INSTANCE = new DeliveryDAOImpl(); 
	public static final String TABLENAME = "DELIVERY"; 

	public DeliveryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryPo> CONVERTER = new MapConverter<DeliveryPo>() { 
 
		@Override 
		public DeliveryPo convert(final DataObject dataObject) { 
			final DeliveryPo deliveryPo = new DeliveryPo(); 
			deliveryPo.setDeliveryMasterIdenCode(dataObject.getString(DeliveryPo.COLUMNS.DELIVERY_MASTER_IDEN_CODE.name())); 
			deliveryPo.setBusinessInfoAssoCode(dataObject.getString(DeliveryPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			deliveryPo.setDeclareYear(dataObject.getString(DeliveryPo.COLUMNS.DECLARE_YEAR.name())); 
			deliveryPo.setDeclareMonth(dataObject.getString(DeliveryPo.COLUMNS.DECLARE_MONTH.name())); 
			deliveryPo.setDeclareDay(dataObject.getString(DeliveryPo.COLUMNS.DECLARE_DAY.name())); 
			deliveryPo.setDeclareSerialNumber(dataObject.getString(DeliveryPo.COLUMNS.DECLARE_SERIAL_NUMBER.name())); 
			deliveryPo.setProductInfoAssoCode(dataObject.getString(DeliveryPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name())); 
			deliveryPo.setProductSpecAssoCode(dataObject.getString(DeliveryPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			deliveryPo.setProductSpec(dataObject.getString(DeliveryPo.COLUMNS.PRODUCT_SPEC.name())); 
			deliveryPo.setProductSelfCode(dataObject.getString(DeliveryPo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			deliveryPo.setProductName(dataObject.getString(DeliveryPo.COLUMNS.PRODUCT_NAME.name())); 
			deliveryPo.setDeliveryTotalWeight(); 
			deliveryPo.setDeliveryTotalQuantity(); 
			deliveryPo.setReturnTotalWeight(); 
			deliveryPo.setInventoryTotalWeight(); 
			deliveryPo.setInventoryTotalQuantity(); 
			deliveryPo.setLogisticsIndustry(dataObject.getString(DeliveryPo.COLUMNS.LOGISTICS_INDUSTRY.name())); 
			deliveryPo.setDownstreamCompany(dataObject.getString(DeliveryPo.COLUMNS.DOWNSTREAM_COMPANY.name())); 
			deliveryPo.setDeliveryRemarks(dataObject.getString(DeliveryPo.COLUMNS.DELIVERY_REMARKS.name())); 
			return deliveryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryPo deliveryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryPo.COLUMNS.DELIVERY_MASTER_IDEN_CODE.name(), deliveryPo.getDeliveryMasterIdenCode()); 
			dataObject.setValue(DeliveryPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), deliveryPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DECLARE_YEAR.name(), deliveryPo.getDeclareYear()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DECLARE_MONTH.name(), deliveryPo.getDeclareMonth()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DECLARE_DAY.name(), deliveryPo.getDeclareDay()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DECLARE_SERIAL_NUMBER.name(), deliveryPo.getDeclareSerialNumber()); 
			dataObject.setValue(DeliveryPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), deliveryPo.getProductInfoAssoCode()); 
			dataObject.setValue(DeliveryPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), deliveryPo.getProductSpecAssoCode()); 
			dataObject.setValue(DeliveryPo.COLUMNS.PRODUCT_SPEC.name(), deliveryPo.getProductSpec()); 
			dataObject.setValue(DeliveryPo.COLUMNS.PRODUCT_SELF_CODE.name(), deliveryPo.getProductSelfCode()); 
			dataObject.setValue(DeliveryPo.COLUMNS.PRODUCT_NAME.name(), deliveryPo.getProductName()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DELIVERY_TOTAL_WEIGHT.name(), deliveryPo.getDeliveryTotalWeight()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DELIVERY_TOTAL_QUANTITY.name(), deliveryPo.getDeliveryTotalQuantity()); 
			dataObject.setValue(DeliveryPo.COLUMNS.RETURN_TOTAL_WEIGHT.name(), deliveryPo.getReturnTotalWeight()); 
			dataObject.setValue(DeliveryPo.COLUMNS.INVENTORY_TOTAL_WEIGHT.name(), deliveryPo.getInventoryTotalWeight()); 
			dataObject.setValue(DeliveryPo.COLUMNS.INVENTORY_TOTAL_QUANTITY.name(), deliveryPo.getInventoryTotalQuantity()); 
			dataObject.setValue(DeliveryPo.COLUMNS.LOGISTICS_INDUSTRY.name(), deliveryPo.getLogisticsIndustry()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DOWNSTREAM_COMPANY.name(), deliveryPo.getDownstreamCompany()); 
			dataObject.setValue(DeliveryPo.COLUMNS.DELIVERY_REMARKS.name(), deliveryPo.getDeliveryRemarks()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryPo.COLUMNS.DELIVERY_MASTER_IDEN_CODE.name(), po.getDeliveryMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
