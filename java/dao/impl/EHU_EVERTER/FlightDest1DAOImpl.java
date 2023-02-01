package com.doc.common.dao.impl; 
 
public class FlightDest1DAOImpl extends GeneralDAOImpl<FlightDest1Po> implements FlightDest1DAO { 
	public static final FlightDest1DAOImpl INSTANCE = new FlightDest1DAOImpl(); 
	public static final String TABLENAME = "FLIGHT_DEST1"; 

	public FlightDest1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightDest1Po> CONVERTER = new MapConverter<FlightDest1Po>() { 
 
		@Override 
		public FlightDest1Po convert(final DataObject dataObject) { 
			final FlightDest1Po flightDest1Po = new FlightDest1Po(); 
			flightDest1Po.setFlightDate(TimestampUtils.of(dataObject.getValue(FlightDest1Po.COLUMNS.FLIGHT_DATE.name()))); 
			flightDest1Po.setAirlineId(dataObject.getString(FlightDest1Po.COLUMNS.AIRLINE_ID.name())); 
			flightDest1Po.setFlightNo(dataObject.getString(FlightDest1Po.COLUMNS.FLIGHT_NO.name())); 
			flightDest1Po.setFlightPc(dataObject.getString(FlightDest1Po.COLUMNS.FLIGHT_PC.name())); 
			flightDest1Po.setIeType(dataObject.getString(FlightDest1Po.COLUMNS.IE_TYPE.name())); 
			flightDest1Po.setFlightPack(dataObject.getString(FlightDest1Po.COLUMNS.FLIGHT_PACK.name())); 
			flightDest1Po.setFlightDest(dataObject.getString(FlightDest1Po.COLUMNS.FLIGHT_DEST.name())); 
			return flightDest1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightDest1Po flightDest1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightDest1Po.COLUMNS.FLIGHT_DATE.name(), flightDest1Po.getFlightDate()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.AIRLINE_ID.name(), flightDest1Po.getAirlineId()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.FLIGHT_NO.name(), flightDest1Po.getFlightNo()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.FLIGHT_PC.name(), flightDest1Po.getFlightPc()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.IE_TYPE.name(), flightDest1Po.getIeType()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.FLIGHT_PACK.name(), flightDest1Po.getFlightPack()); 
			dataObject.setValue(FlightDest1Po.COLUMNS.FLIGHT_DEST.name(), flightDest1Po.getFlightDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightDest1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightDest1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
