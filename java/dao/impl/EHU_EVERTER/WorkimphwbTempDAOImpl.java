package com.doc.common.dao.impl; 
 
public class WorkimphwbTempDAOImpl extends GeneralDAOImpl<WorkimphwbTempPo> implements WorkimphwbTempDAO { 
	public static final WorkimphwbTempDAOImpl INSTANCE = new WorkimphwbTempDAOImpl(); 
	public static final String TABLENAME = "WORKIMPHWB_TEMP"; 

	public WorkimphwbTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimphwbTempPo> CONVERTER = new MapConverter<WorkimphwbTempPo>() { 
 
		@Override 
		public WorkimphwbTempPo convert(final DataObject dataObject) { 
			final WorkimphwbTempPo workimphwbTempPo = new WorkimphwbTempPo(); 
			workimphwbTempPo.setBagno(dataObject.getString(WorkimphwbTempPo.COLUMNS.BAGNO.name())); 
			workimphwbTempPo.setDeclno(dataObject.getString(WorkimphwbTempPo.COLUMNS.DECLNO.name())); 
			workimphwbTempPo.setDecltype(dataObject.getString(WorkimphwbTempPo.COLUMNS.DECLTYPE.name())); 
			workimphwbTempPo.setMwb(dataObject.getString(WorkimphwbTempPo.COLUMNS.MWB.name())); 
			workimphwbTempPo.setHwb(dataObject.getString(WorkimphwbTempPo.COLUMNS.HWB.name())); 
			workimphwbTempPo.setBoxno(dataObject.getString(WorkimphwbTempPo.COLUMNS.BOXNO.name())); 
			workimphwbTempPo.setClearancetype(dataObject.getString(WorkimphwbTempPo.COLUMNS.CLEARANCETYPE.name())); 
			workimphwbTempPo.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.RELEASETIME.name()))); 
			workimphwbTempPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.CANCELRELEASE.name()))); 
			workimphwbTempPo.setManuclearancetype(dataObject.getString(WorkimphwbTempPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			workimphwbTempPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.PIECE.name()))); 
			workimphwbTempPo.setUnit(dataObject.getString(WorkimphwbTempPo.COLUMNS.UNIT.name())); 
			workimphwbTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.WEIGHT.name()))); 
			workimphwbTempPo.setIndicator(dataObject.getString(WorkimphwbTempPo.COLUMNS.INDICATOR.name())); 
			workimphwbTempPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.DUTYPAYMENT.name()))); 
			workimphwbTempPo.setExaminationnote(dataObject.getString(WorkimphwbTempPo.COLUMNS.EXAMINATIONNOTE.name())); 
			workimphwbTempPo.setIe(dataObject.getString(WorkimphwbTempPo.COLUMNS.IE.name())); 
			workimphwbTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCIPIECE.name()))); 
			workimphwbTempPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCIDATE1.name()))); 
			workimphwbTempPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCIDATE2.name()))); 
			workimphwbTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCIWEIGHT.name()))); 
			workimphwbTempPo.setChws(dataObject.getString(WorkimphwbTempPo.COLUMNS.CHWS.name())); 
			workimphwbTempPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCOPIECE.name()))); 
			workimphwbTempPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCODATE1.name()))); 
			workimphwbTempPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCODATE2.name()))); 
			workimphwbTempPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.GCOBAGSN.name()))); 
			workimphwbTempPo.setClosemark(dataObject.getString(WorkimphwbTempPo.COLUMNS.CLOSEMARK.name())); 
			workimphwbTempPo.setExpressid(dataObject.getString(WorkimphwbTempPo.COLUMNS.EXPRESSID.name())); 
			workimphwbTempPo.setAirlineid(dataObject.getString(WorkimphwbTempPo.COLUMNS.AIRLINEID.name())); 
			workimphwbTempPo.setFlightno(dataObject.getString(WorkimphwbTempPo.COLUMNS.FLIGHTNO.name())); 
			workimphwbTempPo.setFlightdest(dataObject.getString(WorkimphwbTempPo.COLUMNS.FLIGHTDEST.name())); 
			workimphwbTempPo.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.FLIGHTDATE.name()))); 
			workimphwbTempPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.CANCELGCO.name()))); 
			workimphwbTempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.LASTUPDATE.name()))); 
			workimphwbTempPo.setHoldarea(dataObject.getString(WorkimphwbTempPo.COLUMNS.HOLDAREA.name())); 
			workimphwbTempPo.setHoldreason(dataObject.getString(WorkimphwbTempPo.COLUMNS.HOLDREASON.name())); 
			workimphwbTempPo.setExpbagno(dataObject.getString(WorkimphwbTempPo.COLUMNS.EXPBAGNO.name())); 
			workimphwbTempPo.setGciws(dataObject.getString(WorkimphwbTempPo.COLUMNS.GCIWS.name())); 
			workimphwbTempPo.setGciuser(dataObject.getString(WorkimphwbTempPo.COLUMNS.GCIUSER.name())); 
			workimphwbTempPo.setGcows(dataObject.getString(WorkimphwbTempPo.COLUMNS.GCOWS.name())); 
			workimphwbTempPo.setGcouser(dataObject.getString(WorkimphwbTempPo.COLUMNS.GCOUSER.name())); 
			workimphwbTempPo.setChargebox(dataObject.getString(WorkimphwbTempPo.COLUMNS.CHARGEBOX.name())); 
			workimphwbTempPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.CHARGEDATE.name()))); 
			workimphwbTempPo.setFrozen(dataObject.getString(WorkimphwbTempPo.COLUMNS.FROZEN.name())); 
			workimphwbTempPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkimphwbTempPo.COLUMNS.PRINTDUTY.name()))); 
			workimphwbTempPo.setPrintuser(dataObject.getString(WorkimphwbTempPo.COLUMNS.PRINTUSER.name())); 
			workimphwbTempPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbTempPo.COLUMNS.PRINTSN.name()))); 
			return workimphwbTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimphwbTempPo workimphwbTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.BAGNO.name(), workimphwbTempPo.getBagno()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.DECLNO.name(), workimphwbTempPo.getDeclno()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.DECLTYPE.name(), workimphwbTempPo.getDecltype()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.MWB.name(), workimphwbTempPo.getMwb()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.HWB.name(), workimphwbTempPo.getHwb()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.BOXNO.name(), workimphwbTempPo.getBoxno()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CLEARANCETYPE.name(), workimphwbTempPo.getClearancetype()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.RELEASETIME.name(), workimphwbTempPo.getReleasetime()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CANCELRELEASE.name(), workimphwbTempPo.getCancelrelease()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.MANUCLEARANCETYPE.name(), workimphwbTempPo.getManuclearancetype()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.PIECE.name(), workimphwbTempPo.getPiece()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.UNIT.name(), workimphwbTempPo.getUnit()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.WEIGHT.name(), workimphwbTempPo.getWeight()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.INDICATOR.name(), workimphwbTempPo.getIndicator()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.DUTYPAYMENT.name(), workimphwbTempPo.getDutypayment()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.EXAMINATIONNOTE.name(), workimphwbTempPo.getExaminationnote()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.IE.name(), workimphwbTempPo.getIe()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIPIECE.name(), workimphwbTempPo.getGcipiece()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIDATE1.name(), workimphwbTempPo.getGcidate1()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIDATE2.name(), workimphwbTempPo.getGcidate2()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIWEIGHT.name(), workimphwbTempPo.getGciweight()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CHWS.name(), workimphwbTempPo.getChws()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCOPIECE.name(), workimphwbTempPo.getGcopiece()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCODATE1.name(), workimphwbTempPo.getGcodate1()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCODATE2.name(), workimphwbTempPo.getGcodate2()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCOBAGSN.name(), workimphwbTempPo.getGcobagsn()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CLOSEMARK.name(), workimphwbTempPo.getClosemark()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.EXPRESSID.name(), workimphwbTempPo.getExpressid()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.AIRLINEID.name(), workimphwbTempPo.getAirlineid()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.FLIGHTNO.name(), workimphwbTempPo.getFlightno()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.FLIGHTDEST.name(), workimphwbTempPo.getFlightdest()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.FLIGHTDATE.name(), workimphwbTempPo.getFlightdate()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CANCELGCO.name(), workimphwbTempPo.getCancelgco()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.LASTUPDATE.name(), workimphwbTempPo.getLastupdate()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.HOLDAREA.name(), workimphwbTempPo.getHoldarea()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.HOLDREASON.name(), workimphwbTempPo.getHoldreason()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.EXPBAGNO.name(), workimphwbTempPo.getExpbagno()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIWS.name(), workimphwbTempPo.getGciws()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCIUSER.name(), workimphwbTempPo.getGciuser()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCOWS.name(), workimphwbTempPo.getGcows()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.GCOUSER.name(), workimphwbTempPo.getGcouser()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CHARGEBOX.name(), workimphwbTempPo.getChargebox()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.CHARGEDATE.name(), workimphwbTempPo.getChargedate()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.FROZEN.name(), workimphwbTempPo.getFrozen()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.PRINTDUTY.name(), workimphwbTempPo.getPrintduty()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.PRINTUSER.name(), workimphwbTempPo.getPrintuser()); 
			dataObject.setValue(WorkimphwbTempPo.COLUMNS.PRINTSN.name(), workimphwbTempPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimphwbTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimphwbTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
