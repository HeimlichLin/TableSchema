package com.doc.common.dao.impl; 
 
public class ReceiptMaterialDAOImpl extends GeneralDAOImpl<ReceiptMaterialPo> implements ReceiptMaterialDAO { 
	public static final ReceiptMaterialDAOImpl INSTANCE = new ReceiptMaterialDAOImpl(); 
	public static final String TABLENAME = "RECEIPT_MATERIAL"; 

	public ReceiptMaterialDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiptMaterialPo> CONVERTER = new MapConverter<ReceiptMaterialPo>() { 
 
		@Override 
		public ReceiptMaterialPo convert(final DataObject dataObject) { 
			final ReceiptMaterialPo receiptMaterialPo = new ReceiptMaterialPo(); 
			receiptMaterialPo.setReceiptMaterialdayIdenCode(dataObject.getString(ReceiptMaterialPo.COLUMNS.RECEIPT_MATERIALDAY_IDEN_CODE.name())); 
			receiptMaterialPo.setReceiptMasterAssoCode(dataObject.getString(ReceiptMaterialPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name())); 
			receiptMaterialPo.setBatchNumber(dataObject.getString(ReceiptMaterialPo.COLUMNS.BATCH_NUMBER.name())); 
			receiptMaterialPo.setMaterialManufactureDay(dataObject.getString(ReceiptMaterialPo.COLUMNS.MATERIAL_MANUFACTURE_DAY.name())); 
			receiptMaterialPo.setMaterialExpiryDay(dataObject.getString(ReceiptMaterialPo.COLUMNS.MATERIAL_EXPIRY_DAY.name())); 
			return receiptMaterialPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiptMaterialPo receiptMaterialPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiptMaterialPo.COLUMNS.RECEIPT_MATERIALDAY_IDEN_CODE.name(), receiptMaterialPo.getReceiptMaterialdayIdenCode()); 
			dataObject.setValue(ReceiptMaterialPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), receiptMaterialPo.getReceiptMasterAssoCode()); 
			dataObject.setValue(ReceiptMaterialPo.COLUMNS.BATCH_NUMBER.name(), receiptMaterialPo.getBatchNumber()); 
			dataObject.setValue(ReceiptMaterialPo.COLUMNS.MATERIAL_MANUFACTURE_DAY.name(), receiptMaterialPo.getMaterialManufactureDay()); 
			dataObject.setValue(ReceiptMaterialPo.COLUMNS.MATERIAL_EXPIRY_DAY.name(), receiptMaterialPo.getMaterialExpiryDay()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiptMaterialPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiptMaterialPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReceiptMaterialPo.COLUMNS.RECEIPT_MATERIALDAY_IDEN_CODE.name(), po.getReceiptMaterialdayIdenCode()); 
		sqlWhere.add(ReceiptMaterialPo.COLUMNS.RECEIPT_MASTER_ASSO_CODE.name(), po.getReceiptMasterAssoCode()); 
		return sqlWhere; 
	} 
 
} 
