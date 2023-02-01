package com.doc.common.dao.impl; 
 
public class EventCRecvBDAOImpl extends GeneralDAOImpl<EventCRecvBPo> implements EventCRecvBDAO { 
	public static final EventCRecvBDAOImpl INSTANCE = new EventCRecvBDAOImpl(); 
	public static final String TABLENAME = "EVENT_C_RECV_B"; 

	public EventCRecvBDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCRecvBPo> CONVERTER = new MapConverter<EventCRecvBPo>() { 
 
		@Override 
		public EventCRecvBPo convert(final DataObject dataObject) { 
			final EventCRecvBPo eventCRecvBPo = new EventCRecvBPo(); 
			eventCRecvBPo.setPostspecialaccount(dataObject.getString(EventCRecvBPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCRecvBPo.setPosttype(dataObject.getString(EventCRecvBPo.COLUMNS.POSTTYPE.name())); 
			eventCRecvBPo.setType(dataObject.getString(EventCRecvBPo.COLUMNS.TYPE.name())); 
			eventCRecvBPo.setYear(dataObject.getString(EventCRecvBPo.COLUMNS.YEAR.name())); 
			eventCRecvBPo.setCountrycode(dataObject.getString(EventCRecvBPo.COLUMNS.COUNTRYCODE.name())); 
			eventCRecvBPo.setExchangeagency(dataObject.getString(EventCRecvBPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCRecvBPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvBPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCRecvBPo.setGoodtotalpackageyear(dataObject.getString(EventCRecvBPo.COLUMNS.GOODTOTALPACKAGEYEAR.name())); 
			eventCRecvBPo.setGoodtotalpackageno(dataObject.getString(EventCRecvBPo.COLUMNS.GOODTOTALPACKAGENO.name())); 
			eventCRecvBPo.setBagno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvBPo.COLUMNS.BAGNO.name()))); 
			eventCRecvBPo.setLastmark(dataObject.getString(EventCRecvBPo.COLUMNS.LASTMARK.name())); 
			eventCRecvBPo.setPageno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvBPo.COLUMNS.PAGENO.name()))); 
			eventCRecvBPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvBPo.COLUMNS.QTY.name()))); 
			eventCRecvBPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvBPo.COLUMNS.WEIGHT.name()))); 
			eventCRecvBPo.setSealdatetime(dataObject.getString(EventCRecvBPo.COLUMNS.SEALDATETIME.name())); 
			eventCRecvBPo.setUpu(dataObject.getString(EventCRecvBPo.COLUMNS.UPU.name())); 
			eventCRecvBPo.setFilename(dataObject.getString(EventCRecvBPo.COLUMNS.FILENAME.name())); 
			return eventCRecvBPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCRecvBPo eventCRecvBPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCRecvBPo.getPostspecialaccount()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.POSTTYPE.name(), eventCRecvBPo.getPosttype()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.TYPE.name(), eventCRecvBPo.getType()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.YEAR.name(), eventCRecvBPo.getYear()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.COUNTRYCODE.name(), eventCRecvBPo.getCountrycode()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.EXCHANGEAGENCY.name(), eventCRecvBPo.getExchangeagency()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.TOTALPACKAGENO.name(), eventCRecvBPo.getTotalpackageno()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.GOODTOTALPACKAGEYEAR.name(), eventCRecvBPo.getGoodtotalpackageyear()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.GOODTOTALPACKAGENO.name(), eventCRecvBPo.getGoodtotalpackageno()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.BAGNO.name(), eventCRecvBPo.getBagno()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.LASTMARK.name(), eventCRecvBPo.getLastmark()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.PAGENO.name(), eventCRecvBPo.getPageno()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.QTY.name(), eventCRecvBPo.getQty()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.WEIGHT.name(), eventCRecvBPo.getWeight()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.SEALDATETIME.name(), eventCRecvBPo.getSealdatetime()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.UPU.name(), eventCRecvBPo.getUpu()); 
			dataObject.setValue(EventCRecvBPo.COLUMNS.FILENAME.name(), eventCRecvBPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCRecvBPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCRecvBPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
