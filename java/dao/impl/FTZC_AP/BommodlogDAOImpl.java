package com.doc.common.dao.impl; 
 
public class BommodlogDAOImpl extends GeneralDAOImpl<BommodlogPo> implements BommodlogDAO { 
	public static final BommodlogDAOImpl INSTANCE = new BommodlogDAOImpl(); 
	public static final String TABLENAME = "BOMMODLOG"; 

	public BommodlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<BommodlogPo> CONVERTER = new MapConverter<BommodlogPo>() { 
 
		@Override 
		public BommodlogPo convert(final DataObject dataObject) { 
			final BommodlogPo bommodlogPo = new BommodlogPo(); 
			bommodlogPo.setBfNo(dataObject.getString(BommodlogPo.COLUMNS.BF_NO.name())); 
			bommodlogPo.setBfBomNo(dataObject.getString(BommodlogPo.COLUMNS.BF_BOM_NO.name())); 
			bommodlogPo.setBomNo(dataObject.getString(BommodlogPo.COLUMNS.BOM_NO.name())); 
			bommodlogPo.setVer(dataObject.getString(BommodlogPo.COLUMNS.VER.name())); 
			bommodlogPo.setParent(dataObject.getString(BommodlogPo.COLUMNS.PARENT.name())); 
			bommodlogPo.setCommodityNo(dataObject.getString(BommodlogPo.COLUMNS.COMMODITY_NO.name())); 
			bommodlogPo.setCtmCode(dataObject.getString(BommodlogPo.COLUMNS.CTM_CODE.name())); 
			bommodlogPo.setBomDate(dataObject.getString(BommodlogPo.COLUMNS.BOM_DATE.name())); 
			bommodlogPo.setUserId(dataObject.getString(BommodlogPo.COLUMNS.USER_ID.name())); 
			bommodlogPo.setModTime(dataObject.getString(BommodlogPo.COLUMNS.MOD_TIME.name())); 
			bommodlogPo.setOriData(dataObject.getString(BommodlogPo.COLUMNS.ORI_DATA.name())); 
			bommodlogPo.setModData(dataObject.getString(BommodlogPo.COLUMNS.MOD_DATA.name())); 
			bommodlogPo.setModColumn(dataObject.getString(BommodlogPo.COLUMNS.MOD_COLUMN.name())); 
			return bommodlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final BommodlogPo bommodlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(BommodlogPo.COLUMNS.BF_NO.name(), bommodlogPo.getBfNo()); 
			dataObject.setValue(BommodlogPo.COLUMNS.BF_BOM_NO.name(), bommodlogPo.getBfBomNo()); 
			dataObject.setValue(BommodlogPo.COLUMNS.BOM_NO.name(), bommodlogPo.getBomNo()); 
			dataObject.setValue(BommodlogPo.COLUMNS.VER.name(), bommodlogPo.getVer()); 
			dataObject.setValue(BommodlogPo.COLUMNS.PARENT.name(), bommodlogPo.getParent()); 
			dataObject.setValue(BommodlogPo.COLUMNS.COMMODITY_NO.name(), bommodlogPo.getCommodityNo()); 
			dataObject.setValue(BommodlogPo.COLUMNS.CTM_CODE.name(), bommodlogPo.getCtmCode()); 
			dataObject.setValue(BommodlogPo.COLUMNS.BOM_DATE.name(), bommodlogPo.getBomDate()); 
			dataObject.setValue(BommodlogPo.COLUMNS.USER_ID.name(), bommodlogPo.getUserId()); 
			dataObject.setValue(BommodlogPo.COLUMNS.MOD_TIME.name(), bommodlogPo.getModTime()); 
			dataObject.setValue(BommodlogPo.COLUMNS.ORI_DATA.name(), bommodlogPo.getOriData()); 
			dataObject.setValue(BommodlogPo.COLUMNS.MOD_DATA.name(), bommodlogPo.getModData()); 
			dataObject.setValue(BommodlogPo.COLUMNS.MOD_COLUMN.name(), bommodlogPo.getModColumn()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<BommodlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(BommodlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
