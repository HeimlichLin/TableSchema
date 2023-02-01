package com.doc.common.dao.impl; 
 
public class BakimphwbDAOImpl extends GeneralDAOImpl<BakimphwbPo> implements BakimphwbDAO { 
	public static final BakimphwbDAOImpl INSTANCE = new BakimphwbDAOImpl(); 
	public static final String TABLENAME = "BAKIMPHWB"; 

	public BakimphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BakimphwbPo> CONVERTER = new MapConverter<BakimphwbPo>() { 
 
		@Override 
		public BakimphwbPo convert(final DataObject dataObject) { 
			final BakimphwbPo bakimphwbPo = new BakimphwbPo(); 
			bakimphwbPo.setBagno(dataObject.getString(BakimphwbPo.COLUMNS.BAGNO.name())); 
			bakimphwbPo.setDeclno(dataObject.getString(BakimphwbPo.COLUMNS.DECLNO.name())); 
			bakimphwbPo.setDecltype(dataObject.getString(BakimphwbPo.COLUMNS.DECLTYPE.name())); 
			bakimphwbPo.setMwb(dataObject.getString(BakimphwbPo.COLUMNS.MWB.name())); 
			bakimphwbPo.setHwb(dataObject.getString(BakimphwbPo.COLUMNS.HWB.name())); 
			bakimphwbPo.setBoxno(dataObject.getString(BakimphwbPo.COLUMNS.BOXNO.name())); 
			bakimphwbPo.setClearancetype(dataObject.getString(BakimphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			bakimphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.RELEASETIME.name()))); 
			bakimphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			bakimphwbPo.setManuclearancetype(dataObject.getString(BakimphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			bakimphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.PIECE.name()))); 
			bakimphwbPo.setUnit(dataObject.getString(BakimphwbPo.COLUMNS.UNIT.name())); 
			bakimphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.WEIGHT.name()))); 
			bakimphwbPo.setIndicator(dataObject.getString(BakimphwbPo.COLUMNS.INDICATOR.name())); 
			bakimphwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			bakimphwbPo.setExaminationnote(dataObject.getString(BakimphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			bakimphwbPo.setIe(dataObject.getString(BakimphwbPo.COLUMNS.IE.name())); 
			bakimphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.GCIPIECE.name()))); 
			bakimphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.GCIDATE1.name()))); 
			bakimphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.GCIDATE2.name()))); 
			bakimphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			bakimphwbPo.setChws(dataObject.getString(BakimphwbPo.COLUMNS.CHWS.name())); 
			bakimphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.GCOPIECE.name()))); 
			bakimphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.GCODATE1.name()))); 
			bakimphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.GCODATE2.name()))); 
			bakimphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.GCOBAGSN.name()))); 
			bakimphwbPo.setClosemark(dataObject.getString(BakimphwbPo.COLUMNS.CLOSEMARK.name())); 
			bakimphwbPo.setExpressid(dataObject.getString(BakimphwbPo.COLUMNS.EXPRESSID.name())); 
			bakimphwbPo.setAirlineid(dataObject.getString(BakimphwbPo.COLUMNS.AIRLINEID.name())); 
			bakimphwbPo.setFlightno(dataObject.getString(BakimphwbPo.COLUMNS.FLIGHTNO.name())); 
			bakimphwbPo.setFlightdest(dataObject.getString(BakimphwbPo.COLUMNS.FLIGHTDEST.name())); 
			bakimphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			bakimphwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.CANCELGCO.name()))); 
			bakimphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.LASTUPDATE.name()))); 
			bakimphwbPo.setHoldarea(dataObject.getString(BakimphwbPo.COLUMNS.HOLDAREA.name())); 
			bakimphwbPo.setHoldreason(dataObject.getString(BakimphwbPo.COLUMNS.HOLDREASON.name())); 
			bakimphwbPo.setExpbagno(dataObject.getString(BakimphwbPo.COLUMNS.EXPBAGNO.name())); 
			bakimphwbPo.setGciws(dataObject.getString(BakimphwbPo.COLUMNS.GCIWS.name())); 
			bakimphwbPo.setGciuser(dataObject.getString(BakimphwbPo.COLUMNS.GCIUSER.name())); 
			bakimphwbPo.setGcows(dataObject.getString(BakimphwbPo.COLUMNS.GCOWS.name())); 
			bakimphwbPo.setGcouser(dataObject.getString(BakimphwbPo.COLUMNS.GCOUSER.name())); 
			bakimphwbPo.setChargebox(dataObject.getString(BakimphwbPo.COLUMNS.CHARGEBOX.name())); 
			bakimphwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.CHARGEDATE.name()))); 
			bakimphwbPo.setFrozen(dataObject.getString(BakimphwbPo.COLUMNS.FROZEN.name())); 
			bakimphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(BakimphwbPo.COLUMNS.PRINTDUTY.name()))); 
			bakimphwbPo.setPrintuser(dataObject.getString(BakimphwbPo.COLUMNS.PRINTUSER.name())); 
			bakimphwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(BakimphwbPo.COLUMNS.PRINTSN.name()))); 
			return bakimphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BakimphwbPo bakimphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BakimphwbPo.COLUMNS.BAGNO.name(), bakimphwbPo.getBagno()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.DECLNO.name(), bakimphwbPo.getDeclno()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.DECLTYPE.name(), bakimphwbPo.getDecltype()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.MWB.name(), bakimphwbPo.getMwb()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.HWB.name(), bakimphwbPo.getHwb()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.BOXNO.name(), bakimphwbPo.getBoxno()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CLEARANCETYPE.name(), bakimphwbPo.getClearancetype()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.RELEASETIME.name(), bakimphwbPo.getReleasetime()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CANCELRELEASE.name(), bakimphwbPo.getCancelrelease()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), bakimphwbPo.getManuclearancetype()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.PIECE.name(), bakimphwbPo.getPiece()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.UNIT.name(), bakimphwbPo.getUnit()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.WEIGHT.name(), bakimphwbPo.getWeight()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.INDICATOR.name(), bakimphwbPo.getIndicator()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.DUTYPAYMENT.name(), bakimphwbPo.getDutypayment()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.EXAMINATIONNOTE.name(), bakimphwbPo.getExaminationnote()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.IE.name(), bakimphwbPo.getIe()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIPIECE.name(), bakimphwbPo.getGcipiece()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIDATE1.name(), bakimphwbPo.getGcidate1()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIDATE2.name(), bakimphwbPo.getGcidate2()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIWEIGHT.name(), bakimphwbPo.getGciweight()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CHWS.name(), bakimphwbPo.getChws()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCOPIECE.name(), bakimphwbPo.getGcopiece()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCODATE1.name(), bakimphwbPo.getGcodate1()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCODATE2.name(), bakimphwbPo.getGcodate2()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCOBAGSN.name(), bakimphwbPo.getGcobagsn()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CLOSEMARK.name(), bakimphwbPo.getClosemark()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.EXPRESSID.name(), bakimphwbPo.getExpressid()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.AIRLINEID.name(), bakimphwbPo.getAirlineid()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.FLIGHTNO.name(), bakimphwbPo.getFlightno()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.FLIGHTDEST.name(), bakimphwbPo.getFlightdest()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.FLIGHTDATE.name(), bakimphwbPo.getFlightdate()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CANCELGCO.name(), bakimphwbPo.getCancelgco()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.LASTUPDATE.name(), bakimphwbPo.getLastupdate()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.HOLDAREA.name(), bakimphwbPo.getHoldarea()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.HOLDREASON.name(), bakimphwbPo.getHoldreason()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.EXPBAGNO.name(), bakimphwbPo.getExpbagno()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIWS.name(), bakimphwbPo.getGciws()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCIUSER.name(), bakimphwbPo.getGciuser()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCOWS.name(), bakimphwbPo.getGcows()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.GCOUSER.name(), bakimphwbPo.getGcouser()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CHARGEBOX.name(), bakimphwbPo.getChargebox()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.CHARGEDATE.name(), bakimphwbPo.getChargedate()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.FROZEN.name(), bakimphwbPo.getFrozen()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.PRINTDUTY.name(), bakimphwbPo.getPrintduty()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.PRINTUSER.name(), bakimphwbPo.getPrintuser()); 
			dataObject.setValue(BakimphwbPo.COLUMNS.PRINTSN.name(), bakimphwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BakimphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BakimphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
