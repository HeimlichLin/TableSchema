package com.doc.common.dao.impl; 
 
public class TempexpitemsBakDAOImpl extends GeneralDAOImpl<TempexpitemsBakPo> implements TempexpitemsBakDAO { 
	public static final TempexpitemsBakDAOImpl INSTANCE = new TempexpitemsBakDAOImpl(); 
	public static final String TABLENAME = "TEMPEXPITEMS_BAK"; 

	public TempexpitemsBakDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempexpitemsBakPo> CONVERTER = new MapConverter<TempexpitemsBakPo>() { 
 
		@Override 
		public TempexpitemsBakPo convert(final DataObject dataObject) { 
			final TempexpitemsBakPo tempexpitemsBakPo = new TempexpitemsBakPo(); 
			tempexpitemsBakPo.setBagno(dataObject.getString(TempexpitemsBakPo.COLUMNS.BAGNO.name())); 
			tempexpitemsBakPo.setHwb(dataObject.getString(TempexpitemsBakPo.COLUMNS.HWB.name())); 
			tempexpitemsBakPo.setMwb(dataObject.getString(TempexpitemsBakPo.COLUMNS.MWB.name())); 
			tempexpitemsBakPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsBakPo.COLUMNS.ITEMNO.name()))); 
			tempexpitemsBakPo.setExpbagno(dataObject.getString(TempexpitemsBakPo.COLUMNS.EXPBAGNO.name())); 
			tempexpitemsBakPo.setGciws(dataObject.getString(TempexpitemsBakPo.COLUMNS.GCIWS.name())); 
			tempexpitemsBakPo.setGciuser(dataObject.getString(TempexpitemsBakPo.COLUMNS.GCIUSER.name())); 
			tempexpitemsBakPo.setGcidate(TimestampUtils.of(dataObject.getValue(TempexpitemsBakPo.COLUMNS.GCIDATE.name()))); 
			tempexpitemsBakPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsBakPo.COLUMNS.GCIWEIGHT.name()))); 
			tempexpitemsBakPo.setGcows(dataObject.getString(TempexpitemsBakPo.COLUMNS.GCOWS.name())); 
			tempexpitemsBakPo.setGcouser(dataObject.getString(TempexpitemsBakPo.COLUMNS.GCOUSER.name())); 
			tempexpitemsBakPo.setGcodate(TimestampUtils.of(dataObject.getValue(TempexpitemsBakPo.COLUMNS.GCODATE.name()))); 
			tempexpitemsBakPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(TempexpitemsBakPo.COLUMNS.GCOSN.name()))); 
			tempexpitemsBakPo.setFlightno(dataObject.getString(TempexpitemsBakPo.COLUMNS.FLIGHTNO.name())); 
			tempexpitemsBakPo.setExpressid(dataObject.getString(TempexpitemsBakPo.COLUMNS.EXPRESSID.name())); 
			tempexpitemsBakPo.setContainer(dataObject.getString(TempexpitemsBakPo.COLUMNS.CONTAINER.name())); 
			tempexpitemsBakPo.setCustomsid(dataObject.getString(TempexpitemsBakPo.COLUMNS.CUSTOMSID.name())); 
			tempexpitemsBakPo.setOcustomsid(dataObject.getString(TempexpitemsBakPo.COLUMNS.OCUSTOMSID.name())); 
			return tempexpitemsBakPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempexpitemsBakPo tempexpitemsBakPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.BAGNO.name(), tempexpitemsBakPo.getBagno()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.HWB.name(), tempexpitemsBakPo.getHwb()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.MWB.name(), tempexpitemsBakPo.getMwb()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.ITEMNO.name(), tempexpitemsBakPo.getItemno()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.EXPBAGNO.name(), tempexpitemsBakPo.getExpbagno()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCIWS.name(), tempexpitemsBakPo.getGciws()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCIUSER.name(), tempexpitemsBakPo.getGciuser()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCIDATE.name(), tempexpitemsBakPo.getGcidate()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCIWEIGHT.name(), tempexpitemsBakPo.getGciweight()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCOWS.name(), tempexpitemsBakPo.getGcows()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCOUSER.name(), tempexpitemsBakPo.getGcouser()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCODATE.name(), tempexpitemsBakPo.getGcodate()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.GCOSN.name(), tempexpitemsBakPo.getGcosn()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.FLIGHTNO.name(), tempexpitemsBakPo.getFlightno()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.EXPRESSID.name(), tempexpitemsBakPo.getExpressid()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.CONTAINER.name(), tempexpitemsBakPo.getContainer()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.CUSTOMSID.name(), tempexpitemsBakPo.getCustomsid()); 
			dataObject.setValue(TempexpitemsBakPo.COLUMNS.OCUSTOMSID.name(), tempexpitemsBakPo.getOcustomsid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempexpitemsBakPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempexpitemsBakPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
