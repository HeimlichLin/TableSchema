package com.doc.common.dao.impl; 
 
public class DutydownloadlogDAOImpl extends GeneralDAOImpl<DutydownloadlogPo> implements DutydownloadlogDAO { 
	public static final DutydownloadlogDAOImpl INSTANCE = new DutydownloadlogDAOImpl(); 
	public static final String TABLENAME = "DUTYDOWNLOADLOG"; 

	public DutydownloadlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DutydownloadlogPo> CONVERTER = new MapConverter<DutydownloadlogPo>() { 
 
		@Override 
		public DutydownloadlogPo convert(final DataObject dataObject) { 
			final DutydownloadlogPo dutydownloadlogPo = new DutydownloadlogPo(); 
			dutydownloadlogPo.setDutyno(dataObject.getString(DutydownloadlogPo.COLUMNS.DUTYNO.name())); 
			dutydownloadlogPo.setDeclno(dataObject.getString(DutydownloadlogPo.COLUMNS.DECLNO.name())); 
			dutydownloadlogPo.setMwb(dataObject.getString(DutydownloadlogPo.COLUMNS.MWB.name())); 
			dutydownloadlogPo.setHwb(dataObject.getString(DutydownloadlogPo.COLUMNS.HWB.name())); 
			dutydownloadlogPo.setDownloaddate(TimestampUtils.of(dataObject.getValue(DutydownloadlogPo.COLUMNS.DOWNLOADDATE.name()))); 
			dutydownloadlogPo.setWdate(TimestampUtils.of(dataObject.getValue(DutydownloadlogPo.COLUMNS.WDATE.name()))); 
			dutydownloadlogPo.setDlip(dataObject.getString(DutydownloadlogPo.COLUMNS.DLIP.name())); 
			return dutydownloadlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DutydownloadlogPo dutydownloadlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.DUTYNO.name(), dutydownloadlogPo.getDutyno()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.DECLNO.name(), dutydownloadlogPo.getDeclno()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.MWB.name(), dutydownloadlogPo.getMwb()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.HWB.name(), dutydownloadlogPo.getHwb()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.DOWNLOADDATE.name(), dutydownloadlogPo.getDownloaddate()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.WDATE.name(), dutydownloadlogPo.getWdate()); 
			dataObject.setValue(DutydownloadlogPo.COLUMNS.DLIP.name(), dutydownloadlogPo.getDlip()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DutydownloadlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DutydownloadlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
