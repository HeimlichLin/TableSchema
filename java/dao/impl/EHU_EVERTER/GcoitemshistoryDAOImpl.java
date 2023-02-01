package com.doc.common.dao.impl; 
 
public class GcoitemshistoryDAOImpl extends GeneralDAOImpl<GcoitemshistoryPo> implements GcoitemshistoryDAO { 
	public static final GcoitemshistoryDAOImpl INSTANCE = new GcoitemshistoryDAOImpl(); 
	public static final String TABLENAME = "GCOITEMSHISTORY"; 

	public GcoitemshistoryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcoitemshistoryPo> CONVERTER = new MapConverter<GcoitemshistoryPo>() { 
 
		@Override 
		public GcoitemshistoryPo convert(final DataObject dataObject) { 
			final GcoitemshistoryPo gcoitemshistoryPo = new GcoitemshistoryPo(); 
			gcoitemshistoryPo.setBagno(dataObject.getString(GcoitemshistoryPo.COLUMNS.BAGNO.name())); 
			gcoitemshistoryPo.setHwb(dataObject.getString(GcoitemshistoryPo.COLUMNS.HWB.name())); 
			gcoitemshistoryPo.setMwb(dataObject.getString(GcoitemshistoryPo.COLUMNS.MWB.name())); 
			gcoitemshistoryPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(GcoitemshistoryPo.COLUMNS.ITEMNO.name()))); 
			gcoitemshistoryPo.setExpbagno(dataObject.getString(GcoitemshistoryPo.COLUMNS.EXPBAGNO.name())); 
			gcoitemshistoryPo.setGciws(dataObject.getString(GcoitemshistoryPo.COLUMNS.GCIWS.name())); 
			gcoitemshistoryPo.setGciuser(dataObject.getString(GcoitemshistoryPo.COLUMNS.GCIUSER.name())); 
			gcoitemshistoryPo.setGcidate(TimestampUtils.of(dataObject.getValue(GcoitemshistoryPo.COLUMNS.GCIDATE.name()))); 
			gcoitemshistoryPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(GcoitemshistoryPo.COLUMNS.GCIWEIGHT.name()))); 
			gcoitemshistoryPo.setGcows(dataObject.getString(GcoitemshistoryPo.COLUMNS.GCOWS.name())); 
			gcoitemshistoryPo.setGcouser(dataObject.getString(GcoitemshistoryPo.COLUMNS.GCOUSER.name())); 
			gcoitemshistoryPo.setGcodate(TimestampUtils.of(dataObject.getValue(GcoitemshistoryPo.COLUMNS.GCODATE.name()))); 
			gcoitemshistoryPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(GcoitemshistoryPo.COLUMNS.GCOSN.name()))); 
			gcoitemshistoryPo.setFlightno(dataObject.getString(GcoitemshistoryPo.COLUMNS.FLIGHTNO.name())); 
			gcoitemshistoryPo.setExpressid(dataObject.getString(GcoitemshistoryPo.COLUMNS.EXPRESSID.name())); 
			gcoitemshistoryPo.setContainer(dataObject.getString(GcoitemshistoryPo.COLUMNS.CONTAINER.name())); 
			gcoitemshistoryPo.setCustomsid(dataObject.getString(GcoitemshistoryPo.COLUMNS.CUSTOMSID.name())); 
			gcoitemshistoryPo.setOcustomsid(dataObject.getString(GcoitemshistoryPo.COLUMNS.OCUSTOMSID.name())); 
			return gcoitemshistoryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcoitemshistoryPo gcoitemshistoryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.BAGNO.name(), gcoitemshistoryPo.getBagno()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.HWB.name(), gcoitemshistoryPo.getHwb()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.MWB.name(), gcoitemshistoryPo.getMwb()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.ITEMNO.name(), gcoitemshistoryPo.getItemno()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.EXPBAGNO.name(), gcoitemshistoryPo.getExpbagno()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCIWS.name(), gcoitemshistoryPo.getGciws()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCIUSER.name(), gcoitemshistoryPo.getGciuser()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCIDATE.name(), gcoitemshistoryPo.getGcidate()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCIWEIGHT.name(), gcoitemshistoryPo.getGciweight()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCOWS.name(), gcoitemshistoryPo.getGcows()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCOUSER.name(), gcoitemshistoryPo.getGcouser()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCODATE.name(), gcoitemshistoryPo.getGcodate()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.GCOSN.name(), gcoitemshistoryPo.getGcosn()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.FLIGHTNO.name(), gcoitemshistoryPo.getFlightno()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.EXPRESSID.name(), gcoitemshistoryPo.getExpressid()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.CONTAINER.name(), gcoitemshistoryPo.getContainer()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.CUSTOMSID.name(), gcoitemshistoryPo.getCustomsid()); 
			dataObject.setValue(GcoitemshistoryPo.COLUMNS.OCUSTOMSID.name(), gcoitemshistoryPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcoitemshistoryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcoitemshistoryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
