package com.doc.common.dao.impl; 
 
public class GcoitemsbkDAOImpl extends GeneralDAOImpl<GcoitemsbkPo> implements GcoitemsbkDAO { 
	public static final GcoitemsbkDAOImpl INSTANCE = new GcoitemsbkDAOImpl(); 
	public static final String TABLENAME = "GCOITEMSBK"; 

	public GcoitemsbkDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoitemsbkPo> CONVERTER = new MapConverter<GcoitemsbkPo>() { 
 
		@Override 
		public GcoitemsbkPo convert(final DataObject dataObject) { 
			final GcoitemsbkPo gcoitemsbkPo = new GcoitemsbkPo(); 
			gcoitemsbkPo.setBagno(dataObject.getString(GcoitemsbkPo.COLUMNS.BAGNO.name())); 
			gcoitemsbkPo.setHwb(dataObject.getString(GcoitemsbkPo.COLUMNS.HWB.name())); 
			gcoitemsbkPo.setMwb(dataObject.getString(GcoitemsbkPo.COLUMNS.MWB.name())); 
			gcoitemsbkPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsbkPo.COLUMNS.ITEMNO.name()))); 
			gcoitemsbkPo.setExpbagno(dataObject.getString(GcoitemsbkPo.COLUMNS.EXPBAGNO.name())); 
			gcoitemsbkPo.setGciws(dataObject.getString(GcoitemsbkPo.COLUMNS.GCIWS.name())); 
			gcoitemsbkPo.setGciuser(dataObject.getString(GcoitemsbkPo.COLUMNS.GCIUSER.name())); 
			gcoitemsbkPo.setGcidate(TimestampUtils.of(dataObject.getValue(GcoitemsbkPo.COLUMNS.GCIDATE.name()))); 
			gcoitemsbkPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsbkPo.COLUMNS.GCIWEIGHT.name()))); 
			gcoitemsbkPo.setGcows(dataObject.getString(GcoitemsbkPo.COLUMNS.GCOWS.name())); 
			gcoitemsbkPo.setGcouser(dataObject.getString(GcoitemsbkPo.COLUMNS.GCOUSER.name())); 
			gcoitemsbkPo.setGcodate(TimestampUtils.of(dataObject.getValue(GcoitemsbkPo.COLUMNS.GCODATE.name()))); 
			gcoitemsbkPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(GcoitemsbkPo.COLUMNS.GCOSN.name()))); 
			gcoitemsbkPo.setFlightno(dataObject.getString(GcoitemsbkPo.COLUMNS.FLIGHTNO.name())); 
			gcoitemsbkPo.setExpressid(dataObject.getString(GcoitemsbkPo.COLUMNS.EXPRESSID.name())); 
			gcoitemsbkPo.setContainer(dataObject.getString(GcoitemsbkPo.COLUMNS.CONTAINER.name())); 
			gcoitemsbkPo.setCustomsid(dataObject.getString(GcoitemsbkPo.COLUMNS.CUSTOMSID.name())); 
			gcoitemsbkPo.setOcustomsid(dataObject.getString(GcoitemsbkPo.COLUMNS.OCUSTOMSID.name())); 
			return gcoitemsbkPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoitemsbkPo gcoitemsbkPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.BAGNO.name(), gcoitemsbkPo.getBagno()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.HWB.name(), gcoitemsbkPo.getHwb()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.MWB.name(), gcoitemsbkPo.getMwb()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.ITEMNO.name(), gcoitemsbkPo.getItemno()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.EXPBAGNO.name(), gcoitemsbkPo.getExpbagno()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCIWS.name(), gcoitemsbkPo.getGciws()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCIUSER.name(), gcoitemsbkPo.getGciuser()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCIDATE.name(), gcoitemsbkPo.getGcidate()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCIWEIGHT.name(), gcoitemsbkPo.getGciweight()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCOWS.name(), gcoitemsbkPo.getGcows()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCOUSER.name(), gcoitemsbkPo.getGcouser()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCODATE.name(), gcoitemsbkPo.getGcodate()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.GCOSN.name(), gcoitemsbkPo.getGcosn()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.FLIGHTNO.name(), gcoitemsbkPo.getFlightno()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.EXPRESSID.name(), gcoitemsbkPo.getExpressid()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.CONTAINER.name(), gcoitemsbkPo.getContainer()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.CUSTOMSID.name(), gcoitemsbkPo.getCustomsid()); 
			dataObject.setValue(GcoitemsbkPo.COLUMNS.OCUSTOMSID.name(), gcoitemsbkPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoitemsbkPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoitemsbkPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
