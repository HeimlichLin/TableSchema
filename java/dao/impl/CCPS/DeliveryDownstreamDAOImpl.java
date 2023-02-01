package com.doc.common.dao.impl; 
 
public class DeliveryDownstreamDAOImpl extends GeneralDAOImpl<DeliveryDownstreamPo> implements DeliveryDownstreamDAO { 
	public static final DeliveryDownstreamDAOImpl INSTANCE = new DeliveryDownstreamDAOImpl(); 
	public static final String TABLENAME = "DELIVERY_DOWNSTREAM"; 

	public DeliveryDownstreamDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryDownstreamPo> CONVERTER = new MapConverter<DeliveryDownstreamPo>() { 
 
		@Override 
		public DeliveryDownstreamPo convert(final DataObject dataObject) { 
			final DeliveryDownstreamPo deliveryDownstreamPo = new DeliveryDownstreamPo(); 
			deliveryDownstreamPo.setDeliveryDownstreamIdenCode(dataObject.getString(DeliveryDownstreamPo.COLUMNS.DELIVERY_DOWNSTREAM_IDEN_CODE.name())); 
			deliveryDownstreamPo.setDeliveryMasterAssoCode(dataObject.getString(DeliveryDownstreamPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name())); 
			deliveryDownstreamPo.setCustomerTransactionAssoCode(dataObject.getString(DeliveryDownstreamPo.COLUMNS.CUSTOMER_TRANSACTION_ASSO_CODE.name())); 
			deliveryDownstreamPo.setCustomerTransactionSelfCode(dataObject.getString(DeliveryDownstreamPo.COLUMNS.CUSTOMER_TRANSACTION_SELF_CODE.name())); 
			deliveryDownstreamPo.setCustomerName(dataObject.getString(DeliveryDownstreamPo.COLUMNS.CUSTOMER_NAME.name())); 
			return deliveryDownstreamPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryDownstreamPo deliveryDownstreamPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryDownstreamPo.COLUMNS.DELIVERY_DOWNSTREAM_IDEN_CODE.name(), deliveryDownstreamPo.getDeliveryDownstreamIdenCode()); 
			dataObject.setValue(DeliveryDownstreamPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), deliveryDownstreamPo.getDeliveryMasterAssoCode()); 
			dataObject.setValue(DeliveryDownstreamPo.COLUMNS.CUSTOMER_TRANSACTION_ASSO_CODE.name(), deliveryDownstreamPo.getCustomerTransactionAssoCode()); 
			dataObject.setValue(DeliveryDownstreamPo.COLUMNS.CUSTOMER_TRANSACTION_SELF_CODE.name(), deliveryDownstreamPo.getCustomerTransactionSelfCode()); 
			dataObject.setValue(DeliveryDownstreamPo.COLUMNS.CUSTOMER_NAME.name(), deliveryDownstreamPo.getCustomerName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryDownstreamPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryDownstreamPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryDownstreamPo.COLUMNS.DELIVERY_DOWNSTREAM_IDEN_CODE.name(), po.getDeliveryDownstreamIdenCode()); 
		sqlWhere.add(DeliveryDownstreamPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), po.getDeliveryMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
