package com.doc.common.dao.impl; 
 
public class TempimphwbbDAOImpl extends GeneralDAOImpl<TempimphwbbPo> implements TempimphwbbDAO { 
	public static final TempimphwbbDAOImpl INSTANCE = new TempimphwbbDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPHWBB"; 

	public TempimphwbbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimphwbbPo> CONVERTER = new MapConverter<TempimphwbbPo>() { 
 
		@Override 
		public TempimphwbbPo convert(final DataObject dataObject) { 
			final TempimphwbbPo tempimphwbbPo = new TempimphwbbPo(); 
			tempimphwbbPo.setBagno(dataObject.getString(TempimphwbbPo.COLUMNS.BAGNO.name())); 
			tempimphwbbPo.setDeclno(dataObject.getString(TempimphwbbPo.COLUMNS.DECLNO.name())); 
			tempimphwbbPo.setDecltype(dataObject.getString(TempimphwbbPo.COLUMNS.DECLTYPE.name())); 
			tempimphwbbPo.setMwb(dataObject.getString(TempimphwbbPo.COLUMNS.MWB.name())); 
			tempimphwbbPo.setHwb(dataObject.getString(TempimphwbbPo.COLUMNS.HWB.name())); 
			tempimphwbbPo.setBoxno(dataObject.getString(TempimphwbbPo.COLUMNS.BOXNO.name())); 
			tempimphwbbPo.setClearancetype(dataObject.getString(TempimphwbbPo.COLUMNS.CLEARANCETYPE.name())); 
			tempimphwbbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.RELEASETIME.name()))); 
			tempimphwbbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.CANCELRELEASE.name()))); 
			tempimphwbbPo.setManuclearancetype(dataObject.getString(TempimphwbbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempimphwbbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.PIECE.name()))); 
			tempimphwbbPo.setUnit(dataObject.getString(TempimphwbbPo.COLUMNS.UNIT.name())); 
			tempimphwbbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.WEIGHT.name()))); 
			tempimphwbbPo.setIndicator(dataObject.getString(TempimphwbbPo.COLUMNS.INDICATOR.name())); 
			tempimphwbbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempimphwbbPo.setExaminationnote(dataObject.getString(TempimphwbbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempimphwbbPo.setIe(dataObject.getString(TempimphwbbPo.COLUMNS.IE.name())); 
			tempimphwbbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.GCIPIECE.name()))); 
			tempimphwbbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.GCIDATE1.name()))); 
			tempimphwbbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.GCIDATE2.name()))); 
			tempimphwbbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimphwbbPo.setChws(dataObject.getString(TempimphwbbPo.COLUMNS.CHWS.name())); 
			tempimphwbbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.GCOPIECE.name()))); 
			tempimphwbbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.GCODATE1.name()))); 
			tempimphwbbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.GCODATE2.name()))); 
			tempimphwbbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.GCOBAGSN.name()))); 
			tempimphwbbPo.setClosemark(dataObject.getString(TempimphwbbPo.COLUMNS.CLOSEMARK.name())); 
			tempimphwbbPo.setExpressid(dataObject.getString(TempimphwbbPo.COLUMNS.EXPRESSID.name())); 
			tempimphwbbPo.setAirlineid(dataObject.getString(TempimphwbbPo.COLUMNS.AIRLINEID.name())); 
			tempimphwbbPo.setFlightno(dataObject.getString(TempimphwbbPo.COLUMNS.FLIGHTNO.name())); 
			tempimphwbbPo.setFlightdest(dataObject.getString(TempimphwbbPo.COLUMNS.FLIGHTDEST.name())); 
			tempimphwbbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.FLIGHTDATE.name()))); 
			tempimphwbbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.CANCELGCO.name()))); 
			tempimphwbbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.LASTUPDATE.name()))); 
			tempimphwbbPo.setHoldarea(dataObject.getString(TempimphwbbPo.COLUMNS.HOLDAREA.name())); 
			tempimphwbbPo.setHoldreason(dataObject.getString(TempimphwbbPo.COLUMNS.HOLDREASON.name())); 
			tempimphwbbPo.setExpbagno(dataObject.getString(TempimphwbbPo.COLUMNS.EXPBAGNO.name())); 
			tempimphwbbPo.setGciws(dataObject.getString(TempimphwbbPo.COLUMNS.GCIWS.name())); 
			tempimphwbbPo.setGciuser(dataObject.getString(TempimphwbbPo.COLUMNS.GCIUSER.name())); 
			tempimphwbbPo.setGcows(dataObject.getString(TempimphwbbPo.COLUMNS.GCOWS.name())); 
			tempimphwbbPo.setGcouser(dataObject.getString(TempimphwbbPo.COLUMNS.GCOUSER.name())); 
			tempimphwbbPo.setChargebox(dataObject.getString(TempimphwbbPo.COLUMNS.CHARGEBOX.name())); 
			tempimphwbbPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.CHARGEDATE.name()))); 
			tempimphwbbPo.setFrozen(dataObject.getString(TempimphwbbPo.COLUMNS.FROZEN.name())); 
			tempimphwbbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempimphwbbPo.COLUMNS.PRINTDUTY.name()))); 
			tempimphwbbPo.setPrintuser(dataObject.getString(TempimphwbbPo.COLUMNS.PRINTUSER.name())); 
			tempimphwbbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbbPo.COLUMNS.PRINTSN.name()))); 
			return tempimphwbbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimphwbbPo tempimphwbbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.BAGNO.name(), tempimphwbbPo.getBagno()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.DECLNO.name(), tempimphwbbPo.getDeclno()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.DECLTYPE.name(), tempimphwbbPo.getDecltype()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.MWB.name(), tempimphwbbPo.getMwb()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.HWB.name(), tempimphwbbPo.getHwb()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.BOXNO.name(), tempimphwbbPo.getBoxno()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CLEARANCETYPE.name(), tempimphwbbPo.getClearancetype()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.RELEASETIME.name(), tempimphwbbPo.getReleasetime()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CANCELRELEASE.name(), tempimphwbbPo.getCancelrelease()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.MANUCLEARANCETYPE.name(), tempimphwbbPo.getManuclearancetype()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.PIECE.name(), tempimphwbbPo.getPiece()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.UNIT.name(), tempimphwbbPo.getUnit()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.WEIGHT.name(), tempimphwbbPo.getWeight()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.INDICATOR.name(), tempimphwbbPo.getIndicator()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.DUTYPAYMENT.name(), tempimphwbbPo.getDutypayment()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.EXAMINATIONNOTE.name(), tempimphwbbPo.getExaminationnote()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.IE.name(), tempimphwbbPo.getIe()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIPIECE.name(), tempimphwbbPo.getGcipiece()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIDATE1.name(), tempimphwbbPo.getGcidate1()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIDATE2.name(), tempimphwbbPo.getGcidate2()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIWEIGHT.name(), tempimphwbbPo.getGciweight()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CHWS.name(), tempimphwbbPo.getChws()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCOPIECE.name(), tempimphwbbPo.getGcopiece()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCODATE1.name(), tempimphwbbPo.getGcodate1()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCODATE2.name(), tempimphwbbPo.getGcodate2()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCOBAGSN.name(), tempimphwbbPo.getGcobagsn()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CLOSEMARK.name(), tempimphwbbPo.getClosemark()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.EXPRESSID.name(), tempimphwbbPo.getExpressid()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.AIRLINEID.name(), tempimphwbbPo.getAirlineid()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.FLIGHTNO.name(), tempimphwbbPo.getFlightno()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.FLIGHTDEST.name(), tempimphwbbPo.getFlightdest()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.FLIGHTDATE.name(), tempimphwbbPo.getFlightdate()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CANCELGCO.name(), tempimphwbbPo.getCancelgco()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.LASTUPDATE.name(), tempimphwbbPo.getLastupdate()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.HOLDAREA.name(), tempimphwbbPo.getHoldarea()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.HOLDREASON.name(), tempimphwbbPo.getHoldreason()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.EXPBAGNO.name(), tempimphwbbPo.getExpbagno()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIWS.name(), tempimphwbbPo.getGciws()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCIUSER.name(), tempimphwbbPo.getGciuser()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCOWS.name(), tempimphwbbPo.getGcows()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.GCOUSER.name(), tempimphwbbPo.getGcouser()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CHARGEBOX.name(), tempimphwbbPo.getChargebox()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.CHARGEDATE.name(), tempimphwbbPo.getChargedate()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.FROZEN.name(), tempimphwbbPo.getFrozen()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.PRINTDUTY.name(), tempimphwbbPo.getPrintduty()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.PRINTUSER.name(), tempimphwbbPo.getPrintuser()); 
			dataObject.setValue(TempimphwbbPo.COLUMNS.PRINTSN.name(), tempimphwbbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimphwbbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimphwbbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
