package com.doc.common.dao.impl; 
 
public class WorkimpcnclrelDAOImpl extends GeneralDAOImpl<WorkimpcnclrelPo> implements WorkimpcnclrelDAO { 
	public static final WorkimpcnclrelDAOImpl INSTANCE = new WorkimpcnclrelDAOImpl(); 
	public static final String TABLENAME = "WORKIMPCNCLREL"; 

	public WorkimpcnclrelDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpcnclrelPo> CONVERTER = new MapConverter<WorkimpcnclrelPo>() { 
 
		@Override 
		public WorkimpcnclrelPo convert(final DataObject dataObject) { 
			final WorkimpcnclrelPo workimpcnclrelPo = new WorkimpcnclrelPo(); 
			workimpcnclrelPo.setHwb(dataObject.getString(WorkimpcnclrelPo.COLUMNS.HWB.name())); 
			workimpcnclrelPo.setMwb(dataObject.getString(WorkimpcnclrelPo.COLUMNS.MWB.name())); 
			workimpcnclrelPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(WorkimpcnclrelPo.COLUMNS.SERIALNO.name()))); 
			workimpcnclrelPo.setLogdate(TimestampUtils.of(dataObject.getValue(WorkimpcnclrelPo.COLUMNS.LOGDATE.name()))); 
			workimpcnclrelPo.setMark(dataObject.getString(WorkimpcnclrelPo.COLUMNS.MARK.name())); 
			workimpcnclrelPo.setOrigcodate(TimestampUtils.of(dataObject.getValue(WorkimpcnclrelPo.COLUMNS.ORIGCODATE.name()))); 
			return workimpcnclrelPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpcnclrelPo workimpcnclrelPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.HWB.name(), workimpcnclrelPo.getHwb()); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.MWB.name(), workimpcnclrelPo.getMwb()); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.SERIALNO.name(), workimpcnclrelPo.getSerialno()); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.LOGDATE.name(), workimpcnclrelPo.getLogdate()); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.MARK.name(), workimpcnclrelPo.getMark()); 
			dataObject.setValue(WorkimpcnclrelPo.COLUMNS.ORIGCODATE.name(), workimpcnclrelPo.getOrigcodate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpcnclrelPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpcnclrelPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
