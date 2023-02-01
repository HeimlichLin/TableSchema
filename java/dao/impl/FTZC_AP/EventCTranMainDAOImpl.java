package com.doc.common.dao.impl; 
 
public class EventCTranMainDAOImpl extends GeneralDAOImpl<EventCTranMainPo> implements EventCTranMainDAO { 
	public static final EventCTranMainDAOImpl INSTANCE = new EventCTranMainDAOImpl(); 
	public static final String TABLENAME = "EVENT_C_TRAN_MAIN"; 

	public EventCTranMainDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<EventCTranMainPo> CONVERTER = new MapConverter<EventCTranMainPo>() { 
 
		@Override 
		public EventCTranMainPo convert(final DataObject dataObject) { 
			final EventCTranMainPo eventCTranMainPo = new EventCTranMainPo(); 
			eventCTranMainPo.setFilename(dataObject.getString(EventCTranMainPo.COLUMNS.FILENAME.name())); 
			eventCTranMainPo.setSendflag(dataObject.getString(EventCTranMainPo.COLUMNS.SENDFLAG.name())); 
			eventCTranMainPo.setSendTime(dataObject.getString(EventCTranMainPo.COLUMNS.SEND_TIME.name())); 
			return eventCTranMainPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final EventCTranMainPo eventCTranMainPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(EventCTranMainPo.COLUMNS.FILENAME.name(), eventCTranMainPo.getFilename()); 
			dataObject.setValue(EventCTranMainPo.COLUMNS.SENDFLAG.name(), eventCTranMainPo.getSendflag()); 
			dataObject.setValue(EventCTranMainPo.COLUMNS.SEND_TIME.name(), eventCTranMainPo.getSendTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<EventCTranMainPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(EventCTranMainPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(EventCTranMainPo.COLUMNS.FILENAME.name(), po.getFilename()); 
		return sqlWhere; 
	} 
 
} 
