package com.doc.common.dao.impl; 
 
public class GcoexpcloudhwbBackupDAOImpl extends GeneralDAOImpl<GcoexpcloudhwbBackupPo> implements GcoexpcloudhwbBackupDAO { 
	public static final GcoexpcloudhwbBackupDAOImpl INSTANCE = new GcoexpcloudhwbBackupDAOImpl(); 
	public static final String TABLENAME = "GCOEXPCLOUDHWB_BACKUP"; 

	public GcoexpcloudhwbBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoexpcloudhwbBackupPo> CONVERTER = new MapConverter<GcoexpcloudhwbBackupPo>() { 
 
		@Override 
		public GcoexpcloudhwbBackupPo convert(final DataObject dataObject) { 
			final GcoexpcloudhwbBackupPo gcoexpcloudhwbBackupPo = new GcoexpcloudhwbBackupPo(); 
			gcoexpcloudhwbBackupPo.setIe(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.IE.name())); 
			gcoexpcloudhwbBackupPo.setMwb(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.MWB.name())); 
			gcoexpcloudhwbBackupPo.setHwb(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.HWB.name())); 
			gcoexpcloudhwbBackupPo.setExpbagno(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name())); 
			gcoexpcloudhwbBackupPo.setDeclno(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.DECLNO.name())); 
			gcoexpcloudhwbBackupPo.setDecltype(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name())); 
			gcoexpcloudhwbBackupPo.setExpressid(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name())); 
			gcoexpcloudhwbBackupPo.setBoxno(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.BOXNO.name())); 
			gcoexpcloudhwbBackupPo.setResultCode(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name())); 
			gcoexpcloudhwbBackupPo.setClearancetype(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name())); 
			gcoexpcloudhwbBackupPo.setChws(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.CHWS.name())); 
			gcoexpcloudhwbBackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.PIECE.name()))); 
			gcoexpcloudhwbBackupPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.BAGHWB.name()))); 
			gcoexpcloudhwbBackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name()))); 
			gcoexpcloudhwbBackupPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name()))); 
			gcoexpcloudhwbBackupPo.setGcidate1(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name()))); 
			gcoexpcloudhwbBackupPo.setGcidate2(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name()))); 
			gcoexpcloudhwbBackupPo.setGciws(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.GCIWS.name())); 
			gcoexpcloudhwbBackupPo.setGciuser(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.GCIUSER.name())); 
			gcoexpcloudhwbBackupPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name()))); 
			gcoexpcloudhwbBackupPo.setGcodate1(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCODATE1.name()))); 
			gcoexpcloudhwbBackupPo.setGcodate2(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCODATE2.name()))); 
			gcoexpcloudhwbBackupPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name()))); 
			gcoexpcloudhwbBackupPo.setGcows(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.GCOWS.name())); 
			gcoexpcloudhwbBackupPo.setGcouser(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.GCOUSER.name())); 
			gcoexpcloudhwbBackupPo.setAirlineid(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name())); 
			gcoexpcloudhwbBackupPo.setFlightno(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name())); 
			gcoexpcloudhwbBackupPo.setFlightdest(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name())); 
			gcoexpcloudhwbBackupPo.setChargebox(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name())); 
			gcoexpcloudhwbBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name()))); 
			gcoexpcloudhwbBackupPo.setPrintduty(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name()))); 
			gcoexpcloudhwbBackupPo.setPrintuser(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name())); 
			gcoexpcloudhwbBackupPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.PRINTSN.name()))); 
			gcoexpcloudhwbBackupPo.setIsopen(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.ISOPEN.name())); 
			gcoexpcloudhwbBackupPo.setIschg(dataObject.getString(GcoexpcloudhwbBackupPo.COLUMNS.ISCHG.name())); 
			gcoexpcloudhwbBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcoexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name()))); 
			return gcoexpcloudhwbBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoexpcloudhwbBackupPo gcoexpcloudhwbBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.IE.name(), gcoexpcloudhwbBackupPo.getIe()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.MWB.name(), gcoexpcloudhwbBackupPo.getMwb()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.HWB.name(), gcoexpcloudhwbBackupPo.getHwb()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.EXPBAGNO.name(), gcoexpcloudhwbBackupPo.getExpbagno()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.DECLNO.name(), gcoexpcloudhwbBackupPo.getDeclno()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.DECLTYPE.name(), gcoexpcloudhwbBackupPo.getDecltype()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.EXPRESSID.name(), gcoexpcloudhwbBackupPo.getExpressid()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.BOXNO.name(), gcoexpcloudhwbBackupPo.getBoxno()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.RESULT_CODE.name(), gcoexpcloudhwbBackupPo.getResultCode()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.CLEARANCETYPE.name(), gcoexpcloudhwbBackupPo.getClearancetype()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.CHWS.name(), gcoexpcloudhwbBackupPo.getChws()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.PIECE.name(), gcoexpcloudhwbBackupPo.getPiece()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.BAGHWB.name(), gcoexpcloudhwbBackupPo.getBaghwb()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIWEIGHT.name(), gcoexpcloudhwbBackupPo.getGciweight()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIPIECE.name(), gcoexpcloudhwbBackupPo.getGcipiece()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIDATE1.name(), gcoexpcloudhwbBackupPo.getGcidate1()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIDATE2.name(), gcoexpcloudhwbBackupPo.getGcidate2()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIWS.name(), gcoexpcloudhwbBackupPo.getGciws()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCIUSER.name(), gcoexpcloudhwbBackupPo.getGciuser()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOPIECE.name(), gcoexpcloudhwbBackupPo.getGcopiece()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCODATE1.name(), gcoexpcloudhwbBackupPo.getGcodate1()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCODATE2.name(), gcoexpcloudhwbBackupPo.getGcodate2()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOBAGSN.name(), gcoexpcloudhwbBackupPo.getGcobagsn()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOWS.name(), gcoexpcloudhwbBackupPo.getGcows()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.GCOUSER.name(), gcoexpcloudhwbBackupPo.getGcouser()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.AIRLINEID.name(), gcoexpcloudhwbBackupPo.getAirlineid()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.FLIGHTNO.name(), gcoexpcloudhwbBackupPo.getFlightno()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.FLIGHTDEST.name(), gcoexpcloudhwbBackupPo.getFlightdest()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.CHARGEBOX.name(), gcoexpcloudhwbBackupPo.getChargebox()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.CHARGEDATE.name(), gcoexpcloudhwbBackupPo.getChargedate()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.PRINTDUTY.name(), gcoexpcloudhwbBackupPo.getPrintduty()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.PRINTUSER.name(), gcoexpcloudhwbBackupPo.getPrintuser()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.PRINTSN.name(), gcoexpcloudhwbBackupPo.getPrintsn()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.ISOPEN.name(), gcoexpcloudhwbBackupPo.getIsopen()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.ISCHG.name(), gcoexpcloudhwbBackupPo.getIschg()); 
			dataObject.setValue(GcoexpcloudhwbBackupPo.COLUMNS.LASTUPDATE.name(), gcoexpcloudhwbBackupPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoexpcloudhwbBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoexpcloudhwbBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
