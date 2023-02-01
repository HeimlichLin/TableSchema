package com.doc.common.dao.impl; 
 
public class TlF1dataDAOImpl extends GeneralDAOImpl<TlF1dataPo> implements TlF1dataDAO { 
	public static final TlF1dataDAOImpl INSTANCE = new TlF1dataDAOImpl(); 
	public static final String TABLENAME = "TL_F1DATA"; 

	public TlF1dataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TlF1dataPo> CONVERTER = new MapConverter<TlF1dataPo>() { 
 
		@Override 
		public TlF1dataPo convert(final DataObject dataObject) { 
			final TlF1dataPo tlF1dataPo = new TlF1dataPo(); 
			tlF1dataPo.setBfNo(dataObject.getString(TlF1dataPo.COLUMNS.BF_NO.name())); 
			tlF1dataPo.setDeclNo(dataObject.getString(TlF1dataPo.COLUMNS.DECL_NO.name())); 
			tlF1dataPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.ITEM_NO.name()))); 
			tlF1dataPo.setInvoiceNo(dataObject.getString(TlF1dataPo.COLUMNS.INVOICE_NO.name())); 
			tlF1dataPo.setCommodityNo(dataObject.getString(TlF1dataPo.COLUMNS.COMMODITY_NO.name())); 
			tlF1dataPo.setCustomsCommodityNo(dataObject.getString(TlF1dataPo.COLUMNS.CUSTOMS_COMMODITY_NO.name())); 
			tlF1dataPo.setDescrip(dataObject.getString(TlF1dataPo.COLUMNS.DESCRIP.name())); 
			tlF1dataPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.UNIT_PRICE.name()))); 
			tlF1dataPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.QTY.name()))); 
			tlF1dataPo.setUnit(dataObject.getString(TlF1dataPo.COLUMNS.UNIT.name())); 
			tlF1dataPo.setAmtPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.AMT_PRICE.name()))); 
			tlF1dataPo.setCccCode(dataObject.getString(TlF1dataPo.COLUMNS.CCC_CODE.name())); 
			tlF1dataPo.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.NET_WGT.name()))); 
			tlF1dataPo.setContrNo(dataObject.getString(TlF1dataPo.COLUMNS.CONTR_NO.name())); 
			tlF1dataPo.setToyotaCommodityNo(dataObject.getString(TlF1dataPo.COLUMNS.TOYOTA_COMMODITY_NO.name())); 
			tlF1dataPo.setSupplierCommodityNo(dataObject.getString(TlF1dataPo.COLUMNS.SUPPLIER_COMMODITY_NO.name())); 
			tlF1dataPo.setCtmCode(dataObject.getString(TlF1dataPo.COLUMNS.CTM_CODE.name())); 
			tlF1dataPo.setCtmName(dataObject.getString(TlF1dataPo.COLUMNS.CTM_NAME.name())); 
			tlF1dataPo.setCurrentQty(BigDecimalUtils.formObj(dataObject.getValue(TlF1dataPo.COLUMNS.CURRENT_QTY.name()))); 
			return tlF1dataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TlF1dataPo tlF1dataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TlF1dataPo.COLUMNS.BF_NO.name(), tlF1dataPo.getBfNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.DECL_NO.name(), tlF1dataPo.getDeclNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.ITEM_NO.name(), tlF1dataPo.getItemNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.INVOICE_NO.name(), tlF1dataPo.getInvoiceNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.COMMODITY_NO.name(), tlF1dataPo.getCommodityNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CUSTOMS_COMMODITY_NO.name(), tlF1dataPo.getCustomsCommodityNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.DESCRIP.name(), tlF1dataPo.getDescrip()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.UNIT_PRICE.name(), tlF1dataPo.getUnitPrice()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.QTY.name(), tlF1dataPo.getQty()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.UNIT.name(), tlF1dataPo.getUnit()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.AMT_PRICE.name(), tlF1dataPo.getAmtPrice()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CCC_CODE.name(), tlF1dataPo.getCccCode()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.NET_WGT.name(), tlF1dataPo.getNetWgt()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CONTR_NO.name(), tlF1dataPo.getContrNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.TOYOTA_COMMODITY_NO.name(), tlF1dataPo.getToyotaCommodityNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.SUPPLIER_COMMODITY_NO.name(), tlF1dataPo.getSupplierCommodityNo()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CTM_CODE.name(), tlF1dataPo.getCtmCode()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CTM_NAME.name(), tlF1dataPo.getCtmName()); 
			dataObject.setValue(TlF1dataPo.COLUMNS.CURRENT_QTY.name(), tlF1dataPo.getCurrentQty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TlF1dataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TlF1dataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TlF1dataPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(TlF1dataPo.COLUMNS.DECL_NO.name(), po.getDeclNo()); 
		sqlWhere.add(TlF1dataPo.COLUMNS.ITEM_NO.name(), po.getItemNo()); 
		return sqlWhere; 
	} 
 
} 
