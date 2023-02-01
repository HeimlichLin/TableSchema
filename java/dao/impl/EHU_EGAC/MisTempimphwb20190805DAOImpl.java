package com.doc.common.dao.impl; 
 
public class MisTempimphwb20190805DAOImpl extends GeneralDAOImpl<MisTempimphwb20190805Po> implements MisTempimphwb20190805DAO { 
	public static final MisTempimphwb20190805DAOImpl INSTANCE = new MisTempimphwb20190805DAOImpl(); 
	public static final String TABLENAME = "MIS_TEMPIMPHWB_20190805"; 

	public MisTempimphwb20190805DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisTempimphwb20190805Po> CONVERTER = new MapConverter<MisTempimphwb20190805Po>() { 
 
		@Override 
		public MisTempimphwb20190805Po convert(final DataObject dataObject) { 
			final MisTempimphwb20190805Po misTempimphwb20190805Po = new MisTempimphwb20190805Po(); 
			misTempimphwb20190805Po.setBagno(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.BAGNO.name())); 
			misTempimphwb20190805Po.setDeclno(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.DECLNO.name())); 
			misTempimphwb20190805Po.setDecltype(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.DECLTYPE.name())); 
			misTempimphwb20190805Po.setMwb(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.MWB.name())); 
			misTempimphwb20190805Po.setHwb(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.HWB.name())); 
			misTempimphwb20190805Po.setBoxno(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.BOXNO.name())); 
			misTempimphwb20190805Po.setClearancetype(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.CLEARANCETYPE.name())); 
			misTempimphwb20190805Po.setReleasetime(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.RELEASETIME.name()))); 
			misTempimphwb20190805Po.setCancelrelease(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.CANCELRELEASE.name()))); 
			misTempimphwb20190805Po.setManuclearancetype(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.MANUCLEARANCETYPE.name())); 
			misTempimphwb20190805Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.PIECE.name()))); 
			misTempimphwb20190805Po.setUnit(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.UNIT.name())); 
			misTempimphwb20190805Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.WEIGHT.name()))); 
			misTempimphwb20190805Po.setIndicator(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.INDICATOR.name())); 
			misTempimphwb20190805Po.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.DUTYPAYMENT.name()))); 
			misTempimphwb20190805Po.setExaminationnote(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.EXAMINATIONNOTE.name())); 
			misTempimphwb20190805Po.setIe(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.IE.name())); 
			misTempimphwb20190805Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCIPIECE.name()))); 
			misTempimphwb20190805Po.setGcidate1(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCIDATE1.name()))); 
			misTempimphwb20190805Po.setGcidate2(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCIDATE2.name()))); 
			misTempimphwb20190805Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCIWEIGHT.name()))); 
			misTempimphwb20190805Po.setChws(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.CHWS.name())); 
			misTempimphwb20190805Po.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCOPIECE.name()))); 
			misTempimphwb20190805Po.setGcodate1(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCODATE1.name()))); 
			misTempimphwb20190805Po.setGcodate2(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCODATE2.name()))); 
			misTempimphwb20190805Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.GCOBAGSN.name()))); 
			misTempimphwb20190805Po.setClosemark(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.CLOSEMARK.name())); 
			misTempimphwb20190805Po.setExpressid(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.EXPRESSID.name())); 
			misTempimphwb20190805Po.setAirlineid(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.AIRLINEID.name())); 
			misTempimphwb20190805Po.setFlightno(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.FLIGHTNO.name())); 
			misTempimphwb20190805Po.setFlightdest(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.FLIGHTDEST.name())); 
			misTempimphwb20190805Po.setFlightdate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.FLIGHTDATE.name()))); 
			misTempimphwb20190805Po.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.CANCELGCO.name()))); 
			misTempimphwb20190805Po.setLastupdate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.LASTUPDATE.name()))); 
			misTempimphwb20190805Po.setHoldarea(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.HOLDAREA.name())); 
			misTempimphwb20190805Po.setHoldreason(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.HOLDREASON.name())); 
			misTempimphwb20190805Po.setExpbagno(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.EXPBAGNO.name())); 
			misTempimphwb20190805Po.setGciws(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.GCIWS.name())); 
			misTempimphwb20190805Po.setGciuser(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.GCIUSER.name())); 
			misTempimphwb20190805Po.setGcows(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.GCOWS.name())); 
			misTempimphwb20190805Po.setGcouser(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.GCOUSER.name())); 
			misTempimphwb20190805Po.setChargebox(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.CHARGEBOX.name())); 
			misTempimphwb20190805Po.setChargedate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.CHARGEDATE.name()))); 
			misTempimphwb20190805Po.setFrozen(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.FROZEN.name())); 
			misTempimphwb20190805Po.setPrintduty(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.PRINTDUTY.name()))); 
			misTempimphwb20190805Po.setPrintuser(dataObject.getString(MisTempimphwb20190805Po.COLUMNS.PRINTUSER.name())); 
			misTempimphwb20190805Po.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.PRINTSN.name()))); 
			misTempimphwb20190805Po.setPrintTime(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805Po.COLUMNS.PRINT_TIME.name()))); 
			return misTempimphwb20190805Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisTempimphwb20190805Po misTempimphwb20190805Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.BAGNO.name(), misTempimphwb20190805Po.getBagno()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.DECLNO.name(), misTempimphwb20190805Po.getDeclno()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.DECLTYPE.name(), misTempimphwb20190805Po.getDecltype()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.MWB.name(), misTempimphwb20190805Po.getMwb()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.HWB.name(), misTempimphwb20190805Po.getHwb()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.BOXNO.name(), misTempimphwb20190805Po.getBoxno()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CLEARANCETYPE.name(), misTempimphwb20190805Po.getClearancetype()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.RELEASETIME.name(), misTempimphwb20190805Po.getReleasetime()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CANCELRELEASE.name(), misTempimphwb20190805Po.getCancelrelease()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.MANUCLEARANCETYPE.name(), misTempimphwb20190805Po.getManuclearancetype()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.PIECE.name(), misTempimphwb20190805Po.getPiece()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.UNIT.name(), misTempimphwb20190805Po.getUnit()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.WEIGHT.name(), misTempimphwb20190805Po.getWeight()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.INDICATOR.name(), misTempimphwb20190805Po.getIndicator()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.DUTYPAYMENT.name(), misTempimphwb20190805Po.getDutypayment()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.EXAMINATIONNOTE.name(), misTempimphwb20190805Po.getExaminationnote()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.IE.name(), misTempimphwb20190805Po.getIe()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIPIECE.name(), misTempimphwb20190805Po.getGcipiece()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIDATE1.name(), misTempimphwb20190805Po.getGcidate1()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIDATE2.name(), misTempimphwb20190805Po.getGcidate2()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIWEIGHT.name(), misTempimphwb20190805Po.getGciweight()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CHWS.name(), misTempimphwb20190805Po.getChws()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCOPIECE.name(), misTempimphwb20190805Po.getGcopiece()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCODATE1.name(), misTempimphwb20190805Po.getGcodate1()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCODATE2.name(), misTempimphwb20190805Po.getGcodate2()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCOBAGSN.name(), misTempimphwb20190805Po.getGcobagsn()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CLOSEMARK.name(), misTempimphwb20190805Po.getClosemark()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.EXPRESSID.name(), misTempimphwb20190805Po.getExpressid()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.AIRLINEID.name(), misTempimphwb20190805Po.getAirlineid()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.FLIGHTNO.name(), misTempimphwb20190805Po.getFlightno()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.FLIGHTDEST.name(), misTempimphwb20190805Po.getFlightdest()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.FLIGHTDATE.name(), misTempimphwb20190805Po.getFlightdate()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CANCELGCO.name(), misTempimphwb20190805Po.getCancelgco()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.LASTUPDATE.name(), misTempimphwb20190805Po.getLastupdate()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.HOLDAREA.name(), misTempimphwb20190805Po.getHoldarea()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.HOLDREASON.name(), misTempimphwb20190805Po.getHoldreason()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.EXPBAGNO.name(), misTempimphwb20190805Po.getExpbagno()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIWS.name(), misTempimphwb20190805Po.getGciws()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCIUSER.name(), misTempimphwb20190805Po.getGciuser()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCOWS.name(), misTempimphwb20190805Po.getGcows()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.GCOUSER.name(), misTempimphwb20190805Po.getGcouser()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CHARGEBOX.name(), misTempimphwb20190805Po.getChargebox()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.CHARGEDATE.name(), misTempimphwb20190805Po.getChargedate()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.FROZEN.name(), misTempimphwb20190805Po.getFrozen()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.PRINTDUTY.name(), misTempimphwb20190805Po.getPrintduty()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.PRINTUSER.name(), misTempimphwb20190805Po.getPrintuser()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.PRINTSN.name(), misTempimphwb20190805Po.getPrintsn()); 
			dataObject.setValue(MisTempimphwb20190805Po.COLUMNS.PRINT_TIME.name(), misTempimphwb20190805Po.getPrintTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisTempimphwb20190805Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisTempimphwb20190805Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
