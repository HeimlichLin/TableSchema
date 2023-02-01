package com.doc.common.dao.impl; 
 
public class FlighttypeexpDAOImpl extends GeneralDAOImpl<FlighttypeexpPo> implements FlighttypeexpDAO { 
	public static final FlighttypeexpDAOImpl INSTANCE = new FlighttypeexpDAOImpl(); 
	public static final String TABLENAME = "FLIGHTTYPEEXP"; 

	public FlighttypeexpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlighttypeexpPo> CONVERTER = new MapConverter<FlighttypeexpPo>() { 
 
		@Override 
		public FlighttypeexpPo convert(final DataObject dataObject) { 
			final FlighttypeexpPo flighttypeexpPo = new FlighttypeexpPo(); 
			flighttypeexpPo.setFdate(TimestampUtils.of(dataObject.getValue(FlighttypeexpPo.COLUMNS.FDATE.name()))); 
			flighttypeexpPo.setFlightno(dataObject.getString(FlighttypeexpPo.COLUMNS.FLIGHTNO.name())); 
			flighttypeexpPo.setAirlineid(dataObject.getString(FlighttypeexpPo.COLUMNS.AIRLINEID.name())); 
			flighttypeexpPo.setFlighttype(dataObject.getString(FlighttypeexpPo.COLUMNS.FLIGHTTYPE.name())); 
			flighttypeexpPo.setHwb(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeexpPo.COLUMNS.HWB.name()))); 
			flighttypeexpPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeexpPo.COLUMNS.PIECE.name()))); 
			flighttypeexpPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeexpPo.COLUMNS.WEIGHT.name()))); 
			flighttypeexpPo.setDest(dataObject.getString(FlighttypeexpPo.COLUMNS.DEST.name())); 
			return flighttypeexpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlighttypeexpPo flighttypeexpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.FDATE.name(), flighttypeexpPo.getFdate()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.FLIGHTNO.name(), flighttypeexpPo.getFlightno()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.AIRLINEID.name(), flighttypeexpPo.getAirlineid()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.FLIGHTTYPE.name(), flighttypeexpPo.getFlighttype()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.HWB.name(), flighttypeexpPo.getHwb()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.PIECE.name(), flighttypeexpPo.getPiece()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.WEIGHT.name(), flighttypeexpPo.getWeight()); 
			dataObject.setValue(FlighttypeexpPo.COLUMNS.DEST.name(), flighttypeexpPo.getDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlighttypeexpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlighttypeexpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
