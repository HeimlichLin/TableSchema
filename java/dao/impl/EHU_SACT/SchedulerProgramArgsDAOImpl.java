package com.doc.common.dao.impl; 
 
public class SchedulerProgramArgsDAOImpl extends GeneralDAOImpl<SchedulerProgramArgsPo> implements ISchedulerProgramArgsDAO { 
	public static final SchedulerProgramArgsDAOImpl INSTANCE = new SchedulerProgramArgsDAOImpl(); 
	public static final String TABLENAME = "SCHEDULER_PROGRAM_ARGS"; 

	public SchedulerProgramArgsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SchedulerProgramArgsPo> CONVERTER = new MapConverter<SchedulerProgramArgsPo>() { 
 
		@Override 
		public SchedulerProgramArgsPo convert(final DataObject dataObject) { 
			final SchedulerProgramArgsPo schedulerProgramArgsPo = new SchedulerProgramArgsPo(); 
			return schedulerProgramArgsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SchedulerProgramArgsPo schedulerProgramArgsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SchedulerProgramArgsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SchedulerProgramArgsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
