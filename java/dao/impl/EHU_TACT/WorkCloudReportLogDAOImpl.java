package com.doc.common.dao.impl; 
 
public class WorkCloudReportLogDAOImpl extends GeneralDAOImpl<WorkCloudReportLogPo> implements WorkCloudReportLogDAO { 
	public static final WorkCloudReportLogDAOImpl INSTANCE = new WorkCloudReportLogDAOImpl(); 
	public static final String TABLENAME = "WORK_CLOUD_REPORT_LOG"; 

	public WorkCloudReportLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkCloudReportLogPo> CONVERTER = new MapConverter<WorkCloudReportLogPo>() { 
 
		@Override 
		public WorkCloudReportLogPo convert(final DataObject dataObject) { 
			final WorkCloudReportLogPo workCloudReportLogPo = new WorkCloudReportLogPo(); 
			workCloudReportLogPo.setIe(dataObject.getString(WorkCloudReportLogPo.COLUMNS.IE.name())); 
			workCloudReportLogPo.setWhIo(dataObject.getString(WorkCloudReportLogPo.COLUMNS.WH_IO.name())); 
			workCloudReportLogPo.setSn(BigDecimalUtils.formObj(dataObject.getValue(WorkCloudReportLogPo.COLUMNS.SN.name()))); 
			workCloudReportLogPo.setLogdate(dataObject.getString(WorkCloudReportLogPo.COLUMNS.LOGDATE.name())); 
			workCloudReportLogPo.setMwb(dataObject.getString(WorkCloudReportLogPo.COLUMNS.MWB.name())); 
			workCloudReportLogPo.setHwb(dataObject.getString(WorkCloudReportLogPo.COLUMNS.HWB.name())); 
			workCloudReportLogPo.setEhustarttime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.EHUSTARTTIME.name())); 
			workCloudReportLogPo.setRdweightstarttime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.RDWEIGHTSTARTTIME.name())); 
			workCloudReportLogPo.setRdweightendtime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.RDWEIGHTENDTIME.name())); 
			workCloudReportLogPo.setSignstarttime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.SIGNSTARTTIME.name())); 
			workCloudReportLogPo.setSendwstime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.SENDWSTIME.name())); 
			workCloudReportLogPo.setReceivewstime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.RECEIVEWSTIME.name())); 
			workCloudReportLogPo.setReaddbtime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.READDBTIME.name())); 
			workCloudReportLogPo.setPrnbarcodestime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.PRNBARCODESTIME.name())); 
			workCloudReportLogPo.setPrnbarcodeetime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.PRNBARCODEETIME.name())); 
			workCloudReportLogPo.setEhuclosetime(dataObject.getString(WorkCloudReportLogPo.COLUMNS.EHUCLOSETIME.name())); 
			workCloudReportLogPo.setClearancetype(dataObject.getString(WorkCloudReportLogPo.COLUMNS.CLEARANCETYPE.name())); 
			workCloudReportLogPo.setReplytype(dataObject.getString(WorkCloudReportLogPo.COLUMNS.REPLYTYPE.name())); 
			workCloudReportLogPo.setCrtDate(TimestampUtils.of(dataObject.getValue(WorkCloudReportLogPo.COLUMNS.CRT_DATE.name()))); 
			return workCloudReportLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkCloudReportLogPo workCloudReportLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.IE.name(), workCloudReportLogPo.getIe()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.WH_IO.name(), workCloudReportLogPo.getWhIo()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.SN.name(), workCloudReportLogPo.getSn()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.LOGDATE.name(), workCloudReportLogPo.getLogdate()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.MWB.name(), workCloudReportLogPo.getMwb()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.HWB.name(), workCloudReportLogPo.getHwb()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.EHUSTARTTIME.name(), workCloudReportLogPo.getEhustarttime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.RDWEIGHTSTARTTIME.name(), workCloudReportLogPo.getRdweightstarttime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.RDWEIGHTENDTIME.name(), workCloudReportLogPo.getRdweightendtime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.SIGNSTARTTIME.name(), workCloudReportLogPo.getSignstarttime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.SENDWSTIME.name(), workCloudReportLogPo.getSendwstime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.RECEIVEWSTIME.name(), workCloudReportLogPo.getReceivewstime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.READDBTIME.name(), workCloudReportLogPo.getReaddbtime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.PRNBARCODESTIME.name(), workCloudReportLogPo.getPrnbarcodestime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.PRNBARCODEETIME.name(), workCloudReportLogPo.getPrnbarcodeetime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.EHUCLOSETIME.name(), workCloudReportLogPo.getEhuclosetime()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.CLEARANCETYPE.name(), workCloudReportLogPo.getClearancetype()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.REPLYTYPE.name(), workCloudReportLogPo.getReplytype()); 
			dataObject.setValue(WorkCloudReportLogPo.COLUMNS.CRT_DATE.name(), workCloudReportLogPo.getCrtDate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkCloudReportLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkCloudReportLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
