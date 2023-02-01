package com.doc.common.dao.impl; 
 
public class Tv02imphwbDAOImpl extends GeneralDAOImpl<Tv02imphwbPo> implements Tv02imphwbDAO { 
	public static final Tv02imphwbDAOImpl INSTANCE = new Tv02imphwbDAOImpl(); 
	public static final String TABLENAME = "TV02IMPHWB"; 

	public Tv02imphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tv02imphwbPo> CONVERTER = new MapConverter<Tv02imphwbPo>() { 
 
		@Override 
		public Tv02imphwbPo convert(final DataObject dataObject) { 
			final Tv02imphwbPo tv02imphwbPo = new Tv02imphwbPo(); 
			tv02imphwbPo.setBagno(dataObject.getString(Tv02imphwbPo.COLUMNS.BAGNO.name())); 
			tv02imphwbPo.setDeclno(dataObject.getString(Tv02imphwbPo.COLUMNS.DECLNO.name())); 
			tv02imphwbPo.setDecltype(dataObject.getString(Tv02imphwbPo.COLUMNS.DECLTYPE.name())); 
			tv02imphwbPo.setMwb(dataObject.getString(Tv02imphwbPo.COLUMNS.MWB.name())); 
			tv02imphwbPo.setHwb(dataObject.getString(Tv02imphwbPo.COLUMNS.HWB.name())); 
			tv02imphwbPo.setBoxno(dataObject.getString(Tv02imphwbPo.COLUMNS.BOXNO.name())); 
			tv02imphwbPo.setClearancetype(dataObject.getString(Tv02imphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			tv02imphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.RELEASETIME.name()))); 
			tv02imphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			tv02imphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.PIECE.name()))); 
			tv02imphwbPo.setUnit(dataObject.getString(Tv02imphwbPo.COLUMNS.UNIT.name())); 
			tv02imphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.WEIGHT.name()))); 
			tv02imphwbPo.setIndicator(dataObject.getString(Tv02imphwbPo.COLUMNS.INDICATOR.name())); 
			tv02imphwbPo.setChtax(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.CHTAX.name()))); 
			tv02imphwbPo.setExaminationnote(dataObject.getString(Tv02imphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tv02imphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCIPIECE.name()))); 
			tv02imphwbPo.setGciws(dataObject.getString(Tv02imphwbPo.COLUMNS.GCIWS.name())); 
			tv02imphwbPo.setGciuser(dataObject.getString(Tv02imphwbPo.COLUMNS.GCIUSER.name())); 
			tv02imphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCIDATE1.name()))); 
			tv02imphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCIDATE2.name()))); 
			tv02imphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			tv02imphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCOPIECE.name()))); 
			tv02imphwbPo.setGcows(dataObject.getString(Tv02imphwbPo.COLUMNS.GCOWS.name())); 
			tv02imphwbPo.setGcouser(dataObject.getString(Tv02imphwbPo.COLUMNS.GCOUSER.name())); 
			tv02imphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCODATE1.name()))); 
			tv02imphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCODATE2.name()))); 
			tv02imphwbPo.setClosemark(dataObject.getString(Tv02imphwbPo.COLUMNS.CLOSEMARK.name())); 
			tv02imphwbPo.setConvereyid(dataObject.getString(Tv02imphwbPo.COLUMNS.CONVEREYID.name())); 
			tv02imphwbPo.setExpressid(dataObject.getString(Tv02imphwbPo.COLUMNS.EXPRESSID.name())); 
			tv02imphwbPo.setAirlineid(dataObject.getString(Tv02imphwbPo.COLUMNS.AIRLINEID.name())); 
			tv02imphwbPo.setFlightno(dataObject.getString(Tv02imphwbPo.COLUMNS.FLIGHTNO.name())); 
			tv02imphwbPo.setFlightdest(dataObject.getString(Tv02imphwbPo.COLUMNS.FLIGHTDEST.name())); 
			tv02imphwbPo.setManuclearancetype(dataObject.getString(Tv02imphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tv02imphwbPo.setCancelgcoreason(dataObject.getString(Tv02imphwbPo.COLUMNS.CANCELGCOREASON.name())); 
			tv02imphwbPo.setCancelgcodate(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.CANCELGCODATE.name()))); 
			tv02imphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCOBAGSN.name()))); 
			tv02imphwbPo.setIe(dataObject.getString(Tv02imphwbPo.COLUMNS.IE.name())); 
			tv02imphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.LASTUPDATE.name()))); 
			tv02imphwbPo.setChws(dataObject.getString(Tv02imphwbPo.COLUMNS.CHWS.name())); 
			tv02imphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			tv02imphwbPo.setExpbagno(dataObject.getString(Tv02imphwbPo.COLUMNS.EXPBAGNO.name())); 
			tv02imphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.PRINTDUTY.name()))); 
			tv02imphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(Tv02imphwbPo.COLUMNS.GCILOCK.name()))); 
			tv02imphwbPo.setPrintuser(dataObject.getString(Tv02imphwbPo.COLUMNS.PRINTUSER.name())); 
			return tv02imphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tv02imphwbPo tv02imphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.BAGNO.name(), tv02imphwbPo.getBagno()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.DECLNO.name(), tv02imphwbPo.getDeclno()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.DECLTYPE.name(), tv02imphwbPo.getDecltype()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.MWB.name(), tv02imphwbPo.getMwb()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.HWB.name(), tv02imphwbPo.getHwb()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.BOXNO.name(), tv02imphwbPo.getBoxno()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CLEARANCETYPE.name(), tv02imphwbPo.getClearancetype()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.RELEASETIME.name(), tv02imphwbPo.getReleasetime()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CANCELRELEASE.name(), tv02imphwbPo.getCancelrelease()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.PIECE.name(), tv02imphwbPo.getPiece()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.UNIT.name(), tv02imphwbPo.getUnit()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.WEIGHT.name(), tv02imphwbPo.getWeight()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.INDICATOR.name(), tv02imphwbPo.getIndicator()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CHTAX.name(), tv02imphwbPo.getChtax()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.EXAMINATIONNOTE.name(), tv02imphwbPo.getExaminationnote()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIPIECE.name(), tv02imphwbPo.getGcipiece()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIWS.name(), tv02imphwbPo.getGciws()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIUSER.name(), tv02imphwbPo.getGciuser()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIDATE1.name(), tv02imphwbPo.getGcidate1()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIDATE2.name(), tv02imphwbPo.getGcidate2()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCIWEIGHT.name(), tv02imphwbPo.getGciweight()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCOPIECE.name(), tv02imphwbPo.getGcopiece()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCOWS.name(), tv02imphwbPo.getGcows()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCOUSER.name(), tv02imphwbPo.getGcouser()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCODATE1.name(), tv02imphwbPo.getGcodate1()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCODATE2.name(), tv02imphwbPo.getGcodate2()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CLOSEMARK.name(), tv02imphwbPo.getClosemark()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CONVEREYID.name(), tv02imphwbPo.getConvereyid()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.EXPRESSID.name(), tv02imphwbPo.getExpressid()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.AIRLINEID.name(), tv02imphwbPo.getAirlineid()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.FLIGHTNO.name(), tv02imphwbPo.getFlightno()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.FLIGHTDEST.name(), tv02imphwbPo.getFlightdest()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), tv02imphwbPo.getManuclearancetype()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CANCELGCOREASON.name(), tv02imphwbPo.getCancelgcoreason()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CANCELGCODATE.name(), tv02imphwbPo.getCancelgcodate()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCOBAGSN.name(), tv02imphwbPo.getGcobagsn()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.IE.name(), tv02imphwbPo.getIe()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.LASTUPDATE.name(), tv02imphwbPo.getLastupdate()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.CHWS.name(), tv02imphwbPo.getChws()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.FLIGHTDATE.name(), tv02imphwbPo.getFlightdate()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.EXPBAGNO.name(), tv02imphwbPo.getExpbagno()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.PRINTDUTY.name(), tv02imphwbPo.getPrintduty()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.GCILOCK.name(), tv02imphwbPo.getGcilock()); 
			dataObject.setValue(Tv02imphwbPo.COLUMNS.PRINTUSER.name(), tv02imphwbPo.getPrintuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tv02imphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tv02imphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
