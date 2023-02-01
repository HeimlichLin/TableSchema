package com.doc.common.dao.impl; 
 
public class DutytransDAOImpl extends GeneralDAOImpl<DutytransPo> implements DutytransDAO { 
	public static final DutytransDAOImpl INSTANCE = new DutytransDAOImpl(); 
	public static final String TABLENAME = "DUTYTRANS"; 

	public DutytransDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DutytransPo> CONVERTER = new MapConverter<DutytransPo>() { 
 
		@Override 
		public DutytransPo convert(final DataObject dataObject) { 
			final DutytransPo dutytransPo = new DutytransPo(); 
			dutytransPo.setDutyno(dataObject.getString(DutytransPo.COLUMNS.DUTYNO.name())); 
			dutytransPo.setMwb(dataObject.getString(DutytransPo.COLUMNS.MWB.name())); 
			dutytransPo.setHwb(dataObject.getString(DutytransPo.COLUMNS.HWB.name())); 
			dutytransPo.setTranstime(TimestampUtils.of(dataObject.getValue(DutytransPo.COLUMNS.TRANSTIME.name()))); 
			dutytransPo.setFtptime(TimestampUtils.of(dataObject.getValue(DutytransPo.COLUMNS.FTPTIME.name()))); 
			return dutytransPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DutytransPo dutytransPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DutytransPo.COLUMNS.DUTYNO.name(), dutytransPo.getDutyno()); 
			dataObject.setValue(DutytransPo.COLUMNS.MWB.name(), dutytransPo.getMwb()); 
			dataObject.setValue(DutytransPo.COLUMNS.HWB.name(), dutytransPo.getHwb()); 
			dataObject.setValue(DutytransPo.COLUMNS.TRANSTIME.name(), dutytransPo.getTranstime()); 
			dataObject.setValue(DutytransPo.COLUMNS.FTPTIME.name(), dutytransPo.getFtptime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DutytransPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DutytransPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
