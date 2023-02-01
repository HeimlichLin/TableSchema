package com.doc.common.dao.impl; 
 
public class EventCTranCDAOImpl extends GeneralDAOImpl<EventCTranCPo> implements EventCTranCDAO { 
	public static final EventCTranCDAOImpl INSTANCE = new EventCTranCDAOImpl(); 
	public static final String TABLENAME = "EVENT_C_TRAN_C"; 

	public EventCTranCDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCTranCPo> CONVERTER = new MapConverter<EventCTranCPo>() { 
 
		@Override 
		public EventCTranCPo convert(final DataObject dataObject) { 
			final EventCTranCPo eventCTranCPo = new EventCTranCPo(); 
			eventCTranCPo.setPostspecialaccount(dataObject.getString(EventCTranCPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCTranCPo.setPosttype(dataObject.getString(EventCTranCPo.COLUMNS.POSTTYPE.name())); 
			eventCTranCPo.setType(dataObject.getString(EventCTranCPo.COLUMNS.TYPE.name())); 
			eventCTranCPo.setYear(dataObject.getString(EventCTranCPo.COLUMNS.YEAR.name())); 
			eventCTranCPo.setCountrycode(dataObject.getString(EventCTranCPo.COLUMNS.COUNTRYCODE.name())); 
			eventCTranCPo.setExchangeagency(dataObject.getString(EventCTranCPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCTranCPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranCPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCTranCPo.setBagno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranCPo.COLUMNS.BAGNO.name()))); 
			eventCTranCPo.setPageno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranCPo.COLUMNS.PAGENO.name()))); 
			eventCTranCPo.setCellno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranCPo.COLUMNS.CELLNO.name()))); 
			eventCTranCPo.setPostno(dataObject.getString(EventCTranCPo.COLUMNS.POSTNO.name())); 
			eventCTranCPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EventCTranCPo.COLUMNS.WEIGHT.name()))); 
			eventCTranCPo.setSealdatetime(dataObject.getString(EventCTranCPo.COLUMNS.SEALDATETIME.name())); 
			eventCTranCPo.setProvincetype(dataObject.getString(EventCTranCPo.COLUMNS.PROVINCETYPE.name())); 
			eventCTranCPo.setBoxtype(dataObject.getString(EventCTranCPo.COLUMNS.BOXTYPE.name())); 
			eventCTranCPo.setFilename(dataObject.getString(EventCTranCPo.COLUMNS.FILENAME.name())); 
			return eventCTranCPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCTranCPo eventCTranCPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCTranCPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCTranCPo.getPostspecialaccount()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.POSTTYPE.name(), eventCTranCPo.getPosttype()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.TYPE.name(), eventCTranCPo.getType()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.YEAR.name(), eventCTranCPo.getYear()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.COUNTRYCODE.name(), eventCTranCPo.getCountrycode()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.EXCHANGEAGENCY.name(), eventCTranCPo.getExchangeagency()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.TOTALPACKAGENO.name(), eventCTranCPo.getTotalpackageno()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.BAGNO.name(), eventCTranCPo.getBagno()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.PAGENO.name(), eventCTranCPo.getPageno()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.CELLNO.name(), eventCTranCPo.getCellno()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.POSTNO.name(), eventCTranCPo.getPostno()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.WEIGHT.name(), eventCTranCPo.getWeight()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.SEALDATETIME.name(), eventCTranCPo.getSealdatetime()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.PROVINCETYPE.name(), eventCTranCPo.getProvincetype()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.BOXTYPE.name(), eventCTranCPo.getBoxtype()); 
			dataObject.setValue(EventCTranCPo.COLUMNS.FILENAME.name(), eventCTranCPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCTranCPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCTranCPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
