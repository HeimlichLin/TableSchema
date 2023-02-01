package com.doc.common.dao.impl; 
 
public class AirlineDAOImpl extends GeneralDAOImpl<AirlinePo> implements AirlineDAO { 
	public static final AirlineDAOImpl INSTANCE = new AirlineDAOImpl(); 
	public static final String TABLENAME = "AIRLINE"; 

	public AirlineDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AirlinePo> CONVERTER = new MapConverter<AirlinePo>() { 
 
		@Override 
		public AirlinePo convert(final DataObject dataObject) { 
			final AirlinePo airlinePo = new AirlinePo(); 
			airlinePo.setAirlineid(dataObject.getString(AirlinePo.COLUMNS.AIRLINEID.name())); 
			airlinePo.setAirlinecname(dataObject.getString(AirlinePo.COLUMNS.AIRLINECNAME.name())); 
			airlinePo.setAirlineename(dataObject.getString(AirlinePo.COLUMNS.AIRLINEENAME.name())); 
			airlinePo.setAirlinesname(dataObject.getString(AirlinePo.COLUMNS.AIRLINESNAME.name())); 
			return airlinePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AirlinePo airlinePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINEID.name(), airlinePo.getAirlineid()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINECNAME.name(), airlinePo.getAirlinecname()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINEENAME.name(), airlinePo.getAirlineename()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINESNAME.name(), airlinePo.getAirlinesname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AirlinePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AirlinePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
