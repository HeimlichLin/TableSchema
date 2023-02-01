package com.doc.common.dao.impl; 
 
public class FlightuldlogDAOImpl extends GeneralDAOImpl<FlightuldlogPo> implements FlightuldlogDAO { 
	public static final FlightuldlogDAOImpl INSTANCE = new FlightuldlogDAOImpl(); 
	public static final String TABLENAME = "FLIGHTULDLOG"; 

	public FlightuldlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<FlightuldlogPo> CONVERTER = new MapConverter<FlightuldlogPo>() { 
 
		@Override 
		public FlightuldlogPo convert(final DataObject dataObject) { 
			final FlightuldlogPo flightuldlogPo = new FlightuldlogPo(); 
			flightuldlogPo.setLoguserid(dataObject.getString(FlightuldlogPo.COLUMNS.LOGUSERID.name())); 
			flightuldlogPo.setLogdate(TimestampUtils.of(dataObject.getValue(FlightuldlogPo.COLUMNS.LOGDATE.name()))); 
			flightuldlogPo.setAction(dataObject.getString(FlightuldlogPo.COLUMNS.ACTION.name())); 
			flightuldlogPo.setFlightno(dataObject.getString(FlightuldlogPo.COLUMNS.FLIGHTNO.name())); 
			flightuldlogPo.setFlightdest(dataObject.getString(FlightuldlogPo.COLUMNS.FLIGHTDEST.name())); 
			flightuldlogPo.setFlightdate(TimestampUtils.of(dataObject.getValue(FlightuldlogPo.COLUMNS.FLIGHTDATE.name()))); 
			flightuldlogPo.setUld(dataObject.getString(FlightuldlogPo.COLUMNS.ULD.name())); 
			flightuldlogPo.setLoadweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.LOADWEIGHT.name()))); 
			flightuldlogPo.setTareweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.TAREWEIGHT.name()))); 
			flightuldlogPo.setChargedate(TimestampUtils.of(dataObject.getValue(FlightuldlogPo.COLUMNS.CHARGEDATE.name()))); 
			flightuldlogPo.setChargebox(dataObject.getString(FlightuldlogPo.COLUMNS.CHARGEBOX.name())); 
			flightuldlogPo.setMwb(dataObject.getString(FlightuldlogPo.COLUMNS.MWB.name())); 
			flightuldlogPo.setMwbweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.MWBWEIGHT.name()))); 
			flightuldlogPo.setMwbpiece(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.MWBPIECE.name()))); 
			flightuldlogPo.setPFlightno(dataObject.getString(FlightuldlogPo.COLUMNS.P_FLIGHTNO.name())); 
			flightuldlogPo.setPFlightdest(dataObject.getString(FlightuldlogPo.COLUMNS.P_FLIGHTDEST.name())); 
			flightuldlogPo.setPFlightdate(TimestampUtils.of(dataObject.getValue(FlightuldlogPo.COLUMNS.P_FLIGHTDATE.name()))); 
			flightuldlogPo.setPUld(dataObject.getString(FlightuldlogPo.COLUMNS.P_ULD.name())); 
			flightuldlogPo.setPLoadweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.P_LOADWEIGHT.name()))); 
			flightuldlogPo.setPTareweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.P_TAREWEIGHT.name()))); 
			flightuldlogPo.setPChargedate(TimestampUtils.of(dataObject.getValue(FlightuldlogPo.COLUMNS.P_CHARGEDATE.name()))); 
			flightuldlogPo.setPChargebox(dataObject.getString(FlightuldlogPo.COLUMNS.P_CHARGEBOX.name())); 
			flightuldlogPo.setPMwb(dataObject.getString(FlightuldlogPo.COLUMNS.P_MWB.name())); 
			flightuldlogPo.setPMwbweight(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.P_MWBWEIGHT.name()))); 
			flightuldlogPo.setPMwbpiece(BigDecimalUtils.formObj(dataObject.getValue(FlightuldlogPo.COLUMNS.P_MWBPIECE.name()))); 
			return flightuldlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final FlightuldlogPo flightuldlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.LOGUSERID.name(), flightuldlogPo.getLoguserid()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.LOGDATE.name(), flightuldlogPo.getLogdate()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.ACTION.name(), flightuldlogPo.getAction()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.FLIGHTNO.name(), flightuldlogPo.getFlightno()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.FLIGHTDEST.name(), flightuldlogPo.getFlightdest()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.FLIGHTDATE.name(), flightuldlogPo.getFlightdate()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.ULD.name(), flightuldlogPo.getUld()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.LOADWEIGHT.name(), flightuldlogPo.getLoadweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.TAREWEIGHT.name(), flightuldlogPo.getTareweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.CHARGEDATE.name(), flightuldlogPo.getChargedate()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.CHARGEBOX.name(), flightuldlogPo.getChargebox()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.MWB.name(), flightuldlogPo.getMwb()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.MWBWEIGHT.name(), flightuldlogPo.getMwbweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.MWBPIECE.name(), flightuldlogPo.getMwbpiece()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_FLIGHTNO.name(), flightuldlogPo.getPFlightno()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_FLIGHTDEST.name(), flightuldlogPo.getPFlightdest()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_FLIGHTDATE.name(), flightuldlogPo.getPFlightdate()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_ULD.name(), flightuldlogPo.getPUld()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_LOADWEIGHT.name(), flightuldlogPo.getPLoadweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_TAREWEIGHT.name(), flightuldlogPo.getPTareweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_CHARGEDATE.name(), flightuldlogPo.getPChargedate()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_CHARGEBOX.name(), flightuldlogPo.getPChargebox()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_MWB.name(), flightuldlogPo.getPMwb()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_MWBWEIGHT.name(), flightuldlogPo.getPMwbweight()); 
			dataObject.setValue(FlightuldlogPo.COLUMNS.P_MWBPIECE.name(), flightuldlogPo.getPMwbpiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<FlightuldlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(FlightuldlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
