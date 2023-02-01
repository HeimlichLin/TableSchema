package com.doc.common.dao.impl; 
 
public class FlightPcDAOImpl extends GeneralDAOImpl<FlightPcPo> implements FlightPcDAO { 
	public static final FlightPcDAOImpl INSTANCE = new FlightPcDAOImpl(); 
	public static final String TABLENAME = "FLIGHT_PC"; 

	public FlightPcDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightPcPo> CONVERTER = new MapConverter<FlightPcPo>() { 
 
		@Override 
		public FlightPcPo convert(final DataObject dataObject) { 
			final FlightPcPo flightPcPo = new FlightPcPo(); 
			flightPcPo.setAirlineId(dataObject.getString(FlightPcPo.COLUMNS.AIRLINE_ID.name())); 
			flightPcPo.setFlightNo(dataObject.getString(FlightPcPo.COLUMNS.FLIGHT_NO.name())); 
			flightPcPo.setIeType(dataObject.getString(FlightPcPo.COLUMNS.IE_TYPE.name())); 
			flightPcPo.setAirPc(dataObject.getString(FlightPcPo.COLUMNS.AIR_PC.name())); 
			return flightPcPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightPcPo flightPcPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightPcPo.COLUMNS.AIRLINE_ID.name(), flightPcPo.getAirlineId()); 
			dataObject.setValue(FlightPcPo.COLUMNS.FLIGHT_NO.name(), flightPcPo.getFlightNo()); 
			dataObject.setValue(FlightPcPo.COLUMNS.IE_TYPE.name(), flightPcPo.getIeType()); 
			dataObject.setValue(FlightPcPo.COLUMNS.AIR_PC.name(), flightPcPo.getAirPc()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightPcPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightPcPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
