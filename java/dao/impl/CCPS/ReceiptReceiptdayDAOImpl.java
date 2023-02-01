package com.doc.common.dao.impl; 
 
public class ReceiptReceiptdayDAOImpl extends GeneralDAOImpl<ReceiptReceiptdayPo> implements ReceiptReceiptdayDAO { 
	public static final ReceiptReceiptdayDAOImpl INSTANCE = new ReceiptReceiptdayDAOImpl(); 
	public static final String TABLENAME = "RECEIPT_RECEIPTDAY"; 

	public ReceiptReceiptdayDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiptReceiptdayPo> CONVERTER = new MapConverter<ReceiptReceiptdayPo>() { 
 
		@Override 
		public ReceiptReceiptdayPo convert(final DataObject dataObject) { 
			final ReceiptReceiptdayPo receiptReceiptdayPo = new ReceiptReceiptdayPo(); 
			receiptReceiptdayPo.setReceiptReceiptdayIdenCode(dataObject.getString(ReceiptReceiptdayPo.COLUMNS.RECEIPT_RECEIPTDAY_IDEN_CODE.name())); 
			receiptReceiptdayPo.setReceiptMasterAssoCode(dataObject.getString(ReceiptReceiptdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name())); 
			receiptReceiptdayPo.setReceiptDay(dataObject.getString(ReceiptReceiptdayPo.COLUMNS.RECEIPT_DAY.name())); 
			return receiptReceiptdayPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiptReceiptdayPo receiptReceiptdayPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiptReceiptdayPo.COLUMNS.RECEIPT_RECEIPTDAY_IDEN_CODE.name(), receiptReceiptdayPo.getReceiptReceiptdayIdenCode()); 
			dataObject.setValue(ReceiptReceiptdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), receiptReceiptdayPo.getReceiptMasterAssoCode()); 
			dataObject.setValue(ReceiptReceiptdayPo.COLUMNS.RECEIPT_DAY.name(), receiptReceiptdayPo.getReceiptDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiptReceiptdayPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiptReceiptdayPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReceiptReceiptdayPo.COLUMNS.RECEIPT_RECEIPTDAY_IDEN_CODE.name(), po.getReceiptReceiptdayIdenCode()); 
		sqlWhere.add(ReceiptReceiptdayPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), po.getReceiptMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
