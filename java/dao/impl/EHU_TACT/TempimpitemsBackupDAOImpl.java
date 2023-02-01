package com.doc.common.dao.impl; 
 
public class TempimpitemsBackupDAOImpl extends GeneralDAOImpl<TempimpitemsBackupPo> implements TempimpitemsBackupDAO { 
	public static final TempimpitemsBackupDAOImpl INSTANCE = new TempimpitemsBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPITEMS_BACKUP"; 

	public TempimpitemsBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpitemsBackupPo> CONVERTER = new MapConverter<TempimpitemsBackupPo>() { 
 
		@Override 
		public TempimpitemsBackupPo convert(final DataObject dataObject) { 
			final TempimpitemsBackupPo tempimpitemsBackupPo = new TempimpitemsBackupPo(); 
			tempimpitemsBackupPo.setBagno(dataObject.getString(TempimpitemsBackupPo.COLUMNS.BAGNO.name())); 
			tempimpitemsBackupPo.setHwb(dataObject.getString(TempimpitemsBackupPo.COLUMNS.HWB.name())); 
			tempimpitemsBackupPo.setMwb(dataObject.getString(TempimpitemsBackupPo.COLUMNS.MWB.name())); 
			tempimpitemsBackupPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.ITEMNO.name()))); 
			tempimpitemsBackupPo.setExpbagno(dataObject.getString(TempimpitemsBackupPo.COLUMNS.EXPBAGNO.name())); 
			tempimpitemsBackupPo.setGciws(dataObject.getString(TempimpitemsBackupPo.COLUMNS.GCIWS.name())); 
			tempimpitemsBackupPo.setGciuser(dataObject.getString(TempimpitemsBackupPo.COLUMNS.GCIUSER.name())); 
			tempimpitemsBackupPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.GCIDATE.name()))); 
			tempimpitemsBackupPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimpitemsBackupPo.setGcows(dataObject.getString(TempimpitemsBackupPo.COLUMNS.GCOWS.name())); 
			tempimpitemsBackupPo.setGcouser(dataObject.getString(TempimpitemsBackupPo.COLUMNS.GCOUSER.name())); 
			tempimpitemsBackupPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.GCODATE.name()))); 
			tempimpitemsBackupPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.GCOSN.name()))); 
			tempimpitemsBackupPo.setFlightno(dataObject.getString(TempimpitemsBackupPo.COLUMNS.FLIGHTNO.name())); 
			tempimpitemsBackupPo.setExpressid(dataObject.getString(TempimpitemsBackupPo.COLUMNS.EXPRESSID.name())); 
			tempimpitemsBackupPo.setContainer(dataObject.getString(TempimpitemsBackupPo.COLUMNS.CONTAINER.name())); 
			tempimpitemsBackupPo.setDeclno(dataObject.getString(TempimpitemsBackupPo.COLUMNS.DECLNO.name())); 
			tempimpitemsBackupPo.setFlightdest(dataObject.getString(TempimpitemsBackupPo.COLUMNS.FLIGHTDEST.name())); 
			tempimpitemsBackupPo.setWorkarea(dataObject.getString(TempimpitemsBackupPo.COLUMNS.WORKAREA.name())); 
			tempimpitemsBackupPo.setUldflag(TimestampUtils.of(dataObject.getValue(TempimpitemsBackupPo.COLUMNS.ULDFLAG.name()))); 
			tempimpitemsBackupPo.setCustomsid(dataObject.getString(TempimpitemsBackupPo.COLUMNS.CUSTOMSID.name())); 
			tempimpitemsBackupPo.setOcustomsid(dataObject.getString(TempimpitemsBackupPo.COLUMNS.OCUSTOMSID.name())); 
			return tempimpitemsBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpitemsBackupPo tempimpitemsBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.BAGNO.name(), tempimpitemsBackupPo.getBagno()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.HWB.name(), tempimpitemsBackupPo.getHwb()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.MWB.name(), tempimpitemsBackupPo.getMwb()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.ITEMNO.name(), tempimpitemsBackupPo.getItemno()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.EXPBAGNO.name(), tempimpitemsBackupPo.getExpbagno()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCIWS.name(), tempimpitemsBackupPo.getGciws()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCIUSER.name(), tempimpitemsBackupPo.getGciuser()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCIDATE.name(), tempimpitemsBackupPo.getGcidate()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCIWEIGHT.name(), tempimpitemsBackupPo.getGciweight()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCOWS.name(), tempimpitemsBackupPo.getGcows()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCOUSER.name(), tempimpitemsBackupPo.getGcouser()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCODATE.name(), tempimpitemsBackupPo.getGcodate()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.GCOSN.name(), tempimpitemsBackupPo.getGcosn()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.FLIGHTNO.name(), tempimpitemsBackupPo.getFlightno()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.EXPRESSID.name(), tempimpitemsBackupPo.getExpressid()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.CONTAINER.name(), tempimpitemsBackupPo.getContainer()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.DECLNO.name(), tempimpitemsBackupPo.getDeclno()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.FLIGHTDEST.name(), tempimpitemsBackupPo.getFlightdest()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.WORKAREA.name(), tempimpitemsBackupPo.getWorkarea()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.ULDFLAG.name(), tempimpitemsBackupPo.getUldflag()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.CUSTOMSID.name(), tempimpitemsBackupPo.getCustomsid()); 
			dataObject.setValue(TempimpitemsBackupPo.COLUMNS.OCUSTOMSID.name(), tempimpitemsBackupPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpitemsBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpitemsBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
