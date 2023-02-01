package com.doc.common.dao.impl; 
 
public class TaskLogDAOImpl extends GeneralDAOImpl<TaskLogPo> implements TaskLogDAO { 
	public static final TaskLogDAOImpl INSTANCE = new TaskLogDAOImpl(); 
	public static final String TABLENAME = "TASK_LOG"; 

	public TaskLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TaskLogPo> CONVERTER = new MapConverter<TaskLogPo>() { 
 
		@Override 
		public TaskLogPo convert(final DataObject dataObject) { 
			final TaskLogPo taskLogPo = new TaskLogPo(); 
			taskLogPo.setCode(dataObject.getString(TaskLogPo.COLUMNS.CODE.name())); 
			taskLogPo.setLine(BigDecimalUtils.formObj(dataObject.getValue(TaskLogPo.COLUMNS.LINE.name()))); 
			taskLogPo.setMessage(dataObject.getString(TaskLogPo.COLUMNS.MESSAGE.name())); 
			taskLogPo.setTime(dataObject.getString(TaskLogPo.COLUMNS.TIME.name())); 
			taskLogPo.setPriority(dataObject.getString(TaskLogPo.COLUMNS.PRIORITY.name())); 
			return taskLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TaskLogPo taskLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TaskLogPo.COLUMNS.CODE.name(), taskLogPo.getCode()); 
			dataObject.setValue(TaskLogPo.COLUMNS.LINE.name(), taskLogPo.getLine()); 
			dataObject.setValue(TaskLogPo.COLUMNS.MESSAGE.name(), taskLogPo.getMessage()); 
			dataObject.setValue(TaskLogPo.COLUMNS.TIME.name(), taskLogPo.getTime()); 
			dataObject.setValue(TaskLogPo.COLUMNS.PRIORITY.name(), taskLogPo.getPriority()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TaskLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TaskLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
