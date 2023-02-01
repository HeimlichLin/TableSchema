package com.doc.common.dao.impl; 
 
public class TlF2dataResultDAOImpl extends GeneralDAOImpl<TlF2dataResultPo> implements TlF2dataResultDAO { 
	public static final TlF2dataResultDAOImpl INSTANCE = new TlF2dataResultDAOImpl(); 
	public static final String TABLENAME = "TL_F2DATA_RESULT"; 

	public TlF2dataResultDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TlF2dataResultPo> CONVERTER = new MapConverter<TlF2dataResultPo>() { 
 
		@Override 
		public TlF2dataResultPo convert(final DataObject dataObject) { 
			final TlF2dataResultPo tlF2dataResultPo = new TlF2dataResultPo(); 
			tlF2dataResultPo.setBfNo(dataObject.getString(TlF2dataResultPo.COLUMNS.BF_NO.name())); 
			tlF2dataResultPo.setInvoiceNo(dataObject.getString(TlF2dataResultPo.COLUMNS.INVOICE_NO.name())); 
			tlF2dataResultPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.SERIAL_NO.name()))); 
			tlF2dataResultPo.setCommodityNo(dataObject.getString(TlF2dataResultPo.COLUMNS.COMMODITY_NO.name())); 
			tlF2dataResultPo.setCustomsCommodityNo(dataObject.getString(TlF2dataResultPo.COLUMNS.CUSTOMS_COMMODITY_NO.name())); 
			tlF2dataResultPo.setDescrip(dataObject.getString(TlF2dataResultPo.COLUMNS.DESCRIP.name())); 
			tlF2dataResultPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.UNIT_PRICE.name()))); 
			tlF2dataResultPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.QTY.name()))); 
			tlF2dataResultPo.setUnit(dataObject.getString(TlF2dataResultPo.COLUMNS.UNIT.name())); 
			tlF2dataResultPo.setAmtPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.AMT_PRICE.name()))); 
			tlF2dataResultPo.setCccCode(dataObject.getString(TlF2dataResultPo.COLUMNS.CCC_CODE.name())); 
			tlF2dataResultPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.DUTY_RATE.name()))); 
			tlF2dataResultPo.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.NET_WGT.name()))); 
			tlF2dataResultPo.setContrNo(dataObject.getString(TlF2dataResultPo.COLUMNS.CONTR_NO.name())); 
			tlF2dataResultPo.setToyotaCommodityNo(dataObject.getString(TlF2dataResultPo.COLUMNS.TOYOTA_COMMODITY_NO.name())); 
			tlF2dataResultPo.setSupplierCommodityNo(dataObject.getString(TlF2dataResultPo.COLUMNS.SUPPLIER_COMMODITY_NO.name())); 
			tlF2dataResultPo.setCtmCode(dataObject.getString(TlF2dataResultPo.COLUMNS.CTM_CODE.name())); 
			tlF2dataResultPo.setCtmName(dataObject.getString(TlF2dataResultPo.COLUMNS.CTM_NAME.name())); 
			tlF2dataResultPo.setTempDeclNo(dataObject.getString(TlF2dataResultPo.COLUMNS.TEMP_DECL_NO.name())); 
			tlF2dataResultPo.setTempItemNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.TEMP_ITEM_NO.name()))); 
			tlF2dataResultPo.setODeclNo(dataObject.getString(TlF2dataResultPo.COLUMNS.O_DECL_NO.name())); 
			tlF2dataResultPo.setOItemNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.O_ITEM_NO.name()))); 
			tlF2dataResultPo.setBomCheck(dataObject.getString(TlF2dataResultPo.COLUMNS.BOM_CHECK.name())); 
			tlF2dataResultPo.setStatus(dataObject.getString(TlF2dataResultPo.COLUMNS.STATUS.name())); 
			tlF2dataResultPo.setControlNo(dataObject.getString(TlF2dataResultPo.COLUMNS.CONTROL_NO.name())); 
			tlF2dataResultPo.setLastQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataResultPo.COLUMNS.LAST_QTY.name()))); 
			return tlF2dataResultPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TlF2dataResultPo tlF2dataResultPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.BF_NO.name(), tlF2dataResultPo.getBfNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.INVOICE_NO.name(), tlF2dataResultPo.getInvoiceNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.SERIAL_NO.name(), tlF2dataResultPo.getSerialNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.COMMODITY_NO.name(), tlF2dataResultPo.getCommodityNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CUSTOMS_COMMODITY_NO.name(), tlF2dataResultPo.getCustomsCommodityNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.DESCRIP.name(), tlF2dataResultPo.getDescrip()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.UNIT_PRICE.name(), tlF2dataResultPo.getUnitPrice()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.QTY.name(), tlF2dataResultPo.getQty()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.UNIT.name(), tlF2dataResultPo.getUnit()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.AMT_PRICE.name(), tlF2dataResultPo.getAmtPrice()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CCC_CODE.name(), tlF2dataResultPo.getCccCode()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.DUTY_RATE.name(), tlF2dataResultPo.getDutyRate()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.NET_WGT.name(), tlF2dataResultPo.getNetWgt()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CONTR_NO.name(), tlF2dataResultPo.getContrNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.TOYOTA_COMMODITY_NO.name(), tlF2dataResultPo.getToyotaCommodityNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.SUPPLIER_COMMODITY_NO.name(), tlF2dataResultPo.getSupplierCommodityNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CTM_CODE.name(), tlF2dataResultPo.getCtmCode()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CTM_NAME.name(), tlF2dataResultPo.getCtmName()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.TEMP_DECL_NO.name(), tlF2dataResultPo.getTempDeclNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.TEMP_ITEM_NO.name(), tlF2dataResultPo.getTempItemNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.O_DECL_NO.name(), tlF2dataResultPo.getODeclNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.O_ITEM_NO.name(), tlF2dataResultPo.getOItemNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.BOM_CHECK.name(), tlF2dataResultPo.getBomCheck()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.STATUS.name(), tlF2dataResultPo.getStatus()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.CONTROL_NO.name(), tlF2dataResultPo.getControlNo()); 
			dataObject.setValue(TlF2dataResultPo.COLUMNS.LAST_QTY.name(), tlF2dataResultPo.getLastQty()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TlF2dataResultPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TlF2dataResultPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TlF2dataResultPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(TlF2dataResultPo.COLUMNS.TEMP_DECL_NO.name(), po.getTempDeclNo()); 
		sqlWhere.add(TlF2dataResultPo.COLUMNS.TEMP_ITEM_NO.name(), po.getTempItemNo()); 
		sqlWhere.add(TlF2dataResultPo.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		return sqlWhere; 
	} 
 
} 
