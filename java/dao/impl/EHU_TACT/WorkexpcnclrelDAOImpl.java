package com.doc.common.dao.impl; 
 
public class WorkexpcnclrelDAOImpl extends GeneralDAOImpl<WorkexpcnclrelPo> implements WorkexpcnclrelDAO { 
	public static final WorkexpcnclrelDAOImpl INSTANCE = new WorkexpcnclrelDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCNCLREL"; 

	public WorkexpcnclrelDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcnclrelPo> CONVERTER = new MapConverter<WorkexpcnclrelPo>() { 
 
		@Override 
		public WorkexpcnclrelPo convert(final DataObject dataObject) { 
			final WorkexpcnclrelPo workexpcnclrelPo = new WorkexpcnclrelPo(); 
			workexpcnclrelPo.setHwb(dataObject.getString(WorkexpcnclrelPo.COLUMNS.HWB.name())); 
			workexpcnclrelPo.setMwb(dataObject.getString(WorkexpcnclrelPo.COLUMNS.MWB.name())); 
			workexpcnclrelPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcnclrelPo.COLUMNS.SERIALNO.name()))); 
			workexpcnclrelPo.setLogdate(TimestampUtils.of(dataObject.getValue(WorkexpcnclrelPo.COLUMNS.LOGDATE.name()))); 
			workexpcnclrelPo.setMark(dataObject.getString(WorkexpcnclrelPo.COLUMNS.MARK.name())); 
			workexpcnclrelPo.setOrigcodate(TimestampUtils.of(dataObject.getValue(WorkexpcnclrelPo.COLUMNS.ORIGCODATE.name()))); 
			return workexpcnclrelPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcnclrelPo workexpcnclrelPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.HWB.name(), workexpcnclrelPo.getHwb()); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.MWB.name(), workexpcnclrelPo.getMwb()); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.SERIALNO.name(), workexpcnclrelPo.getSerialno()); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.LOGDATE.name(), workexpcnclrelPo.getLogdate()); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.MARK.name(), workexpcnclrelPo.getMark()); 
			dataObject.setValue(WorkexpcnclrelPo.COLUMNS.ORIGCODATE.name(), workexpcnclrelPo.getOrigcodate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcnclrelPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcnclrelPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
