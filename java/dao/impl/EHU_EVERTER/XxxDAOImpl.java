package com.doc.common.dao.impl; 
 
public class XxxDAOImpl extends GeneralDAOImpl<XxxPo> implements XxxDAO { 
	public static final XxxDAOImpl INSTANCE = new XxxDAOImpl(); 
	public static final String TABLENAME = "XXX"; 

	public XxxDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<XxxPo> CONVERTER = new MapConverter<XxxPo>() { 
 
		@Override 
		public XxxPo convert(final DataObject dataObject) { 
			final XxxPo xxxPo = new XxxPo(); 
			xxxPo.setBagno(dataObject.getString(XxxPo.COLUMNS.BAGNO.name())); 
			xxxPo.setDeclno(dataObject.getString(XxxPo.COLUMNS.DECLNO.name())); 
			xxxPo.setDecltype(dataObject.getString(XxxPo.COLUMNS.DECLTYPE.name())); 
			xxxPo.setMwb(dataObject.getString(XxxPo.COLUMNS.MWB.name())); 
			xxxPo.setHwb(dataObject.getString(XxxPo.COLUMNS.HWB.name())); 
			xxxPo.setBoxno(dataObject.getString(XxxPo.COLUMNS.BOXNO.name())); 
			xxxPo.setClearancetype(dataObject.getString(XxxPo.COLUMNS.CLEARANCETYPE.name())); 
			xxxPo.setReleasetime(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.RELEASETIME.name()))); 
			xxxPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.CANCELRELEASE.name()))); 
			xxxPo.setManuclearancetype(dataObject.getString(XxxPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			xxxPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.PIECE.name()))); 
			xxxPo.setUnit(dataObject.getString(XxxPo.COLUMNS.UNIT.name())); 
			xxxPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.WEIGHT.name()))); 
			xxxPo.setIndicator(dataObject.getString(XxxPo.COLUMNS.INDICATOR.name())); 
			xxxPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.DUTYPAYMENT.name()))); 
			xxxPo.setExaminationnote(dataObject.getString(XxxPo.COLUMNS.EXAMINATIONNOTE.name())); 
			xxxPo.setIe(dataObject.getString(XxxPo.COLUMNS.IE.name())); 
			xxxPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.GCIPIECE.name()))); 
			xxxPo.setGcidate1(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.GCIDATE1.name()))); 
			xxxPo.setGcidate2(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.GCIDATE2.name()))); 
			xxxPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.GCIWEIGHT.name()))); 
			xxxPo.setChws(dataObject.getString(XxxPo.COLUMNS.CHWS.name())); 
			xxxPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.GCOPIECE.name()))); 
			xxxPo.setGcodate1(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.GCODATE1.name()))); 
			xxxPo.setGcodate2(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.GCODATE2.name()))); 
			xxxPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.GCOBAGSN.name()))); 
			xxxPo.setClosemark(dataObject.getString(XxxPo.COLUMNS.CLOSEMARK.name())); 
			xxxPo.setExpressid(dataObject.getString(XxxPo.COLUMNS.EXPRESSID.name())); 
			xxxPo.setAirlineid(dataObject.getString(XxxPo.COLUMNS.AIRLINEID.name())); 
			xxxPo.setFlightno(dataObject.getString(XxxPo.COLUMNS.FLIGHTNO.name())); 
			xxxPo.setFlightdest(dataObject.getString(XxxPo.COLUMNS.FLIGHTDEST.name())); 
			xxxPo.setFlightdate(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.FLIGHTDATE.name()))); 
			xxxPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.CANCELGCO.name()))); 
			xxxPo.setLastupdate(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.LASTUPDATE.name()))); 
			xxxPo.setHoldarea(dataObject.getString(XxxPo.COLUMNS.HOLDAREA.name())); 
			xxxPo.setHoldreason(dataObject.getString(XxxPo.COLUMNS.HOLDREASON.name())); 
			xxxPo.setExpbagno(dataObject.getString(XxxPo.COLUMNS.EXPBAGNO.name())); 
			xxxPo.setGciws(dataObject.getString(XxxPo.COLUMNS.GCIWS.name())); 
			xxxPo.setGciuser(dataObject.getString(XxxPo.COLUMNS.GCIUSER.name())); 
			xxxPo.setGcows(dataObject.getString(XxxPo.COLUMNS.GCOWS.name())); 
			xxxPo.setGcouser(dataObject.getString(XxxPo.COLUMNS.GCOUSER.name())); 
			xxxPo.setChargebox(dataObject.getString(XxxPo.COLUMNS.CHARGEBOX.name())); 
			xxxPo.setChargedate(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.CHARGEDATE.name()))); 
			xxxPo.setFrozen(dataObject.getString(XxxPo.COLUMNS.FROZEN.name())); 
			xxxPo.setPrintduty(TimestampUtils.of(dataObject.getValue(XxxPo.COLUMNS.PRINTDUTY.name()))); 
			xxxPo.setPrintuser(dataObject.getString(XxxPo.COLUMNS.PRINTUSER.name())); 
			xxxPo.setPrintsn(BigDecimalUtils.formObj(dataObject.getValue(XxxPo.COLUMNS.PRINTSN.name()))); 
			return xxxPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final XxxPo xxxPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(XxxPo.COLUMNS.BAGNO.name(), xxxPo.getBagno()); 
			dataObject.setValue(XxxPo.COLUMNS.DECLNO.name(), xxxPo.getDeclno()); 
			dataObject.setValue(XxxPo.COLUMNS.DECLTYPE.name(), xxxPo.getDecltype()); 
			dataObject.setValue(XxxPo.COLUMNS.MWB.name(), xxxPo.getMwb()); 
			dataObject.setValue(XxxPo.COLUMNS.HWB.name(), xxxPo.getHwb()); 
			dataObject.setValue(XxxPo.COLUMNS.BOXNO.name(), xxxPo.getBoxno()); 
			dataObject.setValue(XxxPo.COLUMNS.CLEARANCETYPE.name(), xxxPo.getClearancetype()); 
			dataObject.setValue(XxxPo.COLUMNS.RELEASETIME.name(), xxxPo.getReleasetime()); 
			dataObject.setValue(XxxPo.COLUMNS.CANCELRELEASE.name(), xxxPo.getCancelrelease()); 
			dataObject.setValue(XxxPo.COLUMNS.MANUCLEARANCETYPE.name(), xxxPo.getManuclearancetype()); 
			dataObject.setValue(XxxPo.COLUMNS.PIECE.name(), xxxPo.getPiece()); 
			dataObject.setValue(XxxPo.COLUMNS.UNIT.name(), xxxPo.getUnit()); 
			dataObject.setValue(XxxPo.COLUMNS.WEIGHT.name(), xxxPo.getWeight()); 
			dataObject.setValue(XxxPo.COLUMNS.INDICATOR.name(), xxxPo.getIndicator()); 
			dataObject.setValue(XxxPo.COLUMNS.DUTYPAYMENT.name(), xxxPo.getDutypayment()); 
			dataObject.setValue(XxxPo.COLUMNS.EXAMINATIONNOTE.name(), xxxPo.getExaminationnote()); 
			dataObject.setValue(XxxPo.COLUMNS.IE.name(), xxxPo.getIe()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIPIECE.name(), xxxPo.getGcipiece()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIDATE1.name(), xxxPo.getGcidate1()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIDATE2.name(), xxxPo.getGcidate2()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIWEIGHT.name(), xxxPo.getGciweight()); 
			dataObject.setValue(XxxPo.COLUMNS.CHWS.name(), xxxPo.getChws()); 
			dataObject.setValue(XxxPo.COLUMNS.GCOPIECE.name(), xxxPo.getGcopiece()); 
			dataObject.setValue(XxxPo.COLUMNS.GCODATE1.name(), xxxPo.getGcodate1()); 
			dataObject.setValue(XxxPo.COLUMNS.GCODATE2.name(), xxxPo.getGcodate2()); 
			dataObject.setValue(XxxPo.COLUMNS.GCOBAGSN.name(), xxxPo.getGcobagsn()); 
			dataObject.setValue(XxxPo.COLUMNS.CLOSEMARK.name(), xxxPo.getClosemark()); 
			dataObject.setValue(XxxPo.COLUMNS.EXPRESSID.name(), xxxPo.getExpressid()); 
			dataObject.setValue(XxxPo.COLUMNS.AIRLINEID.name(), xxxPo.getAirlineid()); 
			dataObject.setValue(XxxPo.COLUMNS.FLIGHTNO.name(), xxxPo.getFlightno()); 
			dataObject.setValue(XxxPo.COLUMNS.FLIGHTDEST.name(), xxxPo.getFlightdest()); 
			dataObject.setValue(XxxPo.COLUMNS.FLIGHTDATE.name(), xxxPo.getFlightdate()); 
			dataObject.setValue(XxxPo.COLUMNS.CANCELGCO.name(), xxxPo.getCancelgco()); 
			dataObject.setValue(XxxPo.COLUMNS.LASTUPDATE.name(), xxxPo.getLastupdate()); 
			dataObject.setValue(XxxPo.COLUMNS.HOLDAREA.name(), xxxPo.getHoldarea()); 
			dataObject.setValue(XxxPo.COLUMNS.HOLDREASON.name(), xxxPo.getHoldreason()); 
			dataObject.setValue(XxxPo.COLUMNS.EXPBAGNO.name(), xxxPo.getExpbagno()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIWS.name(), xxxPo.getGciws()); 
			dataObject.setValue(XxxPo.COLUMNS.GCIUSER.name(), xxxPo.getGciuser()); 
			dataObject.setValue(XxxPo.COLUMNS.GCOWS.name(), xxxPo.getGcows()); 
			dataObject.setValue(XxxPo.COLUMNS.GCOUSER.name(), xxxPo.getGcouser()); 
			dataObject.setValue(XxxPo.COLUMNS.CHARGEBOX.name(), xxxPo.getChargebox()); 
			dataObject.setValue(XxxPo.COLUMNS.CHARGEDATE.name(), xxxPo.getChargedate()); 
			dataObject.setValue(XxxPo.COLUMNS.FROZEN.name(), xxxPo.getFrozen()); 
			dataObject.setValue(XxxPo.COLUMNS.PRINTDUTY.name(), xxxPo.getPrintduty()); 
			dataObject.setValue(XxxPo.COLUMNS.PRINTUSER.name(), xxxPo.getPrintuser()); 
			dataObject.setValue(XxxPo.COLUMNS.PRINTSN.name(), xxxPo.getPrintsn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<XxxPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(XxxPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
