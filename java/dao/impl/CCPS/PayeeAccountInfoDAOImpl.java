package com.doc.common.dao.impl; 
 
public class PayeeAccountInfoDAOImpl extends GeneralDAOImpl<PayeeAccountInfoPo> implements PayeeAccountInfoDAO { 
	public static final PayeeAccountInfoDAOImpl INSTANCE = new PayeeAccountInfoDAOImpl(); 
	public static final String TABLENAME = "PAYEE_ACCOUNT_INFO"; 

	public PayeeAccountInfoDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PayeeAccountInfoPo> CONVERTER = new MapConverter<PayeeAccountInfoPo>() { 
 
		@Override 
		public PayeeAccountInfoPo convert(final DataObject dataObject) { 
			final PayeeAccountInfoPo payeeAccountInfoPo = new PayeeAccountInfoPo(); 
			payeeAccountInfoPo.setPayeeNo(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_NO.name())); 
			payeeAccountInfoPo.setPayeeName(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_NAME.name())); 
			payeeAccountInfoPo.setPayeeEmail(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_EMAIL.name())); 
			payeeAccountInfoPo.setPayeeBank(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_BANK_.name())); 
			payeeAccountInfoPo.setPayeeBranch(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_BRANCH.name())); 
			payeeAccountInfoPo.setPayeeAccount(dataObject.getString(PayeeAccountInfoPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			payeeAccountInfoPo.setUpdateUser(dataObject.getString(PayeeAccountInfoPo.COLUMNS.UPDATE_USER.name())); 
			payeeAccountInfoPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(PayeeAccountInfoPo.COLUMNS.UPDATE_DATE.name()))); 
			return payeeAccountInfoPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PayeeAccountInfoPo payeeAccountInfoPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_NO.name(), payeeAccountInfoPo.getPayeeNo()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_NAME.name(), payeeAccountInfoPo.getPayeeName()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_EMAIL.name(), payeeAccountInfoPo.getPayeeEmail()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_BANK_.name(), payeeAccountInfoPo.getPayeeBank()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_BRANCH.name(), payeeAccountInfoPo.getPayeeBranch()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.PAYEE_ACCOUNT.name(), payeeAccountInfoPo.getPayeeAccount()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.UPDATE_USER.name(), payeeAccountInfoPo.getUpdateUser()); 
			dataObject.setValue(PayeeAccountInfoPo.COLUMNS.UPDATE_DATE.name(), payeeAccountInfoPo.getUpdateDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PayeeAccountInfoPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PayeeAccountInfoPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
