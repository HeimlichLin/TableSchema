package com.doc.common.dao.impl; 
 
public class TempexphwbDAOImpl extends GeneralDAOImpl<TempexphwbPo> implements TempexphwbDAO { 
	public static final TempexphwbDAOImpl INSTANCE = new TempexphwbDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPHWB"; 

	public TempexphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexphwbPo> CONVERTER = new MapConverter<TempexphwbPo>() { 
 
		@Override 
		public TempexphwbPo convert(final DataObject dataObject) { 
			final TempexphwbPo tempexphwbPo = new TempexphwbPo(); 
			tempexphwbPo.setBagno(dataObject.getString(TempexphwbPo.COLUMNS.BAGNO.name())); 
			tempexphwbPo.setDeclno(dataObject.getString(TempexphwbPo.COLUMNS.DECLNO.name())); 
			tempexphwbPo.setDecltype(dataObject.getString(TempexphwbPo.COLUMNS.DECLTYPE.name())); 
			tempexphwbPo.setMwb(dataObject.getString(TempexphwbPo.COLUMNS.MWB.name())); 
			tempexphwbPo.setHwb(dataObject.getString(TempexphwbPo.COLUMNS.HWB.name())); 
			tempexphwbPo.setBoxno(dataObject.getString(TempexphwbPo.COLUMNS.BOXNO.name())); 
			tempexphwbPo.setClearancetype(dataObject.getString(TempexphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			tempexphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.RELEASETIME.name()))); 
			tempexphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			tempexphwbPo.setManuclearancetype(dataObject.getString(TempexphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempexphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.PIECE.name()))); 
			tempexphwbPo.setUnit(dataObject.getString(TempexphwbPo.COLUMNS.UNIT.name())); 
			tempexphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.WEIGHT.name()))); 
			tempexphwbPo.setIndicator(dataObject.getString(TempexphwbPo.COLUMNS.INDICATOR.name())); 
			tempexphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempexphwbPo.setExaminationnote(dataObject.getString(TempexphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempexphwbPo.setIe(dataObject.getString(TempexphwbPo.COLUMNS.IE.name())); 
			tempexphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.GCIPIECE.name()))); 
			tempexphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.GCIDATE1.name()))); 
			tempexphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.GCIDATE2.name()))); 
			tempexphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			tempexphwbPo.setChws(dataObject.getString(TempexphwbPo.COLUMNS.CHWS.name())); 
			tempexphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.GCOPIECE.name()))); 
			tempexphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.GCODATE1.name()))); 
			tempexphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.GCODATE2.name()))); 
			tempexphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.GCOBAGSN.name()))); 
			tempexphwbPo.setClosemark(dataObject.getString(TempexphwbPo.COLUMNS.CLOSEMARK.name())); 
			tempexphwbPo.setExpressid(dataObject.getString(TempexphwbPo.COLUMNS.EXPRESSID.name())); 
			tempexphwbPo.setAirlineid(dataObject.getString(TempexphwbPo.COLUMNS.AIRLINEID.name())); 
			tempexphwbPo.setFlightno(dataObject.getString(TempexphwbPo.COLUMNS.FLIGHTNO.name())); 
			tempexphwbPo.setFlightdest(dataObject.getString(TempexphwbPo.COLUMNS.FLIGHTDEST.name())); 
			tempexphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			tempexphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.CANCELGCO.name()))); 
			tempexphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.LASTUPDATE.name()))); 
			tempexphwbPo.setHoldarea(dataObject.getString(TempexphwbPo.COLUMNS.HOLDAREA.name())); 
			tempexphwbPo.setHoldreason(dataObject.getString(TempexphwbPo.COLUMNS.HOLDREASON.name())); 
			tempexphwbPo.setExpbagno(dataObject.getString(TempexphwbPo.COLUMNS.EXPBAGNO.name())); 
			tempexphwbPo.setGciws(dataObject.getString(TempexphwbPo.COLUMNS.GCIWS.name())); 
			tempexphwbPo.setGciuser(dataObject.getString(TempexphwbPo.COLUMNS.GCIUSER.name())); 
			tempexphwbPo.setGcows(dataObject.getString(TempexphwbPo.COLUMNS.GCOWS.name())); 
			tempexphwbPo.setGcouser(dataObject.getString(TempexphwbPo.COLUMNS.GCOUSER.name())); 
			tempexphwbPo.setChargebox(dataObject.getString(TempexphwbPo.COLUMNS.CHARGEBOX.name())); 
			tempexphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.CHARGEDATE.name()))); 
			tempexphwbPo.setFrozen(dataObject.getString(TempexphwbPo.COLUMNS.FROZEN.name())); 
			tempexphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempexphwbPo.COLUMNS.PRINTDUTY.name()))); 
			tempexphwbPo.setPrintuser(dataObject.getString(TempexphwbPo.COLUMNS.PRINTUSER.name())); 
			tempexphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempexphwbPo.COLUMNS.PRINTSN.name()))); 
			return tempexphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexphwbPo tempexphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexphwbPo.COLUMNS.BAGNO.name(), tempexphwbPo.getBagno()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.DECLNO.name(), tempexphwbPo.getDeclno()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.DECLTYPE.name(), tempexphwbPo.getDecltype()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.MWB.name(), tempexphwbPo.getMwb()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.HWB.name(), tempexphwbPo.getHwb()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.BOXNO.name(), tempexphwbPo.getBoxno()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CLEARANCETYPE.name(), tempexphwbPo.getClearancetype()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.RELEASETIME.name(), tempexphwbPo.getReleasetime()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CANCELRELEASE.name(), tempexphwbPo.getCancelrelease()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), tempexphwbPo.getManuclearancetype()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.PIECE.name(), tempexphwbPo.getPiece()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.UNIT.name(), tempexphwbPo.getUnit()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.WEIGHT.name(), tempexphwbPo.getWeight()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.INDICATOR.name(), tempexphwbPo.getIndicator()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.DUTYPAYMENT.name(), tempexphwbPo.getDutypayment()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.EXAMINATIONNOTE.name(), tempexphwbPo.getExaminationnote()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.IE.name(), tempexphwbPo.getIe()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIPIECE.name(), tempexphwbPo.getGcipiece()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIDATE1.name(), tempexphwbPo.getGcidate1()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIDATE2.name(), tempexphwbPo.getGcidate2()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIWEIGHT.name(), tempexphwbPo.getGciweight()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CHWS.name(), tempexphwbPo.getChws()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCOPIECE.name(), tempexphwbPo.getGcopiece()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCODATE1.name(), tempexphwbPo.getGcodate1()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCODATE2.name(), tempexphwbPo.getGcodate2()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCOBAGSN.name(), tempexphwbPo.getGcobagsn()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CLOSEMARK.name(), tempexphwbPo.getClosemark()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.EXPRESSID.name(), tempexphwbPo.getExpressid()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.AIRLINEID.name(), tempexphwbPo.getAirlineid()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.FLIGHTNO.name(), tempexphwbPo.getFlightno()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.FLIGHTDEST.name(), tempexphwbPo.getFlightdest()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.FLIGHTDATE.name(), tempexphwbPo.getFlightdate()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CANCELGCO.name(), tempexphwbPo.getCancelgco()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.LASTUPDATE.name(), tempexphwbPo.getLastupdate()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.HOLDAREA.name(), tempexphwbPo.getHoldarea()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.HOLDREASON.name(), tempexphwbPo.getHoldreason()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.EXPBAGNO.name(), tempexphwbPo.getExpbagno()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIWS.name(), tempexphwbPo.getGciws()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCIUSER.name(), tempexphwbPo.getGciuser()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCOWS.name(), tempexphwbPo.getGcows()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.GCOUSER.name(), tempexphwbPo.getGcouser()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CHARGEBOX.name(), tempexphwbPo.getChargebox()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.CHARGEDATE.name(), tempexphwbPo.getChargedate()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.FROZEN.name(), tempexphwbPo.getFrozen()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.PRINTDUTY.name(), tempexphwbPo.getPrintduty()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.PRINTUSER.name(), tempexphwbPo.getPrintuser()); 
			dataObject.setValue(TempexphwbPo.COLUMNS.PRINTSN.name(), tempexphwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
