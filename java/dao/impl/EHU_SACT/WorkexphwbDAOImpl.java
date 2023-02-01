package com.doc.common.dao.impl; 
 
public class WorkexphwbDAOImpl extends GeneralDAOImpl<WorkexphwbPo> implements WorkexphwbDAO { 
	public static final WorkexphwbDAOImpl INSTANCE = new WorkexphwbDAOImpl(); 
	public static final String TABLENAME = "WORKEXPHWB"; 

	public WorkexphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexphwbPo> CONVERTER = new MapConverter<WorkexphwbPo>() { 
 
		@Override 
		public WorkexphwbPo convert(final DataObject dataObject) { 
			final WorkexphwbPo workexphwbPo = new WorkexphwbPo(); 
			workexphwbPo.setBagno(dataObject.getString(WorkexphwbPo.COLUMNS.BAGNO.name())); 
			workexphwbPo.setDeclno(dataObject.getString(WorkexphwbPo.COLUMNS.DECLNO.name())); 
			workexphwbPo.setDecltype(dataObject.getString(WorkexphwbPo.COLUMNS.DECLTYPE.name())); 
			workexphwbPo.setMwb(dataObject.getString(WorkexphwbPo.COLUMNS.MWB.name())); 
			workexphwbPo.setHwb(dataObject.getString(WorkexphwbPo.COLUMNS.HWB.name())); 
			workexphwbPo.setBoxno(dataObject.getString(WorkexphwbPo.COLUMNS.BOXNO.name())); 
			workexphwbPo.setClearancetype(dataObject.getString(WorkexphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			workexphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.RELEASETIME.name()))); 
			workexphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			workexphwbPo.setManuclearancetype(dataObject.getString(WorkexphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			workexphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.PIECE.name()))); 
			workexphwbPo.setUnit(dataObject.getString(WorkexphwbPo.COLUMNS.UNIT.name())); 
			workexphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.WEIGHT.name()))); 
			workexphwbPo.setIndicator(dataObject.getString(WorkexphwbPo.COLUMNS.INDICATOR.name())); 
			workexphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			workexphwbPo.setExaminationnote(dataObject.getString(WorkexphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			workexphwbPo.setIe(dataObject.getString(WorkexphwbPo.COLUMNS.IE.name())); 
			workexphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.GCIPIECE.name()))); 
			workexphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.GCIDATE1.name()))); 
			workexphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.GCIDATE2.name()))); 
			workexphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			workexphwbPo.setChws(dataObject.getString(WorkexphwbPo.COLUMNS.CHWS.name())); 
			workexphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.GCOPIECE.name()))); 
			workexphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.GCODATE1.name()))); 
			workexphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.GCODATE2.name()))); 
			workexphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.GCOBAGSN.name()))); 
			workexphwbPo.setClosemark(dataObject.getString(WorkexphwbPo.COLUMNS.CLOSEMARK.name())); 
			workexphwbPo.setExpressid(dataObject.getString(WorkexphwbPo.COLUMNS.EXPRESSID.name())); 
			workexphwbPo.setAirlineid(dataObject.getString(WorkexphwbPo.COLUMNS.AIRLINEID.name())); 
			workexphwbPo.setFlightno(dataObject.getString(WorkexphwbPo.COLUMNS.FLIGHTNO.name())); 
			workexphwbPo.setFlightdest(dataObject.getString(WorkexphwbPo.COLUMNS.FLIGHTDEST.name())); 
			workexphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			workexphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.CANCELGCO.name()))); 
			workexphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.LASTUPDATE.name()))); 
			workexphwbPo.setHoldarea(dataObject.getString(WorkexphwbPo.COLUMNS.HOLDAREA.name())); 
			workexphwbPo.setHoldreason(dataObject.getString(WorkexphwbPo.COLUMNS.HOLDREASON.name())); 
			workexphwbPo.setExpbagno(dataObject.getString(WorkexphwbPo.COLUMNS.EXPBAGNO.name())); 
			workexphwbPo.setGciws(dataObject.getString(WorkexphwbPo.COLUMNS.GCIWS.name())); 
			workexphwbPo.setGciuser(dataObject.getString(WorkexphwbPo.COLUMNS.GCIUSER.name())); 
			workexphwbPo.setGcows(dataObject.getString(WorkexphwbPo.COLUMNS.GCOWS.name())); 
			workexphwbPo.setGcouser(dataObject.getString(WorkexphwbPo.COLUMNS.GCOUSER.name())); 
			workexphwbPo.setChargebox(dataObject.getString(WorkexphwbPo.COLUMNS.CHARGEBOX.name())); 
			workexphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.CHARGEDATE.name()))); 
			workexphwbPo.setFrozen(dataObject.getString(WorkexphwbPo.COLUMNS.FROZEN.name())); 
			workexphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexphwbPo.COLUMNS.PRINTDUTY.name()))); 
			workexphwbPo.setPrintuser(dataObject.getString(WorkexphwbPo.COLUMNS.PRINTUSER.name())); 
			workexphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbPo.COLUMNS.PRINTSN.name()))); 
			return workexphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexphwbPo workexphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.BAGNO.name(), workexphwbPo.getBagno()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.DECLNO.name(), workexphwbPo.getDeclno()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.DECLTYPE.name(), workexphwbPo.getDecltype()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.MWB.name(), workexphwbPo.getMwb()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.HWB.name(), workexphwbPo.getHwb()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.BOXNO.name(), workexphwbPo.getBoxno()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CLEARANCETYPE.name(), workexphwbPo.getClearancetype()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.RELEASETIME.name(), workexphwbPo.getReleasetime()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CANCELRELEASE.name(), workexphwbPo.getCancelrelease()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), workexphwbPo.getManuclearancetype()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.PIECE.name(), workexphwbPo.getPiece()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.UNIT.name(), workexphwbPo.getUnit()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.WEIGHT.name(), workexphwbPo.getWeight()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.INDICATOR.name(), workexphwbPo.getIndicator()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.DUTYPAYMENT.name(), workexphwbPo.getDutypayment()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.EXAMINATIONNOTE.name(), workexphwbPo.getExaminationnote()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.IE.name(), workexphwbPo.getIe()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIPIECE.name(), workexphwbPo.getGcipiece()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIDATE1.name(), workexphwbPo.getGcidate1()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIDATE2.name(), workexphwbPo.getGcidate2()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIWEIGHT.name(), workexphwbPo.getGciweight()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CHWS.name(), workexphwbPo.getChws()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCOPIECE.name(), workexphwbPo.getGcopiece()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCODATE1.name(), workexphwbPo.getGcodate1()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCODATE2.name(), workexphwbPo.getGcodate2()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCOBAGSN.name(), workexphwbPo.getGcobagsn()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CLOSEMARK.name(), workexphwbPo.getClosemark()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.EXPRESSID.name(), workexphwbPo.getExpressid()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.AIRLINEID.name(), workexphwbPo.getAirlineid()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.FLIGHTNO.name(), workexphwbPo.getFlightno()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.FLIGHTDEST.name(), workexphwbPo.getFlightdest()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.FLIGHTDATE.name(), workexphwbPo.getFlightdate()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CANCELGCO.name(), workexphwbPo.getCancelgco()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.LASTUPDATE.name(), workexphwbPo.getLastupdate()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.HOLDAREA.name(), workexphwbPo.getHoldarea()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.HOLDREASON.name(), workexphwbPo.getHoldreason()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.EXPBAGNO.name(), workexphwbPo.getExpbagno()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIWS.name(), workexphwbPo.getGciws()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCIUSER.name(), workexphwbPo.getGciuser()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCOWS.name(), workexphwbPo.getGcows()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.GCOUSER.name(), workexphwbPo.getGcouser()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CHARGEBOX.name(), workexphwbPo.getChargebox()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.CHARGEDATE.name(), workexphwbPo.getChargedate()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.FROZEN.name(), workexphwbPo.getFrozen()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.PRINTDUTY.name(), workexphwbPo.getPrintduty()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.PRINTUSER.name(), workexphwbPo.getPrintuser()); 
			dataObject.setValue(WorkexphwbPo.COLUMNS.PRINTSN.name(), workexphwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
