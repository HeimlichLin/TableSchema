package com.doc.common.dao.impl; 
 
public class WorkexphwbBackup070316DAOImpl extends GeneralDAOImpl<WorkexphwbBackup070316Po> implements WorkexphwbBackup070316DAO { 
	public static final WorkexphwbBackup070316DAOImpl INSTANCE = new WorkexphwbBackup070316DAOImpl(); 
	public static final String TABLENAME = "WORKEXPHWB_BACKUP070316"; 

	public WorkexphwbBackup070316DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexphwbBackup070316Po> CONVERTER = new MapConverter<WorkexphwbBackup070316Po>() { 
 
		@Override 
		public WorkexphwbBackup070316Po convert(final DataObject dataObject) { 
			final WorkexphwbBackup070316Po workexphwbBackup070316Po = new WorkexphwbBackup070316Po(); 
			workexphwbBackup070316Po.setBagno(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.BAGNO.name())); 
			workexphwbBackup070316Po.setDeclno(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.DECLNO.name())); 
			workexphwbBackup070316Po.setDecltype(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.DECLTYPE.name())); 
			workexphwbBackup070316Po.setMwb(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.MWB.name())); 
			workexphwbBackup070316Po.setHwb(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.HWB.name())); 
			workexphwbBackup070316Po.setBoxno(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.BOXNO.name())); 
			workexphwbBackup070316Po.setClearancetype(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.CLEARANCETYPE.name())); 
			workexphwbBackup070316Po.setReleasetime(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.RELEASETIME.name()))); 
			workexphwbBackup070316Po.setCancelrelease(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.CANCELRELEASE.name()))); 
			workexphwbBackup070316Po.setManuclearancetype(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.MANUCLEARANCETYPE.name())); 
			workexphwbBackup070316Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.PIECE.name()))); 
			workexphwbBackup070316Po.setUnit(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.UNIT.name())); 
			workexphwbBackup070316Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.WEIGHT.name()))); 
			workexphwbBackup070316Po.setIndicator(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.INDICATOR.name())); 
			workexphwbBackup070316Po.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.DUTYPAYMENT.name()))); 
			workexphwbBackup070316Po.setExaminationnote(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.EXAMINATIONNOTE.name())); 
			workexphwbBackup070316Po.setIe(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.IE.name())); 
			workexphwbBackup070316Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCIPIECE.name()))); 
			workexphwbBackup070316Po.setGcidate1(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCIDATE1.name()))); 
			workexphwbBackup070316Po.setGcidate2(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCIDATE2.name()))); 
			workexphwbBackup070316Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCIWEIGHT.name()))); 
			workexphwbBackup070316Po.setChws(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.CHWS.name())); 
			workexphwbBackup070316Po.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCOPIECE.name()))); 
			workexphwbBackup070316Po.setGcodate1(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCODATE1.name()))); 
			workexphwbBackup070316Po.setGcodate2(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCODATE2.name()))); 
			workexphwbBackup070316Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.GCOBAGSN.name()))); 
			workexphwbBackup070316Po.setClosemark(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.CLOSEMARK.name())); 
			workexphwbBackup070316Po.setExpressid(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.EXPRESSID.name())); 
			workexphwbBackup070316Po.setAirlineid(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.AIRLINEID.name())); 
			workexphwbBackup070316Po.setFlightno(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.FLIGHTNO.name())); 
			workexphwbBackup070316Po.setFlightdest(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.FLIGHTDEST.name())); 
			workexphwbBackup070316Po.setFlightdate(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.FLIGHTDATE.name()))); 
			workexphwbBackup070316Po.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.CANCELGCO.name()))); 
			workexphwbBackup070316Po.setLastupdate(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.LASTUPDATE.name()))); 
			workexphwbBackup070316Po.setHoldarea(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.HOLDAREA.name())); 
			workexphwbBackup070316Po.setHoldreason(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.HOLDREASON.name())); 
			workexphwbBackup070316Po.setExpbagno(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.EXPBAGNO.name())); 
			workexphwbBackup070316Po.setGciws(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.GCIWS.name())); 
			workexphwbBackup070316Po.setGciuser(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.GCIUSER.name())); 
			workexphwbBackup070316Po.setGcows(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.GCOWS.name())); 
			workexphwbBackup070316Po.setGcouser(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.GCOUSER.name())); 
			workexphwbBackup070316Po.setChargebox(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.CHARGEBOX.name())); 
			workexphwbBackup070316Po.setChargedate(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.CHARGEDATE.name()))); 
			workexphwbBackup070316Po.setFrozen(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.FROZEN.name())); 
			workexphwbBackup070316Po.setPrintduty(TimestampUtils.of(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.PRINTDUTY.name()))); 
			workexphwbBackup070316Po.setPrintuser(dataObject.getString(WorkexphwbBackup070316Po.COLUMNS.PRINTUSER.name())); 
			workexphwbBackup070316Po.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(WorkexphwbBackup070316Po.COLUMNS.PRINTSN.name()))); 
			return workexphwbBackup070316Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexphwbBackup070316Po workexphwbBackup070316Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.BAGNO.name(), workexphwbBackup070316Po.getBagno()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.DECLNO.name(), workexphwbBackup070316Po.getDeclno()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.DECLTYPE.name(), workexphwbBackup070316Po.getDecltype()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.MWB.name(), workexphwbBackup070316Po.getMwb()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.HWB.name(), workexphwbBackup070316Po.getHwb()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.BOXNO.name(), workexphwbBackup070316Po.getBoxno()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CLEARANCETYPE.name(), workexphwbBackup070316Po.getClearancetype()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.RELEASETIME.name(), workexphwbBackup070316Po.getReleasetime()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CANCELRELEASE.name(), workexphwbBackup070316Po.getCancelrelease()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.MANUCLEARANCETYPE.name(), workexphwbBackup070316Po.getManuclearancetype()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.PIECE.name(), workexphwbBackup070316Po.getPiece()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.UNIT.name(), workexphwbBackup070316Po.getUnit()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.WEIGHT.name(), workexphwbBackup070316Po.getWeight()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.INDICATOR.name(), workexphwbBackup070316Po.getIndicator()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.DUTYPAYMENT.name(), workexphwbBackup070316Po.getDutypayment()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.EXAMINATIONNOTE.name(), workexphwbBackup070316Po.getExaminationnote()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.IE.name(), workexphwbBackup070316Po.getIe()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIPIECE.name(), workexphwbBackup070316Po.getGcipiece()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIDATE1.name(), workexphwbBackup070316Po.getGcidate1()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIDATE2.name(), workexphwbBackup070316Po.getGcidate2()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIWEIGHT.name(), workexphwbBackup070316Po.getGciweight()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CHWS.name(), workexphwbBackup070316Po.getChws()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCOPIECE.name(), workexphwbBackup070316Po.getGcopiece()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCODATE1.name(), workexphwbBackup070316Po.getGcodate1()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCODATE2.name(), workexphwbBackup070316Po.getGcodate2()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCOBAGSN.name(), workexphwbBackup070316Po.getGcobagsn()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CLOSEMARK.name(), workexphwbBackup070316Po.getClosemark()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.EXPRESSID.name(), workexphwbBackup070316Po.getExpressid()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.AIRLINEID.name(), workexphwbBackup070316Po.getAirlineid()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.FLIGHTNO.name(), workexphwbBackup070316Po.getFlightno()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.FLIGHTDEST.name(), workexphwbBackup070316Po.getFlightdest()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.FLIGHTDATE.name(), workexphwbBackup070316Po.getFlightdate()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CANCELGCO.name(), workexphwbBackup070316Po.getCancelgco()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.LASTUPDATE.name(), workexphwbBackup070316Po.getLastupdate()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.HOLDAREA.name(), workexphwbBackup070316Po.getHoldarea()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.HOLDREASON.name(), workexphwbBackup070316Po.getHoldreason()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.EXPBAGNO.name(), workexphwbBackup070316Po.getExpbagno()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIWS.name(), workexphwbBackup070316Po.getGciws()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCIUSER.name(), workexphwbBackup070316Po.getGciuser()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCOWS.name(), workexphwbBackup070316Po.getGcows()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.GCOUSER.name(), workexphwbBackup070316Po.getGcouser()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CHARGEBOX.name(), workexphwbBackup070316Po.getChargebox()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.CHARGEDATE.name(), workexphwbBackup070316Po.getChargedate()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.FROZEN.name(), workexphwbBackup070316Po.getFrozen()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.PRINTDUTY.name(), workexphwbBackup070316Po.getPrintduty()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.PRINTUSER.name(), workexphwbBackup070316Po.getPrintuser()); 
			dataObject.setValue(WorkexphwbBackup070316Po.COLUMNS.PRINTSN.name(), workexphwbBackup070316Po.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexphwbBackup070316Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexphwbBackup070316Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
