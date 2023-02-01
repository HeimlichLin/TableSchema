package com.doc.common.dao.impl; 
 
public class WorkexpitemsDAOImpl extends GeneralDAOImpl<WorkexpitemsPo> implements WorkexpitemsDAO { 
	public static final WorkexpitemsDAOImpl INSTANCE = new WorkexpitemsDAOImpl(); 
	public static final String TABLENAME = "WORKEXPITEMS"; 

	public WorkexpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkexpitemsPo> CONVERTER = new MapConverter<WorkexpitemsPo>() { 
 
		@Override 
		public WorkexpitemsPo convert(final DataObject dataObject) { 
			final WorkexpitemsPo workexpitemsPo = new WorkexpitemsPo(); 
			workexpitemsPo.setBagno(dataObject.getString(WorkexpitemsPo.COLUMNS.BAGNO.name())); 
			workexpitemsPo.setHwb(dataObject.getString(WorkexpitemsPo.COLUMNS.HWB.name())); 
			workexpitemsPo.setMwb(dataObject.getString(WorkexpitemsPo.COLUMNS.MWB.name())); 
			workexpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(WorkexpitemsPo.COLUMNS.ITEMNO.name()))); 
			workexpitemsPo.setExpbagno(dataObject.getString(WorkexpitemsPo.COLUMNS.EXPBAGNO.name())); 
			workexpitemsPo.setGciws(dataObject.getString(WorkexpitemsPo.COLUMNS.GCIWS.name())); 
			workexpitemsPo.setGciuser(dataObject.getString(WorkexpitemsPo.COLUMNS.GCIUSER.name())); 
			workexpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(WorkexpitemsPo.COLUMNS.GCIDATE.name()))); 
			workexpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkexpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			workexpitemsPo.setGcows(dataObject.getString(WorkexpitemsPo.COLUMNS.GCOWS.name())); 
			workexpitemsPo.setGcouser(dataObject.getString(WorkexpitemsPo.COLUMNS.GCOUSER.name())); 
			workexpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(WorkexpitemsPo.COLUMNS.GCODATE.name()))); 
			workexpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(WorkexpitemsPo.COLUMNS.GCOSN.name()))); 
			workexpitemsPo.setFlightno(dataObject.getString(WorkexpitemsPo.COLUMNS.FLIGHTNO.name())); 
			workexpitemsPo.setExpressid(dataObject.getString(WorkexpitemsPo.COLUMNS.EXPRESSID.name())); 
			workexpitemsPo.setContainer(dataObject.getString(WorkexpitemsPo.COLUMNS.CONTAINER.name())); 
			workexpitemsPo.setDeclno(dataObject.getString(WorkexpitemsPo.COLUMNS.DECLNO.name())); 
			workexpitemsPo.setFlightdest(dataObject.getString(WorkexpitemsPo.COLUMNS.FLIGHTDEST.name())); 
			workexpitemsPo.setWorkarea(dataObject.getString(WorkexpitemsPo.COLUMNS.WORKAREA.name())); 
			workexpitemsPo.setUldflag(TimestampUtils.of(dataObject.getValue(WorkexpitemsPo.COLUMNS.ULDFLAG.name()))); 
			workexpitemsPo.setCustomsid(dataObject.getString(WorkexpitemsPo.COLUMNS.CUSTOMSID.name())); 
			workexpitemsPo.setOcustomsid(dataObject.getString(WorkexpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			workexpitemsPo.setPkgbagno(dataObject.getString(WorkexpitemsPo.COLUMNS.PKGBAGNO.name())); 
			return workexpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkexpitemsPo workexpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.BAGNO.name(), workexpitemsPo.getBagno()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.HWB.name(), workexpitemsPo.getHwb()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.MWB.name(), workexpitemsPo.getMwb()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.ITEMNO.name(), workexpitemsPo.getItemno()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.EXPBAGNO.name(), workexpitemsPo.getExpbagno()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCIWS.name(), workexpitemsPo.getGciws()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCIUSER.name(), workexpitemsPo.getGciuser()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCIDATE.name(), workexpitemsPo.getGcidate()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCIWEIGHT.name(), workexpitemsPo.getGciweight()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCOWS.name(), workexpitemsPo.getGcows()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCOUSER.name(), workexpitemsPo.getGcouser()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCODATE.name(), workexpitemsPo.getGcodate()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.GCOSN.name(), workexpitemsPo.getGcosn()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.FLIGHTNO.name(), workexpitemsPo.getFlightno()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.EXPRESSID.name(), workexpitemsPo.getExpressid()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.CONTAINER.name(), workexpitemsPo.getContainer()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.DECLNO.name(), workexpitemsPo.getDeclno()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.FLIGHTDEST.name(), workexpitemsPo.getFlightdest()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.WORKAREA.name(), workexpitemsPo.getWorkarea()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.ULDFLAG.name(), workexpitemsPo.getUldflag()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.CUSTOMSID.name(), workexpitemsPo.getCustomsid()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.OCUSTOMSID.name(), workexpitemsPo.getOcustomsid()); 
			dataObject.setValue(WorkexpitemsPo.COLUMNS.PKGBAGNO.name(), workexpitemsPo.getPkgbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkexpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkexpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
