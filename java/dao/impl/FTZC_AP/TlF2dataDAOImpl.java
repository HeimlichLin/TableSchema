package com.doc.common.dao.impl; 
 
public class TlF2dataDAOImpl extends GeneralDAOImpl<TlF2dataPo> implements TlF2dataDAO { 
	public static final TlF2dataDAOImpl INSTANCE = new TlF2dataDAOImpl(); 
	public static final String TABLENAME = "TL_F2DATA"; 

	public TlF2dataDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TlF2dataPo> CONVERTER = new MapConverter<TlF2dataPo>() { 
 
		@Override 
		public TlF2dataPo convert(final DataObject dataObject) { 
			final TlF2dataPo tlF2dataPo = new TlF2dataPo(); 
			tlF2dataPo.setBfNo(dataObject.getString(TlF2dataPo.COLUMNS.BF_NO.name())); 
			tlF2dataPo.setInvoiceNo(dataObject.getString(TlF2dataPo.COLUMNS.INVOICE_NO.name())); 
			tlF2dataPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.SERIAL_NO.name()))); 
			tlF2dataPo.setCommodityNo(dataObject.getString(TlF2dataPo.COLUMNS.COMMODITY_NO.name())); 
			tlF2dataPo.setCustomsCommodityNo(dataObject.getString(TlF2dataPo.COLUMNS.CUSTOMS_COMMODITY_NO.name())); 
			tlF2dataPo.setDescrip(dataObject.getString(TlF2dataPo.COLUMNS.DESCRIP.name())); 
			tlF2dataPo.setUnitPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.UNIT_PRICE.name()))); 
			tlF2dataPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.QTY.name()))); 
			tlF2dataPo.setUnit(dataObject.getString(TlF2dataPo.COLUMNS.UNIT.name())); 
			tlF2dataPo.setAmtPrice(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.AMT_PRICE.name()))); 
			tlF2dataPo.setCccCode(dataObject.getString(TlF2dataPo.COLUMNS.CCC_CODE.name())); 
			tlF2dataPo.setDutyRate(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.DUTY_RATE.name()))); 
			tlF2dataPo.setNetWgt(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataPo.COLUMNS.NET_WGT.name()))); 
			tlF2dataPo.setContrNo(dataObject.getString(TlF2dataPo.COLUMNS.CONTR_NO.name())); 
			tlF2dataPo.setToyotaCommodityNo(dataObject.getString(TlF2dataPo.COLUMNS.TOYOTA_COMMODITY_NO.name())); 
			tlF2dataPo.setSupplierCommodityNo(dataObject.getString(TlF2dataPo.COLUMNS.SUPPLIER_COMMODITY_NO.name())); 
			tlF2dataPo.setCtmCode(dataObject.getString(TlF2dataPo.COLUMNS.CTM_CODE.name())); 
			tlF2dataPo.setCtmName(dataObject.getString(TlF2dataPo.COLUMNS.CTM_NAME.name())); 
			tlF2dataPo.setODeclNo(dataObject.getString(TlF2dataPo.COLUMNS.O_DECL_NO.name())); 
			tlF2dataPo.setControlNo(dataObject.getString(TlF2dataPo.COLUMNS.CONTROL_NO.name())); 
			return tlF2dataPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TlF2dataPo tlF2dataPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TlF2dataPo.COLUMNS.BF_NO.name(), tlF2dataPo.getBfNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.INVOICE_NO.name(), tlF2dataPo.getInvoiceNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.SERIAL_NO.name(), tlF2dataPo.getSerialNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.COMMODITY_NO.name(), tlF2dataPo.getCommodityNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CUSTOMS_COMMODITY_NO.name(), tlF2dataPo.getCustomsCommodityNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.DESCRIP.name(), tlF2dataPo.getDescrip()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.UNIT_PRICE.name(), tlF2dataPo.getUnitPrice()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.QTY.name(), tlF2dataPo.getQty()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.UNIT.name(), tlF2dataPo.getUnit()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.AMT_PRICE.name(), tlF2dataPo.getAmtPrice()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CCC_CODE.name(), tlF2dataPo.getCccCode()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.DUTY_RATE.name(), tlF2dataPo.getDutyRate()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.NET_WGT.name(), tlF2dataPo.getNetWgt()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CONTR_NO.name(), tlF2dataPo.getContrNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.TOYOTA_COMMODITY_NO.name(), tlF2dataPo.getToyotaCommodityNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.SUPPLIER_COMMODITY_NO.name(), tlF2dataPo.getSupplierCommodityNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CTM_CODE.name(), tlF2dataPo.getCtmCode()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CTM_NAME.name(), tlF2dataPo.getCtmName()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.O_DECL_NO.name(), tlF2dataPo.getODeclNo()); 
			dataObject.setValue(TlF2dataPo.COLUMNS.CONTROL_NO.name(), tlF2dataPo.getControlNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TlF2dataPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TlF2dataPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(TlF2dataPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.INVOICE_NO.name(), po.getInvoiceNo()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.SERIAL_NO.name(), po.getSerialNo()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.COMMODITY_NO.name(), po.getCommodityNo()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.CUSTOMS_COMMODITY_NO.name(), po.getCustomsCommodityNo()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.QTY.name(), po.getQty()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.CTM_CODE.name(), po.getCtmCode()); 
		sqlWhere.add(TlF2dataPo.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		return sqlWhere; 
	} 
 
} 
