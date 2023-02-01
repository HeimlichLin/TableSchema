package com.doc.common.dao.impl; 
 
public class BillingDetailDAOImpl extends GeneralDAOImpl<BillingDetailPo> implements BillingDetailDAO { 
	public static final BillingDetailDAOImpl INSTANCE = new BillingDetailDAOImpl(); 
	public static final String TABLENAME = "BILLING_DETAIL"; 

	public BillingDetailDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BillingDetailPo> CONVERTER = new MapConverter<BillingDetailPo>() { 
 
		@Override 
		public BillingDetailPo convert(final DataObject dataObject) { 
			final BillingDetailPo billingDetailPo = new BillingDetailPo(); 
			billingDetailPo.setWriteOffNo(dataObject.getString(BillingDetailPo.COLUMNS.WRITE_OFF_NO.name())); 
			billingDetailPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.ITEM_NO.name()))); 
			billingDetailPo.setName(dataObject.getString(BillingDetailPo.COLUMNS.NAME.name())); 
			billingDetailPo.setQuantity(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.QUANTITY.name()))); 
			billingDetailPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.UNIT_PRICE.name()))); 
			billingDetailPo.setSubtotal(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.SUBTOTAL.name()))); 
			billingDetailPo.setUntaxAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.UNTAX_AMOUNT.name()))); 
			billingDetailPo.setTaxAmount(BigDecimalUtils.formObj(dataObject.getValue(BillingDetailPo.COLUMNS.TAX_AMOUNT.name()))); 
			billingDetailPo.setRemark(dataObject.getString(BillingDetailPo.COLUMNS.REMARK.name())); 
			return billingDetailPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BillingDetailPo billingDetailPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BillingDetailPo.COLUMNS.WRITE_OFF_NO.name(), billingDetailPo.getWriteOffNo()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.ITEM_NO.name(), billingDetailPo.getItemNo()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.NAME.name(), billingDetailPo.getName()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.QUANTITY.name(), billingDetailPo.getQuantity()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.UNIT_PRICE.name(), billingDetailPo.getUnitPrice()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.SUBTOTAL.name(), billingDetailPo.getSubtotal()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.UNTAX_AMOUNT.name(), billingDetailPo.getUntaxAmount()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.TAX_AMOUNT.name(), billingDetailPo.getTaxAmount()); 
			dataObject.setValue(BillingDetailPo.COLUMNS.REMARK.name(), billingDetailPo.getRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BillingDetailPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BillingDetailPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(BillingDetailPo.COLUMNS.WRITE_OFF_NO.name(), po.getWriteOffNo()); 
		sqlWhere.add(BillingDetailPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		return sqlWhere; 
	} 
 
} 
