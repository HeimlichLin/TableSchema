package com.doc.common.dao.impl; 
 
public class DhlImgdiTempDAOImpl extends GeneralDAOImpl<DhlImgdiTempPo> implements DhlImgdiTempDAO { 
	public static final DhlImgdiTempDAOImpl INSTANCE = new DhlImgdiTempDAOImpl(); 
	public static final String TABLENAME = "DHL_IMGDI_TEMP"; 

	public DhlImgdiTempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DhlImgdiTempPo> CONVERTER = new MapConverter<DhlImgdiTempPo>() { 
 
		@Override 
		public DhlImgdiTempPo convert(final DataObject dataObject) { 
			final DhlImgdiTempPo dhlImgdiTempPo = new DhlImgdiTempPo(); 
			dhlImgdiTempPo.setMwb(dataObject.getString(DhlImgdiTempPo.COLUMNS.MWB.name())); 
			dhlImgdiTempPo.setHwb(dataObject.getString(DhlImgdiTempPo.COLUMNS.HWB.name())); 
			dhlImgdiTempPo.setWarehouse(dataObject.getString(DhlImgdiTempPo.COLUMNS.WAREHOUSE.name())); 
			dhlImgdiTempPo.setServiceCenter(dataObject.getString(DhlImgdiTempPo.COLUMNS.SERVICE_CENTER.name())); 
			return dhlImgdiTempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DhlImgdiTempPo dhlImgdiTempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DhlImgdiTempPo.COLUMNS.MWB.name(), dhlImgdiTempPo.getMwb()); 
			dataObject.setValue(DhlImgdiTempPo.COLUMNS.HWB.name(), dhlImgdiTempPo.getHwb()); 
			dataObject.setValue(DhlImgdiTempPo.COLUMNS.WAREHOUSE.name(), dhlImgdiTempPo.getWarehouse()); 
			dataObject.setValue(DhlImgdiTempPo.COLUMNS.SERVICE_CENTER.name(), dhlImgdiTempPo.getServiceCenter()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DhlImgdiTempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DhlImgdiTempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
