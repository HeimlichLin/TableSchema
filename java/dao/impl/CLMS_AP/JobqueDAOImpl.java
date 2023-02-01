package com.doc.common.dao.impl; 
 
public class JobqueDAOImpl extends GeneralDAOImpl<JobquePo> implements JobqueDAO { 
	public static final JobqueDAOImpl INSTANCE = new JobqueDAOImpl(); 
	public static final String TABLENAME = "JOBQUE"; 

	public JobqueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<JobquePo> CONVERTER = new MapConverter<JobquePo>() { 
 
		@Override 
		public JobquePo convert(final DataObject dataObject) { 
			final JobquePo jobquePo = new JobquePo(); 
			jobquePo.setTranactionId(dataObject.getString(JobquePo.COLUMNS.TRANACTION_ID.name())); 
			jobquePo.setJobId(dataObject.getString(JobquePo.COLUMNS.JOB_ID.name())); 
			jobquePo.setCreateTime(dataObject.getString(JobquePo.COLUMNS.CREATE_TIME.name())); 
			jobquePo.setExecuteTime(dataObject.getString(JobquePo.COLUMNS.EXECUTE_TIME.name())); 
			jobquePo.setMessage(dataObject.getString(JobquePo.COLUMNS.MESSAGE.name())); 
			jobquePo.setStauts(dataObject.getString(JobquePo.COLUMNS.STAUTS.name())); 
			return jobquePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final JobquePo jobquePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(JobquePo.COLUMNS.TRANACTION_ID.name(), jobquePo.getTranactionId()); 
			dataObject.setValue(JobquePo.COLUMNS.JOB_ID.name(), jobquePo.getJobId()); 
			dataObject.setValue(JobquePo.COLUMNS.CREATE_TIME.name(), jobquePo.getCreateTime()); 
			dataObject.setValue(JobquePo.COLUMNS.EXECUTE_TIME.name(), jobquePo.getExecuteTime()); 
			dataObject.setValue(JobquePo.COLUMNS.MESSAGE.name(), jobquePo.getMessage()); 
			dataObject.setValue(JobquePo.COLUMNS.STAUTS.name(), jobquePo.getStauts()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<JobquePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(JobquePo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(JobquePo.COLUMNS.TRANACTION_ID.name(), po.getTranactionId()); 
		return sqlWhere; 
	} 
 
} 
