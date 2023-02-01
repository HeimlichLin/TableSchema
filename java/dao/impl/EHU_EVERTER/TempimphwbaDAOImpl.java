package com.doc.common.dao.impl; 
 
public class TempimphwbaDAOImpl extends GeneralDAOImpl<TempimphwbaPo> implements TempimphwbaDAO { 
	public static final TempimphwbaDAOImpl INSTANCE = new TempimphwbaDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPHWBA"; 

	public TempimphwbaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimphwbaPo> CONVERTER = new MapConverter<TempimphwbaPo>() { 
 
		@Override 
		public TempimphwbaPo convert(final DataObject dataObject) { 
			final TempimphwbaPo tempimphwbaPo = new TempimphwbaPo(); 
			tempimphwbaPo.setBagno(dataObject.getString(TempimphwbaPo.COLUMNS.BAGNO.name())); 
			tempimphwbaPo.setDeclno(dataObject.getString(TempimphwbaPo.COLUMNS.DECLNO.name())); 
			tempimphwbaPo.setDecltype(dataObject.getString(TempimphwbaPo.COLUMNS.DECLTYPE.name())); 
			tempimphwbaPo.setMwb(dataObject.getString(TempimphwbaPo.COLUMNS.MWB.name())); 
			tempimphwbaPo.setHwb(dataObject.getString(TempimphwbaPo.COLUMNS.HWB.name())); 
			tempimphwbaPo.setBoxno(dataObject.getString(TempimphwbaPo.COLUMNS.BOXNO.name())); 
			tempimphwbaPo.setClearancetype(dataObject.getString(TempimphwbaPo.COLUMNS.CLEARANCETYPE.name())); 
			tempimphwbaPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.RELEASETIME.name()))); 
			tempimphwbaPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.CANCELRELEASE.name()))); 
			tempimphwbaPo.setManuclearancetype(dataObject.getString(TempimphwbaPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempimphwbaPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.PIECE.name()))); 
			tempimphwbaPo.setUnit(dataObject.getString(TempimphwbaPo.COLUMNS.UNIT.name())); 
			tempimphwbaPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.WEIGHT.name()))); 
			tempimphwbaPo.setIndicator(dataObject.getString(TempimphwbaPo.COLUMNS.INDICATOR.name())); 
			tempimphwbaPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempimphwbaPo.setExaminationnote(dataObject.getString(TempimphwbaPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempimphwbaPo.setIe(dataObject.getString(TempimphwbaPo.COLUMNS.IE.name())); 
			tempimphwbaPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.GCIPIECE.name()))); 
			tempimphwbaPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.GCIDATE1.name()))); 
			tempimphwbaPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.GCIDATE2.name()))); 
			tempimphwbaPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimphwbaPo.setChws(dataObject.getString(TempimphwbaPo.COLUMNS.CHWS.name())); 
			tempimphwbaPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.GCOPIECE.name()))); 
			tempimphwbaPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.GCODATE1.name()))); 
			tempimphwbaPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.GCODATE2.name()))); 
			tempimphwbaPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.GCOBAGSN.name()))); 
			tempimphwbaPo.setClosemark(dataObject.getString(TempimphwbaPo.COLUMNS.CLOSEMARK.name())); 
			tempimphwbaPo.setExpressid(dataObject.getString(TempimphwbaPo.COLUMNS.EXPRESSID.name())); 
			tempimphwbaPo.setAirlineid(dataObject.getString(TempimphwbaPo.COLUMNS.AIRLINEID.name())); 
			tempimphwbaPo.setFlightno(dataObject.getString(TempimphwbaPo.COLUMNS.FLIGHTNO.name())); 
			tempimphwbaPo.setFlightdest(dataObject.getString(TempimphwbaPo.COLUMNS.FLIGHTDEST.name())); 
			tempimphwbaPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.FLIGHTDATE.name()))); 
			tempimphwbaPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.CANCELGCO.name()))); 
			tempimphwbaPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.LASTUPDATE.name()))); 
			tempimphwbaPo.setHoldarea(dataObject.getString(TempimphwbaPo.COLUMNS.HOLDAREA.name())); 
			tempimphwbaPo.setHoldreason(dataObject.getString(TempimphwbaPo.COLUMNS.HOLDREASON.name())); 
			tempimphwbaPo.setExpbagno(dataObject.getString(TempimphwbaPo.COLUMNS.EXPBAGNO.name())); 
			tempimphwbaPo.setGciws(dataObject.getString(TempimphwbaPo.COLUMNS.GCIWS.name())); 
			tempimphwbaPo.setGciuser(dataObject.getString(TempimphwbaPo.COLUMNS.GCIUSER.name())); 
			tempimphwbaPo.setGcows(dataObject.getString(TempimphwbaPo.COLUMNS.GCOWS.name())); 
			tempimphwbaPo.setGcouser(dataObject.getString(TempimphwbaPo.COLUMNS.GCOUSER.name())); 
			tempimphwbaPo.setChargebox(dataObject.getString(TempimphwbaPo.COLUMNS.CHARGEBOX.name())); 
			tempimphwbaPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.CHARGEDATE.name()))); 
			tempimphwbaPo.setFrozen(dataObject.getString(TempimphwbaPo.COLUMNS.FROZEN.name())); 
			tempimphwbaPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempimphwbaPo.COLUMNS.PRINTDUTY.name()))); 
			tempimphwbaPo.setPrintuser(dataObject.getString(TempimphwbaPo.COLUMNS.PRINTUSER.name())); 
			tempimphwbaPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbaPo.COLUMNS.PRINTSN.name()))); 
			return tempimphwbaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimphwbaPo tempimphwbaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.BAGNO.name(), tempimphwbaPo.getBagno()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.DECLNO.name(), tempimphwbaPo.getDeclno()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.DECLTYPE.name(), tempimphwbaPo.getDecltype()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.MWB.name(), tempimphwbaPo.getMwb()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.HWB.name(), tempimphwbaPo.getHwb()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.BOXNO.name(), tempimphwbaPo.getBoxno()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CLEARANCETYPE.name(), tempimphwbaPo.getClearancetype()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.RELEASETIME.name(), tempimphwbaPo.getReleasetime()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CANCELRELEASE.name(), tempimphwbaPo.getCancelrelease()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.MANUCLEARANCETYPE.name(), tempimphwbaPo.getManuclearancetype()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.PIECE.name(), tempimphwbaPo.getPiece()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.UNIT.name(), tempimphwbaPo.getUnit()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.WEIGHT.name(), tempimphwbaPo.getWeight()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.INDICATOR.name(), tempimphwbaPo.getIndicator()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.DUTYPAYMENT.name(), tempimphwbaPo.getDutypayment()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.EXAMINATIONNOTE.name(), tempimphwbaPo.getExaminationnote()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.IE.name(), tempimphwbaPo.getIe()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIPIECE.name(), tempimphwbaPo.getGcipiece()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIDATE1.name(), tempimphwbaPo.getGcidate1()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIDATE2.name(), tempimphwbaPo.getGcidate2()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIWEIGHT.name(), tempimphwbaPo.getGciweight()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CHWS.name(), tempimphwbaPo.getChws()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCOPIECE.name(), tempimphwbaPo.getGcopiece()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCODATE1.name(), tempimphwbaPo.getGcodate1()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCODATE2.name(), tempimphwbaPo.getGcodate2()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCOBAGSN.name(), tempimphwbaPo.getGcobagsn()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CLOSEMARK.name(), tempimphwbaPo.getClosemark()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.EXPRESSID.name(), tempimphwbaPo.getExpressid()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.AIRLINEID.name(), tempimphwbaPo.getAirlineid()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.FLIGHTNO.name(), tempimphwbaPo.getFlightno()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.FLIGHTDEST.name(), tempimphwbaPo.getFlightdest()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.FLIGHTDATE.name(), tempimphwbaPo.getFlightdate()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CANCELGCO.name(), tempimphwbaPo.getCancelgco()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.LASTUPDATE.name(), tempimphwbaPo.getLastupdate()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.HOLDAREA.name(), tempimphwbaPo.getHoldarea()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.HOLDREASON.name(), tempimphwbaPo.getHoldreason()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.EXPBAGNO.name(), tempimphwbaPo.getExpbagno()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIWS.name(), tempimphwbaPo.getGciws()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCIUSER.name(), tempimphwbaPo.getGciuser()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCOWS.name(), tempimphwbaPo.getGcows()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.GCOUSER.name(), tempimphwbaPo.getGcouser()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CHARGEBOX.name(), tempimphwbaPo.getChargebox()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.CHARGEDATE.name(), tempimphwbaPo.getChargedate()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.FROZEN.name(), tempimphwbaPo.getFrozen()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.PRINTDUTY.name(), tempimphwbaPo.getPrintduty()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.PRINTUSER.name(), tempimphwbaPo.getPrintuser()); 
			dataObject.setValue(TempimphwbaPo.COLUMNS.PRINTSN.name(), tempimphwbaPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimphwbaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimphwbaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
