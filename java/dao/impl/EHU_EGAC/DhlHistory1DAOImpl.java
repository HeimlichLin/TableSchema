package com.doc.common.dao.impl; 
 
public class DhlHistory1DAOImpl extends GeneralDAOImpl<DhlHistory1Po> implements DhlHistory1DAO { 
	public static final DhlHistory1DAOImpl INSTANCE = new DhlHistory1DAOImpl(); 
	public static final String TABLENAME = "DHL_HISTORY_1"; 

	public DhlHistory1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlHistory1Po> CONVERTER = new MapConverter<DhlHistory1Po>() { 
 
		@Override 
		public DhlHistory1Po convert(final DataObject dataObject) { 
			final DhlHistory1Po dhlHistory1Po = new DhlHistory1Po(); 
			dhlHistory1Po.setMwb(dataObject.getString(DhlHistory1Po.COLUMNS.MWB.name())); 
			dhlHistory1Po.setHwb(dataObject.getString(DhlHistory1Po.COLUMNS.HWB.name())); 
			dhlHistory1Po.setFtpdate(TimestampUtils.of(dataObject.getValue(DhlHistory1Po.COLUMNS.FTPDATE.name()))); 
			dhlHistory1Po.setFtptype(dataObject.getString(DhlHistory1Po.COLUMNS.FTPTYPE.name())); 
			return dhlHistory1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlHistory1Po dhlHistory1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlHistory1Po.COLUMNS.MWB.name(), dhlHistory1Po.getMwb()); 
			dataObject.setValue(DhlHistory1Po.COLUMNS.HWB.name(), dhlHistory1Po.getHwb()); 
			dataObject.setValue(DhlHistory1Po.COLUMNS.FTPDATE.name(), dhlHistory1Po.getFtpdate()); 
			dataObject.setValue(DhlHistory1Po.COLUMNS.FTPTYPE.name(), dhlHistory1Po.getFtptype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlHistory1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlHistory1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
