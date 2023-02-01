package com.doc.common.dao.impl; 
 
public class FlightPc1981005DAOImpl extends GeneralDAOImpl<FlightPc1981005Po> implements FlightPc1981005DAO { 
	public static final FlightPc1981005DAOImpl INSTANCE = new FlightPc1981005DAOImpl(); 
	public static final String TABLENAME = "FLIGHT_PC1_981005"; 

	public FlightPc1981005DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightPc1981005Po> CONVERTER = new MapConverter<FlightPc1981005Po>() { 
 
		@Override 
		public FlightPc1981005Po convert(final DataObject dataObject) { 
			final FlightPc1981005Po flightPc1981005Po = new FlightPc1981005Po(); 
			flightPc1981005Po.setAirlineId(dataObject.getString(FlightPc1981005Po.COLUMNS.AIRLINE_ID.name())); 
			flightPc1981005Po.setFlightNo(dataObject.getString(FlightPc1981005Po.COLUMNS.FLIGHT_NO.name())); 
			flightPc1981005Po.setFlightPc(dataObject.getString(FlightPc1981005Po.COLUMNS.FLIGHT_PC.name())); 
			flightPc1981005Po.setIeType(dataObject.getString(FlightPc1981005Po.COLUMNS.IE_TYPE.name())); 
			flightPc1981005Po.setFlightPack(dataObject.getString(FlightPc1981005Po.COLUMNS.FLIGHT_PACK.name())); 
			flightPc1981005Po.setFlightDest(dataObject.getString(FlightPc1981005Po.COLUMNS.FLIGHT_DEST.name())); 
			return flightPc1981005Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPc1981005Po flightPc1981005Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.AIRLINE_ID.name(), flightPc1981005Po.getAirlineId()); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.FLIGHT_NO.name(), flightPc1981005Po.getFlightNo()); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.FLIGHT_PC.name(), flightPc1981005Po.getFlightPc()); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.IE_TYPE.name(), flightPc1981005Po.getIeType()); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.FLIGHT_PACK.name(), flightPc1981005Po.getFlightPack()); 
			dataObject.setValue(FlightPc1981005Po.COLUMNS.FLIGHT_DEST.name(), flightPc1981005Po.getFlightDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightPc1981005Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightPc1981005Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
