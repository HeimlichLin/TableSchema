package com.doc.common.dao.impl; 
 
public class DeliveryProductdayDAOImpl extends GeneralDAOImpl<DeliveryProductdayPo> implements DeliveryProductdayDAO { 
	public static final DeliveryProductdayDAOImpl INSTANCE = new DeliveryProductdayDAOImpl(); 
	public static final String TABLENAME = "DELIVERY_PRODUCTDAY"; 

	public DeliveryProductdayDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryProductdayPo> CONVERTER = new MapConverter<DeliveryProductdayPo>() { 
 
		@Override 
		public DeliveryProductdayPo convert(final DataObject dataObject) { 
			final DeliveryProductdayPo deliveryProductdayPo = new DeliveryProductdayPo(); 
			deliveryProductdayPo.setDeliveryProductdayIdenCode(dataObject.getString(DeliveryProductdayPo.COLUMNS.DELIVERY_PRODUCTDAY_IDEN_CODE.name())); 
			deliveryProductdayPo.setDeliveryMasterAssoCode(dataObject.getString(DeliveryProductdayPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name())); 
			deliveryProductdayPo.setBatchNumber(dataObject.getString(DeliveryProductdayPo.COLUMNS.BATCH_NUMBER.name())); 
			deliveryProductdayPo.setProductManufactureDay(dataObject.getString(DeliveryProductdayPo.COLUMNS.PRODUCT_MANUFACTURE_DAY.name())); 
			deliveryProductdayPo.setProductExpiryDay(dataObject.getString(DeliveryProductdayPo.COLUMNS.PRODUCT_EXPIRY_DAY.name())); 
			return deliveryProductdayPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryProductdayPo deliveryProductdayPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryProductdayPo.COLUMNS.DELIVERY_PRODUCTDAY_IDEN_CODE.name(), deliveryProductdayPo.getDeliveryProductdayIdenCode()); 
			dataObject.setValue(DeliveryProductdayPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), deliveryProductdayPo.getDeliveryMasterAssoCode()); 
			dataObject.setValue(DeliveryProductdayPo.COLUMNS.BATCH_NUMBER.name(), deliveryProductdayPo.getBatchNumber()); 
			dataObject.setValue(DeliveryProductdayPo.COLUMNS.PRODUCT_MANUFACTURE_DAY.name(), deliveryProductdayPo.getProductManufactureDay()); 
			dataObject.setValue(DeliveryProductdayPo.COLUMNS.PRODUCT_EXPIRY_DAY.name(), deliveryProductdayPo.getProductExpiryDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryProductdayPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryProductdayPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryProductdayPo.COLUMNS.DELIVERY_PRODUCTDAY_IDEN_CODE.name(), po.getDeliveryProductdayIdenCode()); 
		sqlWhere.add(DeliveryProductdayPo.COLUMNS.DELIVERY_MASTER_ASSO_CODE.name(), po.getDeliveryMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
