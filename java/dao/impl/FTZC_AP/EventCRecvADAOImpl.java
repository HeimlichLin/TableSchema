package com.doc.common.dao.impl; 
 
public class EventCRecvADAOImpl extends GeneralDAOImpl<EventCRecvAPo> implements EventCRecvADAO { 
	public static final EventCRecvADAOImpl INSTANCE = new EventCRecvADAOImpl(); 
	public static final String TABLENAME = "EVENT_C_RECV_A"; 

	public EventCRecvADAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCRecvAPo> CONVERTER = new MapConverter<EventCRecvAPo>() { 
 
		@Override 
		public EventCRecvAPo convert(final DataObject dataObject) { 
			final EventCRecvAPo eventCRecvAPo = new EventCRecvAPo(); 
			eventCRecvAPo.setPostspecialaccount(dataObject.getString(EventCRecvAPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			eventCRecvAPo.setPosttype(dataObject.getString(EventCRecvAPo.COLUMNS.POSTTYPE.name())); 
			eventCRecvAPo.setType(dataObject.getString(EventCRecvAPo.COLUMNS.TYPE.name())); 
			eventCRecvAPo.setYear(dataObject.getString(EventCRecvAPo.COLUMNS.YEAR.name())); 
			eventCRecvAPo.setCountrycode(dataObject.getString(EventCRecvAPo.COLUMNS.COUNTRYCODE.name())); 
			eventCRecvAPo.setExchangeagency(dataObject.getString(EventCRecvAPo.COLUMNS.EXCHANGEAGENCY.name())); 
			eventCRecvAPo.setTotalpackageno(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvAPo.COLUMNS.TOTALPACKAGENO.name()))); 
			eventCRecvAPo.setPostmblno(dataObject.getString(EventCRecvAPo.COLUMNS.POSTMBLNO.name())); 
			eventCRecvAPo.setSealdatetime(dataObject.getString(EventCRecvAPo.COLUMNS.SEALDATETIME.name())); 
			eventCRecvAPo.setTotalqty(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvAPo.COLUMNS.TOTALQTY.name()))); 
			eventCRecvAPo.setTotalpagecount(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvAPo.COLUMNS.TOTALPAGECOUNT.name()))); 
			eventCRecvAPo.setTotalbagnumber(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvAPo.COLUMNS.TOTALBAGNUMBER.name()))); 
			eventCRecvAPo.setTotalweight(BigDecimalUtils.formObj(dataObject.getValue(EventCRecvAPo.COLUMNS.TOTALWEIGHT.name()))); 
			eventCRecvAPo.setFilename(dataObject.getString(EventCRecvAPo.COLUMNS.FILENAME.name())); 
			eventCRecvAPo.setGoodtotalpackageyear(dataObject.getString(EventCRecvAPo.COLUMNS.GOODTOTALPACKAGEYEAR.name())); 
			eventCRecvAPo.setGoodtotalpackageno(dataObject.getString(EventCRecvAPo.COLUMNS.GOODTOTALPACKAGENO.name())); 
			eventCRecvAPo.setOldfilename(dataObject.getString(EventCRecvAPo.COLUMNS.OLDFILENAME.name())); 
			eventCRecvAPo.setTakeoffflight(dataObject.getString(EventCRecvAPo.COLUMNS.TAKEOFFFLIGHT.name())); 
			eventCRecvAPo.setSendtime(dataObject.getString(EventCRecvAPo.COLUMNS.SENDTIME.name())); 
			eventCRecvAPo.setArrivaltime(dataObject.getString(EventCRecvAPo.COLUMNS.ARRIVALTIME.name())); 
			eventCRecvAPo.setCreatetime(dataObject.getString(EventCRecvAPo.COLUMNS.CREATETIME.name())); 
			return eventCRecvAPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCRecvAPo eventCRecvAPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.POSTSPECIALACCOUNT.name(), eventCRecvAPo.getPostspecialaccount()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.POSTTYPE.name(), eventCRecvAPo.getPosttype()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TYPE.name(), eventCRecvAPo.getType()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.YEAR.name(), eventCRecvAPo.getYear()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.COUNTRYCODE.name(), eventCRecvAPo.getCountrycode()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.EXCHANGEAGENCY.name(), eventCRecvAPo.getExchangeagency()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TOTALPACKAGENO.name(), eventCRecvAPo.getTotalpackageno()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.POSTMBLNO.name(), eventCRecvAPo.getPostmblno()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.SEALDATETIME.name(), eventCRecvAPo.getSealdatetime()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TOTALQTY.name(), eventCRecvAPo.getTotalqty()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TOTALPAGECOUNT.name(), eventCRecvAPo.getTotalpagecount()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TOTALBAGNUMBER.name(), eventCRecvAPo.getTotalbagnumber()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TOTALWEIGHT.name(), eventCRecvAPo.getTotalweight()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.FILENAME.name(), eventCRecvAPo.getFilename()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.GOODTOTALPACKAGEYEAR.name(), eventCRecvAPo.getGoodtotalpackageyear()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.GOODTOTALPACKAGENO.name(), eventCRecvAPo.getGoodtotalpackageno()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.OLDFILENAME.name(), eventCRecvAPo.getOldfilename()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.TAKEOFFFLIGHT.name(), eventCRecvAPo.getTakeoffflight()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.SENDTIME.name(), eventCRecvAPo.getSendtime()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.ARRIVALTIME.name(), eventCRecvAPo.getArrivaltime()); 
			dataObject.setValue(EventCRecvAPo.COLUMNS.CREATETIME.name(), eventCRecvAPo.getCreatetime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCRecvAPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCRecvAPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
