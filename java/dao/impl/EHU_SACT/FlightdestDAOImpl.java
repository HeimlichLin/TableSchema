package com.doc.common.dao.impl; 
 
public class FlightdestDAOImpl extends GeneralDAOImpl<FlightdestPo> implements FlightdestDAO { 
	public static final FlightdestDAOImpl INSTANCE = new FlightdestDAOImpl(); 
	public static final String TABLENAME = "FLIGHTDEST"; 

	public FlightdestDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightdestPo> CONVERTER = new MapConverter<FlightdestPo>() { 
 
		@Override 
		public FlightdestPo convert(final DataObject dataObject) { 
			final FlightdestPo flightdestPo = new FlightdestPo(); 
			flightdestPo.setFlightno(dataObject.getString(FlightdestPo.COLUMNS.FLIGHTNO.name())); 
			flightdestPo.setFlightdest(dataObject.getString(FlightdestPo.COLUMNS.FLIGHTDEST.name())); 
			flightdestPo.setDestdescription(dataObject.getString(FlightdestPo.COLUMNS.DESTDESCRIPTION.name())); 
			return flightdestPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightdestPo flightdestPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightdestPo.COLUMNS.FLIGHTNO.name(), flightdestPo.getFlightno()); 
			dataObject.setValue(FlightdestPo.COLUMNS.FLIGHTDEST.name(), flightdestPo.getFlightdest()); 
			dataObject.setValue(FlightdestPo.COLUMNS.DESTDESCRIPTION.name(), flightdestPo.getDestdescription()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightdestPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightdestPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
