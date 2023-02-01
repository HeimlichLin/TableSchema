package com.doc.common.dao.impl; 
 
public class FlighttypeDAOImpl extends GeneralDAOImpl<FlighttypePo> implements FlighttypeDAO { 
	public static final FlighttypeDAOImpl INSTANCE = new FlighttypeDAOImpl(); 
	public static final String TABLENAME = "FLIGHTTYPE"; 

	public FlighttypeDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlighttypePo> CONVERTER = new MapConverter<FlighttypePo>() { 
 
		@Override 
		public FlighttypePo convert(final DataObject dataObject) { 
			final FlighttypePo flighttypePo = new FlighttypePo(); 
			flighttypePo.setFlightdate(TimestampUtils.of(dataObject.getValue(FlighttypePo.COLUMNS.FLIGHTDATE.name()))); 
			flighttypePo.setFlightno(dataObject.getString(FlighttypePo.COLUMNS.FLIGHTNO.name())); 
			flighttypePo.setFlighttype(dataObject.getString(FlighttypePo.COLUMNS.FLIGHTTYPE.name())); 
			flighttypePo.setFlightdest(dataObject.getString(FlighttypePo.COLUMNS.FLIGHTDEST.name())); 
			return flighttypePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlighttypePo flighttypePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlighttypePo.COLUMNS.FLIGHTDATE.name(), flighttypePo.getFlightdate()); 
			dataObject.setValue(FlighttypePo.COLUMNS.FLIGHTNO.name(), flighttypePo.getFlightno()); 
			dataObject.setValue(FlighttypePo.COLUMNS.FLIGHTTYPE.name(), flighttypePo.getFlighttype()); 
			dataObject.setValue(FlighttypePo.COLUMNS.FLIGHTDEST.name(), flighttypePo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlighttypePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlighttypePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
