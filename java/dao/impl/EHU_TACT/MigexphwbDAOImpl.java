package com.doc.common.dao.impl; 
 
public class MigexphwbDAOImpl extends GeneralDAOImpl<MigexphwbPo> implements MigexphwbDAO { 
	public static final MigexphwbDAOImpl INSTANCE = new MigexphwbDAOImpl(); 
	public static final String TABLENAME = "MIGEXPHWB"; 

	public MigexphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MigexphwbPo> CONVERTER = new MapConverter<MigexphwbPo>() { 
 
		@Override 
		public MigexphwbPo convert(final DataObject dataObject) { 
			final MigexphwbPo migexphwbPo = new MigexphwbPo(); 
			migexphwbPo.setBagno(dataObject.getString(MigexphwbPo.COLUMNS.BAGNO.name())); 
			migexphwbPo.setDeclno(dataObject.getString(MigexphwbPo.COLUMNS.DECLNO.name())); 
			migexphwbPo.setDecltype(dataObject.getString(MigexphwbPo.COLUMNS.DECLTYPE.name())); 
			migexphwbPo.setMwb(dataObject.getString(MigexphwbPo.COLUMNS.MWB.name())); 
			migexphwbPo.setHwb(dataObject.getString(MigexphwbPo.COLUMNS.HWB.name())); 
			migexphwbPo.setBoxno(dataObject.getString(MigexphwbPo.COLUMNS.BOXNO.name())); 
			migexphwbPo.setClearancetype(dataObject.getString(MigexphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			migexphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.RELEASETIME.name()))); 
			migexphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			migexphwbPo.setManuclearancetype(dataObject.getString(MigexphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			migexphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.PIECE.name()))); 
			migexphwbPo.setUnit(dataObject.getString(MigexphwbPo.COLUMNS.UNIT.name())); 
			migexphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.WEIGHT.name()))); 
			migexphwbPo.setIndicator(dataObject.getString(MigexphwbPo.COLUMNS.INDICATOR.name())); 
			migexphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			migexphwbPo.setExaminationnote(dataObject.getString(MigexphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			migexphwbPo.setIe(dataObject.getString(MigexphwbPo.COLUMNS.IE.name())); 
			migexphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.GCIPIECE.name()))); 
			migexphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.GCIDATE1.name()))); 
			migexphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.GCIDATE2.name()))); 
			migexphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			migexphwbPo.setChws(dataObject.getString(MigexphwbPo.COLUMNS.CHWS.name())); 
			migexphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.GCOPIECE.name()))); 
			migexphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.GCODATE1.name()))); 
			migexphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.GCODATE2.name()))); 
			migexphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.GCOBAGSN.name()))); 
			migexphwbPo.setClosemark(dataObject.getString(MigexphwbPo.COLUMNS.CLOSEMARK.name())); 
			migexphwbPo.setExpressid(dataObject.getString(MigexphwbPo.COLUMNS.EXPRESSID.name())); 
			migexphwbPo.setAirlineid(dataObject.getString(MigexphwbPo.COLUMNS.AIRLINEID.name())); 
			migexphwbPo.setFlightno(dataObject.getString(MigexphwbPo.COLUMNS.FLIGHTNO.name())); 
			migexphwbPo.setFlightdest(dataObject.getString(MigexphwbPo.COLUMNS.FLIGHTDEST.name())); 
			migexphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			migexphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.CANCELGCO.name()))); 
			migexphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.LASTUPDATE.name()))); 
			migexphwbPo.setHoldarea(dataObject.getString(MigexphwbPo.COLUMNS.HOLDAREA.name())); 
			migexphwbPo.setHoldreason(dataObject.getString(MigexphwbPo.COLUMNS.HOLDREASON.name())); 
			migexphwbPo.setExpbagno(dataObject.getString(MigexphwbPo.COLUMNS.EXPBAGNO.name())); 
			migexphwbPo.setGciws(dataObject.getString(MigexphwbPo.COLUMNS.GCIWS.name())); 
			migexphwbPo.setGciuser(dataObject.getString(MigexphwbPo.COLUMNS.GCIUSER.name())); 
			migexphwbPo.setGcows(dataObject.getString(MigexphwbPo.COLUMNS.GCOWS.name())); 
			migexphwbPo.setGcouser(dataObject.getString(MigexphwbPo.COLUMNS.GCOUSER.name())); 
			migexphwbPo.setChargebox(dataObject.getString(MigexphwbPo.COLUMNS.CHARGEBOX.name())); 
			migexphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.CHARGEDATE.name()))); 
			migexphwbPo.setFrozen(dataObject.getString(MigexphwbPo.COLUMNS.FROZEN.name())); 
			migexphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.PRINTDUTY.name()))); 
			migexphwbPo.setPrintuser(dataObject.getString(MigexphwbPo.COLUMNS.PRINTUSER.name())); 
			migexphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(MigexphwbPo.COLUMNS.PRINTSN.name()))); 
			migexphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(MigexphwbPo.COLUMNS.GCILOCK.name()))); 
			migexphwbPo.setLockuser(dataObject.getString(MigexphwbPo.COLUMNS.LOCKUSER.name())); 
			return migexphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MigexphwbPo migexphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MigexphwbPo.COLUMNS.BAGNO.name(), migexphwbPo.getBagno()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.DECLNO.name(), migexphwbPo.getDeclno()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.DECLTYPE.name(), migexphwbPo.getDecltype()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.MWB.name(), migexphwbPo.getMwb()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.HWB.name(), migexphwbPo.getHwb()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.BOXNO.name(), migexphwbPo.getBoxno()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CLEARANCETYPE.name(), migexphwbPo.getClearancetype()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.RELEASETIME.name(), migexphwbPo.getReleasetime()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CANCELRELEASE.name(), migexphwbPo.getCancelrelease()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), migexphwbPo.getManuclearancetype()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.PIECE.name(), migexphwbPo.getPiece()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.UNIT.name(), migexphwbPo.getUnit()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.WEIGHT.name(), migexphwbPo.getWeight()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.INDICATOR.name(), migexphwbPo.getIndicator()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.DUTYPAYMENT.name(), migexphwbPo.getDutypayment()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.EXAMINATIONNOTE.name(), migexphwbPo.getExaminationnote()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.IE.name(), migexphwbPo.getIe()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIPIECE.name(), migexphwbPo.getGcipiece()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIDATE1.name(), migexphwbPo.getGcidate1()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIDATE2.name(), migexphwbPo.getGcidate2()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIWEIGHT.name(), migexphwbPo.getGciweight()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CHWS.name(), migexphwbPo.getChws()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCOPIECE.name(), migexphwbPo.getGcopiece()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCODATE1.name(), migexphwbPo.getGcodate1()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCODATE2.name(), migexphwbPo.getGcodate2()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCOBAGSN.name(), migexphwbPo.getGcobagsn()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CLOSEMARK.name(), migexphwbPo.getClosemark()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.EXPRESSID.name(), migexphwbPo.getExpressid()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.AIRLINEID.name(), migexphwbPo.getAirlineid()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.FLIGHTNO.name(), migexphwbPo.getFlightno()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.FLIGHTDEST.name(), migexphwbPo.getFlightdest()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.FLIGHTDATE.name(), migexphwbPo.getFlightdate()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CANCELGCO.name(), migexphwbPo.getCancelgco()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.LASTUPDATE.name(), migexphwbPo.getLastupdate()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.HOLDAREA.name(), migexphwbPo.getHoldarea()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.HOLDREASON.name(), migexphwbPo.getHoldreason()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.EXPBAGNO.name(), migexphwbPo.getExpbagno()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIWS.name(), migexphwbPo.getGciws()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCIUSER.name(), migexphwbPo.getGciuser()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCOWS.name(), migexphwbPo.getGcows()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCOUSER.name(), migexphwbPo.getGcouser()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CHARGEBOX.name(), migexphwbPo.getChargebox()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.CHARGEDATE.name(), migexphwbPo.getChargedate()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.FROZEN.name(), migexphwbPo.getFrozen()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.PRINTDUTY.name(), migexphwbPo.getPrintduty()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.PRINTUSER.name(), migexphwbPo.getPrintuser()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.PRINTSN.name(), migexphwbPo.getPrintsn()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.GCILOCK.name(), migexphwbPo.getGcilock()); 
			dataObject.setValue(MigexphwbPo.COLUMNS.LOCKUSER.name(), migexphwbPo.getLockuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MigexphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MigexphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
