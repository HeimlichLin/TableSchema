package com.doc.common.dao.impl; 
 
public class BillingDetailHDAOImpl extends GeneralDAOImpl<BillingDetailHPo> implements BillingDetailHDAO { 
	public static final BillingDetailHDAOImpl INSTANCE = new BillingDetailHDAOImpl(); 
	public static final String TABLENAME = "BILLING_DETAIL_H"; 

	public BillingDetailHDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingDetailHPo> CONVERTER = new MapConverter<BillingDetailHPo>() { 
 
		@Override 
		public BillingDetailHPo convert(final DataObject dataObject) { 
			final BillingDetailHPo billingDetailHPo = new BillingDetailHPo(); 
			billingDetailHPo.setRecordNo(dataObject.getString(BillingDetailHPo.COLUMNS.RECORD_NO.name())); 
			billingDetailHPo.setWriteOffNo(dataObject.getString(BillingDetailHPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingDetailHPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.ITEM_NO.name()))); 
			billingDetailHPo.setName(dataObject.getString(BillingDetailHPo.COLUMNS.NAME.name())); 
			billingDetailHPo.setQuantity(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.QUANTITY.name()))); 
			billingDetailHPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.UNIT_PRICE.name()))); 
			billingDetailHPo.setSubtotal(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.SUBTOTAL.name()))); 
			billingDetailHPo.setUntaxAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.UNTAX_AMOUNT.name()))); 
			billingDetailHPo.setTaxAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailHPo.COLUMNS.TAX_AMOUNT.name()))); 
			billingDetailHPo.setRemark(dataObject.getString(BillingDetailHPo.COLUMNS.REMARK.name())); 
			return billingDetailHPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingDetailHPo billingDetailHPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.RECORD_NO.name(), billingDetailHPo.getRecordNo()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.WRITE_OFF_NO.name(), billingDetailHPo.getWriteOffNo()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.ITEM_NO.name(), billingDetailHPo.getItemNo()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.NAME.name(), billingDetailHPo.getName()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.QUANTITY.name(), billingDetailHPo.getQuantity()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.UNIT_PRICE.name(), billingDetailHPo.getUnitPrice()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.SUBTOTAL.name(), billingDetailHPo.getSubtotal()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.UNTAX_AMOUNT.name(), billingDetailHPo.getUntaxAmount()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.TAX_AMOUNT.name(), billingDetailHPo.getTaxAmount()); 
			dataObject.setValue(BillingDetailHPo.COLUMNS.REMARK.name(), billingDetailHPo.getRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingDetailHPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingDetailHPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingDetailHPo.COLUMNS.RECORD_NO.name(), po.getRecordNo()); 
		sqlWhere.add(BillingDetailHPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		sqlWhere.add(BillingDetailHPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		return sqlWhere; 
	} 
 
} 
