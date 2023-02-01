package com.doc.common.dao.impl; 
 
public class Tempexpitems1113DAOImpl extends GeneralDAOImpl<Tempexpitems1113Po> implements Tempexpitems1113DAO { 
	public static final Tempexpitems1113DAOImpl INSTANCE = new Tempexpitems1113DAOImpl(); 
	public static final String TABLENAME = "TEMPEXPITEMS_1113"; 

	public Tempexpitems1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempexpitems1113Po> CONVERTER = new MapConverter<Tempexpitems1113Po>() { 
 
		@Override 
		public Tempexpitems1113Po convert(final DataObject dataObject) { 
			final Tempexpitems1113Po tempexpitems1113Po = new Tempexpitems1113Po(); 
			tempexpitems1113Po.setBagno(dataObject.getString(Tempexpitems1113Po.COLUMNS.BAGNO.name())); 
			tempexpitems1113Po.setHwb(dataObject.getString(Tempexpitems1113Po.COLUMNS.HWB.name())); 
			tempexpitems1113Po.setMwb(dataObject.getString(Tempexpitems1113Po.COLUMNS.MWB.name())); 
			tempexpitems1113Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Tempexpitems1113Po.COLUMNS.ITEMNO.name()))); 
			tempexpitems1113Po.setExpbagno(dataObject.getString(Tempexpitems1113Po.COLUMNS.EXPBAGNO.name())); 
			tempexpitems1113Po.setGciws(dataObject.getString(Tempexpitems1113Po.COLUMNS.GCIWS.name())); 
			tempexpitems1113Po.setGciuser(dataObject.getString(Tempexpitems1113Po.COLUMNS.GCIUSER.name())); 
			tempexpitems1113Po.setGcidate(TimestampUtils.of(dataObject.getValue(Tempexpitems1113Po.COLUMNS.GCIDATE.name()))); 
			tempexpitems1113Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tempexpitems1113Po.COLUMNS.GCIWEIGHT.name()))); 
			tempexpitems1113Po.setGcows(dataObject.getString(Tempexpitems1113Po.COLUMNS.GCOWS.name())); 
			tempexpitems1113Po.setGcouser(dataObject.getString(Tempexpitems1113Po.COLUMNS.GCOUSER.name())); 
			tempexpitems1113Po.setGcodate(TimestampUtils.of(dataObject.getValue(Tempexpitems1113Po.COLUMNS.GCODATE.name()))); 
			tempexpitems1113Po.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(Tempexpitems1113Po.COLUMNS.GCOSN.name()))); 
			tempexpitems1113Po.setFlightno(dataObject.getString(Tempexpitems1113Po.COLUMNS.FLIGHTNO.name())); 
			tempexpitems1113Po.setExpressid(dataObject.getString(Tempexpitems1113Po.COLUMNS.EXPRESSID.name())); 
			tempexpitems1113Po.setContainer(dataObject.getString(Tempexpitems1113Po.COLUMNS.CONTAINER.name())); 
			tempexpitems1113Po.setCustomsid(dataObject.getString(Tempexpitems1113Po.COLUMNS.CUSTOMSID.name())); 
			tempexpitems1113Po.setOcustomsid(dataObject.getString(Tempexpitems1113Po.COLUMNS.OCUSTOMSID.name())); 
			return tempexpitems1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempexpitems1113Po tempexpitems1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.BAGNO.name(), tempexpitems1113Po.getBagno()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.HWB.name(), tempexpitems1113Po.getHwb()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.MWB.name(), tempexpitems1113Po.getMwb()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.ITEMNO.name(), tempexpitems1113Po.getItemno()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.EXPBAGNO.name(), tempexpitems1113Po.getExpbagno()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCIWS.name(), tempexpitems1113Po.getGciws()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCIUSER.name(), tempexpitems1113Po.getGciuser()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCIDATE.name(), tempexpitems1113Po.getGcidate()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCIWEIGHT.name(), tempexpitems1113Po.getGciweight()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCOWS.name(), tempexpitems1113Po.getGcows()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCOUSER.name(), tempexpitems1113Po.getGcouser()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCODATE.name(), tempexpitems1113Po.getGcodate()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.GCOSN.name(), tempexpitems1113Po.getGcosn()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.FLIGHTNO.name(), tempexpitems1113Po.getFlightno()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.EXPRESSID.name(), tempexpitems1113Po.getExpressid()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.CONTAINER.name(), tempexpitems1113Po.getContainer()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.CUSTOMSID.name(), tempexpitems1113Po.getCustomsid()); 
			dataObject.setValue(Tempexpitems1113Po.COLUMNS.OCUSTOMSID.name(), tempexpitems1113Po.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempexpitems1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempexpitems1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
