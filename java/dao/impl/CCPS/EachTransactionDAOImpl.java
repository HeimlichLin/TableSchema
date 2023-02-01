package com.doc.common.dao.impl; 
 
public class EachTransactionDAOImpl extends GeneralDAOImpl<EachTransactionPo> implements EachTransactionDAO { 
	public static final EachTransactionDAOImpl INSTANCE = new EachTransactionDAOImpl(); 
	public static final String TABLENAME = "EACH_TRANSACTION"; 

	public EachTransactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EachTransactionPo> CONVERTER = new MapConverter<EachTransactionPo>() { 
 
		@Override 
		public EachTransactionPo convert(final DataObject dataObject) { 
			final EachTransactionPo eachTransactionPo = new EachTransactionPo(); 
			eachTransactionPo.setPayNo(dataObject.getString(EachTransactionPo.COLUMNS.PAY_NO.name())); 
			eachTransactionPo.setTransactionType(dataObject.getString(EachTransactionPo.COLUMNS.TRANSACTION_TYPE.name())); 
			eachTransactionPo.setPayeeNo(dataObject.getString(EachTransactionPo.COLUMNS.PAYEE_NO.name())); 
			eachTransactionPo.setPayeeBank(dataObject.getString(EachTransactionPo.COLUMNS.PAYEE_BANK.name())); 
			eachTransactionPo.setPayeeBranch(dataObject.getString(EachTransactionPo.COLUMNS.PAYEE_BRANCH.name())); 
			eachTransactionPo.setPayeeAccount(dataObject.getString(EachTransactionPo.COLUMNS.PAYEE_ACCOUNT.name())); 
			eachTransactionPo.setSdAuthNo(dataObject.getString(EachTransactionPo.COLUMNS.SD_AUTH_NO.name())); 
			eachTransactionPo.setScTransCode(dataObject.getString(EachTransactionPo.COLUMNS.SC_TRANS_CODE.name())); 
			eachTransactionPo.setPayerNo(dataObject.getString(EachTransactionPo.COLUMNS.PAYER_NO.name())); 
			eachTransactionPo.setPayerBank(dataObject.getString(EachTransactionPo.COLUMNS.PAYER_BANK.name())); 
			eachTransactionPo.setPayerBranch(dataObject.getString(EachTransactionPo.COLUMNS.PAYER_BRANCH.name())); 
			eachTransactionPo.setPayerAccount(dataObject.getString(EachTransactionPo.COLUMNS.PAYER_ACCOUNT.name())); 
			eachTransactionPo.setOrderNo(dataObject.getString(EachTransactionPo.COLUMNS.ORDER_NO.name())); 
			eachTransactionPo.setPaymentStatus(dataObject.getString(EachTransactionPo.COLUMNS.PAYMENT_STATUS.name())); 
			eachTransactionPo.setTransactionCode(dataObject.getString(EachTransactionPo.COLUMNS.TRANSACTION_CODE.name())); 
			eachTransactionPo.setTransactionCodeDesc(dataObject.getString(EachTransactionPo.COLUMNS.TRANSACTION_CODE_DESC.name())); 
			eachTransactionPo.setTransactionResult(dataObject.getString(EachTransactionPo.COLUMNS.TRANSACTION_RESULT.name())); 
			return eachTransactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EachTransactionPo eachTransactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAY_NO.name(), eachTransactionPo.getPayNo()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.TRANSACTION_TYPE.name(), eachTransactionPo.getTransactionType()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYEE_NO.name(), eachTransactionPo.getPayeeNo()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYEE_BANK.name(), eachTransactionPo.getPayeeBank()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYEE_BRANCH.name(), eachTransactionPo.getPayeeBranch()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYEE_ACCOUNT.name(), eachTransactionPo.getPayeeAccount()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.SD_AUTH_NO.name(), eachTransactionPo.getSdAuthNo()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.SC_TRANS_CODE.name(), eachTransactionPo.getScTransCode()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYER_NO.name(), eachTransactionPo.getPayerNo()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYER_BANK.name(), eachTransactionPo.getPayerBank()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYER_BRANCH.name(), eachTransactionPo.getPayerBranch()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYER_ACCOUNT.name(), eachTransactionPo.getPayerAccount()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.ORDER_NO.name(), eachTransactionPo.getOrderNo()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.PAYMENT_STATUS.name(), eachTransactionPo.getPaymentStatus()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.TRANSACTION_CODE.name(), eachTransactionPo.getTransactionCode()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.TRANSACTION_CODE_DESC.name(), eachTransactionPo.getTransactionCodeDesc()); 
			dataObject.setValue(EachTransactionPo.COLUMNS.TRANSACTION_RESULT.name(), eachTransactionPo.getTransactionResult()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EachTransactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EachTransactionPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(EachTransactionPo.COLUMNS.PAY_NO.name(), po.getPayNo()); 
		return sqlWhere; 
	} 
 
} 
