package com.doc.common.dao.impl; 
 
public class MigimphwbDAOImpl extends GeneralDAOImpl<MigimphwbPo> implements MigimphwbDAO { 
	public static final MigimphwbDAOImpl INSTANCE = new MigimphwbDAOImpl(); 
	public static final String TABLENAME = "MIGIMPHWB"; 

	public MigimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MigimphwbPo> CONVERTER = new MapConverter<MigimphwbPo>() { 
 
		@Override 
		public MigimphwbPo convert(final DataObject dataObject) { 
			final MigimphwbPo migimphwbPo = new MigimphwbPo(); 
			migimphwbPo.setBagno(dataObject.getString(MigimphwbPo.COLUMNS.BAGNO.name())); 
			migimphwbPo.setDeclno(dataObject.getString(MigimphwbPo.COLUMNS.DECLNO.name())); 
			migimphwbPo.setDecltype(dataObject.getString(MigimphwbPo.COLUMNS.DECLTYPE.name())); 
			migimphwbPo.setMwb(dataObject.getString(MigimphwbPo.COLUMNS.MWB.name())); 
			migimphwbPo.setHwb(dataObject.getString(MigimphwbPo.COLUMNS.HWB.name())); 
			migimphwbPo.setBoxno(dataObject.getString(MigimphwbPo.COLUMNS.BOXNO.name())); 
			migimphwbPo.setClearancetype(dataObject.getString(MigimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			migimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.RELEASETIME.name()))); 
			migimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			migimphwbPo.setManuclearancetype(dataObject.getString(MigimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			migimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.PIECE.name()))); 
			migimphwbPo.setUnit(dataObject.getString(MigimphwbPo.COLUMNS.UNIT.name())); 
			migimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.WEIGHT.name()))); 
			migimphwbPo.setIndicator(dataObject.getString(MigimphwbPo.COLUMNS.INDICATOR.name())); 
			migimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			migimphwbPo.setExaminationnote(dataObject.getString(MigimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			migimphwbPo.setIe(dataObject.getString(MigimphwbPo.COLUMNS.IE.name())); 
			migimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.GCIPIECE.name()))); 
			migimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.GCIDATE1.name()))); 
			migimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.GCIDATE2.name()))); 
			migimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			migimphwbPo.setChws(dataObject.getString(MigimphwbPo.COLUMNS.CHWS.name())); 
			migimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.GCOPIECE.name()))); 
			migimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.GCODATE1.name()))); 
			migimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.GCODATE2.name()))); 
			migimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			migimphwbPo.setClosemark(dataObject.getString(MigimphwbPo.COLUMNS.CLOSEMARK.name())); 
			migimphwbPo.setExpressid(dataObject.getString(MigimphwbPo.COLUMNS.EXPRESSID.name())); 
			migimphwbPo.setAirlineid(dataObject.getString(MigimphwbPo.COLUMNS.AIRLINEID.name())); 
			migimphwbPo.setFlightno(dataObject.getString(MigimphwbPo.COLUMNS.FLIGHTNO.name())); 
			migimphwbPo.setFlightdest(dataObject.getString(MigimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			migimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			migimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.CANCELGCO.name()))); 
			migimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			migimphwbPo.setHoldarea(dataObject.getString(MigimphwbPo.COLUMNS.HOLDAREA.name())); 
			migimphwbPo.setHoldreason(dataObject.getString(MigimphwbPo.COLUMNS.HOLDREASON.name())); 
			migimphwbPo.setExpbagno(dataObject.getString(MigimphwbPo.COLUMNS.EXPBAGNO.name())); 
			migimphwbPo.setGciws(dataObject.getString(MigimphwbPo.COLUMNS.GCIWS.name())); 
			migimphwbPo.setGciuser(dataObject.getString(MigimphwbPo.COLUMNS.GCIUSER.name())); 
			migimphwbPo.setGcows(dataObject.getString(MigimphwbPo.COLUMNS.GCOWS.name())); 
			migimphwbPo.setGcouser(dataObject.getString(MigimphwbPo.COLUMNS.GCOUSER.name())); 
			migimphwbPo.setChargebox(dataObject.getString(MigimphwbPo.COLUMNS.CHARGEBOX.name())); 
			migimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			migimphwbPo.setFrozen(dataObject.getString(MigimphwbPo.COLUMNS.FROZEN.name())); 
			migimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			migimphwbPo.setPrintuser(dataObject.getString(MigimphwbPo.COLUMNS.PRINTUSER.name())); 
			migimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(MigimphwbPo.COLUMNS.PRINTSN.name()))); 
			migimphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(MigimphwbPo.COLUMNS.GCILOCK.name()))); 
			migimphwbPo.setLockuser(dataObject.getString(MigimphwbPo.COLUMNS.LOCKUSER.name())); 
			return migimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MigimphwbPo migimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MigimphwbPo.COLUMNS.BAGNO.name(), migimphwbPo.getBagno()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.DECLNO.name(), migimphwbPo.getDeclno()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.DECLTYPE.name(), migimphwbPo.getDecltype()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.MWB.name(), migimphwbPo.getMwb()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.HWB.name(), migimphwbPo.getHwb()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.BOXNO.name(), migimphwbPo.getBoxno()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CLEARANCETYPE.name(), migimphwbPo.getClearancetype()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.RELEASETIME.name(), migimphwbPo.getReleasetime()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CANCELRELEASE.name(), migimphwbPo.getCancelrelease()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), migimphwbPo.getManuclearancetype()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.PIECE.name(), migimphwbPo.getPiece()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.UNIT.name(), migimphwbPo.getUnit()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.WEIGHT.name(), migimphwbPo.getWeight()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.INDICATOR.name(), migimphwbPo.getIndicator()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.DUTYPAYMENT.name(), migimphwbPo.getDutypayment()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), migimphwbPo.getExaminationnote()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.IE.name(), migimphwbPo.getIe()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIPIECE.name(), migimphwbPo.getGcipiece()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIDATE1.name(), migimphwbPo.getGcidate1()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIDATE2.name(), migimphwbPo.getGcidate2()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIWEIGHT.name(), migimphwbPo.getGciweight()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CHWS.name(), migimphwbPo.getChws()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCOPIECE.name(), migimphwbPo.getGcopiece()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCODATE1.name(), migimphwbPo.getGcodate1()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCODATE2.name(), migimphwbPo.getGcodate2()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCOBAGSN.name(), migimphwbPo.getGcobagsn()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CLOSEMARK.name(), migimphwbPo.getClosemark()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.EXPRESSID.name(), migimphwbPo.getExpressid()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.AIRLINEID.name(), migimphwbPo.getAirlineid()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.FLIGHTNO.name(), migimphwbPo.getFlightno()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.FLIGHTDEST.name(), migimphwbPo.getFlightdest()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.FLIGHTDATE.name(), migimphwbPo.getFlightdate()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CANCELGCO.name(), migimphwbPo.getCancelgco()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.LASTUPDATE.name(), migimphwbPo.getLastupdate()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.HOLDAREA.name(), migimphwbPo.getHoldarea()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.HOLDREASON.name(), migimphwbPo.getHoldreason()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.EXPBAGNO.name(), migimphwbPo.getExpbagno()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIWS.name(), migimphwbPo.getGciws()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCIUSER.name(), migimphwbPo.getGciuser()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCOWS.name(), migimphwbPo.getGcows()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCOUSER.name(), migimphwbPo.getGcouser()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CHARGEBOX.name(), migimphwbPo.getChargebox()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.CHARGEDATE.name(), migimphwbPo.getChargedate()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.FROZEN.name(), migimphwbPo.getFrozen()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.PRINTDUTY.name(), migimphwbPo.getPrintduty()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.PRINTUSER.name(), migimphwbPo.getPrintuser()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.PRINTSN.name(), migimphwbPo.getPrintsn()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.GCILOCK.name(), migimphwbPo.getGcilock()); 
			dataObject.setValue(MigimphwbPo.COLUMNS.LOCKUSER.name(), migimphwbPo.getLockuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MigimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MigimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
