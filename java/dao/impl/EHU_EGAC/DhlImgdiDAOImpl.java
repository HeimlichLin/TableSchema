package com.doc.common.dao.impl; 
 
public class DhlImgdiDAOImpl extends GeneralDAOImpl<DhlImgdiPo> implements DhlImgdiDAO { 
	public static final DhlImgdiDAOImpl INSTANCE = new DhlImgdiDAOImpl(); 
	public static final String TABLENAME = "DHL_IMGDI"; 

	public DhlImgdiDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImgdiPo> CONVERTER = new MapConverter<DhlImgdiPo>() { 
 
		@Override 
		public DhlImgdiPo convert(final DataObject dataObject) { 
			final DhlImgdiPo dhlImgdiPo = new DhlImgdiPo(); 
			dhlImgdiPo.setMwb(dataObject.getString(DhlImgdiPo.COLUMNS.MWB.name())); 
			dhlImgdiPo.setHwb(dataObject.getString(DhlImgdiPo.COLUMNS.HWB.name())); 
			dhlImgdiPo.setWarehouse(dataObject.getString(DhlImgdiPo.COLUMNS.WAREHOUSE.name())); 
			dhlImgdiPo.setServiceCenter(dataObject.getString(DhlImgdiPo.COLUMNS.SERVICE_CENTER.name())); 
			dhlImgdiPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DhlImgdiPo.COLUMNS.LASTUPDATE.name()))); 
			return dhlImgdiPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImgdiPo dhlImgdiPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImgdiPo.COLUMNS.MWB.name(), dhlImgdiPo.getMwb()); 
			dataObject.setValue(DhlImgdiPo.COLUMNS.HWB.name(), dhlImgdiPo.getHwb()); 
			dataObject.setValue(DhlImgdiPo.COLUMNS.WAREHOUSE.name(), dhlImgdiPo.getWarehouse()); 
			dataObject.setValue(DhlImgdiPo.COLUMNS.SERVICE_CENTER.name(), dhlImgdiPo.getServiceCenter()); 
			dataObject.setValue(DhlImgdiPo.COLUMNS.LASTUPDATE.name(), dhlImgdiPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImgdiPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImgdiPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
