package com.doc.common.dao.impl; 
 
public class GcoitemsDAOImpl extends GeneralDAOImpl<GcoitemsPo> implements GcoitemsDAO { 
	public static final GcoitemsDAOImpl INSTANCE = new GcoitemsDAOImpl(); 
	public static final String TABLENAME = "GCOITEMS"; 

	public GcoitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoitemsPo> CONVERTER = new MapConverter<GcoitemsPo>() { 
 
		@Override 
		public GcoitemsPo convert(final DataObject dataObject) { 
			final GcoitemsPo gcoitemsPo = new GcoitemsPo(); 
			gcoitemsPo.setBagno(dataObject.getString(GcoitemsPo.COLUMNS.BAGNO.name())); 
			gcoitemsPo.setHwb(dataObject.getString(GcoitemsPo.COLUMNS.HWB.name())); 
			gcoitemsPo.setMwb(dataObject.getString(GcoitemsPo.COLUMNS.MWB.name())); 
			gcoitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsPo.COLUMNS.ITEMNO.name()))); 
			gcoitemsPo.setExpbagno(dataObject.getString(GcoitemsPo.COLUMNS.EXPBAGNO.name())); 
			gcoitemsPo.setGciws(dataObject.getString(GcoitemsPo.COLUMNS.GCIWS.name())); 
			gcoitemsPo.setGciuser(dataObject.getString(GcoitemsPo.COLUMNS.GCIUSER.name())); 
			gcoitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(GcoitemsPo.COLUMNS.GCIDATE.name()))); 
			gcoitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			gcoitemsPo.setGcows(dataObject.getString(GcoitemsPo.COLUMNS.GCOWS.name())); 
			gcoitemsPo.setGcouser(dataObject.getString(GcoitemsPo.COLUMNS.GCOUSER.name())); 
			gcoitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(GcoitemsPo.COLUMNS.GCODATE.name()))); 
			gcoitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsPo.COLUMNS.GCOSN.name()))); 
			gcoitemsPo.setFlightno(dataObject.getString(GcoitemsPo.COLUMNS.FLIGHTNO.name())); 
			gcoitemsPo.setExpressid(dataObject.getString(GcoitemsPo.COLUMNS.EXPRESSID.name())); 
			gcoitemsPo.setContainer(dataObject.getString(GcoitemsPo.COLUMNS.CONTAINER.name())); 
			gcoitemsPo.setDeclno(dataObject.getString(GcoitemsPo.COLUMNS.DECLNO.name())); 
			gcoitemsPo.setFlightdest(dataObject.getString(GcoitemsPo.COLUMNS.FLIGHTDEST.name())); 
			gcoitemsPo.setWorkarea(dataObject.getString(GcoitemsPo.COLUMNS.WORKAREA.name())); 
			gcoitemsPo.setUldflag(TimestampUtils.of(dataObject.getValue(GcoitemsPo.COLUMNS.ULDFLAG.name()))); 
			gcoitemsPo.setCustomsid(dataObject.getString(GcoitemsPo.COLUMNS.CUSTOMSID.name())); 
			gcoitemsPo.setOcustomsid(dataObject.getString(GcoitemsPo.COLUMNS.OCUSTOMSID.name())); 
			gcoitemsPo.setPkgbagno(dataObject.getString(GcoitemsPo.COLUMNS.PKGBAGNO.name())); 
			return gcoitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoitemsPo gcoitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoitemsPo.COLUMNS.BAGNO.name(), gcoitemsPo.getBagno()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.HWB.name(), gcoitemsPo.getHwb()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.MWB.name(), gcoitemsPo.getMwb()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.ITEMNO.name(), gcoitemsPo.getItemno()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.EXPBAGNO.name(), gcoitemsPo.getExpbagno()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCIWS.name(), gcoitemsPo.getGciws()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCIUSER.name(), gcoitemsPo.getGciuser()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCIDATE.name(), gcoitemsPo.getGcidate()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCIWEIGHT.name(), gcoitemsPo.getGciweight()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCOWS.name(), gcoitemsPo.getGcows()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCOUSER.name(), gcoitemsPo.getGcouser()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCODATE.name(), gcoitemsPo.getGcodate()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.GCOSN.name(), gcoitemsPo.getGcosn()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.FLIGHTNO.name(), gcoitemsPo.getFlightno()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.EXPRESSID.name(), gcoitemsPo.getExpressid()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.CONTAINER.name(), gcoitemsPo.getContainer()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.DECLNO.name(), gcoitemsPo.getDeclno()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.FLIGHTDEST.name(), gcoitemsPo.getFlightdest()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.WORKAREA.name(), gcoitemsPo.getWorkarea()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.ULDFLAG.name(), gcoitemsPo.getUldflag()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.CUSTOMSID.name(), gcoitemsPo.getCustomsid()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.OCUSTOMSID.name(), gcoitemsPo.getOcustomsid()); 
			dataObject.setValue(GcoitemsPo.COLUMNS.PKGBAGNO.name(), gcoitemsPo.getPkgbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 