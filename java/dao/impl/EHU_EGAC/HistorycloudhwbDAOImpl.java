package com.doc.common.dao.impl; 
 
public class HistorycloudhwbDAOImpl extends GeneralDAOImpl<HistorycloudhwbPo> implements HistorycloudhwbDAO { 
	public static final HistorycloudhwbDAOImpl INSTANCE = new HistorycloudhwbDAOImpl(); 
	public static final String TABLENAME = "HISTORYCLOUDHWB"; 

	public HistorycloudhwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorycloudhwbPo> CONVERTER = new MapConverter<HistorycloudhwbPo>() { 
 
		@Override 
		public HistorycloudhwbPo convert(final DataObject dataObject) { 
			final HistorycloudhwbPo historycloudhwbPo = new HistorycloudhwbPo(); 
			historycloudhwbPo.setIe(dataObject.getString(HistorycloudhwbPo.COLUMNS.IE.name())); 
			historycloudhwbPo.setMwb(dataObject.getString(HistorycloudhwbPo.COLUMNS.MWB.name())); 
			historycloudhwbPo.setHwb(dataObject.getString(HistorycloudhwbPo.COLUMNS.HWB.name())); 
			historycloudhwbPo.setExpbagno(dataObject.getString(HistorycloudhwbPo.COLUMNS.EXPBAGNO.name())); 
			historycloudhwbPo.setDeclno(dataObject.getString(HistorycloudhwbPo.COLUMNS.DECLNO.name())); 
			historycloudhwbPo.setDecltype(dataObject.getString(HistorycloudhwbPo.COLUMNS.DECLTYPE.name())); 
			historycloudhwbPo.setExpressid(dataObject.getString(HistorycloudhwbPo.COLUMNS.EXPRESSID.name())); 
			historycloudhwbPo.setBoxno(dataObject.getString(HistorycloudhwbPo.COLUMNS.BOXNO.name())); 
			historycloudhwbPo.setResultCode(dataObject.getString(HistorycloudhwbPo.COLUMNS.RESULT_CODE.name())); 
			historycloudhwbPo.setClearancetype(dataObject.getString(HistorycloudhwbPo.COLUMNS.CLEARANCETYPE.name())); 
			historycloudhwbPo.setChws(dataObject.getString(HistorycloudhwbPo.COLUMNS.CHWS.name())); 
			historycloudhwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.PIECE.name()))); 
			historycloudhwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.BAGHWB.name()))); 
			historycloudhwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCIWEIGHT.name()))); 
			historycloudhwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCIPIECE.name()))); 
			historycloudhwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCIDATE1.name()))); 
			historycloudhwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCIDATE2.name()))); 
			historycloudhwbPo.setGciws(dataObject.getString(HistorycloudhwbPo.COLUMNS.GCIWS.name())); 
			historycloudhwbPo.setGciuser(dataObject.getString(HistorycloudhwbPo.COLUMNS.GCIUSER.name())); 
			historycloudhwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCOPIECE.name()))); 
			historycloudhwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCODATE1.name()))); 
			historycloudhwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCODATE2.name()))); 
			historycloudhwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.GCOBAGSN.name()))); 
			historycloudhwbPo.setGcows(dataObject.getString(HistorycloudhwbPo.COLUMNS.GCOWS.name())); 
			historycloudhwbPo.setGcouser(dataObject.getString(HistorycloudhwbPo.COLUMNS.GCOUSER.name())); 
			historycloudhwbPo.setAirlineid(dataObject.getString(HistorycloudhwbPo.COLUMNS.AIRLINEID.name())); 
			historycloudhwbPo.setFlightno(dataObject.getString(HistorycloudhwbPo.COLUMNS.FLIGHTNO.name())); 
			historycloudhwbPo.setFlightdest(dataObject.getString(HistorycloudhwbPo.COLUMNS.FLIGHTDEST.name())); 
			historycloudhwbPo.setChargebox(dataObject.getString(HistorycloudhwbPo.COLUMNS.CHARGEBOX.name())); 
			historycloudhwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.CHARGEDATE.name()))); 
			historycloudhwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.PRINTDUTY.name()))); 
			historycloudhwbPo.setPrintuser(dataObject.getString(HistorycloudhwbPo.COLUMNS.PRINTUSER.name())); 
			historycloudhwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(HistorycloudhwbPo.COLUMNS.PRINTSN.name()))); 
			historycloudhwbPo.setIsopen(dataObject.getString(HistorycloudhwbPo.COLUMNS.ISOPEN.name())); 
			historycloudhwbPo.setIschg(dataObject.getString(HistorycloudhwbPo.COLUMNS.ISCHG.name())); 
			historycloudhwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(HistorycloudhwbPo.COLUMNS.LASTUPDATE.name()))); 
			return historycloudhwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorycloudhwbPo historycloudhwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.IE.name(), historycloudhwbPo.getIe()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.MWB.name(), historycloudhwbPo.getMwb()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.HWB.name(), historycloudhwbPo.getHwb()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.EXPBAGNO.name(), historycloudhwbPo.getExpbagno()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.DECLNO.name(), historycloudhwbPo.getDeclno()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.DECLTYPE.name(), historycloudhwbPo.getDecltype()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.EXPRESSID.name(), historycloudhwbPo.getExpressid()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.BOXNO.name(), historycloudhwbPo.getBoxno()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.RESULT_CODE.name(), historycloudhwbPo.getResultCode()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.CLEARANCETYPE.name(), historycloudhwbPo.getClearancetype()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.CHWS.name(), historycloudhwbPo.getChws()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.PIECE.name(), historycloudhwbPo.getPiece()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.BAGHWB.name(), historycloudhwbPo.getBaghwb()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIWEIGHT.name(), historycloudhwbPo.getGciweight()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIPIECE.name(), historycloudhwbPo.getGcipiece()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIDATE1.name(), historycloudhwbPo.getGcidate1()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIDATE2.name(), historycloudhwbPo.getGcidate2()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIWS.name(), historycloudhwbPo.getGciws()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCIUSER.name(), historycloudhwbPo.getGciuser()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCOPIECE.name(), historycloudhwbPo.getGcopiece()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCODATE1.name(), historycloudhwbPo.getGcodate1()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCODATE2.name(), historycloudhwbPo.getGcodate2()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCOBAGSN.name(), historycloudhwbPo.getGcobagsn()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCOWS.name(), historycloudhwbPo.getGcows()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.GCOUSER.name(), historycloudhwbPo.getGcouser()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.AIRLINEID.name(), historycloudhwbPo.getAirlineid()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.FLIGHTNO.name(), historycloudhwbPo.getFlightno()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.FLIGHTDEST.name(), historycloudhwbPo.getFlightdest()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.CHARGEBOX.name(), historycloudhwbPo.getChargebox()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.CHARGEDATE.name(), historycloudhwbPo.getChargedate()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.PRINTDUTY.name(), historycloudhwbPo.getPrintduty()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.PRINTUSER.name(), historycloudhwbPo.getPrintuser()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.PRINTSN.name(), historycloudhwbPo.getPrintsn()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.ISOPEN.name(), historycloudhwbPo.getIsopen()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.ISCHG.name(), historycloudhwbPo.getIschg()); 
			dataObject.setValue(HistorycloudhwbPo.COLUMNS.LASTUPDATE.name(), historycloudhwbPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorycloudhwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorycloudhwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
