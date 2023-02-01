package com.doc.common.dao.impl; 
 
public class WorkexphwbTempDAOImpl extends GeneralDAOImpl<WorkexphwbTempPo> implements WorkexphwbTempDAO { 
	public static final WorkexphwbTempDAOImpl INSTANCE = new WorkexphwbTempDAOImpl(); 
	public static final String TABLENAME = "WORKEXPHWB_TEMP"; 

	public WorkexphwbTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexphwbTempPo> CONVERTER = new MapConverter<WorkexphwbTempPo>() { 
 
		@Override 
		public WorkexphwbTempPo convert(final DataObject dataObject) { 
			final WorkexphwbTempPo workexphwbTempPo = new WorkexphwbTempPo(); 
			workexphwbTempPo.setBagno(dataObject.getString(WorkexphwbTempPo.COLUMNS.BAGNO.name())); 
			workexphwbTempPo.setDeclno(dataObject.getString(WorkexphwbTempPo.COLUMNS.DECLNO.name())); 
			workexphwbTempPo.setDecltype(dataObject.getString(WorkexphwbTempPo.COLUMNS.DECLTYPE.name())); 
			workexphwbTempPo.setMwb(dataObject.getString(WorkexphwbTempPo.COLUMNS.MWB.name())); 
			workexphwbTempPo.setHwb(dataObject.getString(WorkexphwbTempPo.COLUMNS.HWB.name())); 
			workexphwbTempPo.setBoxno(dataObject.getString(WorkexphwbTempPo.COLUMNS.BOXNO.name())); 
			workexphwbTempPo.setClearancetype(dataObject.getString(WorkexphwbTempPo.COLUMNS.CLEARANCETYPE.name())); 
			workexphwbTempPo.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.RELEASETIME.name()))); 
			workexphwbTempPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.CANCELRELEASE.name()))); 
			workexphwbTempPo.setManuclearancetype(dataObject.getString(WorkexphwbTempPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			workexphwbTempPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.PIECE.name()))); 
			workexphwbTempPo.setUnit(dataObject.getString(WorkexphwbTempPo.COLUMNS.UNIT.name())); 
			workexphwbTempPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.WEIGHT.name()))); 
			workexphwbTempPo.setIndicator(dataObject.getString(WorkexphwbTempPo.COLUMNS.INDICATOR.name())); 
			workexphwbTempPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.DUTYPAYMENT.name()))); 
			workexphwbTempPo.setExaminationnote(dataObject.getString(WorkexphwbTempPo.COLUMNS.EXAMINATIONNOTE.name())); 
			workexphwbTempPo.setIe(dataObject.getString(WorkexphwbTempPo.COLUMNS.IE.name())); 
			workexphwbTempPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCIPIECE.name()))); 
			workexphwbTempPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCIDATE1.name()))); 
			workexphwbTempPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCIDATE2.name()))); 
			workexphwbTempPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCIWEIGHT.name()))); 
			workexphwbTempPo.setChws(dataObject.getString(WorkexphwbTempPo.COLUMNS.CHWS.name())); 
			workexphwbTempPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCOPIECE.name()))); 
			workexphwbTempPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCODATE1.name()))); 
			workexphwbTempPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCODATE2.name()))); 
			workexphwbTempPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.GCOBAGSN.name()))); 
			workexphwbTempPo.setClosemark(dataObject.getString(WorkexphwbTempPo.COLUMNS.CLOSEMARK.name())); 
			workexphwbTempPo.setExpressid(dataObject.getString(WorkexphwbTempPo.COLUMNS.EXPRESSID.name())); 
			workexphwbTempPo.setAirlineid(dataObject.getString(WorkexphwbTempPo.COLUMNS.AIRLINEID.name())); 
			workexphwbTempPo.setFlightno(dataObject.getString(WorkexphwbTempPo.COLUMNS.FLIGHTNO.name())); 
			workexphwbTempPo.setFlightdest(dataObject.getString(WorkexphwbTempPo.COLUMNS.FLIGHTDEST.name())); 
			workexphwbTempPo.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.FLIGHTDATE.name()))); 
			workexphwbTempPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.CANCELGCO.name()))); 
			workexphwbTempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.LASTUPDATE.name()))); 
			workexphwbTempPo.setHoldarea(dataObject.getString(WorkexphwbTempPo.COLUMNS.HOLDAREA.name())); 
			workexphwbTempPo.setHoldreason(dataObject.getString(WorkexphwbTempPo.COLUMNS.HOLDREASON.name())); 
			workexphwbTempPo.setExpbagno(dataObject.getString(WorkexphwbTempPo.COLUMNS.EXPBAGNO.name())); 
			workexphwbTempPo.setGciws(dataObject.getString(WorkexphwbTempPo.COLUMNS.GCIWS.name())); 
			workexphwbTempPo.setGciuser(dataObject.getString(WorkexphwbTempPo.COLUMNS.GCIUSER.name())); 
			workexphwbTempPo.setGcows(dataObject.getString(WorkexphwbTempPo.COLUMNS.GCOWS.name())); 
			workexphwbTempPo.setGcouser(dataObject.getString(WorkexphwbTempPo.COLUMNS.GCOUSER.name())); 
			workexphwbTempPo.setChargebox(dataObject.getString(WorkexphwbTempPo.COLUMNS.CHARGEBOX.name())); 
			workexphwbTempPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.CHARGEDATE.name()))); 
			workexphwbTempPo.setFrozen(dataObject.getString(WorkexphwbTempPo.COLUMNS.FROZEN.name())); 
			workexphwbTempPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexphwbTempPo.COLUMNS.PRINTDUTY.name()))); 
			workexphwbTempPo.setPrintuser(dataObject.getString(WorkexphwbTempPo.COLUMNS.PRINTUSER.name())); 
			workexphwbTempPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbTempPo.COLUMNS.PRINTSN.name()))); 
			return workexphwbTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexphwbTempPo workexphwbTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.BAGNO.name(), workexphwbTempPo.getBagno()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.DECLNO.name(), workexphwbTempPo.getDeclno()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.DECLTYPE.name(), workexphwbTempPo.getDecltype()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.MWB.name(), workexphwbTempPo.getMwb()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.HWB.name(), workexphwbTempPo.getHwb()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.BOXNO.name(), workexphwbTempPo.getBoxno()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CLEARANCETYPE.name(), workexphwbTempPo.getClearancetype()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.RELEASETIME.name(), workexphwbTempPo.getReleasetime()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CANCELRELEASE.name(), workexphwbTempPo.getCancelrelease()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.MANUCLEARANCETYPE.name(), workexphwbTempPo.getManuclearancetype()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.PIECE.name(), workexphwbTempPo.getPiece()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.UNIT.name(), workexphwbTempPo.getUnit()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.WEIGHT.name(), workexphwbTempPo.getWeight()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.INDICATOR.name(), workexphwbTempPo.getIndicator()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.DUTYPAYMENT.name(), workexphwbTempPo.getDutypayment()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.EXAMINATIONNOTE.name(), workexphwbTempPo.getExaminationnote()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.IE.name(), workexphwbTempPo.getIe()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIPIECE.name(), workexphwbTempPo.getGcipiece()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIDATE1.name(), workexphwbTempPo.getGcidate1()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIDATE2.name(), workexphwbTempPo.getGcidate2()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIWEIGHT.name(), workexphwbTempPo.getGciweight()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CHWS.name(), workexphwbTempPo.getChws()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCOPIECE.name(), workexphwbTempPo.getGcopiece()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCODATE1.name(), workexphwbTempPo.getGcodate1()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCODATE2.name(), workexphwbTempPo.getGcodate2()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCOBAGSN.name(), workexphwbTempPo.getGcobagsn()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CLOSEMARK.name(), workexphwbTempPo.getClosemark()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.EXPRESSID.name(), workexphwbTempPo.getExpressid()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.AIRLINEID.name(), workexphwbTempPo.getAirlineid()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.FLIGHTNO.name(), workexphwbTempPo.getFlightno()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.FLIGHTDEST.name(), workexphwbTempPo.getFlightdest()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.FLIGHTDATE.name(), workexphwbTempPo.getFlightdate()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CANCELGCO.name(), workexphwbTempPo.getCancelgco()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.LASTUPDATE.name(), workexphwbTempPo.getLastupdate()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.HOLDAREA.name(), workexphwbTempPo.getHoldarea()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.HOLDREASON.name(), workexphwbTempPo.getHoldreason()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.EXPBAGNO.name(), workexphwbTempPo.getExpbagno()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIWS.name(), workexphwbTempPo.getGciws()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCIUSER.name(), workexphwbTempPo.getGciuser()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCOWS.name(), workexphwbTempPo.getGcows()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.GCOUSER.name(), workexphwbTempPo.getGcouser()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CHARGEBOX.name(), workexphwbTempPo.getChargebox()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.CHARGEDATE.name(), workexphwbTempPo.getChargedate()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.FROZEN.name(), workexphwbTempPo.getFrozen()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.PRINTDUTY.name(), workexphwbTempPo.getPrintduty()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.PRINTUSER.name(), workexphwbTempPo.getPrintuser()); 
			dataObject.setValue(WorkexphwbTempPo.COLUMNS.PRINTSN.name(), workexphwbTempPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexphwbTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexphwbTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
