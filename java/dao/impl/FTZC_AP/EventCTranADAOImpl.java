package com.doc.common.dao.impl; 
 
public class EventCTranADAOImpl extends GeneralDAOImpl<EventCTranAPo> implements EventCTranADAO { 
	public static final EventCTranADAOImpl INSTANCE = new EventCTranADAOImpl(); 
	public static final String TABLENAME = "EVENT_C_TRAN_A"; 

	public EventCTranADAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCTranAPo> CONVERTER = new MapConverter<EventCTranAPo>() { 
 
		@Override 
		public EventCTranAPo convert(final DataObject dataObject) { 
			final EventCTranAPo eventCTranAPo = new EventCTranAPo(); 
			eventCTranAPo.setPostspecialaccount(dataObject.getString(EventCTranAPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCTranAPo.setPosttype(dataObject.getString(EventCTranAPo.COLUMNS.POSTTYPE.name())); 
			eventCTranAPo.setType(dataObject.getString(EventCTranAPo.COLUMNS.TYPE.name())); 
			eventCTranAPo.setYear(dataObject.getString(EventCTranAPo.COLUMNS.YEAR.name())); 
			eventCTranAPo.setCountrycode(dataObject.getString(EventCTranAPo.COLUMNS.COUNTRYCODE.name())); 
			eventCTranAPo.setExchangeagency(dataObject.getString(EventCTranAPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCTranAPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranAPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCTranAPo.setPostmblno(dataObject.getString(EventCTranAPo.COLUMNS.POSTMBLNO.name())); 
			eventCTranAPo.setLastyeartotalpackageno(dataObject.getString(EventCTranAPo.COLUMNS.LASTYEARTOTALPACKAGENO.name())); 
			eventCTranAPo.setSealdatetime(dataObject.getString(EventCTranAPo.COLUMNS.SEALDATETIME.name())); 
			eventCTranAPo.setTotalqty(BigDecimalUtils.formObj(dataObject.getValue(EventCTranAPo.COLUMNS.TOTALQTY.name()))); 
			eventCTranAPo.setTotalpagecount(BigDecimalUtils.formObj(dataObject.getValue(EventCTranAPo.COLUMNS.TOTALPAGECOUNT.name()))); 
			eventCTranAPo.setTotalbagnumber(BigDecimalUtils.formObj(dataObject.getValue(EventCTranAPo.COLUMNS.TOTALBAGNUMBER.name()))); 
			eventCTranAPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(EventCTranAPo.COLUMNS.TOTALWEIGHT.name()))); 
			eventCTranAPo.setFilename(dataObject.getString(EventCTranAPo.COLUMNS.FILENAME.name())); 
			return eventCTranAPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCTranAPo eventCTranAPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCTranAPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCTranAPo.getPostspecialaccount()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.POSTTYPE.name(), eventCTranAPo.getPosttype()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TYPE.name(), eventCTranAPo.getType()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.YEAR.name(), eventCTranAPo.getYear()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.COUNTRYCODE.name(), eventCTranAPo.getCountrycode()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.EXCHANGEAGENCY.name(), eventCTranAPo.getExchangeagency()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TOTALPACKAGENO.name(), eventCTranAPo.getTotalpackageno()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.POSTMBLNO.name(), eventCTranAPo.getPostmblno()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.LASTYEARTOTALPACKAGENO.name(), eventCTranAPo.getLastyeartotalpackageno()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.SEALDATETIME.name(), eventCTranAPo.getSealdatetime()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TOTALQTY.name(), eventCTranAPo.getTotalqty()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TOTALPAGECOUNT.name(), eventCTranAPo.getTotalpagecount()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TOTALBAGNUMBER.name(), eventCTranAPo.getTotalbagnumber()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.TOTALWEIGHT.name(), eventCTranAPo.getTotalweight()); 
			dataObject.setValue(EventCTranAPo.COLUMNS.FILENAME.name(), eventCTranAPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCTranAPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCTranAPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
