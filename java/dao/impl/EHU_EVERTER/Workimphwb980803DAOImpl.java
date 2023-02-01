package com.doc.common.dao.impl; 
 
public class Workimphwb980803DAOImpl extends GeneralDAOImpl<Workimphwb980803Po> implements Workimphwb980803DAO { 
	public static final Workimphwb980803DAOImpl INSTANCE = new Workimphwb980803DAOImpl(); 
	public static final String TABLENAME = "WORKIMPHWB_980803"; 

	public Workimphwb980803DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Workimphwb980803Po> CONVERTER = new MapConverter<Workimphwb980803Po>() { 
 
		@Override 
		public Workimphwb980803Po convert(final DataObject dataObject) { 
			final Workimphwb980803Po workimphwb980803Po = new Workimphwb980803Po(); 
			workimphwb980803Po.setBagno(dataObject.getString(Workimphwb980803Po.COLUMNS.BAGNO.name())); 
			workimphwb980803Po.setDeclno(dataObject.getString(Workimphwb980803Po.COLUMNS.DECLNO.name())); 
			workimphwb980803Po.setDecltype(dataObject.getString(Workimphwb980803Po.COLUMNS.DECLTYPE.name())); 
			workimphwb980803Po.setMwb(dataObject.getString(Workimphwb980803Po.COLUMNS.MWB.name())); 
			workimphwb980803Po.setHwb(dataObject.getString(Workimphwb980803Po.COLUMNS.HWB.name())); 
			workimphwb980803Po.setBoxno(dataObject.getString(Workimphwb980803Po.COLUMNS.BOXNO.name())); 
			workimphwb980803Po.setClearancetype(dataObject.getString(Workimphwb980803Po.COLUMNS.CLEARANCETYPE.name())); 
			workimphwb980803Po.setReleasetime(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.RELEASETIME.name()))); 
			workimphwb980803Po.setCancelrelease(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.CANCELRELEASE.name()))); 
			workimphwb980803Po.setManuclearancetype(dataObject.getString(Workimphwb980803Po.COLUMNS.MANUCLEARANCETYPE.name())); 
			workimphwb980803Po.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.PIECE.name()))); 
			workimphwb980803Po.setUnit(dataObject.getString(Workimphwb980803Po.COLUMNS.UNIT.name())); 
			workimphwb980803Po.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.WEIGHT.name()))); 
			workimphwb980803Po.setIndicator(dataObject.getString(Workimphwb980803Po.COLUMNS.INDICATOR.name())); 
			workimphwb980803Po.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.DUTYPAYMENT.name()))); 
			workimphwb980803Po.setExaminationnote(dataObject.getString(Workimphwb980803Po.COLUMNS.EXAMINATIONNOTE.name())); 
			workimphwb980803Po.setIe(dataObject.getString(Workimphwb980803Po.COLUMNS.IE.name())); 
			workimphwb980803Po.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCIPIECE.name()))); 
			workimphwb980803Po.setGcidate1(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCIDATE1.name()))); 
			workimphwb980803Po.setGcidate2(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCIDATE2.name()))); 
			workimphwb980803Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCIWEIGHT.name()))); 
			workimphwb980803Po.setChws(dataObject.getString(Workimphwb980803Po.COLUMNS.CHWS.name())); 
			workimphwb980803Po.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCOPIECE.name()))); 
			workimphwb980803Po.setGcodate1(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCODATE1.name()))); 
			workimphwb980803Po.setGcodate2(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCODATE2.name()))); 
			workimphwb980803Po.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.GCOBAGSN.name()))); 
			workimphwb980803Po.setClosemark(dataObject.getString(Workimphwb980803Po.COLUMNS.CLOSEMARK.name())); 
			workimphwb980803Po.setExpressid(dataObject.getString(Workimphwb980803Po.COLUMNS.EXPRESSID.name())); 
			workimphwb980803Po.setAirlineid(dataObject.getString(Workimphwb980803Po.COLUMNS.AIRLINEID.name())); 
			workimphwb980803Po.setFlightno(dataObject.getString(Workimphwb980803Po.COLUMNS.FLIGHTNO.name())); 
			workimphwb980803Po.setFlightdest(dataObject.getString(Workimphwb980803Po.COLUMNS.FLIGHTDEST.name())); 
			workimphwb980803Po.setFlightdate(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.FLIGHTDATE.name()))); 
			workimphwb980803Po.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.CANCELGCO.name()))); 
			workimphwb980803Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.LASTUPDATE.name()))); 
			workimphwb980803Po.setHoldarea(dataObject.getString(Workimphwb980803Po.COLUMNS.HOLDAREA.name())); 
			workimphwb980803Po.setHoldreason(dataObject.getString(Workimphwb980803Po.COLUMNS.HOLDREASON.name())); 
			workimphwb980803Po.setExpbagno(dataObject.getString(Workimphwb980803Po.COLUMNS.EXPBAGNO.name())); 
			workimphwb980803Po.setGciws(dataObject.getString(Workimphwb980803Po.COLUMNS.GCIWS.name())); 
			workimphwb980803Po.setGciuser(dataObject.getString(Workimphwb980803Po.COLUMNS.GCIUSER.name())); 
			workimphwb980803Po.setGcows(dataObject.getString(Workimphwb980803Po.COLUMNS.GCOWS.name())); 
			workimphwb980803Po.setGcouser(dataObject.getString(Workimphwb980803Po.COLUMNS.GCOUSER.name())); 
			workimphwb980803Po.setChargebox(dataObject.getString(Workimphwb980803Po.COLUMNS.CHARGEBOX.name())); 
			workimphwb980803Po.setChargedate(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.CHARGEDATE.name()))); 
			workimphwb980803Po.setFrozen(dataObject.getString(Workimphwb980803Po.COLUMNS.FROZEN.name())); 
			workimphwb980803Po.setPrintduty(TimestampUtils.of(dataObject.getValue(Workimphwb980803Po.COLUMNS.PRINTDUTY.name()))); 
			workimphwb980803Po.setPrintuser(dataObject.getString(Workimphwb980803Po.COLUMNS.PRINTUSER.name())); 
			workimphwb980803Po.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(Workimphwb980803Po.COLUMNS.PRINTSN.name()))); 
			return workimphwb980803Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Workimphwb980803Po workimphwb980803Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.BAGNO.name(), workimphwb980803Po.getBagno()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.DECLNO.name(), workimphwb980803Po.getDeclno()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.DECLTYPE.name(), workimphwb980803Po.getDecltype()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.MWB.name(), workimphwb980803Po.getMwb()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.HWB.name(), workimphwb980803Po.getHwb()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.BOXNO.name(), workimphwb980803Po.getBoxno()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CLEARANCETYPE.name(), workimphwb980803Po.getClearancetype()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.RELEASETIME.name(), workimphwb980803Po.getReleasetime()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CANCELRELEASE.name(), workimphwb980803Po.getCancelrelease()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.MANUCLEARANCETYPE.name(), workimphwb980803Po.getManuclearancetype()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.PIECE.name(), workimphwb980803Po.getPiece()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.UNIT.name(), workimphwb980803Po.getUnit()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.WEIGHT.name(), workimphwb980803Po.getWeight()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.INDICATOR.name(), workimphwb980803Po.getIndicator()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.DUTYPAYMENT.name(), workimphwb980803Po.getDutypayment()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.EXAMINATIONNOTE.name(), workimphwb980803Po.getExaminationnote()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.IE.name(), workimphwb980803Po.getIe()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIPIECE.name(), workimphwb980803Po.getGcipiece()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIDATE1.name(), workimphwb980803Po.getGcidate1()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIDATE2.name(), workimphwb980803Po.getGcidate2()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIWEIGHT.name(), workimphwb980803Po.getGciweight()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CHWS.name(), workimphwb980803Po.getChws()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCOPIECE.name(), workimphwb980803Po.getGcopiece()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCODATE1.name(), workimphwb980803Po.getGcodate1()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCODATE2.name(), workimphwb980803Po.getGcodate2()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCOBAGSN.name(), workimphwb980803Po.getGcobagsn()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CLOSEMARK.name(), workimphwb980803Po.getClosemark()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.EXPRESSID.name(), workimphwb980803Po.getExpressid()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.AIRLINEID.name(), workimphwb980803Po.getAirlineid()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.FLIGHTNO.name(), workimphwb980803Po.getFlightno()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.FLIGHTDEST.name(), workimphwb980803Po.getFlightdest()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.FLIGHTDATE.name(), workimphwb980803Po.getFlightdate()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CANCELGCO.name(), workimphwb980803Po.getCancelgco()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.LASTUPDATE.name(), workimphwb980803Po.getLastupdate()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.HOLDAREA.name(), workimphwb980803Po.getHoldarea()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.HOLDREASON.name(), workimphwb980803Po.getHoldreason()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.EXPBAGNO.name(), workimphwb980803Po.getExpbagno()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIWS.name(), workimphwb980803Po.getGciws()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCIUSER.name(), workimphwb980803Po.getGciuser()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCOWS.name(), workimphwb980803Po.getGcows()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.GCOUSER.name(), workimphwb980803Po.getGcouser()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CHARGEBOX.name(), workimphwb980803Po.getChargebox()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.CHARGEDATE.name(), workimphwb980803Po.getChargedate()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.FROZEN.name(), workimphwb980803Po.getFrozen()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.PRINTDUTY.name(), workimphwb980803Po.getPrintduty()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.PRINTUSER.name(), workimphwb980803Po.getPrintuser()); 
			dataObject.setValue(Workimphwb980803Po.COLUMNS.PRINTSN.name(), workimphwb980803Po.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Workimphwb980803Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Workimphwb980803Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
