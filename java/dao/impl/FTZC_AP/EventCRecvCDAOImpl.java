package com.doc.common.dao.impl; 
 
public class EventCRecvCDAOImpl extends GeneralDAOImpl<EventCRecvCPo> implements EventCRecvCDAO { 
	public static final EventCRecvCDAOImpl INSTANCE = new EventCRecvCDAOImpl(); 
	public static final String TABLENAME = "EVENT_C_RECV_C"; 

	public EventCRecvCDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCRecvCPo> CONVERTER = new MapConverter<EventCRecvCPo>() { 
 
		@Override 
		public EventCRecvCPo convert(final DataObject dataObject) { 
			final EventCRecvCPo eventCRecvCPo = new EventCRecvCPo(); 
			eventCRecvCPo.setPostspecialaccount(dataObject.getString(EventCRecvCPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCRecvCPo.setPosttype(dataObject.getString(EventCRecvCPo.COLUMNS.POSTTYPE.name())); 
			eventCRecvCPo.setType(dataObject.getString(EventCRecvCPo.COLUMNS.TYPE.name())); 
			eventCRecvCPo.setYear(dataObject.getString(EventCRecvCPo.COLUMNS.YEAR.name())); 
			eventCRecvCPo.setCountrycode(dataObject.getString(EventCRecvCPo.COLUMNS.COUNTRYCODE.name())); 
			eventCRecvCPo.setExchangeagency(dataObject.getString(EventCRecvCPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCRecvCPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvCPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCRecvCPo.setGoodtotalpackageyear(dataObject.getString(EventCRecvCPo.COLUMNS.GOODTOTALPACKAGEYEAR.name())); 
			eventCRecvCPo.setGoodtotalpackageno(dataObject.getString(EventCRecvCPo.COLUMNS.GOODTOTALPACKAGENO.name())); 
			eventCRecvCPo.setBagno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvCPo.COLUMNS.BAGNO.name()))); 
			eventCRecvCPo.setPageno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvCPo.COLUMNS.PAGENO.name()))); 
			eventCRecvCPo.setCellno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvCPo.COLUMNS.CELLNO.name()))); 
			eventCRecvCPo.setPostno(dataObject.getString(EventCRecvCPo.COLUMNS.POSTNO.name())); 
			eventCRecvCPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvCPo.COLUMNS.WEIGHT.name()))); 
			eventCRecvCPo.setSealdatetime(dataObject.getString(EventCRecvCPo.COLUMNS.SEALDATETIME.name())); 
			eventCRecvCPo.setProvincetype(dataObject.getString(EventCRecvCPo.COLUMNS.PROVINCETYPE.name())); 
			eventCRecvCPo.setBoxtype(dataObject.getString(EventCRecvCPo.COLUMNS.BOXTYPE.name())); 
			eventCRecvCPo.setFilename(dataObject.getString(EventCRecvCPo.COLUMNS.FILENAME.name())); 
			return eventCRecvCPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCRecvCPo eventCRecvCPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCRecvCPo.getPostspecialaccount()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.POSTTYPE.name(), eventCRecvCPo.getPosttype()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.TYPE.name(), eventCRecvCPo.getType()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.YEAR.name(), eventCRecvCPo.getYear()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.COUNTRYCODE.name(), eventCRecvCPo.getCountrycode()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.EXCHANGEAGENCY.name(), eventCRecvCPo.getExchangeagency()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.TOTALPACKAGENO.name(), eventCRecvCPo.getTotalpackageno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.GOODTOTALPACKAGEYEAR.name(), eventCRecvCPo.getGoodtotalpackageyear()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.GOODTOTALPACKAGENO.name(), eventCRecvCPo.getGoodtotalpackageno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.BAGNO.name(), eventCRecvCPo.getBagno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.PAGENO.name(), eventCRecvCPo.getPageno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.CELLNO.name(), eventCRecvCPo.getCellno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.POSTNO.name(), eventCRecvCPo.getPostno()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.WEIGHT.name(), eventCRecvCPo.getWeight()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.SEALDATETIME.name(), eventCRecvCPo.getSealdatetime()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.PROVINCETYPE.name(), eventCRecvCPo.getProvincetype()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.BOXTYPE.name(), eventCRecvCPo.getBoxtype()); 
			dataObject.setValue(EventCRecvCPo.COLUMNS.FILENAME.name(), eventCRecvCPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCRecvCPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCRecvCPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
