package com.doc.common.dao.impl; 
 
public class Workimpitems980803DAOImpl extends GeneralDAOImpl<Workimpitems980803Po> implements Workimpitems980803DAO { 
	public static final Workimpitems980803DAOImpl INSTANCE = new Workimpitems980803DAOImpl(); 
	public static final String TABLENAME = "WORKIMPITEMS_980803"; 

	public Workimpitems980803DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Workimpitems980803Po> CONVERTER = new MapConverter<Workimpitems980803Po>() { 
 
		@Override 
		public Workimpitems980803Po convert(final DataObject dataObject) { 
			final Workimpitems980803Po workimpitems980803Po = new Workimpitems980803Po(); 
			workimpitems980803Po.setBagno(dataObject.getString(Workimpitems980803Po.COLUMNS.BAGNO.name())); 
			workimpitems980803Po.setHwb(dataObject.getString(Workimpitems980803Po.COLUMNS.HWB.name())); 
			workimpitems980803Po.setMwb(dataObject.getString(Workimpitems980803Po.COLUMNS.MWB.name())); 
			workimpitems980803Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Workimpitems980803Po.COLUMNS.ITEMNO.name()))); 
			workimpitems980803Po.setExpbagno(dataObject.getString(Workimpitems980803Po.COLUMNS.EXPBAGNO.name())); 
			workimpitems980803Po.setGciws(dataObject.getString(Workimpitems980803Po.COLUMNS.GCIWS.name())); 
			workimpitems980803Po.setGciuser(dataObject.getString(Workimpitems980803Po.COLUMNS.GCIUSER.name())); 
			workimpitems980803Po.setGcidate(TimestampUtils.of(dataObject.getValue(Workimpitems980803Po.COLUMNS.GCIDATE.name()))); 
			workimpitems980803Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Workimpitems980803Po.COLUMNS.GCIWEIGHT.name()))); 
			workimpitems980803Po.setGcows(dataObject.getString(Workimpitems980803Po.COLUMNS.GCOWS.name())); 
			workimpitems980803Po.setGcouser(dataObject.getString(Workimpitems980803Po.COLUMNS.GCOUSER.name())); 
			workimpitems980803Po.setGcodate(TimestampUtils.of(dataObject.getValue(Workimpitems980803Po.COLUMNS.GCODATE.name()))); 
			workimpitems980803Po.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(Workimpitems980803Po.COLUMNS.GCOSN.name()))); 
			workimpitems980803Po.setFlightno(dataObject.getString(Workimpitems980803Po.COLUMNS.FLIGHTNO.name())); 
			workimpitems980803Po.setExpressid(dataObject.getString(Workimpitems980803Po.COLUMNS.EXPRESSID.name())); 
			workimpitems980803Po.setContainer(dataObject.getString(Workimpitems980803Po.COLUMNS.CONTAINER.name())); 
			workimpitems980803Po.setCustomsid(dataObject.getString(Workimpitems980803Po.COLUMNS.CUSTOMSID.name())); 
			workimpitems980803Po.setOcustomsid(dataObject.getString(Workimpitems980803Po.COLUMNS.OCUSTOMSID.name())); 
			return workimpitems980803Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Workimpitems980803Po workimpitems980803Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.BAGNO.name(), workimpitems980803Po.getBagno()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.HWB.name(), workimpitems980803Po.getHwb()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.MWB.name(), workimpitems980803Po.getMwb()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.ITEMNO.name(), workimpitems980803Po.getItemno()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.EXPBAGNO.name(), workimpitems980803Po.getExpbagno()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCIWS.name(), workimpitems980803Po.getGciws()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCIUSER.name(), workimpitems980803Po.getGciuser()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCIDATE.name(), workimpitems980803Po.getGcidate()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCIWEIGHT.name(), workimpitems980803Po.getGciweight()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCOWS.name(), workimpitems980803Po.getGcows()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCOUSER.name(), workimpitems980803Po.getGcouser()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCODATE.name(), workimpitems980803Po.getGcodate()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.GCOSN.name(), workimpitems980803Po.getGcosn()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.FLIGHTNO.name(), workimpitems980803Po.getFlightno()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.EXPRESSID.name(), workimpitems980803Po.getExpressid()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.CONTAINER.name(), workimpitems980803Po.getContainer()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.CUSTOMSID.name(), workimpitems980803Po.getCustomsid()); 
			dataObject.setValue(Workimpitems980803Po.COLUMNS.OCUSTOMSID.name(), workimpitems980803Po.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Workimpitems980803Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Workimpitems980803Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
