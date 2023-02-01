package com.doc.common.dao.impl; 
 
public class GcohwbDAOImpl extends GeneralDAOImpl<GcohwbPo> implements GcohwbDAO { 
	public static final GcohwbDAOImpl INSTANCE = new GcohwbDAOImpl(); 
	public static final String TABLENAME = "GCOHWB"; 

	public GcohwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcohwbPo> CONVERTER = new MapConverter<GcohwbPo>() { 
 
		@Override 
		public GcohwbPo convert(final DataObject dataObject) { 
			final GcohwbPo gcohwbPo = new GcohwbPo(); 
			gcohwbPo.setBagno(dataObject.getString(GcohwbPo.COLUMNS.BAGNO.name())); 
			gcohwbPo.setDeclno(dataObject.getString(GcohwbPo.COLUMNS.DECLNO.name())); 
			gcohwbPo.setDecltype(dataObject.getString(GcohwbPo.COLUMNS.DECLTYPE.name())); 
			gcohwbPo.setMwb(dataObject.getString(GcohwbPo.COLUMNS.MWB.name())); 
			gcohwbPo.setHwb(dataObject.getString(GcohwbPo.COLUMNS.HWB.name())); 
			gcohwbPo.setBoxno(dataObject.getString(GcohwbPo.COLUMNS.BOXNO.name())); 
			gcohwbPo.setClearancetype(dataObject.getString(GcohwbPo.COLUMNS.CLEARANCETYPE.name())); 
			gcohwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.RELEASETIME.name()))); 
			gcohwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.CANCELRELEASE.name()))); 
			gcohwbPo.setManuclearancetype(dataObject.getString(GcohwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			gcohwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.PIECE.name()))); 
			gcohwbPo.setUnit(dataObject.getString(GcohwbPo.COLUMNS.UNIT.name())); 
			gcohwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.WEIGHT.name()))); 
			gcohwbPo.setIndicator(dataObject.getString(GcohwbPo.COLUMNS.INDICATOR.name())); 
			gcohwbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.DUTYPAYMENT.name()))); 
			gcohwbPo.setExaminationnote(dataObject.getString(GcohwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			gcohwbPo.setIe(dataObject.getString(GcohwbPo.COLUMNS.IE.name())); 
			gcohwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.GCIPIECE.name()))); 
			gcohwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.GCIDATE1.name()))); 
			gcohwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.GCIDATE2.name()))); 
			gcohwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.GCIWEIGHT.name()))); 
			gcohwbPo.setChws(dataObject.getString(GcohwbPo.COLUMNS.CHWS.name())); 
			gcohwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.GCOPIECE.name()))); 
			gcohwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.GCODATE1.name()))); 
			gcohwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.GCODATE2.name()))); 
			gcohwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.GCOBAGSN.name()))); 
			gcohwbPo.setClosemark(dataObject.getString(GcohwbPo.COLUMNS.CLOSEMARK.name())); 
			gcohwbPo.setExpressid(dataObject.getString(GcohwbPo.COLUMNS.EXPRESSID.name())); 
			gcohwbPo.setAirlineid(dataObject.getString(GcohwbPo.COLUMNS.AIRLINEID.name())); 
			gcohwbPo.setFlightno(dataObject.getString(GcohwbPo.COLUMNS.FLIGHTNO.name())); 
			gcohwbPo.setFlightdest(dataObject.getString(GcohwbPo.COLUMNS.FLIGHTDEST.name())); 
			gcohwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.FLIGHTDATE.name()))); 
			gcohwbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.CANCELGCO.name()))); 
			gcohwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.LASTUPDATE.name()))); 
			gcohwbPo.setHoldarea(dataObject.getString(GcohwbPo.COLUMNS.HOLDAREA.name())); 
			gcohwbPo.setHoldreason(dataObject.getString(GcohwbPo.COLUMNS.HOLDREASON.name())); 
			gcohwbPo.setExpbagno(dataObject.getString(GcohwbPo.COLUMNS.EXPBAGNO.name())); 
			gcohwbPo.setGciws(dataObject.getString(GcohwbPo.COLUMNS.GCIWS.name())); 
			gcohwbPo.setGciuser(dataObject.getString(GcohwbPo.COLUMNS.GCIUSER.name())); 
			gcohwbPo.setGcows(dataObject.getString(GcohwbPo.COLUMNS.GCOWS.name())); 
			gcohwbPo.setGcouser(dataObject.getString(GcohwbPo.COLUMNS.GCOUSER.name())); 
			gcohwbPo.setChargebox(dataObject.getString(GcohwbPo.COLUMNS.CHARGEBOX.name())); 
			gcohwbPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.CHARGEDATE.name()))); 
			gcohwbPo.setFrozen(dataObject.getString(GcohwbPo.COLUMNS.FROZEN.name())); 
			gcohwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(GcohwbPo.COLUMNS.PRINTDUTY.name()))); 
			gcohwbPo.setPrintuser(dataObject.getString(GcohwbPo.COLUMNS.PRINTUSER.name())); 
			gcohwbPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(GcohwbPo.COLUMNS.PRINTSN.name()))); 
			return gcohwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcohwbPo gcohwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcohwbPo.COLUMNS.BAGNO.name(), gcohwbPo.getBagno()); 
			dataObject.setValue(GcohwbPo.COLUMNS.DECLNO.name(), gcohwbPo.getDeclno()); 
			dataObject.setValue(GcohwbPo.COLUMNS.DECLTYPE.name(), gcohwbPo.getDecltype()); 
			dataObject.setValue(GcohwbPo.COLUMNS.MWB.name(), gcohwbPo.getMwb()); 
			dataObject.setValue(GcohwbPo.COLUMNS.HWB.name(), gcohwbPo.getHwb()); 
			dataObject.setValue(GcohwbPo.COLUMNS.BOXNO.name(), gcohwbPo.getBoxno()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CLEARANCETYPE.name(), gcohwbPo.getClearancetype()); 
			dataObject.setValue(GcohwbPo.COLUMNS.RELEASETIME.name(), gcohwbPo.getReleasetime()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CANCELRELEASE.name(), gcohwbPo.getCancelrelease()); 
			dataObject.setValue(GcohwbPo.COLUMNS.MANUCLEARANCETYPE.name(), gcohwbPo.getManuclearancetype()); 
			dataObject.setValue(GcohwbPo.COLUMNS.PIECE.name(), gcohwbPo.getPiece()); 
			dataObject.setValue(GcohwbPo.COLUMNS.UNIT.name(), gcohwbPo.getUnit()); 
			dataObject.setValue(GcohwbPo.COLUMNS.WEIGHT.name(), gcohwbPo.getWeight()); 
			dataObject.setValue(GcohwbPo.COLUMNS.INDICATOR.name(), gcohwbPo.getIndicator()); 
			dataObject.setValue(GcohwbPo.COLUMNS.DUTYPAYMENT.name(), gcohwbPo.getDutypayment()); 
			dataObject.setValue(GcohwbPo.COLUMNS.EXAMINATIONNOTE.name(), gcohwbPo.getExaminationnote()); 
			dataObject.setValue(GcohwbPo.COLUMNS.IE.name(), gcohwbPo.getIe()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIPIECE.name(), gcohwbPo.getGcipiece()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIDATE1.name(), gcohwbPo.getGcidate1()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIDATE2.name(), gcohwbPo.getGcidate2()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIWEIGHT.name(), gcohwbPo.getGciweight()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CHWS.name(), gcohwbPo.getChws()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCOPIECE.name(), gcohwbPo.getGcopiece()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCODATE1.name(), gcohwbPo.getGcodate1()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCODATE2.name(), gcohwbPo.getGcodate2()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCOBAGSN.name(), gcohwbPo.getGcobagsn()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CLOSEMARK.name(), gcohwbPo.getClosemark()); 
			dataObject.setValue(GcohwbPo.COLUMNS.EXPRESSID.name(), gcohwbPo.getExpressid()); 
			dataObject.setValue(GcohwbPo.COLUMNS.AIRLINEID.name(), gcohwbPo.getAirlineid()); 
			dataObject.setValue(GcohwbPo.COLUMNS.FLIGHTNO.name(), gcohwbPo.getFlightno()); 
			dataObject.setValue(GcohwbPo.COLUMNS.FLIGHTDEST.name(), gcohwbPo.getFlightdest()); 
			dataObject.setValue(GcohwbPo.COLUMNS.FLIGHTDATE.name(), gcohwbPo.getFlightdate()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CANCELGCO.name(), gcohwbPo.getCancelgco()); 
			dataObject.setValue(GcohwbPo.COLUMNS.LASTUPDATE.name(), gcohwbPo.getLastupdate()); 
			dataObject.setValue(GcohwbPo.COLUMNS.HOLDAREA.name(), gcohwbPo.getHoldarea()); 
			dataObject.setValue(GcohwbPo.COLUMNS.HOLDREASON.name(), gcohwbPo.getHoldreason()); 
			dataObject.setValue(GcohwbPo.COLUMNS.EXPBAGNO.name(), gcohwbPo.getExpbagno()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIWS.name(), gcohwbPo.getGciws()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCIUSER.name(), gcohwbPo.getGciuser()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCOWS.name(), gcohwbPo.getGcows()); 
			dataObject.setValue(GcohwbPo.COLUMNS.GCOUSER.name(), gcohwbPo.getGcouser()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CHARGEBOX.name(), gcohwbPo.getChargebox()); 
			dataObject.setValue(GcohwbPo.COLUMNS.CHARGEDATE.name(), gcohwbPo.getChargedate()); 
			dataObject.setValue(GcohwbPo.COLUMNS.FROZEN.name(), gcohwbPo.getFrozen()); 
			dataObject.setValue(GcohwbPo.COLUMNS.PRINTDUTY.name(), gcohwbPo.getPrintduty()); 
			dataObject.setValue(GcohwbPo.COLUMNS.PRINTUSER.name(), gcohwbPo.getPrintuser()); 
			dataObject.setValue(GcohwbPo.COLUMNS.PRINTSN.name(), gcohwbPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcohwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcohwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
