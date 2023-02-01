package com.doc.common.dao.impl; 
 
public class Tempimpitems1113DAOImpl extends GeneralDAOImpl<Tempimpitems1113Po> implements Tempimpitems1113DAO { 
	public static final Tempimpitems1113DAOImpl INSTANCE = new Tempimpitems1113DAOImpl(); 
	public static final String TABLENAME = "TEMPIMPITEMS_1113"; 

	public Tempimpitems1113DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Tempimpitems1113Po> CONVERTER = new MapConverter<Tempimpitems1113Po>() { 
 
		@Override 
		public Tempimpitems1113Po convert(final DataObject dataObject) { 
			final Tempimpitems1113Po tempimpitems1113Po = new Tempimpitems1113Po(); 
			tempimpitems1113Po.setBagno(dataObject.getString(Tempimpitems1113Po.COLUMNS.BAGNO.name())); 
			tempimpitems1113Po.setHwb(dataObject.getString(Tempimpitems1113Po.COLUMNS.HWB.name())); 
			tempimpitems1113Po.setMwb(dataObject.getString(Tempimpitems1113Po.COLUMNS.MWB.name())); 
			tempimpitems1113Po.setItemno(BigDecimalUtils.formObj(dataObject.getValue(Tempimpitems1113Po.COLUMNS.ITEMNO.name()))); 
			tempimpitems1113Po.setExpbagno(dataObject.getString(Tempimpitems1113Po.COLUMNS.EXPBAGNO.name())); 
			tempimpitems1113Po.setGciws(dataObject.getString(Tempimpitems1113Po.COLUMNS.GCIWS.name())); 
			tempimpitems1113Po.setGciuser(dataObject.getString(Tempimpitems1113Po.COLUMNS.GCIUSER.name())); 
			tempimpitems1113Po.setGcidate(TimestampUtils.of(dataObject.getValue(Tempimpitems1113Po.COLUMNS.GCIDATE.name()))); 
			tempimpitems1113Po.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(Tempimpitems1113Po.COLUMNS.GCIWEIGHT.name()))); 
			tempimpitems1113Po.setGcows(dataObject.getString(Tempimpitems1113Po.COLUMNS.GCOWS.name())); 
			tempimpitems1113Po.setGcouser(dataObject.getString(Tempimpitems1113Po.COLUMNS.GCOUSER.name())); 
			tempimpitems1113Po.setGcodate(TimestampUtils.of(dataObject.getValue(Tempimpitems1113Po.COLUMNS.GCODATE.name()))); 
			tempimpitems1113Po.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(Tempimpitems1113Po.COLUMNS.GCOSN.name()))); 
			tempimpitems1113Po.setFlightno(dataObject.getString(Tempimpitems1113Po.COLUMNS.FLIGHTNO.name())); 
			tempimpitems1113Po.setExpressid(dataObject.getString(Tempimpitems1113Po.COLUMNS.EXPRESSID.name())); 
			tempimpitems1113Po.setContainer(dataObject.getString(Tempimpitems1113Po.COLUMNS.CONTAINER.name())); 
			tempimpitems1113Po.setCustomsid(dataObject.getString(Tempimpitems1113Po.COLUMNS.CUSTOMSID.name())); 
			tempimpitems1113Po.setOcustomsid(dataObject.getString(Tempimpitems1113Po.COLUMNS.OCUSTOMSID.name())); 
			return tempimpitems1113Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Tempimpitems1113Po tempimpitems1113Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.BAGNO.name(), tempimpitems1113Po.getBagno()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.HWB.name(), tempimpitems1113Po.getHwb()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.MWB.name(), tempimpitems1113Po.getMwb()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.ITEMNO.name(), tempimpitems1113Po.getItemno()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.EXPBAGNO.name(), tempimpitems1113Po.getExpbagno()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCIWS.name(), tempimpitems1113Po.getGciws()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCIUSER.name(), tempimpitems1113Po.getGciuser()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCIDATE.name(), tempimpitems1113Po.getGcidate()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCIWEIGHT.name(), tempimpitems1113Po.getGciweight()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCOWS.name(), tempimpitems1113Po.getGcows()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCOUSER.name(), tempimpitems1113Po.getGcouser()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCODATE.name(), tempimpitems1113Po.getGcodate()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.GCOSN.name(), tempimpitems1113Po.getGcosn()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.FLIGHTNO.name(), tempimpitems1113Po.getFlightno()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.EXPRESSID.name(), tempimpitems1113Po.getExpressid()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.CONTAINER.name(), tempimpitems1113Po.getContainer()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.CUSTOMSID.name(), tempimpitems1113Po.getCustomsid()); 
			dataObject.setValue(Tempimpitems1113Po.COLUMNS.OCUSTOMSID.name(), tempimpitems1113Po.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Tempimpitems1113Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Tempimpitems1113Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
