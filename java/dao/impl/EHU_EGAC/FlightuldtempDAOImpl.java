package com.doc.common.dao.impl; 
 
public class FlightuldtempDAOImpl extends GeneralDAOImpl<FlightuldtempPo> implements FlightuldtempDAO { 
	public static final FlightuldtempDAOImpl INSTANCE = new FlightuldtempDAOImpl(); 
	public static final String TABLENAME = "FLIGHTULDTEMP"; 

	public FlightuldtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightuldtempPo> CONVERTER = new MapConverter<FlightuldtempPo>() { 
 
		@Override 
		public FlightuldtempPo convert(final DataObject dataObject) { 
			final FlightuldtempPo flightuldtempPo = new FlightuldtempPo(); 
			flightuldtempPo.setFlightuldno(BigDecimalUtils.formObj(dataObject.getValue(FlightuldtempPo.COLUMNS.FLIGHTULDNO.name()))); 
			flightuldtempPo.setFlightno(dataObject.getString(FlightuldtempPo.COLUMNS.FLIGHTNO.name())); 
			flightuldtempPo.setFlightdest(dataObject.getString(FlightuldtempPo.COLUMNS.FLIGHTDEST.name())); 
			flightuldtempPo.setFlightdate(dataObject.getString(FlightuldtempPo.COLUMNS.FLIGHTDATE.name())); 
			flightuldtempPo.setUld(dataObject.getString(FlightuldtempPo.COLUMNS.ULD.name())); 
			flightuldtempPo.setLoadweight(dataObject.getString(FlightuldtempPo.COLUMNS.LOADWEIGHT.name())); 
			flightuldtempPo.setTareweight(dataObject.getString(FlightuldtempPo.COLUMNS.TAREWEIGHT.name())); 
			flightuldtempPo.setNetweight(dataObject.getString(FlightuldtempPo.COLUMNS.NETWEIGHT.name())); 
			flightuldtempPo.setMwb(dataObject.getString(FlightuldtempPo.COLUMNS.MWB.name())); 
			flightuldtempPo.setChargebox(dataObject.getString(FlightuldtempPo.COLUMNS.CHARGEBOX.name())); 
			flightuldtempPo.setMwbweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldtempPo.COLUMNS.MWBWEIGHT.name()))); 
			flightuldtempPo.setRptseq(BigDecimalUtils.formObj(dataObject.getValue(FlightuldtempPo.COLUMNS.RPTSEQ.name()))); 
			flightuldtempPo.setMwbpiece(BigDecimalUtils.formObj(dataObject.getValue(FlightuldtempPo.COLUMNS.MWBPIECE.name()))); 
			return flightuldtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightuldtempPo flightuldtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.FLIGHTULDNO.name(), flightuldtempPo.getFlightuldno()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.FLIGHTNO.name(), flightuldtempPo.getFlightno()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.FLIGHTDEST.name(), flightuldtempPo.getFlightdest()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.FLIGHTDATE.name(), flightuldtempPo.getFlightdate()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.ULD.name(), flightuldtempPo.getUld()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.LOADWEIGHT.name(), flightuldtempPo.getLoadweight()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.TAREWEIGHT.name(), flightuldtempPo.getTareweight()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.NETWEIGHT.name(), flightuldtempPo.getNetweight()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.MWB.name(), flightuldtempPo.getMwb()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.CHARGEBOX.name(), flightuldtempPo.getChargebox()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.MWBWEIGHT.name(), flightuldtempPo.getMwbweight()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.RPTSEQ.name(), flightuldtempPo.getRptseq()); 
			dataObject.setValue(FlightuldtempPo.COLUMNS.MWBPIECE.name(), flightuldtempPo.getMwbpiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightuldtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightuldtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
