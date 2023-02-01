package com.doc.common.dao.impl; 
 
public class ReceiptProductdayDAOImpl extends GeneralDAOImpl<ReceiptProductdayPo> implements ReceiptProductdayDAO { 
	public static final ReceiptProductdayDAOImpl INSTANCE = new ReceiptProductdayDAOImpl(); 
	public static final String TABLENAME = "RECEIPT_PRODUCTDAY"; 

	public ReceiptProductdayDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiptProductdayPo> CONVERTER = new MapConverter<ReceiptProductdayPo>() { 
 
		@Override 
		public ReceiptProductdayPo convert(final DataObject dataObject) { 
			final ReceiptProductdayPo receiptProductdayPo = new ReceiptProductdayPo(); 
			receiptProductdayPo.setReceiptProductdayIdenCode(dataObject.getString(ReceiptProductdayPo.COLUMNS.RECEIPT_PRODUCTDAY_IDEN_CODE.name())); 
			receiptProductdayPo.setReceiptMasterAssoCode(dataObject.getString(ReceiptProductdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name())); 
			receiptProductdayPo.setBatchNumber(dataObject.getString(ReceiptProductdayPo.COLUMNS.BATCH_NUMBER.name())); 
			receiptProductdayPo.setProductManufactureDay(dataObject.getString(ReceiptProductdayPo.COLUMNS.PRODUCT_MANUFACTURE_DAY.name())); 
			receiptProductdayPo.setProductExpiryDay(dataObject.getString(ReceiptProductdayPo.COLUMNS.PRODUCT_EXPIRY_DAY.name())); 
			return receiptProductdayPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiptProductdayPo receiptProductdayPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiptProductdayPo.COLUMNS.RECEIPT_PRODUCTDAY_IDEN_CODE.name(), receiptProductdayPo.getReceiptProductdayIdenCode()); 
			dataObject.setValue(ReceiptProductdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), receiptProductdayPo.getReceiptMasterAssoCode()); 
			dataObject.setValue(ReceiptProductdayPo.COLUMNS.BATCH_NUMBER.name(), receiptProductdayPo.getBatchNumber()); 
			dataObject.setValue(ReceiptProductdayPo.COLUMNS.PRODUCT_MANUFACTURE_DAY.name(), receiptProductdayPo.getProductManufactureDay()); 
			dataObject.setValue(ReceiptProductdayPo.COLUMNS.PRODUCT_EXPIRY_DAY.name(), receiptProductdayPo.getProductExpiryDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiptProductdayPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiptProductdayPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReceiptProductdayPo.COLUMNS.RECEIPT_PRODUCTDAY_IDEN_CODE.name(), po.getReceiptProductdayIdenCode()); 
		sqlWhere.add(ReceiptProductdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), po.getReceiptMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
