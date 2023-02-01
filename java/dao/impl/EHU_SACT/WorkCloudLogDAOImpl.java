package com.doc.common.dao.impl; 
 
public class WorkCloudLogDAOImpl extends GeneralDAOImpl<WorkCloudLogPo> implements WorkCloudLogDAO { 
	public static final WorkCloudLogDAOImpl INSTANCE = new WorkCloudLogDAOImpl(); 
	public static final String TABLENAME = "WORK_CLOUD_LOG"; 

	public WorkCloudLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkCloudLogPo> CONVERTER = new MapConverter<WorkCloudLogPo>() { 
 
		@Override 
		public WorkCloudLogPo convert(final DataObject dataObject) { 
			final WorkCloudLogPo workCloudLogPo = new WorkCloudLogPo(); 
			workCloudLogPo.setIe(dataObject.getString(WorkCloudLogPo.COLUMNS.IE.name())); 
			workCloudLogPo.setWhIo(dataObject.getString(WorkCloudLogPo.COLUMNS.WH_IO.name())); 
			workCloudLogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(WorkCloudLogPo.COLUMNS.SN.name()))); 
			workCloudLogPo.setLogDate(dataObject.getString(WorkCloudLogPo.COLUMNS.LOG_DATE.name())); 
			workCloudLogPo.setHwbBag(dataObject.getString(WorkCloudLogPo.COLUMNS.HWB_BAG.name())); 
			workCloudLogPo.setMwb(dataObject.getString(WorkCloudLogPo.COLUMNS.MWB.name())); 
			workCloudLogPo.setLogType(dataObject.getString(WorkCloudLogPo.COLUMNS.LOG_TYPE.name())); 
			workCloudLogPo.setLogStatus(dataObject.getString(WorkCloudLogPo.COLUMNS.LOG_STATUS.name())); 
			workCloudLogPo.setLogNote1(dataObject.getString(WorkCloudLogPo.COLUMNS.LOG_NOTE1.name())); 
			workCloudLogPo.setLogNote2(dataObject.getString(WorkCloudLogPo.COLUMNS.LOG_NOTE2.name())); 
			workCloudLogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(WorkCloudLogPo.COLUMNS.CRT_DATE.name()))); 
			return workCloudLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkCloudLogPo workCloudLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.IE.name(), workCloudLogPo.getIe()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.WH_IO.name(), workCloudLogPo.getWhIo()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.SN.name(), workCloudLogPo.getSn()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.LOG_DATE.name(), workCloudLogPo.getLogDate()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.HWB_BAG.name(), workCloudLogPo.getHwbBag()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.MWB.name(), workCloudLogPo.getMwb()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.LOG_TYPE.name(), workCloudLogPo.getLogType()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.LOG_STATUS.name(), workCloudLogPo.getLogStatus()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.LOG_NOTE1.name(), workCloudLogPo.getLogNote1()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.LOG_NOTE2.name(), workCloudLogPo.getLogNote2()); 
			dataObject.setValue(WorkCloudLogPo.COLUMNS.CRT_DATE.name(), workCloudLogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkCloudLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkCloudLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
