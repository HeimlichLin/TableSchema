package com.doc.common.dao.impl; 
 
public class PreIndtlDAOImpl extends GeneralDAOImpl<PreIndtlPo> implements PreIndtlDAO { 
	public static final PreIndtlDAOImpl INSTANCE = new PreIndtlDAOImpl(); 
	public static final String TABLENAME = "PRE_INDTL"; 

	public PreIndtlDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PreIndtlPo> CONVERTER = new MapConverter<PreIndtlPo>() { 
 
		@Override 
		public PreIndtlPo convert(final DataObject dataObject) { 
			final PreIndtlPo preIndtlPo = new PreIndtlPo(); 
			preIndtlPo.setBfNo(dataObject.getString(PreIndtlPo.COLUMNS.BF_NO.name())); 
			preIndtlPo.setGoodsCode(dataObject.getString(PreIndtlPo.COLUMNS.GOODS_CODE.name())); 
			preIndtlPo.setCommodityNo(dataObject.getString(PreIndtlPo.COLUMNS.COMMODITY_NO.name())); 
			preIndtlPo.setGoodsUnit(dataObject.getString(PreIndtlPo.COLUMNS.GOODS_UNIT.name())); 
			preIndtlPo.setInStorageArea(dataObject.getString(PreIndtlPo.COLUMNS.IN_STORAGE_AREA.name())); 
			preIndtlPo.setGoodsQty(BigDecimalUtils.formObj(dataObject.getValue(PreIndtlPo.COLUMNS.GOODS_QTY.name()))); 
			preIndtlPo.setGoodsDesc(dataObject.getString(PreIndtlPo.COLUMNS.GOODS_DESC.name())); 
			preIndtlPo.setDeclNo(dataObject.getString(PreIndtlPo.COLUMNS.DECL_NO.name())); 
			preIndtlPo.setGuid(dataObject.getString(PreIndtlPo.COLUMNS.GUID.name())); 
			preIndtlPo.setDeclType(dataObject.getString(PreIndtlPo.COLUMNS.DECL_TYPE.name())); 
			preIndtlPo.setInDate(dataObject.getString(PreIndtlPo.COLUMNS.IN_DATE.name())); 
			preIndtlPo.setItemNo(BigDecimalUtils.formObj(dataObject.getValue(PreIndtlPo.COLUMNS.ITEM_NO.name()))); 
			preIndtlPo.setDutyType(dataObject.getString(PreIndtlPo.COLUMNS.DUTY_TYPE.name())); 
			preIndtlPo.setStatMode(dataObject.getString(PreIndtlPo.COLUMNS.STAT_MODE.name())); 
			preIndtlPo.setBomNo(dataObject.getString(PreIndtlPo.COLUMNS.BOM_NO.name())); 
			preIndtlPo.setBomVer(dataObject.getString(PreIndtlPo.COLUMNS.BOM_VER.name())); 
			preIndtlPo.setPrdtMark(dataObject.getString(PreIndtlPo.COLUMNS.PRDT_MARK.name())); 
			return preIndtlPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PreIndtlPo preIndtlPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PreIndtlPo.COLUMNS.BF_NO.name(), preIndtlPo.getBfNo()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.GOODS_CODE.name(), preIndtlPo.getGoodsCode()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.COMMODITY_NO.name(), preIndtlPo.getCommodityNo()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.GOODS_UNIT.name(), preIndtlPo.getGoodsUnit()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.IN_STORAGE_AREA.name(), preIndtlPo.getInStorageArea()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.GOODS_QTY.name(), preIndtlPo.getGoodsQty()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.GOODS_DESC.name(), preIndtlPo.getGoodsDesc()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.DECL_NO.name(), preIndtlPo.getDeclNo()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.GUID.name(), preIndtlPo.getGuid()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.DECL_TYPE.name(), preIndtlPo.getDeclType()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.IN_DATE.name(), preIndtlPo.getInDate()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.ITEM_NO.name(), preIndtlPo.getItemNo()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.DUTY_TYPE.name(), preIndtlPo.getDutyType()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.STAT_MODE.name(), preIndtlPo.getStatMode()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.BOM_NO.name(), preIndtlPo.getBomNo()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.BOM_VER.name(), preIndtlPo.getBomVer()); 
			dataObject.setValue(PreIndtlPo.COLUMNS.PRDT_MARK.name(), preIndtlPo.getPrdtMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PreIndtlPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PreIndtlPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
