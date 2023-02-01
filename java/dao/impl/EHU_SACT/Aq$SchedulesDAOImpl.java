package com.doc.common.dao.impl; 
 
public class Aq$SchedulesDAOImpl extends GeneralDAOImpl<Aq$SchedulesPo> implements IAq$SchedulesDAO { 
	public static final Aq$SchedulesDAOImpl INSTANCE = new Aq$SchedulesDAOImpl(); 
	public static final String TABLENAME = "AQ$_SCHEDULES"; 

	public Aq$SchedulesDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Aq$SchedulesPo> CONVERTER = new MapConverter<Aq$SchedulesPo>() { 
 
		@Override 
		public Aq$SchedulesPo convert(final DataObject dataObject) { 
			final Aq$SchedulesPo aq$SchedulesPo = new Aq$SchedulesPo(); 
			aq$SchedulesPo.setOid(); 
			aq$SchedulesPo.setDestination(dataObject.getString(Aq$SchedulesPo.COLUMNS.DESTINATION.name())); 
			aq$SchedulesPo.setStartTime(TimestampUtils.of(dataObject.getValue(Aq$SchedulesPo.COLUMNS.START_TIME.name()))); 
			aq$SchedulesPo.setDuration(dataObject.getString(Aq$SchedulesPo.COLUMNS.DURATION.name())); 
			aq$SchedulesPo.setNextTime(dataObject.getString(Aq$SchedulesPo.COLUMNS.NEXT_TIME.name())); 
			aq$SchedulesPo.setLatency(dataObject.getString(Aq$SchedulesPo.COLUMNS.LATENCY.name())); 
			aq$SchedulesPo.setLastTime(TimestampUtils.of(dataObject.getValue(Aq$SchedulesPo.COLUMNS.LAST_TIME.name()))); 
			aq$SchedulesPo.setJobno(BigDecimalUtils.formObj(dataObject.getValue(Aq$SchedulesPo.COLUMNS.JOBNO.name()))); 
			return aq$SchedulesPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Aq$SchedulesPo aq$SchedulesPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.OID.name(), aq$SchedulesPo.getOid()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.DESTINATION.name(), aq$SchedulesPo.getDestination()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.START_TIME.name(), aq$SchedulesPo.getStartTime()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.DURATION.name(), aq$SchedulesPo.getDuration()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.NEXT_TIME.name(), aq$SchedulesPo.getNextTime()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.LATENCY.name(), aq$SchedulesPo.getLatency()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.LAST_TIME.name(), aq$SchedulesPo.getLastTime()); 
			dataObject.setValue(Aq$SchedulesPo.COLUMNS.JOBNO.name(), aq$SchedulesPo.getJobno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Aq$SchedulesPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Aq$SchedulesPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Aq$SchedulesPo.COLUMNS.OID.name(), po.getOid()); 
		sqlWhere.add(Aq$SchedulesPo.COLUMNS.DESTINATION.name(), po.getDestination()); 
		sqlWhere.add(Aq$SchedulesPo.COLUMNS.JOBNO.name(), po.getJobno()); 
		return sqlWhere; 
	} 
 
} 
