package com.doc.common.dao.impl; 
 
public class FlightPc1DAOImpl extends GeneralDAOImpl<FlightPc1Po> implements FlightPc1DAO { 
	public static final FlightPc1DAOImpl INSTANCE = new FlightPc1DAOImpl(); 
	public static final String TABLENAME = "FLIGHT_PC1"; 

	public FlightPc1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightPc1Po> CONVERTER = new MapConverter<FlightPc1Po>() { 
 
		@Override 
		public FlightPc1Po convert(final DataObject dataObject) { 
			final FlightPc1Po flightPc1Po = new FlightPc1Po(); 
			flightPc1Po.setAirlineId(dataObject.getString(FlightPc1Po.COLUMNS.AIRLINE_ID.name())); 
			flightPc1Po.setFlightNo(dataObject.getString(FlightPc1Po.COLUMNS.FLIGHT_NO.name())); 
			flightPc1Po.setFlightPc(dataObject.getString(FlightPc1Po.COLUMNS.FLIGHT_PC.name())); 
			flightPc1Po.setIeType(dataObject.getString(FlightPc1Po.COLUMNS.IE_TYPE.name())); 
			flightPc1Po.setFlightPack(dataObject.getString(FlightPc1Po.COLUMNS.FLIGHT_PACK.name())); 
			flightPc1Po.setFlightDest(dataObject.getString(FlightPc1Po.COLUMNS.FLIGHT_DEST.name())); 
			return flightPc1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPc1Po flightPc1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPc1Po.COLUMNS.AIRLINE_ID.name(), flightPc1Po.getAirlineId()); 
			dataObject.setValue(FlightPc1Po.COLUMNS.FLIGHT_NO.name(), flightPc1Po.getFlightNo()); 
			dataObject.setValue(FlightPc1Po.COLUMNS.FLIGHT_PC.name(), flightPc1Po.getFlightPc()); 
			dataObject.setValue(FlightPc1Po.COLUMNS.IE_TYPE.name(), flightPc1Po.getIeType()); 
			dataObject.setValue(FlightPc1Po.COLUMNS.FLIGHT_PACK.name(), flightPc1Po.getFlightPack()); 
			dataObject.setValue(FlightPc1Po.COLUMNS.FLIGHT_DEST.name(), flightPc1Po.getFlightDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightPc1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightPc1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
