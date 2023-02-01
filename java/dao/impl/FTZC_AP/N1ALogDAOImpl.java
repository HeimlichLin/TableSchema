package com.doc.common.dao.impl; 
 
public class N1ALogDAOImpl extends GeneralDAOImpl<N1ALogPo> implements N1ALogDAO { 
	public static final N1ALogDAOImpl INSTANCE = new N1ALogDAOImpl(); 
	public static final String TABLENAME = "N1_A_LOG"; 

	public N1ALogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<N1ALogPo> CONVERTER = new MapConverter<N1ALogPo>() { 
 
		@Override 
		public N1ALogPo convert(final DataObject dataObject) { 
			final N1ALogPo n1ALogPo = new N1ALogPo(); 
			n1ALogPo.setBfNo(dataObject.getString(N1ALogPo.COLUMNS.BF_NO.name())); 
			n1ALogPo.setControlNo(dataObject.getString(N1ALogPo.COLUMNS.CONTROL_NO.name())); 
			n1ALogPo.setVersion(BigDecimalUtils.formObj(dataObject.getValue(N1ALogPo.COLUMNS.VERSION.name()))); 
			n1ALogPo.setSeqNo(BigDecimalUtils.formObj(dataObject.getValue(N1ALogPo.COLUMNS.SEQ_NO.name()))); 
			n1ALogPo.setLogStatus(dataObject.getString(N1ALogPo.COLUMNS.LOG_STATUS.name())); 
			n1ALogPo.setLogRmk(dataObject.getString(N1ALogPo.COLUMNS.LOG_RMK.name())); 
			n1ALogPo.setRecvTime(TimestampUtils.of(dataObject.getValue(N1ALogPo.COLUMNS.RECV_TIME.name()))); 
			n1ALogPo.setRefBillNo(dataObject.getString(N1ALogPo.COLUMNS.REF_BILL_NO.name())); 
			n1ALogPo.setItem(BigDecimalUtils.formObj(dataObject.getValue(N1ALogPo.COLUMNS.ITEM.name()))); 
			n1ALogPo.setOutStorageArea(dataObject.getString(N1ALogPo.COLUMNS.OUT_STORAGE_AREA.name())); 
			return n1ALogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final N1ALogPo n1ALogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(N1ALogPo.COLUMNS.BF_NO.name(), n1ALogPo.getBfNo()); 
			dataObject.setValue(N1ALogPo.COLUMNS.CONTROL_NO.name(), n1ALogPo.getControlNo()); 
			dataObject.setValue(N1ALogPo.COLUMNS.VERSION.name(), n1ALogPo.getVersion()); 
			dataObject.setValue(N1ALogPo.COLUMNS.SEQ_NO.name(), n1ALogPo.getSeqNo()); 
			dataObject.setValue(N1ALogPo.COLUMNS.LOG_STATUS.name(), n1ALogPo.getLogStatus()); 
			dataObject.setValue(N1ALogPo.COLUMNS.LOG_RMK.name(), n1ALogPo.getLogRmk()); 
			dataObject.setValue(N1ALogPo.COLUMNS.RECV_TIME.name(), n1ALogPo.getRecvTime()); 
			dataObject.setValue(N1ALogPo.COLUMNS.REF_BILL_NO.name(), n1ALogPo.getRefBillNo()); 
			dataObject.setValue(N1ALogPo.COLUMNS.ITEM.name(), n1ALogPo.getItem()); 
			dataObject.setValue(N1ALogPo.COLUMNS.OUT_STORAGE_AREA.name(), n1ALogPo.getOutStorageArea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<N1ALogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(N1ALogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
