package com.doc.common.dao.impl; 
 
public class ReceiptDAOImpl extends GeneralDAOImpl<ReceiptPo> implements ReceiptDAO { 
	public static final ReceiptDAOImpl INSTANCE = new ReceiptDAOImpl(); 
	public static final String TABLENAME = "RECEIPT"; 

	public ReceiptDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiptPo> CONVERTER = new MapConverter<ReceiptPo>() { 
 
		@Override 
		public ReceiptPo convert(final DataObject dataObject) { 
			final ReceiptPo receiptPo = new ReceiptPo(); 
			receiptPo.setReceiptMasterIdenCode(dataObject.getString(ReceiptPo.COLUMNS.RECEIPT_MASTER_IDEN_CODE.name())); 
			receiptPo.setBusinessInfoAssoCode(dataObject.getString(ReceiptPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name())); 
			receiptPo.setDeclareYear(dataObject.getString(ReceiptPo.COLUMNS.DECLARE_YEAR.name())); 
			receiptPo.setDeclareMonth(dataObject.getString(ReceiptPo.COLUMNS.DECLARE_MONTH.name())); 
			receiptPo.setDeclareDay(dataObject.getString(ReceiptPo.COLUMNS.DECLARE_DAY.name())); 
			receiptPo.setDeclareSerialNumber(dataObject.getString(ReceiptPo.COLUMNS.DECLARE_SERIAL_NUMBER.name())); 
			receiptPo.setMaterialAssoCode(dataObject.getString(ReceiptPo.COLUMNS.MATERIAL_ASSO_CODE.name())); 
			receiptPo.setMaterialSelfCode(dataObject.getString(ReceiptPo.COLUMNS.MATERIAL_SELF_CODE.name())); 
			receiptPo.setMaterialCompanyInfoAssoCod(dataObject.getString(ReceiptPo.COLUMNS.MATERIAL_COMPANY_INFO_ASSO_COD.name())); 
			receiptPo.setMaterialCompanySelfCode(dataObject.getString(ReceiptPo.COLUMNS.MATERIAL_COMPANY_SELF_CODE.name())); 
			receiptPo.setMaterialName(dataObject.getString(ReceiptPo.COLUMNS.MATERIAL_NAME.name())); 
			receiptPo.setProductInfoAssoCode(dataObject.getString(ReceiptPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name())); 
			receiptPo.setProductSpecAssoCode(dataObject.getString(ReceiptPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name())); 
			receiptPo.setProductSelfCode(dataObject.getString(ReceiptPo.COLUMNS.PRODUCT_SELF_CODE.name())); 
			receiptPo.setProductChineseName(dataObject.getString(ReceiptPo.COLUMNS.PRODUCT_CHINESE_NAME.name())); 
			receiptPo.setReceiptTotalQuantity(); 
			receiptPo.setReceiptTotalWeight(); 
			receiptPo.setQuantityType(dataObject.getString(ReceiptPo.COLUMNS.QUANTITY_TYPE.name())); 
			receiptPo.setReturnTotalWeight(); 
			receiptPo.setInventoryTotalWeight(); 
			receiptPo.setInventoryTotalQuantity(); 
			return receiptPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiptPo receiptPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiptPo.COLUMNS.RECEIPT_MASTER_IDEN_CODE.name(), receiptPo.getReceiptMasterIdenCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.BUSINESS_INFO_ASSO_CODE.name(), receiptPo.getBusinessInfoAssoCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.DECLARE_YEAR.name(), receiptPo.getDeclareYear()); 
			dataObject.setValue(ReceiptPo.COLUMNS.DECLARE_MONTH.name(), receiptPo.getDeclareMonth()); 
			dataObject.setValue(ReceiptPo.COLUMNS.DECLARE_DAY.name(), receiptPo.getDeclareDay()); 
			dataObject.setValue(ReceiptPo.COLUMNS.DECLARE_SERIAL_NUMBER.name(), receiptPo.getDeclareSerialNumber()); 
			dataObject.setValue(ReceiptPo.COLUMNS.MATERIAL_ASSO_CODE.name(), receiptPo.getMaterialAssoCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.MATERIAL_SELF_CODE.name(), receiptPo.getMaterialSelfCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.MATERIAL_COMPANY_INFO_ASSO_COD.name(), receiptPo.getMaterialCompanyInfoAssoCod()); 
			dataObject.setValue(ReceiptPo.COLUMNS.MATERIAL_COMPANY_SELF_CODE.name(), receiptPo.getMaterialCompanySelfCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.MATERIAL_NAME.name(), receiptPo.getMaterialName()); 
			dataObject.setValue(ReceiptPo.COLUMNS.PRODUCT_INFO_ASSO_CODE.name(), receiptPo.getProductInfoAssoCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.PRODUCT_SPEC_ASSO_CODE.name(), receiptPo.getProductSpecAssoCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.PRODUCT_SELF_CODE.name(), receiptPo.getProductSelfCode()); 
			dataObject.setValue(ReceiptPo.COLUMNS.PRODUCT_CHINESE_NAME.name(), receiptPo.getProductChineseName()); 
			dataObject.setValue(ReceiptPo.COLUMNS.RECEIPT_TOTAL_QUANTITY.name(), receiptPo.getReceiptTotalQuantity()); 
			dataObject.setValue(ReceiptPo.COLUMNS.RECEIPT_TOTAL_WEIGHT.name(), receiptPo.getReceiptTotalWeight()); 
			dataObject.setValue(ReceiptPo.COLUMNS.QUANTITY_TYPE.name(), receiptPo.getQuantityType()); 
			dataObject.setValue(ReceiptPo.COLUMNS.RETURN_TOTAL_WEIGHT.name(), receiptPo.getReturnTotalWeight()); 
			dataObject.setValue(ReceiptPo.COLUMNS.INVENTORY_TOTAL_WEIGHT.name(), receiptPo.getInventoryTotalWeight()); 
			dataObject.setValue(ReceiptPo.COLUMNS.INVENTORY_TOTAL_QUANTITY.name(), receiptPo.getInventoryTotalQuantity()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiptPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiptPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ReceiptPo.COLUMNS.RECEIPT_MASTER_IDEN_CODE.name(), po.getReceiptMasterIdenCode()); 
		return sqlWhere; 
	} 
 
} 
