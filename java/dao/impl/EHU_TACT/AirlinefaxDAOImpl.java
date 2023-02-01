package com.doc.common.dao.impl; 
 
public class AirlinefaxDAOImpl extends GeneralDAOImpl<AirlinefaxPo> implements AirlinefaxDAO { 
	public static final AirlinefaxDAOImpl INSTANCE = new AirlinefaxDAOImpl(); 
	public static final String TABLENAME = "AIRLINEFAX"; 

	public AirlinefaxDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<AirlinefaxPo> CONVERTER = new MapConverter<AirlinefaxPo>() { 
 
		@Override 
		public AirlinefaxPo convert(final DataObject dataObject) { 
			final AirlinefaxPo airlinefaxPo = new AirlinefaxPo(); 
			airlinefaxPo.setSerial(BigDecimalUtils.formObj(dataObject.getValue(AirlinefaxPo.COLUMNS.SERIAL.name()))); 
			airlinefaxPo.setAirlineid(dataObject.getString(AirlinefaxPo.COLUMNS.AIRLINEID.name())); 
			airlinefaxPo.setName(dataObject.getString(AirlinefaxPo.COLUMNS.NAME.name())); 
			airlinefaxPo.setFax(dataObject.getString(AirlinefaxPo.COLUMNS.FAX.name())); 
			airlinefaxPo.setUserid(dataObject.getString(AirlinefaxPo.COLUMNS.USERID.name())); 
			airlinefaxPo.setLastdate(TimestampUtils.of(dataObject.getValue(AirlinefaxPo.COLUMNS.LASTDATE.name()))); 
			return airlinefaxPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final AirlinefaxPo airlinefaxPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.SERIAL.name(), airlinefaxPo.getSerial()); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.AIRLINEID.name(), airlinefaxPo.getAirlineid()); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.NAME.name(), airlinefaxPo.getName()); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.FAX.name(), airlinefaxPo.getFax()); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.USERID.name(), airlinefaxPo.getUserid()); 
			dataObject.setValue(AirlinefaxPo.COLUMNS.LASTDATE.name(), airlinefaxPo.getLastdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<AirlinefaxPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(AirlinefaxPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
