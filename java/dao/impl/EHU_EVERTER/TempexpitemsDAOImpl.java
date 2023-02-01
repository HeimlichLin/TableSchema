package com.doc.common.dao.impl; 
 
public class TempexpitemsDAOImpl extends GeneralDAOImpl<TempexpitemsPo> implements TempexpitemsDAO { 
	public static final TempexpitemsDAOImpl INSTANCE = new TempexpitemsDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPITEMS"; 

	public TempexpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpitemsPo> CONVERTER = new MapConverter<TempexpitemsPo>() { 
 
		@Override 
		public TempexpitemsPo convert(final DataObject dataObject) { 
			final TempexpitemsPo tempexpitemsPo = new TempexpitemsPo(); 
			tempexpitemsPo.setBagno(dataObject.getString(TempexpitemsPo.COLUMNS.BAGNO.name())); 
			tempexpitemsPo.setHwb(dataObject.getString(TempexpitemsPo.COLUMNS.HWB.name())); 
			tempexpitemsPo.setMwb(dataObject.getString(TempexpitemsPo.COLUMNS.MWB.name())); 
			tempexpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsPo.COLUMNS.ITEMNO.name()))); 
			tempexpitemsPo.setExpbagno(dataObject.getString(TempexpitemsPo.COLUMNS.EXPBAGNO.name())); 
			tempexpitemsPo.setGciws(dataObject.getString(TempexpitemsPo.COLUMNS.GCIWS.name())); 
			tempexpitemsPo.setGciuser(dataObject.getString(TempexpitemsPo.COLUMNS.GCIUSER.name())); 
			tempexpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempexpitemsPo.COLUMNS.GCIDATE.name()))); 
			tempexpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			tempexpitemsPo.setGcows(dataObject.getString(TempexpitemsPo.COLUMNS.GCOWS.name())); 
			tempexpitemsPo.setGcouser(dataObject.getString(TempexpitemsPo.COLUMNS.GCOUSER.name())); 
			tempexpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempexpitemsPo.COLUMNS.GCODATE.name()))); 
			tempexpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsPo.COLUMNS.GCOSN.name()))); 
			tempexpitemsPo.setFlightno(dataObject.getString(TempexpitemsPo.COLUMNS.FLIGHTNO.name())); 
			tempexpitemsPo.setExpressid(dataObject.getString(TempexpitemsPo.COLUMNS.EXPRESSID.name())); 
			tempexpitemsPo.setContainer(dataObject.getString(TempexpitemsPo.COLUMNS.CONTAINER.name())); 
			tempexpitemsPo.setCustomsid(dataObject.getString(TempexpitemsPo.COLUMNS.CUSTOMSID.name())); 
			tempexpitemsPo.setOcustomsid(dataObject.getString(TempexpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			return tempexpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpitemsPo tempexpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.BAGNO.name(), tempexpitemsPo.getBagno()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.HWB.name(), tempexpitemsPo.getHwb()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.MWB.name(), tempexpitemsPo.getMwb()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.ITEMNO.name(), tempexpitemsPo.getItemno()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.EXPBAGNO.name(), tempexpitemsPo.getExpbagno()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCIWS.name(), tempexpitemsPo.getGciws()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCIUSER.name(), tempexpitemsPo.getGciuser()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCIDATE.name(), tempexpitemsPo.getGcidate()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCIWEIGHT.name(), tempexpitemsPo.getGciweight()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCOWS.name(), tempexpitemsPo.getGcows()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCOUSER.name(), tempexpitemsPo.getGcouser()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCODATE.name(), tempexpitemsPo.getGcodate()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.GCOSN.name(), tempexpitemsPo.getGcosn()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.FLIGHTNO.name(), tempexpitemsPo.getFlightno()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.EXPRESSID.name(), tempexpitemsPo.getExpressid()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.CONTAINER.name(), tempexpitemsPo.getContainer()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.CUSTOMSID.name(), tempexpitemsPo.getCustomsid()); 
			dataObject.setValue(TempexpitemsPo.COLUMNS.OCUSTOMSID.name(), tempexpitemsPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
