package com.doc.common.dao.impl; 
 
public class WorkexpcloudhwbBackupDAOImpl extends GeneralDAOImpl<WorkexpcloudhwbBackupPo> implements WorkexpcloudhwbBackupDAO { 
	public static final WorkexpcloudhwbBackupDAOImpl INSTANCE = new WorkexpcloudhwbBackupDAOImpl(); 
	public static final String TABLENAME = "WORKEXPCLOUDHWB_BACKUP"; 

	public WorkexpcloudhwbBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpcloudhwbBackupPo> CONVERTER = new MapConverter<WorkexpcloudhwbBackupPo>() { 
 
		@Override 
		public WorkexpcloudhwbBackupPo convert(final DataObject dataObject) { 
			final WorkexpcloudhwbBackupPo workexpcloudhwbBackupPo = new WorkexpcloudhwbBackupPo(); 
			workexpcloudhwbBackupPo.setIe(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.IE.name())); 
			workexpcloudhwbBackupPo.setMwb(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.MWB.name())); 
			workexpcloudhwbBackupPo.setHwb(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.HWB.name())); 
			workexpcloudhwbBackupPo.setExpbagno(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name())); 
			workexpcloudhwbBackupPo.setDeclno(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.DECLNO.name())); 
			workexpcloudhwbBackupPo.setDecltype(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name())); 
			workexpcloudhwbBackupPo.setExpressid(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name())); 
			workexpcloudhwbBackupPo.setBoxno(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.BOXNO.name())); 
			workexpcloudhwbBackupPo.setResultCode(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name())); 
			workexpcloudhwbBackupPo.setClearancetype(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name())); 
			workexpcloudhwbBackupPo.setChws(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.CHWS.name())); 
			workexpcloudhwbBackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.PIECE.name()))); 
			workexpcloudhwbBackupPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.BAGHWB.name()))); 
			workexpcloudhwbBackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name()))); 
			workexpcloudhwbBackupPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name()))); 
			workexpcloudhwbBackupPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name()))); 
			workexpcloudhwbBackupPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name()))); 
			workexpcloudhwbBackupPo.setGciws(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.GCIWS.name())); 
			workexpcloudhwbBackupPo.setGciuser(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.GCIUSER.name())); 
			workexpcloudhwbBackupPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name()))); 
			workexpcloudhwbBackupPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCODATE1.name()))); 
			workexpcloudhwbBackupPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCODATE2.name()))); 
			workexpcloudhwbBackupPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name()))); 
			workexpcloudhwbBackupPo.setGcows(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.GCOWS.name())); 
			workexpcloudhwbBackupPo.setGcouser(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.GCOUSER.name())); 
			workexpcloudhwbBackupPo.setAirlineid(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name())); 
			workexpcloudhwbBackupPo.setFlightno(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name())); 
			workexpcloudhwbBackupPo.setFlightdest(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name())); 
			workexpcloudhwbBackupPo.setChargebox(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name())); 
			workexpcloudhwbBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name()))); 
			workexpcloudhwbBackupPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name()))); 
			workexpcloudhwbBackupPo.setPrintuser(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name())); 
			workexpcloudhwbBackupPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.PRINTSN.name()))); 
			workexpcloudhwbBackupPo.setIsopen(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.ISOPEN.name())); 
			workexpcloudhwbBackupPo.setIschg(dataObject.getString(WorkexpcloudhwbBackupPo.COLUMNS.ISCHG.name())); 
			workexpcloudhwbBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name()))); 
			return workexpcloudhwbBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpcloudhwbBackupPo workexpcloudhwbBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.IE.name(), workexpcloudhwbBackupPo.getIe()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.MWB.name(), workexpcloudhwbBackupPo.getMwb()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.HWB.name(), workexpcloudhwbBackupPo.getHwb()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name(), workexpcloudhwbBackupPo.getExpbagno()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.DECLNO.name(), workexpcloudhwbBackupPo.getDeclno()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name(), workexpcloudhwbBackupPo.getDecltype()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name(), workexpcloudhwbBackupPo.getExpressid()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.BOXNO.name(), workexpcloudhwbBackupPo.getBoxno()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name(), workexpcloudhwbBackupPo.getResultCode()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name(), workexpcloudhwbBackupPo.getClearancetype()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.CHWS.name(), workexpcloudhwbBackupPo.getChws()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.PIECE.name(), workexpcloudhwbBackupPo.getPiece()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.BAGHWB.name(), workexpcloudhwbBackupPo.getBaghwb()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name(), workexpcloudhwbBackupPo.getGciweight()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name(), workexpcloudhwbBackupPo.getGcipiece()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name(), workexpcloudhwbBackupPo.getGcidate1()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name(), workexpcloudhwbBackupPo.getGcidate2()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIWS.name(), workexpcloudhwbBackupPo.getGciws()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCIUSER.name(), workexpcloudhwbBackupPo.getGciuser()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name(), workexpcloudhwbBackupPo.getGcopiece()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCODATE1.name(), workexpcloudhwbBackupPo.getGcodate1()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCODATE2.name(), workexpcloudhwbBackupPo.getGcodate2()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name(), workexpcloudhwbBackupPo.getGcobagsn()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOWS.name(), workexpcloudhwbBackupPo.getGcows()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.GCOUSER.name(), workexpcloudhwbBackupPo.getGcouser()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name(), workexpcloudhwbBackupPo.getAirlineid()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name(), workexpcloudhwbBackupPo.getFlightno()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name(), workexpcloudhwbBackupPo.getFlightdest()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name(), workexpcloudhwbBackupPo.getChargebox()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name(), workexpcloudhwbBackupPo.getChargedate()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name(), workexpcloudhwbBackupPo.getPrintduty()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name(), workexpcloudhwbBackupPo.getPrintuser()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.PRINTSN.name(), workexpcloudhwbBackupPo.getPrintsn()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.ISOPEN.name(), workexpcloudhwbBackupPo.getIsopen()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.ISCHG.name(), workexpcloudhwbBackupPo.getIschg()); 
			dataObject.setValue(WorkexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name(), workexpcloudhwbBackupPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpcloudhwbBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpcloudhwbBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
