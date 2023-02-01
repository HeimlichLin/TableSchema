package com.doc.common.dao.impl; 
 
public class FlightuldDAOImpl extends GeneralDAOImpl<FlightuldPo> implements FlightuldDAO { 
	public static final FlightuldDAOImpl INSTANCE = new FlightuldDAOImpl(); 
	public static final String TABLENAME = "FLIGHTULD"; 

	public FlightuldDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightuldPo> CONVERTER = new MapConverter<FlightuldPo>() { 
 
		@Override 
		public FlightuldPo convert(final DataObject dataObject) { 
			final FlightuldPo flightuldPo = new FlightuldPo(); 
			flightuldPo.setFlightuldno(BigDecimalUtils.formObj(dataObject.getValue(FlightuldPo.COLUMNS.FLIGHTULDNO.name()))); 
			flightuldPo.setAirlineid(dataObject.getString(FlightuldPo.COLUMNS.AIRLINEID.name())); 
			flightuldPo.setFlightno(dataObject.getString(FlightuldPo.COLUMNS.FLIGHTNO.name())); 
			flightuldPo.setFlightdest(dataObject.getString(FlightuldPo.COLUMNS.FLIGHTDEST.name())); 
			flightuldPo.setFlightdate(TimestampUtils.of(dataObject.getValue(FlightuldPo.COLUMNS.FLIGHTDATE.name()))); 
			flightuldPo.setUldtype(dataObject.getString(FlightuldPo.COLUMNS.ULDTYPE.name())); 
			flightuldPo.setUldno(dataObject.getString(FlightuldPo.COLUMNS.ULDNO.name())); 
			flightuldPo.setUldowner(dataObject.getString(FlightuldPo.COLUMNS.ULDOWNER.name())); 
			flightuldPo.setLoadweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldPo.COLUMNS.LOADWEIGHT.name()))); 
			flightuldPo.setTareweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldPo.COLUMNS.TAREWEIGHT.name()))); 
			flightuldPo.setRemainweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldPo.COLUMNS.REMAINWEIGHT.name()))); 
			flightuldPo.setBlankmwb(BigDecimalUtils.formObj(dataObject.getValue(FlightuldPo.COLUMNS.BLANKMWB.name()))); 
			flightuldPo.setChargedate(TimestampUtils.of(dataObject.getValue(FlightuldPo.COLUMNS.CHARGEDATE.name()))); 
			return flightuldPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightuldPo flightuldPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightuldPo.COLUMNS.FLIGHTULDNO.name(), flightuldPo.getFlightuldno()); 
			dataObject.setValue(FlightuldPo.COLUMNS.AIRLINEID.name(), flightuldPo.getAirlineid()); 
			dataObject.setValue(FlightuldPo.COLUMNS.FLIGHTNO.name(), flightuldPo.getFlightno()); 
			dataObject.setValue(FlightuldPo.COLUMNS.FLIGHTDEST.name(), flightuldPo.getFlightdest()); 
			dataObject.setValue(FlightuldPo.COLUMNS.FLIGHTDATE.name(), flightuldPo.getFlightdate()); 
			dataObject.setValue(FlightuldPo.COLUMNS.ULDTYPE.name(), flightuldPo.getUldtype()); 
			dataObject.setValue(FlightuldPo.COLUMNS.ULDNO.name(), flightuldPo.getUldno()); 
			dataObject.setValue(FlightuldPo.COLUMNS.ULDOWNER.name(), flightuldPo.getUldowner()); 
			dataObject.setValue(FlightuldPo.COLUMNS.LOADWEIGHT.name(), flightuldPo.getLoadweight()); 
			dataObject.setValue(FlightuldPo.COLUMNS.TAREWEIGHT.name(), flightuldPo.getTareweight()); 
			dataObject.setValue(FlightuldPo.COLUMNS.REMAINWEIGHT.name(), flightuldPo.getRemainweight()); 
			dataObject.setValue(FlightuldPo.COLUMNS.BLANKMWB.name(), flightuldPo.getBlankmwb()); 
			dataObject.setValue(FlightuldPo.COLUMNS.CHARGEDATE.name(), flightuldPo.getChargedate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightuldPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightuldPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
