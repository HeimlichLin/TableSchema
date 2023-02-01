package com.doc.common.dao.impl; 
 
public class Tv02exphwbDAOImpl extends GeneralDAOImpl<Tv02exphwbPo> implements Tv02exphwbDAO { 
	public static final Tv02exphwbDAOImpl INSTANCE = new Tv02exphwbDAOImpl(); 
	public static final String TABLENAME = "TV02EXPHWB"; 

	public Tv02exphwbDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tv02exphwbPo> CONVERTER = new MapConverter<Tv02exphwbPo>() { 
 
		@Override 
		public Tv02exphwbPo convert(final DataObject dataObject) { 
			final Tv02exphwbPo tv02exphwbPo = new Tv02exphwbPo(); 
			tv02exphwbPo.setBagno(dataObject.getString(Tv02exphwbPo.COLUMNS.BAGNO.name())); 
			tv02exphwbPo.setDeclno(dataObject.getString(Tv02exphwbPo.COLUMNS.DECLNO.name())); 
			tv02exphwbPo.setDecltype(dataObject.getString(Tv02exphwbPo.COLUMNS.DECLTYPE.name())); 
			tv02exphwbPo.setMwb(dataObject.getString(Tv02exphwbPo.COLUMNS.MWB.name())); 
			tv02exphwbPo.setHwb(dataObject.getString(Tv02exphwbPo.COLUMNS.HWB.name())); 
			tv02exphwbPo.setBoxno(dataObject.getString(Tv02exphwbPo.COLUMNS.BOXNO.name())); 
			tv02exphwbPo.setClearancetype(dataObject.getString(Tv02exphwbPo.COLUMNS.CLEARANCETYPE.name())); 
			tv02exphwbPo.setReleasetime(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.RELEASETIME.name()))); 
			tv02exphwbPo.setCancelrelease(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.CANCELRELEASE.name()))); 
			tv02exphwbPo.setPiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.PIECE.name()))); 
			tv02exphwbPo.setUnit(dataObject.getString(Tv02exphwbPo.COLUMNS.UNIT.name())); 
			tv02exphwbPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.WEIGHT.name()))); 
			tv02exphwbPo.setIndicator(dataObject.getString(Tv02exphwbPo.COLUMNS.INDICATOR.name())); 
			tv02exphwbPo.setChtax(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.CHTAX.name()))); 
			tv02exphwbPo.setExaminationnote(dataObject.getString(Tv02exphwbPo.COLUMNS.EXAMINATIONNOTE.name())); 
			tv02exphwbPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCIPIECE.name()))); 
			tv02exphwbPo.setGciws(dataObject.getString(Tv02exphwbPo.COLUMNS.GCIWS.name())); 
			tv02exphwbPo.setGciuser(dataObject.getString(Tv02exphwbPo.COLUMNS.GCIUSER.name())); 
			tv02exphwbPo.setGcidate1(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCIDATE1.name()))); 
			tv02exphwbPo.setGcidate2(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCIDATE2.name()))); 
			tv02exphwbPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCIWEIGHT.name()))); 
			tv02exphwbPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCOPIECE.name()))); 
			tv02exphwbPo.setGcows(dataObject.getString(Tv02exphwbPo.COLUMNS.GCOWS.name())); 
			tv02exphwbPo.setGcouser(dataObject.getString(Tv02exphwbPo.COLUMNS.GCOUSER.name())); 
			tv02exphwbPo.setGcodate1(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCODATE1.name()))); 
			tv02exphwbPo.setGcodate2(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCODATE2.name()))); 
			tv02exphwbPo.setClosemark(dataObject.getString(Tv02exphwbPo.COLUMNS.CLOSEMARK.name())); 
			tv02exphwbPo.setConvereyid(dataObject.getString(Tv02exphwbPo.COLUMNS.CONVEREYID.name())); 
			tv02exphwbPo.setExpressid(dataObject.getString(Tv02exphwbPo.COLUMNS.EXPRESSID.name())); 
			tv02exphwbPo.setAirlineid(dataObject.getString(Tv02exphwbPo.COLUMNS.AIRLINEID.name())); 
			tv02exphwbPo.setFlightno(dataObject.getString(Tv02exphwbPo.COLUMNS.FLIGHTNO.name())); 
			tv02exphwbPo.setFlightdest(dataObject.getString(Tv02exphwbPo.COLUMNS.FLIGHTDEST.name())); 
			tv02exphwbPo.setManuclearancetype(dataObject.getString(Tv02exphwbPo.COLUMNS.MANUCLEARANCETYPE.name())); 
			tv02exphwbPo.setCancelgcoreason(dataObject.getString(Tv02exphwbPo.COLUMNS.CANCELGCOREASON.name())); 
			tv02exphwbPo.setCancelgcodate(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.CANCELGCODATE.name()))); 
			tv02exphwbPo.setGcobagsn(BigDecimalUtils.formObj(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCOBAGSN.name()))); 
			tv02exphwbPo.setIe(dataObject.getString(Tv02exphwbPo.COLUMNS.IE.name())); 
			tv02exphwbPo.setLastupdate(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.LASTUPDATE.name()))); 
			tv02exphwbPo.setChws(dataObject.getString(Tv02exphwbPo.COLUMNS.CHWS.name())); 
			tv02exphwbPo.setFlightdate(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.FLIGHTDATE.name()))); 
			tv02exphwbPo.setExpbagno(dataObject.getString(Tv02exphwbPo.COLUMNS.EXPBAGNO.name())); 
			tv02exphwbPo.setPrintduty(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.PRINTDUTY.name()))); 
			tv02exphwbPo.setGcilock(TimestampUtils.of(dataObject.getValue(Tv02exphwbPo.COLUMNS.GCILOCK.name()))); 
			tv02exphwbPo.setPrintuser(dataObject.getString(Tv02exphwbPo.COLUMNS.PRINTUSER.name())); 
			return tv02exphwbPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tv02exphwbPo tv02exphwbPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.BAGNO.name(), tv02exphwbPo.getBagno()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.DECLNO.name(), tv02exphwbPo.getDeclno()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.DECLTYPE.name(), tv02exphwbPo.getDecltype()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.MWB.name(), tv02exphwbPo.getMwb()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.HWB.name(), tv02exphwbPo.getHwb()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.BOXNO.name(), tv02exphwbPo.getBoxno()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CLEARANCETYPE.name(), tv02exphwbPo.getClearancetype()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.RELEASETIME.name(), tv02exphwbPo.getReleasetime()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CANCELRELEASE.name(), tv02exphwbPo.getCancelrelease()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.PIECE.name(), tv02exphwbPo.getPiece()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.UNIT.name(), tv02exphwbPo.getUnit()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.WEIGHT.name(), tv02exphwbPo.getWeight()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.INDICATOR.name(), tv02exphwbPo.getIndicator()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CHTAX.name(), tv02exphwbPo.getChtax()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.EXAMINATIONNOTE.name(), tv02exphwbPo.getExaminationnote()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIPIECE.name(), tv02exphwbPo.getGcipiece()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIWS.name(), tv02exphwbPo.getGciws()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIUSER.name(), tv02exphwbPo.getGciuser()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIDATE1.name(), tv02exphwbPo.getGcidate1()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIDATE2.name(), tv02exphwbPo.getGcidate2()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCIWEIGHT.name(), tv02exphwbPo.getGciweight()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCOPIECE.name(), tv02exphwbPo.getGcopiece()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCOWS.name(), tv02exphwbPo.getGcows()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCOUSER.name(), tv02exphwbPo.getGcouser()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCODATE1.name(), tv02exphwbPo.getGcodate1()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCODATE2.name(), tv02exphwbPo.getGcodate2()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CLOSEMARK.name(), tv02exphwbPo.getClosemark()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CONVEREYID.name(), tv02exphwbPo.getConvereyid()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.EXPRESSID.name(), tv02exphwbPo.getExpressid()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.AIRLINEID.name(), tv02exphwbPo.getAirlineid()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.FLIGHTNO.name(), tv02exphwbPo.getFlightno()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.FLIGHTDEST.name(), tv02exphwbPo.getFlightdest()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.MANUCLEARANCETYPE.name(), tv02exphwbPo.getManuclearancetype()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CANCELGCOREASON.name(), tv02exphwbPo.getCancelgcoreason()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CANCELGCODATE.name(), tv02exphwbPo.getCancelgcodate()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCOBAGSN.name(), tv02exphwbPo.getGcobagsn()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.IE.name(), tv02exphwbPo.getIe()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.LASTUPDATE.name(), tv02exphwbPo.getLastupdate()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.CHWS.name(), tv02exphwbPo.getChws()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.FLIGHTDATE.name(), tv02exphwbPo.getFlightdate()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.EXPBAGNO.name(), tv02exphwbPo.getExpbagno()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.PRINTDUTY.name(), tv02exphwbPo.getPrintduty()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.GCILOCK.name(), tv02exphwbPo.getGcilock()); 
			dataObject.setValue(Tv02exphwbPo.COLUMNS.PRINTUSER.name(), tv02exphwbPo.getPrintuser()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tv02exphwbPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tv02exphwbPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
