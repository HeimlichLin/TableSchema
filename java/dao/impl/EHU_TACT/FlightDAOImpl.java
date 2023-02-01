package com.doc.common.dao.impl; 
 
public class FlightDAOImpl extends GeneralDAOImpl<FlightPo> implements FlightDAO { 
	public static final FlightDAOImpl INSTANCE = new FlightDAOImpl(); 
	public static final String TABLENAME = "FLIGHT"; 

	public FlightDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightPo> CONVERTER = new MapConverter<FlightPo>() { 
 
		@Override 
		public FlightPo convert(final DataObject dataObject) { 
			final FlightPo flightPo = new FlightPo(); 
			flightPo.setAirlineid(dataObject.getString(FlightPo.COLUMNS.AIRLINEID.name())); 
			flightPo.setFlightno(dataObject.getString(FlightPo.COLUMNS.FLIGHTNO.name())); 
			flightPo.setFlighttype(dataObject.getString(FlightPo.COLUMNS.FLIGHTTYPE.name())); 
			flightPo.setFlightarea(dataObject.getString(FlightPo.COLUMNS.FLIGHTAREA.name())); 
			flightPo.setFlightdest(dataObject.getString(FlightPo.COLUMNS.FLIGHTDEST.name())); 
			return flightPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPo flightPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPo.COLUMNS.AIRLINEID.name(), flightPo.getAirlineid()); 
			dataObject.setValue(FlightPo.COLUMNS.FLIGHTNO.name(), flightPo.getFlightno()); 
			dataObject.setValue(FlightPo.COLUMNS.FLIGHTTYPE.name(), flightPo.getFlighttype()); 
			dataObject.setValue(FlightPo.COLUMNS.FLIGHTAREA.name(), flightPo.getFlightarea()); 
			dataObject.setValue(FlightPo.COLUMNS.FLIGHTDEST.name(), flightPo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
