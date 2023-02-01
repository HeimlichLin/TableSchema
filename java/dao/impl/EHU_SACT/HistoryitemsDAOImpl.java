package com.doc.common.dao.impl; 
 
public class HistoryitemsDAOImpl extends GeneralDAOImpl<HistoryitemsPo> implements HistoryitemsDAO { 
	public static final HistoryitemsDAOImpl INSTANCE = new HistoryitemsDAOImpl(); 
	public static final String TABLENAME = "HISTORYITEMS"; 

	public HistoryitemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistoryitemsPo> CONVERTER = new MapConverter<HistoryitemsPo>() { 
 
		@Override 
		public HistoryitemsPo convert(final DataObject dataObject) { 
			final HistoryitemsPo historyitemsPo = new HistoryitemsPo(); 
			historyitemsPo.setBagno(dataObject.getString(HistoryitemsPo.COLUMNS.BAGNO.name())); 
			historyitemsPo.setHwb(dataObject.getString(HistoryitemsPo.COLUMNS.HWB.name())); 
			historyitemsPo.setMwb(dataObject.getString(HistoryitemsPo.COLUMNS.MWB.name())); 
			historyitemsPo.setItemno(BigDecimalUtils.formObj(dataObject.getValue(HistoryitemsPo.COLUMNS.ITEMNO.name()))); 
			historyitemsPo.setExpbagno(dataObject.getString(HistoryitemsPo.COLUMNS.EXPBAGNO.name())); 
			historyitemsPo.setGciws(dataObject.getString(HistoryitemsPo.COLUMNS.GCIWS.name())); 
			historyitemsPo.setGciuser(dataObject.getString(HistoryitemsPo.COLUMNS.GCIUSER.name())); 
			historyitemsPo.setGcidate(TimestampUtils.of(dataObject.getValue(HistoryitemsPo.COLUMNS.GCIDATE.name()))); 
			historyitemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(HistoryitemsPo.COLUMNS.GCIWEIGHT.name()))); 
			historyitemsPo.setGcows(dataObject.getString(HistoryitemsPo.COLUMNS.GCOWS.name())); 
			historyitemsPo.setGcouser(dataObject.getString(HistoryitemsPo.COLUMNS.GCOUSER.name())); 
			historyitemsPo.setGcodate(TimestampUtils.of(dataObject.getValue(HistoryitemsPo.COLUMNS.GCODATE.name()))); 
			historyitemsPo.setGcosn(BigDecimalUtils.formObj(dataObject.getValue(HistoryitemsPo.COLUMNS.GCOSN.name()))); 
			historyitemsPo.setFlightno(dataObject.getString(HistoryitemsPo.COLUMNS.FLIGHTNO.name())); 
			historyitemsPo.setExpressid(dataObject.getString(HistoryitemsPo.COLUMNS.EXPRESSID.name())); 
			historyitemsPo.setContainer(dataObject.getString(HistoryitemsPo.COLUMNS.CONTAINER.name())); 
			historyitemsPo.setPkgbagno(dataObject.getString(HistoryitemsPo.COLUMNS.PKGBAGNO.name())); 
			return historyitemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistoryitemsPo historyitemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.BAGNO.name(), historyitemsPo.getBagno()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.HWB.name(), historyitemsPo.getHwb()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.MWB.name(), historyitemsPo.getMwb()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.ITEMNO.name(), historyitemsPo.getItemno()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.EXPBAGNO.name(), historyitemsPo.getExpbagno()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCIWS.name(), historyitemsPo.getGciws()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCIUSER.name(), historyitemsPo.getGciuser()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCIDATE.name(), historyitemsPo.getGcidate()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCIWEIGHT.name(), historyitemsPo.getGciweight()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCOWS.name(), historyitemsPo.getGcows()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCOUSER.name(), historyitemsPo.getGcouser()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCODATE.name(), historyitemsPo.getGcodate()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.GCOSN.name(), historyitemsPo.getGcosn()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.FLIGHTNO.name(), historyitemsPo.getFlightno()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.EXPRESSID.name(), historyitemsPo.getExpressid()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.CONTAINER.name(), historyitemsPo.getContainer()); 
			dataObject.setValue(HistoryitemsPo.COLUMNS.PKGBAGNO.name(), historyitemsPo.getPkgbagno()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistoryitemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistoryitemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
