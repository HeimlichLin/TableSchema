package com.doc.common.dao.impl; 
 
public class UlditemsDAOImpl extends GeneralDAOImpl<UlditemsPo> implements UlditemsDAO { 
	public static final UlditemsDAOImpl INSTANCE = new UlditemsDAOImpl(); 
	public static final String TABLENAME = "ULDITEMS"; 

	public UlditemsDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UlditemsPo> CONVERTER = new MapConverter<UlditemsPo>() { 
 
		@Override 
		public UlditemsPo convert(final DataObject dataObject) { 
			final UlditemsPo ulditemsPo = new UlditemsPo(); 
			ulditemsPo.setMwb(dataObject.getString(UlditemsPo.COLUMNS.MWB.name())); 
			ulditemsPo.setHwb(dataObject.getString(UlditemsPo.COLUMNS.HWB.name())); 
			ulditemsPo.setGcipiece(BigDecimalUtils.formObj(dataObject.getValue(UlditemsPo.COLUMNS.GCIPIECE.name()))); 
			ulditemsPo.setGcopiece(BigDecimalUtils.formObj(dataObject.getValue(UlditemsPo.COLUMNS.GCOPIECE.name()))); 
			ulditemsPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(UlditemsPo.COLUMNS.GCIWEIGHT.name()))); 
			ulditemsPo.setWeight(BigDecimalUtils.formObj(dataObject.getValue(UlditemsPo.COLUMNS.WEIGHT.name()))); 
			ulditemsPo.setFlightdest(dataObject.getString(UlditemsPo.COLUMNS.FLIGHTDEST.name())); 
			ulditemsPo.setFlightno(dataObject.getString(UlditemsPo.COLUMNS.FLIGHTNO.name())); 
			ulditemsPo.setFlightdate(TimestampUtils.of(dataObject.getValue(UlditemsPo.COLUMNS.FLIGHTDATE.name()))); 
			ulditemsPo.setContainer(dataObject.getString(UlditemsPo.COLUMNS.CONTAINER.name())); 
			ulditemsPo.setRemark(dataObject.getString(UlditemsPo.COLUMNS.REMARK.name())); 
			return ulditemsPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UlditemsPo ulditemsPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UlditemsPo.COLUMNS.MWB.name(), ulditemsPo.getMwb()); 
			dataObject.setValue(UlditemsPo.COLUMNS.HWB.name(), ulditemsPo.getHwb()); 
			dataObject.setValue(UlditemsPo.COLUMNS.GCIPIECE.name(), ulditemsPo.getGcipiece()); 
			dataObject.setValue(UlditemsPo.COLUMNS.GCOPIECE.name(), ulditemsPo.getGcopiece()); 
			dataObject.setValue(UlditemsPo.COLUMNS.GCIWEIGHT.name(), ulditemsPo.getGciweight()); 
			dataObject.setValue(UlditemsPo.COLUMNS.WEIGHT.name(), ulditemsPo.getWeight()); 
			dataObject.setValue(UlditemsPo.COLUMNS.FLIGHTDEST.name(), ulditemsPo.getFlightdest()); 
			dataObject.setValue(UlditemsPo.COLUMNS.FLIGHTNO.name(), ulditemsPo.getFlightno()); 
			dataObject.setValue(UlditemsPo.COLUMNS.FLIGHTDATE.name(), ulditemsPo.getFlightdate()); 
			dataObject.setValue(UlditemsPo.COLUMNS.CONTAINER.name(), ulditemsPo.getContainer()); 
			dataObject.setValue(UlditemsPo.COLUMNS.REMARK.name(), ulditemsPo.getRemark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UlditemsPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UlditemsPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
