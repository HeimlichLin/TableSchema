package com.doc.common.dao.impl; 
 
public class DhlImdtyDAOImpl extends GeneralDAOImpl<DhlImdtyPo> implements DhlImdtyDAO { 
	public static final DhlImdtyDAOImpl INSTANCE = new DhlImdtyDAOImpl(); 
	public static final String TABLENAME = "DHL_IMDTY"; 

	public DhlImdtyDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImdtyPo> CONVERTER = new MapConverter<DhlImdtyPo>() { 
 
		@Override 
		public DhlImdtyPo convert(final DataObject dataObject) { 
			final DhlImdtyPo dhlImdtyPo = new DhlImdtyPo(); 
			dhlImdtyPo.setMwb(dataObject.getString(DhlImdtyPo.COLUMNS.MWB.name())); 
			dhlImdtyPo.setHwb(dataObject.getString(DhlImdtyPo.COLUMNS.HWB.name())); 
			dhlImdtyPo.setDutyno(dataObject.getString(DhlImdtyPo.COLUMNS.DUTYNO.name())); 
			dhlImdtyPo.setDeclno(dataObject.getString(DhlImdtyPo.COLUMNS.DECLNO.name())); 
			dhlImdtyPo.setGcodate(TimestampUtils.of(dataObject.getValue(DhlImdtyPo.COLUMNS.GCODATE.name()))); 
			dhlImdtyPo.setWdate(TimestampUtils.of(dataObject.getValue(DhlImdtyPo.COLUMNS.WDATE.name()))); 
			dhlImdtyPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlImdtyPo.COLUMNS.FTPDATE.name()))); 
			dhlImdtyPo.setFtpfile(dataObject.getString(DhlImdtyPo.COLUMNS.FTPFILE.name())); 
			return dhlImdtyPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImdtyPo dhlImdtyPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.MWB.name(), dhlImdtyPo.getMwb()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.HWB.name(), dhlImdtyPo.getHwb()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.DUTYNO.name(), dhlImdtyPo.getDutyno()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.DECLNO.name(), dhlImdtyPo.getDeclno()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.GCODATE.name(), dhlImdtyPo.getGcodate()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.WDATE.name(), dhlImdtyPo.getWdate()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.FTPDATE.name(), dhlImdtyPo.getFtpdate()); 
			dataObject.setValue(DhlImdtyPo.COLUMNS.FTPFILE.name(), dhlImdtyPo.getFtpfile()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImdtyPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImdtyPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
