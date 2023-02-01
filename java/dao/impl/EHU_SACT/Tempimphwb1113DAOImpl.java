package com.doc.common.dao.impl; 
 
public class Tempimphwb1113DAOImpl extends GeneralDAOImpl<Tempimphwb1113Po> implements Tempimphwb1113DAO { 
	public static final Tempimphwb1113DAOImpl INSTANCE = new Tempimphwb1113DAOImpl(); 
	public static final String TABLENAME = "TEMPIMPHWB_1113"; 

	public Tempimphwb1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempimphwb1113Po> CONVERTER = new MapConverter<Tempimphwb1113Po>() { 
 
		@Override 
		public Tempimphwb1113Po convert(final DataObject dataObject) { 
			final Tempimphwb1113Po tempimphwb1113Po = new Tempimphwb1113Po(); 
			tempimphwb1113Po.setBagno(dataObject.getString(Tempimphwb1113Po.COLUMNS.BAGNO.name())); 
			tempimphwb1113Po.setDeclno(dataObject.getString(Tempimphwb1113Po.COLUMNS.DECLNO.name())); 
			tempimphwb1113Po.setDecltype(dataObject.getString(Tempimphwb1113Po.COLUMNS.DECLTYPE.name())); 
			tempimphwb1113Po.setMwb(dataObject.getString(Tempimphwb1113Po.COLUMNS.MWB.name())); 
			tempimphwb1113Po.setHwb(dataObject.getString(Tempimphwb1113Po.COLUMNS.HWB.name())); 
			tempimphwb1113Po.setBoxno(dataObject.getString(Tempimphwb1113Po.COLUMNS.BOXNO.name())); 
			tempimphwb1113Po.setClearancetype(dataObject.getString(Tempimphwb1113Po.COLUMNS.CLEARANCETYPE.name())); 
			tempimphwb1113Po.setReleasetime(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.RELEASETIME.name()))); 
			tempimphwb1113Po.setCancelrelease(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.CANCELRELEASE.name()))); 
			tempimphwb1113Po.setManuclearancetype(dataObject.getString(Tempimphwb1113Po.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempimphwb1113Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.PIECE.name()))); 
			tempimphwb1113Po.setUnit(dataObject.getString(Tempimphwb1113Po.COLUMNS.UNIT.name())); 
			tempimphwb1113Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.WEIGHT.name()))); 
			tempimphwb1113Po.setIndicator(dataObject.getString(Tempimphwb1113Po.COLUMNS.INDICATOR.name())); 
			tempimphwb1113Po.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.DUTYPAYMENT.name()))); 
			tempimphwb1113Po.setExaminationnote(dataObject.getString(Tempimphwb1113Po.COLUMNS.EXAMINATIONNOTE.name())); 
			tempimphwb1113Po.setIe(dataObject.getString(Tempimphwb1113Po.COLUMNS.IE.name())); 
			tempimphwb1113Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCIPIECE.name()))); 
			tempimphwb1113Po.setGcidate1(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCIDATE1.name()))); 
			tempimphwb1113Po.setGcidate2(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCIDATE2.name()))); 
			tempimphwb1113Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCIWEIGHT.name()))); 
			tempimphwb1113Po.setChws(dataObject.getString(Tempimphwb1113Po.COLUMNS.CHWS.name())); 
			tempimphwb1113Po.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCOPIECE.name()))); 
			tempimphwb1113Po.setGcodate1(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCODATE1.name()))); 
			tempimphwb1113Po.setGcodate2(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCODATE2.name()))); 
			tempimphwb1113Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.GCOBAGSN.name()))); 
			tempimphwb1113Po.setClosemark(dataObject.getString(Tempimphwb1113Po.COLUMNS.CLOSEMARK.name())); 
			tempimphwb1113Po.setExpressid(dataObject.getString(Tempimphwb1113Po.COLUMNS.EXPRESSID.name())); 
			tempimphwb1113Po.setAirlineid(dataObject.getString(Tempimphwb1113Po.COLUMNS.AIRLINEID.name())); 
			tempimphwb1113Po.setFlightno(dataObject.getString(Tempimphwb1113Po.COLUMNS.FLIGHTNO.name())); 
			tempimphwb1113Po.setFlightdest(dataObject.getString(Tempimphwb1113Po.COLUMNS.FLIGHTDEST.name())); 
			tempimphwb1113Po.setFlightdate(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.FLIGHTDATE.name()))); 
			tempimphwb1113Po.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.CANCELGCO.name()))); 
			tempimphwb1113Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.LASTUPDATE.name()))); 
			tempimphwb1113Po.setHoldarea(dataObject.getString(Tempimphwb1113Po.COLUMNS.HOLDAREA.name())); 
			tempimphwb1113Po.setHoldreason(dataObject.getString(Tempimphwb1113Po.COLUMNS.HOLDREASON.name())); 
			tempimphwb1113Po.setExpbagno(dataObject.getString(Tempimphwb1113Po.COLUMNS.EXPBAGNO.name())); 
			tempimphwb1113Po.setGciws(dataObject.getString(Tempimphwb1113Po.COLUMNS.GCIWS.name())); 
			tempimphwb1113Po.setGciuser(dataObject.getString(Tempimphwb1113Po.COLUMNS.GCIUSER.name())); 
			tempimphwb1113Po.setGcows(dataObject.getString(Tempimphwb1113Po.COLUMNS.GCOWS.name())); 
			tempimphwb1113Po.setGcouser(dataObject.getString(Tempimphwb1113Po.COLUMNS.GCOUSER.name())); 
			tempimphwb1113Po.setChargebox(dataObject.getString(Tempimphwb1113Po.COLUMNS.CHARGEBOX.name())); 
			tempimphwb1113Po.setChargedate(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.CHARGEDATE.name()))); 
			tempimphwb1113Po.setFrozen(dataObject.getString(Tempimphwb1113Po.COLUMNS.FROZEN.name())); 
			tempimphwb1113Po.setPrintduty(TimestampUtils.of(dataObject.getValue(Tempimphwb1113Po.COLUMNS.PRINTDUTY.name()))); 
			tempimphwb1113Po.setPrintuser(dataObject.getString(Tempimphwb1113Po.COLUMNS.PRINTUSER.name())); 
			tempimphwb1113Po.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(Tempimphwb1113Po.COLUMNS.PRINTSN.name()))); 
			return tempimphwb1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempimphwb1113Po tempimphwb1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.BAGNO.name(), tempimphwb1113Po.getBagno()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.DECLNO.name(), tempimphwb1113Po.getDeclno()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.DECLTYPE.name(), tempimphwb1113Po.getDecltype()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.MWB.name(), tempimphwb1113Po.getMwb()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.HWB.name(), tempimphwb1113Po.getHwb()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.BOXNO.name(), tempimphwb1113Po.getBoxno()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CLEARANCETYPE.name(), tempimphwb1113Po.getClearancetype()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.RELEASETIME.name(), tempimphwb1113Po.getReleasetime()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CANCELRELEASE.name(), tempimphwb1113Po.getCancelrelease()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.MANUCLEARANCETYPE.name(), tempimphwb1113Po.getManuclearancetype()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.PIECE.name(), tempimphwb1113Po.getPiece()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.UNIT.name(), tempimphwb1113Po.getUnit()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.WEIGHT.name(), tempimphwb1113Po.getWeight()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.INDICATOR.name(), tempimphwb1113Po.getIndicator()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.DUTYPAYMENT.name(), tempimphwb1113Po.getDutypayment()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.EXAMINATIONNOTE.name(), tempimphwb1113Po.getExaminationnote()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.IE.name(), tempimphwb1113Po.getIe()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIPIECE.name(), tempimphwb1113Po.getGcipiece()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIDATE1.name(), tempimphwb1113Po.getGcidate1()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIDATE2.name(), tempimphwb1113Po.getGcidate2()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIWEIGHT.name(), tempimphwb1113Po.getGciweight()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CHWS.name(), tempimphwb1113Po.getChws()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCOPIECE.name(), tempimphwb1113Po.getGcopiece()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCODATE1.name(), tempimphwb1113Po.getGcodate1()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCODATE2.name(), tempimphwb1113Po.getGcodate2()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCOBAGSN.name(), tempimphwb1113Po.getGcobagsn()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CLOSEMARK.name(), tempimphwb1113Po.getClosemark()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.EXPRESSID.name(), tempimphwb1113Po.getExpressid()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.AIRLINEID.name(), tempimphwb1113Po.getAirlineid()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.FLIGHTNO.name(), tempimphwb1113Po.getFlightno()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.FLIGHTDEST.name(), tempimphwb1113Po.getFlightdest()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.FLIGHTDATE.name(), tempimphwb1113Po.getFlightdate()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CANCELGCO.name(), tempimphwb1113Po.getCancelgco()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.LASTUPDATE.name(), tempimphwb1113Po.getLastupdate()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.HOLDAREA.name(), tempimphwb1113Po.getHoldarea()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.HOLDREASON.name(), tempimphwb1113Po.getHoldreason()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.EXPBAGNO.name(), tempimphwb1113Po.getExpbagno()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIWS.name(), tempimphwb1113Po.getGciws()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCIUSER.name(), tempimphwb1113Po.getGciuser()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCOWS.name(), tempimphwb1113Po.getGcows()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.GCOUSER.name(), tempimphwb1113Po.getGcouser()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CHARGEBOX.name(), tempimphwb1113Po.getChargebox()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.CHARGEDATE.name(), tempimphwb1113Po.getChargedate()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.FROZEN.name(), tempimphwb1113Po.getFrozen()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.PRINTDUTY.name(), tempimphwb1113Po.getPrintduty()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.PRINTUSER.name(), tempimphwb1113Po.getPrintuser()); 
			dataObject.setValue(Tempimphwb1113Po.COLUMNS.PRINTSN.name(), tempimphwb1113Po.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempimphwb1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempimphwb1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
