package com.doc.common.dao.impl; 
 
public class MisWorkimphwbDAOImpl extends GeneralDAOImpl<MisWorkimphwbPo> implements MisWorkimphwbDAO { 
	public static final MisWorkimphwbDAOImpl INSTANCE = new MisWorkimphwbDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKIMPHWB"; 

	public MisWorkimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkimphwbPo> CONVERTER = new MapConverter<MisWorkimphwbPo>() { 
 
		@Override 
		public MisWorkimphwbPo convert(final DataObject dataObject) { 
			final MisWorkimphwbPo misWorkimphwbPo = new MisWorkimphwbPo(); 
			misWorkimphwbPo.setBagno(dataObject.getString(MisWorkimphwbPo.COLUMNS.BAGNO.name())); 
			misWorkimphwbPo.setDeclno(dataObject.getString(MisWorkimphwbPo.COLUMNS.DECLNO.name())); 
			misWorkimphwbPo.setDecltype(dataObject.getString(MisWorkimphwbPo.COLUMNS.DECLTYPE.name())); 
			misWorkimphwbPo.setMwb(dataObject.getString(MisWorkimphwbPo.COLUMNS.MWB.name())); 
			misWorkimphwbPo.setHwb(dataObject.getString(MisWorkimphwbPo.COLUMNS.HWB.name())); 
			misWorkimphwbPo.setBoxno(dataObject.getString(MisWorkimphwbPo.COLUMNS.BOXNO.name())); 
			misWorkimphwbPo.setClearancetype(dataObject.getString(MisWorkimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			misWorkimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.RELEASETIME.name()))); 
			misWorkimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			misWorkimphwbPo.setManuclearancetype(dataObject.getString(MisWorkimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			misWorkimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.PIECE.name()))); 
			misWorkimphwbPo.setUnit(dataObject.getString(MisWorkimphwbPo.COLUMNS.UNIT.name())); 
			misWorkimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.WEIGHT.name()))); 
			misWorkimphwbPo.setIndicator(dataObject.getString(MisWorkimphwbPo.COLUMNS.INDICATOR.name())); 
			misWorkimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			misWorkimphwbPo.setExaminationnote(dataObject.getString(MisWorkimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			misWorkimphwbPo.setIe(dataObject.getString(MisWorkimphwbPo.COLUMNS.IE.name())); 
			misWorkimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCIPIECE.name()))); 
			misWorkimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCIDATE1.name()))); 
			misWorkimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCIDATE2.name()))); 
			misWorkimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			misWorkimphwbPo.setChws(dataObject.getString(MisWorkimphwbPo.COLUMNS.CHWS.name())); 
			misWorkimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCOPIECE.name()))); 
			misWorkimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCODATE1.name()))); 
			misWorkimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCODATE2.name()))); 
			misWorkimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			misWorkimphwbPo.setClosemark(dataObject.getString(MisWorkimphwbPo.COLUMNS.CLOSEMARK.name())); 
			misWorkimphwbPo.setExpressid(dataObject.getString(MisWorkimphwbPo.COLUMNS.EXPRESSID.name())); 
			misWorkimphwbPo.setAirlineid(dataObject.getString(MisWorkimphwbPo.COLUMNS.AIRLINEID.name())); 
			misWorkimphwbPo.setFlightno(dataObject.getString(MisWorkimphwbPo.COLUMNS.FLIGHTNO.name())); 
			misWorkimphwbPo.setFlightdest(dataObject.getString(MisWorkimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			misWorkimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			misWorkimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.CANCELGCO.name()))); 
			misWorkimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			misWorkimphwbPo.setHoldarea(dataObject.getString(MisWorkimphwbPo.COLUMNS.HOLDAREA.name())); 
			misWorkimphwbPo.setHoldreason(dataObject.getString(MisWorkimphwbPo.COLUMNS.HOLDREASON.name())); 
			misWorkimphwbPo.setExpbagno(dataObject.getString(MisWorkimphwbPo.COLUMNS.EXPBAGNO.name())); 
			misWorkimphwbPo.setGciws(dataObject.getString(MisWorkimphwbPo.COLUMNS.GCIWS.name())); 
			misWorkimphwbPo.setGciuser(dataObject.getString(MisWorkimphwbPo.COLUMNS.GCIUSER.name())); 
			misWorkimphwbPo.setGcows(dataObject.getString(MisWorkimphwbPo.COLUMNS.GCOWS.name())); 
			misWorkimphwbPo.setGcouser(dataObject.getString(MisWorkimphwbPo.COLUMNS.GCOUSER.name())); 
			misWorkimphwbPo.setChargebox(dataObject.getString(MisWorkimphwbPo.COLUMNS.CHARGEBOX.name())); 
			misWorkimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			misWorkimphwbPo.setFrozen(dataObject.getString(MisWorkimphwbPo.COLUMNS.FROZEN.name())); 
			misWorkimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			misWorkimphwbPo.setPrintuser(dataObject.getString(MisWorkimphwbPo.COLUMNS.PRINTUSER.name())); 
			misWorkimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimphwbPo.COLUMNS.PRINTSN.name()))); 
			misWorkimphwbPo.setPrintTime(TimestampUtils.of(dataObject.getValue(MisWorkimphwbPo.COLUMNS.PRINT_TIME.name()))); 
			return misWorkimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkimphwbPo misWorkimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.BAGNO.name(), misWorkimphwbPo.getBagno()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.DECLNO.name(), misWorkimphwbPo.getDeclno()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.DECLTYPE.name(), misWorkimphwbPo.getDecltype()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.MWB.name(), misWorkimphwbPo.getMwb()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.HWB.name(), misWorkimphwbPo.getHwb()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.BOXNO.name(), misWorkimphwbPo.getBoxno()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CLEARANCETYPE.name(), misWorkimphwbPo.getClearancetype()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.RELEASETIME.name(), misWorkimphwbPo.getReleasetime()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CANCELRELEASE.name(), misWorkimphwbPo.getCancelrelease()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), misWorkimphwbPo.getManuclearancetype()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.PIECE.name(), misWorkimphwbPo.getPiece()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.UNIT.name(), misWorkimphwbPo.getUnit()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.WEIGHT.name(), misWorkimphwbPo.getWeight()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.INDICATOR.name(), misWorkimphwbPo.getIndicator()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.DUTYPAYMENT.name(), misWorkimphwbPo.getDutypayment()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), misWorkimphwbPo.getExaminationnote()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.IE.name(), misWorkimphwbPo.getIe()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIPIECE.name(), misWorkimphwbPo.getGcipiece()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIDATE1.name(), misWorkimphwbPo.getGcidate1()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIDATE2.name(), misWorkimphwbPo.getGcidate2()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIWEIGHT.name(), misWorkimphwbPo.getGciweight()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CHWS.name(), misWorkimphwbPo.getChws()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCOPIECE.name(), misWorkimphwbPo.getGcopiece()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCODATE1.name(), misWorkimphwbPo.getGcodate1()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCODATE2.name(), misWorkimphwbPo.getGcodate2()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCOBAGSN.name(), misWorkimphwbPo.getGcobagsn()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CLOSEMARK.name(), misWorkimphwbPo.getClosemark()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.EXPRESSID.name(), misWorkimphwbPo.getExpressid()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.AIRLINEID.name(), misWorkimphwbPo.getAirlineid()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.FLIGHTNO.name(), misWorkimphwbPo.getFlightno()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.FLIGHTDEST.name(), misWorkimphwbPo.getFlightdest()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.FLIGHTDATE.name(), misWorkimphwbPo.getFlightdate()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CANCELGCO.name(), misWorkimphwbPo.getCancelgco()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.LASTUPDATE.name(), misWorkimphwbPo.getLastupdate()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.HOLDAREA.name(), misWorkimphwbPo.getHoldarea()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.HOLDREASON.name(), misWorkimphwbPo.getHoldreason()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.EXPBAGNO.name(), misWorkimphwbPo.getExpbagno()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIWS.name(), misWorkimphwbPo.getGciws()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCIUSER.name(), misWorkimphwbPo.getGciuser()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCOWS.name(), misWorkimphwbPo.getGcows()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.GCOUSER.name(), misWorkimphwbPo.getGcouser()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CHARGEBOX.name(), misWorkimphwbPo.getChargebox()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.CHARGEDATE.name(), misWorkimphwbPo.getChargedate()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.FROZEN.name(), misWorkimphwbPo.getFrozen()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.PRINTDUTY.name(), misWorkimphwbPo.getPrintduty()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.PRINTUSER.name(), misWorkimphwbPo.getPrintuser()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.PRINTSN.name(), misWorkimphwbPo.getPrintsn()); 
			dataObject.setValue(MisWorkimphwbPo.COLUMNS.PRINT_TIME.name(), misWorkimphwbPo.getPrintTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
