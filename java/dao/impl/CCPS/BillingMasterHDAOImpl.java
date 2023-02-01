package com.doc.common.dao.impl; 
 
public class BillingMasterHDAOImpl extends GeneralDAOImpl<BillingMasterHPo> implements BillingMasterHDAO { 
	public static final BillingMasterHDAOImpl INSTANCE = new BillingMasterHDAOImpl(); 
	public static final String TABLENAME = "BILLING_MASTER_H"; 

	public BillingMasterHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingMasterHPo> CONVERTER = new MapConverter<BillingMasterHPo>() { 
 
		@Override 
		public BillingMasterHPo convert(final DataObject dataObject) { 
			final BillingMasterHPo billingMasterHPo = new BillingMasterHPo(); 
			billingMasterHPo.setRecordNo(dataObject.getString(BillingMasterHPo.COLUMNS.RECORD_NO.name())); 
			billingMasterHPo.setWriteOffNo(dataObject.getString(BillingMasterHPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingMasterHPo.setPayDeadline(TimestampUtils.of(dataObject.getValue(BillingMasterHPo.COLUMNS.PAY_DEADLINE.name()))); 
			billingMasterHPo.setBillingStatus(dataObject.getString(BillingMasterHPo.COLUMNS.BILLING_STATUS.name())); 
			billingMasterHPo.setBillingNo(dataObject.getString(BillingMasterHPo.COLUMNS.BILLING_NO.name())); 
			billingMasterHPo.setBillingDate(TimestampUtils.of(dataObject.getValue(BillingMasterHPo.COLUMNS.BILLING_DATE.name()))); 
			billingMasterHPo.setBillingAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingMasterHPo.COLUMNS.BILLING_AMOUNT.name()))); 
			billingMasterHPo.setBillingCustNo(dataObject.getString(BillingMasterHPo.COLUMNS.BILLING_CUST_NO.name())); 
			billingMasterHPo.setBillingCustName(dataObject.getString(BillingMasterHPo.COLUMNS.BILLING_CUST_NAME.name())); 
			billingMasterHPo.setBillingCustEmail(dataObject.getString(BillingMasterHPo.COLUMNS.BILLING_CUST_EMAIL.name())); 
			billingMasterHPo.setPayerNo(dataObject.getString(BillingMasterHPo.COLUMNS.PAYER_NO.name())); 
			billingMasterHPo.setPayerName(dataObject.getString(BillingMasterHPo.COLUMNS.PAYER_NAME.name())); 
			billingMasterHPo.setPayerEmail(dataObject.getString(BillingMasterHPo.COLUMNS.PAYER_EMAIL.name())); 
			billingMasterHPo.setPayeeNo(dataObject.getString(BillingMasterHPo.COLUMNS.PAYEE_NO.name())); 
			billingMasterHPo.setPayeeName(dataObject.getString(BillingMasterHPo.COLUMNS.PAYEE_NAME.name())); 
			billingMasterHPo.setPayeeEmail(dataObject.getString(BillingMasterHPo.COLUMNS.PAYEE_EMAIL.name())); 
			billingMasterHPo.setPaymentType(dataObject.getString(BillingMasterHPo.COLUMNS.PAYMENT_TYPE.name())); 
			billingMasterHPo.setUpdateUser(dataObject.getString(BillingMasterHPo.COLUMNS.UPDATE_USER.name())); 
			billingMasterHPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(BillingMasterHPo.COLUMNS.UPDATE_DATE.name()))); 
			billingMasterHPo.setHandlingFee(BigDecimalUtils.formObj(dataObject.getValue(BillingMasterHPo.COLUMNS.HANDLING_FEE.name()))); 
			billingMasterHPo.setRemark(dataObject.getString(BillingMasterHPo.COLUMNS.REMARK.name())); 
			billingMasterHPo.setWriteOffRef(dataObject.getString(BillingMasterHPo.COLUMNS.WRITE_OFF_REF.name())); 
			return billingMasterHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingMasterHPo billingMasterHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.RECORD_NO.name(), billingMasterHPo.getRecordNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.WRITE_OFF_NO.name(), billingMasterHPo.getWriteOffNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAY_DEADLINE.name(), billingMasterHPo.getPayDeadline()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_STATUS.name(), billingMasterHPo.getBillingStatus()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_NO.name(), billingMasterHPo.getBillingNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_DATE.name(), billingMasterHPo.getBillingDate()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_AMOUNT.name(), billingMasterHPo.getBillingAmount()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_CUST_NO.name(), billingMasterHPo.getBillingCustNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_CUST_NAME.name(), billingMasterHPo.getBillingCustName()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.BILLING_CUST_EMAIL.name(), billingMasterHPo.getBillingCustEmail()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYER_NO.name(), billingMasterHPo.getPayerNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYER_NAME.name(), billingMasterHPo.getPayerName()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYER_EMAIL.name(), billingMasterHPo.getPayerEmail()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYEE_NO.name(), billingMasterHPo.getPayeeNo()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYEE_NAME.name(), billingMasterHPo.getPayeeName()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYEE_EMAIL.name(), billingMasterHPo.getPayeeEmail()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.PAYMENT_TYPE.name(), billingMasterHPo.getPaymentType()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.UPDATE_USER.name(), billingMasterHPo.getUpdateUser()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.UPDATE_DATE.name(), billingMasterHPo.getUpdateDate()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.HANDLING_FEE.name(), billingMasterHPo.getHandlingFee()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.REMARK.name(), billingMasterHPo.getRemark()); 
			dataObject.setValue(BillingMasterHPo.COLUMNS.WRITE_OFF_REF.name(), billingMasterHPo.getWriteOffRef()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingMasterHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingMasterHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingMasterHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(BillingMasterHPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
