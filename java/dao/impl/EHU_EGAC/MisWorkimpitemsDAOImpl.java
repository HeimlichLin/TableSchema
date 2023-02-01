package com.doc.common.dao.impl; 
 
public class MisWorkimpitemsDAOImpl extends GeneralDAOImpl<MisWorkimpitemsPo> implements MisWorkimpitemsDAO { 
	public static final MisWorkimpitemsDAOImpl INSTANCE = new MisWorkimpitemsDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKIMPITEMS"; 

	public MisWorkimpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkimpitemsPo> CONVERTER = new MapConverter<MisWorkimpitemsPo>() { 
 
		@Override 
		public MisWorkimpitemsPo convert(final DataObject dataObject) { 
			final MisWorkimpitemsPo misWorkimpitemsPo = new MisWorkimpitemsPo(); 
			misWorkimpitemsPo.setBagno(dataObject.getString(MisWorkimpitemsPo.COLUMNS.BAGNO.name())); 
			misWorkimpitemsPo.setHwb(dataObject.getString(MisWorkimpitemsPo.COLUMNS.HWB.name())); 
			misWorkimpitemsPo.setMwb(dataObject.getString(MisWorkimpitemsPo.COLUMNS.MWB.name())); 
			misWorkimpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpitemsPo.COLUMNS.ITEMNO.name()))); 
			misWorkimpitemsPo.setExpbagno(dataObject.getString(MisWorkimpitemsPo.COLUMNS.EXPBAGNO.name())); 
			misWorkimpitemsPo.setGciws(dataObject.getString(MisWorkimpitemsPo.COLUMNS.GCIWS.name())); 
			misWorkimpitemsPo.setGciuser(dataObject.getString(MisWorkimpitemsPo.COLUMNS.GCIUSER.name())); 
			misWorkimpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(MisWorkimpitemsPo.COLUMNS.GCIDATE.name()))); 
			misWorkimpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			misWorkimpitemsPo.setGcows(dataObject.getString(MisWorkimpitemsPo.COLUMNS.GCOWS.name())); 
			misWorkimpitemsPo.setGcouser(dataObject.getString(MisWorkimpitemsPo.COLUMNS.GCOUSER.name())); 
			misWorkimpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(MisWorkimpitemsPo.COLUMNS.GCODATE.name()))); 
			misWorkimpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkimpitemsPo.COLUMNS.GCOSN.name()))); 
			misWorkimpitemsPo.setFlightno(dataObject.getString(MisWorkimpitemsPo.COLUMNS.FLIGHTNO.name())); 
			misWorkimpitemsPo.setExpressid(dataObject.getString(MisWorkimpitemsPo.COLUMNS.EXPRESSID.name())); 
			misWorkimpitemsPo.setContainer(dataObject.getString(MisWorkimpitemsPo.COLUMNS.CONTAINER.name())); 
			misWorkimpitemsPo.setCustomsid(dataObject.getString(MisWorkimpitemsPo.COLUMNS.CUSTOMSID.name())); 
			misWorkimpitemsPo.setOcustomsid(dataObject.getString(MisWorkimpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			return misWorkimpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkimpitemsPo misWorkimpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.BAGNO.name(), misWorkimpitemsPo.getBagno()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.HWB.name(), misWorkimpitemsPo.getHwb()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.MWB.name(), misWorkimpitemsPo.getMwb()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.ITEMNO.name(), misWorkimpitemsPo.getItemno()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.EXPBAGNO.name(), misWorkimpitemsPo.getExpbagno()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCIWS.name(), misWorkimpitemsPo.getGciws()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCIUSER.name(), misWorkimpitemsPo.getGciuser()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCIDATE.name(), misWorkimpitemsPo.getGcidate()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCIWEIGHT.name(), misWorkimpitemsPo.getGciweight()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCOWS.name(), misWorkimpitemsPo.getGcows()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCOUSER.name(), misWorkimpitemsPo.getGcouser()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCODATE.name(), misWorkimpitemsPo.getGcodate()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.GCOSN.name(), misWorkimpitemsPo.getGcosn()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.FLIGHTNO.name(), misWorkimpitemsPo.getFlightno()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.EXPRESSID.name(), misWorkimpitemsPo.getExpressid()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.CONTAINER.name(), misWorkimpitemsPo.getContainer()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.CUSTOMSID.name(), misWorkimpitemsPo.getCustomsid()); 
			dataObject.setValue(MisWorkimpitemsPo.COLUMNS.OCUSTOMSID.name(), misWorkimpitemsPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkimpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkimpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
