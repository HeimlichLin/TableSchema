package com.doc.common.dao.impl; 
 
public class IdaccTransactionDAOImpl extends GeneralDAOImpl<IdaccTransactionPo> implements IdaccTransactionDAO { 
	public static final IdaccTransactionDAOImpl INSTANCE = new IdaccTransactionDAOImpl(); 
	public static final String TABLENAME = "IDACC_TRANSACTION"; 

	public IdaccTransactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<IdaccTransactionPo> CONVERTER = new MapConverter<IdaccTransactionPo>() { 
 
		@Override 
		public IdaccTransactionPo convert(final DataObject dataObject) { 
			final IdaccTransactionPo idaccTransactionPo = new IdaccTransactionPo(); 
			idaccTransactionPo.setPayNo(dataObject.getString(IdaccTransactionPo.COLUMNS.PAY_NO.name())); 
			idaccTransactionPo.setPayerInfo(dataObject.getString(IdaccTransactionPo.COLUMNS.PAYER_INFO.name())); 
			idaccTransactionPo.setShopCode(dataObject.getString(IdaccTransactionPo.COLUMNS.SHOP_CODE.name())); 
			idaccTransactionPo.setIdNumber(dataObject.getString(IdaccTransactionPo.COLUMNS.ID_NUMBER.name())); 
			idaccTransactionPo.setPayBank(dataObject.getString(IdaccTransactionPo.COLUMNS.PAY_BANK.name())); 
			idaccTransactionPo.setPayAccount(dataObject.getString(IdaccTransactionPo.COLUMNS.PAY_ACCOUNT.name())); 
			idaccTransactionPo.setVirtualAccBank(dataObject.getString(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_BANK.name())); 
			idaccTransactionPo.setVirtualAccType(BigDecimalUtils.formObj(dataObject.getValue(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_TYPE.name()))); 
			idaccTransactionPo.setVirtualAccShop(dataObject.getString(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_SHOP.name())); 
			idaccTransactionPo.setOrderNo(dataObject.getString(IdaccTransactionPo.COLUMNS.ORDER_NO.name())); 
			idaccTransactionPo.setReplyCode(dataObject.getString(IdaccTransactionPo.COLUMNS.REPLY_CODE.name())); 
			idaccTransactionPo.setReplyCodeDesc(dataObject.getString(IdaccTransactionPo.COLUMNS.REPLY_CODE_DESC.name())); 
			idaccTransactionPo.setTransSeqNo(dataObject.getString(IdaccTransactionPo.COLUMNS.TRANS_SEQ_NO.name())); 
			idaccTransactionPo.setTransactionDateTime(dataObject.getString(IdaccTransactionPo.COLUMNS.TRANSACTION_DATE_TIME.name())); 
			idaccTransactionPo.setPayerFee(BigDecimalUtils.formObj(dataObject.getValue(IdaccTransactionPo.COLUMNS.PAYER_FEE.name()))); 
			idaccTransactionPo.setVirtualAccount(dataObject.getString(IdaccTransactionPo.COLUMNS.VIRTUAL_ACCOUNT.name())); 
			idaccTransactionPo.setDueDate(TimestampUtils.of(dataObject.getValue(IdaccTransactionPo.COLUMNS.DUE_DATE.name()))); 
			idaccTransactionPo.setPaymentStatus(dataObject.getString(IdaccTransactionPo.COLUMNS.PAYMENT_STATUS.name())); 
			return idaccTransactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final IdaccTransactionPo idaccTransactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAY_NO.name(), idaccTransactionPo.getPayNo()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAYER_INFO.name(), idaccTransactionPo.getPayerInfo()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.SHOP_CODE.name(), idaccTransactionPo.getShopCode()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.ID_NUMBER.name(), idaccTransactionPo.getIdNumber()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAY_BANK.name(), idaccTransactionPo.getPayBank()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAY_ACCOUNT.name(), idaccTransactionPo.getPayAccount()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_BANK.name(), idaccTransactionPo.getVirtualAccBank()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_TYPE.name(), idaccTransactionPo.getVirtualAccType()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.VIRTUAL_ACC_SHOP.name(), idaccTransactionPo.getVirtualAccShop()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.ORDER_NO.name(), idaccTransactionPo.getOrderNo()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.REPLY_CODE.name(), idaccTransactionPo.getReplyCode()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.REPLY_CODE_DESC.name(), idaccTransactionPo.getReplyCodeDesc()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.TRANS_SEQ_NO.name(), idaccTransactionPo.getTransSeqNo()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.TRANSACTION_DATE_TIME.name(), idaccTransactionPo.getTransactionDateTime()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAYER_FEE.name(), idaccTransactionPo.getPayerFee()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.VIRTUAL_ACCOUNT.name(), idaccTransactionPo.getVirtualAccount()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.DUE_DATE.name(), idaccTransactionPo.getDueDate()); 
			dataObject.setValue(IdaccTransactionPo.COLUMNS.PAYMENT_STATUS.name(), idaccTransactionPo.getPaymentStatus()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<IdaccTransactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(IdaccTransactionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(IdaccTransactionPo.COLUMNS.PAY_NO.name(), po.getPayNo()); 
		return sqlWhere; 
	} 
 
} 
