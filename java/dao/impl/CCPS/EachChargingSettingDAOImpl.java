package com.doc.common.dao.impl; 
 
public class EachChargingSettingDAOImpl extends GeneralDAOImpl<EachChargingSettingPo> implements EachChargingSettingDAO { 
	public static final EachChargingSettingDAOImpl INSTANCE = new EachChargingSettingDAOImpl(); 
	public static final String TABLENAME = "EACH_CHARGING_SETTING"; 

	public EachChargingSettingDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EachChargingSettingPo> CONVERTER = new MapConverter<EachChargingSettingPo>() { 
 
		@Override 
		public EachChargingSettingPo convert(final DataObject dataObject) { 
			final EachChargingSettingPo eachChargingSettingPo = new EachChargingSettingPo(); 
			eachChargingSettingPo.setWriteOffNo(dataObject.getString(EachChargingSettingPo.COLUMNS.WRITE_OFF_NO.name())); 
			eachChargingSettingPo.setPayeeNo(dataObject.getString(EachChargingSettingPo.COLUMNS.PAYEE_NO.name())); 
			eachChargingSettingPo.setPayeeBank(dataObject.getString(EachChargingSettingPo.COLUMNS.PAYEE_BANK.name())); 
			eachChargingSettingPo.setPayeeBranch(dataObject.getString(EachChargingSettingPo.COLUMNS.PAYEE_BRANCH.name())); 
			eachChargingSettingPo.setPayeeAccount(dataObject.getString(EachChargingSettingPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			eachChargingSettingPo.setTransactionId(dataObject.getString(EachChargingSettingPo.COLUMNS.TRANSACTION_ID.name())); 
			return eachChargingSettingPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EachChargingSettingPo eachChargingSettingPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), eachChargingSettingPo.getWriteOffNo()); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.PAYEE_NO.name(), eachChargingSettingPo.getPayeeNo()); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.PAYEE_BANK.name(), eachChargingSettingPo.getPayeeBank()); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.PAYEE_BRANCH.name(), eachChargingSettingPo.getPayeeBranch()); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.PAYEE_ACCOUNT.name(), eachChargingSettingPo.getPayeeAccount()); 
			dataObject.setValue(EachChargingSettingPo.COLUMNS.TRANSACTION_ID.name(), eachChargingSettingPo.getTransactionId()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EachChargingSettingPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EachChargingSettingPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(EachChargingSettingPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
