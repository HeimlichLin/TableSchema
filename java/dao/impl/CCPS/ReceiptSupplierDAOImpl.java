package com.doc.common.dao.impl; 
 
public class ReceiptSupplierDAOImpl extends GeneralDAOImpl<ReceiptSupplierPo> implements ReceiptSupplierDAO { 
	public static final ReceiptSupplierDAOImpl INSTANCE = new ReceiptSupplierDAOImpl(); 
	public static final String TABLENAME = "RECEIPT_SUPPLIER"; 

	public ReceiptSupplierDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiptSupplierPo> CONVERTER = new MapConverter<ReceiptSupplierPo>() { 
 
		@Override 
		public ReceiptSupplierPo convert(final DataObject dataObject) { 
			final ReceiptSupplierPo receiptSupplierPo = new ReceiptSupplierPo(); 
			receiptSupplierPo.setReceiptSupplierIdenCode(dataObject.getString(ReceiptSupplierPo.COLUMNS.RECEIPT_SUPPLIER_IDEN_CODE.name())); 
			receiptSupplierPo.setReceiptMasterAssoCode(dataObject.getString(ReceiptSupplierPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name())); 
			receiptSupplierPo.setDomesticSupplierAssoCode(dataObject.getString(ReceiptSupplierPo.COLUMNS.DOMESTIC_SUPPLIER_ASSO_CODE.name())); 
			receiptSupplierPo.setDomesticSupplierSelfCode(dataObject.getString(ReceiptSupplierPo.COLUMNS.DOMESTIC_SUPPLIER_SELF_CODE.name())); 
			receiptSupplierPo.setSupplierName(dataObject.getString(ReceiptSupplierPo.COLUMNS.SUPPLIER_NAME.name())); 
			return receiptSupplierPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiptSupplierPo receiptSupplierPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiptSupplierPo.COLUMNS.RECEIPT_SUPPLIER_IDEN_CODE.name(), receiptSupplierPo.getReceiptSupplierIdenCode()); 
			dataObject.setValue(ReceiptSupplierPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), receiptSupplierPo.getReceiptMasterAssoCode()); 
			dataObject.setValue(ReceiptSupplierPo.COLUMNS.DOMESTIC_SUPPLIER_ASSO_CODE.name(), receiptSupplierPo.getDomesticSupplierAssoCode()); 
			dataObject.setValue(ReceiptSupplierPo.COLUMNS.DOMESTIC_SUPPLIER_SELF_CODE.name(), receiptSupplierPo.getDomesticSupplierSelfCode()); 
			dataObject.setValue(ReceiptSupplierPo.COLUMNS.SUPPLIER_NAME.name(), receiptSupplierPo.getSupplierName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiptSupplierPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiptSupplierPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReceiptSupplierPo.COLUMNS.RECEIPT_SUPPLIER_IDEN_CODE.name(), po.getReceiptSupplierIdenCode()); 
		sqlWhere.add(ReceiptSupplierPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), po.getReceiptMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
