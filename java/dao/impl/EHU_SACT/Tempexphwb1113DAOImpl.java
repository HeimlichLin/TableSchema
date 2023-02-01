package com.doc.common.dao.impl; 
 
public class Tempexphwb1113DAOImpl extends GeneralDAOImpl<Tempexphwb1113Po> implements Tempexphwb1113DAO { 
	public static final Tempexphwb1113DAOImpl INSTANCE = new Tempexphwb1113DAOImpl(); 
	public static final String TABLENAME = "TEMPEXPHWB_1113"; 

	public Tempexphwb1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempexphwb1113Po> CONVERTER = new MapConverter<Tempexphwb1113Po>() { 
 
		@Override 
		public Tempexphwb1113Po convert(final DataObject dataObject) { 
			final Tempexphwb1113Po tempexphwb1113Po = new Tempexphwb1113Po(); 
			tempexphwb1113Po.setBagno(dataObject.getString(Tempexphwb1113Po.COLUMNS.BAGNO.name())); 
			tempexphwb1113Po.setDeclno(dataObject.getString(Tempexphwb1113Po.COLUMNS.DECLNO.name())); 
			tempexphwb1113Po.setDecltype(dataObject.getString(Tempexphwb1113Po.COLUMNS.DECLTYPE.name())); 
			tempexphwb1113Po.setMwb(dataObject.getString(Tempexphwb1113Po.COLUMNS.MWB.name())); 
			tempexphwb1113Po.setHwb(dataObject.getString(Tempexphwb1113Po.COLUMNS.HWB.name())); 
			tempexphwb1113Po.setBoxno(dataObject.getString(Tempexphwb1113Po.COLUMNS.BOXNO.name())); 
			tempexphwb1113Po.setClearancetype(dataObject.getString(Tempexphwb1113Po.COLUMNS.CLEARANCETYPE.name())); 
			tempexphwb1113Po.setReleasetime(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.RELEASETIME.name()))); 
			tempexphwb1113Po.setCancelrelease(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.CANCELRELEASE.name()))); 
			tempexphwb1113Po.setManuclearancetype(dataObject.getString(Tempexphwb1113Po.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempexphwb1113Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.PIECE.name()))); 
			tempexphwb1113Po.setUnit(dataObject.getString(Tempexphwb1113Po.COLUMNS.UNIT.name())); 
			tempexphwb1113Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.WEIGHT.name()))); 
			tempexphwb1113Po.setIndicator(dataObject.getString(Tempexphwb1113Po.COLUMNS.INDICATOR.name())); 
			tempexphwb1113Po.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.DUTYPAYMENT.name()))); 
			tempexphwb1113Po.setExaminationnote(dataObject.getString(Tempexphwb1113Po.COLUMNS.EXAMINATIONNOTE.name())); 
			tempexphwb1113Po.setIe(dataObject.getString(Tempexphwb1113Po.COLUMNS.IE.name())); 
			tempexphwb1113Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCIPIECE.name()))); 
			tempexphwb1113Po.setGcidate1(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCIDATE1.name()))); 
			tempexphwb1113Po.setGcidate2(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCIDATE2.name()))); 
			tempexphwb1113Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCIWEIGHT.name()))); 
			tempexphwb1113Po.setChws(dataObject.getString(Tempexphwb1113Po.COLUMNS.CHWS.name())); 
			tempexphwb1113Po.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCOPIECE.name()))); 
			tempexphwb1113Po.setGcodate1(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCODATE1.name()))); 
			tempexphwb1113Po.setGcodate2(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCODATE2.name()))); 
			tempexphwb1113Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.GCOBAGSN.name()))); 
			tempexphwb1113Po.setClosemark(dataObject.getString(Tempexphwb1113Po.COLUMNS.CLOSEMARK.name())); 
			tempexphwb1113Po.setExpressid(dataObject.getString(Tempexphwb1113Po.COLUMNS.EXPRESSID.name())); 
			tempexphwb1113Po.setAirlineid(dataObject.getString(Tempexphwb1113Po.COLUMNS.AIRLINEID.name())); 
			tempexphwb1113Po.setFlightno(dataObject.getString(Tempexphwb1113Po.COLUMNS.FLIGHTNO.name())); 
			tempexphwb1113Po.setFlightdest(dataObject.getString(Tempexphwb1113Po.COLUMNS.FLIGHTDEST.name())); 
			tempexphwb1113Po.setFlightdate(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.FLIGHTDATE.name()))); 
			tempexphwb1113Po.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.CANCELGCO.name()))); 
			tempexphwb1113Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.LASTUPDATE.name()))); 
			tempexphwb1113Po.setHoldarea(dataObject.getString(Tempexphwb1113Po.COLUMNS.HOLDAREA.name())); 
			tempexphwb1113Po.setHoldreason(dataObject.getString(Tempexphwb1113Po.COLUMNS.HOLDREASON.name())); 
			tempexphwb1113Po.setExpbagno(dataObject.getString(Tempexphwb1113Po.COLUMNS.EXPBAGNO.name())); 
			tempexphwb1113Po.setGciws(dataObject.getString(Tempexphwb1113Po.COLUMNS.GCIWS.name())); 
			tempexphwb1113Po.setGciuser(dataObject.getString(Tempexphwb1113Po.COLUMNS.GCIUSER.name())); 
			tempexphwb1113Po.setGcows(dataObject.getString(Tempexphwb1113Po.COLUMNS.GCOWS.name())); 
			tempexphwb1113Po.setGcouser(dataObject.getString(Tempexphwb1113Po.COLUMNS.GCOUSER.name())); 
			tempexphwb1113Po.setChargebox(dataObject.getString(Tempexphwb1113Po.COLUMNS.CHARGEBOX.name())); 
			tempexphwb1113Po.setChargedate(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.CHARGEDATE.name()))); 
			tempexphwb1113Po.setFrozen(dataObject.getString(Tempexphwb1113Po.COLUMNS.FROZEN.name())); 
			tempexphwb1113Po.setPrintduty(TimestampUtils.of(dataObject.getValue(Tempexphwb1113Po.COLUMNS.PRINTDUTY.name()))); 
			tempexphwb1113Po.setPrintuser(dataObject.getString(Tempexphwb1113Po.COLUMNS.PRINTUSER.name())); 
			tempexphwb1113Po.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(Tempexphwb1113Po.COLUMNS.PRINTSN.name()))); 
			return tempexphwb1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempexphwb1113Po tempexphwb1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.BAGNO.name(), tempexphwb1113Po.getBagno()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.DECLNO.name(), tempexphwb1113Po.getDeclno()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.DECLTYPE.name(), tempexphwb1113Po.getDecltype()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.MWB.name(), tempexphwb1113Po.getMwb()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.HWB.name(), tempexphwb1113Po.getHwb()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.BOXNO.name(), tempexphwb1113Po.getBoxno()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CLEARANCETYPE.name(), tempexphwb1113Po.getClearancetype()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.RELEASETIME.name(), tempexphwb1113Po.getReleasetime()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CANCELRELEASE.name(), tempexphwb1113Po.getCancelrelease()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.MANUCLEARANCETYPE.name(), tempexphwb1113Po.getManuclearancetype()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.PIECE.name(), tempexphwb1113Po.getPiece()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.UNIT.name(), tempexphwb1113Po.getUnit()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.WEIGHT.name(), tempexphwb1113Po.getWeight()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.INDICATOR.name(), tempexphwb1113Po.getIndicator()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.DUTYPAYMENT.name(), tempexphwb1113Po.getDutypayment()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.EXAMINATIONNOTE.name(), tempexphwb1113Po.getExaminationnote()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.IE.name(), tempexphwb1113Po.getIe()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIPIECE.name(), tempexphwb1113Po.getGcipiece()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIDATE1.name(), tempexphwb1113Po.getGcidate1()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIDATE2.name(), tempexphwb1113Po.getGcidate2()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIWEIGHT.name(), tempexphwb1113Po.getGciweight()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CHWS.name(), tempexphwb1113Po.getChws()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCOPIECE.name(), tempexphwb1113Po.getGcopiece()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCODATE1.name(), tempexphwb1113Po.getGcodate1()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCODATE2.name(), tempexphwb1113Po.getGcodate2()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCOBAGSN.name(), tempexphwb1113Po.getGcobagsn()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CLOSEMARK.name(), tempexphwb1113Po.getClosemark()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.EXPRESSID.name(), tempexphwb1113Po.getExpressid()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.AIRLINEID.name(), tempexphwb1113Po.getAirlineid()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.FLIGHTNO.name(), tempexphwb1113Po.getFlightno()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.FLIGHTDEST.name(), tempexphwb1113Po.getFlightdest()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.FLIGHTDATE.name(), tempexphwb1113Po.getFlightdate()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CANCELGCO.name(), tempexphwb1113Po.getCancelgco()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.LASTUPDATE.name(), tempexphwb1113Po.getLastupdate()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.HOLDAREA.name(), tempexphwb1113Po.getHoldarea()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.HOLDREASON.name(), tempexphwb1113Po.getHoldreason()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.EXPBAGNO.name(), tempexphwb1113Po.getExpbagno()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIWS.name(), tempexphwb1113Po.getGciws()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCIUSER.name(), tempexphwb1113Po.getGciuser()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCOWS.name(), tempexphwb1113Po.getGcows()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.GCOUSER.name(), tempexphwb1113Po.getGcouser()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CHARGEBOX.name(), tempexphwb1113Po.getChargebox()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.CHARGEDATE.name(), tempexphwb1113Po.getChargedate()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.FROZEN.name(), tempexphwb1113Po.getFrozen()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.PRINTDUTY.name(), tempexphwb1113Po.getPrintduty()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.PRINTUSER.name(), tempexphwb1113Po.getPrintuser()); 
			dataObject.setValue(Tempexphwb1113Po.COLUMNS.PRINTSN.name(), tempexphwb1113Po.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempexphwb1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempexphwb1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
