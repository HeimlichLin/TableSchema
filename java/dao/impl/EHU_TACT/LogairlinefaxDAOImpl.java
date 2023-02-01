package com.doc.common.dao.impl; 
 
public class LogairlinefaxDAOImpl extends GeneralDAOImpl<LogairlinefaxPo> implements LogairlinefaxDAO { 
	public static final LogairlinefaxDAOImpl INSTANCE = new LogairlinefaxDAOImpl(); 
	public static final String TABLENAME = "LOGAIRLINEFAX"; 

	public LogairlinefaxDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogairlinefaxPo> CONVERTER = new MapConverter<LogairlinefaxPo>() { 
 
		@Override 
		public LogairlinefaxPo convert(final DataObject dataObject) { 
			final LogairlinefaxPo logairlinefaxPo = new LogairlinefaxPo(); 
			logairlinefaxPo.setFlightno(dataObject.getString(LogairlinefaxPo.COLUMNS.FLIGHTNO.name())); 
			logairlinefaxPo.setFlightdate(TimestampUtils.of(dataObject.getValue(LogairlinefaxPo.COLUMNS.FLIGHTDATE.name()))); 
			logairlinefaxPo.setUldno(dataObject.getString(LogairlinefaxPo.COLUMNS.ULDNO.name())); 
			logairlinefaxPo.setFaxphone(dataObject.getString(LogairlinefaxPo.COLUMNS.FAXPHONE.name())); 
			logairlinefaxPo.setUserid(dataObject.getString(LogairlinefaxPo.COLUMNS.USERID.name())); 
			logairlinefaxPo.setLogdate(TimestampUtils.of(dataObject.getValue(LogairlinefaxPo.COLUMNS.LOGDATE.name()))); 
			logairlinefaxPo.setFaxstatic(dataObject.getString(LogairlinefaxPo.COLUMNS.FAXSTATIC.name())); 
			logairlinefaxPo.setWorkarea(dataObject.getString(LogairlinefaxPo.COLUMNS.WORKAREA.name())); 
			return logairlinefaxPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogairlinefaxPo logairlinefaxPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.FLIGHTNO.name(), logairlinefaxPo.getFlightno()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.FLIGHTDATE.name(), logairlinefaxPo.getFlightdate()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.ULDNO.name(), logairlinefaxPo.getUldno()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.FAXPHONE.name(), logairlinefaxPo.getFaxphone()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.USERID.name(), logairlinefaxPo.getUserid()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.LOGDATE.name(), logairlinefaxPo.getLogdate()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.FAXSTATIC.name(), logairlinefaxPo.getFaxstatic()); 
			dataObject.setValue(LogairlinefaxPo.COLUMNS.WORKAREA.name(), logairlinefaxPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogairlinefaxPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogairlinefaxPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
