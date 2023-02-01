package com.doc.common.dao.impl; 
 
public class SchedulerProgramArgsTblDAOImpl extends GeneralDAOImpl<SchedulerProgramArgsTblPo> implements ISchedulerProgramArgsTblDAO { 
	public static final SchedulerProgramArgsTblDAOImpl INSTANCE = new SchedulerProgramArgsTblDAOImpl(); 
	public static final String TABLENAME = "SCHEDULER_PROGRAM_ARGS_TBL"; 

	public SchedulerProgramArgsTblDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SchedulerProgramArgsTblPo> CONVERTER = new MapConverter<SchedulerProgramArgsTblPo>() { 
 
		@Override 
		public SchedulerProgramArgsTblPo convert(final DataObject dataObject) { 
			final SchedulerProgramArgsTblPo schedulerProgramArgsTblPo = new SchedulerProgramArgsTblPo(); 
			schedulerProgramArgsTblPo.setOwner(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.OWNER.name())); 
			schedulerProgramArgsTblPo.setProgramName(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.PROGRAM_NAME.name())); 
			schedulerProgramArgsTblPo.setArgumentName(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_NAME.name())); 
			schedulerProgramArgsTblPo.setArgumentPosition(BigDecimalUtils.formObj(dataObject.getValue(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_POSITION.name()))); 
			schedulerProgramArgsTblPo.setArgumentType(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_TYPE.name())); 
			schedulerProgramArgsTblPo.setMetadataAttribute(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.METADATA_ATTRIBUTE.name())); 
			schedulerProgramArgsTblPo.setDefaultValue(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.DEFAULT_VALUE.name())); 
			schedulerProgramArgsTblPo.setDefaultAnydataValue(); 
			schedulerProgramArgsTblPo.setOutArgument(dataObject.getString(SchedulerProgramArgsTblPo.COLUMNS.OUT_ARGUMENT.name())); 
			return schedulerProgramArgsTblPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SchedulerProgramArgsTblPo schedulerProgramArgsTblPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.OWNER.name(), schedulerProgramArgsTblPo.getOwner()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.PROGRAM_NAME.name(), schedulerProgramArgsTblPo.getProgramName()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_NAME.name(), schedulerProgramArgsTblPo.getArgumentName()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_POSITION.name(), schedulerProgramArgsTblPo.getArgumentPosition()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.ARGUMENT_TYPE.name(), schedulerProgramArgsTblPo.getArgumentType()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.METADATA_ATTRIBUTE.name(), schedulerProgramArgsTblPo.getMetadataAttribute()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.DEFAULT_VALUE.name(), schedulerProgramArgsTblPo.getDefaultValue()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.DEFAULT_ANYDATA_VALUE.name(), schedulerProgramArgsTblPo.getDefaultAnydataValue()); 
			dataObject.setValue(SchedulerProgramArgsTblPo.COLUMNS.OUT_ARGUMENT.name(), schedulerProgramArgsTblPo.getOutArgument()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SchedulerProgramArgsTblPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SchedulerProgramArgsTblPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
