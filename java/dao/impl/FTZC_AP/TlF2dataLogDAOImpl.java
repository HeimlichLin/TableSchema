package com.doc.common.dao.impl; 
 
public class TlF2dataLogDAOImpl extends GeneralDAOImpl<TlF2dataLogPo> implements TlF2dataLogDAO { 
	public static final TlF2dataLogDAOImpl INSTANCE = new TlF2dataLogDAOImpl(); 
	public static final String TABLENAME = "TL_F2DATA_LOG"; 

	public TlF2dataLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TlF2dataLogPo> CONVERTER = new MapConverter<TlF2dataLogPo>() { 
 
		@Override 
		public TlF2dataLogPo convert(final DataObject dataObject) { 
			final TlF2dataLogPo tlF2dataLogPo = new TlF2dataLogPo(); 
			tlF2dataLogPo.setBfNo(dataObject.getString(TlF2dataLogPo.COLUMNS.BF_NO.name())); 
			tlF2dataLogPo.setControlNo(dataObject.getString(TlF2dataLogPo.COLUMNS.CONTROL_NO.name())); 
			tlF2dataLogPo.setInvoiceNo(dataObject.getString(TlF2dataLogPo.COLUMNS.INVOICE_NO.name())); 
			tlF2dataLogPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.SERIAL_NO.name()))); 
			tlF2dataLogPo.setCommodityNo(dataObject.getString(TlF2dataLogPo.COLUMNS.COMMODITY_NO.name())); 
			tlF2dataLogPo.setCustomsCommodityNo(dataObject.getString(TlF2dataLogPo.COLUMNS.CUSTOMS_COMMODITY_NO.name())); 
			tlF2dataLogPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.QTY.name()))); 
			tlF2dataLogPo.setRF2dataCnt(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.R_F2DATA_CNT.name()))); 
			tlF2dataLogPo.setRTempDeclNo(dataObject.getString(TlF2dataLogPo.COLUMNS.R_TEMP_DECL_NO.name())); 
			tlF2dataLogPo.setTempDeclHead(dataObject.getString(TlF2dataLogPo.COLUMNS.TEMP_DECL_HEAD.name())); 
			tlF2dataLogPo.setItemCnt(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.ITEM_CNT.name()))); 
			tlF2dataLogPo.setCnt(dataObject.getString(TlF2dataLogPo.COLUMNS.CNT.name())); 
			tlF2dataLogPo.setNewbalance(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.NEWBALANCE.name()))); 
			tlF2dataLogPo.setErrmsg(dataObject.getString(TlF2dataLogPo.COLUMNS.ERRMSG.name())); 
			tlF2dataLogPo.setInItemNo(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.IN_ITEM_NO.name()))); 
			tlF2dataLogPo.setGbalance(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.GBALANCE.name()))); 
			tlF2dataLogPo.setOstatus(dataObject.getString(TlF2dataLogPo.COLUMNS.OSTATUS.name())); 
			tlF2dataLogPo.setOlastQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.OLAST_QTY.name()))); 
			tlF2dataLogPo.setIcurrentQty(BigDecimalUtils.formObj(dataObject.getValue(TlF2dataLogPo.COLUMNS.ICURRENT_QTY.name()))); 
			tlF2dataLogPo.setLogTime(dataObject.getString(TlF2dataLogPo.COLUMNS.LOG_TIME.name())); 
			return tlF2dataLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TlF2dataLogPo tlF2dataLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.BF_NO.name(), tlF2dataLogPo.getBfNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.CONTROL_NO.name(), tlF2dataLogPo.getControlNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.INVOICE_NO.name(), tlF2dataLogPo.getInvoiceNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.SERIAL_NO.name(), tlF2dataLogPo.getSerialNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.COMMODITY_NO.name(), tlF2dataLogPo.getCommodityNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.CUSTOMS_COMMODITY_NO.name(), tlF2dataLogPo.getCustomsCommodityNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.QTY.name(), tlF2dataLogPo.getQty()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.R_F2DATA_CNT.name(), tlF2dataLogPo.getRF2dataCnt()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.R_TEMP_DECL_NO.name(), tlF2dataLogPo.getRTempDeclNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.TEMP_DECL_HEAD.name(), tlF2dataLogPo.getTempDeclHead()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.ITEM_CNT.name(), tlF2dataLogPo.getItemCnt()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.CNT.name(), tlF2dataLogPo.getCnt()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.NEWBALANCE.name(), tlF2dataLogPo.getNewbalance()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.ERRMSG.name(), tlF2dataLogPo.getErrmsg()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.IN_ITEM_NO.name(), tlF2dataLogPo.getInItemNo()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.GBALANCE.name(), tlF2dataLogPo.getGbalance()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.OSTATUS.name(), tlF2dataLogPo.getOstatus()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.OLAST_QTY.name(), tlF2dataLogPo.getOlastQty()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.ICURRENT_QTY.name(), tlF2dataLogPo.getIcurrentQty()); 
			dataObject.setValue(TlF2dataLogPo.COLUMNS.LOG_TIME.name(), tlF2dataLogPo.getLogTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TlF2dataLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TlF2dataLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
