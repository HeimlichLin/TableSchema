package com.doc.common.dao.impl; 
 
public class TempexphwbBakDAOImpl extends GeneralDAOImpl<TempexphwbBakPo> implements TempexphwbBakDAO { 
	public static final TempexphwbBakDAOImpl INSTANCE = new TempexphwbBakDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPHWB_BAK"; 

	public TempexphwbBakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexphwbBakPo> CONVERTER = new MapConverter<TempexphwbBakPo>() { 
 
		@Override 
		public TempexphwbBakPo convert(final DataObject dataObject) { 
			final TempexphwbBakPo tempexphwbBakPo = new TempexphwbBakPo(); 
			tempexphwbBakPo.setBagno(dataObject.getString(TempexphwbBakPo.COLUMNS.BAGNO.name())); 
			tempexphwbBakPo.setDeclno(dataObject.getString(TempexphwbBakPo.COLUMNS.DECLNO.name())); 
			tempexphwbBakPo.setDecltype(dataObject.getString(TempexphwbBakPo.COLUMNS.DECLTYPE.name())); 
			tempexphwbBakPo.setMwb(dataObject.getString(TempexphwbBakPo.COLUMNS.MWB.name())); 
			tempexphwbBakPo.setHwb(dataObject.getString(TempexphwbBakPo.COLUMNS.HWB.name())); 
			tempexphwbBakPo.setBoxno(dataObject.getString(TempexphwbBakPo.COLUMNS.BOXNO.name())); 
			tempexphwbBakPo.setClearancetype(dataObject.getString(TempexphwbBakPo.COLUMNS.CLEARANCETYPE.name())); 
			tempexphwbBakPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.RELEASETIME.name()))); 
			tempexphwbBakPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.CANCELRELEASE.name()))); 
			tempexphwbBakPo.setManuclearancetype(dataObject.getString(TempexphwbBakPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempexphwbBakPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.PIECE.name()))); 
			tempexphwbBakPo.setUnit(dataObject.getString(TempexphwbBakPo.COLUMNS.UNIT.name())); 
			tempexphwbBakPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.WEIGHT.name()))); 
			tempexphwbBakPo.setIndicator(dataObject.getString(TempexphwbBakPo.COLUMNS.INDICATOR.name())); 
			tempexphwbBakPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempexphwbBakPo.setExaminationnote(dataObject.getString(TempexphwbBakPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempexphwbBakPo.setIe(dataObject.getString(TempexphwbBakPo.COLUMNS.IE.name())); 
			tempexphwbBakPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCIPIECE.name()))); 
			tempexphwbBakPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCIDATE1.name()))); 
			tempexphwbBakPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCIDATE2.name()))); 
			tempexphwbBakPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCIWEIGHT.name()))); 
			tempexphwbBakPo.setChws(dataObject.getString(TempexphwbBakPo.COLUMNS.CHWS.name())); 
			tempexphwbBakPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCOPIECE.name()))); 
			tempexphwbBakPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCODATE1.name()))); 
			tempexphwbBakPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCODATE2.name()))); 
			tempexphwbBakPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.GCOBAGSN.name()))); 
			tempexphwbBakPo.setClosemark(dataObject.getString(TempexphwbBakPo.COLUMNS.CLOSEMARK.name())); 
			tempexphwbBakPo.setExpressid(dataObject.getString(TempexphwbBakPo.COLUMNS.EXPRESSID.name())); 
			tempexphwbBakPo.setAirlineid(dataObject.getString(TempexphwbBakPo.COLUMNS.AIRLINEID.name())); 
			tempexphwbBakPo.setFlightno(dataObject.getString(TempexphwbBakPo.COLUMNS.FLIGHTNO.name())); 
			tempexphwbBakPo.setFlightdest(dataObject.getString(TempexphwbBakPo.COLUMNS.FLIGHTDEST.name())); 
			tempexphwbBakPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.FLIGHTDATE.name()))); 
			tempexphwbBakPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.CANCELGCO.name()))); 
			tempexphwbBakPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.LASTUPDATE.name()))); 
			tempexphwbBakPo.setHoldarea(dataObject.getString(TempexphwbBakPo.COLUMNS.HOLDAREA.name())); 
			tempexphwbBakPo.setHoldreason(dataObject.getString(TempexphwbBakPo.COLUMNS.HOLDREASON.name())); 
			tempexphwbBakPo.setExpbagno(dataObject.getString(TempexphwbBakPo.COLUMNS.EXPBAGNO.name())); 
			tempexphwbBakPo.setGciws(dataObject.getString(TempexphwbBakPo.COLUMNS.GCIWS.name())); 
			tempexphwbBakPo.setGciuser(dataObject.getString(TempexphwbBakPo.COLUMNS.GCIUSER.name())); 
			tempexphwbBakPo.setGcows(dataObject.getString(TempexphwbBakPo.COLUMNS.GCOWS.name())); 
			tempexphwbBakPo.setGcouser(dataObject.getString(TempexphwbBakPo.COLUMNS.GCOUSER.name())); 
			tempexphwbBakPo.setChargebox(dataObject.getString(TempexphwbBakPo.COLUMNS.CHARGEBOX.name())); 
			tempexphwbBakPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.CHARGEDATE.name()))); 
			tempexphwbBakPo.setFrozen(dataObject.getString(TempexphwbBakPo.COLUMNS.FROZEN.name())); 
			tempexphwbBakPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempexphwbBakPo.COLUMNS.PRINTDUTY.name()))); 
			tempexphwbBakPo.setPrintuser(dataObject.getString(TempexphwbBakPo.COLUMNS.PRINTUSER.name())); 
			tempexphwbBakPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbBakPo.COLUMNS.PRINTSN.name()))); 
			return tempexphwbBakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexphwbBakPo tempexphwbBakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.BAGNO.name(), tempexphwbBakPo.getBagno()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.DECLNO.name(), tempexphwbBakPo.getDeclno()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.DECLTYPE.name(), tempexphwbBakPo.getDecltype()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.MWB.name(), tempexphwbBakPo.getMwb()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.HWB.name(), tempexphwbBakPo.getHwb()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.BOXNO.name(), tempexphwbBakPo.getBoxno()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CLEARANCETYPE.name(), tempexphwbBakPo.getClearancetype()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.RELEASETIME.name(), tempexphwbBakPo.getReleasetime()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CANCELRELEASE.name(), tempexphwbBakPo.getCancelrelease()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.MANUCLEARANCETYPE.name(), tempexphwbBakPo.getManuclearancetype()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.PIECE.name(), tempexphwbBakPo.getPiece()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.UNIT.name(), tempexphwbBakPo.getUnit()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.WEIGHT.name(), tempexphwbBakPo.getWeight()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.INDICATOR.name(), tempexphwbBakPo.getIndicator()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.DUTYPAYMENT.name(), tempexphwbBakPo.getDutypayment()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.EXAMINATIONNOTE.name(), tempexphwbBakPo.getExaminationnote()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.IE.name(), tempexphwbBakPo.getIe()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIPIECE.name(), tempexphwbBakPo.getGcipiece()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIDATE1.name(), tempexphwbBakPo.getGcidate1()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIDATE2.name(), tempexphwbBakPo.getGcidate2()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIWEIGHT.name(), tempexphwbBakPo.getGciweight()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CHWS.name(), tempexphwbBakPo.getChws()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCOPIECE.name(), tempexphwbBakPo.getGcopiece()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCODATE1.name(), tempexphwbBakPo.getGcodate1()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCODATE2.name(), tempexphwbBakPo.getGcodate2()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCOBAGSN.name(), tempexphwbBakPo.getGcobagsn()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CLOSEMARK.name(), tempexphwbBakPo.getClosemark()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.EXPRESSID.name(), tempexphwbBakPo.getExpressid()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.AIRLINEID.name(), tempexphwbBakPo.getAirlineid()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.FLIGHTNO.name(), tempexphwbBakPo.getFlightno()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.FLIGHTDEST.name(), tempexphwbBakPo.getFlightdest()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.FLIGHTDATE.name(), tempexphwbBakPo.getFlightdate()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CANCELGCO.name(), tempexphwbBakPo.getCancelgco()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.LASTUPDATE.name(), tempexphwbBakPo.getLastupdate()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.HOLDAREA.name(), tempexphwbBakPo.getHoldarea()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.HOLDREASON.name(), tempexphwbBakPo.getHoldreason()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.EXPBAGNO.name(), tempexphwbBakPo.getExpbagno()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIWS.name(), tempexphwbBakPo.getGciws()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCIUSER.name(), tempexphwbBakPo.getGciuser()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCOWS.name(), tempexphwbBakPo.getGcows()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.GCOUSER.name(), tempexphwbBakPo.getGcouser()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CHARGEBOX.name(), tempexphwbBakPo.getChargebox()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.CHARGEDATE.name(), tempexphwbBakPo.getChargedate()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.FROZEN.name(), tempexphwbBakPo.getFrozen()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.PRINTDUTY.name(), tempexphwbBakPo.getPrintduty()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.PRINTUSER.name(), tempexphwbBakPo.getPrintuser()); 
			dataObject.setValue(TempexphwbBakPo.COLUMNS.PRINTSN.name(), tempexphwbBakPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexphwbBakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexphwbBakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
