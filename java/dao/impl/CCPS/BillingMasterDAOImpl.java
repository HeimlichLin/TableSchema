package com.doc.common.dao.impl; 
 
public class BillingMasterDAOImpl extends GeneralDAOImpl<BillingMasterPo> implements BillingMasterDAO { 
	public static final BillingMasterDAOImpl INSTANCE = new BillingMasterDAOImpl(); 
	public static final String TABLENAME = "BILLING_MASTER"; 

	public BillingMasterDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingMasterPo> CONVERTER = new MapConverter<BillingMasterPo>() { 
 
		@Override 
		public BillingMasterPo convert(final DataObject dataObject) { 
			final BillingMasterPo billingMasterPo = new BillingMasterPo(); 
			billingMasterPo.setWriteOffNo(dataObject.getString(BillingMasterPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingMasterPo.setPayDeadline(TimestampUtils.of(dataObject.getValue(BillingMasterPo.COLUMNS.PAY_DEADLINE.name()))); 
			billingMasterPo.setBillingStatus(dataObject.getString(BillingMasterPo.COLUMNS.BILLING_STATUS.name())); 
			billingMasterPo.setBillingNo(dataObject.getString(BillingMasterPo.COLUMNS.BILLING_NO.name())); 
			billingMasterPo.setBillingDate(TimestampUtils.of(dataObject.getValue(BillingMasterPo.COLUMNS.BILLING_DATE.name()))); 
			billingMasterPo.setBillingAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingMasterPo.COLUMNS.BILLING_AMOUNT.name()))); 
			billingMasterPo.setBillingCustNo(dataObject.getString(BillingMasterPo.COLUMNS.BILLING_CUST_NO.name())); 
			billingMasterPo.setBillingCustName(dataObject.getString(BillingMasterPo.COLUMNS.BILLING_CUST_NAME.name())); 
			billingMasterPo.setBillingCustEmail(dataObject.getString(BillingMasterPo.COLUMNS.BILLING_CUST_EMAIL.name())); 
			billingMasterPo.setPayerNo(dataObject.getString(BillingMasterPo.COLUMNS.PAYER_NO.name())); 
			billingMasterPo.setPayerName(dataObject.getString(BillingMasterPo.COLUMNS.PAYER_NAME.name())); 
			billingMasterPo.setPayerEmail(dataObject.getString(BillingMasterPo.COLUMNS.PAYER_EMAIL.name())); 
			billingMasterPo.setPayeeNo(dataObject.getString(BillingMasterPo.COLUMNS.PAYEE_NO.name())); 
			billingMasterPo.setPayeeName(dataObject.getString(BillingMasterPo.COLUMNS.PAYEE_NAME.name())); 
			billingMasterPo.setPayeeEmail(dataObject.getString(BillingMasterPo.COLUMNS.PAYEE_EMAIL.name())); 
			billingMasterPo.setPaymentType(dataObject.getString(BillingMasterPo.COLUMNS.PAYMENT_TYPE.name())); 
			billingMasterPo.setUpdateUser(dataObject.getString(BillingMasterPo.COLUMNS.UPDATE_USER.name())); 
			billingMasterPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(BillingMasterPo.COLUMNS.UPDATE_DATE.name()))); 
			billingMasterPo.setHandlingFee(BigDecimalUtils.formObj(dataObject.getValue(BillingMasterPo.COLUMNS.HANDLING_FEE.name()))); 
			billingMasterPo.setRemark(dataObject.getString(BillingMasterPo.COLUMNS.REMARK.name())); 
			billingMasterPo.setWriteOffRef(dataObject.getString(BillingMasterPo.COLUMNS.WRITE_OFF_REF.name())); 
			return billingMasterPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingMasterPo billingMasterPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingMasterPo.COLUMNS.WRITE_OFF_NO.name(), billingMasterPo.getWriteOffNo()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAY_DEADLINE.name(), billingMasterPo.getPayDeadline()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_STATUS.name(), billingMasterPo.getBillingStatus()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_NO.name(), billingMasterPo.getBillingNo()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_DATE.name(), billingMasterPo.getBillingDate()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_AMOUNT.name(), billingMasterPo.getBillingAmount()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_CUST_NO.name(), billingMasterPo.getBillingCustNo()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_CUST_NAME.name(), billingMasterPo.getBillingCustName()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.BILLING_CUST_EMAIL.name(), billingMasterPo.getBillingCustEmail()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYER_NO.name(), billingMasterPo.getPayerNo()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYER_NAME.name(), billingMasterPo.getPayerName()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYER_EMAIL.name(), billingMasterPo.getPayerEmail()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYEE_NO.name(), billingMasterPo.getPayeeNo()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYEE_NAME.name(), billingMasterPo.getPayeeName()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYEE_EMAIL.name(), billingMasterPo.getPayeeEmail()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.PAYMENT_TYPE.name(), billingMasterPo.getPaymentType()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.UPDATE_USER.name(), billingMasterPo.getUpdateUser()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.UPDATE_DATE.name(), billingMasterPo.getUpdateDate()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.HANDLING_FEE.name(), billingMasterPo.getHandlingFee()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.REMARK.name(), billingMasterPo.getRemark()); 
			dataObject.setValue(BillingMasterPo.COLUMNS.WRITE_OFF_REF.name(), billingMasterPo.getWriteOffRef()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingMasterPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingMasterPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingMasterPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		return sqlWhere; 
	} 
 
} 
