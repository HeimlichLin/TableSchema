package com.doc.common.dao.impl; 
 
public class ChinaFlightDAOImpl extends GeneralDAOImpl<ChinaFlightPo> implements ChinaFlightDAO { 
	public static final ChinaFlightDAOImpl INSTANCE = new ChinaFlightDAOImpl(); 
	public static final String TABLENAME = "CHINA_FLIGHT"; 

	public ChinaFlightDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ChinaFlightPo> CONVERTER = new MapConverter<ChinaFlightPo>() { 
 
		@Override 
		public ChinaFlightPo convert(final DataObject dataObject) { 
			final ChinaFlightPo chinaFlightPo = new ChinaFlightPo(); 
			chinaFlightPo.setIeType(dataObject.getString(ChinaFlightPo.COLUMNS.IE_TYPE.name())); 
			chinaFlightPo.setAirlineId(dataObject.getString(ChinaFlightPo.COLUMNS.AIRLINE_ID.name())); 
			chinaFlightPo.setFlightNo(dataObject.getString(ChinaFlightPo.COLUMNS.FLIGHT_NO.name())); 
			chinaFlightPo.setFlightDate(dataObject.getString(ChinaFlightPo.COLUMNS.FLIGHT_DATE.name())); 
			chinaFlightPo.setFlightDest(dataObject.getString(ChinaFlightPo.COLUMNS.FLIGHT_DEST.name())); 
			return chinaFlightPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ChinaFlightPo chinaFlightPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ChinaFlightPo.COLUMNS.IE_TYPE.name(), chinaFlightPo.getIeType()); 
			dataObject.setValue(ChinaFlightPo.COLUMNS.AIRLINE_ID.name(), chinaFlightPo.getAirlineId()); 
			dataObject.setValue(ChinaFlightPo.COLUMNS.FLIGHT_NO.name(), chinaFlightPo.getFlightNo()); 
			dataObject.setValue(ChinaFlightPo.COLUMNS.FLIGHT_DATE.name(), chinaFlightPo.getFlightDate()); 
			dataObject.setValue(ChinaFlightPo.COLUMNS.FLIGHT_DEST.name(), chinaFlightPo.getFlightDest()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ChinaFlightPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ChinaFlightPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(ChinaFlightPo.COLUMNS.IE_TYPE.name(), po.getIeType()); 
		sqlWhere.add(ChinaFlightPo.COLUMNS.AIRLINE_ID.name(), po.getAirlineId()); 
		sqlWhere.add(ChinaFlightPo.COLUMNS.FLIGHT_NO.name(), po.getFlightNo()); 
		sqlWhere.add(ChinaFlightPo.COLUMNS.FLIGHT_DATE.name(), po.getFlightDate()); 
		return sqlWhere; 
	} 
 
} 
