package com.doc.common.dao.impl; 
 
public class LogitemsDAOImpl extends GeneralDAOImpl<LogitemsPo> implements LogitemsDAO { 
	public static final LogitemsDAOImpl INSTANCE = new LogitemsDAOImpl(); 
	public static final String TABLENAME = "LOGITEMS"; 

	public LogitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<LogitemsPo> CONVERTER = new MapConverter<LogitemsPo>() { 
 
		@Override 
		public LogitemsPo convert(final DataObject dataObject) { 
			final LogitemsPo logitemsPo = new LogitemsPo(); 
			logitemsPo.setItemsBagno(dataObject.getString(LogitemsPo.COLUMNS.ITEMS_BAGNO.name())); 
			logitemsPo.setItemsHwb(dataObject.getString(LogitemsPo.COLUMNS.ITEMS_HWB.name())); 
			logitemsPo.setItemsMwb(dataObject.getString(LogitemsPo.COLUMNS.ITEMS_MWB.name())); 
			logitemsPo.setItemsItemno(BigDecimalUtils.formObj(dataObject.getValue(LogitemsPo.COLUMNS.ITEMS_ITEMNO.name()))); 
			logitemsPo.setItemsExpbagno(dataObject.getString(LogitemsPo.COLUMNS.ITEMS_EXPBAGNO.name())); 
			logitemsPo.setItemsGcidate(TimestampUtils.of(dataObject.getValue(LogitemsPo.COLUMNS.ITEMS_GCIDATE.name()))); 
			logitemsPo.setItemsGciweight(BigDecimalUtils.formObj(dataObject.getValue(LogitemsPo.COLUMNS.ITEMS_GCIWEIGHT.name()))); 
			logitemsPo.setItemsGcodate(TimestampUtils.of(dataObject.getValue(LogitemsPo.COLUMNS.ITEMS_GCODATE.name()))); 
			logitemsPo.setItemsDeclno(dataObject.getString(LogitemsPo.COLUMNS.ITEMS_DECLNO.name())); 
			return logitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final LogitemsPo logitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_BAGNO.name(), logitemsPo.getItemsBagno()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_HWB.name(), logitemsPo.getItemsHwb()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_MWB.name(), logitemsPo.getItemsMwb()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_ITEMNO.name(), logitemsPo.getItemsItemno()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_EXPBAGNO.name(), logitemsPo.getItemsExpbagno()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_GCIDATE.name(), logitemsPo.getItemsGcidate()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_GCIWEIGHT.name(), logitemsPo.getItemsGciweight()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_GCODATE.name(), logitemsPo.getItemsGcodate()); 
			dataObject.setValue(LogitemsPo.COLUMNS.ITEMS_DECLNO.name(), logitemsPo.getItemsDeclno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<LogitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(LogitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
