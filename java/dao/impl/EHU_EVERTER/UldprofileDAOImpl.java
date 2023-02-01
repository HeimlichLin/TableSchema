package com.doc.common.dao.impl; 
 
public class UldprofileDAOImpl extends GeneralDAOImpl<UldprofilePo> implements UldprofileDAO { 
	public static final UldprofileDAOImpl INSTANCE = new UldprofileDAOImpl(); 
	public static final String TABLENAME = "ULDPROFILE"; 

	public UldprofileDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UldprofilePo> CONVERTER = new MapConverter<UldprofilePo>() { 
 
		@Override 
		public UldprofilePo convert(final DataObject dataObject) { 
			final UldprofilePo uldprofilePo = new UldprofilePo(); 
			uldprofilePo.setUldno(dataObject.getString(UldprofilePo.COLUMNS.ULDNO.name())); 
			uldprofilePo.setFlightno(dataObject.getString(UldprofilePo.COLUMNS.FLIGHTNO.name())); 
			uldprofilePo.setFlightdate(TimestampUtils.of(dataObject.getValue(UldprofilePo.COLUMNS.FLIGHTDATE.name()))); 
			uldprofilePo.setIe(dataObject.getString(UldprofilePo.COLUMNS.IE.name())); 
			uldprofilePo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(UldprofilePo.COLUMNS.WEIGHT.name()))); 
			uldprofilePo.setBagunit(BigDecimalUtils.formObj(dataObject.getValue(UldprofilePo.COLUMNS.BAGUNIT.name()))); 
			uldprofilePo.setHwbunit(BigDecimalUtils.formObj(dataObject.getValue(UldprofilePo.COLUMNS.HWBUNIT.name()))); 
			uldprofilePo.setBagpiece(BigDecimalUtils.formObj(dataObject.getValue(UldprofilePo.COLUMNS.BAGPIECE.name()))); 
			uldprofilePo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(UldprofilePo.COLUMNS.HWBPIECE.name()))); 
			uldprofilePo.setStarttime(TimestampUtils.of(dataObject.getValue(UldprofilePo.COLUMNS.STARTTIME.name()))); 
			uldprofilePo.setEndtime(TimestampUtils.of(dataObject.getValue(UldprofilePo.COLUMNS.ENDTIME.name()))); 
			return uldprofilePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UldprofilePo uldprofilePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UldprofilePo.COLUMNS.ULDNO.name(), uldprofilePo.getUldno()); 
			dataObject.setValue(UldprofilePo.COLUMNS.FLIGHTNO.name(), uldprofilePo.getFlightno()); 
			dataObject.setValue(UldprofilePo.COLUMNS.FLIGHTDATE.name(), uldprofilePo.getFlightdate()); 
			dataObject.setValue(UldprofilePo.COLUMNS.IE.name(), uldprofilePo.getIe()); 
			dataObject.setValue(UldprofilePo.COLUMNS.WEIGHT.name(), uldprofilePo.getWeight()); 
			dataObject.setValue(UldprofilePo.COLUMNS.BAGUNIT.name(), uldprofilePo.getBagunit()); 
			dataObject.setValue(UldprofilePo.COLUMNS.HWBUNIT.name(), uldprofilePo.getHwbunit()); 
			dataObject.setValue(UldprofilePo.COLUMNS.BAGPIECE.name(), uldprofilePo.getBagpiece()); 
			dataObject.setValue(UldprofilePo.COLUMNS.HWBPIECE.name(), uldprofilePo.getHwbpiece()); 
			dataObject.setValue(UldprofilePo.COLUMNS.STARTTIME.name(), uldprofilePo.getStarttime()); 
			dataObject.setValue(UldprofilePo.COLUMNS.ENDTIME.name(), uldprofilePo.getEndtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UldprofilePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UldprofilePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
