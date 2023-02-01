package com.doc.common.dao.impl; 
 
public class BillingChargingSettingDAOImpl extends GeneralDAOImpl<BillingChargingSettingPo> implements BillingChargingSettingDAO { 
	public static final BillingChargingSettingDAOImpl INSTANCE = new BillingChargingSettingDAOImpl(); 
	public static final String TABLENAME = "BILLING_CHARGING_SETTING"; 

	public BillingChargingSettingDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingChargingSettingPo> CONVERTER = new MapConverter<BillingChargingSettingPo>() { 
 
		@Override 
		public BillingChargingSettingPo convert(final DataObject dataObject) { 
			final BillingChargingSettingPo billingChargingSettingPo = new BillingChargingSettingPo(); 
			billingChargingSettingPo.setWriteOffNo(dataObject.getString(BillingChargingSettingPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingChargingSettingPo.setPaymentType(dataObject.getString(BillingChargingSettingPo.COLUMNS.PAYMENT_TYPE.name())); 
			return billingChargingSettingPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingChargingSettingPo billingChargingSettingPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), billingChargingSettingPo.getWriteOffNo()); 
			dataObject.setValue(BillingChargingSettingPo.COLUMNS.PAYMENT_TYPE.name(), billingChargingSettingPo.getPaymentType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingChargingSettingPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingChargingSettingPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
