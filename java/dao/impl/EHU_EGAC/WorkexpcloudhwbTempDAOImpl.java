package com.doc.common.dao.impl; 
 
public class WorkexpcloudhwbTempDAOImpl extends GeneralDAOImpl<WorkexpcloudhwbTempPo> implements WorkexpcloudhwbTempDAO { 
	public static final WorkexpcloudhwbTempDAOImpl INSTANCE = new WorkexpcloudhwbTempDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDHWB_TEMP"; 

	public WorkexpcloudhwbTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudhwbTempPo> CONVERTER = new MapConverter<WorkexpcloudhwbTempPo>() { 
 
		@Override 
		public WorkexpcloudhwbTempPo convert(final DataObject dataObject) { 
			final WorkexpcloudhwbTempPo workexpcloudhwbTempPo = new WorkexpcloudhwbTempPo(); 
			workexpcloudhwbTempPo.setIe(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.IE.name())); 
			workexpcloudhwbTempPo.setMwb(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.MWB.name())); 
			workexpcloudhwbTempPo.setHwb(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.HWB.name())); 
			workexpcloudhwbTempPo.setExpbagno(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.EXPBAGNO.name())); 
			workexpcloudhwbTempPo.setDeclno(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.DECLNO.name())); 
			workexpcloudhwbTempPo.setDecltype(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.DECLTYPE.name())); 
			workexpcloudhwbTempPo.setExpressid(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.EXPRESSID.name())); 
			workexpcloudhwbTempPo.setBoxno(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.BOXNO.name())); 
			workexpcloudhwbTempPo.setResultCode(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.RESULT_CODE.name())); 
			workexpcloudhwbTempPo.setClearancetype(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.CLEARANCETYPE.name())); 
			workexpcloudhwbTempPo.setChws(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.CHWS.name())); 
			workexpcloudhwbTempPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.PIECE.name()))); 
			workexpcloudhwbTempPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.BAGHWB.name()))); 
			workexpcloudhwbTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCIWEIGHT.name()))); 
			workexpcloudhwbTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCIPIECE.name()))); 
			workexpcloudhwbTempPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCIDATE1.name()))); 
			workexpcloudhwbTempPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCIDATE2.name()))); 
			workexpcloudhwbTempPo.setGciws(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.GCIWS.name())); 
			workexpcloudhwbTempPo.setGciuser(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.GCIUSER.name())); 
			workexpcloudhwbTempPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCOPIECE.name()))); 
			workexpcloudhwbTempPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCODATE1.name()))); 
			workexpcloudhwbTempPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCODATE2.name()))); 
			workexpcloudhwbTempPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.GCOBAGSN.name()))); 
			workexpcloudhwbTempPo.setGcows(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.GCOWS.name())); 
			workexpcloudhwbTempPo.setGcouser(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.GCOUSER.name())); 
			workexpcloudhwbTempPo.setAirlineid(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.AIRLINEID.name())); 
			workexpcloudhwbTempPo.setFlightno(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.FLIGHTNO.name())); 
			workexpcloudhwbTempPo.setFlightdest(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.FLIGHTDEST.name())); 
			workexpcloudhwbTempPo.setChargebox(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.CHARGEBOX.name())); 
			workexpcloudhwbTempPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.CHARGEDATE.name()))); 
			workexpcloudhwbTempPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.PRINTDUTY.name()))); 
			workexpcloudhwbTempPo.setPrintuser(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.PRINTUSER.name())); 
			workexpcloudhwbTempPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.PRINTSN.name()))); 
			workexpcloudhwbTempPo.setIsopen(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.ISOPEN.name())); 
			workexpcloudhwbTempPo.setIschg(dataObject.getString(WorkexpcloudhwbTempPo.COLUMNS.ISCHG.name())); 
			workexpcloudhwbTempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbTempPo.COLUMNS.LASTUPDATE.name()))); 
			return workexpcloudhwbTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudhwbTempPo workexpcloudhwbTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.IE.name(), workexpcloudhwbTempPo.getIe()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.MWB.name(), workexpcloudhwbTempPo.getMwb()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.HWB.name(), workexpcloudhwbTempPo.getHwb()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.EXPBAGNO.name(), workexpcloudhwbTempPo.getExpbagno()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.DECLNO.name(), workexpcloudhwbTempPo.getDeclno()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.DECLTYPE.name(), workexpcloudhwbTempPo.getDecltype()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.EXPRESSID.name(), workexpcloudhwbTempPo.getExpressid()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.BOXNO.name(), workexpcloudhwbTempPo.getBoxno()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.RESULT_CODE.name(), workexpcloudhwbTempPo.getResultCode()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.CLEARANCETYPE.name(), workexpcloudhwbTempPo.getClearancetype()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.CHWS.name(), workexpcloudhwbTempPo.getChws()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.PIECE.name(), workexpcloudhwbTempPo.getPiece()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.BAGHWB.name(), workexpcloudhwbTempPo.getBaghwb()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIWEIGHT.name(), workexpcloudhwbTempPo.getGciweight()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIPIECE.name(), workexpcloudhwbTempPo.getGcipiece()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIDATE1.name(), workexpcloudhwbTempPo.getGcidate1()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIDATE2.name(), workexpcloudhwbTempPo.getGcidate2()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIWS.name(), workexpcloudhwbTempPo.getGciws()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCIUSER.name(), workexpcloudhwbTempPo.getGciuser()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCOPIECE.name(), workexpcloudhwbTempPo.getGcopiece()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCODATE1.name(), workexpcloudhwbTempPo.getGcodate1()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCODATE2.name(), workexpcloudhwbTempPo.getGcodate2()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCOBAGSN.name(), workexpcloudhwbTempPo.getGcobagsn()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCOWS.name(), workexpcloudhwbTempPo.getGcows()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.GCOUSER.name(), workexpcloudhwbTempPo.getGcouser()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.AIRLINEID.name(), workexpcloudhwbTempPo.getAirlineid()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.FLIGHTNO.name(), workexpcloudhwbTempPo.getFlightno()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.FLIGHTDEST.name(), workexpcloudhwbTempPo.getFlightdest()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.CHARGEBOX.name(), workexpcloudhwbTempPo.getChargebox()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.CHARGEDATE.name(), workexpcloudhwbTempPo.getChargedate()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.PRINTDUTY.name(), workexpcloudhwbTempPo.getPrintduty()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.PRINTUSER.name(), workexpcloudhwbTempPo.getPrintuser()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.PRINTSN.name(), workexpcloudhwbTempPo.getPrintsn()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.ISOPEN.name(), workexpcloudhwbTempPo.getIsopen()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.ISCHG.name(), workexpcloudhwbTempPo.getIschg()); 
			dataObject.setValue(WorkexpcloudhwbTempPo.COLUMNS.LASTUPDATE.name(), workexpcloudhwbTempPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudhwbTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudhwbTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
