package com.doc.common.dao.impl; 
 
public class Aq$QueuesDAOImpl extends GeneralDAOImpl<Aq$QueuesPo> implements IAq$QueuesDAO { 
	public static final Aq$QueuesDAOImpl INSTANCE = new Aq$QueuesDAOImpl(); 
	public static final String TABLENAME = "AQ$_QUEUES"; 

	public Aq$QueuesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$QueuesPo> CONVERTER = new MapConverter<Aq$QueuesPo>() { 
 
		@Override 
		public Aq$QueuesPo convert(final DataObject dataObject) { 
			final Aq$QueuesPo aq$QueuesPo = new Aq$QueuesPo(); 
			aq$QueuesPo.setOid(); 
			aq$QueuesPo.setEventid(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.EVENTID.name()))); 
			aq$QueuesPo.setName(dataObject.getString(Aq$QueuesPo.COLUMNS.NAME.name())); 
			aq$QueuesPo.setTableObjno(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.TABLE_OBJNO.name()))); 
			aq$QueuesPo.setUsage(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.USAGE.name()))); 
			aq$QueuesPo.setEnableFlag(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.ENABLE_FLAG.name()))); 
			aq$QueuesPo.setMaxRetries(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.MAX_RETRIES.name()))); 
			aq$QueuesPo.setRetryDelay(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.RETRY_DELAY.name()))); 
			aq$QueuesPo.setProperties(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.PROPERTIES.name()))); 
			aq$QueuesPo.setRetTime(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.RET_TIME.name()))); 
			aq$QueuesPo.setQueueComment(dataObject.getString(Aq$QueuesPo.COLUMNS.QUEUE_COMMENT.name())); 
			aq$QueuesPo.setSubscribers(); 
			aq$QueuesPo.setMemoryThreshold(BigDecimalUtils.formObj(dataObject.getValue(Aq$QueuesPo.COLUMNS.MEMORY_THRESHOLD.name()))); 
			aq$QueuesPo.setServiceName(dataObject.getString(Aq$QueuesPo.COLUMNS.SERVICE_NAME.name())); 
			aq$QueuesPo.setNetworkName(dataObject.getString(Aq$QueuesPo.COLUMNS.NETWORK_NAME.name())); 
			return aq$QueuesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$QueuesPo aq$QueuesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.OID.name(), aq$QueuesPo.getOid()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.EVENTID.name(), aq$QueuesPo.getEventid()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.NAME.name(), aq$QueuesPo.getName()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.TABLE_OBJNO.name(), aq$QueuesPo.getTableObjno()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.USAGE.name(), aq$QueuesPo.getUsage()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.ENABLE_FLAG.name(), aq$QueuesPo.getEnableFlag()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.MAX_RETRIES.name(), aq$QueuesPo.getMaxRetries()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.RETRY_DELAY.name(), aq$QueuesPo.getRetryDelay()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.PROPERTIES.name(), aq$QueuesPo.getProperties()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.RET_TIME.name(), aq$QueuesPo.getRetTime()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.QUEUE_COMMENT.name(), aq$QueuesPo.getQueueComment()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.SUBSCRIBERS.name(), aq$QueuesPo.getSubscribers()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.MEMORY_THRESHOLD.name(), aq$QueuesPo.getMemoryThreshold()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.SERVICE_NAME.name(), aq$QueuesPo.getServiceName()); 
			dataObject.setValue(Aq$QueuesPo.COLUMNS.NETWORK_NAME.name(), aq$QueuesPo.getNetworkName()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$QueuesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$QueuesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Aq$QueuesPo.COLUMNS.OID.name(), po.getOid()); 
		sqlWhere.add(Aq$QueuesPo.COLUMNS.NAME.name(), po.getName()); 
		sqlWhere.add(Aq$QueuesPo.COLUMNS.TABLE_OBJNO.name(), po.getTableObjno()); 
		return sqlWhere; 
	} 
 
} 
