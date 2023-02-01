package com.doc.common.dao.impl; 
 
public class BillingChargingSettingHDAOImpl extends GeneralDAOImpl<BillingChargingSettingHPo> implements BillingChargingSettingHDAO { 
	public static final BillingChargingSettingHDAOImpl INSTANCE = new BillingChargingSettingHDAOImpl(); 
	public static final String TABLENAME = "BILLING_CHARGING_SETTING_H"; 

	public BillingChargingSettingHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingChargingSettingHPo> CONVERTER = new MapConverter<BillingChargingSettingHPo>() { 
 
		@Override 
		public BillingChargingSettingHPo convert(final DataObject dataObject) { 
			final BillingChargingSettingHPo billingChargingSettingHPo = new BillingChargingSettingHPo(); 
			billingChargingSettingHPo.setTransactionNo(dataObject.getString(BillingChargingSettingHPo.COLUMNS.TRANSACTION_NO.name())); 
			billingChargingSettingHPo.setWriteOffNo(dataObject.getString(BillingChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingChargingSettingHPo.setPaymentType(dataObject.getString(BillingChargingSettingHPo.COLUMNS.PAYMENT_TYPE.name())); 
			return billingChargingSettingHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingChargingSettingHPo billingChargingSettingHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingChargingSettingHPo.COLUMNS.TRANSACTION_NO.name(), billingChargingSettingHPo.getTransactionNo()); 
			dataObject.setValue(BillingChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), billingChargingSettingHPo.getWriteOffNo()); 
			dataObject.setValue(BillingChargingSettingHPo.COLUMNS.PAYMENT_TYPE.name(), billingChargingSettingHPo.getPaymentType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingChargingSettingHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingChargingSettingHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingChargingSettingHPo.COLUMNS.TRANSACTION_NO.name(), po.getTransactionNo()); 
		sqlWhere.add(BillingChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
