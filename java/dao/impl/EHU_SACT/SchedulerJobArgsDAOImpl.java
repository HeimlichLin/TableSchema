package com.doc.common.dao.impl; 
 
public class SchedulerJobArgsDAOImpl extends GeneralDAOImpl<SchedulerJobArgsPo> implements ISchedulerJobArgsDAO { 
	public static final SchedulerJobArgsDAOImpl INSTANCE = new SchedulerJobArgsDAOImpl(); 
	public static final String TABLENAME = "SCHEDULER_JOB_ARGS"; 

	public SchedulerJobArgsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SchedulerJobArgsPo> CONVERTER = new MapConverter<SchedulerJobArgsPo>() { 
 
		@Override 
		public SchedulerJobArgsPo convert(final DataObject dataObject) { 
			final SchedulerJobArgsPo schedulerJobArgsPo = new SchedulerJobArgsPo(); 
			return schedulerJobArgsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SchedulerJobArgsPo schedulerJobArgsPo) { 
			final DataObject dataObject = new DataObject(); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SchedulerJobArgsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SchedulerJobArgsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
