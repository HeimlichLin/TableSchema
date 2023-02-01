package com.doc.common.dao.impl; 
 
public class TempimpitemsaDAOImpl extends GeneralDAOImpl<TempimpitemsaPo> implements TempimpitemsaDAO { 
	public static final TempimpitemsaDAOImpl INSTANCE = new TempimpitemsaDAOImpl(); 
	public static final String TABLENAME = "TEMPIMPITEMSA"; 

	public TempimpitemsaDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempimpitemsaPo> CONVERTER = new MapConverter<TempimpitemsaPo>() { 
 
		@Override 
		public TempimpitemsaPo convert(final DataObject dataObject) { 
			final TempimpitemsaPo tempimpitemsaPo = new TempimpitemsaPo(); 
			tempimpitemsaPo.setBagno(dataObject.getString(TempimpitemsaPo.COLUMNS.BAGNO.name())); 
			tempimpitemsaPo.setHwb(dataObject.getString(TempimpitemsaPo.COLUMNS.HWB.name())); 
			tempimpitemsaPo.setMwb(dataObject.getString(TempimpitemsaPo.COLUMNS.MWB.name())); 
			tempimpitemsaPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsaPo.COLUMNS.ITEMNO.name()))); 
			tempimpitemsaPo.setExpbagno(dataObject.getString(TempimpitemsaPo.COLUMNS.EXPBAGNO.name())); 
			tempimpitemsaPo.setGciws(dataObject.getString(TempimpitemsaPo.COLUMNS.GCIWS.name())); 
			tempimpitemsaPo.setGciuser(dataObject.getString(TempimpitemsaPo.COLUMNS.GCIUSER.name())); 
			tempimpitemsaPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempimpitemsaPo.COLUMNS.GCIDATE.name()))); 
			tempimpitemsaPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsaPo.COLUMNS.GCIWEIGHT.name()))); 
			tempimpitemsaPo.setGcows(dataObject.getString(TempimpitemsaPo.COLUMNS.GCOWS.name())); 
			tempimpitemsaPo.setGcouser(dataObject.getString(TempimpitemsaPo.COLUMNS.GCOUSER.name())); 
			tempimpitemsaPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempimpitemsaPo.COLUMNS.GCODATE.name()))); 
			tempimpitemsaPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempimpitemsaPo.COLUMNS.GCOSN.name()))); 
			tempimpitemsaPo.setFlightno(dataObject.getString(TempimpitemsaPo.COLUMNS.FLIGHTNO.name())); 
			tempimpitemsaPo.setExpressid(dataObject.getString(TempimpitemsaPo.COLUMNS.EXPRESSID.name())); 
			tempimpitemsaPo.setContainer(dataObject.getString(TempimpitemsaPo.COLUMNS.CONTAINER.name())); 
			tempimpitemsaPo.setCustomsid(dataObject.getString(TempimpitemsaPo.COLUMNS.CUSTOMSID.name())); 
			tempimpitemsaPo.setOcustomsid(dataObject.getString(TempimpitemsaPo.COLUMNS.OCUSTOMSID.name())); 
			return tempimpitemsaPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempimpitemsaPo tempimpitemsaPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.BAGNO.name(), tempimpitemsaPo.getBagno()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.HWB.name(), tempimpitemsaPo.getHwb()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.MWB.name(), tempimpitemsaPo.getMwb()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.ITEMNO.name(), tempimpitemsaPo.getItemno()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.EXPBAGNO.name(), tempimpitemsaPo.getExpbagno()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCIWS.name(), tempimpitemsaPo.getGciws()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCIUSER.name(), tempimpitemsaPo.getGciuser()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCIDATE.name(), tempimpitemsaPo.getGcidate()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCIWEIGHT.name(), tempimpitemsaPo.getGciweight()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCOWS.name(), tempimpitemsaPo.getGcows()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCOUSER.name(), tempimpitemsaPo.getGcouser()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCODATE.name(), tempimpitemsaPo.getGcodate()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.GCOSN.name(), tempimpitemsaPo.getGcosn()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.FLIGHTNO.name(), tempimpitemsaPo.getFlightno()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.EXPRESSID.name(), tempimpitemsaPo.getExpressid()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.CONTAINER.name(), tempimpitemsaPo.getContainer()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.CUSTOMSID.name(), tempimpitemsaPo.getCustomsid()); 
			dataObject.setValue(TempimpitemsaPo.COLUMNS.OCUSTOMSID.name(), tempimpitemsaPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempimpitemsaPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempimpitemsaPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
