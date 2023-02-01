package com.doc.common.dao.impl; 
 
public class ShopChargingSettingHDAOImpl extends GeneralDAOImpl<ShopChargingSettingHPo> implements ShopChargingSettingHDAO { 
	public static final ShopChargingSettingHDAOImpl INSTANCE = new ShopChargingSettingHDAOImpl(); 
	public static final String TABLENAME = "SHOP_CHARGING_SETTING_H"; 

	public ShopChargingSettingHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ShopChargingSettingHPo> CONVERTER = new MapConverter<ShopChargingSettingHPo>() { 
 
		@Override 
		public ShopChargingSettingHPo convert(final DataObject dataObject) { 
			final ShopChargingSettingHPo shopChargingSettingHPo = new ShopChargingSettingHPo(); 
			shopChargingSettingHPo.setRecordNo(dataObject.getString(ShopChargingSettingHPo.COLUMNS.RECORD_NO.name())); 
			shopChargingSettingHPo.setWriteOffNo(dataObject.getString(ShopChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name())); 
			shopChargingSettingHPo.setPaymentType(dataObject.getString(ShopChargingSettingHPo.COLUMNS.PAYMENT_TYPE.name())); 
			shopChargingSettingHPo.setShopCode(dataObject.getString(ShopChargingSettingHPo.COLUMNS.SHOP_CODE.name())); 
			shopChargingSettingHPo.setPayeeNo(dataObject.getString(ShopChargingSettingHPo.COLUMNS.PAYEE_NO.name())); 
			shopChargingSettingHPo.setPayeeBank(dataObject.getString(ShopChargingSettingHPo.COLUMNS.PAYEE_BANK_.name())); 
			shopChargingSettingHPo.setPayeeBranch(dataObject.getString(ShopChargingSettingHPo.COLUMNS.PAYEE_BRANCH.name())); 
			shopChargingSettingHPo.setPayeeAccount(dataObject.getString(ShopChargingSettingHPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			return shopChargingSettingHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ShopChargingSettingHPo shopChargingSettingHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.RECORD_NO.name(), shopChargingSettingHPo.getRecordNo()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), shopChargingSettingHPo.getWriteOffNo()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.PAYMENT_TYPE.name(), shopChargingSettingHPo.getPaymentType()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.SHOP_CODE.name(), shopChargingSettingHPo.getShopCode()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.PAYEE_NO.name(), shopChargingSettingHPo.getPayeeNo()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.PAYEE_BANK_.name(), shopChargingSettingHPo.getPayeeBank()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.PAYEE_BRANCH.name(), shopChargingSettingHPo.getPayeeBranch()); 
			dataObject.setValue(ShopChargingSettingHPo.COLUMNS.PAYEE_ACCOUNT.name(), shopChargingSettingHPo.getPayeeAccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ShopChargingSettingHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ShopChargingSettingHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ShopChargingSettingHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(ShopChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		sqlWhere.add(ShopChargingSettingHPo.COLUMNS.PAYMENT_TYPE.name(), po.getPaymentType()); 
		return sqlWhere; 
	} 
 
} 
