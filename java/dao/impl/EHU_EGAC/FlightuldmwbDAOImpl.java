package com.doc.common.dao.impl; 
 
public class FlightuldmwbDAOImpl extends GeneralDAOImpl<FlightuldmwbPo> implements FlightuldmwbDAO { 
	public static final FlightuldmwbDAOImpl INSTANCE = new FlightuldmwbDAOImpl(); 
	public static final String TABLENAME = "FLIGHTULDMWB"; 

	public FlightuldmwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightuldmwbPo> CONVERTER = new MapConverter<FlightuldmwbPo>() { 
 
		@Override 
		public FlightuldmwbPo convert(final DataObject dataObject) { 
			final FlightuldmwbPo flightuldmwbPo = new FlightuldmwbPo(); 
			flightuldmwbPo.setFlightuldno(BigDecimalUtils.formObj(dataObject.getValue(FlightuldmwbPo.COLUMNS.FLIGHTULDNO.name()))); 
			flightuldmwbPo.setChargebox(dataObject.getString(FlightuldmwbPo.COLUMNS.CHARGEBOX.name())); 
			flightuldmwbPo.setMwb(dataObject.getString(FlightuldmwbPo.COLUMNS.MWB.name())); 
			flightuldmwbPo.setMwbweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldmwbPo.COLUMNS.MWBWEIGHT.name()))); 
			flightuldmwbPo.setMwbpiece(BigDecimalUtils.formObj(dataObject.getValue(FlightuldmwbPo.COLUMNS.MWBPIECE.name()))); 
			return flightuldmwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightuldmwbPo flightuldmwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightuldmwbPo.COLUMNS.FLIGHTULDNO.name(), flightuldmwbPo.getFlightuldno()); 
			dataObject.setValue(FlightuldmwbPo.COLUMNS.CHARGEBOX.name(), flightuldmwbPo.getChargebox()); 
			dataObject.setValue(FlightuldmwbPo.COLUMNS.MWB.name(), flightuldmwbPo.getMwb()); 
			dataObject.setValue(FlightuldmwbPo.COLUMNS.MWBWEIGHT.name(), flightuldmwbPo.getMwbweight()); 
			dataObject.setValue(FlightuldmwbPo.COLUMNS.MWBPIECE.name(), flightuldmwbPo.getMwbpiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightuldmwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightuldmwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
