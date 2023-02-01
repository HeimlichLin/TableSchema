package com.doc.common.dao.impl; 
 
public class ObculdDAOImpl extends GeneralDAOImpl<ObculdPo> implements ObculdDAO { 
	public static final ObculdDAOImpl INSTANCE = new ObculdDAOImpl(); 
	public static final String TABLENAME = "OBCULD"; 

	public ObculdDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ObculdPo> CONVERTER = new MapConverter<ObculdPo>() { 
 
		@Override 
		public ObculdPo convert(final DataObject dataObject) { 
			final ObculdPo obculdPo = new ObculdPo(); 
			obculdPo.setFlightno(dataObject.getString(ObculdPo.COLUMNS.FLIGHTNO.name())); 
			obculdPo.setFlightdate(TimestampUtils.of(dataObject.getValue(ObculdPo.COLUMNS.FLIGHTDATE.name()))); 
			obculdPo.setFlightdest(dataObject.getString(ObculdPo.COLUMNS.FLIGHTDEST.name())); 
			obculdPo.setObcmawb(dataObject.getString(ObculdPo.COLUMNS.OBCMAWB.name())); 
			obculdPo.setContainer(dataObject.getString(ObculdPo.COLUMNS.CONTAINER.name())); 
			obculdPo.setUserid(dataObject.getString(ObculdPo.COLUMNS.USERID.name())); 
			obculdPo.setObcdate(TimestampUtils.of(dataObject.getValue(ObculdPo.COLUMNS.OBCDATE.name()))); 
			obculdPo.setWorkarea(dataObject.getString(ObculdPo.COLUMNS.WORKAREA.name())); 
			obculdPo.setUldflag(TimestampUtils.of(dataObject.getValue(ObculdPo.COLUMNS.ULDFLAG.name()))); 
			obculdPo.setPiece(dataObject.getString(ObculdPo.COLUMNS.PIECE.name())); 
			return obculdPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ObculdPo obculdPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ObculdPo.COLUMNS.FLIGHTNO.name(), obculdPo.getFlightno()); 
			dataObject.setValue(ObculdPo.COLUMNS.FLIGHTDATE.name(), obculdPo.getFlightdate()); 
			dataObject.setValue(ObculdPo.COLUMNS.FLIGHTDEST.name(), obculdPo.getFlightdest()); 
			dataObject.setValue(ObculdPo.COLUMNS.OBCMAWB.name(), obculdPo.getObcmawb()); 
			dataObject.setValue(ObculdPo.COLUMNS.CONTAINER.name(), obculdPo.getContainer()); 
			dataObject.setValue(ObculdPo.COLUMNS.USERID.name(), obculdPo.getUserid()); 
			dataObject.setValue(ObculdPo.COLUMNS.OBCDATE.name(), obculdPo.getObcdate()); 
			dataObject.setValue(ObculdPo.COLUMNS.WORKAREA.name(), obculdPo.getWorkarea()); 
			dataObject.setValue(ObculdPo.COLUMNS.ULDFLAG.name(), obculdPo.getUldflag()); 
			dataObject.setValue(ObculdPo.COLUMNS.PIECE.name(), obculdPo.getPiece()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ObculdPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ObculdPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
