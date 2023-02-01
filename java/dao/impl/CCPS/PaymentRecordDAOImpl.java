package com.doc.common.dao.impl; 
 
public class PaymentRecordDAOImpl extends GeneralDAOImpl<PaymentRecordPo> implements PaymentRecordDAO { 
	public static final PaymentRecordDAOImpl INSTANCE = new PaymentRecordDAOImpl(); 
	public static final String TABLENAME = "PAYMENT_RECORD"; 

	public PaymentRecordDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PaymentRecordPo> CONVERTER = new MapConverter<PaymentRecordPo>() { 
 
		@Override 
		public PaymentRecordPo convert(final DataObject dataObject) { 
			final PaymentRecordPo paymentRecordPo = new PaymentRecordPo(); 
			paymentRecordPo.setWriteOffNo(dataObject.getString(PaymentRecordPo.COLUMNS.WRITE_OFF_NO.name())); 
			paymentRecordPo.setPayNo(dataObject.getString(PaymentRecordPo.COLUMNS.PAY_NO.name())); 
			paymentRecordPo.setPaymentType(dataObject.getString(PaymentRecordPo.COLUMNS.PAYMENT_TYPE.name())); 
			paymentRecordPo.setPayDate(TimestampUtils.of(dataObject.getValue(PaymentRecordPo.COLUMNS.PAY_DATE.name()))); 
			paymentRecordPo.setPayAmount(BigDecimalUtils.formObj(dataObject.getValue(PaymentRecordPo.COLUMNS.PAY_AMOUNT.name()))); 
			paymentRecordPo.setInvoiceTaxNo(dataObject.getString(PaymentRecordPo.COLUMNS.INVOICE_TAX_NO.name())); 
			paymentRecordPo.setInvoiceTaxName(dataObject.getString(PaymentRecordPo.COLUMNS.INVOICE_TAX_NAME.name())); 
			paymentRecordPo.setCarrierType(dataObject.getString(PaymentRecordPo.COLUMNS.CARRIER_TYPE.name())); 
			paymentRecordPo.setCarrierNo1(dataObject.getString(PaymentRecordPo.COLUMNS.CARRIER_NO1.name())); 
			paymentRecordPo.setNpoBan(dataObject.getString(PaymentRecordPo.COLUMNS.NPO_BAN.name())); 
			paymentRecordPo.setUpdateUser(dataObject.getString(PaymentRecordPo.COLUMNS.UPDATE_USER.name())); 
			paymentRecordPo.setUpdateDate(TimestampUtils.of(dataObject.getValue(PaymentRecordPo.COLUMNS.UPDATE_DATE.name()))); 
			paymentRecordPo.setCarrierNo2(dataObject.getString(PaymentRecordPo.COLUMNS.CARRIER_NO2.name())); 
			paymentRecordPo.setPrintInvoice(dataObject.getString(PaymentRecordPo.COLUMNS.PRINT_INVOICE.name())); 
			paymentRecordPo.setPayStatus(dataObject.getString(PaymentRecordPo.COLUMNS.PAY_STATUS.name())); 
			paymentRecordPo.setHandlingFee(BigDecimalUtils.formObj(dataObject.getValue(PaymentRecordPo.COLUMNS.HANDLING_FEE.name()))); 
			return paymentRecordPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PaymentRecordPo paymentRecordPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.WRITE_OFF_NO.name(), paymentRecordPo.getWriteOffNo()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PAY_NO.name(), paymentRecordPo.getPayNo()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PAYMENT_TYPE.name(), paymentRecordPo.getPaymentType()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PAY_DATE.name(), paymentRecordPo.getPayDate()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PAY_AMOUNT.name(), paymentRecordPo.getPayAmount()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.INVOICE_TAX_NO.name(), paymentRecordPo.getInvoiceTaxNo()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.INVOICE_TAX_NAME.name(), paymentRecordPo.getInvoiceTaxName()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.CARRIER_TYPE.name(), paymentRecordPo.getCarrierType()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.CARRIER_NO1.name(), paymentRecordPo.getCarrierNo1()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.NPO_BAN.name(), paymentRecordPo.getNpoBan()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.UPDATE_USER.name(), paymentRecordPo.getUpdateUser()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.UPDATE_DATE.name(), paymentRecordPo.getUpdateDate()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.CARRIER_NO2.name(), paymentRecordPo.getCarrierNo2()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PRINT_INVOICE.name(), paymentRecordPo.getPrintInvoice()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.PAY_STATUS.name(), paymentRecordPo.getPayStatus()); 
			dataObject.setValue(PaymentRecordPo.COLUMNS.HANDLING_FEE.name(), paymentRecordPo.getHandlingFee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PaymentRecordPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PaymentRecordPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(PaymentRecordPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		sqlWhere.add(PaymentRecordPo.COLUMNS.PAY_NO.name(), po.getPayNo()); 
		return sqlWhere; 
	} 
 
} 
