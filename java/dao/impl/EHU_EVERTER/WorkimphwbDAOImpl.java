package com.doc.common.dao.impl; 
 
public class WorkimphwbDAOImpl extends GeneralDAOImpl<WorkimphwbPo> implements WorkimphwbDAO { 
	public static final WorkimphwbDAOImpl INSTANCE = new WorkimphwbDAOImpl(); 
	public static final String TABLENAME = "WORKIMPHWB"; 

	public WorkimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimphwbPo> CONVERTER = new MapConverter<WorkimphwbPo>() { 
 
		@Override 
		public WorkimphwbPo convert(final DataObject dataObject) { 
			final WorkimphwbPo workimphwbPo = new WorkimphwbPo(); 
			workimphwbPo.setBagno(dataObject.getString(WorkimphwbPo.COLUMNS.BAGNO.name())); 
			workimphwbPo.setDeclno(dataObject.getString(WorkimphwbPo.COLUMNS.DECLNO.name())); 
			workimphwbPo.setDecltype(dataObject.getString(WorkimphwbPo.COLUMNS.DECLTYPE.name())); 
			workimphwbPo.setMwb(dataObject.getString(WorkimphwbPo.COLUMNS.MWB.name())); 
			workimphwbPo.setHwb(dataObject.getString(WorkimphwbPo.COLUMNS.HWB.name())); 
			workimphwbPo.setBoxno(dataObject.getString(WorkimphwbPo.COLUMNS.BOXNO.name())); 
			workimphwbPo.setClearancetype(dataObject.getString(WorkimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			workimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.RELEASETIME.name()))); 
			workimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			workimphwbPo.setManuclearancetype(dataObject.getString(WorkimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			workimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.PIECE.name()))); 
			workimphwbPo.setUnit(dataObject.getString(WorkimphwbPo.COLUMNS.UNIT.name())); 
			workimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.WEIGHT.name()))); 
			workimphwbPo.setIndicator(dataObject.getString(WorkimphwbPo.COLUMNS.INDICATOR.name())); 
			workimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			workimphwbPo.setExaminationnote(dataObject.getString(WorkimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			workimphwbPo.setIe(dataObject.getString(WorkimphwbPo.COLUMNS.IE.name())); 
			workimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.GCIPIECE.name()))); 
			workimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.GCIDATE1.name()))); 
			workimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.GCIDATE2.name()))); 
			workimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			workimphwbPo.setChws(dataObject.getString(WorkimphwbPo.COLUMNS.CHWS.name())); 
			workimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.GCOPIECE.name()))); 
			workimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.GCODATE1.name()))); 
			workimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.GCODATE2.name()))); 
			workimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			workimphwbPo.setClosemark(dataObject.getString(WorkimphwbPo.COLUMNS.CLOSEMARK.name())); 
			workimphwbPo.setExpressid(dataObject.getString(WorkimphwbPo.COLUMNS.EXPRESSID.name())); 
			workimphwbPo.setAirlineid(dataObject.getString(WorkimphwbPo.COLUMNS.AIRLINEID.name())); 
			workimphwbPo.setFlightno(dataObject.getString(WorkimphwbPo.COLUMNS.FLIGHTNO.name())); 
			workimphwbPo.setFlightdest(dataObject.getString(WorkimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			workimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			workimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.CANCELGCO.name()))); 
			workimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			workimphwbPo.setHoldarea(dataObject.getString(WorkimphwbPo.COLUMNS.HOLDAREA.name())); 
			workimphwbPo.setHoldreason(dataObject.getString(WorkimphwbPo.COLUMNS.HOLDREASON.name())); 
			workimphwbPo.setExpbagno(dataObject.getString(WorkimphwbPo.COLUMNS.EXPBAGNO.name())); 
			workimphwbPo.setGciws(dataObject.getString(WorkimphwbPo.COLUMNS.GCIWS.name())); 
			workimphwbPo.setGciuser(dataObject.getString(WorkimphwbPo.COLUMNS.GCIUSER.name())); 
			workimphwbPo.setGcows(dataObject.getString(WorkimphwbPo.COLUMNS.GCOWS.name())); 
			workimphwbPo.setGcouser(dataObject.getString(WorkimphwbPo.COLUMNS.GCOUSER.name())); 
			workimphwbPo.setChargebox(dataObject.getString(WorkimphwbPo.COLUMNS.CHARGEBOX.name())); 
			workimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			workimphwbPo.setFrozen(dataObject.getString(WorkimphwbPo.COLUMNS.FROZEN.name())); 
			workimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			workimphwbPo.setPrintuser(dataObject.getString(WorkimphwbPo.COLUMNS.PRINTUSER.name())); 
			workimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkimphwbPo.COLUMNS.PRINTSN.name()))); 
			return workimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimphwbPo workimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.BAGNO.name(), workimphwbPo.getBagno()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.DECLNO.name(), workimphwbPo.getDeclno()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.DECLTYPE.name(), workimphwbPo.getDecltype()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.MWB.name(), workimphwbPo.getMwb()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.HWB.name(), workimphwbPo.getHwb()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.BOXNO.name(), workimphwbPo.getBoxno()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CLEARANCETYPE.name(), workimphwbPo.getClearancetype()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.RELEASETIME.name(), workimphwbPo.getReleasetime()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CANCELRELEASE.name(), workimphwbPo.getCancelrelease()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), workimphwbPo.getManuclearancetype()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.PIECE.name(), workimphwbPo.getPiece()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.UNIT.name(), workimphwbPo.getUnit()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.WEIGHT.name(), workimphwbPo.getWeight()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.INDICATOR.name(), workimphwbPo.getIndicator()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.DUTYPAYMENT.name(), workimphwbPo.getDutypayment()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), workimphwbPo.getExaminationnote()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.IE.name(), workimphwbPo.getIe()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIPIECE.name(), workimphwbPo.getGcipiece()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIDATE1.name(), workimphwbPo.getGcidate1()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIDATE2.name(), workimphwbPo.getGcidate2()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIWEIGHT.name(), workimphwbPo.getGciweight()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CHWS.name(), workimphwbPo.getChws()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCOPIECE.name(), workimphwbPo.getGcopiece()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCODATE1.name(), workimphwbPo.getGcodate1()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCODATE2.name(), workimphwbPo.getGcodate2()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCOBAGSN.name(), workimphwbPo.getGcobagsn()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CLOSEMARK.name(), workimphwbPo.getClosemark()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.EXPRESSID.name(), workimphwbPo.getExpressid()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.AIRLINEID.name(), workimphwbPo.getAirlineid()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.FLIGHTNO.name(), workimphwbPo.getFlightno()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.FLIGHTDEST.name(), workimphwbPo.getFlightdest()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.FLIGHTDATE.name(), workimphwbPo.getFlightdate()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CANCELGCO.name(), workimphwbPo.getCancelgco()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.LASTUPDATE.name(), workimphwbPo.getLastupdate()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.HOLDAREA.name(), workimphwbPo.getHoldarea()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.HOLDREASON.name(), workimphwbPo.getHoldreason()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.EXPBAGNO.name(), workimphwbPo.getExpbagno()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIWS.name(), workimphwbPo.getGciws()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCIUSER.name(), workimphwbPo.getGciuser()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCOWS.name(), workimphwbPo.getGcows()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.GCOUSER.name(), workimphwbPo.getGcouser()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CHARGEBOX.name(), workimphwbPo.getChargebox()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.CHARGEDATE.name(), workimphwbPo.getChargedate()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.FROZEN.name(), workimphwbPo.getFrozen()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.PRINTDUTY.name(), workimphwbPo.getPrintduty()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.PRINTUSER.name(), workimphwbPo.getPrintuser()); 
			dataObject.setValue(WorkimphwbPo.COLUMNS.PRINTSN.name(), workimphwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
