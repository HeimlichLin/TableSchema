package com.doc.common.dao.impl; 
 
public class WorkexpcloudhwbDAOImpl extends GeneralDAOImpl<WorkexpcloudhwbPo> implements WorkexpcloudhwbDAO { 
	public static final WorkexpcloudhwbDAOImpl INSTANCE = new WorkexpcloudhwbDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDHWB"; 

	public WorkexpcloudhwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudhwbPo> CONVERTER = new MapConverter<WorkexpcloudhwbPo>() { 
 
		@Override 
		public WorkexpcloudhwbPo convert(final DataObject dataObject) { 
			final WorkexpcloudhwbPo workexpcloudhwbPo = new WorkexpcloudhwbPo(); 
			workexpcloudhwbPo.setIe(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.IE.name())); 
			workexpcloudhwbPo.setMwb(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.MWB.name())); 
			workexpcloudhwbPo.setHwb(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.HWB.name())); 
			workexpcloudhwbPo.setExpbagno(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.EXPBAGNO.name())); 
			workexpcloudhwbPo.setDeclno(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.DECLNO.name())); 
			workexpcloudhwbPo.setDecltype(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.DECLTYPE.name())); 
			workexpcloudhwbPo.setExpressid(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.EXPRESSID.name())); 
			workexpcloudhwbPo.setBoxno(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.BOXNO.name())); 
			workexpcloudhwbPo.setResultCode(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.RESULT_CODE.name())); 
			workexpcloudhwbPo.setClearancetype(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.CLEARANCETYPE.name())); 
			workexpcloudhwbPo.setChws(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.CHWS.name())); 
			workexpcloudhwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.PIECE.name()))); 
			workexpcloudhwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.BAGHWB.name()))); 
			workexpcloudhwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCIWEIGHT.name()))); 
			workexpcloudhwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCIPIECE.name()))); 
			workexpcloudhwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCIDATE1.name()))); 
			workexpcloudhwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCIDATE2.name()))); 
			workexpcloudhwbPo.setGciws(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.GCIWS.name())); 
			workexpcloudhwbPo.setGciuser(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.GCIUSER.name())); 
			workexpcloudhwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCOPIECE.name()))); 
			workexpcloudhwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCODATE1.name()))); 
			workexpcloudhwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCODATE2.name()))); 
			workexpcloudhwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.GCOBAGSN.name()))); 
			workexpcloudhwbPo.setGcows(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.GCOWS.name())); 
			workexpcloudhwbPo.setGcouser(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.GCOUSER.name())); 
			workexpcloudhwbPo.setAirlineid(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.AIRLINEID.name())); 
			workexpcloudhwbPo.setFlightno(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.FLIGHTNO.name())); 
			workexpcloudhwbPo.setFlightdest(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.FLIGHTDEST.name())); 
			workexpcloudhwbPo.setChargebox(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.CHARGEBOX.name())); 
			workexpcloudhwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.CHARGEDATE.name()))); 
			workexpcloudhwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.PRINTDUTY.name()))); 
			workexpcloudhwbPo.setPrintuser(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.PRINTUSER.name())); 
			workexpcloudhwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.PRINTSN.name()))); 
			workexpcloudhwbPo.setIsopen(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.ISOPEN.name())); 
			workexpcloudhwbPo.setIschg(dataObject.getString(WorkexpcloudhwbPo.COLUMNS.ISCHG.name())); 
			workexpcloudhwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbPo.COLUMNS.LASTUPDATE.name()))); 
			return workexpcloudhwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudhwbPo workexpcloudhwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.IE.name(), workexpcloudhwbPo.getIe()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.MWB.name(), workexpcloudhwbPo.getMwb()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.HWB.name(), workexpcloudhwbPo.getHwb()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.EXPBAGNO.name(), workexpcloudhwbPo.getExpbagno()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.DECLNO.name(), workexpcloudhwbPo.getDeclno()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.DECLTYPE.name(), workexpcloudhwbPo.getDecltype()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.EXPRESSID.name(), workexpcloudhwbPo.getExpressid()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.BOXNO.name(), workexpcloudhwbPo.getBoxno()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.RESULT_CODE.name(), workexpcloudhwbPo.getResultCode()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.CLEARANCETYPE.name(), workexpcloudhwbPo.getClearancetype()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.CHWS.name(), workexpcloudhwbPo.getChws()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.PIECE.name(), workexpcloudhwbPo.getPiece()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.BAGHWB.name(), workexpcloudhwbPo.getBaghwb()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIWEIGHT.name(), workexpcloudhwbPo.getGciweight()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIPIECE.name(), workexpcloudhwbPo.getGcipiece()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIDATE1.name(), workexpcloudhwbPo.getGcidate1()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIDATE2.name(), workexpcloudhwbPo.getGcidate2()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIWS.name(), workexpcloudhwbPo.getGciws()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCIUSER.name(), workexpcloudhwbPo.getGciuser()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCOPIECE.name(), workexpcloudhwbPo.getGcopiece()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCODATE1.name(), workexpcloudhwbPo.getGcodate1()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCODATE2.name(), workexpcloudhwbPo.getGcodate2()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCOBAGSN.name(), workexpcloudhwbPo.getGcobagsn()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCOWS.name(), workexpcloudhwbPo.getGcows()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.GCOUSER.name(), workexpcloudhwbPo.getGcouser()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.AIRLINEID.name(), workexpcloudhwbPo.getAirlineid()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.FLIGHTNO.name(), workexpcloudhwbPo.getFlightno()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.FLIGHTDEST.name(), workexpcloudhwbPo.getFlightdest()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.CHARGEBOX.name(), workexpcloudhwbPo.getChargebox()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.CHARGEDATE.name(), workexpcloudhwbPo.getChargedate()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.PRINTDUTY.name(), workexpcloudhwbPo.getPrintduty()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.PRINTUSER.name(), workexpcloudhwbPo.getPrintuser()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.PRINTSN.name(), workexpcloudhwbPo.getPrintsn()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.ISOPEN.name(), workexpcloudhwbPo.getIsopen()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.ISCHG.name(), workexpcloudhwbPo.getIschg()); 
			dataObject.setValue(WorkexpcloudhwbPo.COLUMNS.LASTUPDATE.name(), workexpcloudhwbPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudhwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudhwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
