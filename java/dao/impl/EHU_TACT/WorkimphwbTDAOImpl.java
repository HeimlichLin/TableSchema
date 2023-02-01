package com.doc.common.dao.impl; 
 
public class WorkimphwbTDAOImpl extends GeneralDAOImpl<WorkimphwbTPo> implements WorkimphwbTDAO { 
	public static final WorkimphwbTDAOImpl INSTANCE = new WorkimphwbTDAOImpl(); 
	public static final String TABLENAME = "WORKIMPHWB_T"; 

	public WorkimphwbTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimphwbTPo> CONVERTER = new MapConverter<WorkimphwbTPo>() { 
 
		@Override 
		public WorkimphwbTPo convert(final DataObject dataObject) { 
			final WorkimphwbTPo workimphwbTPo = new WorkimphwbTPo(); 
			workimphwbTPo.setBagno(dataObject.getString(WorkimphwbTPo.COLUMNS.BAGNO.name())); 
			workimphwbTPo.setDeclno(dataObject.getString(WorkimphwbTPo.COLUMNS.DECLNO.name())); 
			workimphwbTPo.setDecltype(dataObject.getString(WorkimphwbTPo.COLUMNS.DECLTYPE.name())); 
			workimphwbTPo.setMwb(dataObject.getString(WorkimphwbTPo.COLUMNS.MWB.name())); 
			workimphwbTPo.setHwb(dataObject.getString(WorkimphwbTPo.COLUMNS.HWB.name())); 
			workimphwbTPo.setBoxno(dataObject.getString(WorkimphwbTPo.COLUMNS.BOXNO.name())); 
			workimphwbTPo.setClearancetype(dataObject.getString(WorkimphwbTPo.COLUMNS.CLEARANCETYPE.name())); 
			workimphwbTPo.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.RELEASETIME.name()))); 
			workimphwbTPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.CANCELRELEASE.name()))); 
			workimphwbTPo.setManuclearancetype(dataObject.getString(WorkimphwbTPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			workimphwbTPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.PIECE.name()))); 
			workimphwbTPo.setUnit(dataObject.getString(WorkimphwbTPo.COLUMNS.UNIT.name())); 
			workimphwbTPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.WEIGHT.name()))); 
			workimphwbTPo.setIndicator(dataObject.getString(WorkimphwbTPo.COLUMNS.INDICATOR.name())); 
			workimphwbTPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.DUTYPAYMENT.name()))); 
			workimphwbTPo.setExaminationnote(dataObject.getString(WorkimphwbTPo.COLUMNS.EXAMINATIONNOTE.name())); 
			workimphwbTPo.setIe(dataObject.getString(WorkimphwbTPo.COLUMNS.IE.name())); 
			workimphwbTPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCIPIECE.name()))); 
			workimphwbTPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCIDATE1.name()))); 
			workimphwbTPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCIDATE2.name()))); 
			workimphwbTPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCIWEIGHT.name()))); 
			workimphwbTPo.setChws(dataObject.getString(WorkimphwbTPo.COLUMNS.CHWS.name())); 
			workimphwbTPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCOPIECE.name()))); 
			workimphwbTPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCODATE1.name()))); 
			workimphwbTPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCODATE2.name()))); 
			workimphwbTPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCOBAGSN.name()))); 
			workimphwbTPo.setClosemark(dataObject.getString(WorkimphwbTPo.COLUMNS.CLOSEMARK.name())); 
			workimphwbTPo.setExpressid(dataObject.getString(WorkimphwbTPo.COLUMNS.EXPRESSID.name())); 
			workimphwbTPo.setAirlineid(dataObject.getString(WorkimphwbTPo.COLUMNS.AIRLINEID.name())); 
			workimphwbTPo.setFlightno(dataObject.getString(WorkimphwbTPo.COLUMNS.FLIGHTNO.name())); 
			workimphwbTPo.setFlightdest(dataObject.getString(WorkimphwbTPo.COLUMNS.FLIGHTDEST.name())); 
			workimphwbTPo.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.FLIGHTDATE.name()))); 
			workimphwbTPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.CANCELGCO.name()))); 
			workimphwbTPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.LASTUPDATE.name()))); 
			workimphwbTPo.setHoldarea(dataObject.getString(WorkimphwbTPo.COLUMNS.HOLDAREA.name())); 
			workimphwbTPo.setHoldreason(dataObject.getString(WorkimphwbTPo.COLUMNS.HOLDREASON.name())); 
			workimphwbTPo.setExpbagno(dataObject.getString(WorkimphwbTPo.COLUMNS.EXPBAGNO.name())); 
			workimphwbTPo.setGciws(dataObject.getString(WorkimphwbTPo.COLUMNS.GCIWS.name())); 
			workimphwbTPo.setGciuser(dataObject.getString(WorkimphwbTPo.COLUMNS.GCIUSER.name())); 
			workimphwbTPo.setGcows(dataObject.getString(WorkimphwbTPo.COLUMNS.GCOWS.name())); 
			workimphwbTPo.setGcouser(dataObject.getString(WorkimphwbTPo.COLUMNS.GCOUSER.name())); 
			workimphwbTPo.setChargebox(dataObject.getString(WorkimphwbTPo.COLUMNS.CHARGEBOX.name())); 
			workimphwbTPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.CHARGEDATE.name()))); 
			workimphwbTPo.setFrozen(dataObject.getString(WorkimphwbTPo.COLUMNS.FROZEN.name())); 
			workimphwbTPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.PRINTDUTY.name()))); 
			workimphwbTPo.setPrintuser(dataObject.getString(WorkimphwbTPo.COLUMNS.PRINTUSER.name())); 
			workimphwbTPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTPo.COLUMNS.PRINTSN.name()))); 
			workimphwbTPo.setGcilock(TimestampUtils.of(dataObject.getValue(WorkimphwbTPo.COLUMNS.GCILOCK.name()))); 
			workimphwbTPo.setLockuser(dataObject.getString(WorkimphwbTPo.COLUMNS.LOCKUSER.name())); 
			workimphwbTPo.setLastdeclno(dataObject.getString(WorkimphwbTPo.COLUMNS.LASTDECLNO.name())); 
			workimphwbTPo.setLastdecltype(dataObject.getString(WorkimphwbTPo.COLUMNS.LASTDECLTYPE.name())); 
			return workimphwbTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimphwbTPo workimphwbTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.BAGNO.name(), workimphwbTPo.getBagno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.DECLNO.name(), workimphwbTPo.getDeclno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.DECLTYPE.name(), workimphwbTPo.getDecltype()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.MWB.name(), workimphwbTPo.getMwb()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.HWB.name(), workimphwbTPo.getHwb()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.BOXNO.name(), workimphwbTPo.getBoxno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CLEARANCETYPE.name(), workimphwbTPo.getClearancetype()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.RELEASETIME.name(), workimphwbTPo.getReleasetime()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CANCELRELEASE.name(), workimphwbTPo.getCancelrelease()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.MANUCLEARANCETYPE.name(), workimphwbTPo.getManuclearancetype()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.PIECE.name(), workimphwbTPo.getPiece()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.UNIT.name(), workimphwbTPo.getUnit()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.WEIGHT.name(), workimphwbTPo.getWeight()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.INDICATOR.name(), workimphwbTPo.getIndicator()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.DUTYPAYMENT.name(), workimphwbTPo.getDutypayment()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.EXAMINATIONNOTE.name(), workimphwbTPo.getExaminationnote()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.IE.name(), workimphwbTPo.getIe()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIPIECE.name(), workimphwbTPo.getGcipiece()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIDATE1.name(), workimphwbTPo.getGcidate1()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIDATE2.name(), workimphwbTPo.getGcidate2()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIWEIGHT.name(), workimphwbTPo.getGciweight()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CHWS.name(), workimphwbTPo.getChws()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCOPIECE.name(), workimphwbTPo.getGcopiece()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCODATE1.name(), workimphwbTPo.getGcodate1()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCODATE2.name(), workimphwbTPo.getGcodate2()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCOBAGSN.name(), workimphwbTPo.getGcobagsn()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CLOSEMARK.name(), workimphwbTPo.getClosemark()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.EXPRESSID.name(), workimphwbTPo.getExpressid()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.AIRLINEID.name(), workimphwbTPo.getAirlineid()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.FLIGHTNO.name(), workimphwbTPo.getFlightno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.FLIGHTDEST.name(), workimphwbTPo.getFlightdest()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.FLIGHTDATE.name(), workimphwbTPo.getFlightdate()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CANCELGCO.name(), workimphwbTPo.getCancelgco()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.LASTUPDATE.name(), workimphwbTPo.getLastupdate()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.HOLDAREA.name(), workimphwbTPo.getHoldarea()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.HOLDREASON.name(), workimphwbTPo.getHoldreason()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.EXPBAGNO.name(), workimphwbTPo.getExpbagno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIWS.name(), workimphwbTPo.getGciws()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCIUSER.name(), workimphwbTPo.getGciuser()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCOWS.name(), workimphwbTPo.getGcows()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCOUSER.name(), workimphwbTPo.getGcouser()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CHARGEBOX.name(), workimphwbTPo.getChargebox()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.CHARGEDATE.name(), workimphwbTPo.getChargedate()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.FROZEN.name(), workimphwbTPo.getFrozen()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.PRINTDUTY.name(), workimphwbTPo.getPrintduty()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.PRINTUSER.name(), workimphwbTPo.getPrintuser()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.PRINTSN.name(), workimphwbTPo.getPrintsn()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.GCILOCK.name(), workimphwbTPo.getGcilock()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.LOCKUSER.name(), workimphwbTPo.getLockuser()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.LASTDECLNO.name(), workimphwbTPo.getLastdeclno()); 
			dataObject.setValue(WorkimphwbTPo.COLUMNS.LASTDECLTYPE.name(), workimphwbTPo.getLastdecltype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimphwbTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimphwbTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
