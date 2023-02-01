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
			airlinePo.setAid(dataObject.getString(AirlinePo.COLUMNS.AID.name())); 
			airlinePo.setFax(dataObject.getString(AirlinePo.COLUMNS.FAX.name())); 
			airlinePo.setMailname1(dataObject.getString(AirlinePo.COLUMNS.MAILNAME1.name())); 
			airlinePo.setMailadd1(dataObject.getString(AirlinePo.COLUMNS.MAILADD1.name())); 
			airlinePo.setMailname2(dataObject.getString(AirlinePo.COLUMNS.MAILNAME2.name())); 
			airlinePo.setMailadd2(dataObject.getString(AirlinePo.COLUMNS.MAILADD2.name())); 
			airlinePo.setUserid(dataObject.getString(AirlinePo.COLUMNS.USERID.name())); 
			airlinePo.setLastdate(TimestampUtils.of(dataObject.getValue(AirlinePo.COLUMNS.LASTDATE.name()))); 
			return airlinePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AirlinePo airlinePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINEID.name(), airlinePo.getAirlineid()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINECNAME.name(), airlinePo.getAirlinecname()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINEENAME.name(), airlinePo.getAirlineename()); 
			dataObject.setValue(AirlinePo.COLUMNS.AIRLINESNAME.name(), airlinePo.getAirlinesname()); 
			dataObject.setValue(AirlinePo.COLUMNS.AID.name(), airlinePo.getAid()); 
			dataObject.setValue(AirlinePo.COLUMNS.FAX.name(), airlinePo.getFax()); 
			dataObject.setValue(AirlinePo.COLUMNS.MAILNAME1.name(), airlinePo.getMailname1()); 
			dataObject.setValue(AirlinePo.COLUMNS.MAILADD1.name(), airlinePo.getMailadd1()); 
			dataObject.setValue(AirlinePo.COLUMNS.MAILNAME2.name(), airlinePo.getMailname2()); 
			dataObject.setValue(AirlinePo.COLUMNS.MAILADD2.name(), airlinePo.getMailadd2()); 
			dataObject.setValue(AirlinePo.COLUMNS.USERID.name(), airlinePo.getUserid()); 
			dataObject.setValue(AirlinePo.COLUMNS.LASTDATE.name(), airlinePo.getLastdate()); 
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
