package com.doc.common.dao.impl; 
 
public class FlightPc2DAOImpl extends GeneralDAOImpl<FlightPc2Po> implements FlightPc2DAO { 
	public static final FlightPc2DAOImpl INSTANCE = new FlightPc2DAOImpl(); 
	public static final String TABLENAME = "FLIGHT_PC2"; 

	public FlightPc2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightPc2Po> CONVERTER = new MapConverter<FlightPc2Po>() { 
 
		@Override 
		public FlightPc2Po convert(final DataObject dataObject) { 
			final FlightPc2Po flightPc2Po = new FlightPc2Po(); 
			flightPc2Po.setAirlineId(dataObject.getString(FlightPc2Po.COLUMNS.AIRLINE_ID.name())); 
			flightPc2Po.setFlightNo(dataObject.getString(FlightPc2Po.COLUMNS.FLIGHT_NO.name())); 
			flightPc2Po.setFlightPc(dataObject.getString(FlightPc2Po.COLUMNS.FLIGHT_PC.name())); 
			flightPc2Po.setIeType(dataObject.getString(FlightPc2Po.COLUMNS.IE_TYPE.name())); 
			flightPc2Po.setFlightPack(dataObject.getString(FlightPc2Po.COLUMNS.FLIGHT_PACK.name())); 
			flightPc2Po.setFlightDest(dataObject.getString(FlightPc2Po.COLUMNS.FLIGHT_DEST.name())); 
			return flightPc2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPc2Po flightPc2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPc2Po.COLUMNS.AIRLINE_ID.name(), flightPc2Po.getAirlineId()); 
			dataObject.setValue(FlightPc2Po.COLUMNS.FLIGHT_NO.name(), flightPc2Po.getFlightNo()); 
			dataObject.setValue(FlightPc2Po.COLUMNS.FLIGHT_PC.name(), flightPc2Po.getFlightPc()); 
			dataObject.setValue(FlightPc2Po.COLUMNS.IE_TYPE.name(), flightPc2Po.getIeType()); 
			dataObject.setValue(FlightPc2Po.COLUMNS.FLIGHT_PACK.name(), flightPc2Po.getFlightPack()); 
			dataObject.setValue(FlightPc2Po.COLUMNS.FLIGHT_DEST.name(), flightPc2Po.getFlightDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightPc2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightPc2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
