package com.doc.common.dao.impl; 
 
public class DeliveryOtherDAOImpl extends GeneralDAOImpl<DeliveryOtherPo> implements DeliveryOtherDAO { 
	public static final DeliveryOtherDAOImpl INSTANCE = new DeliveryOtherDAOImpl(); 
	public static final String TABLENAME = "DELIVERY_OTHER"; 

	public DeliveryOtherDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryOtherPo> CONVERTER = new MapConverter<DeliveryOtherPo>() { 
 
		@Override 
		public DeliveryOtherPo convert(final DataObject dataObject) { 
			final DeliveryOtherPo deliveryOtherPo = new DeliveryOtherPo(); 
			deliveryOtherPo.setDeliveryOtherIdenCode(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_OTHER_IDEN_CODE.name())); 
			deliveryOtherPo.setDeliveryMasterAssoCode(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name())); 
			deliveryOtherPo.setDeliveryToCustomer(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_TO_CUSTOMER.name())); 
			deliveryOtherPo.setDeliveryToCustomerWeight(); 
			deliveryOtherPo.setDeliveryToCustomerQuantity(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_TO_CUSTOMER_QUANTITY.name())); 
			deliveryOtherPo.setDeliveryPersonalUse(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE.name())); 
			deliveryOtherPo.setDeliveryPersonalUseWieght(); 
			deliveryOtherPo.setDeliveryPersonalUseQuantity(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE_QUANTITY.name())); 
			deliveryOtherPo.setDeliveryFactorySel(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_FACTORY_SEL.name())); 
			deliveryOtherPo.setDeliveryPersonalUseType(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE_TYPE.name())); 
			deliveryOtherPo.setDeliveryOthPersonalUseDesc(dataObject.getString(DeliveryOtherPo.COLUMNS.DELIVERY_OTH_PERSONAL_USE_DESC.name())); 
			return deliveryOtherPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryOtherPo deliveryOtherPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_OTHER_IDEN_CODE.name(), deliveryOtherPo.getDeliveryOtherIdenCode()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), deliveryOtherPo.getDeliveryMasterAssoCode()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_TO_CUSTOMER.name(), deliveryOtherPo.getDeliveryToCustomer()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_TO_CUSTOMER_WEIGHT.name(), deliveryOtherPo.getDeliveryToCustomerWeight()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_TO_CUSTOMER_QUANTITY.name(), deliveryOtherPo.getDeliveryToCustomerQuantity()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE.name(), deliveryOtherPo.getDeliveryPersonalUse()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE_WIEGHT.name(), deliveryOtherPo.getDeliveryPersonalUseWieght()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE_QUANTITY.name(), deliveryOtherPo.getDeliveryPersonalUseQuantity()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_FACTORY_SEL.name(), deliveryOtherPo.getDeliveryFactorySel()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_PERSONAL_USE_TYPE.name(), deliveryOtherPo.getDeliveryPersonalUseType()); 
			dataObject.setValue(DeliveryOtherPo.COLUMNS.DELIVERY_OTH_PERSONAL_USE_DESC.name(), deliveryOtherPo.getDeliveryOthPersonalUseDesc()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryOtherPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryOtherPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryOtherPo.COLUMNS.DELIVERY_OTHER_IDEN_CODE.name(), po.getDeliveryOtherIdenCode()); 
		sqlWhere.add(DeliveryOtherPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), po.getDeliveryMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
