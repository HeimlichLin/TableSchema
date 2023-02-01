package com.doc.common.dao.impl; 
 
public class TempimpitemsDAOImpl extends GeneralDAOImpl<TempimpitemsPo> implements TempimpitemsDAO { 
	public static final TempimpitemsDAOImpl INSTANCE = new TempimpitemsDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPITEMS"; 

	public TempimpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpitemsPo> CONVERTER = new MapConverter<TempimpitemsPo>() { 
 
		@Override 
		public TempimpitemsPo convert(final DataObject dataObject) { 
			final TempimpitemsPo tempimpitemsPo = new TempimpitemsPo(); 
			tempimpitemsPo.setBagno(dataObject.getString(TempimpitemsPo.COLUMNS.BAGNO.name())); 
			tempimpitemsPo.setHwb(dataObject.getString(TempimpitemsPo.COLUMNS.HWB.name())); 
			tempimpitemsPo.setMwb(dataObject.getString(TempimpitemsPo.COLUMNS.MWB.name())); 
			tempimpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsPo.COLUMNS.ITEMNO.name()))); 
			tempimpitemsPo.setExpbagno(dataObject.getString(TempimpitemsPo.COLUMNS.EXPBAGNO.name())); 
			tempimpitemsPo.setGciws(dataObject.getString(TempimpitemsPo.COLUMNS.GCIWS.name())); 
			tempimpitemsPo.setGciuser(dataObject.getString(TempimpitemsPo.COLUMNS.GCIUSER.name())); 
			tempimpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempimpitemsPo.COLUMNS.GCIDATE.name()))); 
			tempimpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimpitemsPo.setGcows(dataObject.getString(TempimpitemsPo.COLUMNS.GCOWS.name())); 
			tempimpitemsPo.setGcouser(dataObject.getString(TempimpitemsPo.COLUMNS.GCOUSER.name())); 
			tempimpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempimpitemsPo.COLUMNS.GCODATE.name()))); 
			tempimpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsPo.COLUMNS.GCOSN.name()))); 
			tempimpitemsPo.setFlightno(dataObject.getString(TempimpitemsPo.COLUMNS.FLIGHTNO.name())); 
			tempimpitemsPo.setExpressid(dataObject.getString(TempimpitemsPo.COLUMNS.EXPRESSID.name())); 
			tempimpitemsPo.setContainer(dataObject.getString(TempimpitemsPo.COLUMNS.CONTAINER.name())); 
			tempimpitemsPo.setDeclno(dataObject.getString(TempimpitemsPo.COLUMNS.DECLNO.name())); 
			tempimpitemsPo.setFlightdest(dataObject.getString(TempimpitemsPo.COLUMNS.FLIGHTDEST.name())); 
			tempimpitemsPo.setWorkarea(dataObject.getString(TempimpitemsPo.COLUMNS.WORKAREA.name())); 
			tempimpitemsPo.setUldflag(TimestampUtils.of(dataObject.getValue(TempimpitemsPo.COLUMNS.ULDFLAG.name()))); 
			tempimpitemsPo.setCustomsid(dataObject.getString(TempimpitemsPo.COLUMNS.CUSTOMSID.name())); 
			tempimpitemsPo.setOcustomsid(dataObject.getString(TempimpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			tempimpitemsPo.setPkgbagno(dataObject.getString(TempimpitemsPo.COLUMNS.PKGBAGNO.name())); 
			return tempimpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpitemsPo tempimpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.BAGNO.name(), tempimpitemsPo.getBagno()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.HWB.name(), tempimpitemsPo.getHwb()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.MWB.name(), tempimpitemsPo.getMwb()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.ITEMNO.name(), tempimpitemsPo.getItemno()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.EXPBAGNO.name(), tempimpitemsPo.getExpbagno()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCIWS.name(), tempimpitemsPo.getGciws()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCIUSER.name(), tempimpitemsPo.getGciuser()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCIDATE.name(), tempimpitemsPo.getGcidate()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCIWEIGHT.name(), tempimpitemsPo.getGciweight()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCOWS.name(), tempimpitemsPo.getGcows()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCOUSER.name(), tempimpitemsPo.getGcouser()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCODATE.name(), tempimpitemsPo.getGcodate()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.GCOSN.name(), tempimpitemsPo.getGcosn()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.FLIGHTNO.name(), tempimpitemsPo.getFlightno()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.EXPRESSID.name(), tempimpitemsPo.getExpressid()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.CONTAINER.name(), tempimpitemsPo.getContainer()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.DECLNO.name(), tempimpitemsPo.getDeclno()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.FLIGHTDEST.name(), tempimpitemsPo.getFlightdest()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.WORKAREA.name(), tempimpitemsPo.getWorkarea()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.ULDFLAG.name(), tempimpitemsPo.getUldflag()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.CUSTOMSID.name(), tempimpitemsPo.getCustomsid()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.OCUSTOMSID.name(), tempimpitemsPo.getOcustomsid()); 
			dataObject.setValue(TempimpitemsPo.COLUMNS.PKGBAGNO.name(), tempimpitemsPo.getPkgbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
