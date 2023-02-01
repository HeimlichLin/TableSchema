package com.doc.common.dao.impl; 
 
public class ShopChargingSettingDAOImpl extends GeneralDAOImpl<ShopChargingSettingPo> implements ShopChargingSettingDAO { 
	public static final ShopChargingSettingDAOImpl INSTANCE = new ShopChargingSettingDAOImpl(); 
	public static final String TABLENAME = "SHOP_CHARGING_SETTING"; 

	public ShopChargingSettingDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ShopChargingSettingPo> CONVERTER = new MapConverter<ShopChargingSettingPo>() { 
 
		@Override 
		public ShopChargingSettingPo convert(final DataObject dataObject) { 
			final ShopChargingSettingPo shopChargingSettingPo = new ShopChargingSettingPo(); 
			shopChargingSettingPo.setWriteOffNo(dataObject.getString(ShopChargingSettingPo.COLUMNS.WRITE_OFF_NO.name())); 
			shopChargingSettingPo.setPaymentType(dataObject.getString(ShopChargingSettingPo.COLUMNS.PAYMENT_TYPE.name())); 
			shopChargingSettingPo.setShopCode(dataObject.getString(ShopChargingSettingPo.COLUMNS.SHOP_CODE.name())); 
			shopChargingSettingPo.setPayeeNo(dataObject.getString(ShopChargingSettingPo.COLUMNS.PAYEE_NO.name())); 
			shopChargingSettingPo.setPayeeBank(dataObject.getString(ShopChargingSettingPo.COLUMNS.PAYEE_BANK_.name())); 
			shopChargingSettingPo.setPayeeBranch(dataObject.getString(ShopChargingSettingPo.COLUMNS.PAYEE_BRANCH.name())); 
			shopChargingSettingPo.setPayeeAccount(dataObject.getString(ShopChargingSettingPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			return shopChargingSettingPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ShopChargingSettingPo shopChargingSettingPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), shopChargingSettingPo.getWriteOffNo()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.PAYMENT_TYPE.name(), shopChargingSettingPo.getPaymentType()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.SHOP_CODE.name(), shopChargingSettingPo.getShopCode()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.PAYEE_NO.name(), shopChargingSettingPo.getPayeeNo()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.PAYEE_BANK_.name(), shopChargingSettingPo.getPayeeBank()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.PAYEE_BRANCH.name(), shopChargingSettingPo.getPayeeBranch()); 
			dataObject.setValue(ShopChargingSettingPo.COLUMNS.PAYEE_ACCOUNT.name(), shopChargingSettingPo.getPayeeAccount()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ShopChargingSettingPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ShopChargingSettingPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ShopChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		sqlWhere.add(ShopChargingSettingPo.COLUMNS.PAYMENT_TYPE.name(), po.getPaymentType()); 
		return sqlWhere; 
	} 
 
} 
