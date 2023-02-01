package com.doc.common.dao.impl; 
 
public class CloudLogOldDAOImpl extends GeneralDAOImpl<CloudLogOldPo> implements CloudLogOldDAO { 
	public static final CloudLogOldDAOImpl INSTANCE = new CloudLogOldDAOImpl(); 
	public static final String TABLENAME = "CLOUD_LOG_OLD"; 

	public CloudLogOldDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CloudLogOldPo> CONVERTER = new MapConverter<CloudLogOldPo>() { 
 
		@Override 
		public CloudLogOldPo convert(final DataObject dataObject) { 
			final CloudLogOldPo cloudLogOldPo = new CloudLogOldPo(); 
			cloudLogOldPo.setIe(dataObject.getString(CloudLogOldPo.COLUMNS.IE.name())); 
			cloudLogOldPo.setWhIo(dataObject.getString(CloudLogOldPo.COLUMNS.WH_IO.name())); 
			cloudLogOldPo.setLogDate(dataObject.getString(CloudLogOldPo.COLUMNS.LOG_DATE.name())); 
			cloudLogOldPo.setHwbBag(dataObject.getString(CloudLogOldPo.COLUMNS.HWB_BAG.name())); 
			cloudLogOldPo.setLogType(dataObject.getString(CloudLogOldPo.COLUMNS.LOG_TYPE.name())); 
			cloudLogOldPo.setLogStatus(dataObject.getString(CloudLogOldPo.COLUMNS.LOG_STATUS.name())); 
			cloudLogOldPo.setLogNote1(dataObject.getString(CloudLogOldPo.COLUMNS.LOG_NOTE1.name())); 
			cloudLogOldPo.setLogNote2(dataObject.getString(CloudLogOldPo.COLUMNS.LOG_NOTE2.name())); 
			cloudLogOldPo.setSortNo(BigDecimalUtils.formObj(dataObject.getValue(CloudLogOldPo.COLUMNS.SORT_NO.name()))); 
			cloudLogOldPo.setMwb(dataObject.getString(CloudLogOldPo.COLUMNS.MWB.name())); 
			cloudLogOldPo.setCrtDate(TimestampUtils.of(dataObject.getValue(CloudLogOldPo.COLUMNS.CRT_DATE.name()))); 
			return cloudLogOldPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CloudLogOldPo cloudLogOldPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.IE.name(), cloudLogOldPo.getIe()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.WH_IO.name(), cloudLogOldPo.getWhIo()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.LOG_DATE.name(), cloudLogOldPo.getLogDate()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.HWB_BAG.name(), cloudLogOldPo.getHwbBag()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.LOG_TYPE.name(), cloudLogOldPo.getLogType()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.LOG_STATUS.name(), cloudLogOldPo.getLogStatus()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.LOG_NOTE1.name(), cloudLogOldPo.getLogNote1()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.LOG_NOTE2.name(), cloudLogOldPo.getLogNote2()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.SORT_NO.name(), cloudLogOldPo.getSortNo()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.MWB.name(), cloudLogOldPo.getMwb()); 
			dataObject.setValue(CloudLogOldPo.COLUMNS.CRT_DATE.name(), cloudLogOldPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CloudLogOldPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CloudLogOldPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
