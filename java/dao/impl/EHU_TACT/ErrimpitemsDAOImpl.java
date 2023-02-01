package com.doc.common.dao.impl; 
 
public class ErrimpitemsDAOImpl extends GeneralDAOImpl<ErrimpitemsPo> implements ErrimpitemsDAO { 
	public static final ErrimpitemsDAOImpl INSTANCE = new ErrimpitemsDAOImpl(); 
	public static final String TABLENAME = "ERRIMPITEMS"; 

	public ErrimpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrimpitemsPo> CONVERTER = new MapConverter<ErrimpitemsPo>() { 
 
		@Override 
		public ErrimpitemsPo convert(final DataObject dataObject) { 
			final ErrimpitemsPo errimpitemsPo = new ErrimpitemsPo(); 
			errimpitemsPo.setBagno(dataObject.getString(ErrimpitemsPo.COLUMNS.BAGNO.name())); 
			errimpitemsPo.setHwb(dataObject.getString(ErrimpitemsPo.COLUMNS.HWB.name())); 
			errimpitemsPo.setMwb(dataObject.getString(ErrimpitemsPo.COLUMNS.MWB.name())); 
			errimpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(ErrimpitemsPo.COLUMNS.ITEMNO.name()))); 
			errimpitemsPo.setExpbagno(dataObject.getString(ErrimpitemsPo.COLUMNS.EXPBAGNO.name())); 
			errimpitemsPo.setGciws(dataObject.getString(ErrimpitemsPo.COLUMNS.GCIWS.name())); 
			errimpitemsPo.setGciuser(dataObject.getString(ErrimpitemsPo.COLUMNS.GCIUSER.name())); 
			errimpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(ErrimpitemsPo.COLUMNS.GCIDATE.name()))); 
			errimpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(ErrimpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			errimpitemsPo.setGcows(dataObject.getString(ErrimpitemsPo.COLUMNS.GCOWS.name())); 
			errimpitemsPo.setGcouser(dataObject.getString(ErrimpitemsPo.COLUMNS.GCOUSER.name())); 
			errimpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(ErrimpitemsPo.COLUMNS.GCODATE.name()))); 
			errimpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(ErrimpitemsPo.COLUMNS.GCOSN.name()))); 
			errimpitemsPo.setFlightno(dataObject.getString(ErrimpitemsPo.COLUMNS.FLIGHTNO.name())); 
			errimpitemsPo.setExpressid(dataObject.getString(ErrimpitemsPo.COLUMNS.EXPRESSID.name())); 
			errimpitemsPo.setContainer(dataObject.getString(ErrimpitemsPo.COLUMNS.CONTAINER.name())); 
			errimpitemsPo.setDeclno(dataObject.getString(ErrimpitemsPo.COLUMNS.DECLNO.name())); 
			errimpitemsPo.setFlightdest(dataObject.getString(ErrimpitemsPo.COLUMNS.FLIGHTDEST.name())); 
			return errimpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrimpitemsPo errimpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.BAGNO.name(), errimpitemsPo.getBagno()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.HWB.name(), errimpitemsPo.getHwb()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.MWB.name(), errimpitemsPo.getMwb()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.ITEMNO.name(), errimpitemsPo.getItemno()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.EXPBAGNO.name(), errimpitemsPo.getExpbagno()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCIWS.name(), errimpitemsPo.getGciws()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCIUSER.name(), errimpitemsPo.getGciuser()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCIDATE.name(), errimpitemsPo.getGcidate()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCIWEIGHT.name(), errimpitemsPo.getGciweight()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCOWS.name(), errimpitemsPo.getGcows()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCOUSER.name(), errimpitemsPo.getGcouser()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCODATE.name(), errimpitemsPo.getGcodate()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.GCOSN.name(), errimpitemsPo.getGcosn()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.FLIGHTNO.name(), errimpitemsPo.getFlightno()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.EXPRESSID.name(), errimpitemsPo.getExpressid()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.CONTAINER.name(), errimpitemsPo.getContainer()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.DECLNO.name(), errimpitemsPo.getDeclno()); 
			dataObject.setValue(ErrimpitemsPo.COLUMNS.FLIGHTDEST.name(), errimpitemsPo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrimpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrimpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
