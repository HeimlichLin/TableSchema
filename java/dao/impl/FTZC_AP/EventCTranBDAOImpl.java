package com.doc.common.dao.impl; 
 
public class EventCTranBDAOImpl extends GeneralDAOImpl<EventCTranBPo> implements EventCTranBDAO { 
	public static final EventCTranBDAOImpl INSTANCE = new EventCTranBDAOImpl(); 
	public static final String TABLENAME = "EVENT_C_TRAN_B"; 

	public EventCTranBDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCTranBPo> CONVERTER = new MapConverter<EventCTranBPo>() { 
 
		@Override 
		public EventCTranBPo convert(final DataObject dataObject) { 
			final EventCTranBPo eventCTranBPo = new EventCTranBPo(); 
			eventCTranBPo.setPostspecialaccount(dataObject.getString(EventCTranBPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCTranBPo.setPosttype(dataObject.getString(EventCTranBPo.COLUMNS.POSTTYPE.name())); 
			eventCTranBPo.setType(dataObject.getString(EventCTranBPo.COLUMNS.TYPE.name())); 
			eventCTranBPo.setYear(dataObject.getString(EventCTranBPo.COLUMNS.YEAR.name())); 
			eventCTranBPo.setCountrycode(dataObject.getString(EventCTranBPo.COLUMNS.COUNTRYCODE.name())); 
			eventCTranBPo.setExchangeagency(dataObject.getString(EventCTranBPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCTranBPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranBPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCTranBPo.setBagno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranBPo.COLUMNS.BAGNO.name()))); 
			eventCTranBPo.setLastmark(dataObject.getString(EventCTranBPo.COLUMNS.LASTMARK.name())); 
			eventCTranBPo.setPageno(BigDecimalUtils.formObj(dataObject.getValue(EventCTranBPo.COLUMNS.PAGENO.name()))); 
			eventCTranBPo.setQty(BigDecimalUtils.formObj(dataObject.getValue(EventCTranBPo.COLUMNS.QTY.name()))); 
			eventCTranBPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(EventCTranBPo.COLUMNS.WEIGHT.name()))); 
			eventCTranBPo.setSealdatetime(dataObject.getString(EventCTranBPo.COLUMNS.SEALDATETIME.name())); 
			eventCTranBPo.setFilename(dataObject.getString(EventCTranBPo.COLUMNS.FILENAME.name())); 
			return eventCTranBPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCTranBPo eventCTranBPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCTranBPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCTranBPo.getPostspecialaccount()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.POSTTYPE.name(), eventCTranBPo.getPosttype()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.TYPE.name(), eventCTranBPo.getType()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.YEAR.name(), eventCTranBPo.getYear()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.COUNTRYCODE.name(), eventCTranBPo.getCountrycode()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.EXCHANGEAGENCY.name(), eventCTranBPo.getExchangeagency()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.TOTALPACKAGENO.name(), eventCTranBPo.getTotalpackageno()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.BAGNO.name(), eventCTranBPo.getBagno()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.LASTMARK.name(), eventCTranBPo.getLastmark()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.PAGENO.name(), eventCTranBPo.getPageno()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.QTY.name(), eventCTranBPo.getQty()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.WEIGHT.name(), eventCTranBPo.getWeight()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.SEALDATETIME.name(), eventCTranBPo.getSealdatetime()); 
			dataObject.setValue(EventCTranBPo.COLUMNS.FILENAME.name(), eventCTranBPo.getFilename()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCTranBPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCTranBPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
