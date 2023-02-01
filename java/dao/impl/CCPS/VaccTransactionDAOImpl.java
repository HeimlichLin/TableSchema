package com.doc.common.dao.impl; 
 
public class VaccTransactionDAOImpl extends GeneralDAOImpl<VaccTransactionPo> implements VaccTransactionDAO { 
	public static final VaccTransactionDAOImpl INSTANCE = new VaccTransactionDAOImpl(); 
	public static final String TABLENAME = "VACC_TRANSACTION"; 

	public VaccTransactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<VaccTransactionPo> CONVERTER = new MapConverter<VaccTransactionPo>() { 
 
		@Override 
		public VaccTransactionPo convert(final DataObject dataObject) { 
			final VaccTransactionPo vaccTransactionPo = new VaccTransactionPo(); 
			vaccTransactionPo.setPayNo(dataObject.getString(VaccTransactionPo.COLUMNS.PAY_NO.name())); 
			vaccTransactionPo.setShopCode(dataObject.getString(VaccTransactionPo.COLUMNS.SHOP_CODE.name())); 
			vaccTransactionPo.setVirtualAccBank(dataObject.getString(VaccTransactionPo.COLUMNS.VIRTUAL_ACC_BANK.name())); 
			vaccTransactionPo.setPayerInfo(dataObject.getString(VaccTransactionPo.COLUMNS.PAYER_INFO.name())); 
			vaccTransactionPo.setOrderNo(dataObject.getString(VaccTransactionPo.COLUMNS.ORDER_NO.name())); 
			vaccTransactionPo.setVirtualAccount(dataObject.getString(VaccTransactionPo.COLUMNS.VIRTUAL_ACCOUNT.name())); 
			vaccTransactionPo.setDueDate(TimestampUtils.of(dataObject.getValue(VaccTransactionPo.COLUMNS.DUE_DATE.name()))); 
			vaccTransactionPo.setPaymentStatus(dataObject.getString(VaccTransactionPo.COLUMNS.PAYMENT_STATUS.name())); 
			vaccTransactionPo.setTransactionDate(dataObject.getString(VaccTransactionPo.COLUMNS.TRANSACTION_DATE.name())); 
			vaccTransactionPo.setTransactionSerNo(dataObject.getString(VaccTransactionPo.COLUMNS.TRANSACTION_SER_NO.name())); 
			return vaccTransactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final VaccTransactionPo vaccTransactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.PAY_NO.name(), vaccTransactionPo.getPayNo()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.SHOP_CODE.name(), vaccTransactionPo.getShopCode()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.VIRTUAL_ACC_BANK.name(), vaccTransactionPo.getVirtualAccBank()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.PAYER_INFO.name(), vaccTransactionPo.getPayerInfo()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.ORDER_NO.name(), vaccTransactionPo.getOrderNo()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.VIRTUAL_ACCOUNT.name(), vaccTransactionPo.getVirtualAccount()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.DUE_DATE.name(), vaccTransactionPo.getDueDate()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.PAYMENT_STATUS.name(), vaccTransactionPo.getPaymentStatus()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.TRANSACTION_DATE.name(), vaccTransactionPo.getTransactionDate()); 
			dataObject.setValue(VaccTransactionPo.COLUMNS.TRANSACTION_SER_NO.name(), vaccTransactionPo.getTransactionSerNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<VaccTransactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(VaccTransactionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(VaccTransactionPo.COLUMNS.PAY_NO.name(), po.getPayNo()); 
		return sqlWhere; 
	} 
 
} 
