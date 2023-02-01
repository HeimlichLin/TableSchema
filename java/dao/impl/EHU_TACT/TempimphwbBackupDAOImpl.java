package com.doc.common.dao.impl; 
 
public class TempimphwbBackupDAOImpl extends GeneralDAOImpl<TempimphwbBackupPo> implements TempimphwbBackupDAO { 
	public static final TempimphwbBackupDAOImpl INSTANCE = new TempimphwbBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPHWB_BACKUP"; 

	public TempimphwbBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimphwbBackupPo> CONVERTER = new MapConverter<TempimphwbBackupPo>() { 
 
		@Override 
		public TempimphwbBackupPo convert(final DataObject dataObject) { 
			final TempimphwbBackupPo tempimphwbBackupPo = new TempimphwbBackupPo(); 
			tempimphwbBackupPo.setBagno(dataObject.getString(TempimphwbBackupPo.COLUMNS.BAGNO.name())); 
			tempimphwbBackupPo.setDeclno(dataObject.getString(TempimphwbBackupPo.COLUMNS.DECLNO.name())); 
			tempimphwbBackupPo.setDecltype(dataObject.getString(TempimphwbBackupPo.COLUMNS.DECLTYPE.name())); 
			tempimphwbBackupPo.setMwb(dataObject.getString(TempimphwbBackupPo.COLUMNS.MWB.name())); 
			tempimphwbBackupPo.setHwb(dataObject.getString(TempimphwbBackupPo.COLUMNS.HWB.name())); 
			tempimphwbBackupPo.setBoxno(dataObject.getString(TempimphwbBackupPo.COLUMNS.BOXNO.name())); 
			tempimphwbBackupPo.setClearancetype(dataObject.getString(TempimphwbBackupPo.COLUMNS.CLEARANCETYPE.name())); 
			tempimphwbBackupPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.RELEASETIME.name()))); 
			tempimphwbBackupPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.CANCELRELEASE.name()))); 
			tempimphwbBackupPo.setManuclearancetype(dataObject.getString(TempimphwbBackupPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempimphwbBackupPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.PIECE.name()))); 
			tempimphwbBackupPo.setUnit(dataObject.getString(TempimphwbBackupPo.COLUMNS.UNIT.name())); 
			tempimphwbBackupPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.WEIGHT.name()))); 
			tempimphwbBackupPo.setIndicator(dataObject.getString(TempimphwbBackupPo.COLUMNS.INDICATOR.name())); 
			tempimphwbBackupPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempimphwbBackupPo.setExaminationnote(dataObject.getString(TempimphwbBackupPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempimphwbBackupPo.setIe(dataObject.getString(TempimphwbBackupPo.COLUMNS.IE.name())); 
			tempimphwbBackupPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCIPIECE.name()))); 
			tempimphwbBackupPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCIDATE1.name()))); 
			tempimphwbBackupPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCIDATE2.name()))); 
			tempimphwbBackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimphwbBackupPo.setChws(dataObject.getString(TempimphwbBackupPo.COLUMNS.CHWS.name())); 
			tempimphwbBackupPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCOPIECE.name()))); 
			tempimphwbBackupPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCODATE1.name()))); 
			tempimphwbBackupPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCODATE2.name()))); 
			tempimphwbBackupPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCOBAGSN.name()))); 
			tempimphwbBackupPo.setClosemark(dataObject.getString(TempimphwbBackupPo.COLUMNS.CLOSEMARK.name())); 
			tempimphwbBackupPo.setExpressid(dataObject.getString(TempimphwbBackupPo.COLUMNS.EXPRESSID.name())); 
			tempimphwbBackupPo.setAirlineid(dataObject.getString(TempimphwbBackupPo.COLUMNS.AIRLINEID.name())); 
			tempimphwbBackupPo.setFlightno(dataObject.getString(TempimphwbBackupPo.COLUMNS.FLIGHTNO.name())); 
			tempimphwbBackupPo.setFlightdest(dataObject.getString(TempimphwbBackupPo.COLUMNS.FLIGHTDEST.name())); 
			tempimphwbBackupPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.FLIGHTDATE.name()))); 
			tempimphwbBackupPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.CANCELGCO.name()))); 
			tempimphwbBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.LASTUPDATE.name()))); 
			tempimphwbBackupPo.setHoldarea(dataObject.getString(TempimphwbBackupPo.COLUMNS.HOLDAREA.name())); 
			tempimphwbBackupPo.setHoldreason(dataObject.getString(TempimphwbBackupPo.COLUMNS.HOLDREASON.name())); 
			tempimphwbBackupPo.setExpbagno(dataObject.getString(TempimphwbBackupPo.COLUMNS.EXPBAGNO.name())); 
			tempimphwbBackupPo.setGciws(dataObject.getString(TempimphwbBackupPo.COLUMNS.GCIWS.name())); 
			tempimphwbBackupPo.setGciuser(dataObject.getString(TempimphwbBackupPo.COLUMNS.GCIUSER.name())); 
			tempimphwbBackupPo.setGcows(dataObject.getString(TempimphwbBackupPo.COLUMNS.GCOWS.name())); 
			tempimphwbBackupPo.setGcouser(dataObject.getString(TempimphwbBackupPo.COLUMNS.GCOUSER.name())); 
			tempimphwbBackupPo.setChargebox(dataObject.getString(TempimphwbBackupPo.COLUMNS.CHARGEBOX.name())); 
			tempimphwbBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.CHARGEDATE.name()))); 
			tempimphwbBackupPo.setFrozen(dataObject.getString(TempimphwbBackupPo.COLUMNS.FROZEN.name())); 
			tempimphwbBackupPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.PRINTDUTY.name()))); 
			tempimphwbBackupPo.setPrintuser(dataObject.getString(TempimphwbBackupPo.COLUMNS.PRINTUSER.name())); 
			tempimphwbBackupPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbBackupPo.COLUMNS.PRINTSN.name()))); 
			tempimphwbBackupPo.setGcilock(TimestampUtils.of(dataObject.getValue(TempimphwbBackupPo.COLUMNS.GCILOCK.name()))); 
			tempimphwbBackupPo.setLockuser(dataObject.getString(TempimphwbBackupPo.COLUMNS.LOCKUSER.name())); 
			tempimphwbBackupPo.setLastdeclno(dataObject.getString(TempimphwbBackupPo.COLUMNS.LASTDECLNO.name())); 
			tempimphwbBackupPo.setLastdecltype(dataObject.getString(TempimphwbBackupPo.COLUMNS.LASTDECLTYPE.name())); 
			tempimphwbBackupPo.setWorkarea(dataObject.getString(TempimphwbBackupPo.COLUMNS.WORKAREA.name())); 
			tempimphwbBackupPo.setExpreowner(dataObject.getString(TempimphwbBackupPo.COLUMNS.EXPREOWNER.name())); 
			tempimphwbBackupPo.setCff(dataObject.getString(TempimphwbBackupPo.COLUMNS.CFF.name())); 
			return tempimphwbBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimphwbBackupPo tempimphwbBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.BAGNO.name(), tempimphwbBackupPo.getBagno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.DECLNO.name(), tempimphwbBackupPo.getDeclno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.DECLTYPE.name(), tempimphwbBackupPo.getDecltype()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.MWB.name(), tempimphwbBackupPo.getMwb()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.HWB.name(), tempimphwbBackupPo.getHwb()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.BOXNO.name(), tempimphwbBackupPo.getBoxno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CLEARANCETYPE.name(), tempimphwbBackupPo.getClearancetype()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.RELEASETIME.name(), tempimphwbBackupPo.getReleasetime()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CANCELRELEASE.name(), tempimphwbBackupPo.getCancelrelease()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.MANUCLEARANCETYPE.name(), tempimphwbBackupPo.getManuclearancetype()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.PIECE.name(), tempimphwbBackupPo.getPiece()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.UNIT.name(), tempimphwbBackupPo.getUnit()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.WEIGHT.name(), tempimphwbBackupPo.getWeight()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.INDICATOR.name(), tempimphwbBackupPo.getIndicator()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.DUTYPAYMENT.name(), tempimphwbBackupPo.getDutypayment()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.EXAMINATIONNOTE.name(), tempimphwbBackupPo.getExaminationnote()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.IE.name(), tempimphwbBackupPo.getIe()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIPIECE.name(), tempimphwbBackupPo.getGcipiece()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIDATE1.name(), tempimphwbBackupPo.getGcidate1()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIDATE2.name(), tempimphwbBackupPo.getGcidate2()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIWEIGHT.name(), tempimphwbBackupPo.getGciweight()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CHWS.name(), tempimphwbBackupPo.getChws()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCOPIECE.name(), tempimphwbBackupPo.getGcopiece()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCODATE1.name(), tempimphwbBackupPo.getGcodate1()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCODATE2.name(), tempimphwbBackupPo.getGcodate2()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCOBAGSN.name(), tempimphwbBackupPo.getGcobagsn()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CLOSEMARK.name(), tempimphwbBackupPo.getClosemark()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.EXPRESSID.name(), tempimphwbBackupPo.getExpressid()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.AIRLINEID.name(), tempimphwbBackupPo.getAirlineid()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.FLIGHTNO.name(), tempimphwbBackupPo.getFlightno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.FLIGHTDEST.name(), tempimphwbBackupPo.getFlightdest()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.FLIGHTDATE.name(), tempimphwbBackupPo.getFlightdate()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CANCELGCO.name(), tempimphwbBackupPo.getCancelgco()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.LASTUPDATE.name(), tempimphwbBackupPo.getLastupdate()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.HOLDAREA.name(), tempimphwbBackupPo.getHoldarea()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.HOLDREASON.name(), tempimphwbBackupPo.getHoldreason()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.EXPBAGNO.name(), tempimphwbBackupPo.getExpbagno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIWS.name(), tempimphwbBackupPo.getGciws()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCIUSER.name(), tempimphwbBackupPo.getGciuser()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCOWS.name(), tempimphwbBackupPo.getGcows()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCOUSER.name(), tempimphwbBackupPo.getGcouser()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CHARGEBOX.name(), tempimphwbBackupPo.getChargebox()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CHARGEDATE.name(), tempimphwbBackupPo.getChargedate()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.FROZEN.name(), tempimphwbBackupPo.getFrozen()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.PRINTDUTY.name(), tempimphwbBackupPo.getPrintduty()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.PRINTUSER.name(), tempimphwbBackupPo.getPrintuser()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.PRINTSN.name(), tempimphwbBackupPo.getPrintsn()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.GCILOCK.name(), tempimphwbBackupPo.getGcilock()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.LOCKUSER.name(), tempimphwbBackupPo.getLockuser()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.LASTDECLNO.name(), tempimphwbBackupPo.getLastdeclno()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.LASTDECLTYPE.name(), tempimphwbBackupPo.getLastdecltype()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.WORKAREA.name(), tempimphwbBackupPo.getWorkarea()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.EXPREOWNER.name(), tempimphwbBackupPo.getExpreowner()); 
			dataObject.setValue(TempimphwbBackupPo.COLUMNS.CFF.name(), tempimphwbBackupPo.getCff()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimphwbBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimphwbBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
