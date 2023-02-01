package com.doc.common.dao.impl; 
 
public class DeliveryLogisticsDAOImpl extends GeneralDAOImpl<DeliveryLogisticsPo> implements DeliveryLogisticsDAO { 
	public static final DeliveryLogisticsDAOImpl INSTANCE = new DeliveryLogisticsDAOImpl(); 
	public static final String TABLENAME = "DELIVERY_LOGISTICS"; 

	public DeliveryLogisticsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryLogisticsPo> CONVERTER = new MapConverter<DeliveryLogisticsPo>() { 
 
		@Override 
		public DeliveryLogisticsPo convert(final DataObject dataObject) { 
			final DeliveryLogisticsPo deliveryLogisticsPo = new DeliveryLogisticsPo(); 
			deliveryLogisticsPo.setDeliveryLogisticsIdenCode(dataObject.getString(DeliveryLogisticsPo.COLUMNS.DELIVERY_LOGISTICS_IDEN_CODE.name())); 
			deliveryLogisticsPo.setDeliveryMasterAssoCode(dataObject.getString(DeliveryLogisticsPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name())); 
			deliveryLogisticsPo.setDomesticLogisticsAssoCode(dataObject.getString(DeliveryLogisticsPo.COLUMNS.DOMESTIC_LOGISTICS_ASSO_CODE.name())); 
			deliveryLogisticsPo.setDomesticLogisticsSelfCode(dataObject.getString(DeliveryLogisticsPo.COLUMNS.DOMESTIC_LOGISTICS_SELF_CODE.name())); 
			deliveryLogisticsPo.setLogisticsName(dataObject.getString(DeliveryLogisticsPo.COLUMNS.LOGISTICS_NAME.name())); 
			return deliveryLogisticsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryLogisticsPo deliveryLogisticsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryLogisticsPo.COLUMNS.DELIVERY_LOGISTICS_IDEN_CODE.name(), deliveryLogisticsPo.getDeliveryLogisticsIdenCode()); 
			dataObject.setValue(DeliveryLogisticsPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), deliveryLogisticsPo.getDeliveryMasterAssoCode()); 
			dataObject.setValue(DeliveryLogisticsPo.COLUMNS.DOMESTIC_LOGISTICS_ASSO_CODE.name(), deliveryLogisticsPo.getDomesticLogisticsAssoCode()); 
			dataObject.setValue(DeliveryLogisticsPo.COLUMNS.DOMESTIC_LOGISTICS_SELF_CODE.name(), deliveryLogisticsPo.getDomesticLogisticsSelfCode()); 
			dataObject.setValue(DeliveryLogisticsPo.COLUMNS.LOGISTICS_NAME.name(), deliveryLogisticsPo.getLogisticsName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryLogisticsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryLogisticsPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryLogisticsPo.COLUMNS.DELIVERY_LOGISTICS_IDEN_CODE.name(), po.getDeliveryLogisticsIdenCode()); 
		sqlWhere.add(DeliveryLogisticsPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), po.getDeliveryMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
