package com.doc.common.dao.impl; 
 
public class TempimphwbDAOImpl extends GeneralDAOImpl<TempimphwbPo> implements TempimphwbDAO { 
	public static final TempimphwbDAOImpl INSTANCE = new TempimphwbDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPHWB"; 

	public TempimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimphwbPo> CONVERTER = new MapConverter<TempimphwbPo>() { 
 
		@Override 
		public TempimphwbPo convert(final DataObject dataObject) { 
			final TempimphwbPo tempimphwbPo = new TempimphwbPo(); 
			tempimphwbPo.setBagno(dataObject.getString(TempimphwbPo.COLUMNS.BAGNO.name())); 
			tempimphwbPo.setDeclno(dataObject.getString(TempimphwbPo.COLUMNS.DECLNO.name())); 
			tempimphwbPo.setDecltype(dataObject.getString(TempimphwbPo.COLUMNS.DECLTYPE.name())); 
			tempimphwbPo.setMwb(dataObject.getString(TempimphwbPo.COLUMNS.MWB.name())); 
			tempimphwbPo.setHwb(dataObject.getString(TempimphwbPo.COLUMNS.HWB.name())); 
			tempimphwbPo.setBoxno(dataObject.getString(TempimphwbPo.COLUMNS.BOXNO.name())); 
			tempimphwbPo.setClearancetype(dataObject.getString(TempimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			tempimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.RELEASETIME.name()))); 
			tempimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			tempimphwbPo.setManuclearancetype(dataObject.getString(TempimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tempimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.PIECE.name()))); 
			tempimphwbPo.setUnit(dataObject.getString(TempimphwbPo.COLUMNS.UNIT.name())); 
			tempimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.WEIGHT.name()))); 
			tempimphwbPo.setIndicator(dataObject.getString(TempimphwbPo.COLUMNS.INDICATOR.name())); 
			tempimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			tempimphwbPo.setExaminationnote(dataObject.getString(TempimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tempimphwbPo.setIe(dataObject.getString(TempimphwbPo.COLUMNS.IE.name())); 
			tempimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.GCIPIECE.name()))); 
			tempimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.GCIDATE1.name()))); 
			tempimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.GCIDATE2.name()))); 
			tempimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimphwbPo.setChws(dataObject.getString(TempimphwbPo.COLUMNS.CHWS.name())); 
			tempimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.GCOPIECE.name()))); 
			tempimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.GCODATE1.name()))); 
			tempimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.GCODATE2.name()))); 
			tempimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			tempimphwbPo.setClosemark(dataObject.getString(TempimphwbPo.COLUMNS.CLOSEMARK.name())); 
			tempimphwbPo.setExpressid(dataObject.getString(TempimphwbPo.COLUMNS.EXPRESSID.name())); 
			tempimphwbPo.setAirlineid(dataObject.getString(TempimphwbPo.COLUMNS.AIRLINEID.name())); 
			tempimphwbPo.setFlightno(dataObject.getString(TempimphwbPo.COLUMNS.FLIGHTNO.name())); 
			tempimphwbPo.setFlightdest(dataObject.getString(TempimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			tempimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			tempimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.CANCELGCO.name()))); 
			tempimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			tempimphwbPo.setHoldarea(dataObject.getString(TempimphwbPo.COLUMNS.HOLDAREA.name())); 
			tempimphwbPo.setHoldreason(dataObject.getString(TempimphwbPo.COLUMNS.HOLDREASON.name())); 
			tempimphwbPo.setExpbagno(dataObject.getString(TempimphwbPo.COLUMNS.EXPBAGNO.name())); 
			tempimphwbPo.setGciws(dataObject.getString(TempimphwbPo.COLUMNS.GCIWS.name())); 
			tempimphwbPo.setGciuser(dataObject.getString(TempimphwbPo.COLUMNS.GCIUSER.name())); 
			tempimphwbPo.setGcows(dataObject.getString(TempimphwbPo.COLUMNS.GCOWS.name())); 
			tempimphwbPo.setGcouser(dataObject.getString(TempimphwbPo.COLUMNS.GCOUSER.name())); 
			tempimphwbPo.setChargebox(dataObject.getString(TempimphwbPo.COLUMNS.CHARGEBOX.name())); 
			tempimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			tempimphwbPo.setFrozen(dataObject.getString(TempimphwbPo.COLUMNS.FROZEN.name())); 
			tempimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			tempimphwbPo.setPrintuser(dataObject.getString(TempimphwbPo.COLUMNS.PRINTUSER.name())); 
			tempimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(TempimphwbPo.COLUMNS.PRINTSN.name()))); 
			tempimphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.GCILOCK.name()))); 
			tempimphwbPo.setLockuser(dataObject.getString(TempimphwbPo.COLUMNS.LOCKUSER.name())); 
			tempimphwbPo.setLastdeclno(dataObject.getString(TempimphwbPo.COLUMNS.LASTDECLNO.name())); 
			tempimphwbPo.setLastdecltype(dataObject.getString(TempimphwbPo.COLUMNS.LASTDECLTYPE.name())); 
			tempimphwbPo.setWorkarea(dataObject.getString(TempimphwbPo.COLUMNS.WORKAREA.name())); 
			tempimphwbPo.setExpreowner(dataObject.getString(TempimphwbPo.COLUMNS.EXPREOWNER.name())); 
			tempimphwbPo.setCff(dataObject.getString(TempimphwbPo.COLUMNS.CFF.name())); 
			tempimphwbPo.setOclearancetype(dataObject.getString(TempimphwbPo.COLUMNS.OCLEARANCETYPE.name())); 
			tempimphwbPo.setOctrcvdate(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.OCTRCVDATE.name()))); 
			tempimphwbPo.setCtlastupdate(TimestampUtils.of(dataObject.getValue(TempimphwbPo.COLUMNS.CTLASTUPDATE.name()))); 
			return tempimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimphwbPo tempimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimphwbPo.COLUMNS.BAGNO.name(), tempimphwbPo.getBagno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.DECLNO.name(), tempimphwbPo.getDeclno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.DECLTYPE.name(), tempimphwbPo.getDecltype()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.MWB.name(), tempimphwbPo.getMwb()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.HWB.name(), tempimphwbPo.getHwb()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.BOXNO.name(), tempimphwbPo.getBoxno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CLEARANCETYPE.name(), tempimphwbPo.getClearancetype()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.RELEASETIME.name(), tempimphwbPo.getReleasetime()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CANCELRELEASE.name(), tempimphwbPo.getCancelrelease()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), tempimphwbPo.getManuclearancetype()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.PIECE.name(), tempimphwbPo.getPiece()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.UNIT.name(), tempimphwbPo.getUnit()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.WEIGHT.name(), tempimphwbPo.getWeight()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.INDICATOR.name(), tempimphwbPo.getIndicator()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.DUTYPAYMENT.name(), tempimphwbPo.getDutypayment()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), tempimphwbPo.getExaminationnote()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.IE.name(), tempimphwbPo.getIe()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIPIECE.name(), tempimphwbPo.getGcipiece()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIDATE1.name(), tempimphwbPo.getGcidate1()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIDATE2.name(), tempimphwbPo.getGcidate2()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIWEIGHT.name(), tempimphwbPo.getGciweight()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CHWS.name(), tempimphwbPo.getChws()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCOPIECE.name(), tempimphwbPo.getGcopiece()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCODATE1.name(), tempimphwbPo.getGcodate1()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCODATE2.name(), tempimphwbPo.getGcodate2()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCOBAGSN.name(), tempimphwbPo.getGcobagsn()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CLOSEMARK.name(), tempimphwbPo.getClosemark()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.EXPRESSID.name(), tempimphwbPo.getExpressid()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.AIRLINEID.name(), tempimphwbPo.getAirlineid()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.FLIGHTNO.name(), tempimphwbPo.getFlightno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.FLIGHTDEST.name(), tempimphwbPo.getFlightdest()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.FLIGHTDATE.name(), tempimphwbPo.getFlightdate()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CANCELGCO.name(), tempimphwbPo.getCancelgco()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.LASTUPDATE.name(), tempimphwbPo.getLastupdate()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.HOLDAREA.name(), tempimphwbPo.getHoldarea()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.HOLDREASON.name(), tempimphwbPo.getHoldreason()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.EXPBAGNO.name(), tempimphwbPo.getExpbagno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIWS.name(), tempimphwbPo.getGciws()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCIUSER.name(), tempimphwbPo.getGciuser()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCOWS.name(), tempimphwbPo.getGcows()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCOUSER.name(), tempimphwbPo.getGcouser()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CHARGEBOX.name(), tempimphwbPo.getChargebox()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CHARGEDATE.name(), tempimphwbPo.getChargedate()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.FROZEN.name(), tempimphwbPo.getFrozen()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.PRINTDUTY.name(), tempimphwbPo.getPrintduty()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.PRINTUSER.name(), tempimphwbPo.getPrintuser()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.PRINTSN.name(), tempimphwbPo.getPrintsn()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.GCILOCK.name(), tempimphwbPo.getGcilock()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.LOCKUSER.name(), tempimphwbPo.getLockuser()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.LASTDECLNO.name(), tempimphwbPo.getLastdeclno()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.LASTDECLTYPE.name(), tempimphwbPo.getLastdecltype()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.WORKAREA.name(), tempimphwbPo.getWorkarea()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.EXPREOWNER.name(), tempimphwbPo.getExpreowner()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CFF.name(), tempimphwbPo.getCff()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.OCLEARANCETYPE.name(), tempimphwbPo.getOclearancetype()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.OCTRCVDATE.name(), tempimphwbPo.getOctrcvdate()); 
			dataObject.setValue(TempimphwbPo.COLUMNS.CTLASTUPDATE.name(), tempimphwbPo.getCtlastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
