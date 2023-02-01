package com.doc.common.dao.impl; 
 
public class WorkimpitemsX1DAOImpl extends GeneralDAOImpl<WorkimpitemsX1Po> implements WorkimpitemsX1DAO { 
	public static final WorkimpitemsX1DAOImpl INSTANCE = new WorkimpitemsX1DAOImpl(); 
	public static final String TABLENAME = "WORKIMPITEMS_X1"; 

	public WorkimpitemsX1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<WorkimpitemsX1Po> CONVERTER = new MapConverter<WorkimpitemsX1Po>() { 
 
		@Override 
		public WorkimpitemsX1Po convert(final DataObject dataObject) { 
			final WorkimpitemsX1Po workimpitemsX1Po = new WorkimpitemsX1Po(); 
			workimpitemsX1Po.setBagno(dataObject.getString(WorkimpitemsX1Po.COLUMNS.BAGNO.name())); 
			workimpitemsX1Po.setHwb(dataObject.getString(WorkimpitemsX1Po.COLUMNS.HWB.name())); 
			workimpitemsX1Po.setMwb(dataObject.getString(WorkimpitemsX1Po.COLUMNS.MWB.name())); 
			workimpitemsX1Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsX1Po.COLUMNS.ITEMNO.name()))); 
			workimpitemsX1Po.setExpbagno(dataObject.getString(WorkimpitemsX1Po.COLUMNS.EXPBAGNO.name())); 
			workimpitemsX1Po.setGciws(dataObject.getString(WorkimpitemsX1Po.COLUMNS.GCIWS.name())); 
			workimpitemsX1Po.setGciuser(dataObject.getString(WorkimpitemsX1Po.COLUMNS.GCIUSER.name())); 
			workimpitemsX1Po.setGcidate(TimestampUtils.of(dataObject.getValue(WorkimpitemsX1Po.COLUMNS.GCIDATE.name()))); 
			workimpitemsX1Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsX1Po.COLUMNS.GCIWEIGHT.name()))); 
			workimpitemsX1Po.setGcows(dataObject.getString(WorkimpitemsX1Po.COLUMNS.GCOWS.name())); 
			workimpitemsX1Po.setGcouser(dataObject.getString(WorkimpitemsX1Po.COLUMNS.GCOUSER.name())); 
			workimpitemsX1Po.setGcodate(TimestampUtils.of(dataObject.getValue(WorkimpitemsX1Po.COLUMNS.GCODATE.name()))); 
			workimpitemsX1Po.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(WorkimpitemsX1Po.COLUMNS.GCOSN.name()))); 
			workimpitemsX1Po.setFlightno(dataObject.getString(WorkimpitemsX1Po.COLUMNS.FLIGHTNO.name())); 
			workimpitemsX1Po.setExpressid(dataObject.getString(WorkimpitemsX1Po.COLUMNS.EXPRESSID.name())); 
			workimpitemsX1Po.setContainer(dataObject.getString(WorkimpitemsX1Po.COLUMNS.CONTAINER.name())); 
			workimpitemsX1Po.setCustomsid(dataObject.getString(WorkimpitemsX1Po.COLUMNS.CUSTOMSID.name())); 
			workimpitemsX1Po.setOcustomsid(dataObject.getString(WorkimpitemsX1Po.COLUMNS.OCUSTOMSID.name())); 
			return workimpitemsX1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final WorkimpitemsX1Po workimpitemsX1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.BAGNO.name(), workimpitemsX1Po.getBagno()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.HWB.name(), workimpitemsX1Po.getHwb()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.MWB.name(), workimpitemsX1Po.getMwb()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.ITEMNO.name(), workimpitemsX1Po.getItemno()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.EXPBAGNO.name(), workimpitemsX1Po.getExpbagno()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCIWS.name(), workimpitemsX1Po.getGciws()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCIUSER.name(), workimpitemsX1Po.getGciuser()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCIDATE.name(), workimpitemsX1Po.getGcidate()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCIWEIGHT.name(), workimpitemsX1Po.getGciweight()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCOWS.name(), workimpitemsX1Po.getGcows()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCOUSER.name(), workimpitemsX1Po.getGcouser()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCODATE.name(), workimpitemsX1Po.getGcodate()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.GCOSN.name(), workimpitemsX1Po.getGcosn()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.FLIGHTNO.name(), workimpitemsX1Po.getFlightno()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.EXPRESSID.name(), workimpitemsX1Po.getExpressid()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.CONTAINER.name(), workimpitemsX1Po.getContainer()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.CUSTOMSID.name(), workimpitemsX1Po.getCustomsid()); 
			dataObject.setValue(WorkimpitemsX1Po.COLUMNS.OCUSTOMSID.name(), workimpitemsX1Po.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<WorkimpitemsX1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(WorkimpitemsX1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
