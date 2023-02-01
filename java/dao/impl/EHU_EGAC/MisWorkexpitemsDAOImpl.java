package com.doc.common.dao.impl; 
 
public class MisWorkexpitemsDAOImpl extends GeneralDAOImpl<MisWorkexpitemsPo> implements MisWorkexpitemsDAO { 
	public static final MisWorkexpitemsDAOImpl INSTANCE = new MisWorkexpitemsDAOImpl(); 
	public static final String TABLENAME = "MIS_WORKEXPITEMS"; 

	public MisWorkexpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisWorkexpitemsPo> CONVERTER = new MapConverter<MisWorkexpitemsPo>() { 
 
		@Override 
		public MisWorkexpitemsPo convert(final DataObject dataObject) { 
			final MisWorkexpitemsPo misWorkexpitemsPo = new MisWorkexpitemsPo(); 
			misWorkexpitemsPo.setBagno(dataObject.getString(MisWorkexpitemsPo.COLUMNS.BAGNO.name())); 
			misWorkexpitemsPo.setHwb(dataObject.getString(MisWorkexpitemsPo.COLUMNS.HWB.name())); 
			misWorkexpitemsPo.setMwb(dataObject.getString(MisWorkexpitemsPo.COLUMNS.MWB.name())); 
			misWorkexpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpitemsPo.COLUMNS.ITEMNO.name()))); 
			misWorkexpitemsPo.setExpbagno(dataObject.getString(MisWorkexpitemsPo.COLUMNS.EXPBAGNO.name())); 
			misWorkexpitemsPo.setGciws(dataObject.getString(MisWorkexpitemsPo.COLUMNS.GCIWS.name())); 
			misWorkexpitemsPo.setGciuser(dataObject.getString(MisWorkexpitemsPo.COLUMNS.GCIUSER.name())); 
			misWorkexpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(MisWorkexpitemsPo.COLUMNS.GCIDATE.name()))); 
			misWorkexpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			misWorkexpitemsPo.setGcows(dataObject.getString(MisWorkexpitemsPo.COLUMNS.GCOWS.name())); 
			misWorkexpitemsPo.setGcouser(dataObject.getString(MisWorkexpitemsPo.COLUMNS.GCOUSER.name())); 
			misWorkexpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(MisWorkexpitemsPo.COLUMNS.GCODATE.name()))); 
			misWorkexpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(MisWorkexpitemsPo.COLUMNS.GCOSN.name()))); 
			misWorkexpitemsPo.setFlightno(dataObject.getString(MisWorkexpitemsPo.COLUMNS.FLIGHTNO.name())); 
			misWorkexpitemsPo.setExpressid(dataObject.getString(MisWorkexpitemsPo.COLUMNS.EXPRESSID.name())); 
			misWorkexpitemsPo.setContainer(dataObject.getString(MisWorkexpitemsPo.COLUMNS.CONTAINER.name())); 
			misWorkexpitemsPo.setCustomsid(dataObject.getString(MisWorkexpitemsPo.COLUMNS.CUSTOMSID.name())); 
			misWorkexpitemsPo.setOcustomsid(dataObject.getString(MisWorkexpitemsPo.COLUMNS.OCUSTOMSID.name())); 
			return misWorkexpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisWorkexpitemsPo misWorkexpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.BAGNO.name(), misWorkexpitemsPo.getBagno()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.HWB.name(), misWorkexpitemsPo.getHwb()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.MWB.name(), misWorkexpitemsPo.getMwb()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.ITEMNO.name(), misWorkexpitemsPo.getItemno()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.EXPBAGNO.name(), misWorkexpitemsPo.getExpbagno()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCIWS.name(), misWorkexpitemsPo.getGciws()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCIUSER.name(), misWorkexpitemsPo.getGciuser()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCIDATE.name(), misWorkexpitemsPo.getGcidate()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCIWEIGHT.name(), misWorkexpitemsPo.getGciweight()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCOWS.name(), misWorkexpitemsPo.getGcows()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCOUSER.name(), misWorkexpitemsPo.getGcouser()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCODATE.name(), misWorkexpitemsPo.getGcodate()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.GCOSN.name(), misWorkexpitemsPo.getGcosn()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.FLIGHTNO.name(), misWorkexpitemsPo.getFlightno()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.EXPRESSID.name(), misWorkexpitemsPo.getExpressid()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.CONTAINER.name(), misWorkexpitemsPo.getContainer()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.CUSTOMSID.name(), misWorkexpitemsPo.getCustomsid()); 
			dataObject.setValue(MisWorkexpitemsPo.COLUMNS.OCUSTOMSID.name(), misWorkexpitemsPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisWorkexpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisWorkexpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
