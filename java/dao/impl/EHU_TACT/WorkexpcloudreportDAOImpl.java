package com.doc.common.dao.impl; 
 
public class WorkexpcloudreportDAOImpl extends GeneralDAOImpl<WorkexpcloudreportPo> implements WorkexpcloudreportDAO { 
	public static final WorkexpcloudreportDAOImpl INSTANCE = new WorkexpcloudreportDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDREPORT"; 

	public WorkexpcloudreportDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudreportPo> CONVERTER = new MapConverter<WorkexpcloudreportPo>() { 
 
		@Override 
		public WorkexpcloudreportPo convert(final DataObject dataObject) { 
			final WorkexpcloudreportPo workexpcloudreportPo = new WorkexpcloudreportPo(); 
			workexpcloudreportPo.setTid(dataObject.getString(WorkexpcloudreportPo.COLUMNS.TID.name())); 
			workexpcloudreportPo.setMwb(dataObject.getString(WorkexpcloudreportPo.COLUMNS.MWB.name())); 
			workexpcloudreportPo.setHwb(dataObject.getString(WorkexpcloudreportPo.COLUMNS.HWB.name())); 
			workexpcloudreportPo.setDeclno(dataObject.getString(WorkexpcloudreportPo.COLUMNS.DECLNO.name())); 
			workexpcloudreportPo.setShowhwb(dataObject.getString(WorkexpcloudreportPo.COLUMNS.SHOWHWB.name())); 
			workexpcloudreportPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpcloudreportPo.COLUMNS.LASTUPDATE.name()))); 
			return workexpcloudreportPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudreportPo workexpcloudreportPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.TID.name(), workexpcloudreportPo.getTid()); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.MWB.name(), workexpcloudreportPo.getMwb()); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.HWB.name(), workexpcloudreportPo.getHwb()); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.DECLNO.name(), workexpcloudreportPo.getDeclno()); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.SHOWHWB.name(), workexpcloudreportPo.getShowhwb()); 
			dataObject.setValue(WorkexpcloudreportPo.COLUMNS.LASTUPDATE.name(), workexpcloudreportPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudreportPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudreportPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
