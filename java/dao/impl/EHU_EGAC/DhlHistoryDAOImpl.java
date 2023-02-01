package com.doc.common.dao.impl; 
 
public class DhlHistoryDAOImpl extends GeneralDAOImpl<DhlHistoryPo> implements DhlHistoryDAO { 
	public static final DhlHistoryDAOImpl INSTANCE = new DhlHistoryDAOImpl(); 
	public static final String TABLENAME = "DHL_HISTORY"; 

	public DhlHistoryDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlHistoryPo> CONVERTER = new MapConverter<DhlHistoryPo>() { 
 
		@Override 
		public DhlHistoryPo convert(final DataObject dataObject) { 
			final DhlHistoryPo dhlHistoryPo = new DhlHistoryPo(); 
			dhlHistoryPo.setMwb(dataObject.getString(DhlHistoryPo.COLUMNS.MWB.name())); 
			dhlHistoryPo.setHwb(dataObject.getString(DhlHistoryPo.COLUMNS.HWB.name())); 
			dhlHistoryPo.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlHistoryPo.COLUMNS.FTPDATE.name()))); 
			dhlHistoryPo.setFtptype(dataObject.getString(DhlHistoryPo.COLUMNS.FTPTYPE.name())); 
			return dhlHistoryPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlHistoryPo dhlHistoryPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlHistoryPo.COLUMNS.MWB.name(), dhlHistoryPo.getMwb()); 
			dataObject.setValue(DhlHistoryPo.COLUMNS.HWB.name(), dhlHistoryPo.getHwb()); 
			dataObject.setValue(DhlHistoryPo.COLUMNS.FTPDATE.name(), dhlHistoryPo.getFtpdate()); 
			dataObject.setValue(DhlHistoryPo.COLUMNS.FTPTYPE.name(), dhlHistoryPo.getFtptype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlHistoryPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlHistoryPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
