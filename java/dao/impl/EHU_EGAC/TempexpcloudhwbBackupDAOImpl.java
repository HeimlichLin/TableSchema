package com.doc.common.dao.impl; 
 
public class TempexpcloudhwbBackupDAOImpl extends GeneralDAOImpl<TempexpcloudhwbBackupPo> implements TempexpcloudhwbBackupDAO { 
	public static final TempexpcloudhwbBackupDAOImpl INSTANCE = new TempexpcloudhwbBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPCLOUDHWB_BACKUP"; 

	public TempexpcloudhwbBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpcloudhwbBackupPo> CONVERTER = new MapConverter<TempexpcloudhwbBackupPo>() { 
 
		@Override 
		public TempexpcloudhwbBackupPo convert(final DataObject dataObject) { 
			final TempexpcloudhwbBackupPo tempexpcloudhwbBackupPo = new TempexpcloudhwbBackupPo(); 
			tempexpcloudhwbBackupPo.setIe(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.IE.name())); 
			tempexpcloudhwbBackupPo.setMwb(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.MWB.name())); 
			tempexpcloudhwbBackupPo.setHwb(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.HWB.name())); 
			tempexpcloudhwbBackupPo.setExpbagno(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name())); 
			tempexpcloudhwbBackupPo.setDeclno(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.DECLNO.name())); 
			tempexpcloudhwbBackupPo.setDecltype(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name())); 
			tempexpcloudhwbBackupPo.setExpressid(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name())); 
			tempexpcloudhwbBackupPo.setBoxno(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.BOXNO.name())); 
			tempexpcloudhwbBackupPo.setResultCode(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name())); 
			tempexpcloudhwbBackupPo.setClearancetype(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name())); 
			tempexpcloudhwbBackupPo.setChws(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.CHWS.name())); 
			tempexpcloudhwbBackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.PIECE.name()))); 
			tempexpcloudhwbBackupPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.BAGHWB.name()))); 
			tempexpcloudhwbBackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name()))); 
			tempexpcloudhwbBackupPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name()))); 
			tempexpcloudhwbBackupPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name()))); 
			tempexpcloudhwbBackupPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name()))); 
			tempexpcloudhwbBackupPo.setGciws(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.GCIWS.name())); 
			tempexpcloudhwbBackupPo.setGciuser(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.GCIUSER.name())); 
			tempexpcloudhwbBackupPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name()))); 
			tempexpcloudhwbBackupPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCODATE1.name()))); 
			tempexpcloudhwbBackupPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCODATE2.name()))); 
			tempexpcloudhwbBackupPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name()))); 
			tempexpcloudhwbBackupPo.setGcows(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.GCOWS.name())); 
			tempexpcloudhwbBackupPo.setGcouser(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.GCOUSER.name())); 
			tempexpcloudhwbBackupPo.setAirlineid(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name())); 
			tempexpcloudhwbBackupPo.setFlightno(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name())); 
			tempexpcloudhwbBackupPo.setFlightdest(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name())); 
			tempexpcloudhwbBackupPo.setChargebox(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name())); 
			tempexpcloudhwbBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name()))); 
			tempexpcloudhwbBackupPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name()))); 
			tempexpcloudhwbBackupPo.setPrintuser(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name())); 
			tempexpcloudhwbBackupPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.PRINTSN.name()))); 
			tempexpcloudhwbBackupPo.setIsopen(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.ISOPEN.name())); 
			tempexpcloudhwbBackupPo.setIschg(dataObject.getString(TempexpcloudhwbBackupPo.COLUMNS.ISCHG.name())); 
			tempexpcloudhwbBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name()))); 
			return tempexpcloudhwbBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpcloudhwbBackupPo tempexpcloudhwbBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.IE.name(), tempexpcloudhwbBackupPo.getIe()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.MWB.name(), tempexpcloudhwbBackupPo.getMwb()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.HWB.name(), tempexpcloudhwbBackupPo.getHwb()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name(), tempexpcloudhwbBackupPo.getExpbagno()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.DECLNO.name(), tempexpcloudhwbBackupPo.getDeclno()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name(), tempexpcloudhwbBackupPo.getDecltype()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name(), tempexpcloudhwbBackupPo.getExpressid()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.BOXNO.name(), tempexpcloudhwbBackupPo.getBoxno()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name(), tempexpcloudhwbBackupPo.getResultCode()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name(), tempexpcloudhwbBackupPo.getClearancetype()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.CHWS.name(), tempexpcloudhwbBackupPo.getChws()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.PIECE.name(), tempexpcloudhwbBackupPo.getPiece()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.BAGHWB.name(), tempexpcloudhwbBackupPo.getBaghwb()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name(), tempexpcloudhwbBackupPo.getGciweight()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name(), tempexpcloudhwbBackupPo.getGcipiece()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name(), tempexpcloudhwbBackupPo.getGcidate1()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name(), tempexpcloudhwbBackupPo.getGcidate2()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIWS.name(), tempexpcloudhwbBackupPo.getGciws()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCIUSER.name(), tempexpcloudhwbBackupPo.getGciuser()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name(), tempexpcloudhwbBackupPo.getGcopiece()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCODATE1.name(), tempexpcloudhwbBackupPo.getGcodate1()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCODATE2.name(), tempexpcloudhwbBackupPo.getGcodate2()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name(), tempexpcloudhwbBackupPo.getGcobagsn()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCOWS.name(), tempexpcloudhwbBackupPo.getGcows()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.GCOUSER.name(), tempexpcloudhwbBackupPo.getGcouser()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name(), tempexpcloudhwbBackupPo.getAirlineid()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name(), tempexpcloudhwbBackupPo.getFlightno()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name(), tempexpcloudhwbBackupPo.getFlightdest()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name(), tempexpcloudhwbBackupPo.getChargebox()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name(), tempexpcloudhwbBackupPo.getChargedate()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name(), tempexpcloudhwbBackupPo.getPrintduty()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name(), tempexpcloudhwbBackupPo.getPrintuser()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.PRINTSN.name(), tempexpcloudhwbBackupPo.getPrintsn()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.ISOPEN.name(), tempexpcloudhwbBackupPo.getIsopen()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.ISCHG.name(), tempexpcloudhwbBackupPo.getIschg()); 
			dataObject.setValue(TempexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name(), tempexpcloudhwbBackupPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpcloudhwbBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpcloudhwbBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
