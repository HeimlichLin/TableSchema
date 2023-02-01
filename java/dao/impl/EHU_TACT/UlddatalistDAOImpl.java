package com.doc.common.dao.impl; 
 
public class UlddatalistDAOImpl extends GeneralDAOImpl<UlddatalistPo> implements UlddatalistDAO { 
	public static final UlddatalistDAOImpl INSTANCE = new UlddatalistDAOImpl(); 
	public static final String TABLENAME = "ULDDATALIST"; 

	public UlddatalistDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<UlddatalistPo> CONVERTER = new MapConverter<UlddatalistPo>() { 
 
		@Override 
		public UlddatalistPo convert(final DataObject dataObject) { 
			final UlddatalistPo ulddatalistPo = new UlddatalistPo(); 
			ulddatalistPo.setContainer(dataObject.getString(UlddatalistPo.COLUMNS.CONTAINER.name())); 
			ulddatalistPo.setFlightno(dataObject.getString(UlddatalistPo.COLUMNS.FLIGHTNO.name())); 
			ulddatalistPo.setFlightdest(dataObject.getString(UlddatalistPo.COLUMNS.FLIGHTDEST.name())); 
			ulddatalistPo.setFlightdate(TimestampUtils.of(dataObject.getValue(UlddatalistPo.COLUMNS.FLIGHTDATE.name()))); 
			ulddatalistPo.setMwb(dataObject.getString(UlddatalistPo.COLUMNS.MWB.name())); 
			ulddatalistPo.setHwbpiece(BigDecimalUtils.formObj(dataObject.getValue(UlddatalistPo.COLUMNS.HWBPIECE.name()))); 
			ulddatalistPo.setGciweight(BigDecimalUtils.formObj(dataObject.getValue(UlddatalistPo.COLUMNS.GCIWEIGHT.name()))); 
			ulddatalistPo.setRemark(dataObject.getString(UlddatalistPo.COLUMNS.REMARK.name())); 
			ulddatalistPo.setCfflag(dataObject.getString(UlddatalistPo.COLUMNS.CFFLAG.name())); 
			return ulddatalistPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final UlddatalistPo ulddatalistPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(UlddatalistPo.COLUMNS.CONTAINER.name(), ulddatalistPo.getContainer()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.FLIGHTNO.name(), ulddatalistPo.getFlightno()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.FLIGHTDEST.name(), ulddatalistPo.getFlightdest()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.FLIGHTDATE.name(), ulddatalistPo.getFlightdate()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.MWB.name(), ulddatalistPo.getMwb()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.HWBPIECE.name(), ulddatalistPo.getHwbpiece()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.GCIWEIGHT.name(), ulddatalistPo.getGciweight()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.REMARK.name(), ulddatalistPo.getRemark()); 
			dataObject.setValue(UlddatalistPo.COLUMNS.CFFLAG.name(), ulddatalistPo.getCfflag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<UlddatalistPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(UlddatalistPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
