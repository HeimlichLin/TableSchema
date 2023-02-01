package com.doc.common.dao.impl; 
 
public class MisWorkexphwbDAOImpl extends GeneralDAOImpl<MisWorkexphwbPo> implements MisWorkexphwbDAO { 
	public static final MisWorkexphwbDAOImpl INSTANCE = new MisWorkexphwbDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKEXPHWB"; 

	public MisWorkexphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkexphwbPo> CONVERTER = new MapConverter<MisWorkexphwbPo>() { 
 
		@Override 
		public MisWorkexphwbPo convert(final DataObject dataObject) { 
			final MisWorkexphwbPo misWorkexphwbPo = new MisWorkexphwbPo(); 
			misWorkexphwbPo.setBagno(dataObject.getString(MisWorkexphwbPo.COLUMNS.BAGNO.name())); 
			misWorkexphwbPo.setDeclno(dataObject.getString(MisWorkexphwbPo.COLUMNS.DECLNO.name())); 
			misWorkexphwbPo.setDecltype(dataObject.getString(MisWorkexphwbPo.COLUMNS.DECLTYPE.name())); 
			misWorkexphwbPo.setMwb(dataObject.getString(MisWorkexphwbPo.COLUMNS.MWB.name())); 
			misWorkexphwbPo.setHwb(dataObject.getString(MisWorkexphwbPo.COLUMNS.HWB.name())); 
			misWorkexphwbPo.setBoxno(dataObject.getString(MisWorkexphwbPo.COLUMNS.BOXNO.name())); 
			misWorkexphwbPo.setClearancetype(dataObject.getString(MisWorkexphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			misWorkexphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.RELEASETIME.name()))); 
			misWorkexphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			misWorkexphwbPo.setManuclearancetype(dataObject.getString(MisWorkexphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			misWorkexphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.PIECE.name()))); 
			misWorkexphwbPo.setUnit(dataObject.getString(MisWorkexphwbPo.COLUMNS.UNIT.name())); 
			misWorkexphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.WEIGHT.name()))); 
			misWorkexphwbPo.setIndicator(dataObject.getString(MisWorkexphwbPo.COLUMNS.INDICATOR.name())); 
			misWorkexphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			misWorkexphwbPo.setExaminationnote(dataObject.getString(MisWorkexphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			misWorkexphwbPo.setIe(dataObject.getString(MisWorkexphwbPo.COLUMNS.IE.name())); 
			misWorkexphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCIPIECE.name()))); 
			misWorkexphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCIDATE1.name()))); 
			misWorkexphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCIDATE2.name()))); 
			misWorkexphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			misWorkexphwbPo.setChws(dataObject.getString(MisWorkexphwbPo.COLUMNS.CHWS.name())); 
			misWorkexphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCOPIECE.name()))); 
			misWorkexphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCODATE1.name()))); 
			misWorkexphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCODATE2.name()))); 
			misWorkexphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.GCOBAGSN.name()))); 
			misWorkexphwbPo.setClosemark(dataObject.getString(MisWorkexphwbPo.COLUMNS.CLOSEMARK.name())); 
			misWorkexphwbPo.setExpressid(dataObject.getString(MisWorkexphwbPo.COLUMNS.EXPRESSID.name())); 
			misWorkexphwbPo.setAirlineid(dataObject.getString(MisWorkexphwbPo.COLUMNS.AIRLINEID.name())); 
			misWorkexphwbPo.setFlightno(dataObject.getString(MisWorkexphwbPo.COLUMNS.FLIGHTNO.name())); 
			misWorkexphwbPo.setFlightdest(dataObject.getString(MisWorkexphwbPo.COLUMNS.FLIGHTDEST.name())); 
			misWorkexphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			misWorkexphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.CANCELGCO.name()))); 
			misWorkexphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.LASTUPDATE.name()))); 
			misWorkexphwbPo.setHoldarea(dataObject.getString(MisWorkexphwbPo.COLUMNS.HOLDAREA.name())); 
			misWorkexphwbPo.setHoldreason(dataObject.getString(MisWorkexphwbPo.COLUMNS.HOLDREASON.name())); 
			misWorkexphwbPo.setExpbagno(dataObject.getString(MisWorkexphwbPo.COLUMNS.EXPBAGNO.name())); 
			misWorkexphwbPo.setGciws(dataObject.getString(MisWorkexphwbPo.COLUMNS.GCIWS.name())); 
			misWorkexphwbPo.setGciuser(dataObject.getString(MisWorkexphwbPo.COLUMNS.GCIUSER.name())); 
			misWorkexphwbPo.setGcows(dataObject.getString(MisWorkexphwbPo.COLUMNS.GCOWS.name())); 
			misWorkexphwbPo.setGcouser(dataObject.getString(MisWorkexphwbPo.COLUMNS.GCOUSER.name())); 
			misWorkexphwbPo.setChargebox(dataObject.getString(MisWorkexphwbPo.COLUMNS.CHARGEBOX.name())); 
			misWorkexphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.CHARGEDATE.name()))); 
			misWorkexphwbPo.setFrozen(dataObject.getString(MisWorkexphwbPo.COLUMNS.FROZEN.name())); 
			misWorkexphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.PRINTDUTY.name()))); 
			misWorkexphwbPo.setPrintuser(dataObject.getString(MisWorkexphwbPo.COLUMNS.PRINTUSER.name())); 
			misWorkexphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexphwbPo.COLUMNS.PRINTSN.name()))); 
			misWorkexphwbPo.setPrintTime(TimestampUtils.of(dataObject.getValue(MisWorkexphwbPo.COLUMNS.PRINT_TIME.name()))); 
			return misWorkexphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkexphwbPo misWorkexphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.BAGNO.name(), misWorkexphwbPo.getBagno()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.DECLNO.name(), misWorkexphwbPo.getDeclno()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.DECLTYPE.name(), misWorkexphwbPo.getDecltype()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.MWB.name(), misWorkexphwbPo.getMwb()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.HWB.name(), misWorkexphwbPo.getHwb()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.BOXNO.name(), misWorkexphwbPo.getBoxno()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CLEARANCETYPE.name(), misWorkexphwbPo.getClearancetype()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.RELEASETIME.name(), misWorkexphwbPo.getReleasetime()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CANCELRELEASE.name(), misWorkexphwbPo.getCancelrelease()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), misWorkexphwbPo.getManuclearancetype()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.PIECE.name(), misWorkexphwbPo.getPiece()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.UNIT.name(), misWorkexphwbPo.getUnit()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.WEIGHT.name(), misWorkexphwbPo.getWeight()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.INDICATOR.name(), misWorkexphwbPo.getIndicator()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.DUTYPAYMENT.name(), misWorkexphwbPo.getDutypayment()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.EXAMINATIONNOTE.name(), misWorkexphwbPo.getExaminationnote()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.IE.name(), misWorkexphwbPo.getIe()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIPIECE.name(), misWorkexphwbPo.getGcipiece()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIDATE1.name(), misWorkexphwbPo.getGcidate1()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIDATE2.name(), misWorkexphwbPo.getGcidate2()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIWEIGHT.name(), misWorkexphwbPo.getGciweight()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CHWS.name(), misWorkexphwbPo.getChws()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCOPIECE.name(), misWorkexphwbPo.getGcopiece()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCODATE1.name(), misWorkexphwbPo.getGcodate1()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCODATE2.name(), misWorkexphwbPo.getGcodate2()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCOBAGSN.name(), misWorkexphwbPo.getGcobagsn()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CLOSEMARK.name(), misWorkexphwbPo.getClosemark()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.EXPRESSID.name(), misWorkexphwbPo.getExpressid()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.AIRLINEID.name(), misWorkexphwbPo.getAirlineid()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.FLIGHTNO.name(), misWorkexphwbPo.getFlightno()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.FLIGHTDEST.name(), misWorkexphwbPo.getFlightdest()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.FLIGHTDATE.name(), misWorkexphwbPo.getFlightdate()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CANCELGCO.name(), misWorkexphwbPo.getCancelgco()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.LASTUPDATE.name(), misWorkexphwbPo.getLastupdate()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.HOLDAREA.name(), misWorkexphwbPo.getHoldarea()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.HOLDREASON.name(), misWorkexphwbPo.getHoldreason()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.EXPBAGNO.name(), misWorkexphwbPo.getExpbagno()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIWS.name(), misWorkexphwbPo.getGciws()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCIUSER.name(), misWorkexphwbPo.getGciuser()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCOWS.name(), misWorkexphwbPo.getGcows()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.GCOUSER.name(), misWorkexphwbPo.getGcouser()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CHARGEBOX.name(), misWorkexphwbPo.getChargebox()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.CHARGEDATE.name(), misWorkexphwbPo.getChargedate()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.FROZEN.name(), misWorkexphwbPo.getFrozen()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.PRINTDUTY.name(), misWorkexphwbPo.getPrintduty()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.PRINTUSER.name(), misWorkexphwbPo.getPrintuser()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.PRINTSN.name(), misWorkexphwbPo.getPrintsn()); 
			dataObject.setValue(MisWorkexphwbPo.COLUMNS.PRINT_TIME.name(), misWorkexphwbPo.getPrintTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkexphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkexphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
