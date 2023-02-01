package com.doc.common.dao.impl; 
 
public class ErrexpitemsDAOImpl extends GeneralDAOImpl<ErrexpitemsPo> implements ErrexpitemsDAO { 
	public static final ErrexpitemsDAOImpl INSTANCE = new ErrexpitemsDAOImpl(); 
	public static final String TABLENAME = "ERREXPITEMS"; 

	public ErrexpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrexpitemsPo> CONVERTER = new MapConverter<ErrexpitemsPo>() { 
 
		@Override 
		public ErrexpitemsPo convert(final DataObject dataObject) { 
			final ErrexpitemsPo errexpitemsPo = new ErrexpitemsPo(); 
			errexpitemsPo.setBagno(dataObject.getString(ErrexpitemsPo.COLUMNS.BAGNO.name())); 
			errexpitemsPo.setHwb(dataObject.getString(ErrexpitemsPo.COLUMNS.HWB.name())); 
			errexpitemsPo.setMwb(dataObject.getString(ErrexpitemsPo.COLUMNS.MWB.name())); 
			errexpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(ErrexpitemsPo.COLUMNS.ITEMNO.name()))); 
			errexpitemsPo.setExpbagno(dataObject.getString(ErrexpitemsPo.COLUMNS.EXPBAGNO.name())); 
			errexpitemsPo.setGciws(dataObject.getString(ErrexpitemsPo.COLUMNS.GCIWS.name())); 
			errexpitemsPo.setGciuser(dataObject.getString(ErrexpitemsPo.COLUMNS.GCIUSER.name())); 
			errexpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(ErrexpitemsPo.COLUMNS.GCIDATE.name()))); 
			errexpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(ErrexpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			errexpitemsPo.setGcows(dataObject.getString(ErrexpitemsPo.COLUMNS.GCOWS.name())); 
			errexpitemsPo.setGcouser(dataObject.getString(ErrexpitemsPo.COLUMNS.GCOUSER.name())); 
			errexpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(ErrexpitemsPo.COLUMNS.GCODATE.name()))); 
			errexpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(ErrexpitemsPo.COLUMNS.GCOSN.name()))); 
			errexpitemsPo.setFlightno(dataObject.getString(ErrexpitemsPo.COLUMNS.FLIGHTNO.name())); 
			errexpitemsPo.setExpressid(dataObject.getString(ErrexpitemsPo.COLUMNS.EXPRESSID.name())); 
			errexpitemsPo.setContainer(dataObject.getString(ErrexpitemsPo.COLUMNS.CONTAINER.name())); 
			errexpitemsPo.setDeclno(dataObject.getString(ErrexpitemsPo.COLUMNS.DECLNO.name())); 
			errexpitemsPo.setFlightdest(dataObject.getString(ErrexpitemsPo.COLUMNS.FLIGHTDEST.name())); 
			return errexpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrexpitemsPo errexpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.BAGNO.name(), errexpitemsPo.getBagno()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.HWB.name(), errexpitemsPo.getHwb()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.MWB.name(), errexpitemsPo.getMwb()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.ITEMNO.name(), errexpitemsPo.getItemno()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.EXPBAGNO.name(), errexpitemsPo.getExpbagno()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCIWS.name(), errexpitemsPo.getGciws()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCIUSER.name(), errexpitemsPo.getGciuser()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCIDATE.name(), errexpitemsPo.getGcidate()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCIWEIGHT.name(), errexpitemsPo.getGciweight()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCOWS.name(), errexpitemsPo.getGcows()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCOUSER.name(), errexpitemsPo.getGcouser()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCODATE.name(), errexpitemsPo.getGcodate()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.GCOSN.name(), errexpitemsPo.getGcosn()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.FLIGHTNO.name(), errexpitemsPo.getFlightno()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.EXPRESSID.name(), errexpitemsPo.getExpressid()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.CONTAINER.name(), errexpitemsPo.getContainer()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.DECLNO.name(), errexpitemsPo.getDeclno()); 
			dataObject.setValue(ErrexpitemsPo.COLUMNS.FLIGHTDEST.name(), errexpitemsPo.getFlightdest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrexpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrexpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
