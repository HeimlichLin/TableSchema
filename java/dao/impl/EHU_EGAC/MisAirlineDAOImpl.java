package com.doc.common.dao.impl; 
 
public class MisAirlineDAOImpl extends GeneralDAOImpl<MisAirlinePo> implements MisAirlineDAO { 
	public static final MisAirlineDAOImpl INSTANCE = new MisAirlineDAOImpl(); 
	public static final String TABLENAME = "MIS_AIRLINE"; 

	public MisAirlineDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisAirlinePo> CONVERTER = new MapConverter<MisAirlinePo>() { 
 
		@Override 
		public MisAirlinePo convert(final DataObject dataObject) { 
			final MisAirlinePo misAirlinePo = new MisAirlinePo(); 
			misAirlinePo.setAirlineid(dataObject.getString(MisAirlinePo.COLUMNS.AIRLINEID.name())); 
			misAirlinePo.setAirlinecname(dataObject.getString(MisAirlinePo.COLUMNS.AIRLINECNAME.name())); 
			misAirlinePo.setAirlineename(dataObject.getString(MisAirlinePo.COLUMNS.AIRLINEENAME.name())); 
			misAirlinePo.setAirlinesname(dataObject.getString(MisAirlinePo.COLUMNS.AIRLINESNAME.name())); 
			return misAirlinePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisAirlinePo misAirlinePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisAirlinePo.COLUMNS.AIRLINEID.name(), misAirlinePo.getAirlineid()); 
			dataObject.setValue(MisAirlinePo.COLUMNS.AIRLINECNAME.name(), misAirlinePo.getAirlinecname()); 
			dataObject.setValue(MisAirlinePo.COLUMNS.AIRLINEENAME.name(), misAirlinePo.getAirlineename()); 
			dataObject.setValue(MisAirlinePo.COLUMNS.AIRLINESNAME.name(), misAirlinePo.getAirlinesname()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisAirlinePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisAirlinePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
