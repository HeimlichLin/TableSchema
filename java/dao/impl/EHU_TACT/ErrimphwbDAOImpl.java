package com.doc.common.dao.impl; 
 
public class ErrimphwbDAOImpl extends GeneralDAOImpl<ErrimphwbPo> implements ErrimphwbDAO { 
	public static final ErrimphwbDAOImpl INSTANCE = new ErrimphwbDAOImpl(); 
	public static final String TABLENAME = "ERRIMPHWB"; 

	public ErrimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrimphwbPo> CONVERTER = new MapConverter<ErrimphwbPo>() { 
 
		@Override 
		public ErrimphwbPo convert(final DataObject dataObject) { 
			final ErrimphwbPo errimphwbPo = new ErrimphwbPo(); 
			errimphwbPo.setBagno(dataObject.getString(ErrimphwbPo.COLUMNS.BAGNO.name())); 
			errimphwbPo.setDeclno(dataObject.getString(ErrimphwbPo.COLUMNS.DECLNO.name())); 
			errimphwbPo.setDecltype(dataObject.getString(ErrimphwbPo.COLUMNS.DECLTYPE.name())); 
			errimphwbPo.setMwb(dataObject.getString(ErrimphwbPo.COLUMNS.MWB.name())); 
			errimphwbPo.setHwb(dataObject.getString(ErrimphwbPo.COLUMNS.HWB.name())); 
			errimphwbPo.setBoxno(dataObject.getString(ErrimphwbPo.COLUMNS.BOXNO.name())); 
			errimphwbPo.setClearancetype(dataObject.getString(ErrimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			errimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.RELEASETIME.name()))); 
			errimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			errimphwbPo.setManuclearancetype(dataObject.getString(ErrimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			errimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.PIECE.name()))); 
			errimphwbPo.setUnit(dataObject.getString(ErrimphwbPo.COLUMNS.UNIT.name())); 
			errimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.WEIGHT.name()))); 
			errimphwbPo.setIndicator(dataObject.getString(ErrimphwbPo.COLUMNS.INDICATOR.name())); 
			errimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			errimphwbPo.setExaminationnote(dataObject.getString(ErrimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			errimphwbPo.setIe(dataObject.getString(ErrimphwbPo.COLUMNS.IE.name())); 
			errimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.GCIPIECE.name()))); 
			errimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.GCIDATE1.name()))); 
			errimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.GCIDATE2.name()))); 
			errimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			errimphwbPo.setChws(dataObject.getString(ErrimphwbPo.COLUMNS.CHWS.name())); 
			errimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.GCOPIECE.name()))); 
			errimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.GCODATE1.name()))); 
			errimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.GCODATE2.name()))); 
			errimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			errimphwbPo.setClosemark(dataObject.getString(ErrimphwbPo.COLUMNS.CLOSEMARK.name())); 
			errimphwbPo.setExpressid(dataObject.getString(ErrimphwbPo.COLUMNS.EXPRESSID.name())); 
			errimphwbPo.setAirlineid(dataObject.getString(ErrimphwbPo.COLUMNS.AIRLINEID.name())); 
			errimphwbPo.setFlightno(dataObject.getString(ErrimphwbPo.COLUMNS.FLIGHTNO.name())); 
			errimphwbPo.setFlightdest(dataObject.getString(ErrimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			errimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			errimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.CANCELGCO.name()))); 
			errimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			errimphwbPo.setHoldarea(dataObject.getString(ErrimphwbPo.COLUMNS.HOLDAREA.name())); 
			errimphwbPo.setHoldreason(dataObject.getString(ErrimphwbPo.COLUMNS.HOLDREASON.name())); 
			errimphwbPo.setExpbagno(dataObject.getString(ErrimphwbPo.COLUMNS.EXPBAGNO.name())); 
			errimphwbPo.setGciws(dataObject.getString(ErrimphwbPo.COLUMNS.GCIWS.name())); 
			errimphwbPo.setGciuser(dataObject.getString(ErrimphwbPo.COLUMNS.GCIUSER.name())); 
			errimphwbPo.setGcows(dataObject.getString(ErrimphwbPo.COLUMNS.GCOWS.name())); 
			errimphwbPo.setGcouser(dataObject.getString(ErrimphwbPo.COLUMNS.GCOUSER.name())); 
			errimphwbPo.setChargebox(dataObject.getString(ErrimphwbPo.COLUMNS.CHARGEBOX.name())); 
			errimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			errimphwbPo.setFrozen(dataObject.getString(ErrimphwbPo.COLUMNS.FROZEN.name())); 
			errimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			errimphwbPo.setPrintuser(dataObject.getString(ErrimphwbPo.COLUMNS.PRINTUSER.name())); 
			errimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(ErrimphwbPo.COLUMNS.PRINTSN.name()))); 
			errimphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(ErrimphwbPo.COLUMNS.GCILOCK.name()))); 
			errimphwbPo.setLockuser(dataObject.getString(ErrimphwbPo.COLUMNS.LOCKUSER.name())); 
			errimphwbPo.setLastdeclno(dataObject.getString(ErrimphwbPo.COLUMNS.LASTDECLNO.name())); 
			errimphwbPo.setLastdecltype(dataObject.getString(ErrimphwbPo.COLUMNS.LASTDECLTYPE.name())); 
			return errimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrimphwbPo errimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.BAGNO.name(), errimphwbPo.getBagno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.DECLNO.name(), errimphwbPo.getDeclno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.DECLTYPE.name(), errimphwbPo.getDecltype()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.MWB.name(), errimphwbPo.getMwb()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.HWB.name(), errimphwbPo.getHwb()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.BOXNO.name(), errimphwbPo.getBoxno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CLEARANCETYPE.name(), errimphwbPo.getClearancetype()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.RELEASETIME.name(), errimphwbPo.getReleasetime()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CANCELRELEASE.name(), errimphwbPo.getCancelrelease()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), errimphwbPo.getManuclearancetype()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.PIECE.name(), errimphwbPo.getPiece()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.UNIT.name(), errimphwbPo.getUnit()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.WEIGHT.name(), errimphwbPo.getWeight()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.INDICATOR.name(), errimphwbPo.getIndicator()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.DUTYPAYMENT.name(), errimphwbPo.getDutypayment()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), errimphwbPo.getExaminationnote()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.IE.name(), errimphwbPo.getIe()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIPIECE.name(), errimphwbPo.getGcipiece()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIDATE1.name(), errimphwbPo.getGcidate1()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIDATE2.name(), errimphwbPo.getGcidate2()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIWEIGHT.name(), errimphwbPo.getGciweight()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CHWS.name(), errimphwbPo.getChws()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCOPIECE.name(), errimphwbPo.getGcopiece()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCODATE1.name(), errimphwbPo.getGcodate1()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCODATE2.name(), errimphwbPo.getGcodate2()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCOBAGSN.name(), errimphwbPo.getGcobagsn()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CLOSEMARK.name(), errimphwbPo.getClosemark()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.EXPRESSID.name(), errimphwbPo.getExpressid()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.AIRLINEID.name(), errimphwbPo.getAirlineid()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.FLIGHTNO.name(), errimphwbPo.getFlightno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.FLIGHTDEST.name(), errimphwbPo.getFlightdest()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.FLIGHTDATE.name(), errimphwbPo.getFlightdate()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CANCELGCO.name(), errimphwbPo.getCancelgco()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.LASTUPDATE.name(), errimphwbPo.getLastupdate()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.HOLDAREA.name(), errimphwbPo.getHoldarea()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.HOLDREASON.name(), errimphwbPo.getHoldreason()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.EXPBAGNO.name(), errimphwbPo.getExpbagno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIWS.name(), errimphwbPo.getGciws()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCIUSER.name(), errimphwbPo.getGciuser()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCOWS.name(), errimphwbPo.getGcows()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCOUSER.name(), errimphwbPo.getGcouser()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CHARGEBOX.name(), errimphwbPo.getChargebox()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.CHARGEDATE.name(), errimphwbPo.getChargedate()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.FROZEN.name(), errimphwbPo.getFrozen()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.PRINTDUTY.name(), errimphwbPo.getPrintduty()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.PRINTUSER.name(), errimphwbPo.getPrintuser()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.PRINTSN.name(), errimphwbPo.getPrintsn()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.GCILOCK.name(), errimphwbPo.getGcilock()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.LOCKUSER.name(), errimphwbPo.getLockuser()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.LASTDECLNO.name(), errimphwbPo.getLastdeclno()); 
			dataObject.setValue(ErrimphwbPo.COLUMNS.LASTDECLTYPE.name(), errimphwbPo.getLastdecltype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
