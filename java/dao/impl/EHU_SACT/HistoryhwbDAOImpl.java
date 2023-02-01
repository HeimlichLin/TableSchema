package com.doc.common.dao.impl; 
 
public class HistoryhwbDAOImpl extends GeneralDAOImpl<HistoryhwbPo> implements HistoryhwbDAO { 
	public static final HistoryhwbDAOImpl INSTANCE = new HistoryhwbDAOImpl(); 
	public static final String TABLENAME = "HISTORYHWB"; 

	public HistoryhwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistoryhwbPo> CONVERTER = new MapConverter<HistoryhwbPo>() { 
 
		@Override 
		public HistoryhwbPo convert(final DataObject dataObject) { 
			final HistoryhwbPo historyhwbPo = new HistoryhwbPo(); 
			historyhwbPo.setBagno(dataObject.getString(HistoryhwbPo.COLUMNS.BAGNO.name())); 
			historyhwbPo.setDeclno(dataObject.getString(HistoryhwbPo.COLUMNS.DECLNO.name())); 
			historyhwbPo.setDecltype(dataObject.getString(HistoryhwbPo.COLUMNS.DECLTYPE.name())); 
			historyhwbPo.setMwb(dataObject.getString(HistoryhwbPo.COLUMNS.MWB.name())); 
			historyhwbPo.setHwb(dataObject.getString(HistoryhwbPo.COLUMNS.HWB.name())); 
			historyhwbPo.setBoxno(dataObject.getString(HistoryhwbPo.COLUMNS.BOXNO.name())); 
			historyhwbPo.setClearancetype(dataObject.getString(HistoryhwbPo.COLUMNS.CLEARANCETYPE.name())); 
			historyhwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.RELEASETIME.name()))); 
			historyhwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.CANCELRELEASE.name()))); 
			historyhwbPo.setManuclearancetype(dataObject.getString(HistoryhwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			historyhwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.PIECE.name()))); 
			historyhwbPo.setUnit(dataObject.getString(HistoryhwbPo.COLUMNS.UNIT.name())); 
			historyhwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.WEIGHT.name()))); 
			historyhwbPo.setIndicator(dataObject.getString(HistoryhwbPo.COLUMNS.INDICATOR.name())); 
			historyhwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			historyhwbPo.setExaminationnote(dataObject.getString(HistoryhwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			historyhwbPo.setIe(dataObject.getString(HistoryhwbPo.COLUMNS.IE.name())); 
			historyhwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.GCIPIECE.name()))); 
			historyhwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.GCIDATE1.name()))); 
			historyhwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.GCIDATE2.name()))); 
			historyhwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.GCIWEIGHT.name()))); 
			historyhwbPo.setChws(dataObject.getString(HistoryhwbPo.COLUMNS.CHWS.name())); 
			historyhwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.GCOPIECE.name()))); 
			historyhwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.GCODATE1.name()))); 
			historyhwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.GCODATE2.name()))); 
			historyhwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.GCOBAGSN.name()))); 
			historyhwbPo.setClosemark(dataObject.getString(HistoryhwbPo.COLUMNS.CLOSEMARK.name())); 
			historyhwbPo.setExpressid(dataObject.getString(HistoryhwbPo.COLUMNS.EXPRESSID.name())); 
			historyhwbPo.setAirlineid(dataObject.getString(HistoryhwbPo.COLUMNS.AIRLINEID.name())); 
			historyhwbPo.setFlightno(dataObject.getString(HistoryhwbPo.COLUMNS.FLIGHTNO.name())); 
			historyhwbPo.setFlightdest(dataObject.getString(HistoryhwbPo.COLUMNS.FLIGHTDEST.name())); 
			historyhwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.FLIGHTDATE.name()))); 
			historyhwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.CANCELGCO.name()))); 
			historyhwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.LASTUPDATE.name()))); 
			historyhwbPo.setHoldarea(dataObject.getString(HistoryhwbPo.COLUMNS.HOLDAREA.name())); 
			historyhwbPo.setHoldreason(dataObject.getString(HistoryhwbPo.COLUMNS.HOLDREASON.name())); 
			historyhwbPo.setExpbagno(dataObject.getString(HistoryhwbPo.COLUMNS.EXPBAGNO.name())); 
			historyhwbPo.setGciws(dataObject.getString(HistoryhwbPo.COLUMNS.GCIWS.name())); 
			historyhwbPo.setGciuser(dataObject.getString(HistoryhwbPo.COLUMNS.GCIUSER.name())); 
			historyhwbPo.setGcows(dataObject.getString(HistoryhwbPo.COLUMNS.GCOWS.name())); 
			historyhwbPo.setGcouser(dataObject.getString(HistoryhwbPo.COLUMNS.GCOUSER.name())); 
			historyhwbPo.setChargebox(dataObject.getString(HistoryhwbPo.COLUMNS.CHARGEBOX.name())); 
			historyhwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.CHARGEDATE.name()))); 
			historyhwbPo.setFrozen(dataObject.getString(HistoryhwbPo.COLUMNS.FROZEN.name())); 
			historyhwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(HistoryhwbPo.COLUMNS.PRINTDUTY.name()))); 
			historyhwbPo.setPrintuser(dataObject.getString(HistoryhwbPo.COLUMNS.PRINTUSER.name())); 
			historyhwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(HistoryhwbPo.COLUMNS.PRINTSN.name()))); 
			return historyhwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistoryhwbPo historyhwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.BAGNO.name(), historyhwbPo.getBagno()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.DECLNO.name(), historyhwbPo.getDeclno()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.DECLTYPE.name(), historyhwbPo.getDecltype()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.MWB.name(), historyhwbPo.getMwb()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.HWB.name(), historyhwbPo.getHwb()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.BOXNO.name(), historyhwbPo.getBoxno()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CLEARANCETYPE.name(), historyhwbPo.getClearancetype()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.RELEASETIME.name(), historyhwbPo.getReleasetime()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CANCELRELEASE.name(), historyhwbPo.getCancelrelease()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.MANUCLEARANCETYPE.name(), historyhwbPo.getManuclearancetype()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.PIECE.name(), historyhwbPo.getPiece()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.UNIT.name(), historyhwbPo.getUnit()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.WEIGHT.name(), historyhwbPo.getWeight()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.INDICATOR.name(), historyhwbPo.getIndicator()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.DUTYPAYMENT.name(), historyhwbPo.getDutypayment()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.EXAMINATIONNOTE.name(), historyhwbPo.getExaminationnote()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.IE.name(), historyhwbPo.getIe()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIPIECE.name(), historyhwbPo.getGcipiece()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIDATE1.name(), historyhwbPo.getGcidate1()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIDATE2.name(), historyhwbPo.getGcidate2()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIWEIGHT.name(), historyhwbPo.getGciweight()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CHWS.name(), historyhwbPo.getChws()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCOPIECE.name(), historyhwbPo.getGcopiece()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCODATE1.name(), historyhwbPo.getGcodate1()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCODATE2.name(), historyhwbPo.getGcodate2()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCOBAGSN.name(), historyhwbPo.getGcobagsn()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CLOSEMARK.name(), historyhwbPo.getClosemark()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.EXPRESSID.name(), historyhwbPo.getExpressid()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.AIRLINEID.name(), historyhwbPo.getAirlineid()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.FLIGHTNO.name(), historyhwbPo.getFlightno()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.FLIGHTDEST.name(), historyhwbPo.getFlightdest()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.FLIGHTDATE.name(), historyhwbPo.getFlightdate()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CANCELGCO.name(), historyhwbPo.getCancelgco()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.LASTUPDATE.name(), historyhwbPo.getLastupdate()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.HOLDAREA.name(), historyhwbPo.getHoldarea()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.HOLDREASON.name(), historyhwbPo.getHoldreason()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.EXPBAGNO.name(), historyhwbPo.getExpbagno()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIWS.name(), historyhwbPo.getGciws()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCIUSER.name(), historyhwbPo.getGciuser()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCOWS.name(), historyhwbPo.getGcows()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.GCOUSER.name(), historyhwbPo.getGcouser()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CHARGEBOX.name(), historyhwbPo.getChargebox()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.CHARGEDATE.name(), historyhwbPo.getChargedate()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.FROZEN.name(), historyhwbPo.getFrozen()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.PRINTDUTY.name(), historyhwbPo.getPrintduty()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.PRINTUSER.name(), historyhwbPo.getPrintuser()); 
			dataObject.setValue(HistoryhwbPo.COLUMNS.PRINTSN.name(), historyhwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistoryhwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistoryhwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
