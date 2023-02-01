package com.doc.common.dao.impl; 
 
public class BakimpitemsDAOImpl extends GeneralDAOImpl<BakimpitemsPo> implements BakimpitemsDAO { 
	public static final BakimpitemsDAOImpl INSTANCE = new BakimpitemsDAOImpl(); 
	public static final String TABLENAME = "BAKIMPITEMS"; 

	public BakimpitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BakimpitemsPo> CONVERTER = new MapConverter<BakimpitemsPo>() { 
 
		@Override 
		public BakimpitemsPo convert(final DataObject dataObject) { 
			final BakimpitemsPo bakimpitemsPo = new BakimpitemsPo(); 
			bakimpitemsPo.setBagno(dataObject.getString(BakimpitemsPo.COLUMNS.BAGNO.name())); 
			bakimpitemsPo.setHwb(dataObject.getString(BakimpitemsPo.COLUMNS.HWB.name())); 
			bakimpitemsPo.setMwb(dataObject.getString(BakimpitemsPo.COLUMNS.MWB.name())); 
			bakimpitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(BakimpitemsPo.COLUMNS.ITEMNO.name()))); 
			bakimpitemsPo.setExpbagno(dataObject.getString(BakimpitemsPo.COLUMNS.EXPBAGNO.name())); 
			bakimpitemsPo.setGciws(dataObject.getString(BakimpitemsPo.COLUMNS.GCIWS.name())); 
			bakimpitemsPo.setGciuser(dataObject.getString(BakimpitemsPo.COLUMNS.GCIUSER.name())); 
			bakimpitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(BakimpitemsPo.COLUMNS.GCIDATE.name()))); 
			bakimpitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(BakimpitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			bakimpitemsPo.setGcows(dataObject.getString(BakimpitemsPo.COLUMNS.GCOWS.name())); 
			bakimpitemsPo.setGcouser(dataObject.getString(BakimpitemsPo.COLUMNS.GCOUSER.name())); 
			bakimpitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(BakimpitemsPo.COLUMNS.GCODATE.name()))); 
			bakimpitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(BakimpitemsPo.COLUMNS.GCOSN.name()))); 
			bakimpitemsPo.setFlightno(dataObject.getString(BakimpitemsPo.COLUMNS.FLIGHTNO.name())); 
			bakimpitemsPo.setExpressid(dataObject.getString(BakimpitemsPo.COLUMNS.EXPRESSID.name())); 
			bakimpitemsPo.setContainer(dataObject.getString(BakimpitemsPo.COLUMNS.CONTAINER.name())); 
			return bakimpitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BakimpitemsPo bakimpitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.BAGNO.name(), bakimpitemsPo.getBagno()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.HWB.name(), bakimpitemsPo.getHwb()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.MWB.name(), bakimpitemsPo.getMwb()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.ITEMNO.name(), bakimpitemsPo.getItemno()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.EXPBAGNO.name(), bakimpitemsPo.getExpbagno()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCIWS.name(), bakimpitemsPo.getGciws()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCIUSER.name(), bakimpitemsPo.getGciuser()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCIDATE.name(), bakimpitemsPo.getGcidate()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCIWEIGHT.name(), bakimpitemsPo.getGciweight()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCOWS.name(), bakimpitemsPo.getGcows()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCOUSER.name(), bakimpitemsPo.getGcouser()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCODATE.name(), bakimpitemsPo.getGcodate()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.GCOSN.name(), bakimpitemsPo.getGcosn()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.FLIGHTNO.name(), bakimpitemsPo.getFlightno()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.EXPRESSID.name(), bakimpitemsPo.getExpressid()); 
			dataObject.setValue(BakimpitemsPo.COLUMNS.CONTAINER.name(), bakimpitemsPo.getContainer()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BakimpitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BakimpitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
