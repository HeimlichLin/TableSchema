package com.doc.common.dao.impl; 
 
public class WorkimpitemsDAOImpl extends GeneralDAOImpl<WorkimpitemsPo> implements WorkimpitemsDAO { 
	public static final WorkimpitemsDAOImpl INSTANCE = new WorkimpitemsDAOImpl(); 
	public static final String TABLENAME = "WORKIMPITEMS"; 

	public WorkimpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpitemsPo> CONVERTER = new MapConverter<WorkimpitemsPo>() { 
 
		@Override 
		public WorkimpitemsPo convert(final DataObject dataObject) { 
			final WorkimpitemsPo workimpitemsPo = new WorkimpitemsPo(); 
			workimpitemsPo.setBagno(dataObject.getString(WorkimpitemsPo.COLUMNS.BAGNO.name())); 
			workimpitemsPo.setHwb(dataObject.getString(WorkimpitemsPo.COLUMNS.HWB.name())); 
			workimpitemsPo.setMwb(dataObject.getString(WorkimpitemsPo.COLUMNS.MWB.name())); 
			workimpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsPo.COLUMNS.ITEMNO.name()))); 
			workimpitemsPo.setExpbagno(dataObject.getString(WorkimpitemsPo.COLUMNS.EXPBAGNO.name())); 
			workimpitemsPo.setGciws(dataObject.getString(WorkimpitemsPo.COLUMNS.GCIWS.name())); 
			workimpitemsPo.setGciuser(dataObject.getString(WorkimpitemsPo.COLUMNS.GCIUSER.name())); 
			workimpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(WorkimpitemsPo.COLUMNS.GCIDATE.name()))); 
			workimpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			workimpitemsPo.setGcows(dataObject.getString(WorkimpitemsPo.COLUMNS.GCOWS.name())); 
			workimpitemsPo.setGcouser(dataObject.getString(WorkimpitemsPo.COLUMNS.GCOUSER.name())); 
			workimpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(WorkimpitemsPo.COLUMNS.GCODATE.name()))); 
			workimpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsPo.COLUMNS.GCOSN.name()))); 
			workimpitemsPo.setFlightno(dataObject.getString(WorkimpitemsPo.COLUMNS.FLIGHTNO.name())); 
			workimpitemsPo.setExpressid(dataObject.getString(WorkimpitemsPo.COLUMNS.EXPRESSID.name())); 
			workimpitemsPo.setContainer(dataObject.getString(WorkimpitemsPo.COLUMNS.CONTAINER.name())); 
			workimpitemsPo.setDeclno(dataObject.getString(WorkimpitemsPo.COLUMNS.DECLNO.name())); 
			workimpitemsPo.setFlightdest(dataObject.getString(WorkimpitemsPo.COLUMNS.FLIGHTDEST.name())); 
			workimpitemsPo.setWorkarea(dataObject.getString(WorkimpitemsPo.COLUMNS.WORKAREA.name())); 
			workimpitemsPo.setUldflag(TimestampUtils.of(dataObject.getValue(WorkimpitemsPo.COLUMNS.ULDFLAG.name()))); 
			workimpitemsPo.setCustomsid(dataObject.getString(WorkimpitemsPo.COLUMNS.CUSTOMSID.name())); 
			workimpitemsPo.setOcustomsid(dataObject.getString(WorkimpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			workimpitemsPo.setPkgbagno(dataObject.getString(WorkimpitemsPo.COLUMNS.PKGBAGNO.name())); 
			return workimpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpitemsPo workimpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.BAGNO.name(), workimpitemsPo.getBagno()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.HWB.name(), workimpitemsPo.getHwb()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.MWB.name(), workimpitemsPo.getMwb()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.ITEMNO.name(), workimpitemsPo.getItemno()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.EXPBAGNO.name(), workimpitemsPo.getExpbagno()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCIWS.name(), workimpitemsPo.getGciws()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCIUSER.name(), workimpitemsPo.getGciuser()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCIDATE.name(), workimpitemsPo.getGcidate()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCIWEIGHT.name(), workimpitemsPo.getGciweight()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCOWS.name(), workimpitemsPo.getGcows()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCOUSER.name(), workimpitemsPo.getGcouser()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCODATE.name(), workimpitemsPo.getGcodate()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.GCOSN.name(), workimpitemsPo.getGcosn()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.FLIGHTNO.name(), workimpitemsPo.getFlightno()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.EXPRESSID.name(), workimpitemsPo.getExpressid()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.CONTAINER.name(), workimpitemsPo.getContainer()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.DECLNO.name(), workimpitemsPo.getDeclno()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.FLIGHTDEST.name(), workimpitemsPo.getFlightdest()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.WORKAREA.name(), workimpitemsPo.getWorkarea()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.ULDFLAG.name(), workimpitemsPo.getUldflag()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.CUSTOMSID.name(), workimpitemsPo.getCustomsid()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.OCUSTOMSID.name(), workimpitemsPo.getOcustomsid()); 
			dataObject.setValue(WorkimpitemsPo.COLUMNS.PKGBAGNO.name(), workimpitemsPo.getPkgbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
