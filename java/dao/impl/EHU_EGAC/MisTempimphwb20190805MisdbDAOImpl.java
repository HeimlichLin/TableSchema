package com.doc.common.dao.impl; 
 
public class MisTempimphwb20190805MisdbDAOImpl extends GeneralDAOImpl<MisTempimphwb20190805MisdbPo> implements MisTempimphwb20190805MisdbDAO { 
	public static final MisTempimphwb20190805MisdbDAOImpl INSTANCE = new MisTempimphwb20190805MisdbDAOImpl(); 
	public static final String TABLENAME = "MIS_TEMPIMPHWB_20190805_MISDB"; 

	public MisTempimphwb20190805MisdbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisTempimphwb20190805MisdbPo> CONVERTER = new MapConverter<MisTempimphwb20190805MisdbPo>() { 
 
		@Override 
		public MisTempimphwb20190805MisdbPo convert(final DataObject dataObject) { 
			final MisTempimphwb20190805MisdbPo misTempimphwb20190805MisdbPo = new MisTempimphwb20190805MisdbPo(); 
			misTempimphwb20190805MisdbPo.setBagno(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.BAGNO.name())); 
			misTempimphwb20190805MisdbPo.setDeclno(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.DECLNO.name())); 
			misTempimphwb20190805MisdbPo.setDecltype(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.DECLTYPE.name())); 
			misTempimphwb20190805MisdbPo.setMwb(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.MWB.name())); 
			misTempimphwb20190805MisdbPo.setHwb(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.HWB.name())); 
			misTempimphwb20190805MisdbPo.setBoxno(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.BOXNO.name())); 
			misTempimphwb20190805MisdbPo.setClearancetype(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.CLEARANCETYPE.name())); 
			misTempimphwb20190805MisdbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.RELEASETIME.name()))); 
			misTempimphwb20190805MisdbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.CANCELRELEASE.name()))); 
			misTempimphwb20190805MisdbPo.setManuclearancetype(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			misTempimphwb20190805MisdbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.PIECE.name()))); 
			misTempimphwb20190805MisdbPo.setUnit(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.UNIT.name())); 
			misTempimphwb20190805MisdbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.WEIGHT.name()))); 
			misTempimphwb20190805MisdbPo.setIndicator(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.INDICATOR.name())); 
			misTempimphwb20190805MisdbPo.setDutypayment(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.DUTYPAYMENT.name()))); 
			misTempimphwb20190805MisdbPo.setExaminationnote(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			misTempimphwb20190805MisdbPo.setIe(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.IE.name())); 
			misTempimphwb20190805MisdbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIPIECE.name()))); 
			misTempimphwb20190805MisdbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIDATE1.name()))); 
			misTempimphwb20190805MisdbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIDATE2.name()))); 
			misTempimphwb20190805MisdbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIWEIGHT.name()))); 
			misTempimphwb20190805MisdbPo.setChws(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.CHWS.name())); 
			misTempimphwb20190805MisdbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCOPIECE.name()))); 
			misTempimphwb20190805MisdbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCODATE1.name()))); 
			misTempimphwb20190805MisdbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCODATE2.name()))); 
			misTempimphwb20190805MisdbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCOBAGSN.name()))); 
			misTempimphwb20190805MisdbPo.setClosemark(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.CLOSEMARK.name())); 
			misTempimphwb20190805MisdbPo.setExpressid(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.EXPRESSID.name())); 
			misTempimphwb20190805MisdbPo.setAirlineid(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.AIRLINEID.name())); 
			misTempimphwb20190805MisdbPo.setFlightno(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTNO.name())); 
			misTempimphwb20190805MisdbPo.setFlightdest(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTDEST.name())); 
			misTempimphwb20190805MisdbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTDATE.name()))); 
			misTempimphwb20190805MisdbPo.setCancelgco(BigDecimalUtils.formObj(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.CANCELGCO.name()))); 
			misTempimphwb20190805MisdbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.LASTUPDATE.name()))); 
			misTempimphwb20190805MisdbPo.setExpbagno(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.EXPBAGNO.name())); 
			misTempimphwb20190805MisdbPo.setChargebox(dataObject.getString(MisTempimphwb20190805MisdbPo.COLUMNS.CHARGEBOX.name())); 
			misTempimphwb20190805MisdbPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.CHARGEDATE.name()))); 
			misTempimphwb20190805MisdbPo.setPrintTime(TimestampUtils.of(dataObject.getValue(MisTempimphwb20190805MisdbPo.COLUMNS.PRINT_TIME.name()))); 
			return misTempimphwb20190805MisdbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisTempimphwb20190805MisdbPo misTempimphwb20190805MisdbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.BAGNO.name(), misTempimphwb20190805MisdbPo.getBagno()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.DECLNO.name(), misTempimphwb20190805MisdbPo.getDeclno()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.DECLTYPE.name(), misTempimphwb20190805MisdbPo.getDecltype()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.MWB.name(), misTempimphwb20190805MisdbPo.getMwb()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.HWB.name(), misTempimphwb20190805MisdbPo.getHwb()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.BOXNO.name(), misTempimphwb20190805MisdbPo.getBoxno()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CLEARANCETYPE.name(), misTempimphwb20190805MisdbPo.getClearancetype()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.RELEASETIME.name(), misTempimphwb20190805MisdbPo.getReleasetime()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CANCELRELEASE.name(), misTempimphwb20190805MisdbPo.getCancelrelease()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.MANUCLEARANCETYPE.name(), misTempimphwb20190805MisdbPo.getManuclearancetype()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.PIECE.name(), misTempimphwb20190805MisdbPo.getPiece()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.UNIT.name(), misTempimphwb20190805MisdbPo.getUnit()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.WEIGHT.name(), misTempimphwb20190805MisdbPo.getWeight()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.INDICATOR.name(), misTempimphwb20190805MisdbPo.getIndicator()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.DUTYPAYMENT.name(), misTempimphwb20190805MisdbPo.getDutypayment()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.EXAMINATIONNOTE.name(), misTempimphwb20190805MisdbPo.getExaminationnote()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.IE.name(), misTempimphwb20190805MisdbPo.getIe()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIPIECE.name(), misTempimphwb20190805MisdbPo.getGcipiece()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIDATE1.name(), misTempimphwb20190805MisdbPo.getGcidate1()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIDATE2.name(), misTempimphwb20190805MisdbPo.getGcidate2()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCIWEIGHT.name(), misTempimphwb20190805MisdbPo.getGciweight()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CHWS.name(), misTempimphwb20190805MisdbPo.getChws()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCOPIECE.name(), misTempimphwb20190805MisdbPo.getGcopiece()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCODATE1.name(), misTempimphwb20190805MisdbPo.getGcodate1()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCODATE2.name(), misTempimphwb20190805MisdbPo.getGcodate2()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.GCOBAGSN.name(), misTempimphwb20190805MisdbPo.getGcobagsn()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CLOSEMARK.name(), misTempimphwb20190805MisdbPo.getClosemark()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.EXPRESSID.name(), misTempimphwb20190805MisdbPo.getExpressid()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.AIRLINEID.name(), misTempimphwb20190805MisdbPo.getAirlineid()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTNO.name(), misTempimphwb20190805MisdbPo.getFlightno()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTDEST.name(), misTempimphwb20190805MisdbPo.getFlightdest()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.FLIGHTDATE.name(), misTempimphwb20190805MisdbPo.getFlightdate()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CANCELGCO.name(), misTempimphwb20190805MisdbPo.getCancelgco()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.LASTUPDATE.name(), misTempimphwb20190805MisdbPo.getLastupdate()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.EXPBAGNO.name(), misTempimphwb20190805MisdbPo.getExpbagno()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CHARGEBOX.name(), misTempimphwb20190805MisdbPo.getChargebox()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.CHARGEDATE.name(), misTempimphwb20190805MisdbPo.getChargedate()); 
			dataObject.setValue(MisTempimphwb20190805MisdbPo.COLUMNS.PRINT_TIME.name(), misTempimphwb20190805MisdbPo.getPrintTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisTempimphwb20190805MisdbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisTempimphwb20190805MisdbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
