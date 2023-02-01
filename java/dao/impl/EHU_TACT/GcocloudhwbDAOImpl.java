package com.doc.common.dao.impl; 
 
public class GcocloudhwbDAOImpl extends GeneralDAOImpl<GcocloudhwbPo> implements GcocloudhwbDAO { 
	public static final GcocloudhwbDAOImpl INSTANCE = new GcocloudhwbDAOImpl(); 
	public static final String TABLENAME = "GCOCLOUDHWB"; 

	public GcocloudhwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcocloudhwbPo> CONVERTER = new MapConverter<GcocloudhwbPo>() { 
 
		@Override 
		public GcocloudhwbPo convert(final DataObject dataObject) { 
			final GcocloudhwbPo gcocloudhwbPo = new GcocloudhwbPo(); 
			gcocloudhwbPo.setIe(dataObject.getString(GcocloudhwbPo.COLUMNS.IE.name())); 
			gcocloudhwbPo.setMwb(dataObject.getString(GcocloudhwbPo.COLUMNS.MWB.name())); 
			gcocloudhwbPo.setHwb(dataObject.getString(GcocloudhwbPo.COLUMNS.HWB.name())); 
			gcocloudhwbPo.setExpbagno(dataObject.getString(GcocloudhwbPo.COLUMNS.EXPBAGNO.name())); 
			gcocloudhwbPo.setDeclno(dataObject.getString(GcocloudhwbPo.COLUMNS.DECLNO.name())); 
			gcocloudhwbPo.setDecltype(dataObject.getString(GcocloudhwbPo.COLUMNS.DECLTYPE.name())); 
			gcocloudhwbPo.setExpressid(dataObject.getString(GcocloudhwbPo.COLUMNS.EXPRESSID.name())); 
			gcocloudhwbPo.setBoxno(dataObject.getString(GcocloudhwbPo.COLUMNS.BOXNO.name())); 
			gcocloudhwbPo.setResultCode(dataObject.getString(GcocloudhwbPo.COLUMNS.RESULT_CODE.name())); 
			gcocloudhwbPo.setClearancetype(dataObject.getString(GcocloudhwbPo.COLUMNS.CLEARANCETYPE.name())); 
			gcocloudhwbPo.setChws(dataObject.getString(GcocloudhwbPo.COLUMNS.CHWS.name())); 
			gcocloudhwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.PIECE.name()))); 
			gcocloudhwbPo.setBaghwb(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.BAGHWB.name()))); 
			gcocloudhwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCIWEIGHT.name()))); 
			gcocloudhwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCIPIECE.name()))); 
			gcocloudhwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCIDATE1.name()))); 
			gcocloudhwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCIDATE2.name()))); 
			gcocloudhwbPo.setGciws(dataObject.getString(GcocloudhwbPo.COLUMNS.GCIWS.name())); 
			gcocloudhwbPo.setGciuser(dataObject.getString(GcocloudhwbPo.COLUMNS.GCIUSER.name())); 
			gcocloudhwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCOPIECE.name()))); 
			gcocloudhwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCODATE1.name()))); 
			gcocloudhwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCODATE2.name()))); 
			gcocloudhwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.GCOBAGSN.name()))); 
			gcocloudhwbPo.setGcows(dataObject.getString(GcocloudhwbPo.COLUMNS.GCOWS.name())); 
			gcocloudhwbPo.setGcouser(dataObject.getString(GcocloudhwbPo.COLUMNS.GCOUSER.name())); 
			gcocloudhwbPo.setAirlineid(dataObject.getString(GcocloudhwbPo.COLUMNS.AIRLINEID.name())); 
			gcocloudhwbPo.setFlightno(dataObject.getString(GcocloudhwbPo.COLUMNS.FLIGHTNO.name())); 
			gcocloudhwbPo.setFlightdest(dataObject.getString(GcocloudhwbPo.COLUMNS.FLIGHTDEST.name())); 
			gcocloudhwbPo.setChargebox(dataObject.getString(GcocloudhwbPo.COLUMNS.CHARGEBOX.name())); 
			gcocloudhwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.CHARGEDATE.name()))); 
			gcocloudhwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.PRINTDUTY.name()))); 
			gcocloudhwbPo.setPrintuser(dataObject.getString(GcocloudhwbPo.COLUMNS.PRINTUSER.name())); 
			gcocloudhwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(GcocloudhwbPo.COLUMNS.PRINTSN.name()))); 
			gcocloudhwbPo.setLastdeclno(dataObject.getString(GcocloudhwbPo.COLUMNS.LASTDECLNO.name())); 
			gcocloudhwbPo.setLastdecltype(dataObject.getString(GcocloudhwbPo.COLUMNS.LASTDECLTYPE.name())); 
			gcocloudhwbPo.setWorkarea(dataObject.getString(GcocloudhwbPo.COLUMNS.WORKAREA.name())); 
			gcocloudhwbPo.setExpreowner(dataObject.getString(GcocloudhwbPo.COLUMNS.EXPREOWNER.name())); 
			gcocloudhwbPo.setIsopen(dataObject.getString(GcocloudhwbPo.COLUMNS.ISOPEN.name())); 
			gcocloudhwbPo.setIschg(dataObject.getString(GcocloudhwbPo.COLUMNS.ISCHG.name())); 
			gcocloudhwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcocloudhwbPo.COLUMNS.LASTUPDATE.name()))); 
			return gcocloudhwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcocloudhwbPo gcocloudhwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.IE.name(), gcocloudhwbPo.getIe()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.MWB.name(), gcocloudhwbPo.getMwb()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.HWB.name(), gcocloudhwbPo.getHwb()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.EXPBAGNO.name(), gcocloudhwbPo.getExpbagno()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.DECLNO.name(), gcocloudhwbPo.getDeclno()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.DECLTYPE.name(), gcocloudhwbPo.getDecltype()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.EXPRESSID.name(), gcocloudhwbPo.getExpressid()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.BOXNO.name(), gcocloudhwbPo.getBoxno()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.RESULT_CODE.name(), gcocloudhwbPo.getResultCode()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.CLEARANCETYPE.name(), gcocloudhwbPo.getClearancetype()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.CHWS.name(), gcocloudhwbPo.getChws()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.PIECE.name(), gcocloudhwbPo.getPiece()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.BAGHWB.name(), gcocloudhwbPo.getBaghwb()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIWEIGHT.name(), gcocloudhwbPo.getGciweight()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIPIECE.name(), gcocloudhwbPo.getGcipiece()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIDATE1.name(), gcocloudhwbPo.getGcidate1()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIDATE2.name(), gcocloudhwbPo.getGcidate2()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIWS.name(), gcocloudhwbPo.getGciws()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCIUSER.name(), gcocloudhwbPo.getGciuser()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCOPIECE.name(), gcocloudhwbPo.getGcopiece()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCODATE1.name(), gcocloudhwbPo.getGcodate1()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCODATE2.name(), gcocloudhwbPo.getGcodate2()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCOBAGSN.name(), gcocloudhwbPo.getGcobagsn()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCOWS.name(), gcocloudhwbPo.getGcows()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.GCOUSER.name(), gcocloudhwbPo.getGcouser()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.AIRLINEID.name(), gcocloudhwbPo.getAirlineid()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.FLIGHTNO.name(), gcocloudhwbPo.getFlightno()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.FLIGHTDEST.name(), gcocloudhwbPo.getFlightdest()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.CHARGEBOX.name(), gcocloudhwbPo.getChargebox()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.CHARGEDATE.name(), gcocloudhwbPo.getChargedate()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.PRINTDUTY.name(), gcocloudhwbPo.getPrintduty()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.PRINTUSER.name(), gcocloudhwbPo.getPrintuser()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.PRINTSN.name(), gcocloudhwbPo.getPrintsn()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.LASTDECLNO.name(), gcocloudhwbPo.getLastdeclno()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.LASTDECLTYPE.name(), gcocloudhwbPo.getLastdecltype()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.WORKAREA.name(), gcocloudhwbPo.getWorkarea()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.EXPREOWNER.name(), gcocloudhwbPo.getExpreowner()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.ISOPEN.name(), gcocloudhwbPo.getIsopen()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.ISCHG.name(), gcocloudhwbPo.getIschg()); 
			dataObject.setValue(GcocloudhwbPo.COLUMNS.LASTUPDATE.name(), gcocloudhwbPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcocloudhwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcocloudhwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
