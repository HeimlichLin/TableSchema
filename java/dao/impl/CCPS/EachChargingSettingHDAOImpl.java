package com.doc.common.dao.impl; 
 
public class EachChargingSettingHDAOImpl extends GeneralDAOImpl<EachChargingSettingHPo> implements EachChargingSettingHDAO { 
	public static final EachChargingSettingHDAOImpl INSTANCE = new EachChargingSettingHDAOImpl(); 
	public static final String TABLENAME = "EACH_CHARGING_SETTING_H"; 

	public EachChargingSettingHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EachChargingSettingHPo> CONVERTER = new MapConverter<EachChargingSettingHPo>() { 
 
		@Override 
		public EachChargingSettingHPo convert(final DataObject dataObject) { 
			final EachChargingSettingHPo eachChargingSettingHPo = new EachChargingSettingHPo(); 
			eachChargingSettingHPo.setRecordNo(dataObject.getString(EachChargingSettingHPo.COLUMNS.RECORD_NO.name())); 
			eachChargingSettingHPo.setWriteOffNo(dataObject.getString(EachChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name())); 
			eachChargingSettingHPo.setPayeeNo(dataObject.getString(EachChargingSettingHPo.COLUMNS.PAYEE_NO.name())); 
			eachChargingSettingHPo.setPayeeBank(dataObject.getString(EachChargingSettingHPo.COLUMNS.PAYEE_BANK.name())); 
			eachChargingSettingHPo.setPayeeBranch(dataObject.getString(EachChargingSettingHPo.COLUMNS.PAYEE_BRANCH.name())); 
			eachChargingSettingHPo.setPayeeAccount(dataObject.getString(EachChargingSettingHPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			eachChargingSettingHPo.setTransactionId(dataObject.getString(EachChargingSettingHPo.COLUMNS.TRANSACTION_ID.name())); 
			return eachChargingSettingHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EachChargingSettingHPo eachChargingSettingHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.RECORD_NO.name(), eachChargingSettingHPo.getRecordNo()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), eachChargingSettingHPo.getWriteOffNo()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.PAYEE_NO.name(), eachChargingSettingHPo.getPayeeNo()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.PAYEE_BANK.name(), eachChargingSettingHPo.getPayeeBank()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.PAYEE_BRANCH.name(), eachChargingSettingHPo.getPayeeBranch()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.PAYEE_ACCOUNT.name(), eachChargingSettingHPo.getPayeeAccount()); 
			dataObject.setValue(EachChargingSettingHPo.COLUMNS.TRANSACTION_ID.name(), eachChargingSettingHPo.getTransactionId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EachChargingSettingHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EachChargingSettingHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(EachChargingSettingHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(EachChargingSettingHPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
