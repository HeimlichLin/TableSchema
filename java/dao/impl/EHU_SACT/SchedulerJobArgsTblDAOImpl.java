package com.doc.common.dao.impl; 
 
public class SchedulerJobArgsTblDAOImpl extends GeneralDAOImpl<SchedulerJobArgsTblPo> implements ISchedulerJobArgsTblDAO { 
	public static final SchedulerJobArgsTblDAOImpl INSTANCE = new SchedulerJobArgsTblDAOImpl(); 
	public static final String TABLENAME = "SCHEDULER_JOB_ARGS_TBL"; 

	public SchedulerJobArgsTblDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SchedulerJobArgsTblPo> CONVERTER = new MapConverter<SchedulerJobArgsTblPo>() { 
 
		@Override 
		public SchedulerJobArgsTblPo convert(final DataObject dataObject) { 
			final SchedulerJobArgsTblPo schedulerJobArgsTblPo = new SchedulerJobArgsTblPo(); 
			schedulerJobArgsTblPo.setOwner(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.OWNER.name())); 
			schedulerJobArgsTblPo.setJobName(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.JOB_NAME.name())); 
			schedulerJobArgsTblPo.setArgumentName(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_NAME.name())); 
			schedulerJobArgsTblPo.setArgumentPosition(BigDecimalUtils.formObj(dataObject.getValue(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_POSITION.name()))); 
			schedulerJobArgsTblPo.setArgumentType(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_TYPE.name())); 
			schedulerJobArgsTblPo.setValue(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.VALUE.name())); 
			schedulerJobArgsTblPo.setAnydataValue(); 
			schedulerJobArgsTblPo.setOutArgument(dataObject.getString(SchedulerJobArgsTblPo.COLUMNS.OUT_ARGUMENT.name())); 
			return schedulerJobArgsTblPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SchedulerJobArgsTblPo schedulerJobArgsTblPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.OWNER.name(), schedulerJobArgsTblPo.getOwner()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.JOB_NAME.name(), schedulerJobArgsTblPo.getJobName()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_NAME.name(), schedulerJobArgsTblPo.getArgumentName()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_POSITION.name(), schedulerJobArgsTblPo.getArgumentPosition()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.ARGUMENT_TYPE.name(), schedulerJobArgsTblPo.getArgumentType()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.VALUE.name(), schedulerJobArgsTblPo.getValue()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.ANYDATA_VALUE.name(), schedulerJobArgsTblPo.getAnydataValue()); 
			dataObject.setValue(SchedulerJobArgsTblPo.COLUMNS.OUT_ARGUMENT.name(), schedulerJobArgsTblPo.getOutArgument()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SchedulerJobArgsTblPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SchedulerJobArgsTblPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
