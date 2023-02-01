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
			return flightPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPo flightPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPo.COLUMNS.AIRLINEID.name(), flightPo.getAirlineid()); 
			dataObject.setValue(FlightPo.COLUMNS.FLIGHTNO.name(), flightPo.getFlightno()); 
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
