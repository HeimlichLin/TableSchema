package com.doc.common.dao.impl; 
 
public class WorkimpitemsTDAOImpl extends GeneralDAOImpl<WorkimpitemsTPo> implements WorkimpitemsTDAO { 
	public static final WorkimpitemsTDAOImpl INSTANCE = new WorkimpitemsTDAOImpl(); 
	public static final String TABLENAME = "WORKIMPITEMS_T"; 

	public WorkimpitemsTDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpitemsTPo> CONVERTER = new MapConverter<WorkimpitemsTPo>() { 
 
		@Override 
		public WorkimpitemsTPo convert(final DataObject dataObject) { 
			final WorkimpitemsTPo workimpitemsTPo = new WorkimpitemsTPo(); 
			workimpitemsTPo.setBagno(dataObject.getString(WorkimpitemsTPo.COLUMNS.BAGNO.name())); 
			workimpitemsTPo.setHwb(dataObject.getString(WorkimpitemsTPo.COLUMNS.HWB.name())); 
			workimpitemsTPo.setMwb(dataObject.getString(WorkimpitemsTPo.COLUMNS.MWB.name())); 
			workimpitemsTPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsTPo.COLUMNS.ITEMNO.name()))); 
			workimpitemsTPo.setExpbagno(dataObject.getString(WorkimpitemsTPo.COLUMNS.EXPBAGNO.name())); 
			workimpitemsTPo.setGciws(dataObject.getString(WorkimpitemsTPo.COLUMNS.GCIWS.name())); 
			workimpitemsTPo.setGciuser(dataObject.getString(WorkimpitemsTPo.COLUMNS.GCIUSER.name())); 
			workimpitemsTPo.setGcidate(TimestampUtils.of(dataObject.getValue(WorkimpitemsTPo.COLUMNS.GCIDATE.name()))); 
			workimpitemsTPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsTPo.COLUMNS.GCIWEIGHT.name()))); 
			workimpitemsTPo.setGcows(dataObject.getString(WorkimpitemsTPo.COLUMNS.GCOWS.name())); 
			workimpitemsTPo.setGcouser(dataObject.getString(WorkimpitemsTPo.COLUMNS.GCOUSER.name())); 
			workimpitemsTPo.setGcodate(TimestampUtils.of(dataObject.getValue(WorkimpitemsTPo.COLUMNS.GCODATE.name()))); 
			workimpitemsTPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsTPo.COLUMNS.GCOSN.name()))); 
			workimpitemsTPo.setFlightno(dataObject.getString(WorkimpitemsTPo.COLUMNS.FLIGHTNO.name())); 
			workimpitemsTPo.setExpressid(dataObject.getString(WorkimpitemsTPo.COLUMNS.EXPRESSID.name())); 
			workimpitemsTPo.setContainer(dataObject.getString(WorkimpitemsTPo.COLUMNS.CONTAINER.name())); 
			workimpitemsTPo.setDeclno(dataObject.getString(WorkimpitemsTPo.COLUMNS.DECLNO.name())); 
			workimpitemsTPo.setFlightdest(dataObject.getString(WorkimpitemsTPo.COLUMNS.FLIGHTDEST.name())); 
			return workimpitemsTPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpitemsTPo workimpitemsTPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.BAGNO.name(), workimpitemsTPo.getBagno()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.HWB.name(), workimpitemsTPo.getHwb()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.MWB.name(), workimpitemsTPo.getMwb()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.ITEMNO.name(), workimpitemsTPo.getItemno()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.EXPBAGNO.name(), workimpitemsTPo.getExpbagno()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCIWS.name(), workimpitemsTPo.getGciws()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCIUSER.name(), workimpitemsTPo.getGciuser()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCIDATE.name(), workimpitemsTPo.getGcidate()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCIWEIGHT.name(), workimpitemsTPo.getGciweight()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCOWS.name(), workimpitemsTPo.getGcows()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCOUSER.name(), workimpitemsTPo.getGcouser()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCODATE.name(), workimpitemsTPo.getGcodate()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.GCOSN.name(), workimpitemsTPo.getGcosn()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.FLIGHTNO.name(), workimpitemsTPo.getFlightno()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.EXPRESSID.name(), workimpitemsTPo.getExpressid()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.CONTAINER.name(), workimpitemsTPo.getContainer()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.DECLNO.name(), workimpitemsTPo.getDeclno()); 
			dataObject.setValue(WorkimpitemsTPo.COLUMNS.FLIGHTDEST.name(), workimpitemsTPo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpitemsTPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpitemsTPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
