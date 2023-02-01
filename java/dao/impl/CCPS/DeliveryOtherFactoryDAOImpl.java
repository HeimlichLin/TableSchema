package com.doc.common.dao.impl; 
 
public class DeliveryOtherFactoryDAOImpl extends GeneralDAOImpl<DeliveryOtherFactoryPo> implements DeliveryOtherFactoryDAO { 
	public static final DeliveryOtherFactoryDAOImpl INSTANCE = new DeliveryOtherFactoryDAOImpl(); 
	public static final String TABLENAME = "DELIVERY_OTHER_FACTORY"; 

	public DeliveryOtherFactoryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DeliveryOtherFactoryPo> CONVERTER = new MapConverter<DeliveryOtherFactoryPo>() { 
 
		@Override 
		public DeliveryOtherFactoryPo convert(final DataObject dataObject) { 
			final DeliveryOtherFactoryPo deliveryOtherFactoryPo = new DeliveryOtherFactoryPo(); 
			deliveryOtherFactoryPo.setDeliveryFactorySelIdenCode(dataObject.getString(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_SEL_IDEN_CODE.name())); 
			deliveryOtherFactoryPo.setDeliveryOtherAssoCode(dataObject.getString(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_OTHER_ASSO_CODE.name())); 
			deliveryOtherFactoryPo.setDeliveryFactoryAssoCode(dataObject.getString(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_ASSO_CODE.name())); 
			deliveryOtherFactoryPo.setDeliveryFactoryName(dataObject.getString(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_NAME.name())); 
			deliveryOtherFactoryPo.setDeliveryFactoryRegisterId(dataObject.getString(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_REGISTER_ID.name())); 
			deliveryOtherFactoryPo.setDeliveryFactorySelWeight(); 
			return deliveryOtherFactoryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DeliveryOtherFactoryPo deliveryOtherFactoryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_SEL_IDEN_CODE.name(), deliveryOtherFactoryPo.getDeliveryFactorySelIdenCode()); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_OTHER_ASSO_CODE.name(), deliveryOtherFactoryPo.getDeliveryOtherAssoCode()); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_ASSO_CODE.name(), deliveryOtherFactoryPo.getDeliveryFactoryAssoCode()); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_NAME.name(), deliveryOtherFactoryPo.getDeliveryFactoryName()); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_REGISTER_ID.name(), deliveryOtherFactoryPo.getDeliveryFactoryRegisterId()); 
			dataObject.setValue(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_SEL_WEIGHT.name(), deliveryOtherFactoryPo.getDeliveryFactorySelWeight()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DeliveryOtherFactoryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DeliveryOtherFactoryPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_FACTORY_SEL_IDEN_CODE.name(), po.getDeliveryFactorySelIdenCode()); 
		sqlWhere.add(DeliveryOtherFactoryPo.COLUMNS.DELIVERY_OTHER_ASSO_CODE.name(), po.getDeliveryOtherAssoCode()); 
		return sqlWhere; 
	} 
 
} 
