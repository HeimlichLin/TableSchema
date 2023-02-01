package com.doc.common.dao.impl; 
 
public class ErrexphwbDAOImpl extends GeneralDAOImpl<ErrexphwbPo> implements ErrexphwbDAO { 
	public static final ErrexphwbDAOImpl INSTANCE = new ErrexphwbDAOImpl(); 
	public static final String TABLENAME = "ERREXPHWB"; 

	public ErrexphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrexphwbPo> CONVERTER = new MapConverter<ErrexphwbPo>() { 
 
		@Override 
		public ErrexphwbPo convert(final DataObject dataObject) { 
			final ErrexphwbPo errexphwbPo = new ErrexphwbPo(); 
			errexphwbPo.setBagno(dataObject.getString(ErrexphwbPo.COLUMNS.BAGNO.name())); 
			errexphwbPo.setDeclno(dataObject.getString(ErrexphwbPo.COLUMNS.DECLNO.name())); 
			errexphwbPo.setDecltype(dataObject.getString(ErrexphwbPo.COLUMNS.DECLTYPE.name())); 
			errexphwbPo.setMwb(dataObject.getString(ErrexphwbPo.COLUMNS.MWB.name())); 
			errexphwbPo.setHwb(dataObject.getString(ErrexphwbPo.COLUMNS.HWB.name())); 
			errexphwbPo.setBoxno(dataObject.getString(ErrexphwbPo.COLUMNS.BOXNO.name())); 
			errexphwbPo.setClearancetype(dataObject.getString(ErrexphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			errexphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.RELEASETIME.name()))); 
			errexphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			errexphwbPo.setManuclearancetype(dataObject.getString(ErrexphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			errexphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.PIECE.name()))); 
			errexphwbPo.setUnit(dataObject.getString(ErrexphwbPo.COLUMNS.UNIT.name())); 
			errexphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.WEIGHT.name()))); 
			errexphwbPo.setIndicator(dataObject.getString(ErrexphwbPo.COLUMNS.INDICATOR.name())); 
			errexphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			errexphwbPo.setExaminationnote(dataObject.getString(ErrexphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			errexphwbPo.setIe(dataObject.getString(ErrexphwbPo.COLUMNS.IE.name())); 
			errexphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.GCIPIECE.name()))); 
			errexphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.GCIDATE1.name()))); 
			errexphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.GCIDATE2.name()))); 
			errexphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			errexphwbPo.setChws(dataObject.getString(ErrexphwbPo.COLUMNS.CHWS.name())); 
			errexphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.GCOPIECE.name()))); 
			errexphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.GCODATE1.name()))); 
			errexphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.GCODATE2.name()))); 
			errexphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.GCOBAGSN.name()))); 
			errexphwbPo.setClosemark(dataObject.getString(ErrexphwbPo.COLUMNS.CLOSEMARK.name())); 
			errexphwbPo.setExpressid(dataObject.getString(ErrexphwbPo.COLUMNS.EXPRESSID.name())); 
			errexphwbPo.setAirlineid(dataObject.getString(ErrexphwbPo.COLUMNS.AIRLINEID.name())); 
			errexphwbPo.setFlightno(dataObject.getString(ErrexphwbPo.COLUMNS.FLIGHTNO.name())); 
			errexphwbPo.setFlightdest(dataObject.getString(ErrexphwbPo.COLUMNS.FLIGHTDEST.name())); 
			errexphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			errexphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.CANCELGCO.name()))); 
			errexphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.LASTUPDATE.name()))); 
			errexphwbPo.setHoldarea(dataObject.getString(ErrexphwbPo.COLUMNS.HOLDAREA.name())); 
			errexphwbPo.setHoldreason(dataObject.getString(ErrexphwbPo.COLUMNS.HOLDREASON.name())); 
			errexphwbPo.setExpbagno(dataObject.getString(ErrexphwbPo.COLUMNS.EXPBAGNO.name())); 
			errexphwbPo.setGciws(dataObject.getString(ErrexphwbPo.COLUMNS.GCIWS.name())); 
			errexphwbPo.setGciuser(dataObject.getString(ErrexphwbPo.COLUMNS.GCIUSER.name())); 
			errexphwbPo.setGcows(dataObject.getString(ErrexphwbPo.COLUMNS.GCOWS.name())); 
			errexphwbPo.setGcouser(dataObject.getString(ErrexphwbPo.COLUMNS.GCOUSER.name())); 
			errexphwbPo.setChargebox(dataObject.getString(ErrexphwbPo.COLUMNS.CHARGEBOX.name())); 
			errexphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.CHARGEDATE.name()))); 
			errexphwbPo.setFrozen(dataObject.getString(ErrexphwbPo.COLUMNS.FROZEN.name())); 
			errexphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.PRINTDUTY.name()))); 
			errexphwbPo.setPrintuser(dataObject.getString(ErrexphwbPo.COLUMNS.PRINTUSER.name())); 
			errexphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(ErrexphwbPo.COLUMNS.PRINTSN.name()))); 
			errexphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(ErrexphwbPo.COLUMNS.GCILOCK.name()))); 
			errexphwbPo.setLockuser(dataObject.getString(ErrexphwbPo.COLUMNS.LOCKUSER.name())); 
			errexphwbPo.setLastdeclno(dataObject.getString(ErrexphwbPo.COLUMNS.LASTDECLNO.name())); 
			errexphwbPo.setLastdecltype(dataObject.getString(ErrexphwbPo.COLUMNS.LASTDECLTYPE.name())); 
			return errexphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrexphwbPo errexphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.BAGNO.name(), errexphwbPo.getBagno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.DECLNO.name(), errexphwbPo.getDeclno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.DECLTYPE.name(), errexphwbPo.getDecltype()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.MWB.name(), errexphwbPo.getMwb()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.HWB.name(), errexphwbPo.getHwb()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.BOXNO.name(), errexphwbPo.getBoxno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CLEARANCETYPE.name(), errexphwbPo.getClearancetype()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.RELEASETIME.name(), errexphwbPo.getReleasetime()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CANCELRELEASE.name(), errexphwbPo.getCancelrelease()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), errexphwbPo.getManuclearancetype()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.PIECE.name(), errexphwbPo.getPiece()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.UNIT.name(), errexphwbPo.getUnit()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.WEIGHT.name(), errexphwbPo.getWeight()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.INDICATOR.name(), errexphwbPo.getIndicator()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.DUTYPAYMENT.name(), errexphwbPo.getDutypayment()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.EXAMINATIONNOTE.name(), errexphwbPo.getExaminationnote()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.IE.name(), errexphwbPo.getIe()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIPIECE.name(), errexphwbPo.getGcipiece()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIDATE1.name(), errexphwbPo.getGcidate1()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIDATE2.name(), errexphwbPo.getGcidate2()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIWEIGHT.name(), errexphwbPo.getGciweight()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CHWS.name(), errexphwbPo.getChws()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCOPIECE.name(), errexphwbPo.getGcopiece()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCODATE1.name(), errexphwbPo.getGcodate1()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCODATE2.name(), errexphwbPo.getGcodate2()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCOBAGSN.name(), errexphwbPo.getGcobagsn()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CLOSEMARK.name(), errexphwbPo.getClosemark()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.EXPRESSID.name(), errexphwbPo.getExpressid()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.AIRLINEID.name(), errexphwbPo.getAirlineid()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.FLIGHTNO.name(), errexphwbPo.getFlightno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.FLIGHTDEST.name(), errexphwbPo.getFlightdest()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.FLIGHTDATE.name(), errexphwbPo.getFlightdate()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CANCELGCO.name(), errexphwbPo.getCancelgco()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.LASTUPDATE.name(), errexphwbPo.getLastupdate()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.HOLDAREA.name(), errexphwbPo.getHoldarea()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.HOLDREASON.name(), errexphwbPo.getHoldreason()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.EXPBAGNO.name(), errexphwbPo.getExpbagno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIWS.name(), errexphwbPo.getGciws()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCIUSER.name(), errexphwbPo.getGciuser()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCOWS.name(), errexphwbPo.getGcows()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCOUSER.name(), errexphwbPo.getGcouser()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CHARGEBOX.name(), errexphwbPo.getChargebox()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.CHARGEDATE.name(), errexphwbPo.getChargedate()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.FROZEN.name(), errexphwbPo.getFrozen()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.PRINTDUTY.name(), errexphwbPo.getPrintduty()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.PRINTUSER.name(), errexphwbPo.getPrintuser()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.PRINTSN.name(), errexphwbPo.getPrintsn()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.GCILOCK.name(), errexphwbPo.getGcilock()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.LOCKUSER.name(), errexphwbPo.getLockuser()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.LASTDECLNO.name(), errexphwbPo.getLastdeclno()); 
			dataObject.setValue(ErrexphwbPo.COLUMNS.LASTDECLTYPE.name(), errexphwbPo.getLastdecltype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrexphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrexphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
