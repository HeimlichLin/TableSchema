package com.doc.common.dao.impl; 
 
public class CloudLogDAOImpl extends GeneralDAOImpl<CloudLogPo> implements CloudLogDAO { 
	public static final CloudLogDAOImpl INSTANCE = new CloudLogDAOImpl(); 
	public static final String TABLENAME = "CLOUD_LOG"; 

	public CloudLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CloudLogPo> CONVERTER = new MapConverter<CloudLogPo>() { 
 
		@Override 
		public CloudLogPo convert(final DataObject dataObject) { 
			final CloudLogPo cloudLogPo = new CloudLogPo(); 
			cloudLogPo.setIe(dataObject.getString(CloudLogPo.COLUMNS.IE.name())); 
			cloudLogPo.setWhIo(dataObject.getString(CloudLogPo.COLUMNS.WH_IO.name())); 
			cloudLogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(CloudLogPo.COLUMNS.SN.name()))); 
			cloudLogPo.setLogDate(dataObject.getString(CloudLogPo.COLUMNS.LOG_DATE.name())); 
			cloudLogPo.setHwbBag(dataObject.getString(CloudLogPo.COLUMNS.HWB_BAG.name())); 
			cloudLogPo.setLogType(dataObject.getString(CloudLogPo.COLUMNS.LOG_TYPE.name())); 
			cloudLogPo.setLogStatus(dataObject.getString(CloudLogPo.COLUMNS.LOG_STATUS.name())); 
			cloudLogPo.setLogNote1(dataObject.getString(CloudLogPo.COLUMNS.LOG_NOTE1.name())); 
			cloudLogPo.setLogNote2(dataObject.getString(CloudLogPo.COLUMNS.LOG_NOTE2.name())); 
			cloudLogPo.setSortNo(BigDecimalUtils.formObj(dataObject.getValue(CloudLogPo.COLUMNS.SORT_NO.name()))); 
			cloudLogPo.setMwb(dataObject.getString(CloudLogPo.COLUMNS.MWB.name())); 
			cloudLogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(CloudLogPo.COLUMNS.CRT_DATE.name()))); 
			return cloudLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CloudLogPo cloudLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CloudLogPo.COLUMNS.IE.name(), cloudLogPo.getIe()); 
			dataObject.setValue(CloudLogPo.COLUMNS.WH_IO.name(), cloudLogPo.getWhIo()); 
			dataObject.setValue(CloudLogPo.COLUMNS.SN.name(), cloudLogPo.getSn()); 
			dataObject.setValue(CloudLogPo.COLUMNS.LOG_DATE.name(), cloudLogPo.getLogDate()); 
			dataObject.setValue(CloudLogPo.COLUMNS.HWB_BAG.name(), cloudLogPo.getHwbBag()); 
			dataObject.setValue(CloudLogPo.COLUMNS.LOG_TYPE.name(), cloudLogPo.getLogType()); 
			dataObject.setValue(CloudLogPo.COLUMNS.LOG_STATUS.name(), cloudLogPo.getLogStatus()); 
			dataObject.setValue(CloudLogPo.COLUMNS.LOG_NOTE1.name(), cloudLogPo.getLogNote1()); 
			dataObject.setValue(CloudLogPo.COLUMNS.LOG_NOTE2.name(), cloudLogPo.getLogNote2()); 
			dataObject.setValue(CloudLogPo.COLUMNS.SORT_NO.name(), cloudLogPo.getSortNo()); 
			dataObject.setValue(CloudLogPo.COLUMNS.MWB.name(), cloudLogPo.getMwb()); 
			dataObject.setValue(CloudLogPo.COLUMNS.CRT_DATE.name(), cloudLogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CloudLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CloudLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
