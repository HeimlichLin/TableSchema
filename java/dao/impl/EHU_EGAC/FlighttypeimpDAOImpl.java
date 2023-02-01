package com.doc.common.dao.impl; 
 
public class FlighttypeimpDAOImpl extends GeneralDAOImpl<FlighttypeimpPo> implements FlighttypeimpDAO { 
	public static final FlighttypeimpDAOImpl INSTANCE = new FlighttypeimpDAOImpl(); 
	public static final String TABLENAME = "FLIGHTTYPEIMP"; 

	public FlighttypeimpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlighttypeimpPo> CONVERTER = new MapConverter<FlighttypeimpPo>() { 
 
		@Override 
		public FlighttypeimpPo convert(final DataObject dataObject) { 
			final FlighttypeimpPo flighttypeimpPo = new FlighttypeimpPo(); 
			flighttypeimpPo.setFdate(TimestampUtils.of(dataObject.getValue(FlighttypeimpPo.COLUMNS.FDATE.name()))); 
			flighttypeimpPo.setFlightno(dataObject.getString(FlighttypeimpPo.COLUMNS.FLIGHTNO.name())); 
			flighttypeimpPo.setAirlineid(dataObject.getString(FlighttypeimpPo.COLUMNS.AIRLINEID.name())); 
			flighttypeimpPo.setFlighttype(dataObject.getString(FlighttypeimpPo.COLUMNS.FLIGHTTYPE.name())); 
			flighttypeimpPo.setHwb(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeimpPo.COLUMNS.HWB.name()))); 
			flighttypeimpPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeimpPo.COLUMNS.PIECE.name()))); 
			flighttypeimpPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(FlighttypeimpPo.COLUMNS.WEIGHT.name()))); 
			flighttypeimpPo.setDest(dataObject.getString(FlighttypeimpPo.COLUMNS.DEST.name())); 
			return flighttypeimpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlighttypeimpPo flighttypeimpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.FDATE.name(), flighttypeimpPo.getFdate()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.FLIGHTNO.name(), flighttypeimpPo.getFlightno()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.AIRLINEID.name(), flighttypeimpPo.getAirlineid()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.FLIGHTTYPE.name(), flighttypeimpPo.getFlighttype()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.HWB.name(), flighttypeimpPo.getHwb()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.PIECE.name(), flighttypeimpPo.getPiece()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.WEIGHT.name(), flighttypeimpPo.getWeight()); 
			dataObject.setValue(FlighttypeimpPo.COLUMNS.DEST.name(), flighttypeimpPo.getDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlighttypeimpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlighttypeimpPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
